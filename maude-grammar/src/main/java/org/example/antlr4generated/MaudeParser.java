package org.example.antlr4generated;// Generated from MaudeParser.g4 by ANTLR 4.13.0
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
		FMOD=1, IS=2, ENDFM=3, PROTECTING=4, EXTENDING=5, GENERATED_BY=6, INCLUDING=7, 
		SORTS=8, SUBSORTS=9, IDENTIFIER=10, LT=11, LCB=12, RCB=13, COMMA=14, DOT=15, 
		WS=16;
	public static final int
		RULE_fmod = 0, RULE_moduleExpr = 1, RULE_sort = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"fmod", "moduleExpr", "sort"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fmod'", "'is'", "'endfm'", null, null, null, null, "'sorts'", 
			"'subsorts'", null, "'<'", "'{'", "'}'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FMOD", "IS", "ENDFM", "PROTECTING", "EXTENDING", "GENERATED_BY", 
			"INCLUDING", "SORTS", "SUBSORTS", "IDENTIFIER", "LT", "LCB", "RCB", "COMMA", 
			"DOT", "WS"
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
	public static class FmodContext extends ParserRuleContext {
		public TerminalNode FMOD() { return getToken(MaudeParser.FMOD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MaudeParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(MaudeParser.IS, 0); }
		public TerminalNode ENDFM() { return getToken(MaudeParser.ENDFM, 0); }
		public List<ModuleExprContext> moduleExpr() {
			return getRuleContexts(ModuleExprContext.class);
		}
		public ModuleExprContext moduleExpr(int i) {
			return getRuleContext(ModuleExprContext.class,i);
		}
		public FmodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fmod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterFmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitFmod(this);
		}
	}

	public final FmodContext fmod() throws RecognitionException {
		FmodContext _localctx = new FmodContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fmod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(FMOD);
			setState(7);
			match(IDENTIFIER);
			setState(8);
			match(IS);
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) {
				{
				{
				setState(9);
				moduleExpr();
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15);
			match(ENDFM);
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
	public static class ModuleExprContext extends ParserRuleContext {
		public ModuleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleExpr; }
	 
		public ModuleExprContext() { }
		public void copyFrom(ModuleExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtendingContext extends ModuleExprContext {
		public TerminalNode EXTENDING() { return getToken(MaudeParser.EXTENDING, 0); }
		public ExtendingContext(ModuleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterExtending(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitExtending(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SortsContext extends ModuleExprContext {
		public TerminalNode SORTS() { return getToken(MaudeParser.SORTS, 0); }
		public TerminalNode DOT() { return getToken(MaudeParser.DOT, 0); }
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public SortsContext(ModuleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterSorts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitSorts(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneratedByContext extends ModuleExprContext {
		public TerminalNode GENERATED_BY() { return getToken(MaudeParser.GENERATED_BY, 0); }
		public GeneratedByContext(ModuleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterGeneratedBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitGeneratedBy(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProtectingContext extends ModuleExprContext {
		public TerminalNode PROTECTING() { return getToken(MaudeParser.PROTECTING, 0); }
		public ProtectingContext(ModuleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterProtecting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitProtecting(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludingContext extends ModuleExprContext {
		public TerminalNode INCLUDING() { return getToken(MaudeParser.INCLUDING, 0); }
		public IncludingContext(ModuleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterIncluding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitIncluding(this);
		}
	}

	public final ModuleExprContext moduleExpr() throws RecognitionException {
		ModuleExprContext _localctx = new ModuleExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleExpr);
		int _la;
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROTECTING:
				_localctx = new ProtectingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(PROTECTING);
				}
				break;
			case EXTENDING:
				_localctx = new ExtendingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(EXTENDING);
				}
				break;
			case GENERATED_BY:
				_localctx = new GeneratedByContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				match(GENERATED_BY);
				}
				break;
			case INCLUDING:
				_localctx = new IncludingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(20);
				match(INCLUDING);
				}
				break;
			case SORTS:
				_localctx = new SortsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(21);
				match(SORTS);
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(22);
					sort(0);
					}
					}
					setState(25); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(27);
				match(DOT);
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
	public static class SortContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MaudeParser.IDENTIFIER, 0); }
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public TerminalNode LCB() { return getToken(MaudeParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(MaudeParser.RCB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MaudeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MaudeParser.COMMA, i);
		}
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitSort(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		return sort(0);
	}

	private SortContext sort(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SortContext _localctx = new SortContext(_ctx, _parentState);
		SortContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_sort, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(32);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SortContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sort);
					setState(34);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(35);
					match(LCB);
					setState(36);
					sort(0);
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(37);
						match(COMMA);
						setState(38);
						sort(0);
						}
						}
						setState(43);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(44);
					match(RCB);
					}
					} 
				}
				setState(50);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return sort_sempred((SortContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sort_sempred(SortContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00104\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u000b\b\u0000\n\u0000\f\u0000\u000e\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u0018\b\u0001\u000b\u0001\f\u0001\u0019\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b"+
		"\u0002\n\u0002\f\u0002+\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b"+
		"\u0002\n\u0002\f\u00022\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000"+
		"\u0002\u0004\u0000\u00008\u0000\u0006\u0001\u0000\u0000\u0000\u0002\u001d"+
		"\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006\u0007"+
		"\u0005\u0001\u0000\u0000\u0007\b\u0005\n\u0000\u0000\b\f\u0005\u0002\u0000"+
		"\u0000\t\u000b\u0003\u0002\u0001\u0000\n\t\u0001\u0000\u0000\u0000\u000b"+
		"\u000e\u0001\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000"+
		"\u0000\u0000\r\u000f\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0005\u0003\u0000\u0000\u0010\u0001\u0001\u0000\u0000"+
		"\u0000\u0011\u001e\u0005\u0004\u0000\u0000\u0012\u001e\u0005\u0005\u0000"+
		"\u0000\u0013\u001e\u0005\u0006\u0000\u0000\u0014\u001e\u0005\u0007\u0000"+
		"\u0000\u0015\u0017\u0005\b\u0000\u0000\u0016\u0018\u0003\u0004\u0002\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u000f\u0000\u0000"+
		"\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u0011\u0001\u0000\u0000\u0000"+
		"\u001d\u0012\u0001\u0000\u0000\u0000\u001d\u0013\u0001\u0000\u0000\u0000"+
		"\u001d\u0014\u0001\u0000\u0000\u0000\u001d\u0015\u0001\u0000\u0000\u0000"+
		"\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0006\u0002\uffff\uffff\u0000"+
		" !\u0005\n\u0000\u0000!0\u0001\u0000\u0000\u0000\"#\n\u0001\u0000\u0000"+
		"#$\u0005\f\u0000\u0000$)\u0003\u0004\u0002\u0000%&\u0005\u000e\u0000\u0000"+
		"&(\u0003\u0004\u0002\u0000\'%\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\r\u0000\u0000-/\u0001\u0000"+
		"\u0000\u0000.\"\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0005\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u0000\u0005\f\u0019\u001d)0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}