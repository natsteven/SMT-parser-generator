package edu.boisestate.cs.antlrTools;
// Generated from SMTLIBv2Strings.g4 by ANTLR 4.13.0
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
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ParOpen=1, ParClose=2, CMD_checksat=3, CMD_declarefun=4, CMD_declareconst=5, 
		CMD_setinfo=6, CMD_setlogic=7, CMD_exit=8, Assert=9, Let=10, And=11, Not=12, 
		Equals=13, Or=14, LT=15, StrInRE=16, LTE=17, Prefix=18, Suffix=19, StringConcat=20, 
		StringReplace=21, StringReplaceAll=22, StringReplaceRE=23, StringReplaceREAll=24, 
		REfromString=25, REConcat=26, REUnion=27, REInter=28, REKleeneClose=29, 
		REComp=30, REDiff=31, REKleenCross=32, REOpt=33, RERange=34, REIndex=35, 
		RELoop=36, REConst=37, String=38, Int=39, SymbolicType=40, VAR=41, Info=42, 
		InfoKW=43, WS=44;
	public static final int
		RULE_script = 0, RULE_cmd_checkSat = 1, RULE_cmd_declareFun = 2, RULE_cmd_declareConst = 3, 
		RULE_cmd_exit = 4, RULE_cmd_setInfo = 5, RULE_cmd_setLogic = 6, RULE_command = 7, 
		RULE_info = 8, RULE_stringTheory = 9, RULE_expr = 10, RULE_funString = 11, 
		RULE_funRegLan = 12, RULE_fun = 13, RULE_string = 14, RULE_reglan = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "cmd_checkSat", "cmd_declareFun", "cmd_declareConst", "cmd_exit", 
			"cmd_setInfo", "cmd_setLogic", "command", "info", "stringTheory", "expr", 
			"funString", "funRegLan", "fun", "string", "reglan"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'check-sat'", "'declare-fun'", "'declare-const'", 
			"'set-info'", "'set-logic'", "'exit'", "'assert'", "'let'", "'and'", 
			"'not'", "'='", "'or'", "'str.<'", "'str.in_re'", "'str.<='", "'str.prefixof'", 
			"'str.suffixof'", "'str.++'", "'str.replace'", "'str.replace_all'", "'str.replace_re'", 
			"'str.replace_re_all'", "'str.to_re'", "'re.++'", "'re.union'", "'re.inter'", 
			"'re.*'", "'re.comp'", "'re.diff'", "'re.+'", "'re.opt'", "'re.range'", 
			"'_ re.^'", "'_ re.loop'", null, null, null, "'String'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ParOpen", "ParClose", "CMD_checksat", "CMD_declarefun", "CMD_declareconst", 
			"CMD_setinfo", "CMD_setlogic", "CMD_exit", "Assert", "Let", "And", "Not", 
			"Equals", "Or", "LT", "StrInRE", "LTE", "Prefix", "Suffix", "StringConcat", 
			"StringReplace", "StringReplaceAll", "StringReplaceRE", "StringReplaceREAll", 
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
			setState(33); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(32);
					command();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(38); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37);
					stringTheory();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				command();
				}
				}
				setState(45); 
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
			setState(47);
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
		enterRule(_localctx, 4, RULE_cmd_declareFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(CMD_declarefun);
			setState(50);
			match(VAR);
			setState(51);
			match(ParOpen);
			setState(52);
			match(ParClose);
			setState(53);
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
		enterRule(_localctx, 6, RULE_cmd_declareConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CMD_declareconst);
			setState(56);
			match(VAR);
			setState(57);
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
		enterRule(_localctx, 8, RULE_cmd_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		enterRule(_localctx, 10, RULE_cmd_setInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(CMD_setinfo);
			setState(62);
			match(InfoKW);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				info();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6871947673600L) != 0) );
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
		enterRule(_localctx, 12, RULE_cmd_setLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(CMD_setlogic);
			setState(69);
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
		public TerminalNode ParOpen() { return getToken(SMTLIBv2StringsParser.ParOpen, 0); }
		public Cmd_checkSatContext cmd_checkSat() {
			return getRuleContext(Cmd_checkSatContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2StringsParser.ParClose, 0); }
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
		enterRule(_localctx, 14, RULE_command);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(ParOpen);
				setState(72);
				cmd_checkSat();
				setState(73);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ParOpen);
				setState(76);
				cmd_declareFun();
				setState(77);
				match(ParClose);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(ParOpen);
				setState(80);
				cmd_declareConst();
				setState(81);
				match(ParClose);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(ParOpen);
				setState(84);
				cmd_exit();
				setState(85);
				match(ParClose);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(ParOpen);
				setState(88);
				cmd_setInfo();
				setState(89);
				match(ParClose);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(ParOpen);
				setState(92);
				cmd_setLogic();
				setState(93);
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
		enterRule(_localctx, 16, RULE_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6871947673600L) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_stringTheory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ParOpen);
			setState(100);
			match(Assert);
			setState(101);
			expr();
			setState(102);
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
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(ParOpen);
				setState(105);
				match(Let);
				setState(106);
				match(ParOpen);
				setState(107);
				match(ParOpen);
				setState(108);
				match(VAR);
				setState(109);
				expr();
				setState(110);
				match(ParClose);
				setState(111);
				match(ParClose);
				setState(112);
				expr();
				setState(113);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(ParOpen);
				setState(116);
				match(And);
				setState(117);
				expr();
				setState(118);
				expr();
				setState(119);
				match(ParClose);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(ParOpen);
				setState(122);
				match(Not);
				setState(123);
				expr();
				setState(124);
				match(ParClose);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(ParOpen);
				setState(127);
				match(Equals);
				setState(128);
				expr();
				setState(129);
				expr();
				setState(130);
				match(ParClose);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(ParOpen);
				setState(133);
				match(Equals);
				setState(134);
				string();
				setState(135);
				expr();
				setState(136);
				match(ParClose);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(ParOpen);
				setState(139);
				match(Equals);
				setState(140);
				expr();
				setState(141);
				string();
				setState(142);
				match(ParClose);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				match(ParOpen);
				setState(145);
				match(Equals);
				setState(146);
				string();
				setState(147);
				string();
				setState(148);
				match(ParClose);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				match(ParOpen);
				setState(151);
				match(Or);
				setState(152);
				expr();
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					expr();
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(158);
				match(ParClose);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				match(ParOpen);
				setState(161);
				funString();
				setState(162);
				match(ParClose);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				match(ParOpen);
				setState(165);
				funRegLan();
				setState(166);
				match(ParClose);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(168);
				match(ParOpen);
				setState(169);
				fun();
				setState(170);
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
		enterRule(_localctx, 22, RULE_funString);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringConcat:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(StringConcat);
				setState(175);
				string();
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					string();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2473901162498L) != 0) );
				}
				break;
			case StringReplace:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(StringReplace);
				setState(182);
				string();
				setState(183);
				string();
				setState(184);
				string();
				}
				break;
			case StringReplaceAll:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(StringReplaceAll);
				setState(187);
				string();
				setState(188);
				string();
				setState(189);
				string();
				}
				break;
			case StringReplaceRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(StringReplaceRE);
				setState(192);
				string();
				setState(193);
				reglan();
				setState(194);
				string();
				}
				break;
			case StringReplaceREAll:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(StringReplaceREAll);
				setState(197);
				string();
				setState(198);
				reglan();
				setState(199);
				string();
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
		enterRule(_localctx, 24, RULE_funRegLan);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REfromString:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(REfromString);
				setState(204);
				string();
				}
				break;
			case REConcat:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(REConcat);
				setState(206);
				reglan();
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					reglan();
					}
					}
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2336462209026L) != 0) );
				}
				break;
			case REUnion:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(REUnion);
				setState(213);
				reglan();
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					reglan();
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2336462209026L) != 0) );
				}
				break;
			case REInter:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(REInter);
				setState(220);
				reglan();
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					reglan();
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2336462209026L) != 0) );
				}
				break;
			case REKleeneClose:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(REKleeneClose);
				setState(227);
				reglan();
				}
				break;
			case REComp:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				match(REComp);
				setState(229);
				reglan();
				}
				break;
			case REDiff:
				enterOuterAlt(_localctx, 7);
				{
				setState(230);
				match(REDiff);
				setState(231);
				reglan();
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					reglan();
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2336462209026L) != 0) );
				}
				break;
			case REKleenCross:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(REKleenCross);
				setState(238);
				reglan();
				}
				break;
			case REOpt:
				enterOuterAlt(_localctx, 9);
				{
				setState(239);
				match(REOpt);
				setState(240);
				reglan();
				}
				break;
			case RERange:
				enterOuterAlt(_localctx, 10);
				{
				setState(241);
				match(RERange);
				setState(242);
				string();
				setState(243);
				string();
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 11);
				{
				setState(245);
				match(ParOpen);
				setState(246);
				match(RELoop);
				setState(247);
				match(Int);
				setState(248);
				match(Int);
				setState(249);
				match(ParClose);
				setState(250);
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
		enterRule(_localctx, 26, RULE_fun);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(LT);
				setState(254);
				string();
				setState(255);
				string();
				}
				break;
			case StrInRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(StrInRE);
				setState(258);
				string();
				setState(259);
				reglan();
				}
				break;
			case LTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(LTE);
				setState(262);
				string();
				setState(263);
				string();
				}
				break;
			case Prefix:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(Prefix);
				setState(266);
				string();
				setState(267);
				string();
				}
				break;
			case Suffix:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
				match(Suffix);
				setState(270);
				string();
				setState(271);
				string();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
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
		enterRule(_localctx, 28, RULE_string);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(String);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(VAR);
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(ParOpen);
				setState(279);
				funString();
				setState(280);
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
		enterRule(_localctx, 30, RULE_reglan);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REConst:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(REConst);
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(ParOpen);
				setState(286);
				funRegLan();
				setState(287);
				match(ParClose);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
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
		"\u0004\u0001,\u0125\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0000\u0004"+
		"\u0000\'\b\u0000\u000b\u0000\f\u0000(\u0001\u0000\u0004\u0000,\b\u0000"+
		"\u000b\u0000\f\u0000-\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005A\b\u0005\u000b\u0005\f\u0005B\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007`\b\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004"+
		"\n\u009b\b\n\u000b\n\f\n\u009c\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00ad\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00b2"+
		"\b\u000b\u000b\u000b\f\u000b\u00b3\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00ca\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00d1\b"+
		"\f\u000b\f\f\f\u00d2\u0001\f\u0001\f\u0001\f\u0004\f\u00d8\b\f\u000b\f"+
		"\f\f\u00d9\u0001\f\u0001\f\u0001\f\u0004\f\u00df\b\f\u000b\f\f\f\u00e0"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00ea"+
		"\b\f\u000b\f\f\f\u00eb\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00fc\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0113\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u011b"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0123\b\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		"\u0000\u0001\u0002\u0000&&)*\u0144\u0000!\u0001\u0000\u0000\u0000\u0002"+
		"/\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u00067\u0001"+
		"\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000\u0000"+
		"\fD\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010a\u0001"+
		"\u0000\u0000\u0000\u0012c\u0001\u0000\u0000\u0000\u0014\u00ac\u0001\u0000"+
		"\u0000\u0000\u0016\u00c9\u0001\u0000\u0000\u0000\u0018\u00fb\u0001\u0000"+
		"\u0000\u0000\u001a\u0112\u0001\u0000\u0000\u0000\u001c\u011a\u0001\u0000"+
		"\u0000\u0000\u001e\u0122\u0001\u0000\u0000\u0000 \"\u0003\u000e\u0007"+
		"\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%\'\u0003"+
		"\u0012\t\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&"+
		"\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000"+
		"\u0000*,\u0003\u000e\u0007\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0001"+
		"\u0001\u0000\u0000\u0000/0\u0005\u0003\u0000\u00000\u0003\u0001\u0000"+
		"\u0000\u000012\u0005\u0004\u0000\u000023\u0005)\u0000\u000034\u0005\u0001"+
		"\u0000\u000045\u0005\u0002\u0000\u000056\u0005(\u0000\u00006\u0005\u0001"+
		"\u0000\u0000\u000078\u0005\u0005\u0000\u000089\u0005)\u0000\u00009:\u0005"+
		"(\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0005\b\u0000\u0000<\t"+
		"\u0001\u0000\u0000\u0000=>\u0005\u0006\u0000\u0000>@\u0005+\u0000\u0000"+
		"?A\u0003\u0010\b\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u000b\u0001\u0000"+
		"\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0003\u0010\b\u0000F\r\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0003\u0002\u0001\u0000"+
		"IJ\u0005\u0002\u0000\u0000J`\u0001\u0000\u0000\u0000KL\u0005\u0001\u0000"+
		"\u0000LM\u0003\u0004\u0002\u0000MN\u0005\u0002\u0000\u0000N`\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0001\u0000\u0000PQ\u0003\u0006\u0003\u0000QR\u0005"+
		"\u0002\u0000\u0000R`\u0001\u0000\u0000\u0000ST\u0005\u0001\u0000\u0000"+
		"TU\u0003\b\u0004\u0000UV\u0005\u0002\u0000\u0000V`\u0001\u0000\u0000\u0000"+
		"WX\u0005\u0001\u0000\u0000XY\u0003\n\u0005\u0000YZ\u0005\u0002\u0000\u0000"+
		"Z`\u0001\u0000\u0000\u0000[\\\u0005\u0001\u0000\u0000\\]\u0003\f\u0006"+
		"\u0000]^\u0005\u0002\u0000\u0000^`\u0001\u0000\u0000\u0000_G\u0001\u0000"+
		"\u0000\u0000_K\u0001\u0000\u0000\u0000_O\u0001\u0000\u0000\u0000_S\u0001"+
		"\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000"+
		"`\u000f\u0001\u0000\u0000\u0000ab\u0007\u0000\u0000\u0000b\u0011\u0001"+
		"\u0000\u0000\u0000cd\u0005\u0001\u0000\u0000de\u0005\t\u0000\u0000ef\u0003"+
		"\u0014\n\u0000fg\u0005\u0002\u0000\u0000g\u0013\u0001\u0000\u0000\u0000"+
		"hi\u0005\u0001\u0000\u0000ij\u0005\n\u0000\u0000jk\u0005\u0001\u0000\u0000"+
		"kl\u0005\u0001\u0000\u0000lm\u0005)\u0000\u0000mn\u0003\u0014\n\u0000"+
		"no\u0005\u0002\u0000\u0000op\u0005\u0002\u0000\u0000pq\u0003\u0014\n\u0000"+
		"qr\u0005\u0002\u0000\u0000r\u00ad\u0001\u0000\u0000\u0000st\u0005\u0001"+
		"\u0000\u0000tu\u0005\u000b\u0000\u0000uv\u0003\u0014\n\u0000vw\u0003\u0014"+
		"\n\u0000wx\u0005\u0002\u0000\u0000x\u00ad\u0001\u0000\u0000\u0000yz\u0005"+
		"\u0001\u0000\u0000z{\u0005\f\u0000\u0000{|\u0003\u0014\n\u0000|}\u0005"+
		"\u0002\u0000\u0000}\u00ad\u0001\u0000\u0000\u0000~\u007f\u0005\u0001\u0000"+
		"\u0000\u007f\u0080\u0005\r\u0000\u0000\u0080\u0081\u0003\u0014\n\u0000"+
		"\u0081\u0082\u0003\u0014\n\u0000\u0082\u0083\u0005\u0002\u0000\u0000\u0083"+
		"\u00ad\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085"+
		"\u0086\u0005\r\u0000\u0000\u0086\u0087\u0003\u001c\u000e\u0000\u0087\u0088"+
		"\u0003\u0014\n\u0000\u0088\u0089\u0005\u0002\u0000\u0000\u0089\u00ad\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u0001\u0000\u0000\u008b\u008c\u0005"+
		"\r\u0000\u0000\u008c\u008d\u0003\u0014\n\u0000\u008d\u008e\u0003\u001c"+
		"\u000e\u0000\u008e\u008f\u0005\u0002\u0000\u0000\u008f\u00ad\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0001\u0000\u0000\u0091\u0092\u0005\r\u0000"+
		"\u0000\u0092\u0093\u0003\u001c\u000e\u0000\u0093\u0094\u0003\u001c\u000e"+
		"\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u00ad\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u0098\u0005\u000e\u0000"+
		"\u0000\u0098\u009a\u0003\u0014\n\u0000\u0099\u009b\u0003\u0014\n\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0002\u0000\u0000"+
		"\u009f\u00ad\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0001\u0000\u0000"+
		"\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2\u00a3\u0005\u0002\u0000\u0000"+
		"\u00a3\u00ad\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0001\u0000\u0000"+
		"\u00a5\u00a6\u0003\u0018\f\u0000\u00a6\u00a7\u0005\u0002\u0000\u0000\u00a7"+
		"\u00ad\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0001\u0000\u0000\u00a9"+
		"\u00aa\u0003\u001a\r\u0000\u00aa\u00ab\u0005\u0002\u0000\u0000\u00ab\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ach\u0001\u0000\u0000\u0000\u00acs\u0001\u0000"+
		"\u0000\u0000\u00acy\u0001\u0000\u0000\u0000\u00ac~\u0001\u0000\u0000\u0000"+
		"\u00ac\u0084\u0001\u0000\u0000\u0000\u00ac\u008a\u0001\u0000\u0000\u0000"+
		"\u00ac\u0090\u0001\u0000\u0000\u0000\u00ac\u0096\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a0\u0001\u0000\u0000\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ad\u0015\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u0014\u0000\u0000\u00af\u00b1\u0003\u001c\u000e\u0000"+
		"\u00b0\u00b2\u0003\u001c\u000e\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00ca\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0015\u0000\u0000\u00b6\u00b7\u0003\u001c\u000e\u0000"+
		"\u00b7\u00b8\u0003\u001c\u000e\u0000\u00b8\u00b9\u0003\u001c\u000e\u0000"+
		"\u00b9\u00ca\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0016\u0000\u0000"+
		"\u00bb\u00bc\u0003\u001c\u000e\u0000\u00bc\u00bd\u0003\u001c\u000e\u0000"+
		"\u00bd\u00be\u0003\u001c\u000e\u0000\u00be\u00ca\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005\u0017\u0000\u0000\u00c0\u00c1\u0003\u001c\u000e\u0000"+
		"\u00c1\u00c2\u0003\u001e\u000f\u0000\u00c2\u00c3\u0003\u001c\u000e\u0000"+
		"\u00c3\u00ca\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0018\u0000\u0000"+
		"\u00c5\u00c6\u0003\u001c\u000e\u0000\u00c6\u00c7\u0003\u001e\u000f\u0000"+
		"\u00c7\u00c8\u0003\u001c\u000e\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ae\u0001\u0000\u0000\u0000\u00c9\u00b5\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ba\u0001\u0000\u0000\u0000\u00c9\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c4\u0001\u0000\u0000\u0000\u00ca\u0017\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0019\u0000\u0000\u00cc\u00fc\u0003\u001c\u000e\u0000"+
		"\u00cd\u00ce\u0005\u001a\u0000\u0000\u00ce\u00d0\u0003\u001e\u000f\u0000"+
		"\u00cf\u00d1\u0003\u001e\u000f\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00fc\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0005\u001b\u0000\u0000\u00d5\u00d7\u0003\u001e\u000f\u0000"+
		"\u00d6\u00d8\u0003\u001e\u000f\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00fc\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0005\u001c\u0000\u0000\u00dc\u00de\u0003\u001e\u000f\u0000"+
		"\u00dd\u00df\u0003\u001e\u000f\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00fc\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005\u001d\u0000\u0000\u00e3\u00fc\u0003\u001e\u000f\u0000"+
		"\u00e4\u00e5\u0005\u001e\u0000\u0000\u00e5\u00fc\u0003\u001e\u000f\u0000"+
		"\u00e6\u00e7\u0005\u001f\u0000\u0000\u00e7\u00e9\u0003\u001e\u000f\u0000"+
		"\u00e8\u00ea\u0003\u001e\u000f\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00fc\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0005 \u0000\u0000\u00ee\u00fc\u0003\u001e\u000f\u0000\u00ef"+
		"\u00f0\u0005!\u0000\u0000\u00f0\u00fc\u0003\u001e\u000f\u0000\u00f1\u00f2"+
		"\u0005\"\u0000\u0000\u00f2\u00f3\u0003\u001c\u000e\u0000\u00f3\u00f4\u0003"+
		"\u001c\u000e\u0000\u00f4\u00fc\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\u0001\u0000\u0000\u00f6\u00f7\u0005$\u0000\u0000\u00f7\u00f8\u0005\'"+
		"\u0000\u0000\u00f8\u00f9\u0005\'\u0000\u0000\u00f9\u00fa\u0005\u0002\u0000"+
		"\u0000\u00fa\u00fc\u0003\u001e\u000f\u0000\u00fb\u00cb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00cd\u0001\u0000\u0000\u0000\u00fb\u00d4\u0001\u0000\u0000"+
		"\u0000\u00fb\u00db\u0001\u0000\u0000\u0000\u00fb\u00e2\u0001\u0000\u0000"+
		"\u0000\u00fb\u00e4\u0001\u0000\u0000\u0000\u00fb\u00e6\u0001\u0000\u0000"+
		"\u0000\u00fb\u00ed\u0001\u0000\u0000\u0000\u00fb\u00ef\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f1\u0001\u0000\u0000\u0000\u00fb\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fc\u0019\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u000f\u0000"+
		"\u0000\u00fe\u00ff\u0003\u001c\u000e\u0000\u00ff\u0100\u0003\u001c\u000e"+
		"\u0000\u0100\u0113\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0010\u0000"+
		"\u0000\u0102\u0103\u0003\u001c\u000e\u0000\u0103\u0104\u0003\u001e\u000f"+
		"\u0000\u0104\u0113\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u0011\u0000"+
		"\u0000\u0106\u0107\u0003\u001c\u000e\u0000\u0107\u0108\u0003\u001c\u000e"+
		"\u0000\u0108\u0113\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0012\u0000"+
		"\u0000\u010a\u010b\u0003\u001c\u000e\u0000\u010b\u010c\u0003\u001c\u000e"+
		"\u0000\u010c\u0113\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0013\u0000"+
		"\u0000\u010e\u010f\u0003\u001c\u000e\u0000\u010f\u0110\u0003\u001c\u000e"+
		"\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u0113\u0005)\u0000\u0000"+
		"\u0112\u00fd\u0001\u0000\u0000\u0000\u0112\u0101\u0001\u0000\u0000\u0000"+
		"\u0112\u0105\u0001\u0000\u0000\u0000\u0112\u0109\u0001\u0000\u0000\u0000"+
		"\u0112\u010d\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u001b\u0001\u0000\u0000\u0000\u0114\u011b\u0005&\u0000\u0000\u0115"+
		"\u011b\u0005)\u0000\u0000\u0116\u0117\u0005\u0001\u0000\u0000\u0117\u0118"+
		"\u0003\u0016\u000b\u0000\u0118\u0119\u0005\u0002\u0000\u0000\u0119\u011b"+
		"\u0001\u0000\u0000\u0000\u011a\u0114\u0001\u0000\u0000\u0000\u011a\u0115"+
		"\u0001\u0000\u0000\u0000\u011a\u0116\u0001\u0000\u0000\u0000\u011b\u001d"+
		"\u0001\u0000\u0000\u0000\u011c\u0123\u0005%\u0000\u0000\u011d\u011e\u0005"+
		"\u0001\u0000\u0000\u011e\u011f\u0003\u0018\f\u0000\u011f\u0120\u0005\u0002"+
		"\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u0123\u0005)\u0000"+
		"\u0000\u0122\u011c\u0001\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u001f\u0001\u0000\u0000"+
		"\u0000\u0011#(-B_\u009c\u00ac\u00b3\u00c9\u00d2\u00d9\u00e0\u00eb\u00fb"+
		"\u0112\u011a\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}