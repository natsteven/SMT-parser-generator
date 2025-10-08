package edu.boisestate.cs.antlrTools;
// Generated from src/main/java/edu/boisestate/cs/antlrTools/SMTLIBv2Strings.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SMTLIBv2StringsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, ParOpen=2, ParClose=3, CMD_checksat=4, CMD_declarefun=5, CMD_declareconst=6, 
		CMD_setinfo=7, CMD_setlogic=8, CMD_getmodel=9, CMD_getvalue=10, CMD_exit=11, 
		Assert=12, Let=13, And=14, Not=15, Equals=16, Or=17, LT=18, StrInRE=19, 
		LTE=20, Prefix=21, Suffix=22, Contains=23, StringConcat=24, StringReplace=25, 
		StringReplaceAll=26, StringReplaceRE=27, StringReplaceREAll=28, StringAt=29, 
		REfromString=30, REConcat=31, REUnion=32, REInter=33, REKleeneClose=34, 
		REComp=35, REDiff=36, REKleenCross=37, REOpt=38, RERange=39, REIndex=40, 
		RELoop=41, REConst=42, String=43, Int=44, SymbolicType=45, VAR=46, Info=47, 
		InfoKW=48, WS=49;
	public static final int
		RULE_script = 0, RULE_cmd_checkSat = 1, RULE_cmd_getModel = 2, RULE_cmd_getValue = 3, 
		RULE_cmd_declareFun = 4, RULE_cmd_declareConst = 5, RULE_cmd_exit = 6, 
		RULE_cmd_setInfo = 7, RULE_cmd_setLogic = 8, RULE_command = 9, RULE_info = 10, 
		RULE_stringTheory = 11, RULE_expr = 12, RULE_funString = 13, RULE_funRegLan = 14, 
		RULE_fun = 15, RULE_string = 16, RULE_reglan = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "cmd_checkSat", "cmd_getModel", "cmd_getValue", "cmd_declareFun", 
			"cmd_declareConst", "cmd_exit", "cmd_setInfo", "cmd_setLogic", "command", 
			"info", "stringTheory", "expr", "funString", "funRegLan", "fun", "string", 
			"reglan"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'check-sat'", "'declare-fun'", "'declare-const'", 
			"'set-info'", "'set-logic'", "'get-model'", "'get-value'", "'exit'", 
			"'assert'", "'let'", "'and'", "'not'", "'='", "'or'", "'str.<'", "'str.in_re'", 
			"'str.<='", "'str.prefixof'", "'str.suffixof'", "'str.contains'", "'str.++'", 
			"'str.replace'", "'str.replace_all'", "'str.replace_re'", "'str.replace_re_all'", 
			"'str.at'", "'str.to_re'", "'re.++'", "'re.union'", "'re.inter'", "'re.*'", 
			"'re.comp'", "'re.diff'", "'re.+'", "'re.opt'", "'re.range'", "'_ re.^'", 
			"'_ re.loop'", null, null, null, "'String'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Comment", "ParOpen", "ParClose", "CMD_checksat", "CMD_declarefun", 
			"CMD_declareconst", "CMD_setinfo", "CMD_setlogic", "CMD_getmodel", "CMD_getvalue", 
			"CMD_exit", "Assert", "Let", "And", "Not", "Equals", "Or", "LT", "StrInRE", 
			"LTE", "Prefix", "Suffix", "Contains", "StringConcat", "StringReplace", 
			"StringReplaceAll", "StringReplaceRE", "StringReplaceREAll", "StringAt", 
			"REfromString", "REConcat", "REUnion", "REInter", "REKleeneClose", "REComp", 
			"REDiff", "REKleenCross", "REOpt", "RERange", "REIndex", "RELoop", "REConst", 
			"String", "Int", "SymbolicType", "VAR", "Info", "InfoKW", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SMTLIBv2Strings.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SMTLIBv2StringsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<StringTheoryContext> stringTheory() {
			return getRuleContexts(StringTheoryContext.class);
		}
		public StringTheoryContext stringTheory(int i) {
			return getRuleContext(StringTheoryContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(36);
					command();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(42); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(41);
					stringTheory();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(44); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				command();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ParOpen );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_checkSatContext extends ParserRuleContext {
		public TerminalNode CMD_checksat() { return getToken(SMTLIBv2StringsParser.CMD_checksat, 0); }
		public Cmd_checkSatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_checkSat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterCmd_checkSat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitCmd_checkSat(this);
		}
	}

	public final Cmd_checkSatContext cmd_checkSat() throws RecognitionException {
		Cmd_checkSatContext _localctx = new Cmd_checkSatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmd_checkSat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(CMD_checksat);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_getModelContext extends ParserRuleContext {
		public TerminalNode CMD_getmodel() { return getToken(SMTLIBv2StringsParser.CMD_getmodel, 0); }
		public Cmd_getModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterCmd_getModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitCmd_getModel(this);
		}
	}

	public final Cmd_getModelContext cmd_getModel() throws RecognitionException {
		Cmd_getModelContext _localctx = new Cmd_getModelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmd_getModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(CMD_getmodel);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_getValueContext extends ParserRuleContext {
		public TerminalNode CMD_getvalue() { return getToken(SMTLIBv2StringsParser.CMD_getvalue, 0); }
		public Cmd_getValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterCmd_getValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitCmd_getValue(this);
		}
	}

	public final Cmd_getValueContext cmd_getValue() throws RecognitionException {
		Cmd_getValueContext _localctx = new Cmd_getValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd_getValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CMD_getvalue);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_declareFunContext extends ParserRuleContext {
		public TerminalNode CMD_declarefun() { return getToken(SMTLIBv2StringsParser.CMD_declarefun, 0); }
		public TerminalNode VAR() { return getToken(SMTLIBv2StringsParser.VAR, 0); }
		public TerminalNode ParOpen() { return getToken(SMTLIBv2StringsParser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2StringsParser.ParClose, 0); }
		public TerminalNode SymbolicType() { return getToken(SMTLIBv2StringsParser.SymbolicType, 0); }
		public Cmd_declareFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_declareFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterCmd_declareFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitCmd_declareFun(this);
		}
	}

	public final Cmd_declareFunContext cmd_declareFun() throws RecognitionException {
		Cmd_declareFunContext _localctx = new Cmd_declareFunContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd_declareFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(CMD_declarefun);
			setState(58);
			match(VAR);
			setState(59);
			match(ParOpen);
			setState(60);
			match(ParClose);
			setState(61);
			match(SymbolicType);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_declareConstContext extends ParserRuleContext {
		public TerminalNode CMD_declareconst() { return getToken(SMTLIBv2StringsParser.CMD_declareconst, 0); }
		public TerminalNode VAR() { return getToken(SMTLIBv2StringsParser.VAR, 0); }
		public TerminalNode SymbolicType() { return getToken(SMTLIBv2StringsParser.SymbolicType, 0); }
		public Cmd_declareConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_declareConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterCmd_declareConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitCmd_declareConst(this);
		}
	}

	public final Cmd_declareConstContext cmd_declareConst() throws RecognitionException {
		Cmd_declareConstContext _localctx = new Cmd_declareConstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd_declareConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(CMD_declareconst);
			setState(64);
			match(VAR);
			setState(65);
			match(SymbolicType);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_exitContext extends ParserRuleContext {
		public TerminalNode CMD_exit() { return getToken(SMTLIBv2StringsParser.CMD_exit, 0); }
		public Cmd_exitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterCmd_exit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitCmd_exit(this);
		}
	}

	public final Cmd_exitContext cmd_exit() throws RecognitionException {
		Cmd_exitContext _localctx = new Cmd_exitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(CMD_exit);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_setInfoContext extends ParserRuleContext {
		public TerminalNode CMD_setinfo() { return getToken(SMTLIBv2StringsParser.CMD_setinfo, 0); }
		public TerminalNode InfoKW() { return getToken(SMTLIBv2StringsParser.InfoKW, 0); }
		public List<InfoContext> info() {
			return getRuleContexts(InfoContext.class);
		}
		public InfoContext info(int i) {
			return getRuleContext(InfoContext.class,i);
		}
		public Cmd_setInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_setInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterCmd_setInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitCmd_setInfo(this);
		}
	}

	public final Cmd_setInfoContext cmd_setInfo() throws RecognitionException {
		Cmd_setInfoContext _localctx = new Cmd_setInfoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd_setInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CMD_setinfo);
			setState(70);
			match(InfoKW);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				info();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 219902325555200L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_setLogicContext extends ParserRuleContext {
		public TerminalNode CMD_setlogic() { return getToken(SMTLIBv2StringsParser.CMD_setlogic, 0); }
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public Cmd_setLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_setLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterCmd_setLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitCmd_setLogic(this);
		}
	}

	public final Cmd_setLogicContext cmd_setLogic() throws RecognitionException {
		Cmd_setLogicContext _localctx = new Cmd_setLogicContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd_setLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CMD_setlogic);
			setState(77);
			info();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public List<TerminalNode> ParOpen() { return getTokens(SMTLIBv2StringsParser.ParOpen); }
		public TerminalNode ParOpen(int i) {
			return getToken(SMTLIBv2StringsParser.ParOpen, i);
		}
		public Cmd_checkSatContext cmd_checkSat() {
			return getRuleContext(Cmd_checkSatContext.class,0);
		}
		public List<TerminalNode> ParClose() { return getTokens(SMTLIBv2StringsParser.ParClose); }
		public TerminalNode ParClose(int i) {
			return getToken(SMTLIBv2StringsParser.ParClose, i);
		}
		public Cmd_getModelContext cmd_getModel() {
			return getRuleContext(Cmd_getModelContext.class,0);
		}
		public Cmd_getValueContext cmd_getValue() {
			return getRuleContext(Cmd_getValueContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(SMTLIBv2StringsParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(SMTLIBv2StringsParser.VAR, i);
		}
		public Cmd_declareFunContext cmd_declareFun() {
			return getRuleContext(Cmd_declareFunContext.class,0);
		}
		public Cmd_declareConstContext cmd_declareConst() {
			return getRuleContext(Cmd_declareConstContext.class,0);
		}
		public Cmd_exitContext cmd_exit() {
			return getRuleContext(Cmd_exitContext.class,0);
		}
		public Cmd_setInfoContext cmd_setInfo() {
			return getRuleContext(Cmd_setInfoContext.class,0);
		}
		public Cmd_setLogicContext cmd_setLogic() {
			return getRuleContext(Cmd_setLogicContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_command);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ParOpen);
				setState(80);
				cmd_checkSat();
				setState(81);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(ParOpen);
				setState(84);
				cmd_getModel();
				setState(85);
				match(ParClose);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(ParOpen);
				setState(88);
				cmd_getValue();
				setState(89);
				match(ParOpen);
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					match(VAR);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VAR );
				setState(95);
				match(ParClose);
				setState(96);
				match(ParClose);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(ParOpen);
				setState(99);
				cmd_declareFun();
				setState(100);
				match(ParClose);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(ParOpen);
				setState(103);
				cmd_declareConst();
				setState(104);
				match(ParClose);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(ParOpen);
				setState(107);
				cmd_exit();
				setState(108);
				match(ParClose);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				match(ParOpen);
				setState(111);
				cmd_setInfo();
				setState(112);
				match(ParClose);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(114);
				match(ParOpen);
				setState(115);
				cmd_setLogic();
				setState(116);
				match(ParClose);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfoContext extends ParserRuleContext {
		public TerminalNode Info() { return getToken(SMTLIBv2StringsParser.Info, 0); }
		public TerminalNode String() { return getToken(SMTLIBv2StringsParser.String, 0); }
		public TerminalNode VAR() { return getToken(SMTLIBv2StringsParser.VAR, 0); }
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitInfo(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 219902325555200L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringTheoryContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2StringsParser.ParOpen, 0); }
		public TerminalNode Assert() { return getToken(SMTLIBv2StringsParser.Assert, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2StringsParser.ParClose, 0); }
		public StringTheoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringTheory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterStringTheory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitStringTheory(this);
		}
	}

	public final StringTheoryContext stringTheory() throws RecognitionException {
		StringTheoryContext _localctx = new StringTheoryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringTheory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ParOpen);
			setState(123);
			match(Assert);
			setState(124);
			expr();
			setState(125);
			match(ParClose);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> ParOpen() { return getTokens(SMTLIBv2StringsParser.ParOpen); }
		public TerminalNode ParOpen(int i) {
			return getToken(SMTLIBv2StringsParser.ParOpen, i);
		}
		public TerminalNode Let() { return getToken(SMTLIBv2StringsParser.Let, 0); }
		public TerminalNode VAR() { return getToken(SMTLIBv2StringsParser.VAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ParClose() { return getTokens(SMTLIBv2StringsParser.ParClose); }
		public TerminalNode ParClose(int i) {
			return getToken(SMTLIBv2StringsParser.ParClose, i);
		}
		public TerminalNode And() { return getToken(SMTLIBv2StringsParser.And, 0); }
		public TerminalNode Not() { return getToken(SMTLIBv2StringsParser.Not, 0); }
		public TerminalNode Equals() { return getToken(SMTLIBv2StringsParser.Equals, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode Or() { return getToken(SMTLIBv2StringsParser.Or, 0); }
		public FunStringContext funString() {
			return getRuleContext(FunStringContext.class,0);
		}
		public FunRegLanContext funRegLan() {
			return getRuleContext(FunRegLanContext.class,0);
		}
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(ParOpen);
				setState(128);
				match(Let);
				setState(129);
				match(ParOpen);
				setState(130);
				match(ParOpen);
				setState(131);
				match(VAR);
				setState(132);
				expr();
				setState(133);
				match(ParClose);
				setState(134);
				match(ParClose);
				setState(135);
				expr();
				setState(136);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(ParOpen);
				setState(139);
				match(And);
				setState(140);
				expr();
				setState(141);
				expr();
				setState(142);
				match(ParClose);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(ParOpen);
				setState(145);
				match(Not);
				setState(146);
				expr();
				setState(147);
				match(ParClose);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(ParOpen);
				setState(150);
				match(Equals);
				setState(151);
				expr();
				setState(152);
				expr();
				setState(153);
				match(ParClose);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(ParOpen);
				setState(156);
				match(Equals);
				setState(157);
				string();
				setState(158);
				expr();
				setState(159);
				match(ParClose);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(ParOpen);
				setState(162);
				match(Equals);
				setState(163);
				expr();
				setState(164);
				string();
				setState(165);
				match(ParClose);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				match(ParOpen);
				setState(168);
				match(Equals);
				setState(169);
				string();
				setState(170);
				string();
				setState(171);
				match(ParClose);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				match(ParOpen);
				setState(174);
				match(Or);
				setState(175);
				expr();
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					expr();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(181);
				match(ParClose);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(183);
				match(ParOpen);
				setState(184);
				funString();
				setState(185);
				match(ParClose);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(187);
				match(ParOpen);
				setState(188);
				funRegLan();
				setState(189);
				match(ParClose);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
				match(ParOpen);
				setState(192);
				fun();
				setState(193);
				match(ParClose);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunStringContext extends ParserRuleContext {
		public TerminalNode StringConcat() { return getToken(SMTLIBv2StringsParser.StringConcat, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode StringReplace() { return getToken(SMTLIBv2StringsParser.StringReplace, 0); }
		public TerminalNode StringReplaceAll() { return getToken(SMTLIBv2StringsParser.StringReplaceAll, 0); }
		public TerminalNode StringReplaceRE() { return getToken(SMTLIBv2StringsParser.StringReplaceRE, 0); }
		public ReglanContext reglan() {
			return getRuleContext(ReglanContext.class,0);
		}
		public TerminalNode StringReplaceREAll() { return getToken(SMTLIBv2StringsParser.StringReplaceREAll, 0); }
		public TerminalNode StringAt() { return getToken(SMTLIBv2StringsParser.StringAt, 0); }
		public TerminalNode Int() { return getToken(SMTLIBv2StringsParser.Int, 0); }
		public FunStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterFunString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitFunString(this);
		}
	}

	public final FunStringContext funString() throws RecognitionException {
		FunStringContext _localctx = new FunStringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funString);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringConcat:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(StringConcat);
				setState(198);
				string();
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					string();
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 79164837199876L) != 0) );
				}
				break;
			case StringReplace:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(StringReplace);
				setState(205);
				string();
				setState(206);
				string();
				setState(207);
				string();
				}
				break;
			case StringReplaceAll:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(StringReplaceAll);
				setState(210);
				string();
				setState(211);
				string();
				setState(212);
				string();
				}
				break;
			case StringReplaceRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(StringReplaceRE);
				setState(215);
				string();
				setState(216);
				reglan();
				setState(217);
				string();
				}
				break;
			case StringReplaceREAll:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(StringReplaceREAll);
				setState(220);
				string();
				setState(221);
				reglan();
				setState(222);
				string();
				}
				break;
			case StringAt:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(StringAt);
				setState(225);
				string();
				setState(226);
				match(Int);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunRegLanContext extends ParserRuleContext {
		public TerminalNode REfromString() { return getToken(SMTLIBv2StringsParser.REfromString, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode REConcat() { return getToken(SMTLIBv2StringsParser.REConcat, 0); }
		public List<ReglanContext> reglan() {
			return getRuleContexts(ReglanContext.class);
		}
		public ReglanContext reglan(int i) {
			return getRuleContext(ReglanContext.class,i);
		}
		public TerminalNode REUnion() { return getToken(SMTLIBv2StringsParser.REUnion, 0); }
		public TerminalNode REInter() { return getToken(SMTLIBv2StringsParser.REInter, 0); }
		public TerminalNode REKleeneClose() { return getToken(SMTLIBv2StringsParser.REKleeneClose, 0); }
		public TerminalNode REComp() { return getToken(SMTLIBv2StringsParser.REComp, 0); }
		public TerminalNode REDiff() { return getToken(SMTLIBv2StringsParser.REDiff, 0); }
		public TerminalNode REKleenCross() { return getToken(SMTLIBv2StringsParser.REKleenCross, 0); }
		public TerminalNode REOpt() { return getToken(SMTLIBv2StringsParser.REOpt, 0); }
		public TerminalNode RERange() { return getToken(SMTLIBv2StringsParser.RERange, 0); }
		public TerminalNode ParOpen() { return getToken(SMTLIBv2StringsParser.ParOpen, 0); }
		public TerminalNode RELoop() { return getToken(SMTLIBv2StringsParser.RELoop, 0); }
		public List<TerminalNode> Int() { return getTokens(SMTLIBv2StringsParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(SMTLIBv2StringsParser.Int, i);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2StringsParser.ParClose, 0); }
		public FunRegLanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funRegLan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterFunRegLan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitFunRegLan(this);
		}
	}

	public final FunRegLanContext funRegLan() throws RecognitionException {
		FunRegLanContext _localctx = new FunRegLanContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funRegLan);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REfromString:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(REfromString);
				setState(231);
				string();
				}
				break;
			case REConcat:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(REConcat);
				setState(233);
				reglan();
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					reglan();
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74766790688772L) != 0) );
				}
				break;
			case REUnion:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(REUnion);
				setState(240);
				reglan();
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(241);
					reglan();
					}
					}
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74766790688772L) != 0) );
				}
				break;
			case REInter:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(REInter);
				setState(247);
				reglan();
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(248);
					reglan();
					}
					}
					setState(251); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74766790688772L) != 0) );
				}
				break;
			case REKleeneClose:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(REKleeneClose);
				setState(254);
				reglan();
				}
				break;
			case REComp:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(REComp);
				setState(256);
				reglan();
				}
				break;
			case REDiff:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(REDiff);
				setState(258);
				reglan();
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(259);
					reglan();
					}
					}
					setState(262); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74766790688772L) != 0) );
				}
				break;
			case REKleenCross:
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				match(REKleenCross);
				setState(265);
				reglan();
				}
				break;
			case REOpt:
				enterOuterAlt(_localctx, 9);
				{
				setState(266);
				match(REOpt);
				setState(267);
				reglan();
				}
				break;
			case RERange:
				enterOuterAlt(_localctx, 10);
				{
				setState(268);
				match(RERange);
				setState(269);
				string();
				setState(270);
				string();
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 11);
				{
				setState(272);
				match(ParOpen);
				setState(273);
				match(RELoop);
				setState(274);
				match(Int);
				setState(275);
				match(Int);
				setState(276);
				match(ParClose);
				setState(277);
				reglan();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SMTLIBv2StringsParser.LT, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode StrInRE() { return getToken(SMTLIBv2StringsParser.StrInRE, 0); }
		public ReglanContext reglan() {
			return getRuleContext(ReglanContext.class,0);
		}
		public TerminalNode LTE() { return getToken(SMTLIBv2StringsParser.LTE, 0); }
		public TerminalNode Prefix() { return getToken(SMTLIBv2StringsParser.Prefix, 0); }
		public TerminalNode Suffix() { return getToken(SMTLIBv2StringsParser.Suffix, 0); }
		public TerminalNode Contains() { return getToken(SMTLIBv2StringsParser.Contains, 0); }
		public TerminalNode VAR() { return getToken(SMTLIBv2StringsParser.VAR, 0); }
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitFun(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fun);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(LT);
				setState(281);
				string();
				setState(282);
				string();
				}
				break;
			case StrInRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(StrInRE);
				setState(285);
				string();
				setState(286);
				reglan();
				}
				break;
			case LTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(LTE);
				setState(289);
				string();
				setState(290);
				string();
				}
				break;
			case Prefix:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(Prefix);
				setState(293);
				string();
				setState(294);
				string();
				}
				break;
			case Suffix:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(Suffix);
				setState(297);
				string();
				setState(298);
				string();
				}
				break;
			case Contains:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				match(Contains);
				setState(301);
				string();
				setState(302);
				string();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(SMTLIBv2StringsParser.String, 0); }
		public TerminalNode VAR() { return getToken(SMTLIBv2StringsParser.VAR, 0); }
		public TerminalNode ParOpen() { return getToken(SMTLIBv2StringsParser.ParOpen, 0); }
		public FunStringContext funString() {
			return getRuleContext(FunStringContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2StringsParser.ParClose, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(String);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(VAR);
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(ParOpen);
				setState(310);
				funString();
				setState(311);
				match(ParClose);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReglanContext extends ParserRuleContext {
		public TerminalNode REConst() { return getToken(SMTLIBv2StringsParser.REConst, 0); }
		public TerminalNode ParOpen() { return getToken(SMTLIBv2StringsParser.ParOpen, 0); }
		public FunRegLanContext funRegLan() {
			return getRuleContext(FunRegLanContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2StringsParser.ParClose, 0); }
		public TerminalNode VAR() { return getToken(SMTLIBv2StringsParser.VAR, 0); }
		public ReglanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reglan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).enterReglan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2StringsListener ) ((SMTLIBv2StringsListener)listener).exitReglan(this);
		}
	}

	public final ReglanContext reglan() throws RecognitionException {
		ReglanContext _localctx = new ReglanContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_reglan);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REConst:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(REConst);
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(ParOpen);
				setState(317);
				funRegLan();
				setState(318);
				match(ParClose);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u0144\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0004\u0000+\b\u0000\u000b"+
		"\u0000\f\u0000,\u0001\u0000\u0004\u00000\b\u0000\u000b\u0000\f\u00001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007I\b\u0007\u000b\u0007"+
		"\f\u0007J\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\\\b"+
		"\t\u000b\t\f\t]\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tw\b"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00b2\b\f\u000b"+
		"\f\f\f\u00b3\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c4\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0004\r\u00c9\b\r\u000b\r\f\r\u00ca\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e5\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00ec\b\u000e\u000b"+
		"\u000e\f\u000e\u00ed\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00f3"+
		"\b\u000e\u000b\u000e\f\u000e\u00f4\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u00fa\b\u000e\u000b\u000e\f\u000e\u00fb\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u0105\b\u000e\u000b\u000e\f\u000e\u0106\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0117\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0132\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u013a\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0142\b\u0011\u0001\u0011\u0000\u0000\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\u0001\u0002\u0000++./\u0166\u0000%\u0001\u0000\u0000\u0000"+
		"\u00023\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u00067"+
		"\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000"+
		"\u0000\fC\u0001\u0000\u0000\u0000\u000eE\u0001\u0000\u0000\u0000\u0010"+
		"L\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000\u0000\u0014x\u0001"+
		"\u0000\u0000\u0000\u0016z\u0001\u0000\u0000\u0000\u0018\u00c3\u0001\u0000"+
		"\u0000\u0000\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u0116\u0001\u0000"+
		"\u0000\u0000\u001e\u0131\u0001\u0000\u0000\u0000 \u0139\u0001\u0000\u0000"+
		"\u0000\"\u0141\u0001\u0000\u0000\u0000$&\u0003\u0012\t\u0000%$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'("+
		"\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)+\u0003\u0016\u000b"+
		"\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.0\u0003"+
		"\u0012\t\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0001\u0001\u0000\u0000"+
		"\u000034\u0005\u0004\u0000\u00004\u0003\u0001\u0000\u0000\u000056\u0005"+
		"\t\u0000\u00006\u0005\u0001\u0000\u0000\u000078\u0005\n\u0000\u00008\u0007"+
		"\u0001\u0000\u0000\u00009:\u0005\u0005\u0000\u0000:;\u0005.\u0000\u0000"+
		";<\u0005\u0002\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0005-\u0000\u0000"+
		">\t\u0001\u0000\u0000\u0000?@\u0005\u0006\u0000\u0000@A\u0005.\u0000\u0000"+
		"AB\u0005-\u0000\u0000B\u000b\u0001\u0000\u0000\u0000CD\u0005\u000b\u0000"+
		"\u0000D\r\u0001\u0000\u0000\u0000EF\u0005\u0007\u0000\u0000FH\u00050\u0000"+
		"\u0000GI\u0003\u0014\n\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u000f\u0001"+
		"\u0000\u0000\u0000LM\u0005\b\u0000\u0000MN\u0003\u0014\n\u0000N\u0011"+
		"\u0001\u0000\u0000\u0000OP\u0005\u0002\u0000\u0000PQ\u0003\u0002\u0001"+
		"\u0000QR\u0005\u0003\u0000\u0000Rw\u0001\u0000\u0000\u0000ST\u0005\u0002"+
		"\u0000\u0000TU\u0003\u0004\u0002\u0000UV\u0005\u0003\u0000\u0000Vw\u0001"+
		"\u0000\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u0003\u0006\u0003\u0000"+
		"Y[\u0005\u0002\u0000\u0000Z\\\u0005.\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0005\u0003"+
		"\u0000\u0000aw\u0001\u0000\u0000\u0000bc\u0005\u0002\u0000\u0000cd\u0003"+
		"\b\u0004\u0000de\u0005\u0003\u0000\u0000ew\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0002\u0000\u0000gh\u0003\n\u0005\u0000hi\u0005\u0003\u0000\u0000iw\u0001"+
		"\u0000\u0000\u0000jk\u0005\u0002\u0000\u0000kl\u0003\f\u0006\u0000lm\u0005"+
		"\u0003\u0000\u0000mw\u0001\u0000\u0000\u0000no\u0005\u0002\u0000\u0000"+
		"op\u0003\u000e\u0007\u0000pq\u0005\u0003\u0000\u0000qw\u0001\u0000\u0000"+
		"\u0000rs\u0005\u0002\u0000\u0000st\u0003\u0010\b\u0000tu\u0005\u0003\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vO\u0001\u0000\u0000\u0000vS\u0001\u0000"+
		"\u0000\u0000vW\u0001\u0000\u0000\u0000vb\u0001\u0000\u0000\u0000vf\u0001"+
		"\u0000\u0000\u0000vj\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000"+
		"vr\u0001\u0000\u0000\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0007\u0000"+
		"\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0005\u0002\u0000\u0000"+
		"{|\u0005\f\u0000\u0000|}\u0003\u0018\f\u0000}~\u0005\u0003\u0000\u0000"+
		"~\u0017\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0002\u0000\u0000\u0080"+
		"\u0081\u0005\r\u0000\u0000\u0081\u0082\u0005\u0002\u0000\u0000\u0082\u0083"+
		"\u0005\u0002\u0000\u0000\u0083\u0084\u0005.\u0000\u0000\u0084\u0085\u0003"+
		"\u0018\f\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u0005\u0003"+
		"\u0000\u0000\u0087\u0088\u0003\u0018\f\u0000\u0088\u0089\u0005\u0003\u0000"+
		"\u0000\u0089\u00c4\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0002\u0000"+
		"\u0000\u008b\u008c\u0005\u000e\u0000\u0000\u008c\u008d\u0003\u0018\f\u0000"+
		"\u008d\u008e\u0003\u0018\f\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f"+
		"\u00c4\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0002\u0000\u0000\u0091"+
		"\u0092\u0005\u000f\u0000\u0000\u0092\u0093\u0003\u0018\f\u0000\u0093\u0094"+
		"\u0005\u0003\u0000\u0000\u0094\u00c4\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\u0002\u0000\u0000\u0096\u0097\u0005\u0010\u0000\u0000\u0097\u0098"+
		"\u0003\u0018\f\u0000\u0098\u0099\u0003\u0018\f\u0000\u0099\u009a\u0005"+
		"\u0003\u0000\u0000\u009a\u00c4\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u0002\u0000\u0000\u009c\u009d\u0005\u0010\u0000\u0000\u009d\u009e\u0003"+
		" \u0010\u0000\u009e\u009f\u0003\u0018\f\u0000\u009f\u00a0\u0005\u0003"+
		"\u0000\u0000\u00a0\u00c4\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0002"+
		"\u0000\u0000\u00a2\u00a3\u0005\u0010\u0000\u0000\u00a3\u00a4\u0003\u0018"+
		"\f\u0000\u00a4\u00a5\u0003 \u0010\u0000\u00a5\u00a6\u0005\u0003\u0000"+
		"\u0000\u00a6\u00c4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0002\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9\u00aa\u0003 \u0010\u0000"+
		"\u00aa\u00ab\u0003 \u0010\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac"+
		"\u00c4\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0002\u0000\u0000\u00ae"+
		"\u00af\u0005\u0011\u0000\u0000\u00af\u00b1\u0003\u0018\f\u0000\u00b0\u00b2"+
		"\u0003\u0018\f\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0003\u0000\u0000\u00b6\u00c4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0002\u0000\u0000\u00b8\u00b9\u0003\u001a\r\u0000\u00b9\u00ba\u0005\u0003"+
		"\u0000\u0000\u00ba\u00c4\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0002"+
		"\u0000\u0000\u00bc\u00bd\u0003\u001c\u000e\u0000\u00bd\u00be\u0005\u0003"+
		"\u0000\u0000\u00be\u00c4\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0002"+
		"\u0000\u0000\u00c0\u00c1\u0003\u001e\u000f\u0000\u00c1\u00c2\u0005\u0003"+
		"\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u007f\u0001\u0000"+
		"\u0000\u0000\u00c3\u008a\u0001\u0000\u0000\u0000\u00c3\u0090\u0001\u0000"+
		"\u0000\u0000\u00c3\u0095\u0001\u0000\u0000\u0000\u00c3\u009b\u0001\u0000"+
		"\u0000\u0000\u00c3\u00a1\u0001\u0000\u0000\u0000\u00c3\u00a7\u0001\u0000"+
		"\u0000\u0000\u00c3\u00ad\u0001\u0000\u0000\u0000\u00c3\u00b7\u0001\u0000"+
		"\u0000\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c4\u0019\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0018"+
		"\u0000\u0000\u00c6\u00c8\u0003 \u0010\u0000\u00c7\u00c9\u0003 \u0010\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00e5\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0019\u0000\u0000"+
		"\u00cd\u00ce\u0003 \u0010\u0000\u00ce\u00cf\u0003 \u0010\u0000\u00cf\u00d0"+
		"\u0003 \u0010\u0000\u00d0\u00e5\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u001a\u0000\u0000\u00d2\u00d3\u0003 \u0010\u0000\u00d3\u00d4\u0003 \u0010"+
		"\u0000\u00d4\u00d5\u0003 \u0010\u0000\u00d5\u00e5\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005\u001b\u0000\u0000\u00d7\u00d8\u0003 \u0010\u0000\u00d8"+
		"\u00d9\u0003\"\u0011\u0000\u00d9\u00da\u0003 \u0010\u0000\u00da\u00e5"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001c\u0000\u0000\u00dc\u00dd"+
		"\u0003 \u0010\u0000\u00dd\u00de\u0003\"\u0011\u0000\u00de\u00df\u0003"+
		" \u0010\u0000\u00df\u00e5\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u001d"+
		"\u0000\u0000\u00e1\u00e2\u0003 \u0010\u0000\u00e2\u00e3\u0005,\u0000\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00e4\u00cc\u0001\u0000\u0000\u0000\u00e4\u00d1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00d6\u0001\u0000\u0000\u0000\u00e4\u00db\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e0\u0001\u0000\u0000\u0000\u00e5\u001b\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\u001e\u0000\u0000\u00e7\u0117\u0003 \u0010\u0000\u00e8"+
		"\u00e9\u0005\u001f\u0000\u0000\u00e9\u00eb\u0003\"\u0011\u0000\u00ea\u00ec"+
		"\u0003\"\u0011\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u0117\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		" \u0000\u0000\u00f0\u00f2\u0003\"\u0011\u0000\u00f1\u00f3\u0003\"\u0011"+
		"\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\u0117\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005!\u0000\u0000"+
		"\u00f7\u00f9\u0003\"\u0011\u0000\u00f8\u00fa\u0003\"\u0011\u0000\u00f9"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u0117\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\"\u0000\u0000\u00fe\u0117"+
		"\u0003\"\u0011\u0000\u00ff\u0100\u0005#\u0000\u0000\u0100\u0117\u0003"+
		"\"\u0011\u0000\u0101\u0102\u0005$\u0000\u0000\u0102\u0104\u0003\"\u0011"+
		"\u0000\u0103\u0105\u0003\"\u0011\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0117\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005%\u0000\u0000\u0109\u0117\u0003\"\u0011\u0000\u010a"+
		"\u010b\u0005&\u0000\u0000\u010b\u0117\u0003\"\u0011\u0000\u010c\u010d"+
		"\u0005\'\u0000\u0000\u010d\u010e\u0003 \u0010\u0000\u010e\u010f\u0003"+
		" \u0010\u0000\u010f\u0117\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0002"+
		"\u0000\u0000\u0111\u0112\u0005)\u0000\u0000\u0112\u0113\u0005,\u0000\u0000"+
		"\u0113\u0114\u0005,\u0000\u0000\u0114\u0115\u0005\u0003\u0000\u0000\u0115"+
		"\u0117\u0003\"\u0011\u0000\u0116\u00e6\u0001\u0000\u0000\u0000\u0116\u00e8"+
		"\u0001\u0000\u0000\u0000\u0116\u00ef\u0001\u0000\u0000\u0000\u0116\u00f6"+
		"\u0001\u0000\u0000\u0000\u0116\u00fd\u0001\u0000\u0000\u0000\u0116\u00ff"+
		"\u0001\u0000\u0000\u0000\u0116\u0101\u0001\u0000\u0000\u0000\u0116\u0108"+
		"\u0001\u0000\u0000\u0000\u0116\u010a\u0001\u0000\u0000\u0000\u0116\u010c"+
		"\u0001\u0000\u0000\u0000\u0116\u0110\u0001\u0000\u0000\u0000\u0117\u001d"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0012\u0000\u0000\u0119\u011a"+
		"\u0003 \u0010\u0000\u011a\u011b\u0003 \u0010\u0000\u011b\u0132\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005\u0013\u0000\u0000\u011d\u011e\u0003 \u0010"+
		"\u0000\u011e\u011f\u0003\"\u0011\u0000\u011f\u0132\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0005\u0014\u0000\u0000\u0121\u0122\u0003 \u0010\u0000\u0122"+
		"\u0123\u0003 \u0010\u0000\u0123\u0132\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0005\u0015\u0000\u0000\u0125\u0126\u0003 \u0010\u0000\u0126\u0127\u0003"+
		" \u0010\u0000\u0127\u0132\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0016"+
		"\u0000\u0000\u0129\u012a\u0003 \u0010\u0000\u012a\u012b\u0003 \u0010\u0000"+
		"\u012b\u0132\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0017\u0000\u0000"+
		"\u012d\u012e\u0003 \u0010\u0000\u012e\u012f\u0003 \u0010\u0000\u012f\u0132"+
		"\u0001\u0000\u0000\u0000\u0130\u0132\u0005.\u0000\u0000\u0131\u0118\u0001"+
		"\u0000\u0000\u0000\u0131\u011c\u0001\u0000\u0000\u0000\u0131\u0120\u0001"+
		"\u0000\u0000\u0000\u0131\u0124\u0001\u0000\u0000\u0000\u0131\u0128\u0001"+
		"\u0000\u0000\u0000\u0131\u012c\u0001\u0000\u0000\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u001f\u0001\u0000\u0000\u0000\u0133\u013a\u0005"+
		"+\u0000\u0000\u0134\u013a\u0005.\u0000\u0000\u0135\u0136\u0005\u0002\u0000"+
		"\u0000\u0136\u0137\u0003\u001a\r\u0000\u0137\u0138\u0005\u0003\u0000\u0000"+
		"\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0133\u0001\u0000\u0000\u0000"+
		"\u0139\u0134\u0001\u0000\u0000\u0000\u0139\u0135\u0001\u0000\u0000\u0000"+
		"\u013a!\u0001\u0000\u0000\u0000\u013b\u0142\u0005*\u0000\u0000\u013c\u013d"+
		"\u0005\u0002\u0000\u0000\u013d\u013e\u0003\u001c\u000e\u0000\u013e\u013f"+
		"\u0005\u0003\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u0142"+
		"\u0005.\u0000\u0000\u0141\u013b\u0001\u0000\u0000\u0000\u0141\u013c\u0001"+
		"\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142#\u0001\u0000"+
		"\u0000\u0000\u0012\',1J]v\u00b3\u00c3\u00ca\u00e4\u00ed\u00f4\u00fb\u0106"+
		"\u0116\u0131\u0139\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}