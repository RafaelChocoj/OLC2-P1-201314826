// Generated from d:\ARCHIVOS\Documents\1s_2022\compi2\lab\Repositorio\OLC2-P1\RustPar.g4 by ANTLR 4.8

    import "OLC2/interfaces"
    import "OLC2/expresion"
    import "OLC2/instruction"
    import arrayList "github.com/colegno/arraylist"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RustPar extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT_CON=1, T_NUMBER=2, T_FLOAT=3, T_STRING=4, TRUE=5, FALSE=6, AS=7, 
		NUMBER=8, FLOAT=9, STRING=10, PUNTO=11, PTCOMA=12, IGUAL=13, MAYORIGUAL=14, 
		MENORIGUAL=15, MAYOR=16, MENOR=17, MUL=18, DIV=19, ADD=20, SUB=21, MOD=22, 
		PARIZQ=23, PARDER=24, LLAVEIZQ=25, LLAVEDER=26, WHITESPACE=27;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_printconsola = 3, 
		RULE_expression = 4, RULE_expr_arit = 5, RULE_casteo = 6, RULE_tipo_cast = 7, 
		RULE_primitivo = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "printconsola", "expression", 
			"expr_arit", "casteo", "tipo_cast", "primitivo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'string'", "'true'", "'false'", 
			"'as'", null, null, null, "'.'", "';'", "'='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", 
			"AS", "NUMBER", "FLOAT", "STRING", "PUNTO", "PTCOMA", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE"
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
	public String getGrammarFileName() { return "RustPar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RustPar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public *arrayList.List lista;
		public InstruccionesContext instrucciones;
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((StartContext)_localctx).instrucciones = instrucciones();
			_localctx.lista = ((StartContext)_localctx).instrucciones.l
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

	public static class InstruccionesContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstruccionContext instruccion;
		public List<InstruccionContext> e = new ArrayList<InstruccionContext>();
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);

		    _localctx.l =  arrayList.New()
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT_CON) {
				{
				{
				setState(21);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			      listInt := localctx.(*InstruccionesContext).GetE()
			      		for _, e := range listInt {
			            _localctx.l.Add(e.GetInstr())
			          }
			          //fmt.Printf("tipo %T",localctx.(*InstruccionesContext).GetE())
			    
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

	public static class InstruccionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public PrintconsolaContext printconsola;
		public PrintconsolaContext printconsola() {
			return getRuleContext(PrintconsolaContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(RustPar.PTCOMA, 0); }
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			((InstruccionContext)_localctx).printconsola = printconsola();
			setState(30);
			match(PTCOMA);
			_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
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

	public static class PrintconsolaContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public ExpressionContext expression;
		public TerminalNode PRINT_CON() { return getToken(RustPar.PRINT_CON, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public PrintconsolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printconsola; }
	}

	public final PrintconsolaContext printconsola() throws RecognitionException {
		PrintconsolaContext _localctx = new PrintconsolaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printconsola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(PRINT_CON);
			setState(34);
			match(PARIZQ);
			setState(35);
			((PrintconsolaContext)_localctx).expression = expression();
			setState(36);
			match(PARDER);
			_localctx.instr = instruction.NewImprimir(((PrintconsolaContext)_localctx).expression.p)
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

	public static class ExpressionContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Expr_aritContext expr_arit;
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((ExpressionContext)_localctx).expr_arit = expr_arit(0);
			_localctx.p = ((ExpressionContext)_localctx).expr_arit.p
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

	public static class Expr_aritContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Expr_aritContext opIz;
		public Token op;
		public ExpressionContext opU;
		public ExpressionContext expression;
		public PrimitivoContext primitivo;
		public CasteoContext casteo;
		public Expr_aritContext opDe;
		public TerminalNode SUB() { return getToken(RustPar.SUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public CasteoContext casteo() {
			return getRuleContext(CasteoContext.class,0);
		}
		public List<Expr_aritContext> expr_arit() {
			return getRuleContexts(Expr_aritContext.class);
		}
		public Expr_aritContext expr_arit(int i) {
			return getRuleContext(Expr_aritContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RustPar.MUL, 0); }
		public TerminalNode DIV() { return getToken(RustPar.DIV, 0); }
		public TerminalNode MOD() { return getToken(RustPar.MOD, 0); }
		public TerminalNode ADD() { return getToken(RustPar.ADD, 0); }
		public Expr_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arit; }
	}

	public final Expr_aritContext expr_arit() throws RecognitionException {
		return expr_arit(0);
	}

	private Expr_aritContext expr_arit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_aritContext _localctx = new Expr_aritContext(_ctx, _parentState);
		Expr_aritContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(43);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(44);
				((Expr_aritContext)_localctx).opU = ((Expr_aritContext)_localctx).expression = expression();
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(47);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 3:
				{
				setState(50);
				match(PARIZQ);
				setState(51);
				((Expr_aritContext)_localctx).expression = expression();
				setState(52);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 4:
				{
				setState(55);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(60);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(61);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(62);
						((Expr_aritContext)_localctx).opDe = expr_arit(6);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						((Expr_aritContext)_localctx).opDe = expr_arit(5);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					}
					} 
				}
				setState(74);
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

	public static class CasteoContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token PARIZQ;
		public ExpressionContext expression;
		public Tipo_castContext typec;
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(RustPar.AS, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public Tipo_castContext tipo_cast() {
			return getRuleContext(Tipo_castContext.class,0);
		}
		public CasteoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casteo; }
	}

	public final CasteoContext casteo() throws RecognitionException {
		CasteoContext _localctx = new CasteoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(76);
			((CasteoContext)_localctx).expression = expression();
			setState(77);
			match(AS);
			setState(78);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(79);
			match(PARDER);
			_localctx.p = expresion.NewCasteo(((CasteoContext)_localctx).expression.p, ((CasteoContext)_localctx).typec.tc, (((CasteoContext)_localctx).PARIZQ!=null?((CasteoContext)_localctx).PARIZQ.getLine():0), localctx.(*CasteoContext).Get_PARIZQ().GetColumn() )
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

	public static class Tipo_castContext extends ParserRuleContext {
		public interfaces.TipoExpresion tc;
		public TerminalNode T_FLOAT() { return getToken(RustPar.T_FLOAT, 0); }
		public TerminalNode T_NUMBER() { return getToken(RustPar.T_NUMBER, 0); }
		public Tipo_castContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_cast; }
	}

	public final Tipo_castContext tipo_cast() throws RecognitionException {
		Tipo_castContext _localctx = new Tipo_castContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_cast);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T_NUMBER);
				_localctx.tc = interfaces.INTEGER
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

	public static class PrimitivoContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token NUMBER;
		public Token FLOAT;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode NUMBER() { return getToken(RustPar.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(RustPar.FLOAT, 0); }
		public TerminalNode TRUE() { return getToken(RustPar.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RustPar.FALSE, 0); }
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitivo);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);

				            	num,err := strconv.Atoi((((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getText():null))
				                if err!= nil{
				                    fmt.Println(err)
				                }
				            _localctx.p = expresion.NewPrimitivo(num,interfaces.INTEGER, (((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getLine():0), localctx.(*PrimitivoContext).Get_NUMBER().GetColumn())
				      
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((PrimitivoContext)_localctx).FLOAT = match(FLOAT);

				              num,err := strconv.ParseFloat((((PrimitivoContext)_localctx).FLOAT!=null?((PrimitivoContext)_localctx).FLOAT.getText():null),64)
				              if err!= nil{
				                  fmt.Println(err)
				              }
				              _localctx.p = expresion.NewPrimitivo (num,interfaces.FLOAT, (((PrimitivoContext)_localctx).FLOAT!=null?((PrimitivoContext)_localctx).FLOAT.getLine():0), localctx.(*PrimitivoContext).Get_FLOAT().GetColumn())
				      
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				((PrimitivoContext)_localctx).FALSE = match(FALSE);
				 _localctx.p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).FALSE!=null?((PrimitivoContext)_localctx).FALSE.getLine():0), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())
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
		case 5:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7=\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"I\n\7\f\7\16\7L\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tY"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nc\n\n\3\n\2\3\f\13\2\4\6\b\n\f"+
		"\16\20\22\2\4\4\2\24\25\30\30\3\2\26\27\2e\2\24\3\2\2\2\4\32\3\2\2\2\6"+
		"\37\3\2\2\2\b#\3\2\2\2\n)\3\2\2\2\f<\3\2\2\2\16M\3\2\2\2\20X\3\2\2\2\22"+
		"b\3\2\2\2\24\25\5\4\3\2\25\26\b\2\1\2\26\3\3\2\2\2\27\31\5\6\4\2\30\27"+
		"\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34\32"+
		"\3\2\2\2\35\36\b\3\1\2\36\5\3\2\2\2\37 \5\b\5\2 !\7\16\2\2!\"\b\4\1\2"+
		"\"\7\3\2\2\2#$\7\3\2\2$%\7\31\2\2%&\5\n\6\2&\'\7\32\2\2\'(\b\5\1\2(\t"+
		"\3\2\2\2)*\5\f\7\2*+\b\6\1\2+\13\3\2\2\2,-\b\7\1\2-.\7\27\2\2./\5\n\6"+
		"\2/\60\b\7\1\2\60=\3\2\2\2\61\62\5\22\n\2\62\63\b\7\1\2\63=\3\2\2\2\64"+
		"\65\7\31\2\2\65\66\5\n\6\2\66\67\7\32\2\2\678\b\7\1\28=\3\2\2\29:\5\16"+
		"\b\2:;\b\7\1\2;=\3\2\2\2<,\3\2\2\2<\61\3\2\2\2<\64\3\2\2\2<9\3\2\2\2="+
		"J\3\2\2\2>?\f\7\2\2?@\t\2\2\2@A\5\f\7\bAB\b\7\1\2BI\3\2\2\2CD\f\6\2\2"+
		"DE\t\3\2\2EF\5\f\7\7FG\b\7\1\2GI\3\2\2\2H>\3\2\2\2HC\3\2\2\2IL\3\2\2\2"+
		"JH\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LJ\3\2\2\2MN\7\31\2\2NO\5\n\6\2OP\7\t\2"+
		"\2PQ\5\20\t\2QR\7\32\2\2RS\b\b\1\2S\17\3\2\2\2TU\7\5\2\2UY\b\t\1\2VW\7"+
		"\4\2\2WY\b\t\1\2XT\3\2\2\2XV\3\2\2\2Y\21\3\2\2\2Z[\7\n\2\2[c\b\n\1\2\\"+
		"]\7\13\2\2]c\b\n\1\2^_\7\7\2\2_c\b\n\1\2`a\7\b\2\2ac\b\n\1\2bZ\3\2\2\2"+
		"b\\\3\2\2\2b^\3\2\2\2b`\3\2\2\2c\23\3\2\2\2\b\32<HJXb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}