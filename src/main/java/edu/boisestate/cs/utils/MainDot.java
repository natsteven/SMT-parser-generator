/**
 * Parses .smt2 files and creates a parse trees using antlr
 * currently set up for generating a dot file for a graph of the parse tree of the query
 * which is useful for debugging. then generating a png with a visualization of the syntax tree.
 * 
 * Assumes that the dot package is installed to creat the png. dot package is not incldued in the 
 * dependencies for this project because it is more of a corollary debugging tool
 *
 * @author Nathanael Steven
 */
package edu.boisestate.cs.utils;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import edu.boisestate.cs.antlrTools.SMTLIBv2StringsLexer;
import edu.boisestate.cs.antlrTools.SMTLIBv2StringsParser;

import java.io.*;

public class MainDot {
    
    public static void main(String[] args) {
        File dir = new File(args[0]);
        processQueries(dir);

    }
    
    private static void processQueries(File dir) {
        //create directory for dot files
        File outputDir = new File("dots_" + dir);
        outputDir.mkdir();

        //iterate through smt2 files in directory recursively
        for (final File file : dir.listFiles()) {
            if (file.isDirectory() && !file.getName().startsWith("dot")) {
                processQueries(file);
            }
            if (file.getName().endsWith(".smt2")) {

                try {

                    //sets up antlr Parser
                    CharStream input = CharStreams.fromFileName(file.getAbsolutePath());
                    SMTLIBv2StringsLexer lexer = new SMTLIBv2StringsLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    SMTLIBv2StringsParser parser = new SMTLIBv2StringsParser(tokens);
                    
                    //walker for walking the tree and custom listener for writing the tree in dot format
                    ParseTreeWalker walker = new ParseTreeWalker();
                    dotListener dListener = new dotListener();

    
                    // error listener
                    parser.removeErrorListeners(); // remove ConsoleErrorListener
                    parser.addErrorListener(new BaseErrorListener(){ 
                        @Override
                        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                            System.err.println("File: " + file.getAbsolutePath());
                            System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
                        }
                    });
                    
    
    
                    ParseTree tree = parser.script();
                    
                    //walk the parsetree with your dot listener generating a dotfile
                    walker.walk(dListener, tree);
    
                    File dotFile = new File(outputDir, file.getName() + ".dot");
                    
                    //write dot listeners result to dot file
                    try (PrintWriter dot = new PrintWriter(dotFile)) {
                        dot.println(dListener.getDotRepresentation());
                    }
                    
                    //smtRun process using dot package to create png visualization (need dot installed, not included in dependencies of this project)
                    ProcessBuilder pb = new ProcessBuilder("dot", "-Tpng", "-o", dotFile.getAbsolutePath() + ".png", "-y", dotFile.getAbsolutePath());
                    try {
                        Process p = pb.start(); // Start the process.
                        p.waitFor(); // Wait for the process to finish.
                    } catch (IOException e) {
                        System.err.println("Problem when generating graph " + file.getAbsolutePath());
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        System.err.println("The graph generation was interrupted for file " + file.getAbsolutePath());
                        e.printStackTrace();
                    }
                }


                catch (Exception e) {
                    System.err.println("Problem with file " + file.getAbsolutePath());
                    e.printStackTrace();
                }
            }

        }
    }
}
