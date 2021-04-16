// Generated from d:\5. - School\AAU\4. Semester\1. Project\2. Coding\P4\ANTLR-test\src\antlr\expression.g4 by ANTLR 4.8

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class expressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, KEYWORD=11, INT=12, SSA=13, LIST=14, LOGOP=15, BOOLOP=16, BOOL=17, 
		ID=18, NUM=19, COMMENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "KEYWORD", "INT", "SSA", "LIST", "LOGOP", "BOOLOP", "BOOL", "ID", 
			"NUM", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'=>'", "'('", "')'", "'*'", "'/'", "'-'", "'+'", "'{'", 
			"'}'", null, "'int'", "'ssa'", "'list'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "KEYWORD", 
			"INT", "SSA", "LIST", "LOGOP", "BOOLOP", "BOOL", "ID", "NUM", "COMMENT", 
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


	public expressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "expression.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0083"+
		"\n\20\3\21\3\21\3\21\3\21\5\21\u0089\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0094\n\22\3\23\3\23\7\23\u0098\n\23\f\23\16\23\u009b"+
		"\13\23\3\24\3\24\5\24\u009f\n\24\3\24\3\24\7\24\u00a3\n\24\f\24\16\24"+
		"\u00a6\13\24\5\24\u00a8\n\24\3\25\3\25\3\25\3\25\7\25\u00ae\n\25\f\25"+
		"\16\25\u00b1\13\25\3\25\3\25\3\26\6\26\u00b6\n\26\r\26\16\26\u00b7\3\26"+
		"\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\b\3\2c|\6\2\62;C\\aac"+
		"|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00cd\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\62\3\2\2"+
		"\2\t\64\3\2\2\2\13\66\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3"+
		"\2\2\2\25@\3\2\2\2\27i\3\2\2\2\31k\3\2\2\2\33o\3\2\2\2\35s\3\2\2\2\37"+
		"\u0082\3\2\2\2!\u0088\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u00a7\3"+
		"\2\2\2)\u00a9\3\2\2\2+\u00b5\3\2\2\2-.\7<\2\2.\4\3\2\2\2/\60\7?\2\2\60"+
		"\61\7@\2\2\61\6\3\2\2\2\62\63\7*\2\2\63\b\3\2\2\2\64\65\7+\2\2\65\n\3"+
		"\2\2\2\66\67\7,\2\2\67\f\3\2\2\289\7\61\2\29\16\3\2\2\2:;\7/\2\2;\20\3"+
		"\2\2\2<=\7-\2\2=\22\3\2\2\2>?\7}\2\2?\24\3\2\2\2@A\7\177\2\2A\26\3\2\2"+
		"\2BC\7u\2\2CD\7r\2\2DE\7g\2\2EF\7e\2\2FG\7k\2\2GH\7g\2\2Hj\7u\2\2IJ\7"+
		"u\2\2JK\7q\2\2KL\7n\2\2LM\7w\2\2MN\7v\2\2NO\7k\2\2OP\7q\2\2Pj\7p\2\2Q"+
		"R\7t\2\2RS\7g\2\2ST\7c\2\2TU\7e\2\2UV\7v\2\2VW\7k\2\2WX\7q\2\2Xj\7p\2"+
		"\2YZ\7r\2\2Z[\7t\2\2[\\\7k\2\2\\]\7p\2\2]j\7v\2\2^_\7y\2\2_`\7j\2\2`a"+
		"\7k\2\2ab\7n\2\2bj\7g\2\2cd\7k\2\2dj\7h\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2"+
		"hj\7g\2\2iB\3\2\2\2iI\3\2\2\2iQ\3\2\2\2iY\3\2\2\2i^\3\2\2\2ic\3\2\2\2"+
		"ie\3\2\2\2j\30\3\2\2\2kl\7k\2\2lm\7p\2\2mn\7v\2\2n\32\3\2\2\2op\7u\2\2"+
		"pq\7u\2\2qr\7c\2\2r\34\3\2\2\2st\7n\2\2tu\7k\2\2uv\7u\2\2vw\7v\2\2w\36"+
		"\3\2\2\2x\u0083\7>\2\2yz\7>\2\2z\u0083\7?\2\2{\u0083\7@\2\2|}\7@\2\2}"+
		"\u0083\7?\2\2~\177\7?\2\2\177\u0083\7?\2\2\u0080\u0081\7#\2\2\u0081\u0083"+
		"\7?\2\2\u0082x\3\2\2\2\u0082y\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082"+
		"~\3\2\2\2\u0082\u0080\3\2\2\2\u0083 \3\2\2\2\u0084\u0085\7~\2\2\u0085"+
		"\u0089\7~\2\2\u0086\u0087\7(\2\2\u0087\u0089\7(\2\2\u0088\u0084\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\"\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7w\2\2\u008d\u0094\7g\2\2\u008e\u008f\7h\2\2\u008f"+
		"\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0094\7g\2\2"+
		"\u0093\u008a\3\2\2\2\u0093\u008e\3\2\2\2\u0094$\3\2\2\2\u0095\u0099\t"+
		"\2\2\2\u0096\u0098\t\3\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a&\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009c\u00a8\7\62\2\2\u009d\u009f\7/\2\2\u009e\u009d\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\t\4\2\2\u00a1\u00a3\t\5\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7"+
		"\u009e\3\2\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7\61\2"+
		"\2\u00ab\u00af\3\2\2\2\u00ac\u00ae\n\6\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\b\25\2\2\u00b3*\3\2\2\2\u00b4\u00b6\t\7\2\2"+
		"\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\26\3\2\u00ba,\3\2\2\2\r\2i"+
		"\u0082\u0088\u0093\u0099\u009e\u00a4\u00a7\u00af\u00b7\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}