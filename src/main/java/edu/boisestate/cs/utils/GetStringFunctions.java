package edu.boisestate.cs.utils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class GetStringFunctions {

    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Usage: <file>");
            System.exit(1);
        }
        if (args[0].contains("json")){
            String[] path = args[0].split("/");
            String file = path[path.length - 1].replace(".json", "").replace(".smt2","");
            functionsFromJSON(getJSONobj(args[0]), file);
        } else if (args[0].contains("smt2")){
            functionsFromSMT(args[0]);
        }
        else {
            System.out.println("Usage: <file>");
            System.exit(1);
        }
    }

    public static void functionsFromJSON(JSONObject json, String filename){
        JSONArray nodes = json.getJSONArray("vertices");

        HashSet<String> functions = new HashSet<>();

        for (int i = 0; i < nodes.length(); i++) {
            JSONObject node = nodes.getJSONObject(i);
            String value = node.getString("value");
            String[] parse = value.split("!!");
            if (parse.length > 1 && !parse[0].contains("getStringValue")) {
                functions.add(parse[0]);
            }

        }

        printFunctions(filename, functions);

    }

    public static void functionsFromSMT(String filepath){
        String[] path = filepath.split("/");
        String filename = path[path.length - 1].replace(".smt2","");

        HashSet<String> functions = new HashSet<>();

        try (Scanner scanner = new Scanner(new FileReader(filepath))) {
            boolean assertFound = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // are simple method for parsing kind of requires we skip header/preamble
                if (assertFound) {
                    functions.addAll(getFuncFromSMTString(line));
                } else if (line.startsWith("(assert")) {
                    assertFound = true;
                    functions.addAll(getFuncFromSMTString(line));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        printFunctions(filename, functions);

    }

    public static HashSet<String> getFuncFromSMTString(String line){
        HashSet<String> functions = new HashSet<>();
        String[] tokens = line.split("\\s+");
        for (String token : tokens) {
            if (token.contains("str.") || token.contains("re.")) {
                token=token.replace("(", "").replace(")","").replace(",","");
                functions.add(token);
            }
        }
        return functions;
    }

    public static void printFunctions(String filename, HashSet<String> functions){
        System.out.print(filename + ": ");
        for (String function : functions) {
            System.out.print(function + ", ");
        }
    }

    /**
     * Parse the JSON of the filepath to a JSONObject for use with other methods
     * @param filepath - path to json file to parse
     * @return Returns a JSONObject of that json file
     */
    public static JSONObject getJSONobj(String filepath){
        JSONObject jsonObject = null;
        try {
            FileReader fileReader = new FileReader(filepath);
            JSONTokener jsonTokener = new JSONTokener(fileReader);
            jsonObject = new JSONObject(jsonTokener);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
