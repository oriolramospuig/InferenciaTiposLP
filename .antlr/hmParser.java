// Generated from c:/Users/oriol/OneDrive/Escriptori/FIB/23-24Q2/LP/PracticaOriolRamos/hm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class hmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, BARRA=2, E=3, D=4, FLETXA=5, OPER=6, ASSIGN=7, WRITE=8, TIPUSBASIC=9, 
		ID=10, WS=11;
	public static final int
		RULE_root = 0, RULE_def = 1, RULE_tipus = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "def", "tipus", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\'", "'('", "')'", "'->'", null, "'::'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUM", "BARRA", "E", "D", "FLETXA", "OPER", "ASSIGN", "WRITE", 
			"TIPUSBASIC", "ID", "WS"
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
	public String getGrammarFileName() { return "hm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(8);
					def();
					}
					} 
				}
				setState(13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(14);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends ParserRuleContext {
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	 
		public DefContext() { }
		public void copyFrom(DefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinicioContext extends DefContext {
		public TerminalNode ASSIGN() { return getToken(hmParser.ASSIGN, 0); }
		public TipusContext tipus() {
			return getRuleContext(TipusContext.class,0);
		}
		public TerminalNode NUM() { return getToken(hmParser.NUM, 0); }
		public TerminalNode OPER() { return getToken(hmParser.OPER, 0); }
		public DefinicioContext(DefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).enterDefinicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).exitDefinicio(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def);
		int _la;
		try {
			_localctx = new DefinicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==OPER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(17);
			match(ASSIGN);
			setState(18);
			tipus();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipusContext extends ParserRuleContext {
		public TipusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipus; }
	 
		public TipusContext() { }
		public void copyFrom(TipusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipusCombinatContext extends TipusContext {
		public List<TerminalNode> TIPUSBASIC() { return getTokens(hmParser.TIPUSBASIC); }
		public TerminalNode TIPUSBASIC(int i) {
			return getToken(hmParser.TIPUSBASIC, i);
		}
		public List<TerminalNode> FLETXA() { return getTokens(hmParser.FLETXA); }
		public TerminalNode FLETXA(int i) {
			return getToken(hmParser.FLETXA, i);
		}
		public TipusCombinatContext(TipusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).enterTipusCombinat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).exitTipusCombinat(this);
		}
	}

	public final TipusContext tipus() throws RecognitionException {
		TipusContext _localctx = new TipusContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipus);
		int _la;
		try {
			_localctx = new TipusCombinatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(TIPUSBASIC);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FLETXA) {
				{
				{
				setState(21);
				match(FLETXA);
				setState(22);
				match(TIPUSBASIC);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExprContext {
		public TerminalNode E() { return getToken(hmParser.E, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode D() { return getToken(hmParser.D, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).exitParentesis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaContext extends ExprContext {
		public TerminalNode BARRA() { return getToken(hmParser.BARRA, 0); }
		public TerminalNode ID() { return getToken(hmParser.ID, 0); }
		public TerminalNode FLETXA() { return getToken(hmParser.FLETXA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LambdaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).exitLambda(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(hmParser.NUM, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).exitNum(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(hmParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacioContext extends ExprContext {
		public TerminalNode OPER() { return getToken(hmParser.OPER, 0); }
		public OperacioContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).enterOperacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).exitOperacio(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AplicacioContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AplicacioContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).enterAplicacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hmListener ) ((hmListener)listener).exitAplicacio(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case E:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(29);
				match(E);
				setState(30);
				expr(0);
				setState(31);
				match(D);
				}
				break;
			case BARRA:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(BARRA);
				setState(34);
				match(ID);
				setState(35);
				match(FLETXA);
				setState(36);
				expr(4);
				}
				break;
			case OPER:
				{
				_localctx = new OperacioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(OPER);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(ID);
				}
				break;
			case NUM:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AplicacioContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(42);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(43);
					expr(6);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u0018\b\u0002\n\u0002\f\u0002\u001b\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003)\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003-\b\u0003\n\u0003\f\u00030\t\u0003"+
		"\u0001\u0003\u0000\u0001\u0006\u0004\u0000\u0002\u0004\u0006\u0000\u0001"+
		"\u0002\u0000\u0001\u0001\u0006\u00064\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0002\u0010\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000\u0000\u0000"+
		"\u0006(\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001"+
		"\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0006\u0003\u0000\u000f"+
		"\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0007\u0000\u0000\u0000\u0011"+
		"\u0012\u0005\u0007\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000\u0013"+
		"\u0003\u0001\u0000\u0000\u0000\u0014\u0019\u0005\t\u0000\u0000\u0015\u0016"+
		"\u0005\u0005\u0000\u0000\u0016\u0018\u0005\t\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0005\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0006"+
		"\u0003\uffff\uffff\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e\u001f"+
		"\u0003\u0006\u0003\u0000\u001f \u0005\u0004\u0000\u0000 )\u0001\u0000"+
		"\u0000\u0000!\"\u0005\u0002\u0000\u0000\"#\u0005\n\u0000\u0000#$\u0005"+
		"\u0005\u0000\u0000$)\u0003\u0006\u0003\u0004%)\u0005\u0006\u0000\u0000"+
		"&)\u0005\n\u0000\u0000\')\u0005\u0001\u0000\u0000(\u001c\u0001\u0000\u0000"+
		"\u0000(!\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000(\'\u0001\u0000\u0000\u0000).\u0001\u0000\u0000\u0000*+\n"+
		"\u0005\u0000\u0000+-\u0003\u0006\u0003\u0006,*\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/\u0007\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000\u0004"+
		"\u000b\u0019(.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}