package org.example.generated;// Generated from MaudeLexer.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MaudeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN=1, LABEL_ID=2, STRAT_ID=3, ATTRIBUTE_ID=4, LP=5, RP=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TOKEN", "LABEL_ID", "STRAT_ID", "ATTRIBUTE_ID", "LP", "RP", "NON_BACKQUOTED_TOKEN", 
			"SYMBOL", "BACKQUOTED_TOKEN", "EXLUDE_TOKENS"
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


	public MaudeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MaudeLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0006N\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0019\b\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u001d"+
		"\b\u0001\n\u0001\f\u0001 \t\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003-\b\u0003\n\u0003\f\u00030\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0004\u00069\b\u0006\u000b\u0006\f\u0006:\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0004\bA\b\b\u000b\b\f\bB\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tM\b\t\u0000\u0000\n\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0000\u000f\u0000"+
		"\u0011\u0000\u0013\u0000\u0001\u0000\u000b\u0001\u0000az\u0004\u00000"+
		"9AZ__az\u0002\u0000::@@\t\u0000\n\n\r\r(),,[[]]``{{}}\u0006\u0000(),,"+
		"[[]]{{}}\u0002\u0000\n\n\r\r\u0001\u0000,,\u0001\u0000[[\u0001\u0000]"+
		"]\u0001\u0000{{\u0001\u0000}}U\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0001\u0018\u0001\u0000\u0000\u0000\u0003\u001a"+
		"\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007*\u0001\u0000"+
		"\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000"+
		"\r8\u0001\u0000\u0000\u0000\u000f<\u0001\u0000\u0000\u0000\u0011>\u0001"+
		"\u0000\u0000\u0000\u0013L\u0001\u0000\u0000\u0000\u0015\u0019\u0003\u0011"+
		"\b\u0000\u0016\u0019\u0003\u000f\u0007\u0000\u0017\u0019\u0003\r\u0006"+
		"\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u0002\u0001\u0000\u0000"+
		"\u0000\u001a\u001e\u0007\u0000\u0000\u0000\u001b\u001d\u0007\u0001\u0000"+
		"\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000"+
		"\u001f\u0004\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!%"+
		"\u0007\u0000\u0000\u0000\"$\u0007\u0001\u0000\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\b"+
		"\u0002\u0000\u0000)\u0006\u0001\u0000\u0000\u0000*.\u0007\u0000\u0000"+
		"\u0000+-\u0007\u0001\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0003\u0013\t\u00002\b"+
		"\u0001\u0000\u0000\u000034\u0005(\u0000\u00004\n\u0001\u0000\u0000\u0000"+
		"56\u0005)\u0000\u00006\f\u0001\u0000\u0000\u000079\b\u0003\u0000\u0000"+
		"87\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0007"+
		"\u0004\u0000\u0000=\u0010\u0001\u0000\u0000\u0000>@\u0005`\u0000\u0000"+
		"?A\b\u0005\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0005`\u0000\u0000E\u0012\u0001\u0000\u0000\u0000FM\b\u0006\u0000"+
		"\u0000GM\b\u0007\u0000\u0000HM\b\b\u0000\u0000IM\b\t\u0000\u0000JM\b\n"+
		"\u0000\u0000KM\b\u0006\u0000\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000"+
		"\u0000\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0014\u0001\u0000\u0000"+
		"\u0000\b\u0000\u0018\u001e%.:BL\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}