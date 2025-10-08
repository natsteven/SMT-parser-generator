package edu.boisestate.cs.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Traverses a Node Graph to generate a corresponding smt query
 */
public class SmtBuilder {
    private HashSet<String> symbolics;
    private HashMap<String, String> lower_syms;
    private int stmts, num_lower_syms;
    private boolean lower, upper, delete, trim;
    private HashMap<String, Integer> lengthLimits;
	private enum Solver { CVC5, OSTRICH, Z3 };
	private Solver currentSolver;
	private NodeGraph nodeGraph;
	private ArrayList<Node> roots;
	private HashMap<Solver, String> queries;
	private String defStrings;
	private String alpha;

    public SmtBuilder(NodeGraph nodeGraph) {
        this.symbolics = new HashSet<>();
        this.lower_syms = new HashMap<>();
        this.lengthLimits = new HashMap<>();
		this.queries = new HashMap<>();
		this.nodeGraph = nodeGraph;
		this.roots = findRoot(nodeGraph.getNodeGraph());
		this.defStrings= "";
        this.stmts = 0;
        this.num_lower_syms = 0;
        this.lower = this.upper = this.delete = this.trim = false;
		String alph = nodeGraph.getAlphabet();
		String[] alpha = alph.split(",");
		StringBuilder alphaRegex = new StringBuilder();
		alphaRegex.append("(define-fun Alphabet () RegLan \n\t(re.* (re.union ");
		for (String s : alpha) {
			alphaRegex.append("(str.to_re \"" + s + "\") ");
		}
		alphaRegex.append("))\n)\n");
		this.alpha = alphaRegex.toString();
    }

	private void resetForNewSolver() {
		this.symbolics.clear();
		this.lower_syms.clear();
		this.lengthLimits.clear();
		this.stmts = 0;
		this.num_lower_syms = 0;
		this.lower = this.upper = this.delete = this.trim = false;
	}

    private ArrayList<Node> findRoot(ArrayList<Node> nodes) {
        ArrayList<Node> roots = new ArrayList<>();
        for (Node node : nodes) {
            if (node.parent == null) roots.add(node);
        }
        return roots;
    }

	public void getQueries() throws Exception {
		this.currentSolver = Solver.CVC5;
		String query = getQuery();
		finishCVC5Query(query);
		resetForNewSolver();
		// we only have to run getQuery once more as z3 and ostrich share case conversion semantics
		this.currentSolver = Solver.OSTRICH;
		query = getQuery();
		finishOstrichQuery(query);
		finishZ3Query(query);
	}

    private String getQuery() throws Exception {
        StringBuilder smtString = new StringBuilder();

        for (Node root : roots) {
            smtString.append("\n(assert ");
            smtString.append(smtDecode(root));
            Node currentNode = root;

            //not sure if having concat and substring as stopping criteria will cause issues with deeper statments. i think its handled correctly
            while (!currentNode.childrenType.isEmpty() && notHandledByDecode(currentNode)) { //concats are handled in the smtDecode method.
                // 4/3/24 - so these could and probably should easily be refactored. args != 2 is handled by the specific method so we shuold either just handle
                // in each method or generalize for any number of children...
                //else 2 children but shuold also make it work for at east 3 (a substring with 2 ints and a string args)
                // so i changed the structure of children and am not sure i need different case for 2 children but just making it work again for now
                Node sourceChild = null;
                Node targetChild = null;

                for (Node child : currentNode.childrenType.keySet()) {
                    if (currentNode.childrenType.get(child).equals("t")) {
                        sourceChild = child;
                    } else if (currentNode.childrenType.get(child).equals("s1")) {
                        targetChild = child;
                    }
                }
                smtString.append(smtDecode(sourceChild));
                smtString.append(smtDecode(targetChild));

                currentNode = targetChild;
            }
            for (int i = 0; i < stmts; i++) {
                smtString.append(")");
            }
            smtString.append(")");
            stmts = 0;
        }
        for (String limit : lengthLimits.keySet()) {
            smtString.insert(0, "(assert (<= " + lengthLimits.get(limit) + " (str.len " + limit + ")))\n");
        }
        // Alphabet! need to ensure all symbolics are in the alphabet so assert str.in_re
        for (String sym : symbolics) {
            smtString.insert(0, "\n(assert (str.in_re " + sym + " Alphabet))");
        }
		//only do first time round ...
		if (defStrings.isEmpty()) {
			StringBuilder def = new StringBuilder();
			for (String sym : symbolics) {
				def.append("(declare-fun ");
				def.append(sym);
				def.append(" String)\n");
			}
			defStrings = def.toString();
		}
        return smtString.toString();
    }

