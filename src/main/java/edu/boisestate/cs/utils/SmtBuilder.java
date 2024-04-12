package edu.boisestate.cs.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

/**
 * Traverses a Node Graph to generate a corresponding smt query
 */
public class SmtBuilder{
    private HashSet<String> symbolics;
    private HashMap<String, String> ostr_syms;
    private int stmts, ost_syms;
    private boolean lower, upper, delete, ostrich;

    public SmtBuilder(boolean ostrich) {
        this.ostrich = ostrich;
        this.symbolics = new HashSet<>();
        this.ostr_syms = new HashMap<>();
        this.stmts = 0;
        this.ost_syms = 0;
        this.lower = false;
        this.upper = false;
        this.delete = false;
    }

    private ArrayList<Node> findRoot(ArrayList<Node> nodes){
        ArrayList<Node> roots = new ArrayList<>();
        for (Node node : nodes){
            if (node.parent == null) roots.add(node);
        }
        return roots;
    }

    public String getQuery(ArrayList<Node> nodeGraph) throws Exception{
        StringBuilder smtString = new StringBuilder();
        ArrayList<Node> roots = findRoot(nodeGraph);

        // printGraph(nodeGraph, "init");

        // smtString.append("(assert ");
        // if (roots.size() == 2){
        //     smtString.append("(and ");
        // } else if (roots.size() > 2){
            
        // }

        for (Node root : roots){
            smtString.append("\n(assert ");
            smtString.append(smtDecode(root));
            Node currentNode = root;

            //not sure if having concat and substring as stopping criteria will cause issues with deeper statments. i think its handled correctly
            while (!currentNode.children.isEmpty() && notHandledByDecode(currentNode)){ //concats are handled in the smtDecode method.
            // 4/3/24 - so these could and probably should easily be refactored. args != 2 is handled by the specific method so we shuold either just handle
            // in each method or generalize for any number of children...
            
                //else 2 children but shuold also make it work for at east 3 (a substring with 2 ints and a string args)
                // so i changed the structure of children and am not sure i need different case for 2 children but just making it work again for now
                Node sourceChild = null;
                Node targetChild = null;

                for (Node child : currentNode.children.keySet()){
                    if (currentNode.children.get(child).equals("t")){
                        sourceChild = child;
                    } else if (currentNode.children.get(child).equals("s1")){
                        targetChild = child;
                    }
                }

                // if (currentNode.children.get(0).paramType.equals("s1")) {
                //     sourceChild = currentNode.children.get(0);
                //     targetChild = currentNode.children.get(1);
                // } else {
                //     sourceChild = currentNode.children.get(1);
                //     targetChild = currentNode.children.get(0);
                // }
                // System.out.println(currentNode);
                // System.out.println("SOURCE: " + sourceChild + " TARGET: " + targetChild);
                // printGraph(targetChild.children, "target child");
                // printGraph(targetChild.children.get(0).children, "target child's children");
                // System.out.println("TARGET: " + targetChild);

                //switched this order for contains but not 100% sure if thats true for every function?
                smtString.append(smtDecode(sourceChild));
                smtString.append(smtDecode(targetChild));
                

                currentNode = targetChild;
            }

            for (int i=0; i< stmts; i++){
                smtString.append(")");
            }
            smtString.append(")");
            stmts=0;

        }

        String defStrings = "";
        for (String symbolic : symbolics){
            defStrings+= "(declare-fun " + symbolic + " () String)\n";
        }
        if (ostrich){
            for (String sym : ostr_syms.keySet()){
                defStrings+= "(declare-fun " + sym + " () String)\n";
            }
            for (Map.Entry<String, String> entry : ostr_syms.entrySet()){
                String sym = entry.getKey();
                String targ = entry.getValue();
                smtString.insert(0,("(assert (toLower " + targ + " " + sym + "))\n"));
            }
        }

        smtString.insert(0, defStrings);

        if (!ostrich) smtString.insert(0,addCustomFuncs());
        else smtString.insert(0,addFuncOstrich());

        smtString.insert(0, "(set-option :produce-models true)\n");
        if (ostrich) smtString.insert(0, "(set-option :parse-transducers true)\n");
        if ((lower || upper) && !ostrich) smtString.insert(0,"(set-logic ALL)\n");
        else smtString.insert(0,"(set-logic QF_S)\n");
        smtString.append("\n(check-sat)\n(get-model)\n(exit)");

        return smtString.toString();
    }
    
