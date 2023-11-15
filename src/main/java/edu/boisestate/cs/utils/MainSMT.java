package edu.boisestate.cs.utils;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONTokener;

public class MainSMT {
    
    public static void main(String[] args){

        String directoryPath = args[0];
        File directory = new File(directoryPath);
        String outputDirPath = directoryPath + "_SMT"; //this doesn't actually work the way i might want it to work if pointing to a weird dirctory
        File outputDir = new File(outputDirPath);

        outputDir.mkdir();

        for (File jsonFile : getJSONs(directory)){
            String outputPath = jsonFile.getAbsolutePath().replace(".json", ".smt").replace(directoryPath,outputDirPath);
            File output = new File(outputPath);
            JSONObject json = getJSONobj(jsonFile.getAbsolutePath());

            ArrayList<Node> graph = toNodeGraph.makeNodeGraph(json);
            String query = null;
            try {
                query = smtBuilder.getQuery(graph);
            } catch (Exception e) {
                System.err.println("Problem with file " + output.getAbsolutePath());
                System.err.println(e.getMessage());
                continue;
            }
            try (PrintWriter j = new PrintWriter(output)) {
                j.println(query);
            } catch (Exception e) {
                System.err.println("Problem with file " + output.getAbsolutePath());
                e.printStackTrace();
            }
        }

    }

    private static ArrayList<File> getJSONs(File directory){
        ArrayList<File> files = new ArrayList<File>();
        for (File file : directory.listFiles()){
            if (file.isDirectory()){
                files.addAll(getJSONs(file));
            } else {
                if (file.getName().endsWith(".json")){
                    files.add(file);
                }
            }
        }
        return files;
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
