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
		T__9=10, T__10=11, KEYWORD=12, ID=13, NUM=14, COMMENT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "KEYWORD", "ID", "NUM", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "'{'", "'}'", "','", "'=>'", "'<=>'", "'<='", 
			"'*'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"KEYWORD", "ID", "NUM", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r]\n\r\3\16\3\16\7\16a\n\16\f\16\16\16d\13\16\3\17\3"+
		"\17\5\17h\n\17\3\17\3\17\7\17l\n\17\f\17\16\17o\13\17\5\17q\n\17\3\20"+
		"\3\20\3\20\3\20\7\20w\n\20\f\20\16\20z\13\20\3\20\3\20\3\21\6\21\177\n"+
		"\21\r\21\16\21\u0080\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\b\3\2c|\6\2\62;C\\"+
		"aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u008d\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3"+
		"\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21\62"+
		"\3\2\2\2\23\66\3\2\2\2\259\3\2\2\2\27;\3\2\2\2\31\\\3\2\2\2\33^\3\2\2"+
		"\2\35p\3\2\2\2\37r\3\2\2\2!~\3\2\2\2#$\7<\2\2$\4\3\2\2\2%&\7*\2\2&\6\3"+
		"\2\2\2\'(\7+\2\2(\b\3\2\2\2)*\7}\2\2*\n\3\2\2\2+,\7\177\2\2,\f\3\2\2\2"+
		"-.\7.\2\2.\16\3\2\2\2/\60\7?\2\2\60\61\7@\2\2\61\20\3\2\2\2\62\63\7>\2"+
		"\2\63\64\7?\2\2\64\65\7@\2\2\65\22\3\2\2\2\66\67\7>\2\2\678\7?\2\28\24"+
		"\3\2\2\29:\7,\2\2:\26\3\2\2\2;<\7-\2\2<\30\3\2\2\2=>\7u\2\2>?\7r\2\2?"+
		"@\7g\2\2@A\7e\2\2AB\7k\2\2BC\7g\2\2C]\7u\2\2DE\7k\2\2EF\7p\2\2F]\7v\2"+
		"\2GH\7u\2\2HI\7q\2\2IJ\7n\2\2JK\7w\2\2KL\7v\2\2LM\7k\2\2MN\7q\2\2N]\7"+
		"p\2\2OP\7t\2\2PQ\7g\2\2QR\7c\2\2RS\7e\2\2ST\7v\2\2TU\7k\2\2UV\7q\2\2V"+
		"]\7p\2\2WX\7r\2\2XY\7t\2\2YZ\7k\2\2Z[\7p\2\2[]\7v\2\2\\=\3\2\2\2\\D\3"+
		"\2\2\2\\G\3\2\2\2\\O\3\2\2\2\\W\3\2\2\2]\32\3\2\2\2^b\t\2\2\2_a\t\3\2"+
		"\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\34\3\2\2\2db\3\2\2\2eq\7\62"+
		"\2\2fh\7/\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2im\t\4\2\2jl\t\5\2\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pe\3\2\2\2pg\3\2"+
		"\2\2q\36\3\2\2\2rs\7\61\2\2st\7\61\2\2tx\3\2\2\2uw\n\6\2\2vu\3\2\2\2w"+
		"z\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\b\20\2\2| \3\2\2\2"+
		"}\177\t\7\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\21\2\2\u0083\"\3\2\2\2\n\2\\"+
		"bgmpx\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}