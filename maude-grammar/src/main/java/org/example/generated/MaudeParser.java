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
		TOKEN=1, LABEL_ID=2, STRAT_ID=3, ATTRIBUTE_ID=4, LP=5, RP=6;
	public static final int
		RULE_term = 0, RULE_termPlus = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"term", "termPlus"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN", "LABEL_ID", "STRAT_ID", "ATTRIBUTE_ID", "LP", "RP"
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
		enterRule(_localctx, 0, RULE_term);
		try {
			setState(9);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				match(LP);
				setState(5);
				term();
				setState(6);
				match(RP);
				}
				break;
			case TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
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
		enterRule(_localctx, 2, RULE_termPlus);
		try {
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(TOKEN);
				setState(12);
				termPlus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0006\u0011\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\n\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u000f\b\u0001"+
		"\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0010\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u0005\u0005"+
		"\u0005\u0000\u0000\u0005\u0006\u0003\u0000\u0000\u0000\u0006\u0007\u0005"+
		"\u0006\u0000\u0000\u0007\n\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001"+
		"\u0000\t\u0004\u0001\u0000\u0000\u0000\t\b\u0001\u0000\u0000\u0000\n\u0001"+
		"\u0001\u0000\u0000\u0000\u000b\f\u0005\u0001\u0000\u0000\f\u000f\u0003"+
		"\u0002\u0001\u0000\r\u000f\u0005\u0001\u0000\u0000\u000e\u000b\u0001\u0000"+
		"\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f\u0003\u0001\u0000\u0000"+
		"\u0000\u0002\t\u000e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}