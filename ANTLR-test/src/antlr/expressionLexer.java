// Generated from expression.g4 by ANTLR 4.9.1

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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, REAC=7, ADD=8, MULT=9, 
		KEYWORD=10, INT=11, SSA=12, LIST=13, ID=14, NUM=15, COMMENT=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "REAC", "ADD", "MULT", 
			"KEYWORD", "INT", "SSA", "LIST", "ID", "NUM", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "'}'", "'('", "')'", "','", null, "'+'", "'*'", null, 
			"'int'", "'ssa'", "'list'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "REAC", "ADD", "MULT", "KEYWORD", 
			"INT", "SSA", "LIST", "ID", "NUM", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b9\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13[\n\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17l\n\17\f\17\16\17"+
		"o\13\17\3\20\3\20\5\20s\n\20\3\20\3\20\7\20w\n\20\f\20\16\20z\13\20\5"+
		"\20|\n\20\3\21\3\21\3\21\3\21\7\21\u0082\n\21\f\21\16\21\u0085\13\21\3"+
		"\21\3\21\3\22\6\22\u008a\n\22\r\22\16\22\u008b\3\22\3\22\2\2\23\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23\3\2\b\3\2c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2"+
		"\13\f\17\17\"\"\2\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2"+
		"\2\13-\3\2\2\2\r/\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25Z\3\2"+
		"\2\2\27\\\3\2\2\2\31`\3\2\2\2\33d\3\2\2\2\35i\3\2\2\2\37{\3\2\2\2!}\3"+
		"\2\2\2#\u0089\3\2\2\2%&\7<\2\2&\4\3\2\2\2\'(\7}\2\2(\6\3\2\2\2)*\7\177"+
		"\2\2*\b\3\2\2\2+,\7*\2\2,\n\3\2\2\2-.\7+\2\2.\f\3\2\2\2/\60\7.\2\2\60"+
		"\16\3\2\2\2\61\62\7?\2\2\629\7@\2\2\63\64\7>\2\2\64\65\7?\2\2\659\7@\2"+
		"\2\66\67\7>\2\2\679\7?\2\28\61\3\2\2\28\63\3\2\2\28\66\3\2\2\29\20\3\2"+
		"\2\2:;\7-\2\2;\22\3\2\2\2<=\7,\2\2=\24\3\2\2\2>?\7u\2\2?@\7r\2\2@A\7g"+
		"\2\2AB\7e\2\2BC\7k\2\2CD\7g\2\2D[\7u\2\2EF\7u\2\2FG\7q\2\2GH\7n\2\2HI"+
		"\7w\2\2IJ\7v\2\2JK\7k\2\2KL\7q\2\2L[\7p\2\2MN\7t\2\2NO\7g\2\2OP\7c\2\2"+
		"PQ\7e\2\2QR\7v\2\2RS\7k\2\2ST\7q\2\2T[\7p\2\2UV\7r\2\2VW\7t\2\2WX\7k\2"+
		"\2XY\7p\2\2Y[\7v\2\2Z>\3\2\2\2ZE\3\2\2\2ZM\3\2\2\2ZU\3\2\2\2[\26\3\2\2"+
		"\2\\]\7k\2\2]^\7p\2\2^_\7v\2\2_\30\3\2\2\2`a\7u\2\2ab\7u\2\2bc\7c\2\2"+
		"c\32\3\2\2\2de\7n\2\2ef\7k\2\2fg\7u\2\2gh\7v\2\2h\34\3\2\2\2im\t\2\2\2"+
		"jl\t\3\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\36\3\2\2\2om\3\2\2"+
		"\2p|\7\62\2\2qs\7/\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tx\t\4\2\2uw\t\5\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{p\3\2\2"+
		"\2{r\3\2\2\2| \3\2\2\2}~\7\61\2\2~\177\7\61\2\2\177\u0083\3\2\2\2\u0080"+
		"\u0082\n\6\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\b\21\2\2\u0087\"\3\2\2\2\u0088\u008a\t\7\2\2\u0089\u0088\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\b\22\3\2\u008e$\3\2\2\2\13\28Zmrx{\u0083\u008b\4"+
		"\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}