package edu.boisestate.cs.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

import org.antlr.v4.runtime.tree.TerminalNode;

import edu.boisestate.cs.antlrTools.SMTLIBv2StringsBaseListener;
import edu.boisestate.cs.antlrTools.SMTLIBv2StringsParser;

public class jsonBuilder extends SMTLIBv2StringsBaseListener {

    private StringBuilder jBuilder = new StringBuilder();
    private StringBuilder copyBuilder = new StringBuilder();
    private int nodeCounter = 0;
    private HashSet<String> alphabet = new HashSet<>();
    private Boolean expr = false;
    private int exprArgCounter = 0;
    private Stack<Node> stack = new Stack<>();
    private ArrayList<Node> allNodes = new ArrayList<>();
    private Integer exprLevel = 0;
    private Boolean declaration = false;
    private ArrayList<String> symVars = new ArrayList<>();
    private Boolean lastExitWasFun = false;
    private Boolean assignment = false;
    private HashMap<String, Node> letMaps = new HashMap<>();
    private HashSet<String> lets = new HashSet<>(); // can probably just use letMap.contains?
    private Integer assigningLevel = -4; // was seeing weird levels but this may be uncessary
    private HashMap<Integer, Integer> exprLvlsArgs = new HashMap<>();
    private String currentConcreteConcat = "";
    private Integer reAlls = 0;
    public boolean createCopy = false;
    private HashMap<String, Node> symbolics = new HashMap<>();

    private static HashSet<String> exclude = new HashSet<String>(){{
        add("declare-fun");
        add("declare-const");
        add("(");
        add(")");
        add("String");
        add("assert");
        // add("str.to_re");
    }};
        
       

    public class Node{
        public Integer id;
        public String val;
        public Node parent;
        public String paramType;
        public String actualVal;
        public ArrayList<Node> children = new ArrayList<>();

        public Node(Integer id, String val, String actualVal, Node parent){
            this.id = id;
            this.val = val;
            this.parent = parent;
            this.actualVal = actualVal;
        }

        public Node(Node node, int offset){
            this.id = node.id + offset;
            this.val = node.val;
            this.actualVal = node.actualVal;
            ArrayList<Node> copyChildren = new ArrayList<>();
            for (Node childNode: node.children){
                Node copyChild = new Node(childNode, offset);
                copyChildren.add(copyChild);
            }
            this.children = copyChildren;
        }

        public void addChild(Node node) {
            children.add(node);
        }

        public void setID(int num){
            this.id = num;
        }

    }

    @Override
    public void visitTerminal(TerminalNode node) {

        if (declaration && !exclude.contains(node.getText()) && !symVars.contains(node.getText())) {
            symVars.add(node.getText());
            declaration = false;
            return;
        }

        if (node.getText().equals("let")){
            assignment = true;
            return;
        }

        if (expr && !exclude.contains(node.getText())) {
            exprArgCounter++;
            
            if (lets.contains(node.getText())){
                Node parent = stack.isEmpty() ? null: stack.pop();
                if (parent != null){
                    Node letRef = letMaps.get(node.getText());
                    parent.addChild(letRef.children.get(0));
                    stack.push(parent);
                }
                return;
            }

            if (assignment) {
                lets.add(node.getText());
                assignment = false;
                assigningLevel = exprLevel;
            }

            if (exprArgCounter == 1){

                Integer nodeID = getNodeID();
                String nodeVal = javaEncode(node.getText());
                String actualVal = node.getText();

                actualVal = (actualVal.equals("=") || actualVal.equals("str.contains") || actualVal.equals("str.in_re")) ? "true" : actualVal ;
                Node parent = stack.isEmpty() ? null: stack.pop();
                Node newNode = new Node(nodeID, nodeVal, actualVal, parent);

                if (parent != null) {
                    parent.addChild(newNode);
                    stack.push(parent);
                }
                stack.push(newNode);
               
            } else {

                String nodeVal = node.getText();
                String actualVal = node.getText();
                nodeVal = javaEncode(nodeVal);

                // Checking if concrete and add to alphabet
                if (nodeVal.startsWith("\"")){
                    nodeVal = processConcrete(nodeVal);
                    actualVal = nodeVal.replace("!:!<init>", "").replaceAll("\"", "");
                }

                Node parent = stack.isEmpty() ? null: stack.pop();  

                if (parent != null) {

                    // check for re.all and add as symvar for the sake of getString
                    if (actualVal.equals("re.allchar") && parent.actualVal.equals("re.*")){
                        parent.actualVal = "re.all" + reAlls++;
                        symVars.add(parent.actualVal); // will be an issue as get index will return first instance
                        parent.val = javaEncode(parent.actualVal);
                        stack.push(parent);
                        return;
                    }
                    if (symVars.contains(actualVal)){
                        if (!symbolics.containsKey(actualVal)){
                            Node newNode = new Node(getNodeID(), nodeVal, actualVal, parent);
                            symbolics.put(actualVal, newNode);
                            parent.addChild(newNode);
                            stack.push(parent);
                            allNodes.add(newNode);
                        } else {
                            Node actual = symbolics.get(actualVal);
                            parent.addChild(actual);
                            stack.push(parent);
                        }
                        return;
                    }
                    Node newNode = new Node(getNodeID(), nodeVal, actualVal, parent);
                    parent.addChild(newNode);
                    stack.push(parent);
                    allNodes.add(newNode);
                }


            }
            
        }

    }

