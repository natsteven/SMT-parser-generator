package edu.boisestate.cs;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import edu.boisestate.cs.antlrTools.SMTLIBv2StringsLexer;
import edu.boisestate.cs.antlrTools.SMTLIBv2StringsParser;
import edu.boisestate.cs.utils.dotListener;

import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        File dir = new File(args[0]);
        processQueries(dir);

    }
    
    private static void processQueries(File dir) {
        File outputDir = new File("output_" + dir);
        outputDir.mkdir();

        for (final File file : dir.listFiles()) {
            if (file.isDirectory() && !file.getName().startsWith("output")) {
                processQueries(file);
            }
            if (file.getName().endsWith(".smt2")) {

                try {

                    CharStream input = CharStreams.fromFileName(file.getAbsolutePath());
                    SMTLIBv2StringsLexer lexer = new SMTLIBv2StringsLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    SMTLIBv2StringsParser parser = new SMTLIBv2StringsParser(tokens);
    
                    ParseTreeWalker walker = new ParseTreeWalker();
                    // queryListener qListener = new queryListener();
                    dotListener dListener = new dotListener();
                    // jsonBuilder jL = new jsonBuilder();
    
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
    
                    // walker.walk(qListener, tree);
                    walker.walk(dListener, tree);
                    // walker.walk(jL, tree);
    
                    // String treeString = Trees.toStringTree(tree, parser);
    
                    // File treeFile = new File(outputDir, file.getName() + ".tree");
                    // File reconstruct = new File(outputDir, file.getName() + ".new");
                    File dotFile = new File(outputDir, file.getName() + ".dot");
                    // File jFile = new File(outputDir, file.getName() + ".json");
    
                    // try (PrintWriter out = new PrintWriter(treeFile)) {
                    //     out.println(treeString);
                    // }
    
                    // try (PrintWriter renew = new PrintWriter(reconstruct)) {
                    //     renew.println(qListener.getOutput());
                    // }
    
                    try (PrintWriter dot = new PrintWriter(dotFile)) {
                        dot.println(dListener.getDotRepresentation());
                    }
                    
                    // try (PrintWriter j = new PrintWriter(jFile)) {
                    //     j.println(jL.getJSON());
                    // }

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
