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
		MUT=17, STRUCT=18, TO_STRING=19, TO_OWNED=20, PUBLIC=21, TYPETHEN=22, 
		FN=23, MAIN=24, RETURN=25, REF=26, NUMBER=27, FLOAT=28, STRING=29, PUNTO=30, 
		COMA=31, PTCOMA=32, DOSPUNTO=33, DPUNTO2=34, ASIGNACION=35, MTHEN=36, 
		GUIONB=37, ID=38, DISTINTO=39, IGUAL=40, MAYORIGUAL=41, MENORIGUAL=42, 
		MAYOR=43, MENOR=44, MUL=45, DIV=46, ADD=47, SUB=48, MOD=49, AND=50, OR=51, 
		NOT=52, AMP=53, PARIZQ=54, PARDER=55, LLAVEIZQ=56, LLAVEDER=57, CORIZQ=58, 
		CORDER=59, WHITESPACE=60, L_COMMENT=61;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_list_Funciones = 2, RULE_funcion = 3, 
		RULE_t_access = 4, RULE_params_declar = 5, RULE_declar_parametros = 6, 
		RULE_fn_main = 7, RULE_instruccion = 8, RULE_instruccion_only = 9, RULE_newStruct = 10, 
		RULE_listdecStruct = 11, RULE_callFunction = 12, RULE_returnFun = 13, 
		RULE_printconsola = 14, RULE_listParams = 15, RULE_declaracion = 16, RULE_is_mut = 17, 
		RULE_array_type = 18, RULE_asignacion = 19, RULE_list_index = 20, RULE_index_array = 21, 
		RULE_if_sent = 22, RULE_if_exp = 23, RULE_list_elseif = 24, RULE_list_elseif_exp = 25, 
		RULE_else_if = 26, RULE_else_if_exp = 27, RULE_match_sent = 28, RULE_match_brazos = 29, 
		RULE_matchbrazo = 30, RULE_listaOpciones = 31, RULE_bloque_inst = 32, 
		RULE_bloque_exp = 33, RULE_tipos_var = 34, RULE_expression = 35, RULE_expr_arit = 36, 
		RULE_casteo = 37, RULE_tipo_cast = 38, RULE_l_StructExp = 39, RULE_primitivo = 40, 
		RULE_listIDArray = 41, RULE_strings = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "list_Funciones", "funcion", "t_access", "params_declar", 
			"declar_parametros", "fn_main", "instruccion", "instruccion_only", "newStruct", 
			"listdecStruct", "callFunction", "returnFun", "printconsola", "listParams", 
			"declaracion", "is_mut", "array_type", "asignacion", "list_index", "index_array", 
			"if_sent", "if_exp", "list_elseif", "list_elseif_exp", "else_if", "else_if_exp", 
			"match_sent", "match_brazos", "matchbrazo", "listaOpciones", "bloque_inst", 
			"bloque_exp", "tipos_var", "expression", "expr_arit", "casteo", "tipo_cast", 
			"l_StructExp", "primitivo", "listIDArray", "strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", 
			"'powf'", "'let'", "'mut'", "'struct'", "'.to_string()'", "'.to_owned()'", 
			"'pub'", "'->'", "'fn'", "'main'", "'return'", "'&mut'", null, null, 
			null, "'.'", "','", "';'", "'::'", "':'", "'='", "'=>'", "'_'", null, 
			"'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", 
			"'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", 
			"LET", "MUT", "STRUCT", "TO_STRING", "TO_OWNED", "PUBLIC", "TYPETHEN", 
			"FN", "MAIN", "RETURN", "REF", "NUMBER", "FLOAT", "STRING", "PUNTO", 
			"COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN", "GUIONB", 
			"ID", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", 
			"MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", "AMP", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE", "L_COMMENT"
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
			setState(86);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_CON) | (1L << IF) | (1L << MATCH) | (1L << LET) | (1L << STRUCT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(89);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(94);
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
			setState(98);
			((List_FuncionesContext)_localctx).funcion = funcion();
			 _localctx.lista.Add( ((List_FuncionesContext)_localctx).funcion.instr ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
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
					setState(101);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(102);
					((List_FuncionesContext)_localctx).funcion = funcion();

					                                                    ((List_FuncionesContext)_localctx).lisfun.lista.Add( ((List_FuncionesContext)_localctx).funcion.instr)
					                                                    _localctx.lista =  ((List_FuncionesContext)_localctx).lisfun.lista
					                                                  
					}
					} 
				}
				setState(109);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((FuncionContext)_localctx).fn_main = fn_main();
				_localctx.instr =  ((FuncionContext)_localctx).fn_main.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				t_access();
				setState(114);
				match(FN);
				setState(115);
				((FuncionContext)_localctx).ID = match(ID);
				setState(116);
				match(PARIZQ);
				setState(117);
				match(PARDER);
				setState(118);
				match(TYPETHEN);
				setState(119);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(120);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, ((FuncionContext)_localctx).tipos_var.tipo, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				t_access();
				setState(124);
				match(FN);
				setState(125);
				((FuncionContext)_localctx).ID = match(ID);
				setState(126);
				match(PARIZQ);
				setState(127);
				match(PARDER);
				setState(128);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				t_access();
				setState(132);
				match(FN);
				setState(133);
				((FuncionContext)_localctx).ID = match(ID);
				setState(134);
				match(PARIZQ);
				setState(135);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(136);
				match(PARDER);
				setState(137);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),((FuncionContext)_localctx).params_declar.lista,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				t_access();
				setState(141);
				match(FN);
				setState(142);
				((FuncionContext)_localctx).ID = match(ID);
				setState(143);
				match(PARIZQ);
				setState(144);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(145);
				match(PARDER);
				setState(146);
				match(TYPETHEN);
				setState(147);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(148);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),((FuncionContext)_localctx).params_declar.lista, ((FuncionContext)_localctx).bloque_inst.l,((FuncionContext)_localctx).tipos_var.tipo, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
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
		public Params_declarContext listdec;
		public Declar_parametrosContext declar_parametros;
		public Declar_parametrosContext declar_parametros() {
			return getRuleContext(Declar_parametrosContext.class,0);
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
			setState(159);
			((Params_declarContext)_localctx).declar_parametros = declar_parametros();
			   _localctx.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec) 
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Params_declarContext(_parentctx, _parentState);
					_localctx.listdec = _prevctx;
					_localctx.listdec = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_params_declar);
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163);
					match(COMA);
					setState(164);
					((Params_declarContext)_localctx).declar_parametros = declar_parametros();

					                                                                      ((Params_declarContext)_localctx).listdec.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec)
					                                                                      _localctx.lista =  ((Params_declarContext)_localctx).listdec.lista 
					}
					} 
				}
				setState(171);
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

	public static class Declar_parametrosContext extends ParserRuleContext {
		public interfaces.Instruction in_dec;
		public Is_mutContext isMut;
		public Token ID;
		public Tipos_varContext tipos_var;
		public Array_typeContext array_type;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode DPUNTO2() { return getToken(RustPar.DPUNTO2, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public Is_mutContext is_mut() {
			return getRuleContext(Is_mutContext.class,0);
		}
		public TerminalNode REF() { return getToken(RustPar.REF, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Declar_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar_parametros; }
	}

	public final Declar_parametrosContext declar_parametros() throws RecognitionException {
		Declar_parametrosContext _localctx = new Declar_parametrosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declar_parametros);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((Declar_parametrosContext)_localctx).isMut = is_mut();
				setState(173);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(174);
				match(DPUNTO2);
				setState(175);
				((Declar_parametrosContext)_localctx).tipos_var = tipos_var();

				                        listaIdes := arrayList.New()
				                        listaIdes.Add(expresion.NewIdentificador((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) ))
				                        decl := instruction.NewDeclaration((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), ((Declar_parametrosContext)_localctx).tipos_var.tipo, nil, ((Declar_parametrosContext)_localctx).isMut.mut, (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.in_dec = decl
				                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((Declar_parametrosContext)_localctx).isMut = is_mut();
				setState(179);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(180);
				match(DPUNTO2);
				setState(181);
				match(REF);
				setState(182);
				((Declar_parametrosContext)_localctx).array_type = array_type();

				                        listaIdes := arrayList.New()
				                        listaIdes.Add(expresion.NewIdentificador((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) ))
				                        decl := instruction.NewArrayDeclaration((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), ((Declar_parametrosContext)_localctx).array_type.ty, nil, ((Declar_parametrosContext)_localctx).isMut.mut, (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.in_dec = decl
				                    
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

	public static class Fn_mainContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token MAIN;
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
		enterRule(_localctx, 14, RULE_fn_main);
		 listParams:= arrayList.New() 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(FN);
			setState(188);
			((Fn_mainContext)_localctx).MAIN = match(MAIN);
			setState(189);
			match(PARIZQ);
			setState(190);
			match(PARDER);
			setState(191);
			((Fn_mainContext)_localctx).bloque_inst = bloque_inst();
			 _localctx.instr = instructionExpre.NewFunction("main",listParams,((Fn_mainContext)_localctx).bloque_inst.l, interfaces.VOID, (((Fn_mainContext)_localctx).MAIN!=null?((Fn_mainContext)_localctx).MAIN.getLine():0), (((Fn_mainContext)_localctx).MAIN!=null?((Fn_mainContext)_localctx).MAIN.getCharPositionInLine():0) )
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
		public NewStructContext newStruct;
		public CallFunctionContext callFunction;
		public ReturnFunContext returnFun;
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
		public NewStructContext newStruct() {
			return getRuleContext(NewStructContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ReturnFunContext returnFun() {
			return getRuleContext(ReturnFunContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccion);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((InstruccionContext)_localctx).printconsola = printconsola();
				setState(195);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(199);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(203);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				((InstruccionContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((InstruccionContext)_localctx).if_sent.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				((InstruccionContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((InstruccionContext)_localctx).match_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				((InstruccionContext)_localctx).newStruct = newStruct();
				_localctx.instr = ((InstruccionContext)_localctx).newStruct.str
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(215);
				((InstruccionContext)_localctx).callFunction = callFunction();
				setState(216);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).callFunction.instr
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(219);
				((InstruccionContext)_localctx).returnFun = returnFun();
				setState(220);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).returnFun.instr
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

	public static class Instruccion_onlyContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public PrintconsolaContext printconsola;
		public DeclaracionContext declaracion;
		public AsignacionContext asignacion;
		public If_sentContext if_sent;
		public Match_sentContext match_sent;
		public CallFunctionContext callFunction;
		public ReturnFunContext returnFun;
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
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ReturnFunContext returnFun() {
			return getRuleContext(ReturnFunContext.class,0);
		}
		public Instruccion_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_only; }
	}

	public final Instruccion_onlyContext instruccion_only() throws RecognitionException {
		Instruccion_onlyContext _localctx = new Instruccion_onlyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruccion_only);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				((Instruccion_onlyContext)_localctx).printconsola = printconsola();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				((Instruccion_onlyContext)_localctx).declaracion = declaracion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				((Instruccion_onlyContext)_localctx).asignacion = asignacion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				((Instruccion_onlyContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).if_sent.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				((Instruccion_onlyContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).match_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				((Instruccion_onlyContext)_localctx).callFunction = callFunction();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).callFunction.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				((Instruccion_onlyContext)_localctx).returnFun = returnFun();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).returnFun.instr
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

	public static class NewStructContext extends ParserRuleContext {
		public interfaces.Instruction str;
		public Token STRUCT;
		public Token ID;
		public ListdecStructContext listdecStruct;
		public TerminalNode STRUCT() { return getToken(RustPar.STRUCT, 0); }
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(RustPar.LLAVEIZQ, 0); }
		public ListdecStructContext listdecStruct() {
			return getRuleContext(ListdecStructContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(RustPar.LLAVEDER, 0); }
		public NewStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newStruct; }
	}

	public final NewStructContext newStruct() throws RecognitionException {
		NewStructContext _localctx = new NewStructContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_newStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((NewStructContext)_localctx).STRUCT = match(STRUCT);
			setState(249);
			((NewStructContext)_localctx).ID = match(ID);
			setState(250);
			match(LLAVEIZQ);
			setState(251);
			((NewStructContext)_localctx).listdecStruct = listdecStruct(0);
			setState(252);
			match(LLAVEDER);
			 _localctx.str = instructionExpre.NewStruct((((NewStructContext)_localctx).ID!=null?((NewStructContext)_localctx).ID.getText():null), ((NewStructContext)_localctx).listdecStruct.l, (((NewStructContext)_localctx).STRUCT!=null?((NewStructContext)_localctx).STRUCT.getLine():0), (((NewStructContext)_localctx).STRUCT!=null?((NewStructContext)_localctx).STRUCT.getCharPositionInLine():0)) 
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

	public static class ListdecStructContext extends ParserRuleContext {
		public *arrayList.List l;
		public ListdecStructContext list;
		public Token ID;
		public Tipos_varContext tipos_var;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode DPUNTO2() { return getToken(RustPar.DPUNTO2, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public ListdecStructContext listdecStruct() {
			return getRuleContext(ListdecStructContext.class,0);
		}
		public ListdecStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listdecStruct; }
	}

	public final ListdecStructContext listdecStruct() throws RecognitionException {
		return listdecStruct(0);
	}

	private ListdecStructContext listdecStruct(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListdecStructContext _localctx = new ListdecStructContext(_ctx, _parentState);
		ListdecStructContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_listdecStruct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(256);
			((ListdecStructContext)_localctx).ID = match(ID);
			setState(257);
			match(DPUNTO2);
			setState(258);
			((ListdecStructContext)_localctx).tipos_var = tipos_var();

			                    Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).ID!=null?((ListdecStructContext)_localctx).ID.getText():null), ((ListdecStructContext)_localctx).tipos_var.tipo)
			                    ((ListdecStructContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add(Str_atrib);
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListdecStructContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listdecStruct);
					setState(261);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(262);
					match(COMA);
					setState(263);
					((ListdecStructContext)_localctx).ID = match(ID);
					setState(264);
					match(DPUNTO2);
					setState(265);
					((ListdecStructContext)_localctx).tipos_var = tipos_var();

					                                                  Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).ID!=null?((ListdecStructContext)_localctx).ID.getText():null), ((ListdecStructContext)_localctx).tipos_var.tipo)
					                                                  ((ListdecStructContext)_localctx).list.l.Add(Str_atrib);
					                                                  ((ListdecStructContext)_localctx).l =  ((ListdecStructContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(272);
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

	public static class CallFunctionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public interfaces.Expresion p;
		public Token ID;
		public ListParamsContext listParams;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callFunction);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(274);
				match(PARIZQ);
				setState(275);
				match(PARDER);

				                        _localctx.instr = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.p = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(278);
				match(PARIZQ);
				setState(279);
				((CallFunctionContext)_localctx).listParams = listParams(0);
				setState(280);
				match(PARDER);

				                        _localctx.instr = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), ((CallFunctionContext)_localctx).listParams.l_e, (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.p = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), ((CallFunctionContext)_localctx).listParams.l_e, (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                    
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

	public static class ReturnFunContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public ExpressionContext expression;
		public TerminalNode RETURN() { return getToken(RustPar.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFun; }
	}

	public final ReturnFunContext returnFun() throws RecognitionException {
		ReturnFunContext _localctx = new ReturnFunContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnFun);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(RETURN);
				 _localctx.instr = instructionExpre.NewReturn(interfaces.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(RETURN);
				setState(288);
				((ReturnFunContext)_localctx).expression = expression();
				 _localctx.instr = instructionExpre.NewReturn(interfaces.NULL,((ReturnFunContext)_localctx).expression.p)
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
		enterRule(_localctx, 28, RULE_printconsola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((PrintconsolaContext)_localctx).PRINT_CON = match(PRINT_CON);
			setState(294);
			match(PARIZQ);
			setState(295);
			((PrintconsolaContext)_localctx).listParams = listParams(0);
			setState(296);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_listParams, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(300);
			((ListParamsContext)_localctx).expression = expression();
			_localctx.l_e.Add(((ListParamsContext)_localctx).expression.p)
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
					setState(303);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(304);
					match(COMA);
					setState(305);
					((ListParamsContext)_localctx).expression = expression();

					                                              ((ListParamsContext)_localctx).list.l_e.Add(((ListParamsContext)_localctx).expression.p)
					                                              _localctx.l_e = ((ListParamsContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 32, RULE_declaracion);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(LET);
				setState(314);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(315);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(316);
				match(DPUNTO2);
				setState(317);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(318);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(319);
				((DeclaracionContext)_localctx).expression = expression();

				                        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(LET);
				setState(323);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(324);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(325);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(326);
				((DeclaracionContext)_localctx).expression = expression();

				                      _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(LET);
				setState(330);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(331);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(332);
				match(DPUNTO2);
				setState(333);
				((DeclaracionContext)_localctx).array_type = array_type();
				setState(334);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(335);
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
		enterRule(_localctx, 34, RULE_is_mut);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
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
		enterRule(_localctx, 36, RULE_array_type);

		    _localctx.ty = arrayList.New()

		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(346);
				((Array_typeContext)_localctx).array_type = array_type();
				setState(347);
				match(PTCOMA);
				setState(348);
				((Array_typeContext)_localctx).expression = expression();
				setState(349);
				match(CORDER);

				                                        nType := interfaces.NewArrayType(interfaces.ARRAY, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                        ((Array_typeContext)_localctx).array_type.ty.Add(nType)
				                                        _localctx.ty = ((Array_typeContext)_localctx).array_type.ty
				                                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(353);
				((Array_typeContext)_localctx).tipos_var = tipos_var();
				setState(354);
				match(PTCOMA);
				setState(355);
				((Array_typeContext)_localctx).expression = expression();
				setState(356);
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
		enterRule(_localctx, 38, RULE_asignacion);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				((AsignacionContext)_localctx).id = match(ID);
				setState(362);
				match(ASIGNACION);
				setState(363);
				((AsignacionContext)_localctx).expression = expression();
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, nil, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				((AsignacionContext)_localctx).id = match(ID);
				setState(367);
				((AsignacionContext)_localctx).list_index = list_index(0);
				setState(368);
				match(ASIGNACION);
				setState(369);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_list_index, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(375);
			((List_indexContext)_localctx).index_array = index_array();
			_localctx.lista.Add(((List_indexContext)_localctx).index_array.index)
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
					setState(378);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(379);
					((List_indexContext)_localctx).index_array = index_array();

					                                                ((List_indexContext)_localctx).listi.lista.Add(((List_indexContext)_localctx).index_array.index)
					                                                _localctx.lista = ((List_indexContext)_localctx).listi.lista
					                                            
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 42, RULE_index_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(CORIZQ);
			setState(388);
			((Index_arrayContext)_localctx).expression = expression();
			setState(389);
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
		enterRule(_localctx, 44, RULE_if_sent);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				((If_sentContext)_localctx).IF = match(IF);
				setState(393);
				((If_sentContext)_localctx).expression = expression();
				setState(394);
				((If_sentContext)_localctx).bloque_inst = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p, ((If_sentContext)_localctx).bloque_inst.l, nil,nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				((If_sentContext)_localctx).IF = match(IF);
				setState(398);
				((If_sentContext)_localctx).expression = expression();
				setState(399);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(400);
				match(ELSE);
				setState(401);
				((If_sentContext)_localctx).belse = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,nil,((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				((If_sentContext)_localctx).IF = match(IF);
				setState(405);
				((If_sentContext)_localctx).expression = expression();
				setState(406);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(407);
				((If_sentContext)_localctx).list_elseif = list_elseif();
				setState(408);
				match(ELSE);
				setState(409);
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
		enterRule(_localctx, 46, RULE_if_exp);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				((If_expContext)_localctx).IF = match(IF);
				setState(415);
				((If_expContext)_localctx).expression = expression();
				setState(416);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(417);
				match(ELSE);
				setState(418);
				((If_expContext)_localctx).belse_e = bloque_exp();
				_localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p, nil ,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, nil, ((If_expContext)_localctx).belse_e.p )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				((If_expContext)_localctx).IF = match(IF);
				setState(422);
				((If_expContext)_localctx).expression = expression();
				setState(423);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(424);
				((If_expContext)_localctx).list_elseif_exp = list_elseif_exp();
				setState(425);
				match(ELSE);
				setState(426);
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
		enterRule(_localctx, 48, RULE_list_elseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(431);
					((List_elseifContext)_localctx).else_if = else_if();
					((List_elseifContext)_localctx).list.add(((List_elseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(434); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 50, RULE_list_elseif_exp);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(438);
					((List_elseif_expContext)_localctx).else_if_exp = else_if_exp();
					((List_elseif_expContext)_localctx).list.add(((List_elseif_expContext)_localctx).else_if_exp);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(441); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 52, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			((Else_ifContext)_localctx).ELSE = match(ELSE);
			setState(446);
			match(IF);
			setState(447);
			((Else_ifContext)_localctx).expression = expression();
			setState(448);
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
		enterRule(_localctx, 54, RULE_else_if_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			((Else_if_expContext)_localctx).ELSE = match(ELSE);
			setState(452);
			match(IF);
			setState(453);
			((Else_if_expContext)_localctx).expression = expression();
			setState(454);
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
		enterRule(_localctx, 56, RULE_match_sent);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(458);
				((Match_sentContext)_localctx).expression = expression();
				setState(459);
				match(LLAVEIZQ);
				setState(460);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(461);
				match(LLAVEDER);

				                        _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(465);
				((Match_sentContext)_localctx).expression = expression();
				setState(466);
				match(LLAVEIZQ);
				setState(467);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(468);
				match(GUIONB);
				setState(469);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(470);
				((Match_sentContext)_localctx).bloque_inst = bloque_inst();
				setState(471);
				match(COMA);
				setState(472);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, ((Match_sentContext)_localctx).bloque_inst.l, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(476);
				((Match_sentContext)_localctx).expression = expression();
				setState(477);
				match(LLAVEIZQ);
				setState(478);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(479);
				match(GUIONB);
				setState(480);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(481);
				((Match_sentContext)_localctx).instruccion_only = instruccion_only();
				setState(482);
				match(COMA);
				setState(483);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_match_brazos, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(489);
			((Match_brazosContext)_localctx).matchbrazo = matchbrazo();
			_localctx.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
					setState(492);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(493);
					((Match_brazosContext)_localctx).matchbrazo = matchbrazo();

					                                              ((Match_brazosContext)_localctx).listb.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
					                                              _localctx.l_brazos = ((Match_brazosContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 60, RULE_matchbrazo);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(502);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(503);
				((MatchbrazoContext)_localctx).bloque_inst = bloque_inst();
				setState(504);
				match(COMA);
				 _localctx.brazo = instructionExpre.NewBrazoMatch(((MatchbrazoContext)_localctx).listaOpciones.lisop, ((MatchbrazoContext)_localctx).bloque_inst.l, nil, (((MatchbrazoContext)_localctx).th!=null?((MatchbrazoContext)_localctx).th.getLine():0), localctx.(*MatchbrazoContext).GetTh().GetColumn() ) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(508);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(509);
				((MatchbrazoContext)_localctx).instruccion_only = instruccion_only();
				setState(510);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_listaOpciones, _p);

		    _localctx.lisop = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(516);
			((ListaOpcionesContext)_localctx).primitivo = primitivo();

			                    _localctx.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
			                  
			}
			_ctx.stop = _input.LT(-1);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
					setState(519);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(520);
					match(MTOR);
					setState(521);
					((ListaOpcionesContext)_localctx).primitivo = primitivo();

					                                                      ((ListaOpcionesContext)_localctx).list.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
					                                                      _localctx.lisop =  ((ListaOpcionesContext)_localctx).list.lisop
					                                                    
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 64, RULE_bloque_inst);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(LLAVEIZQ);
				setState(530);
				((Bloque_instContext)_localctx).instrucciones = instrucciones();
				setState(531);
				match(LLAVEDER);
				_localctx.l = ((Bloque_instContext)_localctx).instrucciones.l 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				match(LLAVEIZQ);
				setState(535);
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
		enterRule(_localctx, 66, RULE_bloque_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(LLAVEIZQ);
			setState(540);
			((Bloque_expContext)_localctx).expression = expression();
			setState(541);
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
		public TerminalNode STRUCT() { return getToken(RustPar.STRUCT, 0); }
		public Tipos_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_var; }
	}

	public final Tipos_varContext tipos_var() throws RecognitionException {
		Tipos_varContext _localctx = new Tipos_varContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tipos_var);
		try {
			setState(556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(T_NUMBER);
				_localctx.tipo = interfaces.INTEGER
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				match(T_STRING);
				_localctx.tipo = interfaces.STRING
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				match(T_FLOAT);
				_localctx.tipo = interfaces.FLOAT
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				match(T_BOOL);
				_localctx.tipo = interfaces.BOOLEAN
				}
				break;
			case T_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(552);
				match(T_STR);
				_localctx.tipo = interfaces.STR
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				match(STRUCT);
				_localctx.tipo = interfaces.STRUCT
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
		enterRule(_localctx, 70, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
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
		public Token ID;
		public L_StructExpContext l_StructExp;
		public PrimitivoContext primitivo;
		public CasteoContext casteo;
		public If_expContext if_exp;
		public CallFunctionContext callFunction;
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
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(RustPar.LLAVEIZQ, 0); }
		public L_StructExpContext l_StructExp() {
			return getRuleContext(L_StructExpContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(RustPar.LLAVEDER, 0); }
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public CasteoContext casteo() {
			return getRuleContext(CasteoContext.class,0);
		}
		public If_expContext if_exp() {
			return getRuleContext(If_expContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(562);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(563);
				((Expr_aritContext)_localctx).opU = expr_arit(17);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(566);
				match(T_NUMBER);
				setState(567);
				match(DOSPUNTO);
				setState(568);
				((Expr_aritContext)_localctx).op = match(POW);
				setState(569);
				match(PARIZQ);
				setState(570);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(571);
				match(COMA);
				setState(572);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(573);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 3:
				{
				setState(576);
				match(T_FLOAT);
				setState(577);
				match(DOSPUNTO);
				setState(578);
				((Expr_aritContext)_localctx).op = match(POWF);
				setState(579);
				match(PARIZQ);
				setState(580);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(581);
				match(COMA);
				setState(582);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(583);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 4:
				{
				setState(586);
				((Expr_aritContext)_localctx).op = match(NOT);
				setState(587);
				((Expr_aritContext)_localctx).opU = expr_arit(11);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"!",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 5:
				{
				setState(590);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(591);
				((Expr_aritContext)_localctx).exp = ((Expr_aritContext)_localctx).expression = expression();
				setState(592);
				match(PTCOMA);
				setState(593);
				((Expr_aritContext)_localctx).tam = ((Expr_aritContext)_localctx).expression = expression();
				setState(594);
				match(CORDER);
				 _localctx.p = expresion.NewArray(nil, ((Expr_aritContext)_localctx).exp.p, ((Expr_aritContext)_localctx).tam.p, 2, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 6:
				{
				setState(597);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(598);
				((Expr_aritContext)_localctx).listParams = listParams(0);
				setState(599);
				match(CORDER);
				 _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listParams.l_e, nil, nil, 1, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 7:
				{
				setState(602);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(603);
				match(LLAVEIZQ);
				setState(604);
				((Expr_aritContext)_localctx).l_StructExp = l_StructExp(0);
				setState(605);
				match(LLAVEDER);
				 _localctx.p = instructionExpre.NewStructExpre((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).l_StructExp.l, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0) ) 
				}
				break;
			case 8:
				{
				setState(608);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 9:
				{
				setState(611);
				match(PARIZQ);
				setState(612);
				((Expr_aritContext)_localctx).expression = expression();
				setState(613);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 10:
				{
				setState(616);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			case 11:
				{
				setState(619);
				((Expr_aritContext)_localctx).if_exp = if_exp();
				_localctx.p = ((Expr_aritContext)_localctx).if_exp.p
				}
				break;
			case 12:
				{
				setState(622);
				((Expr_aritContext)_localctx).callFunction = callFunction();
				_localctx.p = ((Expr_aritContext)_localctx).callFunction.p
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(652);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(627);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(628);
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
						setState(629);
						((Expr_aritContext)_localctx).opDe = expr_arit(15);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(632);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(633);
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
						setState(634);
						((Expr_aritContext)_localctx).opDe = expr_arit(14);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(637);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(638);
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
						setState(639);
						((Expr_aritContext)_localctx).opDe = expr_arit(13);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(642);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(643);
						((Expr_aritContext)_localctx).op = match(AND);
						setState(644);
						((Expr_aritContext)_localctx).opDe = expr_arit(11);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(647);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(648);
						((Expr_aritContext)_localctx).op = match(OR);
						setState(649);
						((Expr_aritContext)_localctx).opDe = expr_arit(10);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 74, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(658);
			((CasteoContext)_localctx).expression = expression();
			setState(659);
			match(AS);
			setState(660);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(661);
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
		enterRule(_localctx, 76, RULE_tipo_cast);
		try {
			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
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

	public static class L_StructExpContext extends ParserRuleContext {
		public *arrayList.List l;
		public L_StructExpContext list;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode DPUNTO2() { return getToken(RustPar.DPUNTO2, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public L_StructExpContext l_StructExp() {
			return getRuleContext(L_StructExpContext.class,0);
		}
		public L_StructExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_StructExp; }
	}

	public final L_StructExpContext l_StructExp() throws RecognitionException {
		return l_StructExp(0);
	}

	private L_StructExpContext l_StructExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		L_StructExpContext _localctx = new L_StructExpContext(_ctx, _parentState);
		L_StructExpContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_l_StructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(671);
			((L_StructExpContext)_localctx).ID = match(ID);
			setState(672);
			match(DPUNTO2);
			setState(673);
			((L_StructExpContext)_localctx).expression = expression();

			                    Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
			                    ((L_StructExpContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add(Str_ep);
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new L_StructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_l_StructExp);
					setState(676);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(677);
					match(COMA);
					setState(678);
					((L_StructExpContext)_localctx).ID = match(ID);
					setState(679);
					match(DPUNTO2);
					setState(680);
					((L_StructExpContext)_localctx).expression = expression();

					                                                  Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
					                                                  ((L_StructExpContext)_localctx).list.l.Add(Str_ep);
					                                                  ((L_StructExpContext)_localctx).l =  ((L_StructExpContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 80, RULE_primitivo);
		try {
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
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
				setState(690);
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
				setState(692);
				((PrimitivoContext)_localctx).strings = strings();
				_localctx.p = ((PrimitivoContext)_localctx).strings.p
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(697);
				((PrimitivoContext)_localctx).FALSE = match(FALSE);
				 _localctx.p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).FALSE!=null?((PrimitivoContext)_localctx).FALSE.getLine():0), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(699);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_listIDArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(705);
			((ListIDArrayContext)_localctx).ID = match(ID);
			 
			      _localctx.p = expresion.NewIdentificador((((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getLine():0), localctx.(*ListIDArrayContext).Get_ID().GetColumn() )
			}
			_ctx.stop = _input.LT(-1);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
					setState(708);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(709);
					((ListIDArrayContext)_localctx).CORIZQ = match(CORIZQ);
					setState(710);
					((ListIDArrayContext)_localctx).expression = expression();
					setState(711);
					match(CORDER);
					 _localctx.p = expresion.NewArrayAccess(((ListIDArrayContext)_localctx).list.p, ((ListIDArrayContext)_localctx).expression.p, (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getLine():0), (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 84, RULE_strings);
		int _la;
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(719);
					match(AMP);
					}
					}
					setState(722); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AMP );
				setState(724);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(726);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(725);
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
				setState(729);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(730);
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
				setState(732);
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
		case 11:
			return listdecStruct_sempred((ListdecStructContext)_localctx, predIndex);
		case 15:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 20:
			return list_index_sempred((List_indexContext)_localctx, predIndex);
		case 29:
			return match_brazos_sempred((Match_brazosContext)_localctx, predIndex);
		case 31:
			return listaOpciones_sempred((ListaOpcionesContext)_localctx, predIndex);
		case 36:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 39:
			return l_StructExp_sempred((L_StructExpContext)_localctx, predIndex);
		case 41:
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
	private boolean listdecStruct_sempred(ListdecStructContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean list_index_sempred(List_indexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_sempred(Match_brazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaOpciones_sempred(ListaOpcionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean l_StructExp_sempred(L_StructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listIDArray_sempred(ListIDArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u02e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\7\3]\n\3\f\3\16\3`\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009a"+
		"\n\5\3\6\3\6\3\6\5\6\u009f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00aa\n\7\f\7\16\7\u00ad\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00bc\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e2\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00f9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u010f\n\r\f\r\16\r\u0112\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011e\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0126\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0137\n\21\f\21\16"+
		"\21\u013a\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0155\n\22\3\23\3\23\3\23\5\23\u015a\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u016a\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0177\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0181\n\26\f\26\16\26\u0184\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u019f"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u01b0\n\31\3\32\6\32\u01b3\n\32\r\32\16\32\u01b4\3\32"+
		"\3\32\3\33\6\33\u01ba\n\33\r\33\16\33\u01bb\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01e9\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01f3\n\37\f\37\16\37\u01f6\13"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0204\n \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\7!\u020f\n!\f!\16!\u0212\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u021c\n\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u022f"+
		"\n$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&"+
		"\u0274\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\7&\u028f\n&\f&\16&\u0292\13&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\5(\u029f\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u02ae"+
		"\n)\f)\16)\u02b1\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u02c1"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u02cd\n+\f+\16+\u02d0\13+\3,\6,\u02d3"+
		"\n,\r,\16,\u02d4\3,\3,\5,\u02d9\n,\3,\3,\3,\3,\3,\3,\5,\u02e1\n,\3,\2"+
		"\f\6\f\30 *<@JPT-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTV\2\6\4\2/\60\63\63\3\2\61\62\3\2).\3\2\25\26\2\u0303"+
		"\2X\3\2\2\2\4^\3\2\2\2\6c\3\2\2\2\b\u0099\3\2\2\2\n\u009e\3\2\2\2\f\u00a0"+
		"\3\2\2\2\16\u00bb\3\2\2\2\20\u00bd\3\2\2\2\22\u00e1\3\2\2\2\24\u00f8\3"+
		"\2\2\2\26\u00fa\3\2\2\2\30\u0101\3\2\2\2\32\u011d\3\2\2\2\34\u0125\3\2"+
		"\2\2\36\u0127\3\2\2\2 \u012d\3\2\2\2\"\u0154\3\2\2\2$\u0159\3\2\2\2&\u0169"+
		"\3\2\2\2(\u0176\3\2\2\2*\u0178\3\2\2\2,\u0185\3\2\2\2.\u019e\3\2\2\2\60"+
		"\u01af\3\2\2\2\62\u01b2\3\2\2\2\64\u01b9\3\2\2\2\66\u01bf\3\2\2\28\u01c5"+
		"\3\2\2\2:\u01e8\3\2\2\2<\u01ea\3\2\2\2>\u0203\3\2\2\2@\u0205\3\2\2\2B"+
		"\u021b\3\2\2\2D\u021d\3\2\2\2F\u022e\3\2\2\2H\u0230\3\2\2\2J\u0273\3\2"+
		"\2\2L\u0293\3\2\2\2N\u029e\3\2\2\2P\u02a0\3\2\2\2R\u02c0\3\2\2\2T\u02c2"+
		"\3\2\2\2V\u02e0\3\2\2\2XY\5\6\4\2YZ\b\2\1\2Z\3\3\2\2\2[]\5\22\n\2\\[\3"+
		"\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\b\3\1\2b\5"+
		"\3\2\2\2cd\b\4\1\2de\5\b\5\2ef\b\4\1\2fm\3\2\2\2gh\f\4\2\2hi\5\b\5\2i"+
		"j\b\4\1\2jl\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\7\3\2\2\2"+
		"om\3\2\2\2pq\5\20\t\2qr\b\5\1\2r\u009a\3\2\2\2st\5\n\6\2tu\7\31\2\2uv"+
		"\7(\2\2vw\78\2\2wx\79\2\2xy\7\30\2\2yz\5F$\2z{\5B\"\2{|\b\5\1\2|\u009a"+
		"\3\2\2\2}~\5\n\6\2~\177\7\31\2\2\177\u0080\7(\2\2\u0080\u0081\78\2\2\u0081"+
		"\u0082\79\2\2\u0082\u0083\5B\"\2\u0083\u0084\b\5\1\2\u0084\u009a\3\2\2"+
		"\2\u0085\u0086\5\n\6\2\u0086\u0087\7\31\2\2\u0087\u0088\7(\2\2\u0088\u0089"+
		"\78\2\2\u0089\u008a\5\f\7\2\u008a\u008b\79\2\2\u008b\u008c\5B\"\2\u008c"+
		"\u008d\b\5\1\2\u008d\u009a\3\2\2\2\u008e\u008f\5\n\6\2\u008f\u0090\7\31"+
		"\2\2\u0090\u0091\7(\2\2\u0091\u0092\78\2\2\u0092\u0093\5\f\7\2\u0093\u0094"+
		"\79\2\2\u0094\u0095\7\30\2\2\u0095\u0096\5F$\2\u0096\u0097\5B\"\2\u0097"+
		"\u0098\b\5\1\2\u0098\u009a\3\2\2\2\u0099p\3\2\2\2\u0099s\3\2\2\2\u0099"+
		"}\3\2\2\2\u0099\u0085\3\2\2\2\u0099\u008e\3\2\2\2\u009a\t\3\2\2\2\u009b"+
		"\u009c\7\27\2\2\u009c\u009f\b\6\1\2\u009d\u009f\b\6\1\2\u009e\u009b\3"+
		"\2\2\2\u009e\u009d\3\2\2\2\u009f\13\3\2\2\2\u00a0\u00a1\b\7\1\2\u00a1"+
		"\u00a2\5\16\b\2\u00a2\u00a3\b\7\1\2\u00a3\u00ab\3\2\2\2\u00a4\u00a5\f"+
		"\4\2\2\u00a5\u00a6\7!\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\b\7\1\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af"+
		"\5$\23\2\u00af\u00b0\7(\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2\5F$\2\u00b2"+
		"\u00b3\b\b\1\2\u00b3\u00bc\3\2\2\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\7("+
		"\2\2\u00b6\u00b7\7$\2\2\u00b7\u00b8\7\34\2\2\u00b8\u00b9\5&\24\2\u00b9"+
		"\u00ba\b\b\1\2\u00ba\u00bc\3\2\2\2\u00bb\u00ae\3\2\2\2\u00bb\u00b4\3\2"+
		"\2\2\u00bc\17\3\2\2\2\u00bd\u00be\7\31\2\2\u00be\u00bf\7\32\2\2\u00bf"+
		"\u00c0\78\2\2\u00c0\u00c1\79\2\2\u00c1\u00c2\5B\"\2\u00c2\u00c3\b\t\1"+
		"\2\u00c3\21\3\2\2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7"+
		"\b\n\1\2\u00c7\u00e2\3\2\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00ca\7\"\2\2"+
		"\u00ca\u00cb\b\n\1\2\u00cb\u00e2\3\2\2\2\u00cc\u00cd\5(\25\2\u00cd\u00ce"+
		"\7\"\2\2\u00ce\u00cf\b\n\1\2\u00cf\u00e2\3\2\2\2\u00d0\u00d1\5.\30\2\u00d1"+
		"\u00d2\b\n\1\2\u00d2\u00e2\3\2\2\2\u00d3\u00d4\5:\36\2\u00d4\u00d5\b\n"+
		"\1\2\u00d5\u00e2\3\2\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\b\n\1\2\u00d8"+
		"\u00e2\3\2\2\2\u00d9\u00da\5\32\16\2\u00da\u00db\7\"\2\2\u00db\u00dc\b"+
		"\n\1\2\u00dc\u00e2\3\2\2\2\u00dd\u00de\5\34\17\2\u00de\u00df\7\"\2\2\u00df"+
		"\u00e0\b\n\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00c4\3\2\2\2\u00e1\u00c8\3\2"+
		"\2\2\u00e1\u00cc\3\2\2\2\u00e1\u00d0\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1"+
		"\u00d6\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\23\3\2\2"+
		"\2\u00e3\u00e4\5\36\20\2\u00e4\u00e5\b\13\1\2\u00e5\u00f9\3\2\2\2\u00e6"+
		"\u00e7\5\"\22\2\u00e7\u00e8\b\13\1\2\u00e8\u00f9\3\2\2\2\u00e9\u00ea\5"+
		"(\25\2\u00ea\u00eb\b\13\1\2\u00eb\u00f9\3\2\2\2\u00ec\u00ed\5.\30\2\u00ed"+
		"\u00ee\b\13\1\2\u00ee\u00f9\3\2\2\2\u00ef\u00f0\5:\36\2\u00f0\u00f1\b"+
		"\13\1\2\u00f1\u00f9\3\2\2\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4\b\13\1\2"+
		"\u00f4\u00f9\3\2\2\2\u00f5\u00f6\5\34\17\2\u00f6\u00f7\b\13\1\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00e3\3\2\2\2\u00f8\u00e6\3\2\2\2\u00f8\u00e9\3\2"+
		"\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f9\25\3\2\2\2\u00fa\u00fb\7\24\2\2\u00fb\u00fc\7(\2"+
		"\2\u00fc\u00fd\7:\2\2\u00fd\u00fe\5\30\r\2\u00fe\u00ff\7;\2\2\u00ff\u0100"+
		"\b\f\1\2\u0100\27\3\2\2\2\u0101\u0102\b\r\1\2\u0102\u0103\7(\2\2\u0103"+
		"\u0104\7$\2\2\u0104\u0105\5F$\2\u0105\u0106\b\r\1\2\u0106\u0110\3\2\2"+
		"\2\u0107\u0108\f\4\2\2\u0108\u0109\7!\2\2\u0109\u010a\7(\2\2\u010a\u010b"+
		"\7$\2\2\u010b\u010c\5F$\2\u010c\u010d\b\r\1\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0107\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\31\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7(\2\2\u0114\u0115"+
		"\78\2\2\u0115\u0116\79\2\2\u0116\u011e\b\16\1\2\u0117\u0118\7(\2\2\u0118"+
		"\u0119\78\2\2\u0119\u011a\5 \21\2\u011a\u011b\79\2\2\u011b\u011c\b\16"+
		"\1\2\u011c\u011e\3\2\2\2\u011d\u0113\3\2\2\2\u011d\u0117\3\2\2\2\u011e"+
		"\33\3\2\2\2\u011f\u0120\7\33\2\2\u0120\u0126\b\17\1\2\u0121\u0122\7\33"+
		"\2\2\u0122\u0123\5H%\2\u0123\u0124\b\17\1\2\u0124\u0126\3\2\2\2\u0125"+
		"\u011f\3\2\2\2\u0125\u0121\3\2\2\2\u0126\35\3\2\2\2\u0127\u0128\7\3\2"+
		"\2\u0128\u0129\78\2\2\u0129\u012a\5 \21\2\u012a\u012b\79\2\2\u012b\u012c"+
		"\b\20\1\2\u012c\37\3\2\2\2\u012d\u012e\b\21\1\2\u012e\u012f\5H%\2\u012f"+
		"\u0130\b\21\1\2\u0130\u0138\3\2\2\2\u0131\u0132\f\4\2\2\u0132\u0133\7"+
		"!\2\2\u0133\u0134\5H%\2\u0134\u0135\b\21\1\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0131\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139!\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\22\2\2\u013c\u013d"+
		"\5$\23\2\u013d\u013e\7(\2\2\u013e\u013f\7$\2\2\u013f\u0140\5F$\2\u0140"+
		"\u0141\7%\2\2\u0141\u0142\5H%\2\u0142\u0143\b\22\1\2\u0143\u0155\3\2\2"+
		"\2\u0144\u0145\7\22\2\2\u0145\u0146\5$\23\2\u0146\u0147\7(\2\2\u0147\u0148"+
		"\7%\2\2\u0148\u0149\5H%\2\u0149\u014a\b\22\1\2\u014a\u0155\3\2\2\2\u014b"+
		"\u014c\7\22\2\2\u014c\u014d\5$\23\2\u014d\u014e\7(\2\2\u014e\u014f\7$"+
		"\2\2\u014f\u0150\5&\24\2\u0150\u0151\7%\2\2\u0151\u0152\5H%\2\u0152\u0153"+
		"\b\22\1\2\u0153\u0155\3\2\2\2\u0154\u013b\3\2\2\2\u0154\u0144\3\2\2\2"+
		"\u0154\u014b\3\2\2\2\u0155#\3\2\2\2\u0156\u0157\7\23\2\2\u0157\u015a\b"+
		"\23\1\2\u0158\u015a\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"%\3\2\2\2\u015b\u015c\7<\2\2\u015c\u015d\5&\24\2\u015d\u015e\7\"\2\2\u015e"+
		"\u015f\5H%\2\u015f\u0160\7=\2\2\u0160\u0161\b\24\1\2\u0161\u016a\3\2\2"+
		"\2\u0162\u0163\7<\2\2\u0163\u0164\5F$\2\u0164\u0165\7\"\2\2\u0165\u0166"+
		"\5H%\2\u0166\u0167\7=\2\2\u0167\u0168\b\24\1\2\u0168\u016a\3\2\2\2\u0169"+
		"\u015b\3\2\2\2\u0169\u0162\3\2\2\2\u016a\'\3\2\2\2\u016b\u016c\7(\2\2"+
		"\u016c\u016d\7%\2\2\u016d\u016e\5H%\2\u016e\u016f\b\25\1\2\u016f\u0177"+
		"\3\2\2\2\u0170\u0171\7(\2\2\u0171\u0172\5*\26\2\u0172\u0173\7%\2\2\u0173"+
		"\u0174\5H%\2\u0174\u0175\b\25\1\2\u0175\u0177\3\2\2\2\u0176\u016b\3\2"+
		"\2\2\u0176\u0170\3\2\2\2\u0177)\3\2\2\2\u0178\u0179\b\26\1\2\u0179\u017a"+
		"\5,\27\2\u017a\u017b\b\26\1\2\u017b\u0182\3\2\2\2\u017c\u017d\f\4\2\2"+
		"\u017d\u017e\5,\27\2\u017e\u017f\b\26\1\2\u017f\u0181\3\2\2\2\u0180\u017c"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"+\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7<\2\2\u0186\u0187\5H%\2\u0187"+
		"\u0188\7=\2\2\u0188\u0189\b\27\1\2\u0189-\3\2\2\2\u018a\u018b\7\t\2\2"+
		"\u018b\u018c\5H%\2\u018c\u018d\5B\"\2\u018d\u018e\b\30\1\2\u018e\u019f"+
		"\3\2\2\2\u018f\u0190\7\t\2\2\u0190\u0191\5H%\2\u0191\u0192\5B\"\2\u0192"+
		"\u0193\7\n\2\2\u0193\u0194\5B\"\2\u0194\u0195\b\30\1\2\u0195\u019f\3\2"+
		"\2\2\u0196\u0197\7\t\2\2\u0197\u0198\5H%\2\u0198\u0199\5B\"\2\u0199\u019a"+
		"\5\62\32\2\u019a\u019b\7\n\2\2\u019b\u019c\5B\"\2\u019c\u019d\b\30\1\2"+
		"\u019d\u019f\3\2\2\2\u019e\u018a\3\2\2\2\u019e\u018f\3\2\2\2\u019e\u0196"+
		"\3\2\2\2\u019f/\3\2\2\2\u01a0\u01a1\7\t\2\2\u01a1\u01a2\5H%\2\u01a2\u01a3"+
		"\5D#\2\u01a3\u01a4\7\n\2\2\u01a4\u01a5\5D#\2\u01a5\u01a6\b\31\1\2\u01a6"+
		"\u01b0\3\2\2\2\u01a7\u01a8\7\t\2\2\u01a8\u01a9\5H%\2\u01a9\u01aa\5D#\2"+
		"\u01aa\u01ab\5\64\33\2\u01ab\u01ac\7\n\2\2\u01ac\u01ad\5D#\2\u01ad\u01ae"+
		"\b\31\1\2\u01ae\u01b0\3\2\2\2\u01af\u01a0\3\2\2\2\u01af\u01a7\3\2\2\2"+
		"\u01b0\61\3\2\2\2\u01b1\u01b3\5\66\34\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\b\32\1\2\u01b7\63\3\2\2\2\u01b8\u01ba\58\35\2\u01b9\u01b8\3\2\2"+
		"\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01be\b\33\1\2\u01be\65\3\2\2\2\u01bf\u01c0\7\n\2\2\u01c0"+
		"\u01c1\7\t\2\2\u01c1\u01c2\5H%\2\u01c2\u01c3\5B\"\2\u01c3\u01c4\b\34\1"+
		"\2\u01c4\67\3\2\2\2\u01c5\u01c6\7\n\2\2\u01c6\u01c7\7\t\2\2\u01c7\u01c8"+
		"\5H%\2\u01c8\u01c9\5D#\2\u01c9\u01ca\b\35\1\2\u01ca9\3\2\2\2\u01cb\u01cc"+
		"\7\13\2\2\u01cc\u01cd\5H%\2\u01cd\u01ce\7:\2\2\u01ce\u01cf\5<\37\2\u01cf"+
		"\u01d0\7;\2\2\u01d0\u01d1\b\36\1\2\u01d1\u01e9\3\2\2\2\u01d2\u01d3\7\13"+
		"\2\2\u01d3\u01d4\5H%\2\u01d4\u01d5\7:\2\2\u01d5\u01d6\5<\37\2\u01d6\u01d7"+
		"\7\'\2\2\u01d7\u01d8\7&\2\2\u01d8\u01d9\5B\"\2\u01d9\u01da\7!\2\2\u01da"+
		"\u01db\7;\2\2\u01db\u01dc\b\36\1\2\u01dc\u01e9\3\2\2\2\u01dd\u01de\7\13"+
		"\2\2\u01de\u01df\5H%\2\u01df\u01e0\7:\2\2\u01e0\u01e1\5<\37\2\u01e1\u01e2"+
		"\7\'\2\2\u01e2\u01e3\7&\2\2\u01e3\u01e4\5\24\13\2\u01e4\u01e5\7!\2\2\u01e5"+
		"\u01e6\7;\2\2\u01e6\u01e7\b\36\1\2\u01e7\u01e9\3\2\2\2\u01e8\u01cb\3\2"+
		"\2\2\u01e8\u01d2\3\2\2\2\u01e8\u01dd\3\2\2\2\u01e9;\3\2\2\2\u01ea\u01eb"+
		"\b\37\1\2\u01eb\u01ec\5> \2\u01ec\u01ed\b\37\1\2\u01ed\u01f4\3\2\2\2\u01ee"+
		"\u01ef\f\4\2\2\u01ef\u01f0\5> \2\u01f0\u01f1\b\37\1\2\u01f1\u01f3\3\2"+
		"\2\2\u01f2\u01ee\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5=\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\5@!\2\u01f8"+
		"\u01f9\7&\2\2\u01f9\u01fa\5B\"\2\u01fa\u01fb\7!\2\2\u01fb\u01fc\b \1\2"+
		"\u01fc\u0204\3\2\2\2\u01fd\u01fe\5@!\2\u01fe\u01ff\7&\2\2\u01ff\u0200"+
		"\5\24\13\2\u0200\u0201\7!\2\2\u0201\u0202\b \1\2\u0202\u0204\3\2\2\2\u0203"+
		"\u01f7\3\2\2\2\u0203\u01fd\3\2\2\2\u0204?\3\2\2\2\u0205\u0206\b!\1\2\u0206"+
		"\u0207\5R*\2\u0207\u0208\b!\1\2\u0208\u0210\3\2\2\2\u0209\u020a\f\4\2"+
		"\2\u020a\u020b\7\f\2\2\u020b\u020c\5R*\2\u020c\u020d\b!\1\2\u020d\u020f"+
		"\3\2\2\2\u020e\u0209\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211A\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\7:\2\2\u0214"+
		"\u0215\5\4\3\2\u0215\u0216\7;\2\2\u0216\u0217\b\"\1\2\u0217\u021c\3\2"+
		"\2\2\u0218\u0219\7:\2\2\u0219\u021a\7;\2\2\u021a\u021c\b\"\1\2\u021b\u0213"+
		"\3\2\2\2\u021b\u0218\3\2\2\2\u021cC\3\2\2\2\u021d\u021e\7:\2\2\u021e\u021f"+
		"\5H%\2\u021f\u0220\7;\2\2\u0220\u0221\b#\1\2\u0221E\3\2\2\2\u0222\u0223"+
		"\7\4\2\2\u0223\u022f\b$\1\2\u0224\u0225\7\6\2\2\u0225\u022f\b$\1\2\u0226"+
		"\u0227\7\5\2\2\u0227\u022f\b$\1\2\u0228\u0229\7\7\2\2\u0229\u022f\b$\1"+
		"\2\u022a\u022b\7\b\2\2\u022b\u022f\b$\1\2\u022c\u022d\7\24\2\2\u022d\u022f"+
		"\b$\1\2\u022e\u0222\3\2\2\2\u022e\u0224\3\2\2\2\u022e\u0226\3\2\2\2\u022e"+
		"\u0228\3\2\2\2\u022e\u022a\3\2\2\2\u022e\u022c\3\2\2\2\u022fG\3\2\2\2"+
		"\u0230\u0231\5J&\2\u0231\u0232\b%\1\2\u0232I\3\2\2\2\u0233\u0234\b&\1"+
		"\2\u0234\u0235\7\62\2\2\u0235\u0236\5J&\23\u0236\u0237\b&\1\2\u0237\u0274"+
		"\3\2\2\2\u0238\u0239\7\4\2\2\u0239\u023a\7#\2\2\u023a\u023b\7\20\2\2\u023b"+
		"\u023c\78\2\2\u023c\u023d\5J&\2\u023d\u023e\7!\2\2\u023e\u023f\5J&\2\u023f"+
		"\u0240\79\2\2\u0240\u0241\b&\1\2\u0241\u0274\3\2\2\2\u0242\u0243\7\5\2"+
		"\2\u0243\u0244\7#\2\2\u0244\u0245\7\21\2\2\u0245\u0246\78\2\2\u0246\u0247"+
		"\5J&\2\u0247\u0248\7!\2\2\u0248\u0249\5J&\2\u0249\u024a\79\2\2\u024a\u024b"+
		"\b&\1\2\u024b\u0274\3\2\2\2\u024c\u024d\7\66\2\2\u024d\u024e\5J&\r\u024e"+
		"\u024f\b&\1\2\u024f\u0274\3\2\2\2\u0250\u0251\7<\2\2\u0251\u0252\5H%\2"+
		"\u0252\u0253\7\"\2\2\u0253\u0254\5H%\2\u0254\u0255\7=\2\2\u0255\u0256"+
		"\b&\1\2\u0256\u0274\3\2\2\2\u0257\u0258\7<\2\2\u0258\u0259\5 \21\2\u0259"+
		"\u025a\7=\2\2\u025a\u025b\b&\1\2\u025b\u0274\3\2\2\2\u025c\u025d\7(\2"+
		"\2\u025d\u025e\7:\2\2\u025e\u025f\5P)\2\u025f\u0260\7;\2\2\u0260\u0261"+
		"\b&\1\2\u0261\u0274\3\2\2\2\u0262\u0263\5R*\2\u0263\u0264\b&\1\2\u0264"+
		"\u0274\3\2\2\2\u0265\u0266\78\2\2\u0266\u0267\5H%\2\u0267\u0268\79\2\2"+
		"\u0268\u0269\b&\1\2\u0269\u0274\3\2\2\2\u026a\u026b\5L\'\2\u026b\u026c"+
		"\b&\1\2\u026c\u0274\3\2\2\2\u026d\u026e\5\60\31\2\u026e\u026f\b&\1\2\u026f"+
		"\u0274\3\2\2\2\u0270\u0271\5\32\16\2\u0271\u0272\b&\1\2\u0272\u0274\3"+
		"\2\2\2\u0273\u0233\3\2\2\2\u0273\u0238\3\2\2\2\u0273\u0242\3\2\2\2\u0273"+
		"\u024c\3\2\2\2\u0273\u0250\3\2\2\2\u0273\u0257\3\2\2\2\u0273\u025c\3\2"+
		"\2\2\u0273\u0262\3\2\2\2\u0273\u0265\3\2\2\2\u0273\u026a\3\2\2\2\u0273"+
		"\u026d\3\2\2\2\u0273\u0270\3\2\2\2\u0274\u0290\3\2\2\2\u0275\u0276\f\20"+
		"\2\2\u0276\u0277\t\2\2\2\u0277\u0278\5J&\21\u0278\u0279\b&\1\2\u0279\u028f"+
		"\3\2\2\2\u027a\u027b\f\17\2\2\u027b\u027c\t\3\2\2\u027c\u027d\5J&\20\u027d"+
		"\u027e\b&\1\2\u027e\u028f\3\2\2\2\u027f\u0280\f\16\2\2\u0280\u0281\t\4"+
		"\2\2\u0281\u0282\5J&\17\u0282\u0283\b&\1\2\u0283\u028f\3\2\2\2\u0284\u0285"+
		"\f\f\2\2\u0285\u0286\7\64\2\2\u0286\u0287\5J&\r\u0287\u0288\b&\1\2\u0288"+
		"\u028f\3\2\2\2\u0289\u028a\f\13\2\2\u028a\u028b\7\65\2\2\u028b\u028c\5"+
		"J&\f\u028c\u028d\b&\1\2\u028d\u028f\3\2\2\2\u028e\u0275\3\2\2\2\u028e"+
		"\u027a\3\2\2\2\u028e\u027f\3\2\2\2\u028e\u0284\3\2\2\2\u028e\u0289\3\2"+
		"\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"K\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\78\2\2\u0294\u0295\5H%\2\u0295"+
		"\u0296\7\17\2\2\u0296\u0297\5N(\2\u0297\u0298\79\2\2\u0298\u0299\b\'\1"+
		"\2\u0299M\3\2\2\2\u029a\u029b\7\5\2\2\u029b\u029f\b(\1\2\u029c\u029d\7"+
		"\4\2\2\u029d\u029f\b(\1\2\u029e\u029a\3\2\2\2\u029e\u029c\3\2\2\2\u029f"+
		"O\3\2\2\2\u02a0\u02a1\b)\1\2\u02a1\u02a2\7(\2\2\u02a2\u02a3\7$\2\2\u02a3"+
		"\u02a4\5H%\2\u02a4\u02a5\b)\1\2\u02a5\u02af\3\2\2\2\u02a6\u02a7\f\4\2"+
		"\2\u02a7\u02a8\7!\2\2\u02a8\u02a9\7(\2\2\u02a9\u02aa\7$\2\2\u02aa\u02ab"+
		"\5H%\2\u02ab\u02ac\b)\1\2\u02ac\u02ae\3\2\2\2\u02ad\u02a6\3\2\2\2\u02ae"+
		"\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0Q\3\2\2\2"+
		"\u02b1\u02af\3\2\2\2\u02b2\u02b3\7\35\2\2\u02b3\u02c1\b*\1\2\u02b4\u02b5"+
		"\7\36\2\2\u02b5\u02c1\b*\1\2\u02b6\u02b7\5V,\2\u02b7\u02b8\b*\1\2\u02b8"+
		"\u02c1\3\2\2\2\u02b9\u02ba\7\r\2\2\u02ba\u02c1\b*\1\2\u02bb\u02bc\7\16"+
		"\2\2\u02bc\u02c1\b*\1\2\u02bd\u02be\5T+\2\u02be\u02bf\b*\1\2\u02bf\u02c1"+
		"\3\2\2\2\u02c0\u02b2\3\2\2\2\u02c0\u02b4\3\2\2\2\u02c0\u02b6\3\2\2\2\u02c0"+
		"\u02b9\3\2\2\2\u02c0\u02bb\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c1S\3\2\2\2"+
		"\u02c2\u02c3\b+\1\2\u02c3\u02c4\7(\2\2\u02c4\u02c5\b+\1\2\u02c5\u02ce"+
		"\3\2\2\2\u02c6\u02c7\f\4\2\2\u02c7\u02c8\7<\2\2\u02c8\u02c9\5H%\2\u02c9"+
		"\u02ca\7=\2\2\u02ca\u02cb\b+\1\2\u02cb\u02cd\3\2\2\2\u02cc\u02c6\3\2\2"+
		"\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfU"+
		"\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\7\67\2\2\u02d2\u02d1\3\2\2\2"+
		"\u02d3\u02d4\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6"+
		"\3\2\2\2\u02d6\u02d8\7\37\2\2\u02d7\u02d9\t\5\2\2\u02d8\u02d7\3\2\2\2"+
		"\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02e1\b,\1\2\u02db\u02dc"+
		"\7\37\2\2\u02dc\u02dd\t\5\2\2\u02dd\u02e1\b,\1\2\u02de\u02df\7\37\2\2"+
		"\u02df\u02e1\b,\1\2\u02e0\u02d2\3\2\2\2\u02e0\u02db\3\2\2\2\u02e0\u02de"+
		"\3\2\2\2\u02e1W\3\2\2\2\'^m\u0099\u009e\u00ab\u00bb\u00e1\u00f8\u0110"+
		"\u011d\u0125\u0138\u0154\u0159\u0169\u0176\u0182\u019e\u01af\u01b4\u01bb"+
		"\u01e8\u01f4\u0203\u0210\u021b\u022e\u0273\u028e\u0290\u029e\u02af\u02c0"+
		"\u02ce\u02d4\u02d8\u02e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}