    private String smtDecode(Node node) throws Exception {
//         System.out.println(node);
        if (node == null) {
            System.out.println("NULL NODE");
        }
        //get the actual value of the node, operation , symbolic, or concrete
        String value = node.val.split("!!")[0].split("!:!")[0];
        //deal with operations in switch statement
        switch (value) {
            case "equals":
                return equalsDecode(node);
            case "concat":
            case "append":
                return concatDecode(node);
            case "contains":
                return containsDecode(node);
            case "isEmpty":
                return isEmptyDecode(node);
            case "replace":
            case "replaceAll":
                return replaceDecode(node);
            case "substring":
                return substringDecode(node);
            case "toLowerCase":
                return toLowerDecode(node);
            case "toUpperCase":
                return toUpperDecode(node);
            case "delete":
                return deleteDecode(node);
            case "valueOf":
                // essentially skip the valueOf operation
            case "toString":
                return valueOfDecode(node);
            case "length":
                return "(str.len " + smtDecode(node.childrenType.keySet().iterator().next()) + ")";
            case "charAt":
                return charAtDecode(node);
            case "trim":
                return trimDecode(node);
			case "setLength":
				return setLengthDecode(node);
        }
        //deal with inputs and concrete strings
        if (node.actualVal.equals(unescape(value))) { //node is concrete strings
            return "\"" + unescape(value) + "\" ";
        }
        // seems the real 'experiemnts' benches use $r\d+ for symbolic strings and jxml have i2 thing, and
        // htmlCleaner01 does not have !! delimiter? instead has .
//         if (value.replace("[$i2]","").replace("$","").matches("r\\d+")) {
//            symbolics.add(value);
//            return value + " ";
//        }
        //for symbolic inputs
        Pattern sym = Pattern.compile("r\\d+");
        Matcher match = sym.matcher(value);
        // i dont see any reason why this potential overapproximation would be an issue
        if (match.find()) {
            symbolics.add("sym" + node.id);
            return "sym" + node.id + " ";
        }
        sym = Pattern.compile("\\$c\\d+");
        match = sym.matcher(value);
        if (match.find()) { //htmlCleaner01 and iText02
            symbolics.add("sym" + node.id);
            return "sym" + node.id + " ";
        }
        System.out.println(" VAL: " + value);
        throw new Exception("Node not handled by smtDecode: " + node);
    }

	private String setLengthDecode(Node node) throws Exception {
		Node targ = null;
		Node s1 = null;
		for (Node child : node.childrenType.keySet()) {
			 switch (node.childrenType.get(child)) {
				case "t":
					targ = child;
					break;
				case "s1":
					s1 = child;
					break;
			}
		}
		String limit = smtDecode(targ);
		return "(= (str.len " + limit + ") " + s1.actualVal + ")";
	}

	// smt trim translation borrowed from SPF z3translator from ucsb.cs.vlab
	private String trimDecode(Node node) throws Exception {
		trim = true; // adds definiitons of ws and nwc RegLans to header
        Node targ = null;
        for (Node child : node.childrenType.keySet()) {
            targ = child;
        }
		String in_str = smtDecode(targ);
		symbolics.add("out_str");
        return "(and (str.in_re " + in_str + " (re.++ ws (str.to_re out_str) ws)) (or (= out_str \"\")(and (str.in_re out_str (re.++ nwc re.all)) (str.in_re out_str (re.++ re.all nwc)))))";
    }

    private String equalsDecode(Node node) {
        String s;
        if (node.actualVal.equals("true")) {
            s = "(= ";
            stmts++;
        } else {
            s = "(not (= ";
            stmts += 2;
        }
        return s;
    }

