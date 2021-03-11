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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, KEYWORD=7, ID=8, NUM=9, 
		COMMENT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "KEYWORD", "ID", "NUM", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "'=>'", "'+'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "KEYWORD", "ID", "NUM", "COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rr\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bK\n\b\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t\3\n\3\n\5\nV\n\n\3\n\3\n\7\nZ"+
		"\n\n\f\n\16\n]\13\n\5\n_\n\n\3\13\3\13\3\13\3\13\7\13e\n\13\f\13\16\13"+
		"h\13\13\3\13\3\13\3\f\6\fm\n\f\r\f\16\fn\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\b\3\2c|\6\2\62;C\\aac|\3\2\63"+
		";\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2{\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2"+
		"\2\7\35\3\2\2\2\t\37\3\2\2\2\13\"\3\2\2\2\r$\3\2\2\2\17J\3\2\2\2\21L\3"+
		"\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27l\3\2\2\2\31\32\7<\2\2\32\4\3\2\2\2\33"+
		"\34\7*\2\2\34\6\3\2\2\2\35\36\7+\2\2\36\b\3\2\2\2\37 \7?\2\2 !\7@\2\2"+
		"!\n\3\2\2\2\"#\7-\2\2#\f\3\2\2\2$%\7.\2\2%\16\3\2\2\2&\'\7U\2\2\'(\7r"+
		"\2\2()\7g\2\2)*\7e\2\2*+\7k\2\2+,\7g\2\2,K\7u\2\2-.\7E\2\2./\7q\2\2/\60"+
		"\7p\2\2\60\61\7u\2\2\61\62\7v\2\2\62\63\7c\2\2\63\64\7p\2\2\64K\7v\2\2"+
		"\65\66\7U\2\2\66\67\7q\2\2\678\7n\2\289\7w\2\29:\7v\2\2:;\7k\2\2;<\7q"+
		"\2\2<K\7p\2\2=>\7T\2\2>?\7g\2\2?@\7c\2\2@A\7e\2\2AB\7v\2\2BC\7k\2\2CD"+
		"\7q\2\2DK\7p\2\2EF\7R\2\2FG\7t\2\2GH\7k\2\2HI\7p\2\2IK\7v\2\2J&\3\2\2"+
		"\2J-\3\2\2\2J\65\3\2\2\2J=\3\2\2\2JE\3\2\2\2K\20\3\2\2\2LP\t\2\2\2MO\t"+
		"\3\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\22\3\2\2\2RP\3\2\2\2S"+
		"_\7\62\2\2TV\7/\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W[\t\4\2\2XZ\t\5\2\2"+
		"YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^S\3\2\2"+
		"\2^U\3\2\2\2_\24\3\2\2\2`a\7\61\2\2ab\7\61\2\2bf\3\2\2\2ce\n\6\2\2dc\3"+
		"\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\b\13\2\2j\26"+
		"\3\2\2\2km\t\7\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2p"+
		"q\b\f\2\2q\30\3\2\2\2\n\2JPU[^fn\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}