    private String smtDecode(Node node) throws Exception{
        // System.out.println(node);
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
            //so frankly not sure how necessary this is but will make it work with the current structure
            // stmts++;
            Stack<Node> stringStack = new Stack<>(); // need as concats are reversed compared to queries
            Node curr = node;
            Node sourceChild = null;
            Node targetChild = null;
            String s = "(str.++ ";

            while (curr.val.contains("concat")){ // if there are stacked concats
                for (Map.Entry<Node, String> entry : curr.children.entrySet()) {
                    Node child = entry.getKey();
                    if (entry.getValue().equals("t")) {
                        sourceChild = child;
                    } else {
                        targetChild = child;
                    }
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
            s+= smtDecode(node.children.keySet().iterator().next());
            for (int i=0;i<stmts;i++){
                s+=")";
            }
            stmts=0;
            return s; 
        // potentially not correct ordering / syntax?
        } else if (node.val.contains("replace")){ // probably going to be an issue with multiple arguments?
            String s = "(str.replace_all ";
            Node targ = null, s1 = null, s2 = null;
            for (Node child : node.children.keySet()){
                switch (node.children.get(child)){
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
            s+= smtDecode(targ) +" " + smtDecode(s1) + " "+ smtDecode(s2)+")";
            return s;
        } else if (node.val.contains("substring")){
            String s = "(str.substr ";
            Node targ=null; //this is last
            Node s1=null;
            Node s2=null;
            for (Node child : node.children.keySet()){
                switch (node.children.get(child)){
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
            // semantics are different, for smt it is index, and length of substr, for java it is start and end index
            Integer length = Integer.parseInt(s2.actualVal) - Integer.parseInt(s1.actualVal);
            s+=  smtDecode(targ) +" " + s1.actualVal + " "+ length+")";
            return s;
        } else if (node.val.contains("toLowerCase")){
            lower = true;
            if (ostrich){
                String sym = "L" + ost_syms++ + " ";
                String targ = smtDecode(node.children.keySet().iterator().next());
                if (ostr_syms.containsValue(targ)){ //check value exists.....
                    return getSym(targ);
                }
                ostr_syms.put(sym, targ);
                return sym;
            }
            String s = smtDecode(node.children.keySet().iterator().next()); //one child
            return "(str.toLower " + s + ")";
            //this is handles by a custom defined function in the header (added at end of building)
        } else if (node.val.contains("toUpperCase")){
            upper = true;
            String s= smtDecode(node.children.keySet().iterator().next());
            return "(str.toUpper " + s + ")";
            //custom defined function
        } else if (node.val.contains("delete")) {
            delete = true;
            Node targ=null, s1=null, s2=null;
            for (Node child : node.children.keySet()){
                switch (node.children.get(child)){
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
            return "(str.del " + smtDecode(targ) + " " + s1.actualVal + " " + s2.actualVal + ")";
        }

        throw new Exception("Unsupported Operation: " + node.val);


    }

    private String getSym(String s){
        for (String sym : ostr_syms.keySet()){
            if (ostr_syms.get(sym).equals(s)){
                return sym;
            }
        }
        return null;
    }

    private String addCustomFuncs(){
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
        String del = "(define-fun str.del ((x String) (a Int) (b Int)) String\n"+
                "  (str.++ (str.substr x 0 a) (str.substr x b (str.len x))))\n";
        String ret = "";
        if (lower) ret+=toLower;
        if (upper) ret+=toUpper;
        if (delete) ret+=del;
        
        return ret;
    }

    private String addFuncOstrich(){
        String toLower = "(define-fun-rec toLower ((x String) (y String)) Bool\n" +
            "   (or (and (= x \"\") (= y \"\"))\n" +
            "       (and (not (= x \"\")) (not (= y \"\"))\n" +
            "           (= (char.code (str.head y))\n" +
            "               (ite (and (<= 65 (char.code (str.head x)))\n" +
            "                       (<= (char.code (str.head x)) 90))\n" +
            "                   (+ (char.code (str.head x)) 32)\n" +
            "                   (char.code (str.head x))))\n" +
            "           (toLower (str.tail x) (str.tail y))))\n" +
        ")\n";
        String toUpper = "(define-fun-rec toUpper ((x String) (y String)) Bool\n" +
        "   (or (and (= x \"\") (= y \"\"))\n" +
        "       (and (not (= x \"\")) (not (= y \"\"))\n" +
        "           (= (char.code (str.head y))\n" +
        "               (ite (and (<= 97(char.code (str.head x)))\n" +
        "                       (<= (char.code (str.head x)) 122))\n" +
        "                   (- (char.code (str.head x)) 32)\n" +
        "                   (char.code (str.head x))))\n" +
        "           (toUpper (str.tail x) (str.tail y))))\n" +
        ")\n";
        String del = "(define-fun str.del ((x String) (a Int) (b Int)) String\n"+
                "  (str.++ (str.substr x 0 a) (str.substr x b (str.len x))))\n";
        String ret = "";
        if (lower) ret+=toLower;
        if (upper) ret+=toUpper;
        if (delete) ret+=del;
        return ret;
    }

    private static Boolean notHandledByDecode(Node node){
        if (node.val.contains("concat")||node.val.contains("substring")||node.val.contains("isEmpty")||node.val.contains("toLowerCase")||node.val.contains("toUpperCase")||node.val.contains("delete")){
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
