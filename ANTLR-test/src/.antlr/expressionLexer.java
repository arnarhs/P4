// Generated from d:\5. - School\AAU\4. Semester\1. Project\2. Coding\P4\ANTLR-test\src\expression.g4 by ANTLR 4.8

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
		T__0=1, T__1=2, KEYWORD=3, ID=4, NUM=5, COMMENT=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "KEYWORD", "ID", "NUM", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "KEYWORD", "ID", "NUM", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\\\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3\5\3\5\7\5"+
		"9\n\5\f\5\16\5<\13\5\3\6\3\6\5\6@\n\6\3\6\3\6\7\6D\n\6\f\6\16\6G\13\6"+
		"\5\6I\n\6\3\7\3\7\3\7\3\7\7\7O\n\7\f\7\16\7R\13\7\3\7\3\7\3\b\6\bW\n\b"+
		"\r\b\16\bX\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\b\3\2c|\6\2"+
		"\62;C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2e\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\3\21\3\2\2\2\5\23\3\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\13H\3"+
		"\2\2\2\rJ\3\2\2\2\17V\3\2\2\2\21\22\7<\2\2\22\4\3\2\2\2\23\24\7-\2\2\24"+
		"\6\3\2\2\2\25\26\7u\2\2\26\27\7r\2\2\27\30\7g\2\2\30\31\7e\2\2\31\32\7"+
		"k\2\2\32\33\7g\2\2\33\65\7u\2\2\34\35\7k\2\2\35\36\7p\2\2\36\65\7v\2\2"+
		"\37 \7u\2\2 !\7q\2\2!\"\7n\2\2\"#\7w\2\2#$\7v\2\2$%\7k\2\2%&\7q\2\2&\65"+
		"\7p\2\2\'(\7t\2\2()\7g\2\2)*\7c\2\2*+\7e\2\2+,\7v\2\2,-\7k\2\2-.\7q\2"+
		"\2.\65\7p\2\2/\60\7r\2\2\60\61\7t\2\2\61\62\7k\2\2\62\63\7p\2\2\63\65"+
		"\7v\2\2\64\25\3\2\2\2\64\34\3\2\2\2\64\37\3\2\2\2\64\'\3\2\2\2\64/\3\2"+
		"\2\2\65\b\3\2\2\2\66:\t\2\2\2\679\t\3\2\28\67\3\2\2\29<\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;\n\3\2\2\2<:\3\2\2\2=I\7\62\2\2>@\7/\2\2?>\3\2\2\2?@\3"+
		"\2\2\2@A\3\2\2\2AE\t\4\2\2BD\t\5\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3"+
		"\2\2\2FI\3\2\2\2GE\3\2\2\2H=\3\2\2\2H?\3\2\2\2I\f\3\2\2\2JK\7\61\2\2K"+
		"L\7\61\2\2LP\3\2\2\2MO\n\6\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QS\3\2\2\2RP\3\2\2\2ST\b\7\2\2T\16\3\2\2\2UW\t\7\2\2VU\3\2\2\2WX\3\2\2"+
		"\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\b\2\2[\20\3\2\2\2\n\2\64:?EHPX\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}