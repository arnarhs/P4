// Generated from expression.g4 by ANTLR 4.9.1

	package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class expressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		KEYWORD=10, ID=11, NUM=12, COMMENT=13, WS=14;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_expr = 2, RULE_parameters = 3, RULE_parameter = 4, 
		RULE_value = 5, RULE_id = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "expr", "parameters", "parameter", "value", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "'{'", "'}'", "'=>'", "'+'", "'*'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "KEYWORD", 
			"ID", "NUM", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public expressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(expressionParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(16);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(14);
					decl();
					}
					break;
				case 2:
					{
					setState(15);
					expr(0);
					}
					break;
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << ID) | (1L << NUM))) != 0) );
			setState(20);
			match(EOF);
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(expressionParser.KEYWORD, 0); }
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(KEYWORD);
				setState(23);
				match(ID);
				setState(24);
				match(T__0);
				setState(25);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(KEYWORD);
				setState(27);
				match(ID);
				setState(28);
				match(T__1);
				setState(29);
				parameters(0);
				setState(30);
				match(T__2);
				setState(31);
				match(T__3);
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(34);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(32);
						decl();
						}
						break;
					case 2:
						{
						setState(33);
						expr(0);
						}
						break;
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << ID) | (1L << NUM))) != 0) );
				setState(38);
				match(T__4);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public TerminalNode KEYWORD() { return getToken(expressionParser.KEYWORD, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==KEYWORD || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(44);
				match(T__1);
				setState(45);
				expr(0);
				setState(46);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(48);
				match(ID);
				setState(49);
				match(T__1);
				setState(50);
				parameters(0);
				setState(51);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(53);
				value();
				setState(54);
				match(T__7);
				setState(55);
				value();
				}
				break;
			case 4:
				{
				setState(57);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(61);
						match(T__5);
						setState(62);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(64);
						match(T__6);
						setState(65);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67);
						match(T__5);
						setState(68);
						expr(0);
						setState(69);
						match(T__1);
						setState(70);
						value();
						setState(71);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		return parameters(0);
	}

	private ParametersContext parameters(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParametersContext _localctx = new ParametersContext(_ctx, _parentState);
		ParametersContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_parameters, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(79);
			parameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameters);
					setState(81);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(82);
					match(T__8);
					setState(83);
					parameter();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(expressionParser.KEYWORD, 0); }
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(KEYWORD);
				setState(90);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				value();
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(expressionParser.NUM, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(NUM);
				}
				break;
			case KEYWORD:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(expressionParser.KEYWORD, 0); }
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==KEYWORD || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 3:
			return parameters_sempred((ParametersContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean parameters_sempred(ParametersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3%\n\3\r"+
		"\3\16\3&\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5W\n\5"+
		"\f\5\16\5Z\13\5\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\5\7c\n\7\3\b\3\b\3\b\2\4"+
		"\6\b\t\2\4\6\b\n\f\16\2\3\3\2\f\r\2m\2\22\3\2\2\2\4*\3\2\2\2\6<\3\2\2"+
		"\2\bP\3\2\2\2\n^\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20\23\5\4\3\2\21\23\5"+
		"\6\4\2\22\20\3\2\2\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3"+
		"\2\2\2\25\26\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\31\7\f\2\2\31\32\7"+
		"\r\2\2\32\33\7\3\2\2\33+\5\6\4\2\34\35\7\f\2\2\35\36\7\r\2\2\36\37\7\4"+
		"\2\2\37 \5\b\5\2 !\7\5\2\2!$\7\6\2\2\"%\5\4\3\2#%\5\6\4\2$\"\3\2\2\2$"+
		"#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7\7\2\2)+\3\2\2"+
		"\2*\30\3\2\2\2*\34\3\2\2\2+\5\3\2\2\2,-\b\4\1\2-.\t\2\2\2./\7\4\2\2/\60"+
		"\5\6\4\2\60\61\7\5\2\2\61=\3\2\2\2\62\63\7\r\2\2\63\64\7\4\2\2\64\65\5"+
		"\b\5\2\65\66\7\5\2\2\66=\3\2\2\2\678\5\f\7\289\7\n\2\29:\5\f\7\2:=\3\2"+
		"\2\2;=\5\f\7\2<,\3\2\2\2<\62\3\2\2\2<\67\3\2\2\2<;\3\2\2\2=M\3\2\2\2>"+
		"?\f\b\2\2?@\7\b\2\2@L\5\6\4\tAB\f\7\2\2BC\7\t\2\2CL\5\6\4\bDE\f\t\2\2"+
		"EF\7\b\2\2FG\5\6\4\2GH\7\4\2\2HI\5\f\7\2IJ\7\5\2\2JL\3\2\2\2K>\3\2\2\2"+
		"KA\3\2\2\2KD\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OM\3\2\2"+
		"\2PQ\b\5\1\2QR\5\n\6\2RX\3\2\2\2ST\f\4\2\2TU\7\13\2\2UW\5\n\6\2VS\3\2"+
		"\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\t\3\2\2\2ZX\3\2\2\2[\\\7\f\2\2\\_"+
		"\7\r\2\2]_\5\f\7\2^[\3\2\2\2^]\3\2\2\2_\13\3\2\2\2`c\7\16\2\2ac\5\16\b"+
		"\2b`\3\2\2\2ba\3\2\2\2c\r\3\2\2\2de\t\2\2\2e\17\3\2\2\2\r\22\24$&*<KM"+
		"X^b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}