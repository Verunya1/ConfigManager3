// Generated from C:/Users/vera3/IdeaProjects/ConfigManager3/src/main/java/antlr4\MyLanguage.g4 by ANTLR 4.10.1
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPEN_BRACKET=2, CLOZING_BRACKET=3, AGE=4, ANCHOR=5, DOG=6, CRLF=7, 
		COMMENT=8, GROUP=9, STUDENT=10, TEXT=11, SUBJECT=12, IGNORE_COMMENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "OPEN_BRACKET", "CLOZING_BRACKET", "DIGIT", "AGE", "TWO_DIGIT", 
			"ANCHOR", "DOG", "HYPHEN", "POINT", "WHITESPACE", "QUOTE", "SYMBOL", 
			"CRLF", "GROUP_CODE", "COMMENT", "GROUP", "STUDENT", "TEXT", "SUBJECT", 
			"IGNORE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'('", "')'", null, "'^'", "'@'", null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN_BRACKET", "CLOZING_BRACKET", "AGE", "ANCHOR", "DOG", 
			"CRLF", "COMMENT", "GROUP", "STUDENT", "TEXT", "SUBJECT", "IGNORE_COMMENT"
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


	public MyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

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
		"\u0004\u0000\r\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u00045\b\u0004\u000b\u0004\f\u0004"+
		"6\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0003\rK\b\r\u0001\r\u0001\r\u0003"+
		"\rO\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\\\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004"+
		"\u0011b\b\u0011\u000b\u0011\f\u0011c\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012m\b\u0012"+
		"\u000b\u0012\f\u0012n\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0004\u0013u\b\u0013\u000b\u0013\f\u0013v\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u007f\b\u0014\u000b"+
		"\u0014\f\u0014\u0080\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0000\t\u0004\u000b\u0000\r\u0005\u000f\u0006\u0011\u0000\u0013"+
		"\u0000\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u0007\u001d\u0000\u001f"+
		"\b!\t#\n%\u000b\'\f)\r\u0001\u0000\u0002\u0001\u000009\u0001\u0000\u0400"+
		"\u04ff\u0083\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000"+
		"\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t"+
		"4\u0001\u0000\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\r;\u0001\u0000"+
		"\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000"+
		"\u0013A\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017E"+
		"\u0001\u0000\u0000\u0000\u0019G\u0001\u0000\u0000\u0000\u001bN\u0001\u0000"+
		"\u0000\u0000\u001dP\u0001\u0000\u0000\u0000\u001fU\u0001\u0000\u0000\u0000"+
		"!W\u0001\u0000\u0000\u0000#a\u0001\u0000\u0000\u0000%l\u0001\u0000\u0000"+
		"\u0000\'p\u0001\u0000\u0000\u0000){\u0001\u0000\u0000\u0000+,\u0005 \u0000"+
		"\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.\u0004\u0001"+
		"\u0000\u0000\u0000/0\u0005)\u0000\u00000\u0006\u0001\u0000\u0000\u0000"+
		"12\u0007\u0000\u0000\u00002\b\u0001\u0000\u0000\u000035\u0007\u0000\u0000"+
		"\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u00007\n\u0001\u0000\u0000\u000089\u0003"+
		"\u0007\u0003\u00009:\u0003\u0007\u0003\u0000:\f\u0001\u0000\u0000\u0000"+
		";<\u0005^\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005@\u0000\u0000"+
		">\u0010\u0001\u0000\u0000\u0000?@\u0005-\u0000\u0000@\u0012\u0001\u0000"+
		"\u0000\u0000AB\u0005.\u0000\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0005"+
		" \u0000\u0000D\u0016\u0001\u0000\u0000\u0000EF\u0005\"\u0000\u0000F\u0018"+
		"\u0001\u0000\u0000\u0000GH\u0007\u0001\u0000\u0000H\u001a\u0001\u0000"+
		"\u0000\u0000IK\u0005\r\u0000\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LO\u0005\n\u0000\u0000MO\u0005\r"+
		"\u0000\u0000NJ\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u001c"+
		"\u0001\u0000\u0000\u0000PQ\u0003\u0019\f\u0000QR\u0003\u0019\f\u0000R"+
		"S\u0003\u0019\f\u0000ST\u0003\u0019\f\u0000T\u001e\u0001\u0000\u0000\u0000"+
		"UV\u0005#\u0000\u0000V \u0001\u0000\u0000\u0000WX\u0003\u001d\u000e\u0000"+
		"X[\u0003\u0011\b\u0000Y\\\u0003\u0007\u0003\u0000Z\\\u0003\u000b\u0005"+
		"\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0003\u0011\b\u0000^_\u0003\u000b\u0005\u0000_\"\u0001"+
		"\u0000\u0000\u0000`b\u0003\u0019\f\u0000a`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0003\u0015\n\u0000fg\u0003\u0019\f\u0000"+
		"gh\u0003\u0013\t\u0000hi\u0003\u0019\f\u0000ij\u0003\u0013\t\u0000j$\u0001"+
		"\u0000\u0000\u0000km\u0003\u0019\f\u0000lk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"o&\u0001\u0000\u0000\u0000pq\u0003\u0017\u000b\u0000qt\u0003\u0015\n\u0000"+
		"ru\u0003%\u0012\u0000su\u0005 \u0000\u0000tr\u0001\u0000\u0000\u0000t"+
		"s\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0003\u0015"+
		"\n\u0000yz\u0003\u0017\u000b\u0000z(\u0001\u0000\u0000\u0000{~\u0003\u001f"+
		"\u000f\u0000|\u007f\u0003%\u0012\u0000}\u007f\u0005 \u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081*\u0001\u0000\u0000\u0000\u000b\u00006JN[cntv~\u0080\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}