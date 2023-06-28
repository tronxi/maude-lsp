package org.example.generated;// Generated from MaudeParser.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MaudeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEST_VARIANT=1, MREW_VARIANT=2, FILENAME=3, DIRECTORY=4, LS_FLAG=5, STRING_ID=6, 
		MOD_ID=7, VIEW_ID=8, PARAMETER_ID=9, SORT_ID=10, VAR_ID=11, VAR_AND_SORT_ID=12, 
		OP_ID=13, NAT=14, TOKEN=15, LABEL_ID=16, STRAT_ID=17, ATTRIBUTE_ID=18, 
		LCB=19, RCB=20, LSB=21, RSB=22, LP=23, RP=24, SUBSTITUION_SYMBOL=25, EMPTY_STRAT_CALL=26, 
		USING=27, COMMA=28;
	public static final int
		RULE_strat = 0, RULE_ruleApp = 1, RULE_substitution = 2, RULE_stratCall = 3, 
		RULE_varStratList = 4, RULE_opForm = 5, RULE_opFormPlus = 6, RULE_term = 7, 
		RULE_termPlus = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"strat", "ruleApp", "substitution", "stratCall", "varStratList", "opForm", 
			"opFormPlus", "term", "termPlus"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'filename'", "'directory'", "'ls_flag'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'{'", 
			"'}'", "'['", "']'", "'('", "')'", "'<-'", null, "'using'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEST_VARIANT", "MREW_VARIANT", "FILENAME", "DIRECTORY", "LS_FLAG", 
			"STRING_ID", "MOD_ID", "VIEW_ID", "PARAMETER_ID", "SORT_ID", "VAR_ID", 
			"VAR_AND_SORT_ID", "OP_ID", "NAT", "TOKEN", "LABEL_ID", "STRAT_ID", "ATTRIBUTE_ID", 
			"LCB", "RCB", "LSB", "RSB", "LP", "RP", "SUBSTITUION_SYMBOL", "EMPTY_STRAT_CALL", 
			"USING", "COMMA"
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
	public String getGrammarFileName() { return "MaudeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MaudeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StratContext extends ParserRuleContext {
		public StratContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterStrat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitStrat(this);
		}
	}

	public final StratContext strat() throws RecognitionException {
		StratContext _localctx = new StratContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_strat);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class RuleAppContext extends ParserRuleContext {
		public TerminalNode LABEL_ID() { return getToken(MaudeParser.LABEL_ID, 0); }
		public List<TerminalNode> LSB() { return getTokens(MaudeParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(MaudeParser.LSB, i);
		}
		public SubstitutionContext substitution() {
			return getRuleContext(SubstitutionContext.class,0);
		}
		public List<TerminalNode> RSB() { return getTokens(MaudeParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(MaudeParser.RSB, i);
		}
		public TerminalNode LCB() { return getToken(MaudeParser.LCB, 0); }
		public List<StratContext> strat() {
			return getRuleContexts(StratContext.class);
		}
		public StratContext strat(int i) {
			return getRuleContext(StratContext.class,i);
		}
		public TerminalNode RCB() { return getToken(MaudeParser.RCB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MaudeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MaudeParser.COMMA, i);
		}
		public RuleAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleApp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterRuleApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitRuleApp(this);
		}
	}

	public final RuleAppContext ruleApp() throws RecognitionException {
		RuleAppContext _localctx = new RuleAppContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleApp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(LABEL_ID);
			setState(21);
			match(LSB);
			setState(22);
			match(LSB);
			setState(23);
			substitution(0);
			setState(24);
			match(RSB);
			setState(25);
			match(RSB);
			setState(26);
			match(LSB);
			setState(27);
			match(LCB);
			setState(28);
			strat();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(29);
				match(COMMA);
				setState(30);
				strat();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(RCB);
			setState(37);
			match(RSB);
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
	public static class SubstitutionContext extends ParserRuleContext {
		public TerminalNode VAR_ID() { return getToken(MaudeParser.VAR_ID, 0); }
		public TerminalNode SUBSTITUION_SYMBOL() { return getToken(MaudeParser.SUBSTITUION_SYMBOL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<SubstitutionContext> substitution() {
			return getRuleContexts(SubstitutionContext.class);
		}
		public SubstitutionContext substitution(int i) {
			return getRuleContext(SubstitutionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(MaudeParser.COMMA, 0); }
		public SubstitutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substitution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterSubstitution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitSubstitution(this);
		}
	}

	public final SubstitutionContext substitution() throws RecognitionException {
		return substitution(0);
	}

	private SubstitutionContext substitution(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubstitutionContext _localctx = new SubstitutionContext(_ctx, _parentState);
		SubstitutionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_substitution, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(40);
			match(VAR_ID);
			setState(41);
			match(SUBSTITUION_SYMBOL);
			setState(42);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubstitutionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_substitution);
					setState(44);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(45);
					match(COMMA);
					setState(46);
					substitution(2);
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StratCallContext extends ParserRuleContext {
		public TerminalNode STRAT_ID() { return getToken(MaudeParser.STRAT_ID, 0); }
		public TerminalNode EMPTY_STRAT_CALL() { return getToken(MaudeParser.EMPTY_STRAT_CALL, 0); }
		public TerminalNode LP() { return getToken(MaudeParser.LP, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode RP() { return getToken(MaudeParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MaudeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MaudeParser.COMMA, i);
		}
		public StratCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stratCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterStratCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitStratCall(this);
		}
	}

	public final StratCallContext stratCall() throws RecognitionException {
		StratCallContext _localctx = new StratCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stratCall);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(STRAT_ID);
				setState(53);
				match(EMPTY_STRAT_CALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(STRAT_ID);
				setState(55);
				match(LP);
				setState(56);
				term();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(57);
					match(COMMA);
					setState(58);
					term();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(RP);
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
	public static class VarStratListContext extends ParserRuleContext {
		public TerminalNode VAR_ID() { return getToken(MaudeParser.VAR_ID, 0); }
		public TerminalNode USING() { return getToken(MaudeParser.USING, 0); }
		public StratContext strat() {
			return getRuleContext(StratContext.class,0);
		}
		public List<VarStratListContext> varStratList() {
			return getRuleContexts(VarStratListContext.class);
		}
		public VarStratListContext varStratList(int i) {
			return getRuleContext(VarStratListContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(MaudeParser.COMMA, 0); }
		public VarStratListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varStratList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterVarStratList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitVarStratList(this);
		}
	}

	public final VarStratListContext varStratList() throws RecognitionException {
		return varStratList(0);
	}

	private VarStratListContext varStratList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarStratListContext _localctx = new VarStratListContext(_ctx, _parentState);
		VarStratListContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_varStratList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(69);
			match(VAR_ID);
			setState(70);
			match(USING);
			setState(71);
			strat();
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarStratListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varStratList);
					setState(73);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(74);
					match(COMMA);
					setState(75);
					varStratList(2);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpFormContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(MaudeParser.LP, 0); }
		public OpFormContext opForm() {
			return getRuleContext(OpFormContext.class,0);
		}
		public TerminalNode RP() { return getToken(MaudeParser.RP, 0); }
		public OpFormPlusContext opFormPlus() {
			return getRuleContext(OpFormPlusContext.class,0);
		}
		public OpFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterOpForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitOpForm(this);
		}
	}

	public final OpFormContext opForm() throws RecognitionException {
		OpFormContext _localctx = new OpFormContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opForm);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(LP);
				setState(82);
				opForm();
				setState(83);
				match(RP);
				}
				break;
			case OP_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				opFormPlus();
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
	public static class OpFormPlusContext extends ParserRuleContext {
		public TerminalNode OP_ID() { return getToken(MaudeParser.OP_ID, 0); }
		public OpFormPlusContext opFormPlus() {
			return getRuleContext(OpFormPlusContext.class,0);
		}
		public OpFormPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opFormPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterOpFormPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitOpFormPlus(this);
		}
	}

	public final OpFormPlusContext opFormPlus() throws RecognitionException {
		OpFormPlusContext _localctx = new OpFormPlusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_opFormPlus);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(OP_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(OP_ID);
				setState(90);
				opFormPlus();
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
	public static class TermContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(MaudeParser.LP, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode RP() { return getToken(MaudeParser.RP, 0); }
		public TermPlusContext termPlus() {
			return getRuleContext(TermPlusContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(LP);
				setState(94);
				term();
				setState(95);
				match(RP);
				}
				break;
			case TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				termPlus();
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
	public static class TermPlusContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(MaudeParser.TOKEN, 0); }
		public TermPlusContext termPlus() {
			return getRuleContext(TermPlusContext.class,0);
		}
		public TermPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterTermPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitTermPlus(this);
		}
	}

	public final TermPlusContext termPlus() throws RecognitionException {
		TermPlusContext _localctx = new TermPlusContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_termPlus);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(TOKEN);
				setState(101);
				termPlus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(TOKEN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return substitution_sempred((SubstitutionContext)_localctx, predIndex);
		case 4:
			return varStratList_sempred((VarStratListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean substitution_sempred(SubstitutionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean varStratList_sempred(VarStratListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001cj\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"0\b\u0002\n\u0002\f\u00023\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003"+
		"\n\u0003\f\u0003?\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004M\b\u0004\n\u0004\f\u0004P\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"W\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007c\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0003\bh\b\b\u0001\b\u0000\u0002\u0004"+
		"\b\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000i\u0000\u0012"+
		"\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\'\u0001"+
		"\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000"+
		"\u0000\nV\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000eb\u0001"+
		"\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0010"+
		"\u0000\u0000\u0015\u0016\u0005\u0015\u0000\u0000\u0016\u0017\u0005\u0015"+
		"\u0000\u0000\u0017\u0018\u0003\u0004\u0002\u0000\u0018\u0019\u0005\u0016"+
		"\u0000\u0000\u0019\u001a\u0005\u0016\u0000\u0000\u001a\u001b\u0005\u0015"+
		"\u0000\u0000\u001b\u001c\u0005\u0013\u0000\u0000\u001c!\u0003\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u001c\u0000\u0000\u001e \u0003\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0014\u0000\u0000%&\u0005\u0016"+
		"\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'(\u0006\u0002\uffff\uffff"+
		"\u0000()\u0005\u000b\u0000\u0000)*\u0005\u0019\u0000\u0000*+\u0003\u000e"+
		"\u0007\u0000+1\u0001\u0000\u0000\u0000,-\n\u0001\u0000\u0000-.\u0005\u001c"+
		"\u0000\u0000.0\u0003\u0004\u0002\u0002/,\u0001\u0000\u0000\u000003\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"2\u0005\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0005\u0011"+
		"\u0000\u00005C\u0005\u001a\u0000\u000067\u0005\u0011\u0000\u000078\u0005"+
		"\u0017\u0000\u00008=\u0003\u000e\u0007\u00009:\u0005\u001c\u0000\u0000"+
		":<\u0003\u000e\u0007\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0018\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B4\u0001\u0000\u0000\u0000B6\u0001\u0000\u0000\u0000"+
		"C\u0007\u0001\u0000\u0000\u0000DE\u0006\u0004\uffff\uffff\u0000EF\u0005"+
		"\u000b\u0000\u0000FG\u0005\u001b\u0000\u0000GH\u0003\u0000\u0000\u0000"+
		"HN\u0001\u0000\u0000\u0000IJ\n\u0001\u0000\u0000JK\u0005\u001c\u0000\u0000"+
		"KM\u0003\b\u0004\u0002LI\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0017\u0000\u0000RS\u0003\n\u0005"+
		"\u0000ST\u0005\u0018\u0000\u0000TW\u0001\u0000\u0000\u0000UW\u0003\f\u0006"+
		"\u0000VQ\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u000b\u0001"+
		"\u0000\u0000\u0000X\\\u0005\r\u0000\u0000YZ\u0005\r\u0000\u0000Z\\\u0003"+
		"\f\u0006\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\\r"+
		"\u0001\u0000\u0000\u0000]^\u0005\u0017\u0000\u0000^_\u0003\u000e\u0007"+
		"\u0000_`\u0005\u0018\u0000\u0000`c\u0001\u0000\u0000\u0000ac\u0003\u0010"+
		"\b\u0000b]\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u000f\u0001"+
		"\u0000\u0000\u0000de\u0005\u000f\u0000\u0000eh\u0003\u0010\b\u0000fh\u0005"+
		"\u000f\u0000\u0000gd\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"h\u0011\u0001\u0000\u0000\u0000\t!1=BNV[bg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}