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
		PRINT_CON=1, T_NUMBER=2, T_FLOAT=3, T_STRING=4, T_BOOL=5, T_STR=6, TRUE=7, 
		FALSE=8, AS=9, POW=10, POWF=11, LET=12, MUT=13, TO_STRING=14, TO_OWNED=15, 
		NUMBER=16, FLOAT=17, STRING=18, ID=19, PUNTO=20, COMA=21, PTCOMA=22, DOSPUNTO=23, 
		DPUNTO2=24, ASIGNACION=25, DISTINTO=26, IGUAL=27, MAYORIGUAL=28, MENORIGUAL=29, 
		MAYOR=30, MENOR=31, MUL=32, DIV=33, ADD=34, SUB=35, MOD=36, AND=37, OR=38, 
		NOT=39, AMP=40, PARIZQ=41, PARDER=42, LLAVEIZQ=43, LLAVEDER=44, WHITESPACE=45, 
		L_COMMENT=46;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_printconsola = 3, 
		RULE_declaracion = 4, RULE_is_mut = 5, RULE_asignacion = 6, RULE_tipos_var = 7, 
		RULE_expression = 8, RULE_expr_arit = 9, RULE_casteo = 10, RULE_tipo_cast = 11, 
		RULE_primitivo = 12, RULE_strings = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "printconsola", "declaracion", 
			"is_mut", "asignacion", "tipos_var", "expression", "expr_arit", "casteo", 
			"tipo_cast", "primitivo", "strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", "'mut'", "'.to_string()'", 
			"'.to_owned()'", null, null, null, null, "'.'", "','", "';'", "'::'", 
			"':'", "'='", "'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", 
			"'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "TO_STRING", "TO_OWNED", 
			"NUMBER", "FLOAT", "STRING", "ID", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", 
			"DPUNTO2", "ASIGNACION", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", 
			"AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "L_COMMENT"
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
			setState(28);
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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_CON) | (1L << LET) | (1L << ID))) != 0)) {
				{
				{
				setState(31);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(36);
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
		public DeclaracionContext declaracion;
		public AsignacionContext asignacion;
		public PrintconsolaContext printconsola() {
			return getRuleContext(PrintconsolaContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(RustPar.PTCOMA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((InstruccionContext)_localctx).printconsola = printconsola();
				setState(40);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(44);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(48);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
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
			setState(53);
			match(PRINT_CON);
			setState(54);
			match(PARIZQ);
			setState(55);
			((PrintconsolaContext)_localctx).expression = expression();
			setState(56);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Is_mutContext isMut;
		public Token id;
		public Tipos_varContext tipos_var;
		public Token asig;
		public ExpressionContext expression;
		public TerminalNode LET() { return getToken(RustPar.LET, 0); }
		public TerminalNode DPUNTO2() { return getToken(RustPar.DPUNTO2, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_mutContext is_mut() {
			return getRuleContext(Is_mutContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(RustPar.ASIGNACION, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(LET);
				setState(60);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(61);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(62);
				match(DPUNTO2);
				setState(63);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(64);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(65);
				((DeclaracionContext)_localctx).expression = expression();

				                        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(LET);
				setState(69);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(70);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(71);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(72);
				((DeclaracionContext)_localctx).expression = expression();

				                      _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
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

	public static class Is_mutContext extends ParserRuleContext {
		public bool mut;
		public TerminalNode MUT() { return getToken(RustPar.MUT, 0); }
		public Is_mutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_mut; }
	}

	public final Is_mutContext is_mut() throws RecognitionException {
		Is_mutContext _localctx = new Is_mutContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_is_mut);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(MUT);
				 _localctx.mut = true 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AsignacionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token id;
		public ExpressionContext expression;
		public TerminalNode ASIGNACION() { return getToken(RustPar.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((AsignacionContext)_localctx).id = match(ID);
			setState(83);
			match(ASIGNACION);
			setState(84);
			((AsignacionContext)_localctx).expression = expression();
			_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
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

	public static class Tipos_varContext extends ParserRuleContext {
		public interfaces.TipoExpresion tipo;
		public TerminalNode T_NUMBER() { return getToken(RustPar.T_NUMBER, 0); }
		public TerminalNode T_STRING() { return getToken(RustPar.T_STRING, 0); }
		public TerminalNode T_FLOAT() { return getToken(RustPar.T_FLOAT, 0); }
		public TerminalNode T_BOOL() { return getToken(RustPar.T_BOOL, 0); }
		public TerminalNode T_STR() { return getToken(RustPar.T_STR, 0); }
		public Tipos_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_var; }
	}

	public final Tipos_varContext tipos_var() throws RecognitionException {
		Tipos_varContext _localctx = new Tipos_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipos_var);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T_NUMBER);
				_localctx.tipo = interfaces.INTEGER
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T_STRING);
				_localctx.tipo = interfaces.STRING
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(T_FLOAT);
				_localctx.tipo = interfaces.FLOAT
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(T_BOOL);
				_localctx.tipo = interfaces.BOOLEAN
				}
				break;
			case T_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(T_STR);
				_localctx.tipo = interfaces.STR
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
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		public Expr_aritContext opU;
		public Expr_aritContext opDe;
		public PrimitivoContext primitivo;
		public ExpressionContext expression;
		public CasteoContext casteo;
		public TerminalNode SUB() { return getToken(RustPar.SUB, 0); }
		public List<Expr_aritContext> expr_arit() {
			return getRuleContexts(Expr_aritContext.class);
		}
		public Expr_aritContext expr_arit(int i) {
			return getRuleContext(Expr_aritContext.class,i);
		}
		public TerminalNode T_NUMBER() { return getToken(RustPar.T_NUMBER, 0); }
		public TerminalNode DOSPUNTO() { return getToken(RustPar.DOSPUNTO, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public TerminalNode POW() { return getToken(RustPar.POW, 0); }
		public TerminalNode T_FLOAT() { return getToken(RustPar.T_FLOAT, 0); }
		public TerminalNode POWF() { return getToken(RustPar.POWF, 0); }
		public TerminalNode NOT() { return getToken(RustPar.NOT, 0); }
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CasteoContext casteo() {
			return getRuleContext(CasteoContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RustPar.MUL, 0); }
		public TerminalNode DIV() { return getToken(RustPar.DIV, 0); }
		public TerminalNode MOD() { return getToken(RustPar.MOD, 0); }
		public TerminalNode ADD() { return getToken(RustPar.ADD, 0); }
		public TerminalNode MENOR() { return getToken(RustPar.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(RustPar.MENORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(RustPar.MAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(RustPar.MAYORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(RustPar.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(RustPar.DISTINTO, 0); }
		public TerminalNode AND() { return getToken(RustPar.AND, 0); }
		public TerminalNode OR() { return getToken(RustPar.OR, 0); }
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(103);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(104);
				((Expr_aritContext)_localctx).opU = expr_arit(12);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(107);
				match(T_NUMBER);
				setState(108);
				match(DOSPUNTO);
				setState(109);
				((Expr_aritContext)_localctx).op = match(POW);
				setState(110);
				match(PARIZQ);
				setState(111);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(112);
				match(COMA);
				setState(113);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(114);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 3:
				{
				setState(117);
				match(T_FLOAT);
				setState(118);
				match(DOSPUNTO);
				setState(119);
				((Expr_aritContext)_localctx).op = match(POWF);
				setState(120);
				match(PARIZQ);
				setState(121);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(122);
				match(COMA);
				setState(123);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(124);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 4:
				{
				setState(127);
				((Expr_aritContext)_localctx).op = match(NOT);
				setState(128);
				((Expr_aritContext)_localctx).opU = expr_arit(6);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"!",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 5:
				{
				setState(131);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 6:
				{
				setState(134);
				match(PARIZQ);
				setState(135);
				((Expr_aritContext)_localctx).expression = expression();
				setState(136);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 7:
				{
				setState(139);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(144);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(145);
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
						setState(146);
						((Expr_aritContext)_localctx).opDe = expr_arit(10);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(149);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(150);
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
						setState(151);
						((Expr_aritContext)_localctx).opDe = expr_arit(9);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(154);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(155);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISTINTO) | (1L << IGUAL) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						((Expr_aritContext)_localctx).opDe = expr_arit(8);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						((Expr_aritContext)_localctx).op = match(AND);
						setState(161);
						((Expr_aritContext)_localctx).opDe = expr_arit(6);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(165);
						((Expr_aritContext)_localctx).op = match(OR);
						setState(166);
						((Expr_aritContext)_localctx).opDe = expr_arit(5);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					}
					} 
				}
				setState(173);
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
		enterRule(_localctx, 20, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(175);
			((CasteoContext)_localctx).expression = expression();
			setState(176);
			match(AS);
			setState(177);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(178);
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
		enterRule(_localctx, 22, RULE_tipo_cast);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		public StringsContext strings;
		public Token ID;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode NUMBER() { return getToken(RustPar.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(RustPar.FLOAT, 0); }
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode TRUE() { return getToken(RustPar.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RustPar.FALSE, 0); }
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primitivo);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
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
				setState(189);
				((PrimitivoContext)_localctx).FLOAT = match(FLOAT);

				              num,err := strconv.ParseFloat((((PrimitivoContext)_localctx).FLOAT!=null?((PrimitivoContext)_localctx).FLOAT.getText():null),64)
				              if err!= nil{
				                  fmt.Println(err)
				              }
				              _localctx.p = expresion.NewPrimitivo (num,interfaces.FLOAT, (((PrimitivoContext)_localctx).FLOAT!=null?((PrimitivoContext)_localctx).FLOAT.getLine():0), localctx.(*PrimitivoContext).Get_FLOAT().GetColumn())
				      
				}
				break;
			case STRING:
			case AMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				((PrimitivoContext)_localctx).strings = strings();
				_localctx.p = ((PrimitivoContext)_localctx).strings.p
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				((PrimitivoContext)_localctx).ID = match(ID);
				 
				      _localctx.p = expresion.NewIdentificador((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), (((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getLine():0), localctx.(*PrimitivoContext).Get_ID().GetColumn() )
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
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

	public static class StringsContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token STRING;
		public TerminalNode STRING() { return getToken(RustPar.STRING, 0); }
		public List<TerminalNode> AMP() { return getTokens(RustPar.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(RustPar.AMP, i);
		}
		public TerminalNode TO_STRING() { return getToken(RustPar.TO_STRING, 0); }
		public TerminalNode TO_OWNED() { return getToken(RustPar.TO_OWNED, 0); }
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_strings);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					match(AMP);
					}
					}
					setState(205); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AMP );
				setState(207);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(208);
					_la = _input.LA(1);
					if ( !(_la==TO_STRING || _la==TO_OWNED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				 
				      str:= (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null)[1:len((((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null))-1]
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STR, (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getLine():0), localctx.(*StringsContext).Get_STRING().GetColumn())
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==TO_STRING || _la==TO_OWNED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 
				      str:= (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null)[1:len((((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null))-1]
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STRING, (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getLine():0), localctx.(*StringsContext).Get_STRING().GetColumn())
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				((StringsContext)_localctx).STRING = match(STRING);
				 
				      str:= (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null)[1:len((((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null))-1]
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STR, (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getLine():0), localctx.(*StringsContext).Get_STRING().GetColumn())
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00de\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\7\3#\n\3\f\3"+
		"\16\3&\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\5\7S\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\td\n\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ac"+
		"\n\13\f\13\16\13\u00af\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\5\r\u00bc\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00cb\n\16\3\17\6\17\u00ce\n\17\r\17\16\17\u00cf\3\17"+
		"\3\17\5\17\u00d4\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00dc\n\17\3"+
		"\17\2\3\24\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\4\2\"#&&\3\2$%\3"+
		"\2\34!\3\2\20\21\2\u00ed\2\36\3\2\2\2\4$\3\2\2\2\6\65\3\2\2\2\b\67\3\2"+
		"\2\2\nM\3\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20c\3\2\2\2\22e\3\2\2\2\24\u0090"+
		"\3\2\2\2\26\u00b0\3\2\2\2\30\u00bb\3\2\2\2\32\u00ca\3\2\2\2\34\u00db\3"+
		"\2\2\2\36\37\5\4\3\2\37 \b\2\1\2 \3\3\2\2\2!#\5\6\4\2\"!\3\2\2\2#&\3\2"+
		"\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\b\3\1\2(\5\3\2\2\2)"+
		"*\5\b\5\2*+\7\30\2\2+,\b\4\1\2,\66\3\2\2\2-.\5\n\6\2./\7\30\2\2/\60\b"+
		"\4\1\2\60\66\3\2\2\2\61\62\5\16\b\2\62\63\7\30\2\2\63\64\b\4\1\2\64\66"+
		"\3\2\2\2\65)\3\2\2\2\65-\3\2\2\2\65\61\3\2\2\2\66\7\3\2\2\2\678\7\3\2"+
		"\289\7+\2\29:\5\22\n\2:;\7,\2\2;<\b\5\1\2<\t\3\2\2\2=>\7\16\2\2>?\5\f"+
		"\7\2?@\7\25\2\2@A\7\32\2\2AB\5\20\t\2BC\7\33\2\2CD\5\22\n\2DE\b\6\1\2"+
		"EN\3\2\2\2FG\7\16\2\2GH\5\f\7\2HI\7\25\2\2IJ\7\33\2\2JK\5\22\n\2KL\b\6"+
		"\1\2LN\3\2\2\2M=\3\2\2\2MF\3\2\2\2N\13\3\2\2\2OP\7\17\2\2PS\b\7\1\2QS"+
		"\3\2\2\2RO\3\2\2\2RQ\3\2\2\2S\r\3\2\2\2TU\7\25\2\2UV\7\33\2\2VW\5\22\n"+
		"\2WX\b\b\1\2X\17\3\2\2\2YZ\7\4\2\2Zd\b\t\1\2[\\\7\6\2\2\\d\b\t\1\2]^\7"+
		"\5\2\2^d\b\t\1\2_`\7\7\2\2`d\b\t\1\2ab\7\b\2\2bd\b\t\1\2cY\3\2\2\2c[\3"+
		"\2\2\2c]\3\2\2\2c_\3\2\2\2ca\3\2\2\2d\21\3\2\2\2ef\5\24\13\2fg\b\n\1\2"+
		"g\23\3\2\2\2hi\b\13\1\2ij\7%\2\2jk\5\24\13\16kl\b\13\1\2l\u0091\3\2\2"+
		"\2mn\7\4\2\2no\7\31\2\2op\7\f\2\2pq\7+\2\2qr\5\24\13\2rs\7\27\2\2st\5"+
		"\24\13\2tu\7,\2\2uv\b\13\1\2v\u0091\3\2\2\2wx\7\5\2\2xy\7\31\2\2yz\7\r"+
		"\2\2z{\7+\2\2{|\5\24\13\2|}\7\27\2\2}~\5\24\13\2~\177\7,\2\2\177\u0080"+
		"\b\13\1\2\u0080\u0091\3\2\2\2\u0081\u0082\7)\2\2\u0082\u0083\5\24\13\b"+
		"\u0083\u0084\b\13\1\2\u0084\u0091\3\2\2\2\u0085\u0086\5\32\16\2\u0086"+
		"\u0087\b\13\1\2\u0087\u0091\3\2\2\2\u0088\u0089\7+\2\2\u0089\u008a\5\22"+
		"\n\2\u008a\u008b\7,\2\2\u008b\u008c\b\13\1\2\u008c\u0091\3\2\2\2\u008d"+
		"\u008e\5\26\f\2\u008e\u008f\b\13\1\2\u008f\u0091\3\2\2\2\u0090h\3\2\2"+
		"\2\u0090m\3\2\2\2\u0090w\3\2\2\2\u0090\u0081\3\2\2\2\u0090\u0085\3\2\2"+
		"\2\u0090\u0088\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u00ad\3\2\2\2\u0092\u0093"+
		"\f\13\2\2\u0093\u0094\t\2\2\2\u0094\u0095\5\24\13\f\u0095\u0096\b\13\1"+
		"\2\u0096\u00ac\3\2\2\2\u0097\u0098\f\n\2\2\u0098\u0099\t\3\2\2\u0099\u009a"+
		"\5\24\13\13\u009a\u009b\b\13\1\2\u009b\u00ac\3\2\2\2\u009c\u009d\f\t\2"+
		"\2\u009d\u009e\t\4\2\2\u009e\u009f\5\24\13\n\u009f\u00a0\b\13\1\2\u00a0"+
		"\u00ac\3\2\2\2\u00a1\u00a2\f\7\2\2\u00a2\u00a3\7\'\2\2\u00a3\u00a4\5\24"+
		"\13\b\u00a4\u00a5\b\13\1\2\u00a5\u00ac\3\2\2\2\u00a6\u00a7\f\6\2\2\u00a7"+
		"\u00a8\7(\2\2\u00a8\u00a9\5\24\13\7\u00a9\u00aa\b\13\1\2\u00aa\u00ac\3"+
		"\2\2\2\u00ab\u0092\3\2\2\2\u00ab\u0097\3\2\2\2\u00ab\u009c\3\2\2\2\u00ab"+
		"\u00a1\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1"+
		"\7+\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\5\30\r\2"+
		"\u00b4\u00b5\7,\2\2\u00b5\u00b6\b\f\1\2\u00b6\27\3\2\2\2\u00b7\u00b8\7"+
		"\5\2\2\u00b8\u00bc\b\r\1\2\u00b9\u00ba\7\4\2\2\u00ba\u00bc\b\r\1\2\u00bb"+
		"\u00b7\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00be\7\22\2"+
		"\2\u00be\u00cb\b\16\1\2\u00bf\u00c0\7\23\2\2\u00c0\u00cb\b\16\1\2\u00c1"+
		"\u00c2\5\34\17\2\u00c2\u00c3\b\16\1\2\u00c3\u00cb\3\2\2\2\u00c4\u00c5"+
		"\7\25\2\2\u00c5\u00cb\b\16\1\2\u00c6\u00c7\7\t\2\2\u00c7\u00cb\b\16\1"+
		"\2\u00c8\u00c9\7\n\2\2\u00c9\u00cb\b\16\1\2\u00ca\u00bd\3\2\2\2\u00ca"+
		"\u00bf\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c6\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\33\3\2\2\2\u00cc\u00ce\7*\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\7\24\2\2\u00d2\u00d4\t\5\2\2\u00d3\u00d2\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00dc\b\17\1\2\u00d6"+
		"\u00d7\7\24\2\2\u00d7\u00d8\t\5\2\2\u00d8\u00dc\b\17\1\2\u00d9\u00da\7"+
		"\24\2\2\u00da\u00dc\b\17\1\2\u00db\u00cd\3\2\2\2\u00db\u00d6\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\35\3\2\2\2\17$\65MRc\u0090\u00ab\u00ad\u00bb\u00ca"+
		"\u00cf\u00d3\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}