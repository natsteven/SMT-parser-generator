/**
 * Main class for project which generates a .json file representing the data flow graph of the
 * input .smt2 queries. The intention being for the .json files to be used by EJSA to solve
 * benchmark queries.
 *
 * @author Nathanael Steven
 */
package edu.boisestate.cs;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import edu.boisestate.cs.antlrTools.SMTLIBv2StringsLexer;
import edu.boisestate.cs.antlrTools.SMTLIBv2StringsParser;
import edu.boisestate.cs.utils.jsonBuilder;

import java.io.*;

public class MainJSON {

	public static void main(String[] args) {

		if (args.length < 1 || args.length > 2) {
			System.err.println("Usage: <file or directory path> [optional: output path]");
			System.exit(1);
		}

		File input = new File(args[0]);
		File output = args.length == 2 ? new File(args[1]) : new File(input.getParent(), input.getName() + ".json");
		process(input, output);
	}

	private static void process(File inputDir, File outputDir) {
		if (inputDir.isFile()) {
			processFile(inputDir, outputDir);
		} else if (inputDir.isDirectory()) {
			File[] files = inputDir.listFiles();
			if (files == null || files.length == 0) {
				System.out.println("Issue with directory: " + inputDir.getAbsolutePath());
				return;
			}
			outputDir.mkdir();
			for (final File file : files) {
				if (file.isDirectory()) {
					File subOutputDir = new File(outputDir, file.getName());
					subOutputDir.mkdir();
					process(file, subOutputDir);
				} else if (file.getName().endsWith(".smt2")) {
					File json = new File(outputDir, file.getName() + ".json");
					processFile(file, json);
				} else {
					System.out.println("Skipping non .smt2 file: " + file.getName());
				}

			}
		}
	}

	/*
	 * Initializes parser and walks tree with the custom listener class jsonBuilder to write a .json of the data flow graph of the query
	 */
	private static void processFile(File file, File output) {
		try {
			System.out.println("Processing file: " + file.getName());
			//initialize parser, walker, and listener(jsonBuilder)

//              System.out.println(file.getName());// if you want to debug
			CharStream input = CharStreams.fromFileName(file.getAbsolutePath());
			SMTLIBv2StringsLexer lexer = new SMTLIBv2StringsLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SMTLIBv2StringsParser parser = new SMTLIBv2StringsParser(tokens);
			ParseTreeWalker walker = new ParseTreeWalker();
			jsonBuilder jB = new jsonBuilder();

			// error listener if desired
			// parser.removeErrorListeners(); // remove ConsoleErrorListener
			// parser.addErrorListener(new BaseErrorListener(){
			//     @Override
			//     public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
			//         System.err.println("File: " + file.getAbsolutePath());
			//         System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
			//     }
			// });

			//walk tree with json listener
			ParseTree tree = parser.script();
			walker.walk(jB, tree);

			//write to new file
			try (PrintWriter j = new PrintWriter(output)) {
				j.println(jB.getJSON());
			}

			System.out.println("Output written to: " + output.getAbsolutePath());

			// TODO: refactor this horrible code (handle disjuncts better)
			/*
			 * creates a copy of the .json file with certain predicate true false values flipped for logical equivalency
			 * i.e. an equals predicate with two boolean children could have the children be both true or both false
			 * this create a copy of the graph with the same semantics but assuming the children evaluate oppositely for
			 * comprehensive checking of solution options
			 */
//			while (jB.createCopy > 0) { //jsonBuilder's createCopy checks for predicates with both boolean children
//				File jFile2 = new File(output.getName() + ".copy" + jB.createCopy + ".json");
//				try (PrintWriter j2 = new PrintWriter(jFile2)) {
//					j2.println(jB.getCopyJSON());
//				}
//				jB.createCopy--;
//			}
		} catch (RuntimeException re) {
			System.err.println("Problem with file " + file.getAbsolutePath());
		} catch (Exception e) {
			System.err.println("Problem with file " + file.getAbsolutePath());
			e.printStackTrace();
		}
	}
}

