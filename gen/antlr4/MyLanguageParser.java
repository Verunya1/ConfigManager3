// Generated from C:/Users/vera3/IdeaProjects/ConfigManager3/src/main/java/antlr4\MyLanguage.g4 by ANTLR 4.10.1
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPEN_BRACKET=2, CLOZING_BRACKET=3, AGE=4, ANCHOR=5, DOG=6, CRLF=7, 
		COMMENT=8, GROUP=9, STUDENT=10, TEXT=11, SUBJECT=12, IGNORE_COMMENT=13;
	public static final int
		RULE_log = 0, RULE_entry = 1, RULE_subject = 2, RULE_anchor = 3, RULE_dog = 4, 
		RULE_student = 5, RULE_group = 6, RULE_ignore = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"log", "entry", "subject", "anchor", "dog", "student", "group", "ignore"
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

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LogContext extends ParserRuleContext {
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				entry();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET || _la==IGNORE_COMMENT );
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

	public static class EntryContext extends ParserRuleContext {
		public IgnoreContext ignore() {
			return getRuleContext(IgnoreContext.class,0);
		}
		public DogContext dog() {
			return getRuleContext(DogContext.class,0);
		}
		public AnchorContext anchor() {
			return getRuleContext(AnchorContext.class,0);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(21);
				ignore();
				}
				break;
			case 2:
				{
				setState(22);
				dog();
				}
				break;
			case 3:
				{
				setState(23);
				anchor();
				}
				break;
			case 4:
				{
				setState(24);
				subject();
				}
				break;
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

	public static class SubjectContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MyLanguageParser.OPEN_BRACKET, 0); }
		public TerminalNode SUBJECT() { return getToken(MyLanguageParser.SUBJECT, 0); }
		public TerminalNode CLOZING_BRACKET() { return getToken(MyLanguageParser.CLOZING_BRACKET, 0); }
		public TerminalNode CRLF() { return getToken(MyLanguageParser.CRLF, 0); }
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(OPEN_BRACKET);
			setState(28);
			match(SUBJECT);
			setState(29);
			match(CLOZING_BRACKET);
			setState(30);
			match(CRLF);
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

	public static class AnchorContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MyLanguageParser.OPEN_BRACKET, 0); }
		public TerminalNode ANCHOR() { return getToken(MyLanguageParser.ANCHOR, 0); }
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public TerminalNode CLOZING_BRACKET() { return getToken(MyLanguageParser.CLOZING_BRACKET, 0); }
		public TerminalNode CRLF() { return getToken(MyLanguageParser.CRLF, 0); }
		public AnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAnchor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAnchor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anchor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(OPEN_BRACKET);
			setState(33);
			match(ANCHOR);
			setState(34);
			match(T__0);
			setState(35);
			group();
			setState(36);
			match(CLOZING_BRACKET);
			setState(37);
			match(CRLF);
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

	public static class DogContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(MyLanguageParser.OPEN_BRACKET, 0); }
		public TerminalNode DOG() { return getToken(MyLanguageParser.DOG, 0); }
		public StudentContext student() {
			return getRuleContext(StudentContext.class,0);
		}
		public TerminalNode CLOZING_BRACKET() { return getToken(MyLanguageParser.CLOZING_BRACKET, 0); }
		public TerminalNode CRLF() { return getToken(MyLanguageParser.CRLF, 0); }
		public DogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterDog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitDog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitDog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DogContext dog() throws RecognitionException {
		DogContext _localctx = new DogContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(OPEN_BRACKET);
			setState(40);
			match(DOG);
			setState(41);
			match(T__0);
			setState(42);
			student();
			setState(43);
			match(CLOZING_BRACKET);
			setState(44);
			match(CRLF);
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

	public static class StudentContext extends ParserRuleContext {
		public List<TerminalNode> AGE() { return getTokens(MyLanguageParser.AGE); }
		public TerminalNode AGE(int i) {
			return getToken(MyLanguageParser.AGE, i);
		}
		public List<TerminalNode> GROUP() { return getTokens(MyLanguageParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(MyLanguageParser.GROUP, i);
		}
		public List<TerminalNode> STUDENT() { return getTokens(MyLanguageParser.STUDENT); }
		public TerminalNode STUDENT(int i) {
			return getToken(MyLanguageParser.STUDENT, i);
		}
		public StudentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_student; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterStudent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitStudent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitStudent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StudentContext student() throws RecognitionException {
		StudentContext _localctx = new StudentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_student);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(46);
					match(AGE);
					setState(47);
					match(T__0);
					setState(48);
					match(GROUP);
					setState(49);
					match(T__0);
					setState(50);
					match(STUDENT);
					setState(51);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class GroupContext extends ParserRuleContext {
		public List<TerminalNode> GROUP() { return getTokens(MyLanguageParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(MyLanguageParser.GROUP, i);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_group);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(56);
					match(GROUP);
					setState(57);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IgnoreContext extends ParserRuleContext {
		public TerminalNode IGNORE_COMMENT() { return getToken(MyLanguageParser.IGNORE_COMMENT, 0); }
		public TerminalNode CRLF() { return getToken(MyLanguageParser.CRLF, 0); }
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitIgnore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitIgnore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ignore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IGNORE_COMMENT);
			setState(63);
			match(CRLF);
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
		"\u0004\u0001\rB\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0004\u00055\b\u0005\u000b\u0005\f\u00056\u0001\u0006\u0001\u0006\u0004"+
		"\u0006;\b\u0006\u000b\u0006\f\u0006<\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u00026<\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000"+
		"\u0000?\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000"+
		"\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006 \u0001\u0000\u0000\u0000"+
		"\b\'\u0001\u0000\u0000\u0000\n4\u0001\u0000\u0000\u0000\f:\u0001\u0000"+
		"\u0000\u0000\u000e>\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001"+
		"\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000"+
		"\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u001a\u0003\u000e\u0007"+
		"\u0000\u0016\u001a\u0003\b\u0004\u0000\u0017\u001a\u0003\u0006\u0003\u0000"+
		"\u0018\u001a\u0003\u0004\u0002\u0000\u0019\u0015\u0001\u0000\u0000\u0000"+
		"\u0019\u0016\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0005\u0002\u0000\u0000\u001c\u001d\u0005\f\u0000\u0000\u001d"+
		"\u001e\u0005\u0003\u0000\u0000\u001e\u001f\u0005\u0007\u0000\u0000\u001f"+
		"\u0005\u0001\u0000\u0000\u0000 !\u0005\u0002\u0000\u0000!\"\u0005\u0005"+
		"\u0000\u0000\"#\u0005\u0001\u0000\u0000#$\u0003\f\u0006\u0000$%\u0005"+
		"\u0003\u0000\u0000%&\u0005\u0007\u0000\u0000&\u0007\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0002\u0000\u0000()\u0005\u0006\u0000\u0000)*\u0005\u0001"+
		"\u0000\u0000*+\u0003\n\u0005\u0000+,\u0005\u0003\u0000\u0000,-\u0005\u0007"+
		"\u0000\u0000-\t\u0001\u0000\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0005"+
		"\u0001\u0000\u000001\u0005\t\u0000\u000012\u0005\u0001\u0000\u000023\u0005"+
		"\n\u0000\u000035\u0005\u0001\u0000\u00004.\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"7\u000b\u0001\u0000\u0000\u000089\u0005\t\u0000\u00009;\u0005\u0001\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000=\r\u0001\u0000\u0000\u0000>?\u0005"+
		"\r\u0000\u0000?@\u0005\u0007\u0000\u0000@\u000f\u0001\u0000\u0000\u0000"+
		"\u0004\u0013\u00196<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}