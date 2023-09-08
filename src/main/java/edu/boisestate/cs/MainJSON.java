package edu.boisestate.cs;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import edu.boisestate.cs.antlrTools.SMTLIBv2StringsLexer;
import edu.boisestate.cs.antlrTools.SMTLIBv2StringsParser;
import edu.boisestate.cs.utils.jsonBuilder;

import java.io.*;

public class MainJSON {
    
    public static void main(String[] args) {
        File dir = new File(args[0]);
        processQueries(dir);

    }
    
    private static void processQueries(File dir) {
        File outputDir = new File(dir.getParent(), "output_" + dir.getName());
        outputDir.mkdir();

        for (final File file : dir.listFiles()) {
            if (file.isDirectory()) {
                processQueries(file);
            }
            if (file.getName().endsWith(".smt2")) {

                try {
                    // System.out.println(file.getName());// if you want to debug 
                    CharStream input = CharStreams.fromFileName(file.getAbsolutePath());
                    SMTLIBv2StringsLexer lexer = new SMTLIBv2StringsLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    SMTLIBv2StringsParser parser = new SMTLIBv2StringsParser(tokens);
    
                    ParseTreeWalker walker = new ParseTreeWalker();
                    jsonBuilder jB = new jsonBuilder();
    
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
                    walker.walk(jB, tree);
    
                    File jFile = new File(outputDir, file.getName() + ".json");
                    
                    try (PrintWriter j = new PrintWriter(jFile)) {
                        j.println(jB.getJSON());
                    }
                    if (jB.createCopy){
                        File jFile2 = new File(outputDir, file.getName() + ".copy.json");
                        try (PrintWriter j2 = new PrintWriter(jFile2)) {
                            j2.println(jB.getCopyJSON());
                        }
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

