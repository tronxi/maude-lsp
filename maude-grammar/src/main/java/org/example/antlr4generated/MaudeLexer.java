package org.example.antlr4generated;// Generated from MaudeLexer.g4 by ANTLR 4.13.0
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
		FMOD=1, IS=2, ENDFM=3, PROTECTING=4, EXTENDING=5, GENERATED_BY=6, INCLUDING=7, 
		SORTS=8, SORT=9, SUBSORTS=10, LT=11, IDENTIFIER=12, DOT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FMOD", "IS", "ENDFM", "PROTECTING", "EXTENDING", "GENERATED_BY", "INCLUDING", 
			"SORTS", "SORT", "SUBSORTS", "LT", "IDENTIFIER", "DOT", "BACKQUOTE", 
			"ESCAPED_CHAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fmod'", "'is'", "'endfm'", null, null, null, null, null, null, 
			"'subsorts'", "'<'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FMOD", "IS", "ENDFM", "PROTECTING", "EXTENDING", "GENERATED_BY", 
			"INCLUDING", "SORTS", "SORT", "SUBSORTS", "LT", "IDENTIFIER", "DOT", 
			"WS"
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
		"\u0004\u0000\u000e\u00ca\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003"+
		"\n\u0003\f\u0003?\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004N\b\u0004\n\u0004\f\u0004"+
		"Q\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"c\b\u0005\n\u0005\f\u0005f\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006u\b\u0006"+
		"\n\u0006\f\u0006x\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0083\b\u0007\n\u0007\f\u0007\u0086\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0090\b\b\n\b\f\b\u0093"+
		"\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u00a7\b\u000b\u000b\u000b\f\u000b"+
		"\u00a8\u0005\u000b\u00ab\b\u000b\n\u000b\f\u000b\u00ae\t\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c2\b\u000e"+
		"\u0001\u000f\u0004\u000f\u00c5\b\u000f\u000b\u000f\f\u000f\u00c6\u0001"+
		"\u000f\u0001\u000f\u0006=Odv\u0084\u0091\u0000\u0010\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000\u001d\u0000\u001f\u000e"+
		"\u0001\u0000\u0003\u0002\u0000AZaz\u0005\u0000$$09AZ__az\u0003\u0000\t"+
		"\n\r\r  \u00d7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0001!\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005)"+
		"\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\tB\u0001\u0000"+
		"\u0000\u0000\u000bT\u0001\u0000\u0000\u0000\ri\u0001\u0000\u0000\u0000"+
		"\u000f{\u0001\u0000\u0000\u0000\u0011\u0089\u0001\u0000\u0000\u0000\u0013"+
		"\u0096\u0001\u0000\u0000\u0000\u0015\u009f\u0001\u0000\u0000\u0000\u0017"+
		"\u00a1\u0001\u0000\u0000\u0000\u0019\u00af\u0001\u0000\u0000\u0000\u001b"+
		"\u00b1\u0001\u0000\u0000\u0000\u001d\u00c1\u0001\u0000\u0000\u0000\u001f"+
		"\u00c4\u0001\u0000\u0000\u0000!\"\u0005f\u0000\u0000\"#\u0005m\u0000\u0000"+
		"#$\u0005o\u0000\u0000$%\u0005d\u0000\u0000%\u0002\u0001\u0000\u0000\u0000"+
		"&\'\u0005i\u0000\u0000\'(\u0005s\u0000\u0000(\u0004\u0001\u0000\u0000"+
		"\u0000)*\u0005e\u0000\u0000*+\u0005n\u0000\u0000+,\u0005d\u0000\u0000"+
		",-\u0005f\u0000\u0000-.\u0005m\u0000\u0000.\u0006\u0001\u0000\u0000\u0000"+
		"/0\u0005p\u0000\u000001\u0005r\u0000\u000012\u0005o\u0000\u000023\u0005"+
		"t\u0000\u000034\u0005e\u0000\u000045\u0005c\u0000\u000056\u0005t\u0000"+
		"\u000067\u0005i\u0000\u000078\u0005n\u0000\u000089\u0005g\u0000\u0000"+
		"9=\u0001\u0000\u0000\u0000:<\t\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000"+
		"<?\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005.\u0000"+
		"\u0000A\b\u0001\u0000\u0000\u0000BC\u0005e\u0000\u0000CD\u0005x\u0000"+
		"\u0000DE\u0005t\u0000\u0000EF\u0005e\u0000\u0000FG\u0005n\u0000\u0000"+
		"GH\u0005d\u0000\u0000HI\u0005i\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005"+
		"g\u0000\u0000KO\u0001\u0000\u0000\u0000LN\t\u0000\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RS\u0005.\u0000\u0000S\n\u0001\u0000\u0000\u0000TU\u0005g\u0000"+
		"\u0000UV\u0005e\u0000\u0000VW\u0005n\u0000\u0000WX\u0005e\u0000\u0000"+
		"XY\u0005r\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005t\u0000\u0000[\\\u0005"+
		"e\u0000\u0000\\]\u0005d\u0000\u0000]^\u0005-\u0000\u0000^_\u0005b\u0000"+
		"\u0000_`\u0005y\u0000\u0000`d\u0001\u0000\u0000\u0000ac\t\u0000\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000gh\u0005.\u0000\u0000h\f\u0001\u0000\u0000\u0000ij\u0005"+
		"i\u0000\u0000jk\u0005n\u0000\u0000kl\u0005c\u0000\u0000lm\u0005l\u0000"+
		"\u0000mn\u0005u\u0000\u0000no\u0005d\u0000\u0000op\u0005i\u0000\u0000"+
		"pq\u0005n\u0000\u0000qr\u0005g\u0000\u0000rv\u0001\u0000\u0000\u0000s"+
		"u\t\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000yz\u0005.\u0000\u0000z\u000e\u0001\u0000"+
		"\u0000\u0000{|\u0005s\u0000\u0000|}\u0005o\u0000\u0000}~\u0005r\u0000"+
		"\u0000~\u007f\u0005t\u0000\u0000\u007f\u0080\u0005s\u0000\u0000\u0080"+
		"\u0084\u0001\u0000\u0000\u0000\u0081\u0083\t\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005.\u0000\u0000\u0088\u0010\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"s\u0000\u0000\u008a\u008b\u0005o\u0000\u0000\u008b\u008c\u0005r\u0000"+
		"\u0000\u008c\u008d\u0005t\u0000\u0000\u008d\u0091\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\t\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0093\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005.\u0000\u0000\u0095\u0012"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005s\u0000\u0000\u0097\u0098\u0005"+
		"u\u0000\u0000\u0098\u0099\u0005b\u0000\u0000\u0099\u009a\u0005s\u0000"+
		"\u0000\u009a\u009b\u0005o\u0000\u0000\u009b\u009c\u0005r\u0000\u0000\u009c"+
		"\u009d\u0005t\u0000\u0000\u009d\u009e\u0005s\u0000\u0000\u009e\u0014\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005<\u0000\u0000\u00a0\u0016\u0001\u0000"+
		"\u0000\u0000\u00a1\u00ac\u0007\u0000\u0000\u0000\u00a2\u00ab\u0007\u0001"+
		"\u0000\u0000\u00a3\u00a4\u0003\u001b\r\u0000\u00a4\u00a5\u0003\u001d\u000e"+
		"\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u0018\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005.\u0000\u0000"+
		"\u00b0\u001a\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005`\u0000\u0000\u00b2"+
		"\u001c\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\\\u0000\u0000\u00b4\u00c2"+
		"\u0005{\u0000\u0000\u00b5\u00b6\u0005\\\u0000\u0000\u00b6\u00c2\u0005"+
		"}\u0000\u0000\u00b7\u00b8\u0005\\\u0000\u0000\u00b8\u00c2\u0005(\u0000"+
		"\u0000\u00b9\u00ba\u0005\\\u0000\u0000\u00ba\u00c2\u0005)\u0000\u0000"+
		"\u00bb\u00bc\u0005\\\u0000\u0000\u00bc\u00c2\u0005[\u0000\u0000\u00bd"+
		"\u00be\u0005\\\u0000\u0000\u00be\u00c2\u0005]\u0000\u0000\u00bf\u00c0"+
		"\u0005\\\u0000\u0000\u00c0\u00c2\u0005,\u0000\u0000\u00c1\u00b3\u0001"+
		"\u0000\u0000\u0000\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1\u00b7\u0001"+
		"\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u001e\u0001\u0000\u0000\u0000\u00c3\u00c5\u0007"+
		"\u0002\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0006"+
		"\u000f\u0000\u0000\u00c9 \u0001\u0000\u0000\u0000\f\u0000=Odv\u0084\u0091"+
		"\u00a8\u00aa\u00ac\u00c1\u00c6\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}