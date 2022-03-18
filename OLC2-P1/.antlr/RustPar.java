// Generated from d:\ARCHIVOS\Documents\1s_2022\compi2\lab\Repositorio\OLC2-P1\RustPar.g4 by ANTLR 4.8

    import "OLC2/interfaces"
    import "OLC2/expresion"
    import "OLC2/instruction"
    import "OLC2/instructionExpre"
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
		PRINT_CON=1, T_NUMBER=2, T_FLOAT=3, T_STRING=4, T_BOOL=5, T_STR=6, IF=7, 
		ELSE=8, MATCH=9, MTOR=10, TRUE=11, FALSE=12, AS=13, POW=14, POWF=15, LET=16, 
		MUT=17, TO_STRING=18, TO_OWNED=19, PUBLIC=20, TYPETHEN=21, FN=22, MAIN=23, 
		NUMBER=24, FLOAT=25, STRING=26, PUNTO=27, COMA=28, PTCOMA=29, DOSPUNTO=30, 
		DPUNTO2=31, ASIGNACION=32, MTHEN=33, GUIONB=34, ID=35, DISTINTO=36, IGUAL=37, 
		MAYORIGUAL=38, MENORIGUAL=39, MAYOR=40, MENOR=41, MUL=42, DIV=43, ADD=44, 
		SUB=45, MOD=46, AND=47, OR=48, NOT=49, AMP=50, PARIZQ=51, PARDER=52, LLAVEIZQ=53, 
		LLAVEDER=54, CORIZQ=55, CORDER=56, WHITESPACE=57, L_COMMENT=58;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_list_Funciones = 2, RULE_funcion = 3, 
		RULE_t_access = 4, RULE_params_declar = 5, RULE_fn_main = 6, RULE_instruccion = 7, 
		RULE_instruccion_only = 8, RULE_printconsola = 9, RULE_listParams = 10, 
		RULE_declaracion = 11, RULE_is_mut = 12, RULE_array_type = 13, RULE_asignacion = 14, 
		RULE_list_index = 15, RULE_index_array = 16, RULE_if_sent = 17, RULE_if_exp = 18, 
		RULE_list_elseif = 19, RULE_list_elseif_exp = 20, RULE_else_if = 21, RULE_else_if_exp = 22, 
		RULE_match_sent = 23, RULE_match_brazos = 24, RULE_matchbrazo = 25, RULE_listaOpciones = 26, 
		RULE_bloque_inst = 27, RULE_bloque_exp = 28, RULE_tipos_var = 29, RULE_expression = 30, 
		RULE_expr_arit = 31, RULE_casteo = 32, RULE_tipo_cast = 33, RULE_primitivo = 34, 
		RULE_listIDArray = 35, RULE_strings = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "list_Funciones", "funcion", "t_access", "params_declar", 
			"fn_main", "instruccion", "instruccion_only", "printconsola", "listParams", 
			"declaracion", "is_mut", "array_type", "asignacion", "list_index", "index_array", 
			"if_sent", "if_exp", "list_elseif", "list_elseif_exp", "else_if", "else_if_exp", 
			"match_sent", "match_brazos", "matchbrazo", "listaOpciones", "bloque_inst", 
			"bloque_exp", "tipos_var", "expression", "expr_arit", "casteo", "tipo_cast", 
			"primitivo", "listIDArray", "strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", 
			"'powf'", "'let'", "'mut'", "'.to_string()'", "'.to_owned()'", "'pub'", 
			"'->'", "'fn'", "'main'", null, null, null, "'.'", "','", "';'", "'::'", 
			"':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", 
			"LET", "MUT", "TO_STRING", "TO_OWNED", "PUBLIC", "TYPETHEN", "FN", "MAIN", 
			"NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", 
			"ASIGNACION", "MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", 
			"OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", 
			"CORDER", "WHITESPACE", "L_COMMENT"
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
		public List_FuncionesContext list_Funciones;
		public List_FuncionesContext list_Funciones() {
			return getRuleContext(List_FuncionesContext.class,0);
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
			setState(74);
			((StartContext)_localctx).list_Funciones = list_Funciones(0);
			_localctx.lista = ((StartContext)_localctx).list_Funciones.lista
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_CON) | (1L << IF) | (1L << MATCH) | (1L << LET) | (1L << ID))) != 0)) {
				{
				{
				setState(77);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(82);
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

	public static class List_FuncionesContext extends ParserRuleContext {
		public *arrayList.List lista;
		public List_FuncionesContext lisfun;
		public FuncionContext funcion;
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public List_FuncionesContext list_Funciones() {
			return getRuleContext(List_FuncionesContext.class,0);
		}
		public List_FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_Funciones; }
	}

	public final List_FuncionesContext list_Funciones() throws RecognitionException {
		return list_Funciones(0);
	}

	private List_FuncionesContext list_Funciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_FuncionesContext _localctx = new List_FuncionesContext(_ctx, _parentState);
		List_FuncionesContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_list_Funciones, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86);
			((List_FuncionesContext)_localctx).funcion = funcion();
			 _localctx.lista.Add( ((List_FuncionesContext)_localctx).funcion.instr ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_FuncionesContext(_parentctx, _parentState);
					_localctx.lisfun = _prevctx;
					_localctx.lisfun = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list_Funciones);
					setState(89);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(90);
					((List_FuncionesContext)_localctx).funcion = funcion();

					                                                    ((List_FuncionesContext)_localctx).lisfun.lista.Add( ((List_FuncionesContext)_localctx).funcion.instr)
					                                                    _localctx.lista =  ((List_FuncionesContext)_localctx).lisfun.lista
					                                                  
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class FuncionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Fn_mainContext fn_main;
		public Token ID;
		public Tipos_varContext tipos_var;
		public Bloque_instContext bloque_inst;
		public Params_declarContext params_declar;
		public Fn_mainContext fn_main() {
			return getRuleContext(Fn_mainContext.class,0);
		}
		public T_accessContext t_access() {
			return getRuleContext(T_accessContext.class,0);
		}
		public TerminalNode FN() { return getToken(RustPar.FN, 0); }
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public TerminalNode TYPETHEN() { return getToken(RustPar.TYPETHEN, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public Params_declarContext params_declar() {
			return getRuleContext(Params_declarContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcion);
		 listParams :=  arrayList.New() 
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((FuncionContext)_localctx).fn_main = fn_main();
				_localctx.instr =  ((FuncionContext)_localctx).fn_main.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				t_access();
				setState(102);
				match(FN);
				setState(103);
				((FuncionContext)_localctx).ID = match(ID);
				setState(104);
				match(PARIZQ);
				setState(105);
				match(PARDER);
				setState(106);
				match(TYPETHEN);
				setState(107);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(108);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = interfaces.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, ((FuncionContext)_localctx).tipos_var.tipo )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				t_access();
				setState(112);
				match(FN);
				setState(113);
				((FuncionContext)_localctx).ID = match(ID);
				setState(114);
				match(PARIZQ);
				setState(115);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(116);
				match(PARDER);
				setState(117);
				match(TYPETHEN);
				setState(118);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(119);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = interfaces.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),((FuncionContext)_localctx).params_declar.lista, ((FuncionContext)_localctx).bloque_inst.l,((FuncionContext)_localctx).tipos_var.tipo)
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

	public static class T_accessContext extends ParserRuleContext {
		public interfaces.TipoAccess modAccess;
		public TerminalNode PUBLIC() { return getToken(RustPar.PUBLIC, 0); }
		public T_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_access; }
	}

	public final T_accessContext t_access() throws RecognitionException {
		T_accessContext _localctx = new T_accessContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_t_access);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(PUBLIC);
				 _localctx.modAccess = interfaces.PUBLIC
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 2);
				{
				 _localctx.modAccess = interfaces.PRIVATE
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

	public static class Params_declarContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Params_declarContext sublista;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode DPUNTO2() { return getToken(RustPar.DPUNTO2, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public Params_declarContext params_declar() {
			return getRuleContext(Params_declarContext.class,0);
		}
		public Params_declarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_declar; }
	}

	public final Params_declarContext params_declar() throws RecognitionException {
		return params_declar(0);
	}

	private Params_declarContext params_declar(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Params_declarContext _localctx = new Params_declarContext(_ctx, _parentState);
		Params_declarContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_params_declar, _p);

		_localctx.lista =  arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			match(ID);
			setState(131);
			match(DPUNTO2);
			setState(132);
			tipos_var();
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Params_declarContext(_parentctx, _parentState);
					_localctx.sublista = _prevctx;
					_localctx.sublista = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_params_declar);
					setState(134);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(135);
					match(COMA);
					setState(136);
					match(ID);
					setState(137);
					match(DPUNTO2);
					setState(138);
					tipos_var();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Fn_mainContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Bloque_instContext bloque_inst;
		public TerminalNode FN() { return getToken(RustPar.FN, 0); }
		public TerminalNode MAIN() { return getToken(RustPar.MAIN, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public Fn_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_main; }
	}

	public final Fn_mainContext fn_main() throws RecognitionException {
		Fn_mainContext _localctx = new Fn_mainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fn_main);
		 listParams:= arrayList.New() 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FN);
			setState(145);
			match(MAIN);
			setState(146);
			match(PARIZQ);
			setState(147);
			match(PARDER);
			setState(148);
			((Fn_mainContext)_localctx).bloque_inst = bloque_inst();
			 _localctx.instr = interfaces.NewFunction("main",listParams,((Fn_mainContext)_localctx).bloque_inst.l, interfaces.VOID)
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
		public If_sentContext if_sent;
		public Match_sentContext match_sent;
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
		public If_sentContext if_sent() {
			return getRuleContext(If_sentContext.class,0);
		}
		public Match_sentContext match_sent() {
			return getRuleContext(Match_sentContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruccion);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((InstruccionContext)_localctx).printconsola = printconsola();
				setState(152);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(156);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(160);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				((InstruccionContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((InstruccionContext)_localctx).if_sent.instr
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				((InstruccionContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((InstruccionContext)_localctx).match_sent.instr
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

	public static class Instruccion_onlyContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public PrintconsolaContext printconsola;
		public DeclaracionContext declaracion;
		public AsignacionContext asignacion;
		public If_sentContext if_sent;
		public Match_sentContext match_sent;
		public PrintconsolaContext printconsola() {
			return getRuleContext(PrintconsolaContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public If_sentContext if_sent() {
			return getRuleContext(If_sentContext.class,0);
		}
		public Match_sentContext match_sent() {
			return getRuleContext(Match_sentContext.class,0);
		}
		public Instruccion_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_only; }
	}

	public final Instruccion_onlyContext instruccion_only() throws RecognitionException {
		Instruccion_onlyContext _localctx = new Instruccion_onlyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccion_only);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((Instruccion_onlyContext)_localctx).printconsola = printconsola();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).printconsola.instr
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				((Instruccion_onlyContext)_localctx).declaracion = declaracion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).declaracion.instr
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				((Instruccion_onlyContext)_localctx).asignacion = asignacion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).asignacion.instr
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				((Instruccion_onlyContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).if_sent.instr
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				((Instruccion_onlyContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).match_sent.instr
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
		public Token PRINT_CON;
		public ListParamsContext listParams;
		public TerminalNode PRINT_CON() { return getToken(RustPar.PRINT_CON, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public PrintconsolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printconsola; }
	}

	public final PrintconsolaContext printconsola() throws RecognitionException {
		PrintconsolaContext _localctx = new PrintconsolaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printconsola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((PrintconsolaContext)_localctx).PRINT_CON = match(PRINT_CON);
			setState(189);
			match(PARIZQ);
			setState(190);
			((PrintconsolaContext)_localctx).listParams = listParams(0);
			setState(191);
			match(PARDER);
			_localctx.instr = instruction.NewImprimir(((PrintconsolaContext)_localctx).listParams.l_e, (((PrintconsolaContext)_localctx).PRINT_CON!=null?((PrintconsolaContext)_localctx).PRINT_CON.getLine():0), localctx.(*PrintconsolaContext).Get_PRINT_CON().GetColumn() )
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

	public static class ListParamsContext extends ParserRuleContext {
		public *arrayList.List l_e;
		public ListParamsContext list;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_listParams, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(195);
			((ListParamsContext)_localctx).expression = expression();
			_localctx.l_e.Add(((ListParamsContext)_localctx).expression.p)
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(198);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(199);
					match(COMA);
					setState(200);
					((ListParamsContext)_localctx).expression = expression();

					                                              ((ListParamsContext)_localctx).list.l_e.Add(((ListParamsContext)_localctx).expression.p)
					                                              _localctx.l_e = ((ListParamsContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(207);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Is_mutContext isMut;
		public Token id;
		public Tipos_varContext tipos_var;
		public Token asig;
		public ExpressionContext expression;
		public Array_typeContext array_type;
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
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracion);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(LET);
				setState(209);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(210);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(211);
				match(DPUNTO2);
				setState(212);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(213);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(214);
				((DeclaracionContext)_localctx).expression = expression();

				                        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(LET);
				setState(218);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(219);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(220);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(221);
				((DeclaracionContext)_localctx).expression = expression();

				                      _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(LET);
				setState(225);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(226);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(227);
				match(DPUNTO2);
				setState(228);
				((DeclaracionContext)_localctx).array_type = array_type();
				setState(229);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(230);
				((DeclaracionContext)_localctx).expression = expression();

				                      _localctx.instr = instruction.NewArrayDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).array_type.ty, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
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
		enterRule(_localctx, 24, RULE_is_mut);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
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

	public static class Array_typeContext extends ParserRuleContext {
		public *arrayList.List ty;
		public Token CORIZQ;
		public Array_typeContext array_type;
		public ExpressionContext expression;
		public Tipos_varContext tipos_var;
		public TerminalNode CORIZQ() { return getToken(RustPar.CORIZQ, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(RustPar.PTCOMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(RustPar.CORDER, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_type);

		    _localctx.ty = arrayList.New()

		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(241);
				((Array_typeContext)_localctx).array_type = array_type();
				setState(242);
				match(PTCOMA);
				setState(243);
				((Array_typeContext)_localctx).expression = expression();
				setState(244);
				match(CORDER);

				                                        nType := interfaces.NewArrayType(interfaces.ARRAY, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                        ((Array_typeContext)_localctx).array_type.ty.Add(nType)
				                                        _localctx.ty = ((Array_typeContext)_localctx).array_type.ty
				                                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(248);
				((Array_typeContext)_localctx).tipos_var = tipos_var();
				setState(249);
				match(PTCOMA);
				setState(250);
				((Array_typeContext)_localctx).expression = expression();
				setState(251);
				match(CORDER);

				                                      nType := interfaces.NewArrayType(((Array_typeContext)_localctx).tipos_var.tipo, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                      _localctx.ty.Add(nType)
				                                    
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

	public static class AsignacionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token id;
		public ExpressionContext expression;
		public List_indexContext list_index;
		public TerminalNode ASIGNACION() { return getToken(RustPar.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public List_indexContext list_index() {
			return getRuleContext(List_indexContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_asignacion);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((AsignacionContext)_localctx).id = match(ID);
				setState(257);
				match(ASIGNACION);
				setState(258);
				((AsignacionContext)_localctx).expression = expression();
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, nil, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((AsignacionContext)_localctx).id = match(ID);
				setState(262);
				((AsignacionContext)_localctx).list_index = list_index(0);
				setState(263);
				match(ASIGNACION);
				setState(264);
				((AsignacionContext)_localctx).expression = expression();
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, ((AsignacionContext)_localctx).list_index.lista, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
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

	public static class List_indexContext extends ParserRuleContext {
		public *arrayList.List lista;
		public List_indexContext listi;
		public Index_arrayContext index_array;
		public Index_arrayContext index_array() {
			return getRuleContext(Index_arrayContext.class,0);
		}
		public List_indexContext list_index() {
			return getRuleContext(List_indexContext.class,0);
		}
		public List_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_index; }
	}

	public final List_indexContext list_index() throws RecognitionException {
		return list_index(0);
	}

	private List_indexContext list_index(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_indexContext _localctx = new List_indexContext(_ctx, _parentState);
		List_indexContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_list_index, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(270);
			((List_indexContext)_localctx).index_array = index_array();
			_localctx.lista.Add(((List_indexContext)_localctx).index_array.index)
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_indexContext(_parentctx, _parentState);
					_localctx.listi = _prevctx;
					_localctx.listi = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list_index);
					setState(273);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(274);
					((List_indexContext)_localctx).index_array = index_array();

					                                                ((List_indexContext)_localctx).listi.lista.Add(((List_indexContext)_localctx).index_array.index)
					                                                _localctx.lista = ((List_indexContext)_localctx).listi.lista
					                                            
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Index_arrayContext extends ParserRuleContext {
		public interfaces.Expresion index;
		public ExpressionContext expression;
		public TerminalNode CORIZQ() { return getToken(RustPar.CORIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(RustPar.CORDER, 0); }
		public Index_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_array; }
	}

	public final Index_arrayContext index_array() throws RecognitionException {
		Index_arrayContext _localctx = new Index_arrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_index_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(CORIZQ);
			setState(283);
			((Index_arrayContext)_localctx).expression = expression();
			setState(284);
			match(CORDER);
			_localctx.index = ((Index_arrayContext)_localctx).expression.p
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

	public static class If_sentContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token IF;
		public ExpressionContext expression;
		public Bloque_instContext bloque_inst;
		public Bloque_instContext bprin;
		public Bloque_instContext belse;
		public List_elseifContext list_elseif;
		public TerminalNode IF() { return getToken(RustPar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Bloque_instContext> bloque_inst() {
			return getRuleContexts(Bloque_instContext.class);
		}
		public Bloque_instContext bloque_inst(int i) {
			return getRuleContext(Bloque_instContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(RustPar.ELSE, 0); }
		public List_elseifContext list_elseif() {
			return getRuleContext(List_elseifContext.class,0);
		}
		public If_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sent; }
	}

	public final If_sentContext if_sent() throws RecognitionException {
		If_sentContext _localctx = new If_sentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_sent);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((If_sentContext)_localctx).IF = match(IF);
				setState(288);
				((If_sentContext)_localctx).expression = expression();
				setState(289);
				((If_sentContext)_localctx).bloque_inst = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p, ((If_sentContext)_localctx).bloque_inst.l, nil,nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				((If_sentContext)_localctx).IF = match(IF);
				setState(293);
				((If_sentContext)_localctx).expression = expression();
				setState(294);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(295);
				match(ELSE);
				setState(296);
				((If_sentContext)_localctx).belse = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,nil,((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((If_sentContext)_localctx).IF = match(IF);
				setState(300);
				((If_sentContext)_localctx).expression = expression();
				setState(301);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(302);
				((If_sentContext)_localctx).list_elseif = list_elseif();
				setState(303);
				match(ELSE);
				setState(304);
				((If_sentContext)_localctx).belse = bloque_inst();

				        _localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,((If_sentContext)_localctx).list_elseif.lista, ((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				    
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

	public static class If_expContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token IF;
		public ExpressionContext expression;
		public Bloque_expContext bprin_e;
		public Bloque_expContext belse_e;
		public List_elseif_expContext list_elseif_exp;
		public TerminalNode IF() { return getToken(RustPar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(RustPar.ELSE, 0); }
		public List<Bloque_expContext> bloque_exp() {
			return getRuleContexts(Bloque_expContext.class);
		}
		public Bloque_expContext bloque_exp(int i) {
			return getRuleContext(Bloque_expContext.class,i);
		}
		public List_elseif_expContext list_elseif_exp() {
			return getRuleContext(List_elseif_expContext.class,0);
		}
		public If_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_exp; }
	}

	public final If_expContext if_exp() throws RecognitionException {
		If_expContext _localctx = new If_expContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_exp);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				((If_expContext)_localctx).IF = match(IF);
				setState(310);
				((If_expContext)_localctx).expression = expression();
				setState(311);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(312);
				match(ELSE);
				setState(313);
				((If_expContext)_localctx).belse_e = bloque_exp();
				_localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p, nil ,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, nil, ((If_expContext)_localctx).belse_e.p )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				((If_expContext)_localctx).IF = match(IF);
				setState(317);
				((If_expContext)_localctx).expression = expression();
				setState(318);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(319);
				((If_expContext)_localctx).list_elseif_exp = list_elseif_exp();
				setState(320);
				match(ELSE);
				setState(321);
				((If_expContext)_localctx).belse_e = bloque_exp();

				        _localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p,nil,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, ((If_expContext)_localctx).list_elseif_exp.lista,  ((If_expContext)_localctx).belse_e.p )
				    
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

	public static class List_elseifContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Else_ifContext else_if;
		public List<Else_ifContext> list = new ArrayList<Else_ifContext>();
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public List_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_elseif; }
	}

	public final List_elseifContext list_elseif() throws RecognitionException {
		List_elseifContext _localctx = new List_elseifContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_list_elseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(326);
					((List_elseifContext)_localctx).else_if = else_if();
					((List_elseifContext)_localctx).list.add(((List_elseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(329); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			                    listInt := localctx.(*List_elseifContext).GetList()
			                    for _, e := range listInt {
			                        _localctx.lista.Add(e.GetInstr())
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

	public static class List_elseif_expContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Else_if_expContext else_if_exp;
		public List<Else_if_expContext> list = new ArrayList<Else_if_expContext>();
		public List<Else_if_expContext> else_if_exp() {
			return getRuleContexts(Else_if_expContext.class);
		}
		public Else_if_expContext else_if_exp(int i) {
			return getRuleContext(Else_if_expContext.class,i);
		}
		public List_elseif_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_elseif_exp; }
	}

	public final List_elseif_expContext list_elseif_exp() throws RecognitionException {
		List_elseif_expContext _localctx = new List_elseif_expContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_elseif_exp);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(333);
					((List_elseif_expContext)_localctx).else_if_exp = else_if_exp();
					((List_elseif_expContext)_localctx).list.add(((List_elseif_expContext)_localctx).else_if_exp);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(336); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			                    listInt := localctx.(*List_elseif_expContext).GetList()
			                    for _, e := range listInt {
			                        _localctx.lista.Add(e.GetP())
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

	public static class Else_ifContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token ELSE;
		public ExpressionContext expression;
		public Bloque_instContext bloque_inst;
		public TerminalNode ELSE() { return getToken(RustPar.ELSE, 0); }
		public TerminalNode IF() { return getToken(RustPar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((Else_ifContext)_localctx).ELSE = match(ELSE);
			setState(341);
			match(IF);
			setState(342);
			((Else_ifContext)_localctx).expression = expression();
			setState(343);
			((Else_ifContext)_localctx).bloque_inst = bloque_inst();
			_localctx.instr = instruction.NewIf(((Else_ifContext)_localctx).expression.p,((Else_ifContext)_localctx).bloque_inst.l,nil,nil, (((Else_ifContext)_localctx).ELSE!=null?((Else_ifContext)_localctx).ELSE.getLine():0), localctx.(*Else_ifContext).Get_ELSE().GetColumn() )
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

	public static class Else_if_expContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token ELSE;
		public ExpressionContext expression;
		public Bloque_expContext bloque_exp;
		public TerminalNode ELSE() { return getToken(RustPar.ELSE, 0); }
		public TerminalNode IF() { return getToken(RustPar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bloque_expContext bloque_exp() {
			return getRuleContext(Bloque_expContext.class,0);
		}
		public Else_if_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_exp; }
	}

	public final Else_if_expContext else_if_exp() throws RecognitionException {
		Else_if_expContext _localctx = new Else_if_expContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else_if_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			((Else_if_expContext)_localctx).ELSE = match(ELSE);
			setState(347);
			match(IF);
			setState(348);
			((Else_if_expContext)_localctx).expression = expression();
			setState(349);
			((Else_if_expContext)_localctx).bloque_exp = bloque_exp();
			_localctx.p = instruction.NewIfExpre(((Else_if_expContext)_localctx).expression.p,nil,nil,nil, (((Else_if_expContext)_localctx).ELSE!=null?((Else_if_expContext)_localctx).ELSE.getLine():0), localctx.(*Else_if_expContext).Get_ELSE().GetColumn(), true, ((Else_if_expContext)_localctx).bloque_exp.p, nil, nil )
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

	public static class Match_sentContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token MATCH;
		public ExpressionContext expression;
		public Match_brazosContext brazos;
		public Token th;
		public Bloque_instContext bloque_inst;
		public Instruccion_onlyContext instruccion_only;
		public TerminalNode MATCH() { return getToken(RustPar.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(RustPar.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(RustPar.LLAVEDER, 0); }
		public Match_brazosContext match_brazos() {
			return getRuleContext(Match_brazosContext.class,0);
		}
		public TerminalNode GUIONB() { return getToken(RustPar.GUIONB, 0); }
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public TerminalNode MTHEN() { return getToken(RustPar.MTHEN, 0); }
		public Instruccion_onlyContext instruccion_only() {
			return getRuleContext(Instruccion_onlyContext.class,0);
		}
		public Match_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_sent; }
	}

	public final Match_sentContext match_sent() throws RecognitionException {
		Match_sentContext _localctx = new Match_sentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_match_sent);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(353);
				((Match_sentContext)_localctx).expression = expression();
				setState(354);
				match(LLAVEIZQ);
				setState(355);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(356);
				match(LLAVEDER);

				                        _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(360);
				((Match_sentContext)_localctx).expression = expression();
				setState(361);
				match(LLAVEIZQ);
				setState(362);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(363);
				match(GUIONB);
				setState(364);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(365);
				((Match_sentContext)_localctx).bloque_inst = bloque_inst();
				setState(366);
				match(COMA);
				setState(367);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, ((Match_sentContext)_localctx).bloque_inst.l, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(371);
				((Match_sentContext)_localctx).expression = expression();
				setState(372);
				match(LLAVEIZQ);
				setState(373);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(374);
				match(GUIONB);
				setState(375);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(376);
				((Match_sentContext)_localctx).instruccion_only = instruccion_only();
				setState(377);
				match(COMA);
				setState(378);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil,  ((Match_sentContext)_localctx).instruccion_only.instr,  (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
				      
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

	public static class Match_brazosContext extends ParserRuleContext {
		public *arrayList.List l_brazos;
		public Match_brazosContext listb;
		public MatchbrazoContext matchbrazo;
		public MatchbrazoContext matchbrazo() {
			return getRuleContext(MatchbrazoContext.class,0);
		}
		public Match_brazosContext match_brazos() {
			return getRuleContext(Match_brazosContext.class,0);
		}
		public Match_brazosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_brazos; }
	}

	public final Match_brazosContext match_brazos() throws RecognitionException {
		return match_brazos(0);
	}

	private Match_brazosContext match_brazos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Match_brazosContext _localctx = new Match_brazosContext(_ctx, _parentState);
		Match_brazosContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_match_brazos, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(384);
			((Match_brazosContext)_localctx).matchbrazo = matchbrazo();
			_localctx.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Match_brazosContext(_parentctx, _parentState);
					_localctx.listb = _prevctx;
					_localctx.listb = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_match_brazos);
					setState(387);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(388);
					((Match_brazosContext)_localctx).matchbrazo = matchbrazo();

					                                              ((Match_brazosContext)_localctx).listb.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
					                                              _localctx.l_brazos = ((Match_brazosContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class MatchbrazoContext extends ParserRuleContext {
		public instructionExpre.BrazoMatch brazo;
		public ListaOpcionesContext listaOpciones;
		public Token th;
		public Bloque_instContext bloque_inst;
		public Instruccion_onlyContext instruccion_only;
		public ListaOpcionesContext listaOpciones() {
			return getRuleContext(ListaOpcionesContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public TerminalNode MTHEN() { return getToken(RustPar.MTHEN, 0); }
		public Instruccion_onlyContext instruccion_only() {
			return getRuleContext(Instruccion_onlyContext.class,0);
		}
		public MatchbrazoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchbrazo; }
	}

	public final MatchbrazoContext matchbrazo() throws RecognitionException {
		MatchbrazoContext _localctx = new MatchbrazoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_matchbrazo);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(397);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(398);
				((MatchbrazoContext)_localctx).bloque_inst = bloque_inst();
				setState(399);
				match(COMA);
				 _localctx.brazo = instructionExpre.NewBrazoMatch(((MatchbrazoContext)_localctx).listaOpciones.lisop, ((MatchbrazoContext)_localctx).bloque_inst.l, nil, (((MatchbrazoContext)_localctx).th!=null?((MatchbrazoContext)_localctx).th.getLine():0), localctx.(*MatchbrazoContext).GetTh().GetColumn() ) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(403);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(404);
				((MatchbrazoContext)_localctx).instruccion_only = instruccion_only();
				setState(405);
				match(COMA);
				 _localctx.brazo = instructionExpre.NewBrazoMatch(((MatchbrazoContext)_localctx).listaOpciones.lisop, nil,  ((MatchbrazoContext)_localctx).instruccion_only.instr, (((MatchbrazoContext)_localctx).th!=null?((MatchbrazoContext)_localctx).th.getLine():0), localctx.(*MatchbrazoContext).GetTh().GetColumn() ) 
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

	public static class ListaOpcionesContext extends ParserRuleContext {
		public *arrayList.List lisop;
		public ListaOpcionesContext list;
		public PrimitivoContext primitivo;
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public TerminalNode MTOR() { return getToken(RustPar.MTOR, 0); }
		public ListaOpcionesContext listaOpciones() {
			return getRuleContext(ListaOpcionesContext.class,0);
		}
		public ListaOpcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaOpciones; }
	}

	public final ListaOpcionesContext listaOpciones() throws RecognitionException {
		return listaOpciones(0);
	}

	private ListaOpcionesContext listaOpciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaOpcionesContext _localctx = new ListaOpcionesContext(_ctx, _parentState);
		ListaOpcionesContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_listaOpciones, _p);

		    _localctx.lisop = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(411);
			((ListaOpcionesContext)_localctx).primitivo = primitivo();

			                    _localctx.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
			                  
			}
			_ctx.stop = _input.LT(-1);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaOpcionesContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listaOpciones);
					setState(414);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(415);
					match(MTOR);
					setState(416);
					((ListaOpcionesContext)_localctx).primitivo = primitivo();

					                                                      ((ListaOpcionesContext)_localctx).list.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
					                                                      _localctx.lisop =  ((ListaOpcionesContext)_localctx).list.lisop
					                                                    
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Bloque_instContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstruccionesContext instrucciones;
		public TerminalNode LLAVEIZQ() { return getToken(RustPar.LLAVEIZQ, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(RustPar.LLAVEDER, 0); }
		public Bloque_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_inst; }
	}

	public final Bloque_instContext bloque_inst() throws RecognitionException {
		Bloque_instContext _localctx = new Bloque_instContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bloque_inst);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(LLAVEIZQ);
				setState(425);
				((Bloque_instContext)_localctx).instrucciones = instrucciones();
				setState(426);
				match(LLAVEDER);
				_localctx.l = ((Bloque_instContext)_localctx).instrucciones.l 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(LLAVEIZQ);
				setState(430);
				match(LLAVEDER);
				_localctx.l = arrayList.New()
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

	public static class Bloque_expContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public ExpressionContext expression;
		public TerminalNode LLAVEIZQ() { return getToken(RustPar.LLAVEIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(RustPar.LLAVEDER, 0); }
		public Bloque_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_exp; }
	}

	public final Bloque_expContext bloque_exp() throws RecognitionException {
		Bloque_expContext _localctx = new Bloque_expContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bloque_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(LLAVEIZQ);
			setState(435);
			((Bloque_expContext)_localctx).expression = expression();
			setState(436);
			match(LLAVEDER);
			_localctx.p = ((Bloque_expContext)_localctx).expression.p
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
		enterRule(_localctx, 58, RULE_tipos_var);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(T_NUMBER);
				_localctx.tipo = interfaces.INTEGER
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(T_STRING);
				_localctx.tipo = interfaces.STRING
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				match(T_FLOAT);
				_localctx.tipo = interfaces.FLOAT
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				match(T_BOOL);
				_localctx.tipo = interfaces.BOOLEAN
				}
				break;
			case T_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
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
		enterRule(_localctx, 60, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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
		public Token CORIZQ;
		public ExpressionContext exp;
		public ExpressionContext expression;
		public ExpressionContext tam;
		public ListParamsContext listParams;
		public PrimitivoContext primitivo;
		public CasteoContext casteo;
		public If_expContext if_exp;
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
		public TerminalNode CORIZQ() { return getToken(RustPar.CORIZQ, 0); }
		public TerminalNode PTCOMA() { return getToken(RustPar.PTCOMA, 0); }
		public TerminalNode CORDER() { return getToken(RustPar.CORDER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public CasteoContext casteo() {
			return getRuleContext(CasteoContext.class,0);
		}
		public If_expContext if_exp() {
			return getRuleContext(If_expContext.class,0);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(455);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(456);
				((Expr_aritContext)_localctx).opU = expr_arit(15);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(459);
				match(T_NUMBER);
				setState(460);
				match(DOSPUNTO);
				setState(461);
				((Expr_aritContext)_localctx).op = match(POW);
				setState(462);
				match(PARIZQ);
				setState(463);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(464);
				match(COMA);
				setState(465);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(466);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 3:
				{
				setState(469);
				match(T_FLOAT);
				setState(470);
				match(DOSPUNTO);
				setState(471);
				((Expr_aritContext)_localctx).op = match(POWF);
				setState(472);
				match(PARIZQ);
				setState(473);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(474);
				match(COMA);
				setState(475);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(476);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 4:
				{
				setState(479);
				((Expr_aritContext)_localctx).op = match(NOT);
				setState(480);
				((Expr_aritContext)_localctx).opU = expr_arit(9);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"!",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 5:
				{
				setState(483);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(484);
				((Expr_aritContext)_localctx).exp = ((Expr_aritContext)_localctx).expression = expression();
				setState(485);
				match(PTCOMA);
				setState(486);
				((Expr_aritContext)_localctx).tam = ((Expr_aritContext)_localctx).expression = expression();
				setState(487);
				match(CORDER);
				 _localctx.p = expresion.NewArray(nil, ((Expr_aritContext)_localctx).exp.p, ((Expr_aritContext)_localctx).tam.p, 2, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 6:
				{
				setState(490);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(491);
				((Expr_aritContext)_localctx).listParams = listParams(0);
				setState(492);
				match(CORDER);
				 _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listParams.l_e, nil, nil, 1, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 7:
				{
				setState(495);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 8:
				{
				setState(498);
				match(PARIZQ);
				setState(499);
				((Expr_aritContext)_localctx).expression = expression();
				setState(500);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 9:
				{
				setState(503);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			case 10:
				{
				setState(506);
				((Expr_aritContext)_localctx).if_exp = if_exp();
				_localctx.p = ((Expr_aritContext)_localctx).if_exp.p
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(511);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(512);
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
						setState(513);
						((Expr_aritContext)_localctx).opDe = expr_arit(13);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(516);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(517);
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
						setState(518);
						((Expr_aritContext)_localctx).opDe = expr_arit(12);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(521);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(522);
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
						setState(523);
						((Expr_aritContext)_localctx).opDe = expr_arit(11);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(526);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(527);
						((Expr_aritContext)_localctx).op = match(AND);
						setState(528);
						((Expr_aritContext)_localctx).opDe = expr_arit(9);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(531);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(532);
						((Expr_aritContext)_localctx).op = match(OR);
						setState(533);
						((Expr_aritContext)_localctx).opDe = expr_arit(8);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 64, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(542);
			((CasteoContext)_localctx).expression = expression();
			setState(543);
			match(AS);
			setState(544);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(545);
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
		enterRule(_localctx, 66, RULE_tipo_cast);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
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
		public Token TRUE;
		public Token FALSE;
		public ListIDArrayContext list;
		public TerminalNode NUMBER() { return getToken(RustPar.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(RustPar.FLOAT, 0); }
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(RustPar.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RustPar.FALSE, 0); }
		public ListIDArrayContext listIDArray() {
			return getRuleContext(ListIDArrayContext.class,0);
		}
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primitivo);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
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
				setState(556);
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
				setState(558);
				((PrimitivoContext)_localctx).strings = strings();
				_localctx.p = ((PrimitivoContext)_localctx).strings.p
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(561);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				((PrimitivoContext)_localctx).FALSE = match(FALSE);
				 _localctx.p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).FALSE!=null?((PrimitivoContext)_localctx).FALSE.getLine():0), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(565);
				((PrimitivoContext)_localctx).list = listIDArray(0);
				 _localctx.p = ((PrimitivoContext)_localctx).list.p
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

	public static class ListIDArrayContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public ListIDArrayContext list;
		public Token ID;
		public Token CORIZQ;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(RustPar.CORIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(RustPar.CORDER, 0); }
		public ListIDArrayContext listIDArray() {
			return getRuleContext(ListIDArrayContext.class,0);
		}
		public ListIDArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listIDArray; }
	}

	public final ListIDArrayContext listIDArray() throws RecognitionException {
		return listIDArray(0);
	}

	private ListIDArrayContext listIDArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListIDArrayContext _localctx = new ListIDArrayContext(_ctx, _parentState);
		ListIDArrayContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_listIDArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(571);
			((ListIDArrayContext)_localctx).ID = match(ID);
			 
			      _localctx.p = expresion.NewIdentificador((((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getLine():0), localctx.(*ListIDArrayContext).Get_ID().GetColumn() )
			}
			_ctx.stop = _input.LT(-1);
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListIDArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listIDArray);
					setState(574);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(575);
					((ListIDArrayContext)_localctx).CORIZQ = match(CORIZQ);
					setState(576);
					((ListIDArrayContext)_localctx).expression = expression();
					setState(577);
					match(CORDER);
					 _localctx.p = expresion.NewArrayAccess(((ListIDArrayContext)_localctx).list.p, ((ListIDArrayContext)_localctx).expression.p, (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getLine():0), (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 72, RULE_strings);
		int _la;
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(585);
					match(AMP);
					}
					}
					setState(588); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AMP );
				setState(590);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(591);
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
				setState(595);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(596);
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
				setState(598);
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
		case 2:
			return list_Funciones_sempred((List_FuncionesContext)_localctx, predIndex);
		case 5:
			return params_declar_sempred((Params_declarContext)_localctx, predIndex);
		case 10:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 15:
			return list_index_sempred((List_indexContext)_localctx, predIndex);
		case 24:
			return match_brazos_sempred((Match_brazosContext)_localctx, predIndex);
		case 26:
			return listaOpciones_sempred((ListaOpcionesContext)_localctx, predIndex);
		case 31:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 35:
			return listIDArray_sempred((ListIDArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean list_Funciones_sempred(List_FuncionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean params_declar_sempred(Params_declarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean list_index_sempred(List_indexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_sempred(Match_brazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaOpciones_sempred(ListaOpcionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean listIDArray_sempred(ListIDArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u025d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\7\3Q\n\3\f\3\16\3"+
		"T\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16\4c\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5}\n\5\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bd\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ce\n\f\f\f\16\f\u00d1"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ec\n\r\3\16\3\16\3\16\5\16"+
		"\u00f1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0101\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u010e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u0118\n\21\f\21\16\21\u011b\13\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0136\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0147\n\24\3\25\6\25\u014a"+
		"\n\25\r\25\16\25\u014b\3\25\3\25\3\26\6\26\u0151\n\26\r\26\16\26\u0152"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0180\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u018a"+
		"\n\32\f\32\16\32\u018d\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u019b\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u01a6\n\34\f\34\16\34\u01a9\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u01b3\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01c4\n\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u0200\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u021b\n!\f!\16!\u021e\13!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u022b\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u023b\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7"+
		"%\u0247\n%\f%\16%\u024a\13%\3&\6&\u024d\n&\r&\16&\u024e\3&\3&\5&\u0253"+
		"\n&\3&\3&\3&\3&\3&\3&\5&\u025b\n&\3&\2\n\6\f\26 \62\66@H\'\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\6\4\2,-\60"+
		"\60\3\2./\3\2&+\3\2\24\25\2\u0274\2L\3\2\2\2\4R\3\2\2\2\6W\3\2\2\2\b|"+
		"\3\2\2\2\n\u0081\3\2\2\2\f\u0083\3\2\2\2\16\u0092\3\2\2\2\20\u00ab\3\2"+
		"\2\2\22\u00bc\3\2\2\2\24\u00be\3\2\2\2\26\u00c4\3\2\2\2\30\u00eb\3\2\2"+
		"\2\32\u00f0\3\2\2\2\34\u0100\3\2\2\2\36\u010d\3\2\2\2 \u010f\3\2\2\2\""+
		"\u011c\3\2\2\2$\u0135\3\2\2\2&\u0146\3\2\2\2(\u0149\3\2\2\2*\u0150\3\2"+
		"\2\2,\u0156\3\2\2\2.\u015c\3\2\2\2\60\u017f\3\2\2\2\62\u0181\3\2\2\2\64"+
		"\u019a\3\2\2\2\66\u019c\3\2\2\28\u01b2\3\2\2\2:\u01b4\3\2\2\2<\u01c3\3"+
		"\2\2\2>\u01c5\3\2\2\2@\u01ff\3\2\2\2B\u021f\3\2\2\2D\u022a\3\2\2\2F\u023a"+
		"\3\2\2\2H\u023c\3\2\2\2J\u025a\3\2\2\2LM\5\6\4\2MN\b\2\1\2N\3\3\2\2\2"+
		"OQ\5\20\t\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2"+
		"\2UV\b\3\1\2V\5\3\2\2\2WX\b\4\1\2XY\5\b\5\2YZ\b\4\1\2Za\3\2\2\2[\\\f\4"+
		"\2\2\\]\5\b\5\2]^\b\4\1\2^`\3\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2b\7\3\2\2\2ca\3\2\2\2de\5\16\b\2ef\b\5\1\2f}\3\2\2\2gh\5\n\6\2h"+
		"i\7\30\2\2ij\7%\2\2jk\7\65\2\2kl\7\66\2\2lm\7\27\2\2mn\5<\37\2no\58\35"+
		"\2op\b\5\1\2p}\3\2\2\2qr\5\n\6\2rs\7\30\2\2st\7%\2\2tu\7\65\2\2uv\5\f"+
		"\7\2vw\7\66\2\2wx\7\27\2\2xy\5<\37\2yz\58\35\2z{\b\5\1\2{}\3\2\2\2|d\3"+
		"\2\2\2|g\3\2\2\2|q\3\2\2\2}\t\3\2\2\2~\177\7\26\2\2\177\u0082\b\6\1\2"+
		"\u0080\u0082\b\6\1\2\u0081~\3\2\2\2\u0081\u0080\3\2\2\2\u0082\13\3\2\2"+
		"\2\u0083\u0084\b\7\1\2\u0084\u0085\7%\2\2\u0085\u0086\7!\2\2\u0086\u0087"+
		"\5<\37\2\u0087\u008f\3\2\2\2\u0088\u0089\f\4\2\2\u0089\u008a\7\36\2\2"+
		"\u008a\u008b\7%\2\2\u008b\u008c\7!\2\2\u008c\u008e\5<\37\2\u008d\u0088"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\r\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\30\2\2\u0093\u0094\7\31\2"+
		"\2\u0094\u0095\7\65\2\2\u0095\u0096\7\66\2\2\u0096\u0097\58\35\2\u0097"+
		"\u0098\b\b\1\2\u0098\17\3\2\2\2\u0099\u009a\5\24\13\2\u009a\u009b\7\37"+
		"\2\2\u009b\u009c\b\t\1\2\u009c\u00ac\3\2\2\2\u009d\u009e\5\30\r\2\u009e"+
		"\u009f\7\37\2\2\u009f\u00a0\b\t\1\2\u00a0\u00ac\3\2\2\2\u00a1\u00a2\5"+
		"\36\20\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\b\t\1\2\u00a4\u00ac\3\2\2\2"+
		"\u00a5\u00a6\5$\23\2\u00a6\u00a7\b\t\1\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9"+
		"\5\60\31\2\u00a9\u00aa\b\t\1\2\u00aa\u00ac\3\2\2\2\u00ab\u0099\3\2\2\2"+
		"\u00ab\u009d\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\b\n\1\2\u00af"+
		"\u00bd\3\2\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\b\n\1\2\u00b2\u00bd\3"+
		"\2\2\2\u00b3\u00b4\5\36\20\2\u00b4\u00b5\b\n\1\2\u00b5\u00bd\3\2\2\2\u00b6"+
		"\u00b7\5$\23\2\u00b7\u00b8\b\n\1\2\u00b8\u00bd\3\2\2\2\u00b9\u00ba\5\60"+
		"\31\2\u00ba\u00bb\b\n\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc"+
		"\u00b0\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2"+
		"\2\2\u00bd\23\3\2\2\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\7\65\2\2\u00c0\u00c1"+
		"\5\26\f\2\u00c1\u00c2\7\66\2\2\u00c2\u00c3\b\13\1\2\u00c3\25\3\2\2\2\u00c4"+
		"\u00c5\b\f\1\2\u00c5\u00c6\5> \2\u00c6\u00c7\b\f\1\2\u00c7\u00cf\3\2\2"+
		"\2\u00c8\u00c9\f\4\2\2\u00c9\u00ca\7\36\2\2\u00ca\u00cb\5> \2\u00cb\u00cc"+
		"\b\f\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00cf\3\2\2"+
		"\2\u00d2\u00d3\7\22\2\2\u00d3\u00d4\5\32\16\2\u00d4\u00d5\7%\2\2\u00d5"+
		"\u00d6\7!\2\2\u00d6\u00d7\5<\37\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\5> "+
		"\2\u00d9\u00da\b\r\1\2\u00da\u00ec\3\2\2\2\u00db\u00dc\7\22\2\2\u00dc"+
		"\u00dd\5\32\16\2\u00dd\u00de\7%\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\5"+
		"> \2\u00e0\u00e1\b\r\1\2\u00e1\u00ec\3\2\2\2\u00e2\u00e3\7\22\2\2\u00e3"+
		"\u00e4\5\32\16\2\u00e4\u00e5\7%\2\2\u00e5\u00e6\7!\2\2\u00e6\u00e7\5\34"+
		"\17\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\5> \2\u00e9\u00ea\b\r\1\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00d2\3\2\2\2\u00eb\u00db\3\2\2\2\u00eb\u00e2\3\2"+
		"\2\2\u00ec\31\3\2\2\2\u00ed\u00ee\7\23\2\2\u00ee\u00f1\b\16\1\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\33\3\2\2"+
		"\2\u00f2\u00f3\79\2\2\u00f3\u00f4\5\34\17\2\u00f4\u00f5\7\37\2\2\u00f5"+
		"\u00f6\5> \2\u00f6\u00f7\7:\2\2\u00f7\u00f8\b\17\1\2\u00f8\u0101\3\2\2"+
		"\2\u00f9\u00fa\79\2\2\u00fa\u00fb\5<\37\2\u00fb\u00fc\7\37\2\2\u00fc\u00fd"+
		"\5> \2\u00fd\u00fe\7:\2\2\u00fe\u00ff\b\17\1\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00f2\3\2\2\2\u0100\u00f9\3\2\2\2\u0101\35\3\2\2\2\u0102\u0103\7%\2\2"+
		"\u0103\u0104\7\"\2\2\u0104\u0105\5> \2\u0105\u0106\b\20\1\2\u0106\u010e"+
		"\3\2\2\2\u0107\u0108\7%\2\2\u0108\u0109\5 \21\2\u0109\u010a\7\"\2\2\u010a"+
		"\u010b\5> \2\u010b\u010c\b\20\1\2\u010c\u010e\3\2\2\2\u010d\u0102\3\2"+
		"\2\2\u010d\u0107\3\2\2\2\u010e\37\3\2\2\2\u010f\u0110\b\21\1\2\u0110\u0111"+
		"\5\"\22\2\u0111\u0112\b\21\1\2\u0112\u0119\3\2\2\2\u0113\u0114\f\4\2\2"+
		"\u0114\u0115\5\"\22\2\u0115\u0116\b\21\1\2\u0116\u0118\3\2\2\2\u0117\u0113"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"!\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\79\2\2\u011d\u011e\5> \2\u011e"+
		"\u011f\7:\2\2\u011f\u0120\b\22\1\2\u0120#\3\2\2\2\u0121\u0122\7\t\2\2"+
		"\u0122\u0123\5> \2\u0123\u0124\58\35\2\u0124\u0125\b\23\1\2\u0125\u0136"+
		"\3\2\2\2\u0126\u0127\7\t\2\2\u0127\u0128\5> \2\u0128\u0129\58\35\2\u0129"+
		"\u012a\7\n\2\2\u012a\u012b\58\35\2\u012b\u012c\b\23\1\2\u012c\u0136\3"+
		"\2\2\2\u012d\u012e\7\t\2\2\u012e\u012f\5> \2\u012f\u0130\58\35\2\u0130"+
		"\u0131\5(\25\2\u0131\u0132\7\n\2\2\u0132\u0133\58\35\2\u0133\u0134\b\23"+
		"\1\2\u0134\u0136\3\2\2\2\u0135\u0121\3\2\2\2\u0135\u0126\3\2\2\2\u0135"+
		"\u012d\3\2\2\2\u0136%\3\2\2\2\u0137\u0138\7\t\2\2\u0138\u0139\5> \2\u0139"+
		"\u013a\5:\36\2\u013a\u013b\7\n\2\2\u013b\u013c\5:\36\2\u013c\u013d\b\24"+
		"\1\2\u013d\u0147\3\2\2\2\u013e\u013f\7\t\2\2\u013f\u0140\5> \2\u0140\u0141"+
		"\5:\36\2\u0141\u0142\5*\26\2\u0142\u0143\7\n\2\2\u0143\u0144\5:\36\2\u0144"+
		"\u0145\b\24\1\2\u0145\u0147\3\2\2\2\u0146\u0137\3\2\2\2\u0146\u013e\3"+
		"\2\2\2\u0147\'\3\2\2\2\u0148\u014a\5,\27\2\u0149\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\b\25\1\2\u014e)\3\2\2\2\u014f\u0151\5.\30\2\u0150\u014f\3\2\2\2"+
		"\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0155\b\26\1\2\u0155+\3\2\2\2\u0156\u0157\7\n\2\2\u0157"+
		"\u0158\7\t\2\2\u0158\u0159\5> \2\u0159\u015a\58\35\2\u015a\u015b\b\27"+
		"\1\2\u015b-\3\2\2\2\u015c\u015d\7\n\2\2\u015d\u015e\7\t\2\2\u015e\u015f"+
		"\5> \2\u015f\u0160\5:\36\2\u0160\u0161\b\30\1\2\u0161/\3\2\2\2\u0162\u0163"+
		"\7\13\2\2\u0163\u0164\5> \2\u0164\u0165\7\67\2\2\u0165\u0166\5\62\32\2"+
		"\u0166\u0167\78\2\2\u0167\u0168\b\31\1\2\u0168\u0180\3\2\2\2\u0169\u016a"+
		"\7\13\2\2\u016a\u016b\5> \2\u016b\u016c\7\67\2\2\u016c\u016d\5\62\32\2"+
		"\u016d\u016e\7$\2\2\u016e\u016f\7#\2\2\u016f\u0170\58\35\2\u0170\u0171"+
		"\7\36\2\2\u0171\u0172\78\2\2\u0172\u0173\b\31\1\2\u0173\u0180\3\2\2\2"+
		"\u0174\u0175\7\13\2\2\u0175\u0176\5> \2\u0176\u0177\7\67\2\2\u0177\u0178"+
		"\5\62\32\2\u0178\u0179\7$\2\2\u0179\u017a\7#\2\2\u017a\u017b\5\22\n\2"+
		"\u017b\u017c\7\36\2\2\u017c\u017d\78\2\2\u017d\u017e\b\31\1\2\u017e\u0180"+
		"\3\2\2\2\u017f\u0162\3\2\2\2\u017f\u0169\3\2\2\2\u017f\u0174\3\2\2\2\u0180"+
		"\61\3\2\2\2\u0181\u0182\b\32\1\2\u0182\u0183\5\64\33\2\u0183\u0184\b\32"+
		"\1\2\u0184\u018b\3\2\2\2\u0185\u0186\f\4\2\2\u0186\u0187\5\64\33\2\u0187"+
		"\u0188\b\32\1\2\u0188\u018a\3\2\2\2\u0189\u0185\3\2\2\2\u018a\u018d\3"+
		"\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\63\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u018f\5\66\34\2\u018f\u0190\7#\2\2\u0190\u0191\5"+
		"8\35\2\u0191\u0192\7\36\2\2\u0192\u0193\b\33\1\2\u0193\u019b\3\2\2\2\u0194"+
		"\u0195\5\66\34\2\u0195\u0196\7#\2\2\u0196\u0197\5\22\n\2\u0197\u0198\7"+
		"\36\2\2\u0198\u0199\b\33\1\2\u0199\u019b\3\2\2\2\u019a\u018e\3\2\2\2\u019a"+
		"\u0194\3\2\2\2\u019b\65\3\2\2\2\u019c\u019d\b\34\1\2\u019d\u019e\5F$\2"+
		"\u019e\u019f\b\34\1\2\u019f\u01a7\3\2\2\2\u01a0\u01a1\f\4\2\2\u01a1\u01a2"+
		"\7\f\2\2\u01a2\u01a3\5F$\2\u01a3\u01a4\b\34\1\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u01a0\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\67\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7\67\2\2\u01ab\u01ac"+
		"\5\4\3\2\u01ac\u01ad\78\2\2\u01ad\u01ae\b\35\1\2\u01ae\u01b3\3\2\2\2\u01af"+
		"\u01b0\7\67\2\2\u01b0\u01b1\78\2\2\u01b1\u01b3\b\35\1\2\u01b2\u01aa\3"+
		"\2\2\2\u01b2\u01af\3\2\2\2\u01b39\3\2\2\2\u01b4\u01b5\7\67\2\2\u01b5\u01b6"+
		"\5> \2\u01b6\u01b7\78\2\2\u01b7\u01b8\b\36\1\2\u01b8;\3\2\2\2\u01b9\u01ba"+
		"\7\4\2\2\u01ba\u01c4\b\37\1\2\u01bb\u01bc\7\6\2\2\u01bc\u01c4\b\37\1\2"+
		"\u01bd\u01be\7\5\2\2\u01be\u01c4\b\37\1\2\u01bf\u01c0\7\7\2\2\u01c0\u01c4"+
		"\b\37\1\2\u01c1\u01c2\7\b\2\2\u01c2\u01c4\b\37\1\2\u01c3\u01b9\3\2\2\2"+
		"\u01c3\u01bb\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c4=\3\2\2\2\u01c5\u01c6\5@!\2\u01c6\u01c7\b \1\2\u01c7?\3"+
		"\2\2\2\u01c8\u01c9\b!\1\2\u01c9\u01ca\7/\2\2\u01ca\u01cb\5@!\21\u01cb"+
		"\u01cc\b!\1\2\u01cc\u0200\3\2\2\2\u01cd\u01ce\7\4\2\2\u01ce\u01cf\7 \2"+
		"\2\u01cf\u01d0\7\20\2\2\u01d0\u01d1\7\65\2\2\u01d1\u01d2\5@!\2\u01d2\u01d3"+
		"\7\36\2\2\u01d3\u01d4\5@!\2\u01d4\u01d5\7\66\2\2\u01d5\u01d6\b!\1\2\u01d6"+
		"\u0200\3\2\2\2\u01d7\u01d8\7\5\2\2\u01d8\u01d9\7 \2\2\u01d9\u01da\7\21"+
		"\2\2\u01da\u01db\7\65\2\2\u01db\u01dc\5@!\2\u01dc\u01dd\7\36\2\2\u01dd"+
		"\u01de\5@!\2\u01de\u01df\7\66\2\2\u01df\u01e0\b!\1\2\u01e0\u0200\3\2\2"+
		"\2\u01e1\u01e2\7\63\2\2\u01e2\u01e3\5@!\13\u01e3\u01e4\b!\1\2\u01e4\u0200"+
		"\3\2\2\2\u01e5\u01e6\79\2\2\u01e6\u01e7\5> \2\u01e7\u01e8\7\37\2\2\u01e8"+
		"\u01e9\5> \2\u01e9\u01ea\7:\2\2\u01ea\u01eb\b!\1\2\u01eb\u0200\3\2\2\2"+
		"\u01ec\u01ed\79\2\2\u01ed\u01ee\5\26\f\2\u01ee\u01ef\7:\2\2\u01ef\u01f0"+
		"\b!\1\2\u01f0\u0200\3\2\2\2\u01f1\u01f2\5F$\2\u01f2\u01f3\b!\1\2\u01f3"+
		"\u0200\3\2\2\2\u01f4\u01f5\7\65\2\2\u01f5\u01f6\5> \2\u01f6\u01f7\7\66"+
		"\2\2\u01f7\u01f8\b!\1\2\u01f8\u0200\3\2\2\2\u01f9\u01fa\5B\"\2\u01fa\u01fb"+
		"\b!\1\2\u01fb\u0200\3\2\2\2\u01fc\u01fd\5&\24\2\u01fd\u01fe\b!\1\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01c8\3\2\2\2\u01ff\u01cd\3\2\2\2\u01ff\u01d7\3\2"+
		"\2\2\u01ff\u01e1\3\2\2\2\u01ff\u01e5\3\2\2\2\u01ff\u01ec\3\2\2\2\u01ff"+
		"\u01f1\3\2\2\2\u01ff\u01f4\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fc\3\2"+
		"\2\2\u0200\u021c\3\2\2\2\u0201\u0202\f\16\2\2\u0202\u0203\t\2\2\2\u0203"+
		"\u0204\5@!\17\u0204\u0205\b!\1\2\u0205\u021b\3\2\2\2\u0206\u0207\f\r\2"+
		"\2\u0207\u0208\t\3\2\2\u0208\u0209\5@!\16\u0209\u020a\b!\1\2\u020a\u021b"+
		"\3\2\2\2\u020b\u020c\f\f\2\2\u020c\u020d\t\4\2\2\u020d\u020e\5@!\r\u020e"+
		"\u020f\b!\1\2\u020f\u021b\3\2\2\2\u0210\u0211\f\n\2\2\u0211\u0212\7\61"+
		"\2\2\u0212\u0213\5@!\13\u0213\u0214\b!\1\2\u0214\u021b\3\2\2\2\u0215\u0216"+
		"\f\t\2\2\u0216\u0217\7\62\2\2\u0217\u0218\5@!\n\u0218\u0219\b!\1\2\u0219"+
		"\u021b\3\2\2\2\u021a\u0201\3\2\2\2\u021a\u0206\3\2\2\2\u021a\u020b\3\2"+
		"\2\2\u021a\u0210\3\2\2\2\u021a\u0215\3\2\2\2\u021b\u021e\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021dA\3\2\2\2\u021e\u021c\3\2\2\2"+
		"\u021f\u0220\7\65\2\2\u0220\u0221\5> \2\u0221\u0222\7\17\2\2\u0222\u0223"+
		"\5D#\2\u0223\u0224\7\66\2\2\u0224\u0225\b\"\1\2\u0225C\3\2\2\2\u0226\u0227"+
		"\7\5\2\2\u0227\u022b\b#\1\2\u0228\u0229\7\4\2\2\u0229\u022b\b#\1\2\u022a"+
		"\u0226\3\2\2\2\u022a\u0228\3\2\2\2\u022bE\3\2\2\2\u022c\u022d\7\32\2\2"+
		"\u022d\u023b\b$\1\2\u022e\u022f\7\33\2\2\u022f\u023b\b$\1\2\u0230\u0231"+
		"\5J&\2\u0231\u0232\b$\1\2\u0232\u023b\3\2\2\2\u0233\u0234\7\r\2\2\u0234"+
		"\u023b\b$\1\2\u0235\u0236\7\16\2\2\u0236\u023b\b$\1\2\u0237\u0238\5H%"+
		"\2\u0238\u0239\b$\1\2\u0239\u023b\3\2\2\2\u023a\u022c\3\2\2\2\u023a\u022e"+
		"\3\2\2\2\u023a\u0230\3\2\2\2\u023a\u0233\3\2\2\2\u023a\u0235\3\2\2\2\u023a"+
		"\u0237\3\2\2\2\u023bG\3\2\2\2\u023c\u023d\b%\1\2\u023d\u023e\7%\2\2\u023e"+
		"\u023f\b%\1\2\u023f\u0248\3\2\2\2\u0240\u0241\f\4\2\2\u0241\u0242\79\2"+
		"\2\u0242\u0243\5> \2\u0243\u0244\7:\2\2\u0244\u0245\b%\1\2\u0245\u0247"+
		"\3\2\2\2\u0246\u0240\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249I\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024d\7\64\2\2"+
		"\u024c\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\7\34\2\2\u0251\u0253\t\5\2\2"+
		"\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u025b"+
		"\b&\1\2\u0255\u0256\7\34\2\2\u0256\u0257\t\5\2\2\u0257\u025b\b&\1\2\u0258"+
		"\u0259\7\34\2\2\u0259\u025b\b&\1\2\u025a\u024c\3\2\2\2\u025a\u0255\3\2"+
		"\2\2\u025a\u0258\3\2\2\2\u025bK\3\2\2\2\"Ra|\u0081\u008f\u00ab\u00bc\u00cf"+
		"\u00eb\u00f0\u0100\u010d\u0119\u0135\u0146\u014b\u0152\u017f\u018b\u019a"+
		"\u01a7\u01b2\u01c3\u01ff\u021a\u021c\u022a\u023a\u0248\u024e\u0252\u025a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}