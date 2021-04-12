// Generated from c:\Users\adamm\Documents\GitHub\P4\ANTLR-test\src\antlr\expression.g4 by ANTLR 4.8

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
		T__0=1, T__1=2, T__2=3, REAC=4, ADD=5, MULT=6, KEYWORD=7, INT=8, SSA=9, 
		LIST=10, ID=11, NUM=12, COMMENT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "REAC", "ADD", "MULT", "KEYWORD", "INT", "SSA", 
			"LIST", "ID", "NUM", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", null, "'+'", "'*'", null, "'int'", "'ssa'", 
			"'list'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "REAC", "ADD", "MULT", "KEYWORD", "INT", "SSA", 
			"LIST", "ID", "NUM", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\7\f`\n\f\f\f\16\fc\13\f\3\r\3\r\5\rg\n\r"+
		"\3\r\3\r\7\rk\n\r\f\r\16\rn\13\r\5\rp\n\r\3\16\3\16\3\16\3\16\7\16v\n"+
		"\16\f\16\16\16y\13\16\3\16\3\16\3\17\6\17~\n\17\r\17\16\17\177\3\17\3"+
		"\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\3\2\b\3\2c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2"+
		"\13\f\17\17\"\"\2\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2"+
		"\2\2\5!\3\2\2\2\7#\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\17N\3\2"+
		"\2\2\21P\3\2\2\2\23T\3\2\2\2\25X\3\2\2\2\27]\3\2\2\2\31o\3\2\2\2\33q\3"+
		"\2\2\2\35}\3\2\2\2\37 \7<\2\2 \4\3\2\2\2!\"\7*\2\2\"\6\3\2\2\2#$\7+\2"+
		"\2$\b\3\2\2\2%&\7?\2\2&-\7@\2\2\'(\7>\2\2()\7?\2\2)-\7@\2\2*+\7>\2\2+"+
		"-\7?\2\2,%\3\2\2\2,\'\3\2\2\2,*\3\2\2\2-\n\3\2\2\2./\7-\2\2/\f\3\2\2\2"+
		"\60\61\7,\2\2\61\16\3\2\2\2\62\63\7u\2\2\63\64\7r\2\2\64\65\7g\2\2\65"+
		"\66\7e\2\2\66\67\7k\2\2\678\7g\2\28O\7u\2\29:\7u\2\2:;\7q\2\2;<\7n\2\2"+
		"<=\7w\2\2=>\7v\2\2>?\7k\2\2?@\7q\2\2@O\7p\2\2AB\7t\2\2BC\7g\2\2CD\7c\2"+
		"\2DE\7e\2\2EF\7v\2\2FG\7k\2\2GH\7q\2\2HO\7p\2\2IJ\7r\2\2JK\7t\2\2KL\7"+
		"k\2\2LM\7p\2\2MO\7v\2\2N\62\3\2\2\2N9\3\2\2\2NA\3\2\2\2NI\3\2\2\2O\20"+
		"\3\2\2\2PQ\7k\2\2QR\7p\2\2RS\7v\2\2S\22\3\2\2\2TU\7u\2\2UV\7u\2\2VW\7"+
		"c\2\2W\24\3\2\2\2XY\7n\2\2YZ\7k\2\2Z[\7u\2\2[\\\7v\2\2\\\26\3\2\2\2]a"+
		"\t\2\2\2^`\t\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\30\3\2\2\2"+
		"ca\3\2\2\2dp\7\62\2\2eg\7/\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hl\t\4\2\2"+
		"ik\t\5\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"od\3\2\2\2of\3\2\2\2p\32\3\2\2\2qr\7\61\2\2rs\7\61\2\2sw\3\2\2\2tv\n\6"+
		"\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\b\16"+
		"\2\2{\34\3\2\2\2|~\t\7\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\17\3\2\u0082\36\3\2\2\2\13"+
		"\2,Naflow\177\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}