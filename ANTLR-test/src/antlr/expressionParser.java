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
		T__0=1, T__1=2, T__2=3, REAC=4, ADD=5, MULT=6, KEYWORD=7, INT=8, SSA=9, 
		LIST=10, ID=11, NUM=12, COMMENT=13, WS=14;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declReaction = 2, RULE_declInt = 3, 
		RULE_expr = 4, RULE_valueExpr = 5, RULE_opExpr = 6, RULE_value = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declReaction", "declInt", "expr", "valueExpr", "opExpr", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "'=>'", "'+'", "'*'", null, "'int'", "'ssa'", 
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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
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
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(18);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case INT:
					{
					setState(16);
					decl();
					}
					break;
				case ID:
				case NUM:
					{
					setState(17);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << INT) | (1L << ID) | (1L << NUM))) != 0) );
			setState(22);
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
		public DeclReactionContext declReaction() {
			return getRuleContext(DeclReactionContext.class,0);
		}
		public DeclIntContext declInt() {
			return getRuleContext(DeclIntContext.class,0);
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
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				declReaction();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				declInt();
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

	public static class DeclReactionContext extends ParserRuleContext {
		public DeclReactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declReaction; }
	 
		public DeclReactionContext() { }
		public void copyFrom(DeclReactionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReacDeclContext extends DeclReactionContext {
		public TerminalNode KEYWORD() { return getToken(expressionParser.KEYWORD, 0); }
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public ReacDeclContext(DeclReactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterReacDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitReacDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitReacDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReacDeclAssignmentContext extends DeclReactionContext {
		public TerminalNode KEYWORD() { return getToken(expressionParser.KEYWORD, 0); }
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public ReacDeclAssignmentContext(DeclReactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterReacDeclAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitReacDeclAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitReacDeclAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclReactionContext declReaction() throws RecognitionException {
		DeclReactionContext _localctx = new DeclReactionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declReaction);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ReacDeclAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(KEYWORD);
				setState(29);
				match(ID);
				setState(30);
				match(T__0);
				setState(31);
				valueExpr();
				}
				break;
			case 2:
				_localctx = new ReacDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(KEYWORD);
				setState(33);
				match(ID);
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

	public static class DeclIntContext extends ParserRuleContext {
		public DeclIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declInt; }
	 
		public DeclIntContext() { }
		public void copyFrom(DeclIntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntDeclAssignmentContext extends DeclIntContext {
		public TerminalNode INT() { return getToken(expressionParser.INT, 0); }
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public IntDeclAssignmentContext(DeclIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterIntDeclAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitIntDeclAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitIntDeclAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDeclContext extends DeclIntContext {
		public TerminalNode INT() { return getToken(expressionParser.INT, 0); }
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public IntDeclContext(DeclIntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterIntDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitIntDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitIntDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclIntContext declInt() throws RecognitionException {
		DeclIntContext _localctx = new DeclIntContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declInt);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IntDeclAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(INT);
				setState(37);
				match(ID);
				setState(38);
				match(T__0);
				setState(39);
				valueExpr();
				}
				break;
			case 2:
				_localctx = new IntDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(INT);
				setState(41);
				match(ID);
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
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
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
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			valueExpr();
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

	public static class ValueExprContext extends ParserRuleContext {
		public ValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpr; }
	 
		public ValueExprContext() { }
		public void copyFrom(ValueExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReactionExpressionConstContext extends ValueExprContext {
		public List<OpExprContext> opExpr() {
			return getRuleContexts(OpExprContext.class);
		}
		public OpExprContext opExpr(int i) {
			return getRuleContext(OpExprContext.class,i);
		}
		public TerminalNode REAC() { return getToken(expressionParser.REAC, 0); }
		public ReactionExpressionConstContext(ValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterReactionExpressionConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitReactionExpressionConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitReactionExpressionConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReactionExpressionContext extends ValueExprContext {
		public List<OpExprContext> opExpr() {
			return getRuleContexts(OpExprContext.class);
		}
		public OpExprContext opExpr(int i) {
			return getRuleContext(OpExprContext.class,i);
		}
		public TerminalNode REAC() { return getToken(expressionParser.REAC, 0); }
		public ReactionExpressionContext(ValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterReactionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitReactionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitReactionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationExpressionContext extends ValueExprContext {
		public OpExprContext opExpr() {
			return getRuleContext(OpExprContext.class,0);
		}
		public OperationExpressionContext(ValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterOperationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitOperationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitOperationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExprContext valueExpr() throws RecognitionException {
		ValueExprContext _localctx = new ValueExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valueExpr);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ReactionExpressionConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				opExpr(0);
				setState(47);
				match(REAC);
				setState(48);
				opExpr(0);
				setState(49);
				match(T__1);
				setState(50);
				opExpr(0);
				setState(51);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new ReactionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				opExpr(0);
				setState(54);
				match(REAC);
				setState(55);
				opExpr(0);
				}
				break;
			case 3:
				_localctx = new OperationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				opExpr(0);
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

	public static class OpExprContext extends ParserRuleContext {
		public OpExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opExpr; }
	 
		public OpExprContext() { }
		public void copyFrom(OpExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionExpressionContext extends OpExprContext {
		public List<OpExprContext> opExpr() {
			return getRuleContexts(OpExprContext.class);
		}
		public OpExprContext opExpr(int i) {
			return getRuleContext(OpExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(expressionParser.ADD, 0); }
		public AdditionExpressionContext(OpExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumOrIDContext extends OpExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NumOrIDContext(OpExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterNumOrID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitNumOrID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitNumOrID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExpressionContext extends OpExprContext {
		public List<OpExprContext> opExpr() {
			return getRuleContexts(OpExprContext.class);
		}
		public OpExprContext opExpr(int i) {
			return getRuleContext(OpExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(expressionParser.MULT, 0); }
		public MultiplyExpressionContext(OpExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpExprContext opExpr() throws RecognitionException {
		return opExpr(0);
	}

	private OpExprContext opExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OpExprContext _localctx = new OpExprContext(_ctx, _parentState);
		OpExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_opExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NumOrIDContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(61);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new OpExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_opExpr);
						setState(63);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(64);
						match(MULT);
						setState(65);
						opExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExpressionContext(new OpExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_opExpr);
						setState(66);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(67);
						match(ADD);
						setState(68);
						opExpr(3);
						}
						break;
					}
					} 
				}
				setState(73);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends ValueContext {
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public VariableContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ValueContext {
		public TerminalNode NUM() { return getToken(expressionParser.NUM, 0); }
		public NumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return opExpr_sempred((OpExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean opExpr_sempred(OpExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\6\2\25\n\2"+
		"\r\2\16\2\26\3\2\3\2\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4%\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bH\n\b\f\b\16\bK\13\b\3\t\3\t\5\tO\n\t\3\t\2\3\16\n\2\4\6\b\n\f\16\20"+
		"\2\2\2R\2\24\3\2\2\2\4\34\3\2\2\2\6$\3\2\2\2\b,\3\2\2\2\n.\3\2\2\2\f<"+
		"\3\2\2\2\16>\3\2\2\2\20N\3\2\2\2\22\25\5\4\3\2\23\25\5\n\6\2\24\22\3\2"+
		"\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2"+
		"\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\35\5\6\4\2\33\35\5\b\5\2\34\32\3\2"+
		"\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\7\t\2\2\37 \7\r\2\2 !\7\3\2\2!%"+
		"\5\f\7\2\"#\7\t\2\2#%\7\r\2\2$\36\3\2\2\2$\"\3\2\2\2%\7\3\2\2\2&\'\7\n"+
		"\2\2\'(\7\r\2\2()\7\3\2\2)-\5\f\7\2*+\7\n\2\2+-\7\r\2\2,&\3\2\2\2,*\3"+
		"\2\2\2-\t\3\2\2\2./\5\f\7\2/\13\3\2\2\2\60\61\5\16\b\2\61\62\7\6\2\2\62"+
		"\63\5\16\b\2\63\64\7\4\2\2\64\65\5\16\b\2\65\66\7\5\2\2\66=\3\2\2\2\67"+
		"8\5\16\b\289\7\6\2\29:\5\16\b\2:=\3\2\2\2;=\5\16\b\2<\60\3\2\2\2<\67\3"+
		"\2\2\2<;\3\2\2\2=\r\3\2\2\2>?\b\b\1\2?@\5\20\t\2@I\3\2\2\2AB\f\5\2\2B"+
		"C\7\b\2\2CH\5\16\b\6DE\f\4\2\2EF\7\7\2\2FH\5\16\b\5GA\3\2\2\2GD\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\17\3\2\2\2KI\3\2\2\2LO\7\16\2\2MO\7"+
		"\r\2\2NL\3\2\2\2NM\3\2\2\2O\21\3\2\2\2\13\24\26\34$,<GIN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}