    @Override
    public void enterExpr(SMTLIBv2StringsParser.ExprContext ctx) {
        exprLvlsArgs.put(exprLevel++, ++exprArgCounter);
        exprArgCounter = 0;
    }

    @Override 
    public void exitExpr(SMTLIBv2StringsParser.ExprContext ctx) {
        exprLvlsArgs.remove(exprLevel);
        exprLevel--;

        if (exprLevel==assigningLevel && !stack.isEmpty()) {

            Node let = stack.pop();
            letMaps.put(let.val, let);
            // allNodes.add(let);
            assigningLevel = -4;

        } else if (!stack.isEmpty() && !lastExitWasFun) {
            allNodes.add(stack.pop());                
        }
        exprArgCounter = exprLvlsArgs.get(exprLevel);
        lastExitWasFun = false;
    }

    public void enterFunRegOrFunString(){

        exprLvlsArgs.put(exprLevel++, ++exprArgCounter);
        exprArgCounter = 0;
    }

    public void exitFunRegOrFunString(){
        exprLvlsArgs.remove(exprLevel);
        exprLevel--;

        if (!stack.isEmpty()) {
            Node node = stack.pop();
                if (isConcat(node) && childrenConcrete(node)){
                    for (Node child : node.children) {
                        currentConcreteConcat+= child.actualVal;
                        allNodes.remove(child);
                        nodeCounter--;
                    }
                    node.actualVal = currentConcreteConcat.replaceAll("\"\"", "");
                    node.val = processConcrete(node.actualVal);
                    node.children.clear();
                    currentConcreteConcat = "";
                }
            allNodes.add(node); 
        }

        exprArgCounter = exprLvlsArgs.get(exprLevel);
        // if (exprArgCounter > 3) {concatting = true;} else {concatting = false;}
        lastExitWasFun = true;
    }
  
    
    @Override
    public void enterFun(SMTLIBv2StringsParser.FunContext ctx) {
        exprLvlsArgs.put(exprLevel++, ++exprArgCounter);
        exprArgCounter = 0;
       
    }

    @Override 
    public void exitFun(SMTLIBv2StringsParser.FunContext ctx) {
        exprLvlsArgs.remove(exprLevel);
        exprLevel--;
        if (!stack.isEmpty()) {
            allNodes.add(stack.pop());
        }
        lastExitWasFun = true;
    }

    @Override
    public void enterStringTheory(SMTLIBv2StringsParser.StringTheoryContext ctx){
        expr = true;
        exprLevel = 0;
    }

    @Override
    public void exitStringTheory(SMTLIBv2StringsParser.StringTheoryContext ctx){
        expr = false;
        exprLevel = 0;
    }

    
    @Override
    public void enterCmd_declareFun(SMTLIBv2StringsParser.Cmd_declareFunContext ctx){
        declaration = true;
    }

    @Override
    public void enterCmd_declareConst(SMTLIBv2StringsParser.Cmd_declareConstContext ctx){
        declaration = true;
    }

    public int getNodeID() {
        return nodeCounter++;
    }

