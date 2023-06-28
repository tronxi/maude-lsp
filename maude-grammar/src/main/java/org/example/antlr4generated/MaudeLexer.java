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
		SORT=8, IDENTIFIER=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FMOD", "IS", "ENDFM", "PROTECTING", "EXTENDING", "GENERATED_BY", "INCLUDING", 
			"SORT", "IDENTIFIER", "BACKQUOTE", "ESCAPED_CHAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fmod'", "'is'", "'endfm'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FMOD", "IS", "ENDFM", "PROTECTING", "EXTENDING", "GENERATED_BY", 
			"INCLUDING", "SORT", "IDENTIFIER", "WS"
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
		"\u0004\u0000\n\u00a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u0003"+
		"7\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005[\b\u0005"+
		"\n\u0005\f\u0005^\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006m\b\u0006\n\u0006\f\u0006"+
		"p\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007z\b\u0007\n\u0007\f\u0007"+
		"}\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0004\b\u0086\b\b\u000b\b\f\b\u0087\u0005\b\u008a\b\b\n\b\f\b\u008d"+
		"\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009f"+
		"\b\n\u0001\u000b\u0004\u000b\u00a2\b\u000b\u000b\u000b\f\u000b\u00a3\u0001"+
		"\u000b\u0001\u000b\u00055G\\n{\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\u0000\u0015"+
		"\u0000\u0017\n\u0001\u0000\u0003\u0002\u0000AZaz\u0005\u0000$$09AZ__a"+
		"z\u0003\u0000\t\n\r\r  \u00b3\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001e\u0001"+
		"\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000"+
		"\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000\u0000"+
		"\ra\u0001\u0000\u0000\u0000\u000fs\u0001\u0000\u0000\u0000\u0011\u0080"+
		"\u0001\u0000\u0000\u0000\u0013\u008e\u0001\u0000\u0000\u0000\u0015\u009e"+
		"\u0001\u0000\u0000\u0000\u0017\u00a1\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005f\u0000\u0000\u001a\u001b\u0005m\u0000\u0000\u001b\u001c\u0005o"+
		"\u0000\u0000\u001c\u001d\u0005d\u0000\u0000\u001d\u0002\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005i\u0000\u0000\u001f \u0005s\u0000\u0000 \u0004"+
		"\u0001\u0000\u0000\u0000!\"\u0005e\u0000\u0000\"#\u0005n\u0000\u0000#"+
		"$\u0005d\u0000\u0000$%\u0005f\u0000\u0000%&\u0005m\u0000\u0000&\u0006"+
		"\u0001\u0000\u0000\u0000\'(\u0005p\u0000\u0000()\u0005r\u0000\u0000)*"+
		"\u0005o\u0000\u0000*+\u0005t\u0000\u0000+,\u0005e\u0000\u0000,-\u0005"+
		"c\u0000\u0000-.\u0005t\u0000\u0000./\u0005i\u0000\u0000/0\u0005n\u0000"+
		"\u000001\u0005g\u0000\u000015\u0001\u0000\u0000\u000024\t\u0000\u0000"+
		"\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000089\u0005.\u0000\u00009\b\u0001\u0000\u0000\u0000:;\u0005"+
		"e\u0000\u0000;<\u0005x\u0000\u0000<=\u0005t\u0000\u0000=>\u0005e\u0000"+
		"\u0000>?\u0005n\u0000\u0000?@\u0005d\u0000\u0000@A\u0005i\u0000\u0000"+
		"AB\u0005n\u0000\u0000BC\u0005g\u0000\u0000CG\u0001\u0000\u0000\u0000D"+
		"F\t\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JK\u0005.\u0000\u0000K\n\u0001\u0000\u0000"+
		"\u0000LM\u0005g\u0000\u0000MN\u0005e\u0000\u0000NO\u0005n\u0000\u0000"+
		"OP\u0005e\u0000\u0000PQ\u0005r\u0000\u0000QR\u0005a\u0000\u0000RS\u0005"+
		"t\u0000\u0000ST\u0005e\u0000\u0000TU\u0005d\u0000\u0000UV\u0005-\u0000"+
		"\u0000VW\u0005b\u0000\u0000WX\u0005y\u0000\u0000X\\\u0001\u0000\u0000"+
		"\u0000Y[\t\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005.\u0000\u0000`\f\u0001"+
		"\u0000\u0000\u0000ab\u0005i\u0000\u0000bc\u0005n\u0000\u0000cd\u0005c"+
		"\u0000\u0000de\u0005l\u0000\u0000ef\u0005u\u0000\u0000fg\u0005d\u0000"+
		"\u0000gh\u0005i\u0000\u0000hi\u0005n\u0000\u0000ij\u0005g\u0000\u0000"+
		"jn\u0001\u0000\u0000\u0000km\t\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"mp\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005.\u0000"+
		"\u0000r\u000e\u0001\u0000\u0000\u0000st\u0005s\u0000\u0000tu\u0005o\u0000"+
		"\u0000uv\u0005r\u0000\u0000vw\u0005t\u0000\u0000w{\u0001\u0000\u0000\u0000"+
		"xz\t\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005.\u0000\u0000\u007f\u0010"+
		"\u0001\u0000\u0000\u0000\u0080\u008b\u0007\u0000\u0000\u0000\u0081\u008a"+
		"\u0007\u0001\u0000\u0000\u0082\u0083\u0003\u0013\t\u0000\u0083\u0084\u0003"+
		"\u0015\n\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000"+
		"\u0000\u0000\u0089\u0081\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0012\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005`\u0000"+
		"\u0000\u008f\u0014\u0001\u0000\u0000\u0000\u0090\u0091\u0005\\\u0000\u0000"+
		"\u0091\u009f\u0005{\u0000\u0000\u0092\u0093\u0005\\\u0000\u0000\u0093"+
		"\u009f\u0005}\u0000\u0000\u0094\u0095\u0005\\\u0000\u0000\u0095\u009f"+
		"\u0005(\u0000\u0000\u0096\u0097\u0005\\\u0000\u0000\u0097\u009f\u0005"+
		")\u0000\u0000\u0098\u0099\u0005\\\u0000\u0000\u0099\u009f\u0005[\u0000"+
		"\u0000\u009a\u009b\u0005\\\u0000\u0000\u009b\u009f\u0005]\u0000\u0000"+
		"\u009c\u009d\u0005\\\u0000\u0000\u009d\u009f\u0005,\u0000\u0000\u009e"+
		"\u0090\u0001\u0000\u0000\u0000\u009e\u0092\u0001\u0000\u0000\u0000\u009e"+
		"\u0094\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000\u0000\u0000\u009e"+
		"\u0098\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u0016\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0007\u0002\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0006\u000b\u0000\u0000\u00a6\u0018\u0001\u0000\u0000\u0000\u000b"+
		"\u00005G\\n{\u0087\u0089\u008b\u009e\u00a3\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}