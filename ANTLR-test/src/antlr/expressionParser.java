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
		T__9=10, KEYWORD=11, INT=12, SSA=13, LIST=14, RELOP=15, LOGOP=16, BOOL=17, 
		ID=18, NUM=19, COMMENT=20, WS=21;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declReaction = 2, RULE_declInt = 3, 
		RULE_expr = 4, RULE_valueExpr = 5, RULE_opExpr = 6, RULE_ifStmt = 7, RULE_els = 8, 
		RULE_elseifStmt = 9, RULE_elseStmt = 10, RULE_ifConds = 11, RULE_logicExpr = 12, 
		RULE_value = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declReaction", "declInt", "expr", "valueExpr", "opExpr", 
			"ifStmt", "els", "elseifStmt", "elseStmt", "ifConds", "logicExpr", "value"
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
			"INT", "SSA", "LIST", "RELOP", "LOGOP", "BOOL", "ID", "NUM", "COMMENT", 
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
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(30);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(28);
					decl();
					}
					break;
				case 2:
					{
					setState(29);
					expr();
					}
					break;
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << KEYWORD) | (1L << INT) | (1L << ID) | (1L << NUM))) != 0) );
			setState(34);
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
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				declReaction();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ReacDeclAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(KEYWORD);
				setState(41);
				match(ID);
				setState(42);
				match(T__0);
				setState(43);
				valueExpr();
				}
				break;
			case 2:
				_localctx = new ReacDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(KEYWORD);
				setState(45);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IntDeclAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(INT);
				setState(49);
				match(ID);
				setState(50);
				match(T__0);
				setState(51);
				valueExpr();
				}
				break;
			case 2:
				_localctx = new IntDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(INT);
				setState(53);
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
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				valueExpr();
				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				ifStmt();
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ReactionExpressionConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				opExpr(0);
				setState(61);
				match(T__1);
				setState(62);
				opExpr(0);
				setState(63);
				match(T__2);
				setState(64);
				opExpr(0);
				setState(65);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new ReactionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				opExpr(0);
				setState(68);
				match(T__1);
				setState(69);
				opExpr(0);
				}
				break;
			case 3:
				_localctx = new OperationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
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
	public static class BracketExpressionContext extends OpExprContext {
		public OpExprContext opExpr() {
			return getRuleContext(OpExprContext.class,0);
		}
		public BracketExpressionContext(OpExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionExpressionContext extends OpExprContext {
		public List<OpExprContext> opExpr() {
			return getRuleContexts(OpExprContext.class);
		}
		public OpExprContext opExpr(int i) {
			return getRuleContext(OpExprContext.class,i);
		}
		public SubtractionExpressionContext(OpExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterSubtractionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitSubtractionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitSubtractionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionExpressionContext extends OpExprContext {
		public List<OpExprContext> opExpr() {
			return getRuleContexts(OpExprContext.class);
		}
		public OpExprContext opExpr(int i) {
			return getRuleContext(OpExprContext.class,i);
		}
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
	public static class DivisionExpressionContext extends OpExprContext {
		public List<OpExprContext> opExpr() {
			return getRuleContexts(OpExprContext.class);
		}
		public OpExprContext opExpr(int i) {
			return getRuleContext(OpExprContext.class,i);
		}
		public DivisionExpressionContext(OpExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterDivisionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitDivisionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitDivisionExpression(this);
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				match(T__2);
				setState(76);
				opExpr(0);
				setState(77);
				match(T__3);
				}
				break;
			case ID:
			case NUM:
				{
				_localctx = new NumOrIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new OpExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_opExpr);
						setState(82);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(83);
						match(T__4);
						setState(84);
						opExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new DivisionExpressionContext(new OpExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_opExpr);
						setState(85);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(86);
						match(T__5);
						setState(87);
						opExpr(5);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionExpressionContext(new OpExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_opExpr);
						setState(88);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(89);
						match(T__6);
						setState(90);
						opExpr(4);
						}
						break;
					case 4:
						{
						_localctx = new AdditionExpressionContext(new OpExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_opExpr);
						setState(91);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(92);
						match(T__7);
						setState(93);
						opExpr(3);
						}
						break;
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class IfStmtContext extends ParserRuleContext {
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	 
		public IfStmtContext() { }
		public void copyFrom(IfStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementContext extends IfStmtContext {
		public TerminalNode KEYWORD() { return getToken(expressionParser.KEYWORD, 0); }
		public IfCondsContext ifConds() {
			return getRuleContext(IfCondsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElsContext els() {
			return getRuleContext(ElsContext.class,0);
		}
		public IfStatementContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(KEYWORD);
			setState(100);
			match(T__2);
			setState(101);
			ifConds();
			setState(102);
			match(T__3);
			setState(103);
			match(T__8);
			setState(104);
			expr();
			setState(105);
			match(T__9);
			setState(106);
			els();
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

	public static class ElsContext extends ParserRuleContext {
		public List<ElseifStmtContext> elseifStmt() {
			return getRuleContexts(ElseifStmtContext.class);
		}
		public ElseifStmtContext elseifStmt(int i) {
			return getRuleContext(ElseifStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public ElsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_els; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterEls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitEls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitEls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsContext els() throws RecognitionException {
		ElsContext _localctx = new ElsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_els);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					elseifStmt();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(114);
				elseStmt();
				}
				break;
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

	public static class ElseifStmtContext extends ParserRuleContext {
		public ElseifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifStmt; }
	 
		public ElseifStmtContext() { }
		public void copyFrom(ElseifStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfStatementContext extends ElseifStmtContext {
		public List<TerminalNode> KEYWORD() { return getTokens(expressionParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(expressionParser.KEYWORD, i);
		}
		public IfCondsContext ifConds() {
			return getRuleContext(IfCondsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseIfStatementContext(ElseifStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifStmtContext elseifStmt() throws RecognitionException {
		ElseifStmtContext _localctx = new ElseifStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseifStmt);
		try {
			_localctx = new ElseIfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(KEYWORD);
			setState(118);
			match(KEYWORD);
			setState(119);
			match(T__2);
			setState(120);
			ifConds();
			setState(121);
			match(T__3);
			setState(122);
			match(T__8);
			setState(123);
			expr();
			setState(124);
			match(T__9);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	 
		public ElseStmtContext() { }
		public void copyFrom(ElseStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStatementContext extends ElseStmtContext {
		public TerminalNode KEYWORD() { return getToken(expressionParser.KEYWORD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseStatementContext(ElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseStmt);
		try {
			_localctx = new ElseStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(KEYWORD);
			setState(127);
			match(T__8);
			setState(128);
			expr();
			setState(129);
			match(T__9);
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

	public static class IfCondsContext extends ParserRuleContext {
		public IfCondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifConds; }
	 
		public IfCondsContext() { }
		public void copyFrom(IfCondsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalOperatorContext extends IfCondsContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode LOGOP() { return getToken(expressionParser.LOGOP, 0); }
		public IfCondsContext ifConds() {
			return getRuleContext(IfCondsContext.class,0);
		}
		public LogicalOperatorContext(IfCondsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExprContext extends IfCondsContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public BooleanExprContext(IfCondsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCondsContext ifConds() throws RecognitionException {
		IfCondsContext _localctx = new IfCondsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifConds);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LogicalOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				logicExpr();
				setState(132);
				match(LOGOP);
				setState(133);
				ifConds();
				}
				break;
			case 2:
				_localctx = new BooleanExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				logicExpr();
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

	public static class LogicExprContext extends ParserRuleContext {
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
	 
		public LogicExprContext() { }
		public void copyFrom(LogicExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalOperatorContext extends LogicExprContext {
		public List<OpExprContext> opExpr() {
			return getRuleContexts(OpExprContext.class);
		}
		public OpExprContext opExpr(int i) {
			return getRuleContext(OpExprContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(expressionParser.RELOP, 0); }
		public RelationalOperatorContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitRelationalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends LogicExprContext {
		public TerminalNode BOOL() { return getToken(expressionParser.BOOL, 0); }
		public BooleanContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicExpr);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(BOOL);
				}
				break;
			case T__2:
			case ID:
			case NUM:
				_localctx = new RelationalOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				opExpr(0);
				setState(140);
				match(RELOP);
				setState(141);
				opExpr(0);
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
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\""+
		"\3\2\3\2\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\59\n\5\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\ba\n\b\f\b\16\bd\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\7\np\n\n\f\n\16\ns\13\n\3\n\5\nv\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u008b\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0092\n\16"+
		"\3\17\3\17\5\17\u0096\n\17\3\17\2\3\16\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\2\2\u009b\2 \3\2\2\2\4(\3\2\2\2\6\60\3\2\2\2\b8\3\2\2\2\n<\3"+
		"\2\2\2\fJ\3\2\2\2\16R\3\2\2\2\20e\3\2\2\2\22q\3\2\2\2\24w\3\2\2\2\26\u0080"+
		"\3\2\2\2\30\u008a\3\2\2\2\32\u0091\3\2\2\2\34\u0095\3\2\2\2\36!\5\4\3"+
		"\2\37!\5\n\6\2 \36\3\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2"+
		"\2#$\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&)\5\6\4\2\')\5\b\5\2(&\3\2\2\2(\'\3"+
		"\2\2\2)\5\3\2\2\2*+\7\r\2\2+,\7\24\2\2,-\7\3\2\2-\61\5\f\7\2./\7\r\2\2"+
		"/\61\7\24\2\2\60*\3\2\2\2\60.\3\2\2\2\61\7\3\2\2\2\62\63\7\16\2\2\63\64"+
		"\7\24\2\2\64\65\7\3\2\2\659\5\f\7\2\66\67\7\16\2\2\679\7\24\2\28\62\3"+
		"\2\2\28\66\3\2\2\29\t\3\2\2\2:=\5\f\7\2;=\5\20\t\2<:\3\2\2\2<;\3\2\2\2"+
		"=\13\3\2\2\2>?\5\16\b\2?@\7\4\2\2@A\5\16\b\2AB\7\5\2\2BC\5\16\b\2CD\7"+
		"\6\2\2DK\3\2\2\2EF\5\16\b\2FG\7\4\2\2GH\5\16\b\2HK\3\2\2\2IK\5\16\b\2"+
		"J>\3\2\2\2JE\3\2\2\2JI\3\2\2\2K\r\3\2\2\2LM\b\b\1\2MN\7\5\2\2NO\5\16\b"+
		"\2OP\7\6\2\2PS\3\2\2\2QS\5\34\17\2RL\3\2\2\2RQ\3\2\2\2Sb\3\2\2\2TU\f\7"+
		"\2\2UV\7\7\2\2Va\5\16\b\bWX\f\6\2\2XY\7\b\2\2Ya\5\16\b\7Z[\f\5\2\2[\\"+
		"\7\t\2\2\\a\5\16\b\6]^\f\4\2\2^_\7\n\2\2_a\5\16\b\5`T\3\2\2\2`W\3\2\2"+
		"\2`Z\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\17\3\2\2\2db\3\2"+
		"\2\2ef\7\r\2\2fg\7\5\2\2gh\5\30\r\2hi\7\6\2\2ij\7\13\2\2jk\5\n\6\2kl\7"+
		"\f\2\2lm\5\22\n\2m\21\3\2\2\2np\5\24\13\2on\3\2\2\2ps\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tv\5\26\f\2ut\3\2\2\2uv\3\2\2\2v\23\3"+
		"\2\2\2wx\7\r\2\2xy\7\r\2\2yz\7\5\2\2z{\5\30\r\2{|\7\6\2\2|}\7\13\2\2}"+
		"~\5\n\6\2~\177\7\f\2\2\177\25\3\2\2\2\u0080\u0081\7\r\2\2\u0081\u0082"+
		"\7\13\2\2\u0082\u0083\5\n\6\2\u0083\u0084\7\f\2\2\u0084\27\3\2\2\2\u0085"+
		"\u0086\5\32\16\2\u0086\u0087\7\22\2\2\u0087\u0088\5\30\r\2\u0088\u008b"+
		"\3\2\2\2\u0089\u008b\5\32\16\2\u008a\u0085\3\2\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\31\3\2\2\2\u008c\u0092\7\23\2\2\u008d\u008e\5\16\b\2\u008e\u008f"+
		"\7\21\2\2\u008f\u0090\5\16\b\2\u0090\u0092\3\2\2\2\u0091\u008c\3\2\2\2"+
		"\u0091\u008d\3\2\2\2\u0092\33\3\2\2\2\u0093\u0096\7\25\2\2\u0094\u0096"+
		"\7\24\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\35\3\2\2\2\21"+
		" \"(\608<JR`bqu\u008a\u0091\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}