    private String processConcrete(String nodeVal){
        if (!nodeVal.equals("\"\"")) {
            StringBuilder nodeString = new StringBuilder();
            String alph = nodeVal.replaceAll("\"", "");

            for (int i = 0; i < alph.length(); i++){
                if (alph.charAt(i) == '\\') {
                    // It's the start of a unicode representation
                    StringBuilder unicodeCharB = new StringBuilder();
                    // unicodeChar.append(alph.charAt(i));  // Start with the '\'
                    i+=3;  // Move past escape stuff
                    while (i < alph.length() && alph.charAt(i) != '}') {
                        unicodeCharB.append(alph.charAt(i));
                        i++;
                    }
                    String unicodeString = unicodeCharB.toString();
                    int unicode = Integer.parseInt(unicodeString, 16);
                    char unicodeChar = (char) unicode;

                    // only add Basic Latin not including whitespace or @ (0020-007f) // 60 (x3c) is '<' (broke several slogs) @ (64 (x40) broke 4595 and 3786)
                    // if (unicode > 31 && unicode < 127 && unicode != 60 &&unicode!=64 && unicode != 46 && unicode != 47  && unicode !=34) { // forwardslash (47 (2f) and " )
                        String uni = Character.toString(unicodeChar);
                        alphabet.add(escaped(uni));
                        nodeString.append(escaped(uni));
                    // } else { // add _ as placeholder for non basic characters (may prevent weird issues with empty string replacement)
                        // alphabet.add("_");
                        // nodeString.append("_");
                    // }

                } else {
                    // It's a regular character, so just add it normally (unless its an @)
                    String thisChar = Character.toString(alph.charAt(i));
                    // if (!thisChar.equals("@") && !thisChar.equals(" ")){
                        alphabet.add(escaped(thisChar));
                        nodeString.append(escaped(thisChar));
                    // } else { 
                    //     alphabet.add("_");
                    //     nodeString.append("_");
                    // }
                }
            }
            nodeVal = nodeString.toString();
            
        }
        nodeVal = "\"" + nodeVal + "\"!:!<init>" ;
        return nodeVal;
    }

    private ArrayList<Node> childrenConcats(Node node){
        ArrayList<Node> concatChildren = new ArrayList<>();
        for (Node child : node.children){
            if (isConcat(child)){
                concatChildren.add(child);
            }
        }
        return concatChildren;
    }

    private Boolean isConcat(Node node){
        if (node.actualVal.equals("str.++") || node.actualVal.equals("re.++")){
            return true;
        }
        return false;
    }

    private Boolean childrenConcrete(Node node){
        for (Node child : node.children){
            if (!child.val.contains("init")){
                return false;
            }
        }
        return true;
    }

    private String escaped(String text) {
        return text.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
                // .replace(" ", "\' \'");
    }

    private String javaEncode(String text) {
        switch (text){
            case "str.++":
                return "concat!!Ljava/lang/String;!:!0";
            case "re.++":
                return "concat!!Ljava/lang/String;!:!0";
            case "=":
                return "equals!!Ljava/lang/Object;!:!0";
            case "str.contains":
                return "contains!!Ljava/lang/CharSequence;!:!0";
            case "str.in_re":
                return "contains!!Ljava/lang/CharSequence;!:!0";
            case "str.replace_all":
                return "replaceAll!!Ljava/lang/String;Ljava/lang/String;!:!0";
            case "str.replace":
                return "replaceFirst!!Ljava/lang/String;Ljava/lang/String;!:0";
            default: 
                if (symVars.contains(text)) {
                    text = "r" + symVars.indexOf(text) + "!:!getStringValue!!";
                }
                return text;

            /* Other Methods found:
             * "isEmpty!!!:!0" same as  (= String "")
             * "substring!!II!:!0"  substr not implemented in current smt grammar
             * 
             * smt2 functions not inlcuded with java method equivalent:
             * compareTo() ~= str.< and str.<= (str.< = true when compareTo < 0)
             * contains() ? str.suffixof and str.prefixof, maybe str.in_re
             * endsWith() = str.suffixof (reverse?)
             * startsWith() = str.prefixof (reverse?)
             * matches(String regex) = str.in_re
             */
        }
    }