    private String concatDecode(Node node) throws Exception {
        Node curr = node;
        Node sourceChild = null;
        Node targetChild = null;
        String s = "(str.++ ";

        while (curr.val.contains("concat") || curr.val.contains("append")) { // if there are stacked concats
            for (Map.Entry<Node, String> entry : curr.childrenType.entrySet()) {
                Node child = entry.getKey();
                if (entry.getValue().equals("t")) {
                    sourceChild = child;
                } else {
                    targetChild = child;
                }
            }
            s += smtDecode(sourceChild);
            curr = targetChild;
        }
        s += smtDecode(curr);
//            while (!stringStack.isEmpty()){
//                s+= smtDecode(stringStack.pop());
//            }
        s += ")";
        return s;
    }

    private String containsDecode(Node node) {
        // inverse graphs (not from translated smt queries)
        String s;
        if (node.actualVal.equals("true")) {
            s = "(str.contains ";
            stmts++;
        } else {
            s = "(not (str.contains ";
            stmts += 2;
        }
        return s; // is this converse in smt? (yes?) its str.contains t s, where t contains s, but should check that its traversed correctly
    }

    private String isEmptyDecode(Node node) throws Exception {
        String s;
        if (node.actualVal.equals("true")) {
            s = "(= \"\" ";
            stmts++;
        } else {
            s = "(not (= \"\" ";
            stmts += 2;
        }
        s += smtDecode(node.childrenType.keySet().iterator().next());
        for (int i = 0; i < stmts; i++) {
            s += ")";
        }
        stmts = 0;
        return s;
        // potentially not correct ordering / syntax?
    }

