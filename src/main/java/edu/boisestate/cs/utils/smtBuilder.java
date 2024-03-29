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

        // printGraph(nodeGraph, "init");

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
                // System.out.println(currentNode);
                // System.out.println("SOURCE: " + sourceChild + " TARGET: " + targetChild);
                // printGraph(targetChild.children, "target child");
                // printGraph(targetChild.children.get(0).children, "target child's children");

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
        
        smtString.insert(0,addCustomFuncs());

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
                switch (child.paramType){
                    case "t":
                        targ = child;
                        break;
                    case "s1":
                        s1 = child;
                        break;
                    case "s2":
                        s2 = child;
                        break;
                }
            }
            //do own smt Decode for the ints
            s+=  smtDecode(targ) +" " + s1.actualVal + " "+ s2.actualVal+")";
            return s;
        } else if (node.val.contains("toLowerCase")){
            String s = smtDecode(node.children.get(0)); //one child
            return "(str.toLower " + s + ")";
            //this is handles by a custom defined function in the header (added at end of building)
        } else if (node.val.contains("toUpperCase")){
            String s= smtDecode(node.children.get(0));
            return "(str.toUpper " + s + ")";
            //custom defined function
        }

        throw new Exception("Unsupported Operation: " + node.val);


    }

    private static String addCustomFuncs(){
        String toLower = "(define-fun-rec str.toLower ((x String)) String\n"+
                "  (ite (= x \"\")\n"+
                "      \"\"\n"+
                "      (let ((Head (str.at x 0)))\n"+
                "        (str.++ \n"+
                "          (ite (and (<= 65 (str.to_code Head)) \n"+
                "                     (<= (str.to_code Head) 90))\n"+
                "               (str.from_code (+ (str.to_code Head) 32))\n"+
                "               Head)\n"+
                "          (str.toLower (str.substr x 1 (- (str.len x) 1)))))))\n";
        String toUpper = "(define-fun-rec str.toUpper ((x String)) String\n"+
                "  (ite (= x \"\")\n"+
                "      \"\"\n"+
                "      (let ((Head (str.at x 0)))\n"+
                "        (str.++ \n"+
                "          (ite (and (<= 97 (str.to_code Head)) \n"+
                "                     (<= (str.to_code Head) 122))\n"+
                "               (str.from_code (- (str.to_code Head) 32))\n"+
                "               Head)\n"+
                "          (str.toUpper (str.substr x 1 (- (str.len x) 1)))))))\n";

        return toLower + toUpper;
    }

    private static Boolean notHandledByDecode(Node node){
        if (node.val.contains("concat")||node.val.contains("substring")||node.val.contains("isEmpty")||node.val.contains("toLowerCase")||node.val.contains("toUpperCase")){
            return false;
        }
        return true;
    }

    public static void printGraph(ArrayList<Node> nodes, String substr, String msg){
        if (nodes.isEmpty()) return;
        if (substr == null) substr = "";
        if (msg == null) msg = "";
        System.out.println("NODEGRAPH ------------------------------------" + msg);
        for (Node node : nodes){
            if(node.val == null) System.out.println(node);
            if (node.val !=null && node.val.contains(substr))System.out.println(node);
        }
        System.out.println("----------------------------------------------");
    }
}