    @Override
    public void enterFunString(SMTLIBv2StringsParser.FunStringContext ctx) {
        enterFunRegOrFunString();
    }

    @Override 
    public void exitFunString(SMTLIBv2StringsParser.FunStringContext ctx) {
        exitFunRegOrFunString();
    }

    @Override
    public void enterFunRegLan(SMTLIBv2StringsParser.FunRegLanContext ctx) {
        enterFunRegOrFunString();
    }

    @Override 
    public void exitFunRegLan(SMTLIBv2StringsParser.FunRegLanContext ctx) {
        exitFunRegOrFunString();
    }  

    public String getJSON() {;

        if (alphabet.isEmpty()) {
            alphabet.add("A");
            alphabet.add("B");
            alphabet.add("C");
        }
        jBuilder.append("{\n\t\"alphabet\" : {\n\t\t\"size\" : " + alphabet.size() + 
        ",\n\t\t\"declaration\" : \"" + String.join(",", alphabet) + "\"\n\t},\n\t\"vertices\" : [\n\t\t");

        postProcess();

        for (Node node : allNodes) {
            jBuilder.append("{\n\t\t\t\"num\" : 0,\n\t\t\t\"actualValue\" : \"" + escaped(node.actualVal) + "\",\n\t\t\t\"incomingEdges\" :[\n\t\t\t\t");
            if (node.children!=null){
                if (node.children.size()==2){
                    
                    // setting parameters of children based off precedence/order
                    Node child1 = node.children.get(0);
                    Node child2 = node.children.get(1);

                    if (child1.id < child2.id){
                        child1.paramType = "t";
                        child2.paramType = "s1";
                    } else {
                        child1.paramType = "s1";
                        child2.paramType = "t";
                    } 
                    if (child1.val.startsWith("concat")){
                        child1.paramType = "t";
                        child2.paramType = "s1";
                    } else if (child2.val.startsWith("concat")){
                        child1.paramType = "s1";
                        child2.paramType = "t";
                    }

                    for (Node childNode : node.children){
                    // some tree has a null chilnode in its children array (possibly due to concat manip)
                        // if (childNode!=null){
                        jBuilder.append(" {\n\t\t\t\t\t\"source\" : " + childNode.id +
                        ",\n\t\t\t\t\t\"type\" : \"" + childNode.paramType + "\"\n\t\t\t\t},");
                        // }
                    }
                } else {
                    String paramType = "t";
                    int i = 0;
                    for (Node childNode : node.children){
                    // some tree has a null chilnode in its children array (possibly due to concat manip)
                        // if (childNode!=null){
                        jBuilder.append(" {\n\t\t\t\t\t\"source\" : " + childNode.id +
                        ",\n\t\t\t\t\t\"type\" : \"" + paramType + "\"\n\t\t\t\t},");
                        // }
                        i++;
                        paramType = "s" + i;
                    }                    
                }
            }

            jBuilder.deleteCharAt(jBuilder.length() - 1);
            jBuilder.append("],\n\t\t\t\"sourceConstraints\" : [ ],\n\t\t\t" +
            "\"timeStamp\" : " + System.currentTimeMillis() + ",\n\t\t\t\"type\" : 0,\n\t\t\t" +
            "\"id\" : " + node.id + ",\n\t\t\t\"value\" : \"" + escaped(node.val) + "\"\n\t\t},");
        }
        jBuilder.deleteCharAt(jBuilder.length() - 1);
        jBuilder.append(" ] }");
        if (createCopy){
            addCopy(allNodes);
        }
        return jBuilder.toString();
    }

