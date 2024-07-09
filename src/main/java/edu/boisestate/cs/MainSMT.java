package edu.boisestate.cs;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import edu.boisestate.cs.utils.NodeGraph;
import org.json.JSONObject;
import org.json.JSONTokener;

import edu.boisestate.cs.utils.Node;
import edu.boisestate.cs.utils.SmtBuilder;
import edu.boisestate.cs.utils.toNodeGraph;

public class MainSMT {
    
    public static void main(String[] args){

        if (args.length > 2 || args.length < 1){
            System.err.println("Usage: <directory> <ostrich(bool)>");
        }
        String directoryPath = args[0];
        boolean ostrich = args.length != 1 && Boolean.parseBoolean(args[1]); //simpler than ternary i guess
        File directory = new File(directoryPath);
        String outputDirPath = directoryPath + "_SMT"; //this could be better/nice : where the output goes i mean
        File outputDir = new File(outputDirPath);

        outputDir.mkdir();

        System.out.println("Converting JSONs in directory: " + directory.getAbsolutePath());
        if (ostrich) System.out.println("For Ostrich");

        for (File jsonFile : getJSONs(directory)){
            String outputPath = outputDirPath + "/"+ jsonFile.getName().replace(".json", ".smt2");
            File output = new File(outputPath);
            JSONObject json = getJSONobj(jsonFile.getAbsolutePath());

            NodeGraph graph = toNodeGraph.makeGraph(json);
            String query = null;
            SmtBuilder builder = new SmtBuilder(ostrich);

            // for (Node node : graph) {
            //     System.out.println(node);
            // }

            try {
                query = builder.getQuery(graph);
            } catch (Exception e) {
                System.err.println("Problem getting Query with file " + output.getAbsolutePath());
                System.err.println(e.getMessage());
                e.printStackTrace();
                continue;
            }
            try (PrintWriter j = new PrintWriter(output)) {
                j.println(query);
            } catch (Exception e) {
                System.err.println("Problem writing Query with file " + output.getAbsolutePath());
                e.printStackTrace();
            }
        }

    }

    private static ArrayList<File> getJSONs(File directory){
        ArrayList<File> files = new ArrayList<File>();
        for (File file : directory.listFiles()){
            if (file.isDirectory()){
                System.out.println("Not processing directory " + file.getAbsolutePath());
//                files.addAll(getJSONs(file));
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
