package edu.boisestate.cs.utils;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.util.HashSet;

public class GetStringFunctions {

    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Usage: <file>");
            System.exit(1);
        }
//        if (args[0].contains("copy")){
//            System.exit(0);
//        }
        JSONObject json = getJSONobj(args[0]);
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
        String[] path = args[0].split("/");
        String file = path[path.length - 1].replace(".json", "").replace(".smt2","");
        System.out.print(file + ": ");

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