    private void postProcess(){
        // convert re.allchar 
        Random rand = new Random();
        ArrayList<Node> removals = new ArrayList<>();
        ArrayList<Node> addedConcats = new ArrayList<>();
        for (Node node: allNodes){
            if (node.actualVal.equals("re.allchar")){
                String replacement = alphabet.toArray()[rand.nextInt(alphabet.size())].toString();
                node.val = "\"" + replacement+ "\"!:!<init>"; // sets as random char from alphabet
                node.actualVal = replacement;
            } 
            // get rid of str.to_re
            else if (node.actualVal.equals("str.to_re")){
                Node child = node.children.get(0);
                node.actualVal = child.actualVal;
                node.val = child.val;
                node.children = child.children;
                removals.add(child);
            } 
            // evaluate not statements? (dont think this will work for changing. we start by assuming everything is true and are now just changing those to false)
            else if (node.actualVal.equals("not")){
                Node child = node.children.get(0);
                child.actualVal = "false";
                child.parent = node.parent;
                if (node.parent != null){
                    node.parent.children.remove(node);
                    node.parent.addChild(child);
                }
                removals.add(node);
            }
            else if (isConcat(node)){

                // have to reduce concatenations if there are cascades of them to keep semantics correct
                if (isConcat(node.parent)){
                    continue; // we only want to deal with the 'root' (least deep) concat otherwise semantic will be wrong
                }
                ArrayList<Node> concatChildren = childrenConcats(node);
                while (!concatChildren.isEmpty()){
                    for (Node concatChild: concatChildren){
                        int index = node.children.indexOf(concatChild);
                        for (int i = 0; i < concatChild.children.size(); i++){
                            Node newChild = concatChild.children.get(i);
                            newChild.parent = node;
                            node.children.add(index + i, newChild);
                        }
                        node.children.remove(concatChild);
                        removals.add(concatChild);
                    }
                    concatChildren = childrenConcats(node);
                }

                ArrayList<Node> oldChildren = new ArrayList<>(node.children);
                Collections.reverse(oldChildren);
                node.children.clear();
                node.addChild(oldChildren.get(0));
                stack.push(node);
                for (int i = 1; i < oldChildren.size() -1; i++){
                    Node parent = stack.pop();
                    Node subParent = new Node(getNodeID(), parent.val, parent.actualVal, parent);
                    addedConcats.add(subParent);
                    parent.addChild(subParent);
                    Node newChild = oldChildren.get(i);
                    newChild.parent = subParent;
                    subParent.addChild(newChild);
                    stack.push(subParent);
                }
                Node parent = stack.pop();
                Node lastChild = oldChildren.get(oldChildren.size() -1);
                // deals with incorrect id assignment in order where issues arise from declarations and concretes at start of concatentation
                // lastChild.id = -1; not actually necessaru
                // oldChildren.get(oldChildren.size() - 2).id = 1;
                parent.addChild(lastChild);
            }
            // in theory can just remove 'or' nodes as they seem to be roots
            else if (node.actualVal.equals("or")){
                removals.add(node);
            }
        }
        // need to do after because nots need to be propogated first
        for (Node node : allNodes){
            if (node.actualVal.equals("and")){
                removals.add(node);
            }
            // remove equals nodes when they are roots and their children are predicates? (defintely an issue here but no 'unknown string operation')
            else if (node.val.startsWith("equals") && node.children.get(0).val.startsWith("contains")){
                createCopy = true;
                if (node.actualVal.equals("false")){
                    if (childrenEquals(node)){
                        switchBool(node.children.get(0));
                    }
                }
                removals.add(node);
            }
        }
        allNodes.removeAll(removals);
        allNodes.addAll(addedConcats);
        assignIDs(allNodes); // putting after combining symvars breaks things

        // // combining declarations (symVars) just more dealing with innacuracies in the initial parsing. ah well
        // removals.clear();
        //  // this probably does need to be a separate loop like  many other things. took it out of above loop to debug
        // for (Node node : allNodes){
        //     if (node.val.endsWith("getStringValue!!") && !node.actualVal.startsWith("re.all")){
        //         if (!symbolics.containsKey(node.actualVal)){
        //             symbolics.put(node.actualVal, node);
        //         } else {
        //             Node realNode = symbolics.get(node.actualVal);
        //             node.parent.children.add(realNode);
        //             node.parent.children.remove(node);
        //             removals.add(node);
        //         }
        //     }
        // }
        // allNodes.removeAll(removals);

        
    }

