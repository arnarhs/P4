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
		T__9=10, T__10=11, KEYWORD=12, INT=13, SSA=14, LIST=15, ID=16, NUM=17, 
		COMMENT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "KEYWORD", "INT", "SSA", "LIST", "ID", "NUM", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "','", "'{'", "'}'", "'=>'", "'<=>'", "'<='", 
			"'+'", "'*'", null, "'int'", "'ssaModel'", "'set'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"KEYWORD", "INT", "SSA", "LIST", "ID", "NUM", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r`\n\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\7"+
		"\21u\n\21\f\21\16\21x\13\21\3\22\3\22\5\22|\n\22\3\22\3\22\7\22\u0080"+
		"\n\22\f\22\16\22\u0083\13\22\5\22\u0085\n\22\3\23\3\23\3\23\3\23\7\23"+
		"\u008b\n\23\f\23\16\23\u008e\13\23\3\23\3\23\3\24\6\24\u0093\n\24\r\24"+
		"\16\24\u0094\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\b\3\2c|\6\2\62"+
		";C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00a0\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13"+
		"\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\218\3\2\2\2\23<\3\2\2\2\25?\3\2"+
		"\2\2\27A\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35e\3\2\2\2\37n\3\2\2\2!r\3\2"+
		"\2\2#\u0084\3\2\2\2%\u0086\3\2\2\2\'\u0092\3\2\2\2)*\7<\2\2*\4\3\2\2\2"+
		"+,\7*\2\2,\6\3\2\2\2-.\7+\2\2.\b\3\2\2\2/\60\7.\2\2\60\n\3\2\2\2\61\62"+
		"\7}\2\2\62\f\3\2\2\2\63\64\7\177\2\2\64\16\3\2\2\2\65\66\7?\2\2\66\67"+
		"\7@\2\2\67\20\3\2\2\289\7>\2\29:\7?\2\2:;\7@\2\2;\22\3\2\2\2<=\7>\2\2"+
		"=>\7?\2\2>\24\3\2\2\2?@\7-\2\2@\26\3\2\2\2AB\7,\2\2B\30\3\2\2\2CD\7u\2"+
		"\2DE\7r\2\2EF\7g\2\2FG\7e\2\2GH\7k\2\2HI\7g\2\2I`\7u\2\2JK\7u\2\2KL\7"+
		"q\2\2LM\7n\2\2MN\7w\2\2NO\7v\2\2OP\7k\2\2PQ\7q\2\2Q`\7p\2\2RS\7t\2\2S"+
		"T\7g\2\2TU\7c\2\2UV\7e\2\2VW\7v\2\2WX\7k\2\2XY\7q\2\2Y`\7p\2\2Z[\7r\2"+
		"\2[\\\7t\2\2\\]\7k\2\2]^\7p\2\2^`\7v\2\2_C\3\2\2\2_J\3\2\2\2_R\3\2\2\2"+
		"_Z\3\2\2\2`\32\3\2\2\2ab\7k\2\2bc\7p\2\2cd\7v\2\2d\34\3\2\2\2ef\7u\2\2"+
		"fg\7u\2\2gh\7c\2\2hi\7O\2\2ij\7q\2\2jk\7f\2\2kl\7g\2\2lm\7n\2\2m\36\3"+
		"\2\2\2no\7u\2\2op\7g\2\2pq\7v\2\2q \3\2\2\2rv\t\2\2\2su\t\3\2\2ts\3\2"+
		"\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\"\3\2\2\2xv\3\2\2\2y\u0085\7\62\2"+
		"\2z|\7/\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0081\t\4\2\2~\u0080\t\5\2"+
		"\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084y\3\2\2\2\u0084{\3\2"+
		"\2\2\u0085$\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7\61\2\2\u0088\u008c"+
		"\3\2\2\2\u0089\u008b\n\6\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\b\23\2\2\u0090&\3\2\2\2\u0091\u0093\t\7\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\b\24\2\2\u0097(\3\2\2\2\n\2_v{\u0081\u0084"+
		"\u008c\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}