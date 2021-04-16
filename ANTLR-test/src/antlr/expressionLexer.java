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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, KEYWORD=9, 
		INT=10, SSA=11, LIST=12, ID=13, NUM=14, COMMENT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "KEYWORD", 
			"INT", "SSA", "LIST", "ID", "NUM", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'=>'", "'('", "')'", "'*'", "'/'", "'-'", "'+'", null, 
			"'int'", "'ssa'", "'list'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "KEYWORD", "INT", 
			"SSA", "LIST", "ID", "NUM", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nQ\n\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16b\n\16\f\16\16\16e\13\16"+
		"\3\17\3\17\5\17i\n\17\3\17\3\17\7\17m\n\17\f\17\16\17p\13\17\5\17r\n\17"+
		"\3\20\3\20\3\20\3\20\7\20x\n\20\f\20\16\20{\13\20\3\20\3\20\3\21\6\21"+
		"\u0080\n\21\r\21\16\21\u0081\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\b\3\2c|\6\2"+
		"\62;C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u008d\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2"+
		"\2\5%\3\2\2\2\7(\3\2\2\2\t*\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60\3\2\2"+
		"\2\21\62\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27V\3\2\2\2\31Z\3\2\2\2\33_\3"+
		"\2\2\2\35q\3\2\2\2\37s\3\2\2\2!\177\3\2\2\2#$\7<\2\2$\4\3\2\2\2%&\7?\2"+
		"\2&\'\7@\2\2\'\6\3\2\2\2()\7*\2\2)\b\3\2\2\2*+\7+\2\2+\n\3\2\2\2,-\7,"+
		"\2\2-\f\3\2\2\2./\7\61\2\2/\16\3\2\2\2\60\61\7/\2\2\61\20\3\2\2\2\62\63"+
		"\7-\2\2\63\22\3\2\2\2\64\65\7u\2\2\65\66\7r\2\2\66\67\7g\2\2\678\7e\2"+
		"\289\7k\2\29:\7g\2\2:Q\7u\2\2;<\7u\2\2<=\7q\2\2=>\7n\2\2>?\7w\2\2?@\7"+
		"v\2\2@A\7k\2\2AB\7q\2\2BQ\7p\2\2CD\7t\2\2DE\7g\2\2EF\7c\2\2FG\7e\2\2G"+
		"H\7v\2\2HI\7k\2\2IJ\7q\2\2JQ\7p\2\2KL\7r\2\2LM\7t\2\2MN\7k\2\2NO\7p\2"+
		"\2OQ\7v\2\2P\64\3\2\2\2P;\3\2\2\2PC\3\2\2\2PK\3\2\2\2Q\24\3\2\2\2RS\7"+
		"k\2\2ST\7p\2\2TU\7v\2\2U\26\3\2\2\2VW\7u\2\2WX\7u\2\2XY\7c\2\2Y\30\3\2"+
		"\2\2Z[\7n\2\2[\\\7k\2\2\\]\7u\2\2]^\7v\2\2^\32\3\2\2\2_c\t\2\2\2`b\t\3"+
		"\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\34\3\2\2\2ec\3\2\2\2fr\7"+
		"\62\2\2gi\7/\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jn\t\4\2\2km\t\5\2\2lk\3"+
		"\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qf\3\2\2\2qh\3"+
		"\2\2\2r\36\3\2\2\2st\7\61\2\2tu\7\61\2\2uy\3\2\2\2vx\n\6\2\2wv\3\2\2\2"+
		"x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\b\20\2\2} \3\2\2"+
		"\2~\u0080\t\7\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\21\3\2\u0084\"\3\2\2"+
		"\2\n\2Pchnqy\u0081\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}