    private String replaceDecode(Node node) throws Exception { // probably going to be an issue with multiple arguments?
        String s = "(str.replace_all ";
        Node targ = null, s1 = null, s2 = null;
        for (Node child : node.childrenType.keySet()) {
            switch (node.childrenType.get(child)) {
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
        s += smtDecode(targ) + " " + smtDecode(s1) + " " + smtDecode(s2) + ")";
        return s;
    }

//    private String replaceAll(Node node)

    private String substringDecode(Node node) throws Exception {
        String s = "(str.substr ";
        Node targ = null; //this is last
        Node s1 = null;
        Node s2 = null;
        for (Node child : node.childrenType.keySet()) {
            switch (node.childrenType.get(child)) {
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
        if (s2 == null) { //substring with only 1 int arg that is the index to start at
			String limitString = smtDecode(targ);
			lengthLimits.put(limitString, Integer.parseInt(s1.actualVal));
			s += limitString + " " + s1.actualVal + ")";
			return s;
		}
		Integer endIndex = Integer.parseInt(s2.actualVal);
        Integer length = endIndex - Integer.parseInt(s1.actualVal);
        String limitString = smtDecode(targ);
        lengthLimits.put(limitString, endIndex);
        s += limitString + " " + s1.actualVal + " " + length + ")";
        return s;
    }

    private String toLowerDecode(Node node) throws Exception {
        lower = true;
        if (currentSolver != Solver.CVC5) {
            String sym = "L" + num_lower_syms++ + " ";
            String targ = smtDecode(node.childrenType.keySet().iterator().next());
            if (lower_syms.containsValue(targ)) { //check value exists.....
                return getSym(targ);
            }
            lower_syms.put(sym, targ);
            return sym;
        } else {
        	String s = smtDecode(node.childrenType.keySet().iterator().next()); //one child
        	return "(str.toLower " + s + ")";
		}
        //this is handles by a custom defined function in the header (added at end of building)
    }

    private String toUpperDecode(Node node) throws Exception {
        upper = true;
        String s = smtDecode(node.childrenType.keySet().iterator().next());
        return "(str.toUpper " + s + ")";
        //custom defined function
    }

    private String deleteDecode(Node node) throws Exception {
        delete = true;
        Node targ = null, s1 = null, s2 = null;
        for (Node child : node.childrenType.keySet()) {
            switch (node.childrenType.get(child)) {
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
        int length = Integer.parseInt(s2.actualVal) - Integer.parseInt(s1.actualVal);
        String limitString = smtDecode(targ);
        lengthLimits.put(limitString, Integer.parseInt(s2.actualVal));
        return "(str.del " + limitString + " " + s1.actualVal + " " + length + ")";
    }

    private String charAtDecode(Node node) throws Exception {
        String s = "(str.at ";
        Node targ = null;
        Node s1 = null;
        for (Node child : node.childrenType.keySet()) {
            switch (node.childrenType.get(child)) {
                case "t":
                    targ = child;
                    break;
                case "s1":
                    s1 = child;
                    break;
            }
        }
        s += smtDecode(targ) + " " + s1.actualVal + ")";
        return s;
    }

    private String valueOfDecode(Node node) throws Exception {
        return smtDecode(node.childrenType.keySet().iterator().next());
    }

    private String getSym(String s) {
        for (String sym : lower_syms.keySet()) {
            if (lower_syms.get(sym).equals(s)) {
                return sym;
            }
        }
        return null;
    }

	private String addToLower(Solver solver) {
		switch (solver) {
			case OSTRICH:
				return "(define-fun-rec toLower ((x String) (y String)) Bool\n" +
						"   (or (and (= x \"\") (= y \"\"))\n" +
						"       (and (not (= x \"\")) (not (= y \"\"))\n" +
						"           (= (char.code (str.head y))\n" +
						"               (ite (and (<= 65 (char.code (str.head x)))\n" +
						"                       (<= (char.code (str.head x)) 90))\n" +
						"                   (+ (char.code (str.head x)) 32)\n" +
						"                   (char.code (str.head x))))\n" +
						"           (toLower (str.tail x) (str.tail y))))\n" +
						")\n";
			case Z3:
				return "(define-fun-rec toLower ((x String) (y String)) Bool " +
					"	(or (and (= x \"\") (= y \"\")) " +
					"		(and (not (= x \"\")) (not (= y \"\")) " +
					"			(let ((x_head (str.at x 0)) " +
					"				(y_head (str.at y 0)) " +
					"				(x_tail (str.substr x 1 (- (str.len x) 1))) " +
					"				(y_tail (str.substr y 1 (- (str.len y) 1)))) " +
					"			(and (= (str.to_code y_head) " +
					"				(ite (and (<= 65 (str.to_code x_head)) (<= (str.to_code x_head) 90)) " +
					"					(+ (str.to_code x_head) 32) " +
					"					(str.to_code x_head))) " +
					"				(toLower x_tail y_tail))))))\n";
			case CVC5:
				return "";
		}
		return null;
	}

	private String addToUpper(Solver solver) {
		switch (solver) {
			case OSTRICH:
				return "(define-fun-rec toUpper ((x String) (y String)) Bool\n" +
						"   (or (and (= x \"\") (= y \"\"))\n" +
						"       (and (not (= x \"\")) (not (= y \"\"))\n" +
						"           (= (char.code (str.head y))\n" +
						"               (ite (and (<= 97(char.code (str.head x)))\n" +
						"                       (<= (char.code (str.head x)) 122))\n" +
						"                   (- (char.code (str.head x)) 32)\n" +
						"                   (char.code (str.head x))))\n" +
						"           (toUpper (str.tail x) (str.tail y))))\n" +
						")\n";
			case Z3:
				return "(define-fun-rec toUpper ((x String) (y String)) Bool " +
						"	(or (and (= x \"\") (= y \"\")) " +
						"		(and (not (= x \"\")) (not (= y \"\")) " +
						"			(let ((x_head (str.at x 0)) " +
						"				(y_head (str.at y 0)) " +
						"				(x_tail (str.substr x 1 (- (str.len x) 1))) " +
						"				(y_tail (str.substr y 1 (- (str.len y) 1)))) " +
						"			(and (= (str.to_code y_head) " +
						"				(ite (and (<= 97 (str.to_code x_head)) (<= (str.to_code x_head) 122)) " +
						"					(- (str.to_code x_head) 32) " +
						"					(str.to_code x_head))) " +
						"				(toLower x_tail y_tail))))))\n";
			case CVC5:
				return "";
		}
		return null;
	}
	private String addDelete() {
		return "(define-fun str.del ((x String) (a Int) (b Int)) String\n" +
				"  (str.++ (str.substr x 0 a) (str.substr x b (str.len x))))\n";
	}
	private String addTrim() {
		return "(declare-const ws RegLan)\n" +
				"(declare-const nwc RegLan)\n" +
				"(assert (= ws (re.union (re.+ (re.range (str.from_code 0) (str.from_code 32))) (str.to_re \"\"))))\n" +
				"(assert (= nwc (re.diff re.allchar (re.range (str.from_code 0) (str.from_code 32)))))\n";
	}

	private void finishCVC5Query(String query) {
		StringBuilder smtQuery = new StringBuilder(query);
		addAlphaAndDefs(smtQuery);
		addCustomFuncs(smtQuery, Solver.CVC5);
		finishSMTQuery(smtQuery);
		queries.put(Solver.CVC5, smtQuery.toString());
	}
	private void finishOstrichQuery(String query) {
		StringBuilder smtQuery = new StringBuilder(query);
		addCaseConversion(smtQuery);
		addAlphaAndDefs(smtQuery);
		addCustomFuncs(smtQuery, Solver.OSTRICH);
		smtQuery.insert(0, "(set-option :parse-transducers true)\n");
		finishSMTQuery(smtQuery);
		queries.put(Solver.OSTRICH, smtQuery.toString());
	}
	private void finishZ3Query(String query) {
		StringBuilder smtQuery = new StringBuilder(query);
		addCaseConversion(smtQuery);
		addAlphaAndDefs(smtQuery);
		addCustomFuncs(smtQuery, Solver.Z3);
		finishSMTQuery(smtQuery);
		queries.put(Solver.Z3, smtQuery.toString());
	}

	private void addAlphaAndDefs(StringBuilder query) {
		query.insert(0, alpha);
		query.insert(0, defStrings);
	}

	private void addCaseConversion(StringBuilder query){
		for (Map.Entry<String, String> entry : lower_syms.entrySet()) {
			String sym = entry.getKey();
			String targ = entry.getValue();
			query.insert(0, "(assert (toLower " + targ + " " + sym + "))\n");
			query.insert(0, "(declare-fun " + sym + " () String)\n");
		}
	}

	private void addCustomFuncs(StringBuilder query, Solver solver) {
		if (lower) query.insert(0, addToLower(solver));
		if (upper) query.insert(0, addToUpper(solver));
		if (delete) query.insert(0, addDelete());
		if (trim) query.insert(0, addTrim());
	}

	private void finishSMTQuery(StringBuilder query){
		query.insert(0, "(set-option :produce-models true)\n");
		query.append("\n(check-sat)\n(get-model)\n(exit)");
		if (lower || upper) {
			query.insert(0, "(set-logic ALL)\n"); // z3-noodler is sad with this
		} else {
			query.insert(0, "(set-logic QF_S)\n");
		}
	}

    private Boolean notHandledByDecode(Node node) {
        if (node.val.contains("concat") || node.val.contains("substring") || node.val.contains("isEmpty") || node.val.contains("toLowerCase") || node.val.contains("toUpperCase") || node.val.contains("delete") || node.val.contains("charAt") || node.val.contains("valueOf") || node.val.contains("toString") || node.val.contains("length")) {
            return false;
        }
        return true;
    }

    private String unescape(String s) {
        return s.replace("\"", "").replace("\\\\","\\"); //might need to add others tbh
    }

	public String getCVC5Query() {
		return queries.get(Solver.CVC5);
	}

	public String getOstrichQuery() {
		return queries.get(Solver.OSTRICH);
	}

	public String getZ3Query() {
		return queries.get(Solver.Z3);
	}

    public void printGraph(ArrayList<Node> nodes, String substr, String msg) {
        if (nodes.isEmpty()) return;
        if (substr == null) substr = "";
        if (msg == null) msg = "";
        System.out.println("NODEGRAPH ------------------------------------" + msg);
        for (Node node : nodes) {
            if (node.val == null) System.out.println(node);
            if (node.val != null && node.val.contains(substr)) System.out.println(node);
        }
        System.out.println("----------------------------------------------");
    }

}
