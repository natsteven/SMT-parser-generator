package edu.boisestate.cs.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 * Traverses a Node Graph to generate a corresponding smt query
 */
public class smtBuilder{
    private static HashSet<String> symbolics = new HashSet<>();
    private static int stmts = 0;

    private static ArrayList<Node> findRoot(ArrayList<Node> nodes){
        ArrayList<Node> roots = new ArrayList<>();
        for (Node node : nodes){
            if (node.parent == null) roots.add(node);
        }
        return roots;
    }

    public static String getQuery(ArrayList<Node> nodeGraph) throws Exception{
        stmts=0; // not sure why this isnt zero after being used but it is so needs to be reset at start
        StringBuilder smtString = new StringBuilder();
        ArrayList<Node> roots = findRoot(nodeGraph);
        // ArrayList<String> symbolics = new ArrayList<>();

        smtString.append("(assert ");
        if (roots.size() > 1){
            smtString.append("(and ");
        }

        for (Node root : roots){
            smtString.append(smtDecode(root));
            Node currentNode = root;

            //not sure if having concat and substring as stopping criteria will cause issues with deeper statments. i think its handled correctly
            while (!currentNode.children.isEmpty() && notHandledByDecode(currentNode)){ //concats are handled in the smtDecode method.

                //else 2 children but shuold also make it work for at east 3 (a substring with 2 ints and a string args)
                Node sourceChild;
                Node targetChild;
                if (currentNode.children.get(0).paramType.equals("s1")) {
                    sourceChild = currentNode.children.get(0);
                    targetChild = currentNode.children.get(1);
                } else {
                    sourceChild = currentNode.children.get(1);
                    targetChild = currentNode.children.get(0);
                }

                smtString.append(smtDecode(targetChild));
                smtString.append(smtDecode(sourceChild));

                currentNode = targetChild;
            }

            for (int i=0; i< stmts; i++){
                smtString.append(")");
            }
            stmts=0;

        }

        String defStrings = "";
        for (String symbolic : symbolics){
            defStrings = defStrings + "(declare-fun " + symbolic + " () String)\n";
        }
        smtString.append(")");
        if (roots.size() > 1){
            smtString.append(")");
        }
        smtString.insert(0, defStrings);

        smtString.append("\n(check-sat)");

        symbolics = new HashSet<>();
        stmts = 0;
        return smtString.toString();
    }
    
    private static String smtDecode(Node node) throws Exception{
        if (node.val.contains("init")){
            String s = node.val.split("\"")[1]; //return concrete string
            return "\""+s+"\"" + " ";
        } else if (node.val.contains("getString")) {
            String[] valStrings = node.val.split("!");
            String var = valStrings[0];
            symbolics.add(var);
            return var + " ";
        } else if (node.val.contains("equals")){
            String s;
            if (node.actualVal.equals("true")){
                s = "(= ";
                stmts++;
            } else {
                s = "(not (= ";
                stmts+=2;
            }
            return s;
        } else if (node.val.contains("concat")){    //in theory this was already taken care of but apparently there something im missing
            // stmts++;
            Stack<Node> stringStack = new Stack<>(); // need as concats are reversed compared to queries
            Node curr = node;
            Node sourceChild;
            Node targetChild;
            String s = "(str.++ ";

            curr = node;
            while (curr.val.contains("concat")){
                if (curr.children.get(0).paramType.equals("s1")) {
                    sourceChild = curr.children.get(0);
                    targetChild = curr.children.get(1);
                } else {
                    sourceChild = curr.children.get(1);
                    targetChild = curr.children.get(0);
                }
                stringStack.push(sourceChild);
                curr = targetChild;
            }
            s += smtDecode(curr);
            while (!stringStack.isEmpty()){
                s+= smtDecode(stringStack.pop());
            }
            s+= ")";
            return s;
        }
        // inverse graphs (not from translated smt queries)
        else if (node.val.contains("contains")){
            String s;
            if (node.actualVal.equals("true")){
                s = "(str.contains ";
                stmts++;
            } else {
                s = "(not (str.contains ";
                stmts+=2;
            }
            return s; // is this converse in smt? (yes?) its str.contains t s, where t contains s, but should check that its traversed correctly
        } else if (node.val.contains("isEmpty")){
            String s;
            if (node.actualVal.equals("true")){
                s = "(= \"\" ";
                stmts++;
            } else {
                s = "(not (= \"\" ";
                stmts+=2;
            }
            s+= smtDecode(node.children.get(0));
            for (int i=0;i<stmts;i++){
                s+=")";
            }
            stmts=0;
            return s; 
        // potentially not correct ordering / syntax?
        } else if (node.val.contains("replace")){ // probably going to be an issue with multiple arguments?
            stmts++;
            return "(str.replace_all ";
        } else if (node.val.contains("substring")){
            String s = "(str.substr ";
            Node targ=null; //this is last
            Node s1=null;
            Node s2=null;
            for (Node child : node.children){
                if (child.paramType.equals("t")) targ = child;
                if (child.paramType.equals("s1")) s1 = child;
                if (child.paramType.equals("s2")) s2 = child;
            }

            //do own smt Decode for the ints
            s+= s1.actualVal + " "+ s2.actualVal+" " + smtDecode(targ) + ")";

            return s;
        }

        throw new Exception("Unsupported Operation: " + node.val);


    }

    private static Boolean notHandledByDecode(Node node){
        if (node.val.contains("concat")||node.val.contains("substring")||node.val.contains("isEmpty")){
            return false;
        }
        return true;
    }
}
