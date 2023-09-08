package edu.boisestate.cs.utils;
import java.util.HashMap;

// import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import edu.boisestate.cs.antlrTools.SMTLIBv2StringsBaseListener;
import edu.boisestate.cs.antlrTools.SMTLIBv2StringsParser;

public class dotListener extends SMTLIBv2StringsBaseListener {

    private StringBuilder dotBuilder = new StringBuilder();
    private HashMap<Integer, String> nodeMap = new HashMap<>();
    private int nodeCounter = 0;

    @Override
    public void enterScript(SMTLIBv2StringsParser.ScriptContext ctx) {
        dotBuilder.append("graph {\n");
        String nodeName = getNodeName();
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + "[label=\"script\"];\n");
    }

    @Override
    public void exitScript(SMTLIBv2StringsParser.ScriptContext ctx) {
        dotBuilder.append("}");
    }

    // @Override
    // public void enterEveryRule(ParserRuleContext ctx) {
    //     String nodeName = getNodeName();
    //     String parentName = nodeMap.get(ctx.getParent().hashCode());
    //     nodeMap.put(ctx.hashCode(), nodeName);
    //     String ruleName = getRuleName(ctx);
    //     dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
    //                       nodeName + " [label=\"" + ruleName + "\"];\n");
    // }

    @Override
    public void visitTerminal(TerminalNode node) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(node.getParent().hashCode());
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"" + escaped(node.getText()) + "\"];\n"
        );
    }

    @Override
    public void enterCommand(SMTLIBv2StringsParser.CommandContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"command\"];\n");
    }

    @Override
    public void enterCmd_checkSat(SMTLIBv2StringsParser.Cmd_checkSatContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"cmd_checkSat\"];\n");
    }

    @Override
    public void enterCmd_declareFun(SMTLIBv2StringsParser.Cmd_declareFunContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"cmd_declareFun\"];\n");
    }

    @Override
    public void enterCmd_exit(SMTLIBv2StringsParser.Cmd_exitContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"cmd_exit\"];\n");
    }

    @Override
    public void enterCmd_setInfo(SMTLIBv2StringsParser.Cmd_setInfoContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"cmd_setInfo\"];\n");
    }

    @Override
    public void enterCmd_setLogic(SMTLIBv2StringsParser.Cmd_setLogicContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"cmd_setLogic\"];\n");
    }

    @Override
    public void enterInfo(SMTLIBv2StringsParser.InfoContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"info\"];\n");
    }

    @Override
    public void enterStringTheory(SMTLIBv2StringsParser.StringTheoryContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"stringTheory\"];\n");
    }

    @Override
    public void enterExpr(SMTLIBv2StringsParser.ExprContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"expr\"];\n");
    }

    @Override
    public void enterFunString(SMTLIBv2StringsParser.FunStringContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"funString\"];\n");;
    }

    @Override
    public void enterFunRegLan(SMTLIBv2StringsParser.FunRegLanContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"funRegLan\"];\n");
    }

    @Override
    public void enterFun(SMTLIBv2StringsParser.FunContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"funBool\"];\n");
    }

    @Override
    public void enterString(SMTLIBv2StringsParser.StringContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"string\"];\n");
    }

    @Override
    public void enterReglan(SMTLIBv2StringsParser.ReglanContext ctx) {
        String nodeName = getNodeName();
        String parentName = nodeMap.get(ctx.getParent().hashCode());
        nodeMap.put(ctx.hashCode(), nodeName);
        dotBuilder.append("\t" + nodeName + " -- " + parentName + ";\n\t" +
                        nodeName + " [label=\"regLan\"];\n");;
    }

    // private void getRuleName(ParserRuleContext ctx) {
    //     ctx.getRuleContext(ctx.getParent(), ctx.getRuleIndex());
    // }
    
    public String getNodeName() {
        return "n" + nodeCounter++;
    }

    public String getDotRepresentation() {
        return dotBuilder.toString();
    }

    private String escaped(String text) {
        return text.replace(":", "\\:")
                .replace("\"", "\\\"");
                // .replace("\\", "\\\\")
                // .replace("\n", "\\n")
                // .replace("\r", "\\r")
                // .replace("\t", "\\t");
    }
}
