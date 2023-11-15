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
        StringBuilder smtString = new StringBuilder();
        ArrayList<Node> roots = findRoot(nodeGraph);
        Stack<Node> stringStack = new Stack<>(); // need as concats are reversed compared to queries.
        // ArrayList<String> symbolics = new ArrayList<>();

        smtString.append("(assert ");
        if (roots.size() > 1){
            smtString.append("(and ");
        }

        for (Node root : roots){
            smtString.append(smtDecode(root));
            Node currentNode = root;

            while (!currentNode.children.isEmpty()){
                if (currentNode.children.size() == 1){
                    smtString.append(smtDecode(currentNode));
                    Node child = currentNode.children.get(0);
                    smtString.append(smtDecode(child));
                    currentNode = child;
                    continue;
                }
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

                if (currentNode.val.contains("concat")){ //concats are reverse order as mentioned above
                    stringStack.push(sourceChild);
                    if (!currentNode.parent.val.contains("concat")){
                        smtString.append("(str.++ "); //no decode necessary as known. This simply handles the first concat in a chain (reducing the rest)
                        stmts++;
                    }
                } else {
                    smtString.append(smtDecode(targetChild));
                    smtString.append(smtDecode(sourceChild));
                }
                currentNode = targetChild;
            }

            while (!stringStack.isEmpty()){
                smtString.append(smtDecode(stringStack.pop()));
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
            return s; // is this converse in smt? no its str.contains t s, where t contains s, but should check that its traversed correctly
        } else if (node.val.contains("isEmpty")){
            String s;
            if (node.actualVal.equals("true")){
                s = "(= re.none ";
                stmts++;
            } else {
                s = "(not (= re.none ";
                stmts+=2;
            }
            return s; // potentially not correct ordering / syntax?
        } else if (node.val.contains("replace")){ // probably going to be an issue with multiple arguments?
            stmts++;
            return "(str.replace_all ";
        } else if (node.val.contains("substring")){
            stmts++;
            return "(str.substr ";
        } else if (node.val.contains("concat")){    //in theory this was already taken care of but apparently there something im missing
            stmts++;
            return "(str.++ ";
        }

        throw new Exception("Unsupported Operation: " + node.val);

        // return "";
    }
}
