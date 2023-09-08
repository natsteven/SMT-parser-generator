// Generated from SMTLIBv2Strings.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SMTLIBv2StringsParser}.
 */
public interface SMTLIBv2StringsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SMTLIBv2StringsParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SMTLIBv2StringsParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#cmd_checkSat}.
	 * @param ctx the parse tree
	 */
	void enterCmd_checkSat(SMTLIBv2StringsParser.Cmd_checkSatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#cmd_checkSat}.
	 * @param ctx the parse tree
	 */
	void exitCmd_checkSat(SMTLIBv2StringsParser.Cmd_checkSatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#cmd_declareFun}.
	 * @param ctx the parse tree
	 */
	void enterCmd_declareFun(SMTLIBv2StringsParser.Cmd_declareFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#cmd_declareFun}.
	 * @param ctx the parse tree
	 */
	void exitCmd_declareFun(SMTLIBv2StringsParser.Cmd_declareFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#cmd_declareConst}.
	 * @param ctx the parse tree
	 */
	void enterCmd_declareConst(SMTLIBv2StringsParser.Cmd_declareConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#cmd_declareConst}.
	 * @param ctx the parse tree
	 */
	void exitCmd_declareConst(SMTLIBv2StringsParser.Cmd_declareConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#cmd_exit}.
	 * @param ctx the parse tree
	 */
	void enterCmd_exit(SMTLIBv2StringsParser.Cmd_exitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#cmd_exit}.
	 * @param ctx the parse tree
	 */
	void exitCmd_exit(SMTLIBv2StringsParser.Cmd_exitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#cmd_setInfo}.
	 * @param ctx the parse tree
	 */
	void enterCmd_setInfo(SMTLIBv2StringsParser.Cmd_setInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#cmd_setInfo}.
	 * @param ctx the parse tree
	 */
	void exitCmd_setInfo(SMTLIBv2StringsParser.Cmd_setInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#cmd_setLogic}.
	 * @param ctx the parse tree
	 */
	void enterCmd_setLogic(SMTLIBv2StringsParser.Cmd_setLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#cmd_setLogic}.
	 * @param ctx the parse tree
	 */
	void exitCmd_setLogic(SMTLIBv2StringsParser.Cmd_setLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(SMTLIBv2StringsParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(SMTLIBv2StringsParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(SMTLIBv2StringsParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(SMTLIBv2StringsParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#stringTheory}.
	 * @param ctx the parse tree
	 */
	void enterStringTheory(SMTLIBv2StringsParser.StringTheoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#stringTheory}.
	 * @param ctx the parse tree
	 */
	void exitStringTheory(SMTLIBv2StringsParser.StringTheoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SMTLIBv2StringsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SMTLIBv2StringsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#funString}.
	 * @param ctx the parse tree
	 */
	void enterFunString(SMTLIBv2StringsParser.FunStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#funString}.
	 * @param ctx the parse tree
	 */
	void exitFunString(SMTLIBv2StringsParser.FunStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#funRegLan}.
	 * @param ctx the parse tree
	 */
	void enterFunRegLan(SMTLIBv2StringsParser.FunRegLanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#funRegLan}.
	 * @param ctx the parse tree
	 */
	void exitFunRegLan(SMTLIBv2StringsParser.FunRegLanContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(SMTLIBv2StringsParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(SMTLIBv2StringsParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SMTLIBv2StringsParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SMTLIBv2StringsParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SMTLIBv2StringsParser#reglan}.
	 * @param ctx the parse tree
	 */
	void enterReglan(SMTLIBv2StringsParser.ReglanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SMTLIBv2StringsParser#reglan}.
	 * @param ctx the parse tree
	 */
	void exitReglan(SMTLIBv2StringsParser.ReglanContext ctx);
}