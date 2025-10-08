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

	public static void main(String[] args) {

		if (args.length != 1) {
			System.err.println("Usage: <directory>");
			System.exit(1);
		}
		String directoryPath = args[0];
		File directory = new File(directoryPath);

		System.out.println("Converting JSONs in directory: " + directory.getAbsolutePath());

		String cvc5Path = directoryPath + File.separator + "cvc5";
		String ostrichPath = directoryPath + File.separator + "ostrich";
		String z3Path = directoryPath + File.separator + "z3";
		new File(cvc5Path).mkdirs();
		new File(ostrichPath).mkdirs();
		new File(z3Path).mkdirs();

		for (File jsonFile : getJSONs(directory)) {
			JSONObject json = getJSONobj(jsonFile.getAbsolutePath());
			NodeGraph graph = toNodeGraph.makeGraph(json);
			SmtBuilder builder = new SmtBuilder(graph);

			try {
				builder.getQueries();
			} catch (Exception e) {
				System.err.println("Problem getting Query with file " + jsonFile.getAbsolutePath());
				System.err.println(e.getMessage());
				e.printStackTrace();
				continue;
			}

			String smtFile = jsonFile.getName().replace(".json", ".smt2");

			try (PrintWriter c = new PrintWriter(cvc5Path + File.separator + smtFile)) {
				c.println(builder.getCVC5Query());
			} catch (Exception e) {
				System.err.println("Problem writing CVC5 query for " + jsonFile.getName());
				e.printStackTrace();
			}

			try (PrintWriter o = new PrintWriter(ostrichPath + File.separator + smtFile)) {
				o.println(builder.getOstrichQuery());
			} catch (Exception e) {
				System.err.println("Problem writing Ostrich query for " + jsonFile.getName());
				e.printStackTrace();
			}

			try (PrintWriter z = new PrintWriter(z3Path + File.separator + smtFile)) {
				z.println(builder.getZ3Query());
			} catch (Exception e) {
				System.err.println("Problem writing Z3 query for " + jsonFile.getName());
				e.printStackTrace();
			}
		}

	}

	private static ArrayList<File> getJSONs(File directory) {
		ArrayList<File> files = new ArrayList<File>();
		for (File file : directory.listFiles()) {
			if (file.isDirectory()) {
				System.out.println("Not processing directory " + file.getAbsolutePath());
//                files.addAll(getJSONs(file));
			} else {
				if (file.getName().endsWith(".json")) {
					files.add(file);
				}
			}
		}
		return files;
	}

	/**
	 * Parse the JSON of the filepath to a JSONObject for use with other methods
	 *
	 * @param filepath - path to json file to parse
	 * @return Returns a JSONObject of that json file
	 */
	public static JSONObject getJSONobj(String filepath) {
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
