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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, REAC=7, ADD=8, MULT=9, 
		KEYWORD=10, INT=11, SSA=12, LIST=13, ID=14, NUM=15, COMMENT=16, WS=17;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declReaction = 2, RULE_declInt = 3, 
		RULE_declList = 4, RULE_reacParams = 5, RULE_expr = 6, RULE_reacExpr = 7, 
		RULE_basicExpr = 8, RULE_value = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declReaction", "declInt", "declList", "reacParams", 
			"expr", "reacExpr", "basicExpr", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'{'", "'}'", "','", "'('", "')'", "'=>'", "'+'", "'*'", 
			null, "'int'", "'ssa'", "'list'"
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
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD:
				case INT:
				case LIST:
					{
					setState(20);
					decl();
					}
					break;
				case ID:
				case NUM:
					{
					setState(21);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << INT) | (1L << LIST) | (1L << ID) | (1L << NUM))) != 0) );
			setState(26);
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
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
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
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				declReaction();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				declInt();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				declList();
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
		public ReacExprContext reacExpr() {
			return getRuleContext(ReacExprContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ReacDeclAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(KEYWORD);
				setState(34);
				match(ID);
				setState(35);
				match(T__0);
				setState(36);
				reacExpr();
				}
				break;
			case 2:
				_localctx = new ReacDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(KEYWORD);
				setState(38);
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
		public BasicExprContext basicExpr() {
			return getRuleContext(BasicExprContext.class,0);
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IntDeclAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(INT);
				setState(42);
				match(ID);
				setState(43);
				match(T__0);
				setState(44);
				basicExpr(0);
				}
				break;
			case 2:
				_localctx = new IntDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(INT);
				setState(46);
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

	public static class DeclListContext extends ParserRuleContext {
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
	 
		public DeclListContext() { }
		public void copyFrom(DeclListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListDeclContext extends DeclListContext {
		public TerminalNode LIST() { return getToken(expressionParser.LIST, 0); }
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public ListDeclContext(DeclListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitListDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitListDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDeclParamsContext extends DeclListContext {
		public TerminalNode LIST() { return getToken(expressionParser.LIST, 0); }
		public TerminalNode ID() { return getToken(expressionParser.ID, 0); }
		public ReacParamsContext reacParams() {
			return getRuleContext(ReacParamsContext.class,0);
		}
		public ListDeclParamsContext(DeclListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterListDeclParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitListDeclParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitListDeclParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declList);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ListDeclParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(LIST);
				setState(50);
				match(ID);
				setState(51);
				match(T__0);
				setState(52);
				match(T__1);
				setState(53);
				reacParams();
				setState(54);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new ListDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(LIST);
				setState(57);
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

	public static class ReacParamsContext extends ParserRuleContext {
		public ReacParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reacParams; }
	 
		public ReacParamsContext() { }
		public void copyFrom(ReacParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReactionParameterContext extends ReacParamsContext {
		public ReacExprContext reacExpr() {
			return getRuleContext(ReacExprContext.class,0);
		}
		public ReactionParameterContext(ReacParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterReactionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitReactionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitReactionParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReactionParametersContext extends ReacParamsContext {
		public ReacExprContext reacExpr() {
			return getRuleContext(ReacExprContext.class,0);
		}
		public ReacParamsContext reacParams() {
			return getRuleContext(ReacParamsContext.class,0);
		}
		public ReactionParametersContext(ReacParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).enterReactionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof expressionListener ) ((expressionListener)listener).exitReactionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof expressionVisitor ) return ((expressionVisitor<? extends T>)visitor).visitReactionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReacParamsContext reacParams() throws RecognitionException {
		ReacParamsContext _localctx = new ReacParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reacParams);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ReactionParametersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				reacExpr();
				setState(61);
				match(T__3);
				setState(62);
				reacParams();
				}
				break;
			case 2:
				_localctx = new ReactionParameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				reacExpr();
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
		public ReacExprContext reacExpr() {
			return getRuleContext(ReacExprContext.class,0);
		}
		public BasicExprContext basicExpr() {
			return getRuleContext(BasicExprContext.class,0);
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
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				reacExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				basicExpr(0);
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

	public static class ReacExprContext extends ParserRuleContext {
		public ReacExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reacExpr; }
	 
		public ReacExprContext() { }
		public void copyFrom(ReacExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReactionExpressionConstContext extends ReacExprContext {
		public List<BasicExprContext> basicExpr() {
			return getRuleContexts(BasicExprContext.class);
		}
		public BasicExprContext basicExpr(int i) {
			return getRuleContext(BasicExprContext.class,i);
		}
		public TerminalNode REAC() { return getToken(expressionParser.REAC, 0); }
		public ReactionExpressionConstContext(ReacExprContext ctx) { copyFrom(ctx); }
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
	public static class ReactionExpressionContext extends ReacExprContext {
		public List<BasicExprContext> basicExpr() {
			return getRuleContexts(BasicExprContext.class);
		}
		public BasicExprContext basicExpr(int i) {
			return getRuleContext(BasicExprContext.class,i);
		}
		public TerminalNode REAC() { return getToken(expressionParser.REAC, 0); }
		public ReactionExpressionContext(ReacExprContext ctx) { copyFrom(ctx); }
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

	public final ReacExprContext reacExpr() throws RecognitionException {
		ReacExprContext _localctx = new ReacExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_reacExpr);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ReactionExpressionConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				basicExpr(0);
				setState(72);
				match(REAC);
				setState(73);
				basicExpr(0);
				setState(74);
				match(T__4);
				setState(75);
				basicExpr(0);
				setState(76);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ReactionExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				basicExpr(0);
				setState(79);
				match(REAC);
				setState(80);
				basicExpr(0);
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

	public static class BasicExprContext extends ParserRuleContext {
		public BasicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpr; }
	 
		public BasicExprContext() { }
		public void copyFrom(BasicExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionExpressionContext extends BasicExprContext {
		public List<BasicExprContext> basicExpr() {
			return getRuleContexts(BasicExprContext.class);
		}
		public BasicExprContext basicExpr(int i) {
			return getRuleContext(BasicExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(expressionParser.ADD, 0); }
		public AdditionExpressionContext(BasicExprContext ctx) { copyFrom(ctx); }
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
	public static class NumOrIDContext extends BasicExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NumOrIDContext(BasicExprContext ctx) { copyFrom(ctx); }
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
	public static class MultiplyExpressionContext extends BasicExprContext {
		public List<BasicExprContext> basicExpr() {
			return getRuleContexts(BasicExprContext.class);
		}
		public BasicExprContext basicExpr(int i) {
			return getRuleContext(BasicExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(expressionParser.MULT, 0); }
		public MultiplyExpressionContext(BasicExprContext ctx) { copyFrom(ctx); }
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

	public final BasicExprContext basicExpr() throws RecognitionException {
		return basicExpr(0);
	}

	private BasicExprContext basicExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasicExprContext _localctx = new BasicExprContext(_ctx, _parentState);
		BasicExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_basicExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NumOrIDContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(85);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExpressionContext(new BasicExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_basicExpr);
						setState(87);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(88);
						match(MULT);
						setState(89);
						basicExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExpressionContext(new BasicExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_basicExpr);
						setState(90);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(91);
						match(ADD);
						setState(92);
						basicExpr(3);
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
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
		case 8:
			return basicExpr_sempred((BasicExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean basicExpr_sempred(BasicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\5\7D\n\7\3\b\3\b"+
		"\5\bH\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tU\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n`\n\n\f\n\16\nc\13\n\3\13\3\13\5\13g\n"+
		"\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\2\2k\2\30\3\2\2\2\4!\3\2\2"+
		"\2\6)\3\2\2\2\b\61\3\2\2\2\n<\3\2\2\2\fC\3\2\2\2\16G\3\2\2\2\20T\3\2\2"+
		"\2\22V\3\2\2\2\24f\3\2\2\2\26\31\5\4\3\2\27\31\5\16\b\2\30\26\3\2\2\2"+
		"\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2"+
		"\34\35\7\2\2\3\35\3\3\2\2\2\36\"\5\6\4\2\37\"\5\b\5\2 \"\5\n\6\2!\36\3"+
		"\2\2\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\f\2\2$%\7\20\2\2%&\7\3\2"+
		"\2&*\5\20\t\2\'(\7\f\2\2(*\7\20\2\2)#\3\2\2\2)\'\3\2\2\2*\7\3\2\2\2+,"+
		"\7\r\2\2,-\7\20\2\2-.\7\3\2\2.\62\5\22\n\2/\60\7\r\2\2\60\62\7\20\2\2"+
		"\61+\3\2\2\2\61/\3\2\2\2\62\t\3\2\2\2\63\64\7\17\2\2\64\65\7\20\2\2\65"+
		"\66\7\3\2\2\66\67\7\4\2\2\678\5\f\7\289\7\5\2\29=\3\2\2\2:;\7\17\2\2;"+
		"=\7\20\2\2<\63\3\2\2\2<:\3\2\2\2=\13\3\2\2\2>?\5\20\t\2?@\7\6\2\2@A\5"+
		"\f\7\2AD\3\2\2\2BD\5\20\t\2C>\3\2\2\2CB\3\2\2\2D\r\3\2\2\2EH\5\20\t\2"+
		"FH\5\22\n\2GE\3\2\2\2GF\3\2\2\2H\17\3\2\2\2IJ\5\22\n\2JK\7\t\2\2KL\5\22"+
		"\n\2LM\7\7\2\2MN\5\22\n\2NO\7\b\2\2OU\3\2\2\2PQ\5\22\n\2QR\7\t\2\2RS\5"+
		"\22\n\2SU\3\2\2\2TI\3\2\2\2TP\3\2\2\2U\21\3\2\2\2VW\b\n\1\2WX\5\24\13"+
		"\2Xa\3\2\2\2YZ\f\5\2\2Z[\7\13\2\2[`\5\22\n\6\\]\f\4\2\2]^\7\n\2\2^`\5"+
		"\22\n\5_Y\3\2\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\23\3\2\2\2"+
		"ca\3\2\2\2dg\7\21\2\2eg\7\20\2\2fd\3\2\2\2fe\3\2\2\2g\25\3\2\2\2\16\30"+
		"\32!)\61<CGT_af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}