    private void assignIDs(ArrayList<Node> nodes){
        int currentID = 0;
        ArrayList<Node> visited = new ArrayList<>();
        // int prevID = 0;
        // Node prevLeaf = null;
        for (Node node : nodes){
            if (node.children.isEmpty()){
                
                // BFS can't gaurantee order is kept so force order for leafs based on initial ids
                // if (prevLeaf != null &&prevLeaf.parent.equals(node.parent)){
                //     if (prevID > node.id){
                //         prevID = node.id;
                //         node.id = prevLeaf.id;
                //         prevLeaf.id = currentID++;
                //     } else {
                //         prevID = node.id;
                //         node.id = currentID++;
                //     }

                // } else {
                //     prevID = node.id;
                    node.id = currentID++;
                // }
                visited.add(node);
                // prevLeaf = node;
            }
            
        }
        Queue<Node> notVisited = new LinkedList<>();
        for (Node node: nodes){
            if (!visited.contains(node)){
                notVisited.add(node);
            }
        }
        while (!notVisited.isEmpty()){
            Node check = notVisited.poll();
            if (visited.containsAll(check.children)){
                check.id = currentID++;
                visited.add(check);
            } else {
                notVisited.add(check);
            }
        }
    }

    private void switchBool(Node node){
        if (node.actualVal.equals("true")){
            node.actualVal = "false";
        } else {
            node.actualVal = "true";
        }
    }

    private boolean childrenEquals(Node node){
        if (node.children.get(0).actualVal.equals("true") && node.children.get(1).actualVal.equals("true")){
            return true;
        } else if(node.children.get(0).actualVal.equals("false") && node.children.get(1).actualVal.equals("false")){
            return true;
        } else { return false;}
    }

    private void addCopy(ArrayList<Node> nodes){
        // only accounting for equals of two contains
        for (Node node : nodes){
            if (node.val.startsWith("contains")){
                switchBool(node);
            }
        }
    }

    public String getCopyJSON(){

        copyBuilder.append("{\n\t\"alphabet\" : {\n\t\t\"size\" : " + alphabet.size() + 
        ",\n\t\t\"declaration\" : \"" + String.join(",", alphabet) + "\"\n\t},\n\t\"vertices\" : [\n\t\t");

        for (Node node : allNodes) {
            copyBuilder.append("{\n\t\t\t\"num\" : 0,\n\t\t\t\"actualValue\" : \"" + escaped(node.actualVal) + "\",\n\t\t\t\"incomingEdges\" :[\n\t\t\t\t");
            if (node.children!=null){
                if (node.children.size()==2){
                    
                    // setting parameters of children based off precedence/order
                    Node child1 = node.children.get(0);
                    Node child2 = node.children.get(1);

                    if (child1.id < child2.id){
                        child1.paramType = "t";
                        child2.paramType = "s1";
                    } else {
                        child1.paramType = "s1";
                        child2.paramType = "t";
                    }
                    if (child1.val.startsWith("concat")){
                        child1.paramType = "t";
                        child2.paramType = "s1";
                    } else if (child2.val.startsWith("concat")){
                        child1.paramType = "s1";
                        child2.paramType = "t";
                    }

                    for (Node childNode : node.children){
                    // some tree has a null chilnode in its children array (possibly due to concat manip)
                        // if (childNode!=null){
                        copyBuilder.append(" {\n\t\t\t\t\t\"source\" : " + childNode.id +
                        ",\n\t\t\t\t\t\"type\" : \"" + childNode.paramType + "\"\n\t\t\t\t},");
                        // }
                    }
                } else {
                    String paramType = "t";
                    int i = 0;
                    for (Node childNode : node.children){
                    // some tree has a null chilnode in its children array (possibly due to concat manip)
                        // if (childNode!=null){
                        copyBuilder.append(" {\n\t\t\t\t\t\"source\" : " + childNode.id +
                        ",\n\t\t\t\t\t\"type\" : \"" + paramType + "\"\n\t\t\t\t},");
                        // }
                        i++;
                        paramType = "s" + i;
                    }                    
                }
            }

            copyBuilder.deleteCharAt(copyBuilder.length() - 1);
            copyBuilder.append("],\n\t\t\t\"sourceConstraints\" : [ ],\n\t\t\t" +
            "\"timeStamp\" : " + System.currentTimeMillis() + ",\n\t\t\t\"type\" : 0,\n\t\t\t" +
            "\"id\" : " + node.id + ",\n\t\t\t\"value\" : \"" + escaped(node.val) + "\"\n\t\t},");
        }
        copyBuilder.deleteCharAt(copyBuilder.length() - 1);
        copyBuilder.append(" ] }");
        return copyBuilder.toString();
    }
}