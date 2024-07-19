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

         String projectRoot = System.getProperty("project.basedir");

         File inputDir = new File(projectRoot, args[0]);
         File outputRoot = new File(projectRoot, "output_" + args[0]);
         outputRoot.mkdir();
         processQueries(inputDir, outputRoot);

     }
    
     /*
      * Outputs .json file for each given .smt2 file in a new output directory with same prefix filename
      */
     private static void processQueries(File inputDir, File outputDir) {
        
         //iterate recursively through input directory creating the same structure but with a output_ prefixfor directory names
         for (final File file : inputDir.listFiles()) {

             if (file.isDirectory()) {
                 File subOutputDir = new File(outputDir, "output_" + file.getName());
                 subOutputDir.mkdir();
                 processQueries(file, subOutputDir);
             }
             if (file.getName().endsWith(".smt2")) {
                 processFile(file, outputDir);
             }

         }
     }

     /*
      * Initializes parser and walks tree with the custom listener class jsonBuilder to write a .json of the data flow graph of the query
      */
     private static void processFile(File file, File outputDir){
         try {

             //initialize parser, walker, and listener(jsonBuilder)

             // System.out.println(file.getName());// if you want to debug
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
                
             File jFile = new File(outputDir, file.getName() + ".json");
            
             //write to new file
             try (PrintWriter j = new PrintWriter(jFile)) {
                 j.println(jB.getJSON());
             }

             /*
             * creates a copy of the .json file with certain predicate true false values flipped for logical equivalency
             * i.e. an equals predicate with two boolean children could have the children be both true or both false
             * this create a copy of the graph with the same semantics but assuming the children evaluate oppositely for
             * comprehensive checking of solution options
             */
             while (jB.createCopy > 0){ //jsonBuilder's createCopy checks for predicates with both boolean children
                 File jFile2 = new File(outputDir, file.getName() + ".copy" + jB.createCopy + ".json");
                 try (PrintWriter j2 = new PrintWriter(jFile2)) {
                     j2.println(jB.getCopyJSON());
                 }
                 jB.createCopy--;
             }
         }

         catch (Exception e) {
             System.err.println("Problem with file " + file.getAbsolutePath());
             e.printStackTrace();
         }
     }
 }

