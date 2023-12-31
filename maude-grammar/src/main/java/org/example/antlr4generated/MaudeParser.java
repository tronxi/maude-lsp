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
		SORTS=8, SUBSORTS=9, OP=10, ATTR=11, VARS=12, IDENTIFIER=13, LT=14, LCB=15, 
		RCB=16, COMMA=17, DOT=18, ARROW=19, COLON=20, WS=21;
	public static final int
		RULE_maudeTop = 0, RULE_module = 1, RULE_fmod = 2, RULE_modElt = 3, RULE_sort = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"maudeTop", "module", "fmod", "modElt", "sort"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fmod'", "'is'", "'endfm'", null, null, null, null, "'sorts'", 
			"'subsorts'", null, null, "'vars'", null, "'<'", "'{'", "'}'", "','", 
			"'.'", "'->'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FMOD", "IS", "ENDFM", "PROTECTING", "EXTENDING", "GENERATED_BY", 
			"INCLUDING", "SORTS", "SUBSORTS", "OP", "ATTR", "VARS", "IDENTIFIER", 
			"LT", "LCB", "RCB", "COMMA", "DOT", "ARROW", "COLON", "WS"
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
	public static class MaudeTopContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public MaudeTopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maudeTop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterMaudeTop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitMaudeTop(this);
		}
	}

	public final MaudeTopContext maudeTop() throws RecognitionException {
		MaudeTopContext _localctx = new MaudeTopContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_maudeTop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			module();
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
	public static class ModuleContext extends ParserRuleContext {
		public List<FmodContext> fmod() {
			return getRuleContexts(FmodContext.class);
		}
		public FmodContext fmod(int i) {
			return getRuleContext(FmodContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FMOD) {
				{
				{
				setState(12);
				fmod();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FmodContext extends ParserRuleContext {
		public TerminalNode FMOD() { return getToken(MaudeParser.FMOD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MaudeParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(MaudeParser.IS, 0); }
		public TerminalNode ENDFM() { return getToken(MaudeParser.ENDFM, 0); }
		public List<ModEltContext> modElt() {
			return getRuleContexts(ModEltContext.class);
		}
		public ModEltContext modElt(int i) {
			return getRuleContext(ModEltContext.class,i);
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
		enterRule(_localctx, 4, RULE_fmod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(FMOD);
			setState(19);
			match(IDENTIFIER);
			setState(20);
			match(IS);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6128L) != 0)) {
				{
				{
				setState(21);
				modElt();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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
	public static class ModEltContext extends ParserRuleContext {
		public ModEltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modElt; }
	 
		public ModEltContext() { }
		public void copyFrom(ModEltContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtendingContext extends ModEltContext {
		public TerminalNode EXTENDING() { return getToken(MaudeParser.EXTENDING, 0); }
		public ExtendingContext(ModEltContext ctx) { copyFrom(ctx); }
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
	public static class SortsContext extends ModEltContext {
		public TerminalNode SORTS() { return getToken(MaudeParser.SORTS, 0); }
		public TerminalNode DOT() { return getToken(MaudeParser.DOT, 0); }
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public SortsContext(ModEltContext ctx) { copyFrom(ctx); }
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
	public static class OpContext extends ModEltContext {
		public SortContext coarity;
		public TerminalNode OP() { return getToken(MaudeParser.OP, 0); }
		public TerminalNode ARROW() { return getToken(MaudeParser.ARROW, 0); }
		public TerminalNode DOT() { return getToken(MaudeParser.DOT, 0); }
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public TerminalNode ATTR() { return getToken(MaudeParser.ATTR, 0); }
		public OpContext(ModEltContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitOp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneratedByContext extends ModEltContext {
		public TerminalNode GENERATED_BY() { return getToken(MaudeParser.GENERATED_BY, 0); }
		public GeneratedByContext(ModEltContext ctx) { copyFrom(ctx); }
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
	public static class VarsContext extends ModEltContext {
		public SortContext type;
		public TerminalNode VARS() { return getToken(MaudeParser.VARS, 0); }
		public TerminalNode COLON() { return getToken(MaudeParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(MaudeParser.DOT, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MaudeParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MaudeParser.IDENTIFIER, i);
		}
		public VarsContext(ModEltContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitVars(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProtectingContext extends ModEltContext {
		public TerminalNode PROTECTING() { return getToken(MaudeParser.PROTECTING, 0); }
		public ProtectingContext(ModEltContext ctx) { copyFrom(ctx); }
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
	public static class SubsortContext extends ModEltContext {
		public TerminalNode SUBSORTS() { return getToken(MaudeParser.SUBSORTS, 0); }
		public TerminalNode DOT() { return getToken(MaudeParser.DOT, 0); }
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(MaudeParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(MaudeParser.LT, i);
		}
		public SubsortContext(ModEltContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterSubsort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitSubsort(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludingContext extends ModEltContext {
		public TerminalNode INCLUDING() { return getToken(MaudeParser.INCLUDING, 0); }
		public IncludingContext(ModEltContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).enterIncluding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaudeParserListener) ((MaudeParserListener)listener).exitIncluding(this);
		}
	}

	public final ModEltContext modElt() throws RecognitionException {
		ModEltContext _localctx = new ModEltContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modElt);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROTECTING:
				_localctx = new ProtectingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(PROTECTING);
				}
				break;
			case EXTENDING:
				_localctx = new ExtendingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(EXTENDING);
				}
				break;
			case GENERATED_BY:
				_localctx = new GeneratedByContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(GENERATED_BY);
				}
				break;
			case INCLUDING:
				_localctx = new IncludingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				match(INCLUDING);
				}
				break;
			case SORTS:
				_localctx = new SortsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				match(SORTS);
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					sort(0);
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(39);
				match(DOT);
				}
				break;
			case SUBSORTS:
				_localctx = new SubsortContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				match(SUBSORTS);
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42);
					sort(0);
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					match(LT);
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(48);
						sort(0);
						}
						}
						setState(51); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==IDENTIFIER );
					}
					}
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LT );
				setState(57);
				match(DOT);
				}
				break;
			case OP:
				_localctx = new OpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				match(OP);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(60);
					sort(0);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(ARROW);
				setState(67);
				((OpContext)_localctx).coarity = sort(0);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATTR) {
					{
					setState(68);
					match(ATTR);
					}
				}

				setState(71);
				match(DOT);
				}
				break;
			case VARS:
				_localctx = new VarsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				match(VARS);
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					match(IDENTIFIER);
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(79);
				match(COLON);
				setState(80);
				((VarsContext)_localctx).type = sort(0);
				setState(81);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_sort, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SortContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sort);
					setState(88);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(89);
					match(LCB);
					setState(90);
					sort(0);
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(91);
						match(COMMA);
						setState(92);
						sort(0);
						}
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(98);
					match(RCB);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		case 4:
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
		"\u0004\u0001\u0015j\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u000e\b\u0001\n\u0001\f\u0001"+
		"\u0011\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u0017\b\u0002\n\u0002\f\u0002\u001a\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003$\b\u0003\u000b\u0003\f\u0003%\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003,\b\u0003\u000b\u0003\f\u0003-\u0001\u0003\u0001"+
		"\u0003\u0004\u00032\b\u0003\u000b\u0003\f\u00033\u0004\u00036\b\u0003"+
		"\u000b\u0003\f\u00037\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003>\b\u0003\n\u0003\f\u0003A\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003F\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u0003L\b\u0003\u000b\u0003\f\u0003M\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004^\b\u0004\n\u0004\f\u0004a\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004e\b\u0004\n\u0004\f\u0004h\t\u0004\u0001\u0004\u0000"+
		"\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000v\u0000\n\u0001\u0000"+
		"\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004\u0012\u0001\u0000"+
		"\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000"+
		"\n\u000b\u0003\u0002\u0001\u0000\u000b\u0001\u0001\u0000\u0000\u0000\f"+
		"\u000e\u0003\u0004\u0002\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011"+
		"\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001"+
		"\u0000\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014\u0005"+
		"\r\u0000\u0000\u0014\u0018\u0005\u0002\u0000\u0000\u0015\u0017\u0003\u0006"+
		"\u0003\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000"+
		"\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c\u0005\u0001\u0000"+
		"\u0000\u0000\u001dT\u0005\u0004\u0000\u0000\u001eT\u0005\u0005\u0000\u0000"+
		"\u001fT\u0005\u0006\u0000\u0000 T\u0005\u0007\u0000\u0000!#\u0005\b\u0000"+
		"\u0000\"$\u0003\b\u0004\u0000#\"\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'(\u0005\u0012\u0000\u0000(T\u0001\u0000\u0000\u0000"+
		")+\u0005\t\u0000\u0000*,\u0003\b\u0004\u0000+*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000.5\u0001\u0000\u0000\u0000/1\u0005\u000e\u0000\u000002\u0003\b\u0004"+
		"\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u00005/\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0005\u0012\u0000"+
		"\u0000:T\u0001\u0000\u0000\u0000;?\u0005\n\u0000\u0000<>\u0003\b\u0004"+
		"\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000BC\u0005\u0013\u0000\u0000CE\u0003\b\u0004\u0000DF\u0005"+
		"\u000b\u0000\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GH\u0005\u0012\u0000\u0000HT\u0001\u0000\u0000"+
		"\u0000IK\u0005\f\u0000\u0000JL\u0005\r\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u0014\u0000\u0000PQ\u0003"+
		"\b\u0004\u0000QR\u0005\u0012\u0000\u0000RT\u0001\u0000\u0000\u0000S\u001d"+
		"\u0001\u0000\u0000\u0000S\u001e\u0001\u0000\u0000\u0000S\u001f\u0001\u0000"+
		"\u0000\u0000S \u0001\u0000\u0000\u0000S!\u0001\u0000\u0000\u0000S)\u0001"+
		"\u0000\u0000\u0000S;\u0001\u0000\u0000\u0000SI\u0001\u0000\u0000\u0000"+
		"T\u0007\u0001\u0000\u0000\u0000UV\u0006\u0004\uffff\uffff\u0000VW\u0005"+
		"\r\u0000\u0000Wf\u0001\u0000\u0000\u0000XY\n\u0001\u0000\u0000YZ\u0005"+
		"\u000f\u0000\u0000Z_\u0003\b\u0004\u0000[\\\u0005\u0011\u0000\u0000\\"+
		"^\u0003\b\u0004\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0010\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000dX\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\t\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000\f\u000f\u0018%-37?EMS_f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}