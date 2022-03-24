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
		ELSE=8, WHILE=9, LOOP=10, FOR=11, IN=12, BREAK=13, CONTINUE=14, MATCH=15, 
		MTOR=16, TRUE=17, FALSE=18, AS=19, POW=20, POWF=21, LET=22, MUT=23, STRUCT=24, 
		VEC=25, VECN=26, CAPACITY=27, TO_STRING=28, TO_OWNED=29, LEN=30, NEW=31, 
		CAPF=32, PUSH=33, CONTAINS=34, INSERT=35, REMOVE=36, PUBLIC=37, TYPETHEN=38, 
		FN=39, MAIN=40, RETURN=41, NUMBER=42, FLOAT=43, STRING=44, PUNTO=45, COMA=46, 
		PTCOMA=47, DOSPUNTO=48, DPUNTO2=49, ASIGNACION=50, MTHEN=51, GUIONB=52, 
		ID=53, DISTINTO=54, IGUAL=55, MAYORIGUAL=56, MENORIGUAL=57, MAYOR=58, 
		MENOR=59, MUL=60, DIV=61, ADD=62, SUB=63, MOD=64, AND=65, OR=66, NOT=67, 
		AMP=68, PARIZQ=69, PARDER=70, LLAVEIZQ=71, LLAVEDER=72, CORIZQ=73, CORDER=74, 
		WHITESPACE=75, L_COMMENT=76;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_list_Funciones = 2, RULE_itemRust = 3, 
		RULE_funcion = 4, RULE_t_access = 5, RULE_params_declar = 6, RULE_declar_parametros = 7, 
		RULE_fn_main = 8, RULE_instruccion = 9, RULE_instruccion_only = 10, RULE_pushVec = 11, 
		RULE_newStruct = 12, RULE_listdecStruct = 13, RULE_callFunction = 14, 
		RULE_returnFun = 15, RULE_printconsola = 16, RULE_loopB = 17, RULE_lWhile = 18, 
		RULE_lForin = 19, RULE_lBreak = 20, RULE_lContinue = 21, RULE_listParams = 22, 
		RULE_listParamsCall = 23, RULE_is_ref = 24, RULE_declaracion = 25, RULE_is_mut = 26, 
		RULE_array_type = 27, RULE_asignacion = 28, RULE_l_AccessStruct = 29, 
		RULE_list_index = 30, RULE_index_array = 31, RULE_if_sent = 32, RULE_if_exp = 33, 
		RULE_list_elseif = 34, RULE_list_elseif_exp = 35, RULE_else_if = 36, RULE_else_if_exp = 37, 
		RULE_match_sent = 38, RULE_match_brazos = 39, RULE_match_brazos_exp = 40, 
		RULE_matchbrazo = 41, RULE_matchbrazo_exp = 42, RULE_listaOpciones = 43, 
		RULE_bloque_inst = 44, RULE_bloque_exp = 45, RULE_tipos_var = 46, RULE_expression = 47, 
		RULE_expr_arit = 48, RULE_casteo = 49, RULE_tipo_cast = 50, RULE_l_StructExp = 51, 
		RULE_primitivo = 52, RULE_listIDArray = 53, RULE_strings = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "list_Funciones", "itemRust", "funcion", "t_access", 
			"params_declar", "declar_parametros", "fn_main", "instruccion", "instruccion_only", 
			"pushVec", "newStruct", "listdecStruct", "callFunction", "returnFun", 
			"printconsola", "loopB", "lWhile", "lForin", "lBreak", "lContinue", "listParams", 
			"listParamsCall", "is_ref", "declaracion", "is_mut", "array_type", "asignacion", 
			"l_AccessStruct", "list_index", "index_array", "if_sent", "if_exp", "list_elseif", 
			"list_elseif_exp", "else_if", "else_if_exp", "match_sent", "match_brazos", 
			"match_brazos_exp", "matchbrazo", "matchbrazo_exp", "listaOpciones", 
			"bloque_inst", "bloque_exp", "tipos_var", "expression", "expr_arit", 
			"casteo", "tipo_cast", "l_StructExp", "primitivo", "listIDArray", "strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'while'", "'loop'", "'for'", "'in'", "'break'", "'continue'", 
			"'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", 
			"'mut'", "'struct'", "'vec!'", "'Vec'", "'with_capacity'", "'.to_string()'", 
			"'.to_owned()'", "'len()'", "'new()'", "'capacity()'", "'push'", "'contains'", 
			"'insert'", "'remove'", "'pub'", "'->'", "'fn'", "'main'", "'return'", 
			null, null, null, "'.'", "','", "';'", "'::'", "':'", "'='", "'=>'", 
			"'_'", null, "'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", 
			"'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "WHILE", "LOOP", "FOR", "IN", "BREAK", "CONTINUE", "MATCH", 
			"MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", 
			"VEC", "VECN", "CAPACITY", "TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", 
			"PUSH", "CONTAINS", "INSERT", "REMOVE", "PUBLIC", "TYPETHEN", "FN", "MAIN", 
			"RETURN", "NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", 
			"DPUNTO2", "ASIGNACION", "MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", 
			"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", 
			"MOD", "AND", "OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"CORIZQ", "CORDER", "WHITESPACE", "L_COMMENT"
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
			setState(110);
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
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_CON) | (1L << IF) | (1L << WHILE) | (1L << LOOP) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << MATCH) | (1L << LET) | (1L << STRUCT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(113);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(118);
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
		public ItemRustContext itemRust;
		public ItemRustContext itemRust() {
			return getRuleContext(ItemRustContext.class,0);
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
			setState(122);
			((List_FuncionesContext)_localctx).itemRust = itemRust();
			 _localctx.lista.Add( ((List_FuncionesContext)_localctx).itemRust.instr ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
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
					setState(125);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(126);
					((List_FuncionesContext)_localctx).itemRust = itemRust();

					                                                    ((List_FuncionesContext)_localctx).lisfun.lista.Add( ((List_FuncionesContext)_localctx).itemRust.instr)
					                                                    _localctx.lista =  ((List_FuncionesContext)_localctx).lisfun.lista
					                                                  
					}
					} 
				}
				setState(133);
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

	public static class ItemRustContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public FuncionContext funcion;
		public NewStructContext newStruct;
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public NewStructContext newStruct() {
			return getRuleContext(NewStructContext.class,0);
		}
		public ItemRustContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemRust; }
	}

	public final ItemRustContext itemRust() throws RecognitionException {
		ItemRustContext _localctx = new ItemRustContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_itemRust);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case FN:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((ItemRustContext)_localctx).funcion = funcion();
				_localctx.instr = ((ItemRustContext)_localctx).funcion.instr
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				((ItemRustContext)_localctx).newStruct = newStruct();
				_localctx.instr = ((ItemRustContext)_localctx).newStruct.str
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
		enterRule(_localctx, 8, RULE_funcion);
		 listParams :=  arrayList.New() 
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((FuncionContext)_localctx).fn_main = fn_main();
				_localctx.instr =  ((FuncionContext)_localctx).fn_main.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				t_access();
				setState(146);
				match(FN);
				setState(147);
				((FuncionContext)_localctx).ID = match(ID);
				setState(148);
				match(PARIZQ);
				setState(149);
				match(PARDER);
				setState(150);
				match(TYPETHEN);
				setState(151);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(152);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, ((FuncionContext)_localctx).tipos_var.tipo, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				t_access();
				setState(156);
				match(FN);
				setState(157);
				((FuncionContext)_localctx).ID = match(ID);
				setState(158);
				match(PARIZQ);
				setState(159);
				match(PARDER);
				setState(160);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				t_access();
				setState(164);
				match(FN);
				setState(165);
				((FuncionContext)_localctx).ID = match(ID);
				setState(166);
				match(PARIZQ);
				setState(167);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(168);
				match(PARDER);
				setState(169);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),((FuncionContext)_localctx).params_declar.lista,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				t_access();
				setState(173);
				match(FN);
				setState(174);
				((FuncionContext)_localctx).ID = match(ID);
				setState(175);
				match(PARIZQ);
				setState(176);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(177);
				match(PARDER);
				setState(178);
				match(TYPETHEN);
				setState(179);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(180);
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
		enterRule(_localctx, 10, RULE_t_access);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_params_declar, _p);

		_localctx.lista =  arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			((Params_declarContext)_localctx).declar_parametros = declar_parametros();
			   _localctx.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec) 
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
					setState(194);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(195);
					match(COMA);
					setState(196);
					((Params_declarContext)_localctx).declar_parametros = declar_parametros();

					                                                                      ((Params_declarContext)_localctx).listdec.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec)
					                                                                      _localctx.lista =  ((Params_declarContext)_localctx).listdec.lista 
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public TerminalNode AMP() { return getToken(RustPar.AMP, 0); }
		public TerminalNode MUT() { return getToken(RustPar.MUT, 0); }
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
		enterRule(_localctx, 14, RULE_declar_parametros);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				((Declar_parametrosContext)_localctx).isMut = is_mut();
				setState(205);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(206);
				match(DPUNTO2);
				setState(207);
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
				setState(210);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(211);
				match(DPUNTO2);
				setState(212);
				match(AMP);
				setState(213);
				match(MUT);
				setState(214);
				((Declar_parametrosContext)_localctx).array_type = array_type();

				                        listaIdes := arrayList.New()
				                        listaIdes.Add(expresion.NewIdentificador((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) ))
				                        decl := instruction.NewArrayDeclaration((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), ((Declar_parametrosContext)_localctx).array_type.ty, nil, true, (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) )
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
		enterRule(_localctx, 16, RULE_fn_main);
		 listParams:= arrayList.New() 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(FN);
			setState(220);
			((Fn_mainContext)_localctx).MAIN = match(MAIN);
			setState(221);
			match(PARIZQ);
			setState(222);
			match(PARDER);
			setState(223);
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
		public PushVecContext pushVec;
		public If_sentContext if_sent;
		public Match_sentContext match_sent;
		public LoopBContext loopB;
		public LWhileContext lWhile;
		public LForinContext lForin;
		public LBreakContext lBreak;
		public LContinueContext lContinue;
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
		public PushVecContext pushVec() {
			return getRuleContext(PushVecContext.class,0);
		}
		public If_sentContext if_sent() {
			return getRuleContext(If_sentContext.class,0);
		}
		public Match_sentContext match_sent() {
			return getRuleContext(Match_sentContext.class,0);
		}
		public LoopBContext loopB() {
			return getRuleContext(LoopBContext.class,0);
		}
		public LWhileContext lWhile() {
			return getRuleContext(LWhileContext.class,0);
		}
		public LForinContext lForin() {
			return getRuleContext(LForinContext.class,0);
		}
		public LBreakContext lBreak() {
			return getRuleContext(LBreakContext.class,0);
		}
		public LContinueContext lContinue() {
			return getRuleContext(LContinueContext.class,0);
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
		enterRule(_localctx, 18, RULE_instruccion);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((InstruccionContext)_localctx).printconsola = printconsola();
				setState(227);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(231);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(235);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				((InstruccionContext)_localctx).pushVec = pushVec();
				setState(239);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).pushVec.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				((InstruccionContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((InstruccionContext)_localctx).if_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				((InstruccionContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((InstruccionContext)_localctx).match_sent.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				((InstruccionContext)_localctx).loopB = loopB();
				 _localctx.instr = ((InstruccionContext)_localctx).loopB.lop 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(251);
				((InstruccionContext)_localctx).lWhile = lWhile();
				 _localctx.instr = ((InstruccionContext)_localctx).lWhile.lwh 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				((InstruccionContext)_localctx).lForin = lForin();
				 _localctx.instr = ((InstruccionContext)_localctx).lForin.lfor 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(257);
				((InstruccionContext)_localctx).lBreak = lBreak();
				setState(258);
				match(PTCOMA);
				 _localctx.instr = ((InstruccionContext)_localctx).lBreak.br 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(261);
				((InstruccionContext)_localctx).lContinue = lContinue();
				setState(262);
				match(PTCOMA);
				 _localctx.instr = ((InstruccionContext)_localctx).lContinue.cn 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(265);
				((InstruccionContext)_localctx).newStruct = newStruct();
				_localctx.instr = ((InstruccionContext)_localctx).newStruct.str
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(268);
				((InstruccionContext)_localctx).callFunction = callFunction();
				setState(269);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).callFunction.instr
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(272);
				((InstruccionContext)_localctx).returnFun = returnFun();
				setState(273);
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
		public PushVecContext pushVec;
		public If_sentContext if_sent;
		public Match_sentContext match_sent;
		public LoopBContext loopB;
		public LWhileContext lWhile;
		public LForinContext lForin;
		public LBreakContext lBreak;
		public LContinueContext lContinue;
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
		public PushVecContext pushVec() {
			return getRuleContext(PushVecContext.class,0);
		}
		public If_sentContext if_sent() {
			return getRuleContext(If_sentContext.class,0);
		}
		public Match_sentContext match_sent() {
			return getRuleContext(Match_sentContext.class,0);
		}
		public LoopBContext loopB() {
			return getRuleContext(LoopBContext.class,0);
		}
		public LWhileContext lWhile() {
			return getRuleContext(LWhileContext.class,0);
		}
		public LForinContext lForin() {
			return getRuleContext(LForinContext.class,0);
		}
		public LBreakContext lBreak() {
			return getRuleContext(LBreakContext.class,0);
		}
		public LContinueContext lContinue() {
			return getRuleContext(LContinueContext.class,0);
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
		enterRule(_localctx, 20, RULE_instruccion_only);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((Instruccion_onlyContext)_localctx).printconsola = printconsola();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				((Instruccion_onlyContext)_localctx).declaracion = declaracion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				((Instruccion_onlyContext)_localctx).asignacion = asignacion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				((Instruccion_onlyContext)_localctx).pushVec = pushVec();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).pushVec.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				((Instruccion_onlyContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).if_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				((Instruccion_onlyContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).match_sent.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				((Instruccion_onlyContext)_localctx).loopB = loopB();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).loopB.lop 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				((Instruccion_onlyContext)_localctx).lWhile = lWhile();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lWhile.lwh 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(302);
				((Instruccion_onlyContext)_localctx).lForin = lForin();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lForin.lfor 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(305);
				((Instruccion_onlyContext)_localctx).lBreak = lBreak();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lBreak.br 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(308);
				((Instruccion_onlyContext)_localctx).lContinue = lContinue();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lContinue.cn 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(311);
				((Instruccion_onlyContext)_localctx).callFunction = callFunction();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).callFunction.instr
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(314);
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

	public static class PushVecContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token ID;
		public ExpressionContext val;
		public ExpressionContext val1;
		public ExpressionContext val2;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(RustPar.PUNTO, 0); }
		public TerminalNode PUSH() { return getToken(RustPar.PUSH, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INSERT() { return getToken(RustPar.INSERT, 0); }
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public PushVecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushVec; }
	}

	public final PushVecContext pushVec() throws RecognitionException {
		PushVecContext _localctx = new PushVecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pushVec);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				((PushVecContext)_localctx).ID = match(ID);
				setState(320);
				match(PUNTO);
				setState(321);
				match(PUSH);
				setState(322);
				match(PARIZQ);
				setState(323);
				((PushVecContext)_localctx).val = expression(0);
				setState(324);
				match(PARDER);
				_localctx.instr = instruction.NewPush((((PushVecContext)_localctx).ID!=null?((PushVecContext)_localctx).ID.getText():null), ((PushVecContext)_localctx).val.p, (((PushVecContext)_localctx).ID!=null?((PushVecContext)_localctx).ID.getLine():0), (((PushVecContext)_localctx).ID!=null?((PushVecContext)_localctx).ID.getCharPositionInLine():0)  )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				((PushVecContext)_localctx).ID = match(ID);
				setState(328);
				match(PUNTO);
				setState(329);
				match(INSERT);
				setState(330);
				match(PARIZQ);
				setState(331);
				((PushVecContext)_localctx).val1 = expression(0);
				setState(332);
				match(COMA);
				setState(333);
				((PushVecContext)_localctx).val2 = expression(0);
				setState(334);
				match(PARDER);
				 _localctx.instr = instruction.NewInsert((((PushVecContext)_localctx).ID!=null?((PushVecContext)_localctx).ID.getText():null), ((PushVecContext)_localctx).val1.p, ((PushVecContext)_localctx).val2.p, (((PushVecContext)_localctx).ID!=null?((PushVecContext)_localctx).ID.getLine():0), (((PushVecContext)_localctx).ID!=null?((PushVecContext)_localctx).ID.getCharPositionInLine():0)) 
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
		enterRule(_localctx, 24, RULE_newStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((NewStructContext)_localctx).STRUCT = match(STRUCT);
			setState(340);
			((NewStructContext)_localctx).ID = match(ID);
			setState(341);
			match(LLAVEIZQ);
			setState(342);
			((NewStructContext)_localctx).listdecStruct = listdecStruct(0);
			setState(343);
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
		public Token id;
		public Tipos_varContext tipos_var;
		public Token idstru;
		public TerminalNode DPUNTO2() { return getToken(RustPar.DPUNTO2, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(RustPar.ID); }
		public TerminalNode ID(int i) {
			return getToken(RustPar.ID, i);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_listdecStruct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(347);
				((ListdecStructContext)_localctx).id = match(ID);
				setState(348);
				match(DPUNTO2);
				setState(349);
				((ListdecStructContext)_localctx).tipos_var = tipos_var();

				                    Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).id!=null?((ListdecStructContext)_localctx).id.getText():null), ((ListdecStructContext)_localctx).tipos_var.tipo, "")
				                    ((ListdecStructContext)_localctx).l =  arrayList.New();
				                    _localctx.l.Add(Str_atrib);
				                
				}
				break;
			case 2:
				{
				setState(352);
				((ListdecStructContext)_localctx).id = match(ID);
				setState(353);
				match(DPUNTO2);
				setState(354);
				((ListdecStructContext)_localctx).idstru = match(ID);

				                    Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).id!=null?((ListdecStructContext)_localctx).id.getText():null), interfaces.NULL, (((ListdecStructContext)_localctx).idstru!=null?((ListdecStructContext)_localctx).idstru.getText():null))
				                    ((ListdecStructContext)_localctx).l =  arrayList.New();
				                    _localctx.l.Add(Str_atrib);
				                
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ListdecStructContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listdecStruct);
						setState(358);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(359);
						match(COMA);
						setState(360);
						((ListdecStructContext)_localctx).id = match(ID);
						setState(361);
						match(DPUNTO2);
						setState(362);
						((ListdecStructContext)_localctx).tipos_var = tipos_var();

						                                                  Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).id!=null?((ListdecStructContext)_localctx).id.getText():null), ((ListdecStructContext)_localctx).tipos_var.tipo, "")
						                                                  ((ListdecStructContext)_localctx).list.l.Add(Str_atrib);
						                                                  ((ListdecStructContext)_localctx).l =  ((ListdecStructContext)_localctx).list.l;
						                                              
						}
						break;
					case 2:
						{
						_localctx = new ListdecStructContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listdecStruct);
						setState(365);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(366);
						match(COMA);
						setState(367);
						((ListdecStructContext)_localctx).id = match(ID);
						setState(368);
						match(DPUNTO2);
						setState(369);
						((ListdecStructContext)_localctx).idstru = match(ID);

						                                                  Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).id!=null?((ListdecStructContext)_localctx).id.getText():null), interfaces.NULL, (((ListdecStructContext)_localctx).idstru!=null?((ListdecStructContext)_localctx).idstru.getText():null))
						                                                  ((ListdecStructContext)_localctx).list.l.Add(Str_atrib);
						                                                  ((ListdecStructContext)_localctx).l =  ((ListdecStructContext)_localctx).list.l;
						                                              
						}
						break;
					}
					} 
				}
				setState(375);
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

	public static class CallFunctionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public interfaces.Expresion p;
		public Token ID;
		public ListParamsCallContext listParamsCall;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callFunction);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(377);
				match(PARIZQ);
				setState(378);
				match(PARDER);

				                        _localctx.instr = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.p = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(381);
				match(PARIZQ);
				setState(382);
				((CallFunctionContext)_localctx).listParamsCall = listParamsCall(0);
				setState(383);
				match(PARDER);

				                        _localctx.instr = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), ((CallFunctionContext)_localctx).listParamsCall.l_e, (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.p = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), ((CallFunctionContext)_localctx).listParamsCall.l_e, (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                    
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
		public Token RETURN;
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
		enterRule(_localctx, 30, RULE_returnFun);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				((ReturnFunContext)_localctx).RETURN = match(RETURN);
				 _localctx.instr = instructionExpre.NewReturn(nil, (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getLine():0), (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getCharPositionInLine():0) )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				((ReturnFunContext)_localctx).RETURN = match(RETURN);
				setState(391);
				((ReturnFunContext)_localctx).expression = expression(0);
				 _localctx.instr = instructionExpre.NewReturn(((ReturnFunContext)_localctx).expression.p, (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getLine():0), (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getCharPositionInLine():0) )
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
		enterRule(_localctx, 32, RULE_printconsola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			((PrintconsolaContext)_localctx).PRINT_CON = match(PRINT_CON);
			setState(397);
			match(PARIZQ);
			setState(398);
			((PrintconsolaContext)_localctx).listParams = listParams(0);
			setState(399);
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

	public static class LoopBContext extends ParserRuleContext {
		public interfaces.Instruction lop;
		public interfaces.Expresion p;
		public Token LOOP;
		public Bloque_instContext bloque_inst;
		public TerminalNode LOOP() { return getToken(RustPar.LOOP, 0); }
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public LoopBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopB; }
	}

	public final LoopBContext loopB() throws RecognitionException {
		LoopBContext _localctx = new LoopBContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loopB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			((LoopBContext)_localctx).LOOP = match(LOOP);
			setState(403);
			((LoopBContext)_localctx).bloque_inst = bloque_inst();
			 
			                        _localctx.lop = instructionExpre.NewLoop(((LoopBContext)_localctx).bloque_inst.l, (((LoopBContext)_localctx).LOOP!=null?((LoopBContext)_localctx).LOOP.getLine():0), (((LoopBContext)_localctx).LOOP!=null?((LoopBContext)_localctx).LOOP.getCharPositionInLine():0) )
			                        _localctx.p = instructionExpre.NewLoop(((LoopBContext)_localctx).bloque_inst.l, (((LoopBContext)_localctx).LOOP!=null?((LoopBContext)_localctx).LOOP.getLine():0), (((LoopBContext)_localctx).LOOP!=null?((LoopBContext)_localctx).LOOP.getCharPositionInLine():0) ) 
			                    
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

	public static class LWhileContext extends ParserRuleContext {
		public interfaces.Instruction lwh;
		public Token WHILE;
		public ExpressionContext expression;
		public Bloque_instContext bloque_inst;
		public TerminalNode WHILE() { return getToken(RustPar.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public LWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lWhile; }
	}

	public final LWhileContext lWhile() throws RecognitionException {
		LWhileContext _localctx = new LWhileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			((LWhileContext)_localctx).WHILE = match(WHILE);
			setState(407);
			((LWhileContext)_localctx).expression = expression(0);
			setState(408);
			((LWhileContext)_localctx).bloque_inst = bloque_inst();
			 _localctx.lwh = instruction.NewWhile(((LWhileContext)_localctx).expression.p, ((LWhileContext)_localctx).bloque_inst.l, (((LWhileContext)_localctx).WHILE!=null?((LWhileContext)_localctx).WHILE.getLine():0), (((LWhileContext)_localctx).WHILE!=null?((LWhileContext)_localctx).WHILE.getCharPositionInLine():0) ) 
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

	public static class LForinContext extends ParserRuleContext {
		public interfaces.Instruction lfor;
		public Token FOR;
		public Token ID;
		public ExpressionContext expression;
		public Bloque_instContext bloque_inst;
		public TerminalNode FOR() { return getToken(RustPar.FOR, 0); }
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode IN() { return getToken(RustPar.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public LForinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lForin; }
	}

	public final LForinContext lForin() throws RecognitionException {
		LForinContext _localctx = new LForinContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lForin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			((LForinContext)_localctx).FOR = match(FOR);
			setState(412);
			((LForinContext)_localctx).ID = match(ID);
			setState(413);
			match(IN);
			setState(414);
			((LForinContext)_localctx).expression = expression(0);
			setState(415);
			((LForinContext)_localctx).bloque_inst = bloque_inst();
			 _localctx.lfor = instruction.NewForIn((((LForinContext)_localctx).ID!=null?((LForinContext)_localctx).ID.getText():null), ((LForinContext)_localctx).expression.p, ((LForinContext)_localctx).bloque_inst.l, (((LForinContext)_localctx).FOR!=null?((LForinContext)_localctx).FOR.getLine():0), (((LForinContext)_localctx).FOR!=null?((LForinContext)_localctx).FOR.getCharPositionInLine():0)) 
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

	public static class LBreakContext extends ParserRuleContext {
		public interfaces.Instruction br;
		public Token BREAK;
		public ExpressionContext expression;
		public TerminalNode BREAK() { return getToken(RustPar.BREAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lBreak; }
	}

	public final LBreakContext lBreak() throws RecognitionException {
		LBreakContext _localctx = new LBreakContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lBreak);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				((LBreakContext)_localctx).BREAK = match(BREAK);
				 _localctx.br = instructionExpre.NewBreak(nil, (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getLine():0), (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				((LBreakContext)_localctx).BREAK = match(BREAK);
				setState(421);
				((LBreakContext)_localctx).expression = expression(0);
				 _localctx.br = instructionExpre.NewBreak(((LBreakContext)_localctx).expression.p, (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getLine():0), (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getCharPositionInLine():0) ) 
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

	public static class LContinueContext extends ParserRuleContext {
		public interfaces.Instruction cn;
		public Token CONTINUE;
		public TerminalNode CONTINUE() { return getToken(RustPar.CONTINUE, 0); }
		public LContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lContinue; }
	}

	public final LContinueContext lContinue() throws RecognitionException {
		LContinueContext _localctx = new LContinueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			((LContinueContext)_localctx).CONTINUE = match(CONTINUE);
			 _localctx.cn = instructionExpre.NewContinue((((LContinueContext)_localctx).CONTINUE!=null?((LContinueContext)_localctx).CONTINUE.getLine():0), (((LContinueContext)_localctx).CONTINUE!=null?((LContinueContext)_localctx).CONTINUE.getCharPositionInLine():0)) 
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_listParams, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(430);
			((ListParamsContext)_localctx).expression = expression(0);
			_localctx.l_e.Add(((ListParamsContext)_localctx).expression.p)
			}
			_ctx.stop = _input.LT(-1);
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
					setState(433);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(434);
					match(COMA);
					setState(435);
					((ListParamsContext)_localctx).expression = expression(0);

					                                              ((ListParamsContext)_localctx).list.l_e.Add(((ListParamsContext)_localctx).expression.p)
					                                              _localctx.l_e = ((ListParamsContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(442);
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

	public static class ListParamsCallContext extends ParserRuleContext {
		public *arrayList.List l_e;
		public ListParamsCallContext list;
		public Is_refContext is_ref;
		public ExpressionContext expression;
		public Is_refContext is_ref() {
			return getRuleContext(Is_refContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public ListParamsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsCall; }
	}

	public final ListParamsCallContext listParamsCall() throws RecognitionException {
		return listParamsCall(0);
	}

	private ListParamsCallContext listParamsCall(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsCallContext _localctx = new ListParamsCallContext(_ctx, _parentState);
		ListParamsCallContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_listParamsCall, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(444);
			((ListParamsCallContext)_localctx).is_ref = is_ref();
			setState(445);
			((ListParamsCallContext)_localctx).expression = expression(0);
			   ref := instructionExpre.NewParameterBy(((ListParamsCallContext)_localctx).expression.p, ((ListParamsCallContext)_localctx).is_ref.ref)
			                        _localctx.l_e.Add(ref)
			                    
			}
			_ctx.stop = _input.LT(-1);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsCallContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsCall);
					setState(448);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(449);
					match(COMA);
					setState(450);
					((ListParamsCallContext)_localctx).is_ref = is_ref();
					setState(451);
					((ListParamsCallContext)_localctx).expression = expression(0);

					                                              ref := instructionExpre.NewParameterBy(((ListParamsCallContext)_localctx).expression.p, ((ListParamsCallContext)_localctx).is_ref.ref)
					                                              ((ListParamsCallContext)_localctx).list.l_e.Add(ref)
					                                              _localctx.l_e = ((ListParamsCallContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Is_refContext extends ParserRuleContext {
		public bool ref;
		public TerminalNode AMP() { return getToken(RustPar.AMP, 0); }
		public TerminalNode MUT() { return getToken(RustPar.MUT, 0); }
		public Is_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_ref; }
	}

	public final Is_refContext is_ref() throws RecognitionException {
		Is_refContext _localctx = new Is_refContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_is_ref);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(AMP);
				setState(460);
				match(MUT);
				 _localctx.ref = true 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 _localctx.ref = false 
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

	public static class DeclaracionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Is_mutContext isMut;
		public Token id;
		public Tipos_varContext tipos_var;
		public Token asig;
		public ExpressionContext expression;
		public Array_typeContext array_type;
		public Token VECN;
		public Token idob;
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
		public List<TerminalNode> ID() { return getTokens(RustPar.ID); }
		public TerminalNode ID(int i) {
			return getToken(RustPar.ID, i);
		}
		public TerminalNode ASIGNACION() { return getToken(RustPar.ASIGNACION, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public List<TerminalNode> VECN() { return getTokens(RustPar.VECN); }
		public TerminalNode VECN(int i) {
			return getToken(RustPar.VECN, i);
		}
		public TerminalNode MENOR() { return getToken(RustPar.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(RustPar.MAYOR, 0); }
		public TerminalNode DOSPUNTO() { return getToken(RustPar.DOSPUNTO, 0); }
		public TerminalNode NEW() { return getToken(RustPar.NEW, 0); }
		public TerminalNode CAPACITY() { return getToken(RustPar.CAPACITY, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaracion);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(LET);
				setState(466);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(467);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(468);
				match(DPUNTO2);
				setState(469);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(470);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(471);
				((DeclaracionContext)_localctx).expression = expression(0);

				                        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(LET);
				setState(475);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(476);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(477);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(478);
				((DeclaracionContext)_localctx).expression = expression(0);
				 
				                      _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				match(LET);
				setState(482);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(483);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(484);
				match(DPUNTO2);
				setState(485);
				((DeclaracionContext)_localctx).array_type = array_type();
				setState(486);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(487);
				((DeclaracionContext)_localctx).expression = expression(0);

				                      _localctx.instr = instruction.NewArrayDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).array_type.ty, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				match(LET);
				setState(491);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(492);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(493);
				match(DPUNTO2);
				setState(494);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(495);
				match(MENOR);
				setState(496);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(497);
				match(MAYOR);
				setState(498);
				match(ASIGNACION);
				setState(499);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(500);
				match(DOSPUNTO);
				setState(501);
				match(NEW);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, nil, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), nil, "")
				                    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				match(LET);
				setState(505);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(506);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(507);
				match(DPUNTO2);
				setState(508);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(509);
				match(MENOR);
				setState(510);
				((DeclaracionContext)_localctx).idob = match(ID);
				setState(511);
				match(MAYOR);
				setState(512);
				match(ASIGNACION);
				setState(513);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(514);
				match(DOSPUNTO);
				setState(515);
				match(NEW);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, nil, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), nil, (((DeclaracionContext)_localctx).idob!=null?((DeclaracionContext)_localctx).idob.getText():null))
				                    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(518);
				match(LET);
				setState(519);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(520);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(521);
				match(DPUNTO2);
				setState(522);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(523);
				match(MENOR);
				setState(524);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(525);
				match(MAYOR);
				setState(526);
				match(ASIGNACION);
				setState(527);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(528);
				match(DOSPUNTO);
				setState(529);
				match(CAPACITY);
				setState(530);
				match(PARIZQ);
				setState(531);
				((DeclaracionContext)_localctx).expression = expression(0);
				setState(532);
				match(PARDER);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), nil, "")
				                    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(535);
				match(LET);
				setState(536);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(537);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(538);
				match(DPUNTO2);
				setState(539);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(540);
				match(MENOR);
				setState(541);
				((DeclaracionContext)_localctx).idob = match(ID);
				setState(542);
				match(MAYOR);
				setState(543);
				match(ASIGNACION);
				setState(544);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(545);
				match(DOSPUNTO);
				setState(546);
				match(CAPACITY);
				setState(547);
				match(PARIZQ);
				setState(548);
				((DeclaracionContext)_localctx).expression = expression(0);
				setState(549);
				match(PARDER);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), nil, (((DeclaracionContext)_localctx).idob!=null?((DeclaracionContext)_localctx).idob.getText():null))
				                    
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
		enterRule(_localctx, 52, RULE_is_mut);
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
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
		enterRule(_localctx, 54, RULE_array_type);

		    _localctx.ty = arrayList.New()

		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(560);
				((Array_typeContext)_localctx).array_type = array_type();
				setState(561);
				match(PTCOMA);
				setState(562);
				((Array_typeContext)_localctx).expression = expression(0);
				setState(563);
				match(CORDER);

				                                        nType := interfaces.NewArrayType(interfaces.ARRAY, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                        ((Array_typeContext)_localctx).array_type.ty.Add(nType)
				                                        _localctx.ty = ((Array_typeContext)_localctx).array_type.ty
				                                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(567);
				((Array_typeContext)_localctx).tipos_var = tipos_var();
				setState(568);
				match(PTCOMA);
				setState(569);
				((Array_typeContext)_localctx).expression = expression(0);
				setState(570);
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
		public L_AccessStructContext l_AccessStruct;
		public TerminalNode ASIGNACION() { return getToken(RustPar.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public List_indexContext list_index() {
			return getRuleContext(List_indexContext.class,0);
		}
		public L_AccessStructContext l_AccessStruct() {
			return getRuleContext(L_AccessStructContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_asignacion);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				((AsignacionContext)_localctx).id = match(ID);
				setState(576);
				match(ASIGNACION);
				setState(577);
				((AsignacionContext)_localctx).expression = expression(0);
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, nil, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				((AsignacionContext)_localctx).id = match(ID);
				setState(581);
				((AsignacionContext)_localctx).list_index = list_index(0);
				setState(582);
				match(ASIGNACION);
				setState(583);
				((AsignacionContext)_localctx).expression = expression(0);
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, ((AsignacionContext)_localctx).list_index.lista, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				((AsignacionContext)_localctx).l_AccessStruct = l_AccessStruct(0);
				setState(587);
				match(ASIGNACION);
				setState(588);
				((AsignacionContext)_localctx).expression = expression(0);
				 _localctx.instr = instruction.NewAssignmentStruct(((AsignacionContext)_localctx).l_AccessStruct.l, ((AsignacionContext)_localctx).expression.p, (((AsignacionContext)_localctx).l_AccessStruct!=null?(((AsignacionContext)_localctx).l_AccessStruct.start):null).GetLine(),(((AsignacionContext)_localctx).l_AccessStruct!=null?(((AsignacionContext)_localctx).l_AccessStruct.start):null).GetColumn()) 
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

	public static class L_AccessStructContext extends ParserRuleContext {
		public *arrayList.List l;
		public L_AccessStructContext list;
		public Token ID;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(RustPar.PUNTO, 0); }
		public L_AccessStructContext l_AccessStruct() {
			return getRuleContext(L_AccessStructContext.class,0);
		}
		public L_AccessStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_AccessStruct; }
	}

	public final L_AccessStructContext l_AccessStruct() throws RecognitionException {
		return l_AccessStruct(0);
	}

	private L_AccessStructContext l_AccessStruct(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		L_AccessStructContext _localctx = new L_AccessStructContext(_ctx, _parentState);
		L_AccessStructContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_l_AccessStruct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(594);
			((L_AccessStructContext)_localctx).ID = match(ID);

			            _localctx.l = arrayList.New()
			            _localctx.l.Add((((L_AccessStructContext)_localctx).ID!=null?((L_AccessStructContext)_localctx).ID.getText():null))

			}
			_ctx.stop = _input.LT(-1);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new L_AccessStructContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_l_AccessStruct);
					setState(597);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(598);
					match(PUNTO);
					setState(599);
					((L_AccessStructContext)_localctx).ID = match(ID);

					                                             ((L_AccessStructContext)_localctx).list.l.Add((((L_AccessStructContext)_localctx).ID!=null?((L_AccessStructContext)_localctx).ID.getText():null))
					                                             _localctx.l = ((L_AccessStructContext)_localctx).list.l
					                                            
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_list_index, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(607);
			((List_indexContext)_localctx).index_array = index_array();
			_localctx.lista.Add(((List_indexContext)_localctx).index_array.index)
			}
			_ctx.stop = _input.LT(-1);
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
					setState(610);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(611);
					((List_indexContext)_localctx).index_array = index_array();

					                                                ((List_indexContext)_localctx).listi.lista.Add(((List_indexContext)_localctx).index_array.index)
					                                                _localctx.lista = ((List_indexContext)_localctx).listi.lista
					                                            
					}
					} 
				}
				setState(618);
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
		enterRule(_localctx, 62, RULE_index_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(CORIZQ);
			setState(620);
			((Index_arrayContext)_localctx).expression = expression(0);
			setState(621);
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
		enterRule(_localctx, 64, RULE_if_sent);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				((If_sentContext)_localctx).IF = match(IF);
				setState(625);
				((If_sentContext)_localctx).expression = expression(0);
				setState(626);
				((If_sentContext)_localctx).bloque_inst = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p, ((If_sentContext)_localctx).bloque_inst.l, nil,nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				((If_sentContext)_localctx).IF = match(IF);
				setState(630);
				((If_sentContext)_localctx).expression = expression(0);
				setState(631);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(632);
				match(ELSE);
				setState(633);
				((If_sentContext)_localctx).belse = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,nil,((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				((If_sentContext)_localctx).IF = match(IF);
				setState(637);
				((If_sentContext)_localctx).expression = expression(0);
				setState(638);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(639);
				((If_sentContext)_localctx).list_elseif = list_elseif();

				        _localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,((If_sentContext)_localctx).list_elseif.lista, nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				((If_sentContext)_localctx).IF = match(IF);
				setState(643);
				((If_sentContext)_localctx).expression = expression(0);
				setState(644);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(645);
				((If_sentContext)_localctx).list_elseif = list_elseif();
				setState(646);
				match(ELSE);
				setState(647);
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
		enterRule(_localctx, 66, RULE_if_exp);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				((If_expContext)_localctx).IF = match(IF);
				setState(653);
				((If_expContext)_localctx).expression = expression(0);
				setState(654);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(655);
				match(ELSE);
				setState(656);
				((If_expContext)_localctx).belse_e = bloque_exp();
				_localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p, nil ,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, nil, ((If_expContext)_localctx).belse_e.p )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				((If_expContext)_localctx).IF = match(IF);
				setState(660);
				((If_expContext)_localctx).expression = expression(0);
				setState(661);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(662);
				((If_expContext)_localctx).list_elseif_exp = list_elseif_exp();
				setState(663);
				match(ELSE);
				setState(664);
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
		enterRule(_localctx, 68, RULE_list_elseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(669);
					((List_elseifContext)_localctx).else_if = else_if();
					((List_elseifContext)_localctx).list.add(((List_elseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(672); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 70, RULE_list_elseif_exp);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(677); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(676);
					((List_elseif_expContext)_localctx).else_if_exp = else_if_exp();
					((List_elseif_expContext)_localctx).list.add(((List_elseif_expContext)_localctx).else_if_exp);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(679); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 72, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			((Else_ifContext)_localctx).ELSE = match(ELSE);
			setState(684);
			match(IF);
			setState(685);
			((Else_ifContext)_localctx).expression = expression(0);
			setState(686);
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
		enterRule(_localctx, 74, RULE_else_if_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			((Else_if_expContext)_localctx).ELSE = match(ELSE);
			setState(690);
			match(IF);
			setState(691);
			((Else_if_expContext)_localctx).expression = expression(0);
			setState(692);
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
		public interfaces.Expresion p;
		public Token MATCH;
		public ExpressionContext expression;
		public Match_brazosContext brazos;
		public Token th;
		public Bloque_instContext bloque_inst;
		public Instruccion_onlyContext instruccion_only;
		public ExpressionContext exp;
		public Match_brazos_expContext brazosexp;
		public ExpressionContext exp_;
		public TerminalNode MATCH() { return getToken(RustPar.MATCH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public TerminalNode MTHEN() { return getToken(RustPar.MTHEN, 0); }
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public Instruccion_onlyContext instruccion_only() {
			return getRuleContext(Instruccion_onlyContext.class,0);
		}
		public Match_brazos_expContext match_brazos_exp() {
			return getRuleContext(Match_brazos_expContext.class,0);
		}
		public Match_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_sent; }
	}

	public final Match_sentContext match_sent() throws RecognitionException {
		Match_sentContext _localctx = new Match_sentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_match_sent);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(696);
				((Match_sentContext)_localctx).expression = expression(0);
				setState(697);
				match(LLAVEIZQ);
				setState(698);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(699);
				match(LLAVEDER);

				                        _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(703);
				((Match_sentContext)_localctx).expression = expression(0);
				setState(704);
				match(LLAVEIZQ);
				setState(705);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(706);
				match(GUIONB);
				setState(707);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(708);
				((Match_sentContext)_localctx).bloque_inst = bloque_inst();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(709);
					match(COMA);
					}
				}

				setState(712);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, ((Match_sentContext)_localctx).bloque_inst.l, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(716);
				((Match_sentContext)_localctx).expression = expression(0);
				setState(717);
				match(LLAVEIZQ);
				setState(718);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(719);
				match(GUIONB);
				setState(720);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(721);
				((Match_sentContext)_localctx).instruccion_only = instruccion_only();
				setState(722);
				match(COMA);
				setState(723);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil,  ((Match_sentContext)_localctx).instruccion_only.instr,  (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
				      
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(727);
				((Match_sentContext)_localctx).exp = expression(0);
				setState(728);
				match(LLAVEIZQ);
				setState(729);
				((Match_sentContext)_localctx).brazosexp = match_brazos_exp(0);
				setState(730);
				match(LLAVEDER);

				                        _localctx.p = instructionExpre.NewMatch(((Match_sentContext)_localctx).exp.p, ((Match_sentContext)_localctx).brazosexp.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, true )
				      
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(733);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(734);
				((Match_sentContext)_localctx).exp = expression(0);
				setState(735);
				match(LLAVEIZQ);
				setState(736);
				((Match_sentContext)_localctx).brazosexp = match_brazos_exp(0);
				setState(737);
				match(GUIONB);
				setState(738);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(739);
				((Match_sentContext)_localctx).exp_ = expression(0);
				setState(740);
				match(COMA);
				setState(741);
				match(LLAVEDER);

				                        _localctx.p = instructionExpre.NewMatch(((Match_sentContext)_localctx).exp.p, ((Match_sentContext)_localctx).brazosexp.l_brazos, nil,  nil,  (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), ((Match_sentContext)_localctx).exp_.p, true )
				      
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_match_brazos, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(747);
			((Match_brazosContext)_localctx).matchbrazo = matchbrazo();
			_localctx.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
					setState(750);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(751);
					((Match_brazosContext)_localctx).matchbrazo = matchbrazo();

					                                              ((Match_brazosContext)_localctx).listb.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
					                                              _localctx.l_brazos = ((Match_brazosContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(758);
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

	public static class Match_brazos_expContext extends ParserRuleContext {
		public *arrayList.List l_brazos;
		public Match_brazos_expContext listb;
		public Matchbrazo_expContext matchbrazo_exp;
		public Matchbrazo_expContext matchbrazo_exp() {
			return getRuleContext(Matchbrazo_expContext.class,0);
		}
		public Match_brazos_expContext match_brazos_exp() {
			return getRuleContext(Match_brazos_expContext.class,0);
		}
		public Match_brazos_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_brazos_exp; }
	}

	public final Match_brazos_expContext match_brazos_exp() throws RecognitionException {
		return match_brazos_exp(0);
	}

	private Match_brazos_expContext match_brazos_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Match_brazos_expContext _localctx = new Match_brazos_expContext(_ctx, _parentState);
		Match_brazos_expContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_match_brazos_exp, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(760);
			((Match_brazos_expContext)_localctx).matchbrazo_exp = matchbrazo_exp();
			_localctx.l_brazos.Add(((Match_brazos_expContext)_localctx).matchbrazo_exp.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(769);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Match_brazos_expContext(_parentctx, _parentState);
					_localctx.listb = _prevctx;
					_localctx.listb = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_match_brazos_exp);
					setState(763);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(764);
					((Match_brazos_expContext)_localctx).matchbrazo_exp = matchbrazo_exp();

					                                              ((Match_brazos_expContext)_localctx).listb.l_brazos.Add(((Match_brazos_expContext)_localctx).matchbrazo_exp.brazo)
					                                              _localctx.l_brazos = ((Match_brazos_expContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(771);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public TerminalNode MTHEN() { return getToken(RustPar.MTHEN, 0); }
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
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
		enterRule(_localctx, 82, RULE_matchbrazo);
		try {
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(773);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(774);
				((MatchbrazoContext)_localctx).bloque_inst = bloque_inst();
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(775);
					match(COMA);
					}
					break;
				}
				 _localctx.brazo = instructionExpre.NewBrazoMatch(((MatchbrazoContext)_localctx).listaOpciones.lisop, ((MatchbrazoContext)_localctx).bloque_inst.l, nil, (((MatchbrazoContext)_localctx).th!=null?((MatchbrazoContext)_localctx).th.getLine():0), localctx.(*MatchbrazoContext).GetTh().GetColumn(), nil ) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(781);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(782);
				((MatchbrazoContext)_localctx).instruccion_only = instruccion_only();
				setState(783);
				match(COMA);
				 _localctx.brazo = instructionExpre.NewBrazoMatch(((MatchbrazoContext)_localctx).listaOpciones.lisop, nil,  ((MatchbrazoContext)_localctx).instruccion_only.instr, (((MatchbrazoContext)_localctx).th!=null?((MatchbrazoContext)_localctx).th.getLine():0), localctx.(*MatchbrazoContext).GetTh().GetColumn(), nil ) 
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

	public static class Matchbrazo_expContext extends ParserRuleContext {
		public instructionExpre.BrazoMatch brazo;
		public ListaOpcionesContext listaOpciones;
		public Token th;
		public ExpressionContext expression;
		public ListaOpcionesContext listaOpciones() {
			return getRuleContext(ListaOpcionesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(RustPar.COMA, 0); }
		public TerminalNode MTHEN() { return getToken(RustPar.MTHEN, 0); }
		public Matchbrazo_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchbrazo_exp; }
	}

	public final Matchbrazo_expContext matchbrazo_exp() throws RecognitionException {
		Matchbrazo_expContext _localctx = new Matchbrazo_expContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_matchbrazo_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			((Matchbrazo_expContext)_localctx).listaOpciones = listaOpciones(0);
			setState(789);
			((Matchbrazo_expContext)_localctx).th = match(MTHEN);
			setState(790);
			((Matchbrazo_expContext)_localctx).expression = expression(0);
			setState(791);
			match(COMA);
			 _localctx.brazo = instructionExpre.NewBrazoMatch(((Matchbrazo_expContext)_localctx).listaOpciones.lisop, nil,  nil, (((Matchbrazo_expContext)_localctx).th!=null?((Matchbrazo_expContext)_localctx).th.getLine():0), localctx.(*Matchbrazo_expContext).GetTh().GetColumn(), ((Matchbrazo_expContext)_localctx).expression.p ) 
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_listaOpciones, _p);

		    _localctx.lisop = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(795);
			((ListaOpcionesContext)_localctx).primitivo = primitivo();

			                    _localctx.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
			                  
			}
			_ctx.stop = _input.LT(-1);
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
					setState(798);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(799);
					match(MTOR);
					setState(800);
					((ListaOpcionesContext)_localctx).primitivo = primitivo();

					                                                      ((ListaOpcionesContext)_localctx).list.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
					                                                      _localctx.lisop =  ((ListaOpcionesContext)_localctx).list.lisop
					                                                    
					}
					} 
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 88, RULE_bloque_inst);
		try {
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				match(LLAVEIZQ);
				setState(809);
				((Bloque_instContext)_localctx).instrucciones = instrucciones();
				setState(810);
				match(LLAVEDER);
				_localctx.l = ((Bloque_instContext)_localctx).instrucciones.l 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				match(LLAVEIZQ);
				setState(814);
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
		enterRule(_localctx, 90, RULE_bloque_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(LLAVEIZQ);
			setState(819);
			((Bloque_expContext)_localctx).expression = expression(0);
			setState(820);
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
		enterRule(_localctx, 92, RULE_tipos_var);
		try {
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(T_NUMBER);
				_localctx.tipo = interfaces.INTEGER
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				match(T_STRING);
				_localctx.tipo = interfaces.STRING
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(827);
				match(T_FLOAT);
				_localctx.tipo = interfaces.FLOAT
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
				match(T_BOOL);
				_localctx.tipo = interfaces.BOOLEAN
				}
				break;
			case T_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(831);
				match(T_STR);
				_localctx.tipo = interfaces.STR
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(833);
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
		public ExpressionContext e_ini;
		public Expr_aritContext expr_arit;
		public Token ID;
		public ExpressionContext val;
		public ExpressionContext e_fin;
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public List<TerminalNode> PUNTO() { return getTokens(RustPar.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(RustPar.PUNTO, i);
		}
		public TerminalNode CAPF() { return getToken(RustPar.CAPF, 0); }
		public TerminalNode CONTAINS() { return getToken(RustPar.CONTAINS, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode AMP() { return getToken(RustPar.AMP, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(838);
				((ExpressionContext)_localctx).expr_arit = expr_arit(0);
				_localctx.p = ((ExpressionContext)_localctx).expr_arit.p
				}
				break;
			case 2:
				{
				setState(841);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(842);
				match(PUNTO);
				setState(843);
				match(CAPF);
				_localctx.p = expresion.NewCapacity((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getLine():0), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getCharPositionInLine():0)  )
				}
				break;
			case 3:
				{
				setState(845);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(846);
				match(PUNTO);
				setState(847);
				match(CONTAINS);
				setState(848);
				match(PARIZQ);
				setState(849);
				match(AMP);
				setState(850);
				((ExpressionContext)_localctx).val = expression(0);
				setState(851);
				match(PARDER);
				_localctx.p = expresion.NewContains((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).val.p, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getLine():0), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getCharPositionInLine():0)  )
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.e_ini = _prevctx;
					_localctx.e_ini = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(856);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(857);
					match(PUNTO);
					setState(858);
					match(PUNTO);
					setState(859);
					((ExpressionContext)_localctx).e_fin = expression(2);
					 _localctx.p = expresion.NewRangeF(((ExpressionContext)_localctx).e_ini.p, ((ExpressionContext)_localctx).e_fin.p, (((ExpressionContext)_localctx).e_ini!=null?(((ExpressionContext)_localctx).e_ini.start):null).GetLine(),(((ExpressionContext)_localctx).e_ini!=null?(((ExpressionContext)_localctx).e_ini.start):null).GetColumn() ) 
					}
					} 
				}
				setState(866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		public ListParamsContext live;
		public ListParamsContext listParams;
		public Token ID;
		public L_StructExpContext l_StructExp;
		public PrimitivoContext primitivo;
		public CasteoContext casteo;
		public If_expContext if_exp;
		public Match_sentContext match_sent;
		public LoopBContext loopB;
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
		public TerminalNode VEC() { return getToken(RustPar.VEC, 0); }
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
		public Match_sentContext match_sent() {
			return getRuleContext(Match_sentContext.class,0);
		}
		public LoopBContext loopB() {
			return getRuleContext(LoopBContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(RustPar.PUNTO, 0); }
		public TerminalNode REMOVE() { return getToken(RustPar.REMOVE, 0); }
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
		public TerminalNode LEN() { return getToken(RustPar.LEN, 0); }
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(868);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(869);
				((Expr_aritContext)_localctx).opU = expr_arit(23);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(872);
				match(T_NUMBER);
				setState(873);
				match(DOSPUNTO);
				setState(874);
				((Expr_aritContext)_localctx).op = match(POW);
				setState(875);
				match(PARIZQ);
				setState(876);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(877);
				match(COMA);
				setState(878);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(879);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 3:
				{
				setState(882);
				match(T_FLOAT);
				setState(883);
				match(DOSPUNTO);
				setState(884);
				((Expr_aritContext)_localctx).op = match(POWF);
				setState(885);
				match(PARIZQ);
				setState(886);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(887);
				match(COMA);
				setState(888);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(889);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 4:
				{
				setState(892);
				((Expr_aritContext)_localctx).op = match(NOT);
				setState(893);
				((Expr_aritContext)_localctx).opU = expr_arit(16);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"!",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 5:
				{
				setState(896);
				match(VEC);
				setState(897);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(898);
				((Expr_aritContext)_localctx).exp = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(899);
				match(PTCOMA);
				setState(900);
				((Expr_aritContext)_localctx).tam = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(901);
				match(CORDER);
				 _localctx.p = expresion.NewVector(nil, ((Expr_aritContext)_localctx).exp.p, ((Expr_aritContext)_localctx).tam.p, 2, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 6:
				{
				setState(904);
				match(VEC);
				setState(905);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(906);
				((Expr_aritContext)_localctx).live = ((Expr_aritContext)_localctx).listParams = listParams(0);
				setState(907);
				match(CORDER);
				 _localctx.p = expresion.NewVector(((Expr_aritContext)_localctx).live.l_e, nil, nil, 1, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 7:
				{
				setState(910);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(911);
				((Expr_aritContext)_localctx).exp = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(912);
				match(PTCOMA);
				setState(913);
				((Expr_aritContext)_localctx).tam = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(914);
				match(CORDER);
				 _localctx.p = expresion.NewArray(nil, ((Expr_aritContext)_localctx).exp.p, ((Expr_aritContext)_localctx).tam.p, 2, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 8:
				{
				setState(917);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(918);
				((Expr_aritContext)_localctx).listParams = listParams(0);
				setState(919);
				match(CORDER);
				    _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listParams.l_e, nil, nil, 1, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 9:
				{
				setState(922);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(923);
				match(LLAVEIZQ);
				setState(924);
				((Expr_aritContext)_localctx).l_StructExp = l_StructExp(0);
				setState(925);
				match(LLAVEDER);
				 _localctx.p = instructionExpre.NewStructExpre((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).l_StructExp.l, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0) ) 
				}
				break;
			case 10:
				{
				setState(928);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 11:
				{
				setState(931);
				match(PARIZQ);
				setState(932);
				((Expr_aritContext)_localctx).expression = expression(0);
				setState(933);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 12:
				{
				setState(936);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			case 13:
				{
				setState(939);
				((Expr_aritContext)_localctx).if_exp = if_exp();
				_localctx.p = ((Expr_aritContext)_localctx).if_exp.p
				}
				break;
			case 14:
				{
				setState(942);
				((Expr_aritContext)_localctx).match_sent = match_sent();
				_localctx.p = ((Expr_aritContext)_localctx).match_sent.p
				}
				break;
			case 15:
				{
				setState(945);
				((Expr_aritContext)_localctx).loopB = loopB();
				 _localctx.p = ((Expr_aritContext)_localctx).loopB.p 
				}
				break;
			case 16:
				{
				setState(948);
				((Expr_aritContext)_localctx).callFunction = callFunction();
				_localctx.p = ((Expr_aritContext)_localctx).callFunction.p
				}
				break;
			case 17:
				{
				setState(951);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(952);
				match(PUNTO);
				setState(953);
				match(REMOVE);
				setState(954);
				match(PARIZQ);
				setState(955);
				((Expr_aritContext)_localctx).expression = expression(0);
				setState(956);
				match(PARDER);
				 _localctx.p = instructionExpre.NewRemove((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).expression.p, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0)) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(990);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(961);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(962);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (MUL - 60)) | (1L << (DIV - 60)) | (1L << (MOD - 60)))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(963);
						((Expr_aritContext)_localctx).opDe = expr_arit(21);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(966);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(967);
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
						setState(968);
						((Expr_aritContext)_localctx).opDe = expr_arit(19);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(971);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(972);
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
						setState(973);
						((Expr_aritContext)_localctx).opDe = expr_arit(18);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(976);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(977);
						((Expr_aritContext)_localctx).op = match(AND);
						setState(978);
						((Expr_aritContext)_localctx).opDe = expr_arit(16);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(981);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(982);
						((Expr_aritContext)_localctx).op = match(OR);
						setState(983);
						((Expr_aritContext)_localctx).opDe = expr_arit(15);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 6:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(986);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(987);
						match(PUNTO);
						setState(988);
						match(LEN);
						_localctx.p = expresion.NewLen(((Expr_aritContext)_localctx).opIz.p, (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(), (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn()  )
						}
						break;
					}
					} 
				}
				setState(994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 98, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(996);
			((CasteoContext)_localctx).expression = expression(0);
			setState(997);
			match(AS);
			setState(998);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(999);
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
		enterRule(_localctx, 100, RULE_tipo_cast);
		try {
			setState(1006);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_l_StructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1009);
			((L_StructExpContext)_localctx).ID = match(ID);
			setState(1010);
			match(DPUNTO2);
			setState(1011);
			((L_StructExpContext)_localctx).expression = expression(0);

			                    Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
			                    ((L_StructExpContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add(Str_ep);
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(1023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
					setState(1014);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1015);
					match(COMA);
					setState(1016);
					((L_StructExpContext)_localctx).ID = match(ID);
					setState(1017);
					match(DPUNTO2);
					setState(1018);
					((L_StructExpContext)_localctx).expression = expression(0);

					                                                  Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
					                                                  ((L_StructExpContext)_localctx).list.l.Add(Str_ep);
					                                                  ((L_StructExpContext)_localctx).l =  ((L_StructExpContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(1025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 104, RULE_primitivo);
		try {
			setState(1040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
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
				setState(1028);
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
				setState(1030);
				((PrimitivoContext)_localctx).strings = strings();
				_localctx.p = ((PrimitivoContext)_localctx).strings.p
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1033);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1035);
				((PrimitivoContext)_localctx).FALSE = match(FALSE);
				 _localctx.p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).FALSE!=null?((PrimitivoContext)_localctx).FALSE.getLine():0), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(1037);
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
		public TerminalNode PUNTO() { return getToken(RustPar.PUNTO, 0); }
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_listIDArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1043);
			((ListIDArrayContext)_localctx).ID = match(ID);
			 
			      _localctx.p = expresion.NewIdentificador((((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getLine():0), localctx.(*ListIDArrayContext).Get_ID().GetColumn() )
			}
			_ctx.stop = _input.LT(-1);
			setState(1058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1056);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new ListIDArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listIDArray);
						setState(1046);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1047);
						((ListIDArrayContext)_localctx).CORIZQ = match(CORIZQ);
						setState(1048);
						((ListIDArrayContext)_localctx).expression = expression(0);
						setState(1049);
						match(CORDER);
						 _localctx.p = expresion.NewArrayAccess(((ListIDArrayContext)_localctx).list.p, ((ListIDArrayContext)_localctx).expression.p, (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getLine():0), (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
						}
						break;
					case 2:
						{
						_localctx = new ListIDArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listIDArray);
						setState(1052);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1053);
						match(PUNTO);
						setState(1054);
						((ListIDArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expresion.NewStructAccess(((ListIDArrayContext)_localctx).list.p, (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).list!=null?(((ListIDArrayContext)_localctx).list.start):null).GetLine(), (((ListIDArrayContext)_localctx).list!=null?(((ListIDArrayContext)_localctx).list.start):null).GetColumn() )  
						}
						break;
					}
					} 
				}
				setState(1060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 108, RULE_strings);
		int _la;
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1061);
					match(AMP);
					}
					}
					setState(1064); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AMP );
				setState(1066);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(1068);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(1067);
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
				setState(1071);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(1072);
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
				setState(1074);
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
		case 6:
			return params_declar_sempred((Params_declarContext)_localctx, predIndex);
		case 13:
			return listdecStruct_sempred((ListdecStructContext)_localctx, predIndex);
		case 22:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 23:
			return listParamsCall_sempred((ListParamsCallContext)_localctx, predIndex);
		case 29:
			return l_AccessStruct_sempred((L_AccessStructContext)_localctx, predIndex);
		case 30:
			return list_index_sempred((List_indexContext)_localctx, predIndex);
		case 39:
			return match_brazos_sempred((Match_brazosContext)_localctx, predIndex);
		case 40:
			return match_brazos_exp_sempred((Match_brazos_expContext)_localctx, predIndex);
		case 43:
			return listaOpciones_sempred((ListaOpcionesContext)_localctx, predIndex);
		case 47:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 48:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 51:
			return l_StructExp_sempred((L_StructExpContext)_localctx, predIndex);
		case 53:
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
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParamsCall_sempred(ListParamsCallContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean l_AccessStruct_sempred(L_AccessStructContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean list_index_sempred(List_indexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_sempred(Match_brazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_exp_sempred(Match_brazos_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaOpciones_sempred(ListaOpcionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 20);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 15);
		case 16:
			return precpred(_ctx, 14);
		case 17:
			return precpred(_ctx, 19);
		}
		return true;
	}
	private boolean l_StructExp_sempred(L_StructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listIDArray_sempred(ListIDArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u0439\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\3\7\3u\n\3\f\3\16"+
		"\3x\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0084\n\4\f\4\16"+
		"\4\u0087\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008f\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00ba\n\6\3\7\3\7\3\7\5\7\u00bf\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u00ca\n\b\f\b\16\b\u00cd\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00dc\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0117\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0140\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0154\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0167\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0176"+
		"\n\17\f\17\16\17\u0179\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0185\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u018d\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u01ab\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u01b9\n\30\f\30\16\30\u01bc\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01c9\n\31\f\31\16\31\u01cc\13\31"+
		"\3\32\3\32\3\32\3\32\5\32\u01d2\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u022b\n\33\3\34"+
		"\3\34\3\34\5\34\u0230\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0240\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0252\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u025c\n\37\f\37\16\37\u025f\13"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \7 \u0269\n \f \16 \u026c\13 \3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u028d\n\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u029e\n#\3$\6$\u02a1\n$\r$\16$\u02a2\3$\3"+
		"$\3%\6%\u02a8\n%\r%\16%\u02a9\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02c9\n(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u02eb\n(\3)\3)\3)\3)\3)\3)\3)\3)\7)\u02f5\n"+
		")\f)\16)\u02f8\13)\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0302\n*\f*\16*\u0305\13"+
		"*\3+\3+\3+\3+\5+\u030b\n+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0315\n+\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0326\n-\f-\16-\u0329\13-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u0333\n.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0346\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u0359\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0361\n\61\f\61\16"+
		"\61\u0364\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03c2\n\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u03e1\n\62\f\62\16\62\u03e4\13\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u03f1\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0400\n\65\f\65\16\65\u0403"+
		"\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u0413\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u0423\n\67\f\67\16\67\u0426\13\67\38\68\u0429"+
		"\n8\r8\168\u042a\38\38\58\u042f\n8\38\38\38\38\38\38\58\u0437\n8\38\2"+
		"\20\6\16\34.\60<>PRX`bhl9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\6\4\2>?BB\3\2@A\3\28="+
		"\3\2\36\37\2\u0476\2p\3\2\2\2\4v\3\2\2\2\6{\3\2\2\2\b\u008e\3\2\2\2\n"+
		"\u00b9\3\2\2\2\f\u00be\3\2\2\2\16\u00c0\3\2\2\2\20\u00db\3\2\2\2\22\u00dd"+
		"\3\2\2\2\24\u0116\3\2\2\2\26\u013f\3\2\2\2\30\u0153\3\2\2\2\32\u0155\3"+
		"\2\2\2\34\u0166\3\2\2\2\36\u0184\3\2\2\2 \u018c\3\2\2\2\"\u018e\3\2\2"+
		"\2$\u0194\3\2\2\2&\u0198\3\2\2\2(\u019d\3\2\2\2*\u01aa\3\2\2\2,\u01ac"+
		"\3\2\2\2.\u01af\3\2\2\2\60\u01bd\3\2\2\2\62\u01d1\3\2\2\2\64\u022a\3\2"+
		"\2\2\66\u022f\3\2\2\28\u023f\3\2\2\2:\u0251\3\2\2\2<\u0253\3\2\2\2>\u0260"+
		"\3\2\2\2@\u026d\3\2\2\2B\u028c\3\2\2\2D\u029d\3\2\2\2F\u02a0\3\2\2\2H"+
		"\u02a7\3\2\2\2J\u02ad\3\2\2\2L\u02b3\3\2\2\2N\u02ea\3\2\2\2P\u02ec\3\2"+
		"\2\2R\u02f9\3\2\2\2T\u0314\3\2\2\2V\u0316\3\2\2\2X\u031c\3\2\2\2Z\u0332"+
		"\3\2\2\2\\\u0334\3\2\2\2^\u0345\3\2\2\2`\u0358\3\2\2\2b\u03c1\3\2\2\2"+
		"d\u03e5\3\2\2\2f\u03f0\3\2\2\2h\u03f2\3\2\2\2j\u0412\3\2\2\2l\u0414\3"+
		"\2\2\2n\u0436\3\2\2\2pq\5\6\4\2qr\b\2\1\2r\3\3\2\2\2su\5\24\13\2ts\3\2"+
		"\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\b\3\1\2z\5\3"+
		"\2\2\2{|\b\4\1\2|}\5\b\5\2}~\b\4\1\2~\u0085\3\2\2\2\177\u0080\f\4\2\2"+
		"\u0080\u0081\5\b\5\2\u0081\u0082\b\4\1\2\u0082\u0084\3\2\2\2\u0083\177"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\7\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5\n\6\2\u0089\u008a\b\5\1\2"+
		"\u008a\u008f\3\2\2\2\u008b\u008c\5\32\16\2\u008c\u008d\b\5\1\2\u008d\u008f"+
		"\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008b\3\2\2\2\u008f\t\3\2\2\2\u0090"+
		"\u0091\5\22\n\2\u0091\u0092\b\6\1\2\u0092\u00ba\3\2\2\2\u0093\u0094\5"+
		"\f\7\2\u0094\u0095\7)\2\2\u0095\u0096\7\67\2\2\u0096\u0097\7G\2\2\u0097"+
		"\u0098\7H\2\2\u0098\u0099\7(\2\2\u0099\u009a\5^\60\2\u009a\u009b\5Z.\2"+
		"\u009b\u009c\b\6\1\2\u009c\u00ba\3\2\2\2\u009d\u009e\5\f\7\2\u009e\u009f"+
		"\7)\2\2\u009f\u00a0\7\67\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7H\2\2\u00a2"+
		"\u00a3\5Z.\2\u00a3\u00a4\b\6\1\2\u00a4\u00ba\3\2\2\2\u00a5\u00a6\5\f\7"+
		"\2\u00a6\u00a7\7)\2\2\u00a7\u00a8\7\67\2\2\u00a8\u00a9\7G\2\2\u00a9\u00aa"+
		"\5\16\b\2\u00aa\u00ab\7H\2\2\u00ab\u00ac\5Z.\2\u00ac\u00ad\b\6\1\2\u00ad"+
		"\u00ba\3\2\2\2\u00ae\u00af\5\f\7\2\u00af\u00b0\7)\2\2\u00b0\u00b1\7\67"+
		"\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\5\16\b\2\u00b3\u00b4\7H\2\2\u00b4"+
		"\u00b5\7(\2\2\u00b5\u00b6\5^\60\2\u00b6\u00b7\5Z.\2\u00b7\u00b8\b\6\1"+
		"\2\u00b8\u00ba\3\2\2\2\u00b9\u0090\3\2\2\2\u00b9\u0093\3\2\2\2\u00b9\u009d"+
		"\3\2\2\2\u00b9\u00a5\3\2\2\2\u00b9\u00ae\3\2\2\2\u00ba\13\3\2\2\2\u00bb"+
		"\u00bc\7\'\2\2\u00bc\u00bf\b\7\1\2\u00bd\u00bf\b\7\1\2\u00be\u00bb\3\2"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\r\3\2\2\2\u00c0\u00c1\b\b\1\2\u00c1\u00c2"+
		"\5\20\t\2\u00c2\u00c3\b\b\1\2\u00c3\u00cb\3\2\2\2\u00c4\u00c5\f\4\2\2"+
		"\u00c5\u00c6\7\60\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\b\b\1\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u00c4\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\17\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5\66\34"+
		"\2\u00cf\u00d0\7\67\2\2\u00d0\u00d1\7\63\2\2\u00d1\u00d2\5^\60\2\u00d2"+
		"\u00d3\b\t\1\2\u00d3\u00dc\3\2\2\2\u00d4\u00d5\7\67\2\2\u00d5\u00d6\7"+
		"\63\2\2\u00d6\u00d7\7F\2\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9\58\35\2\u00d9"+
		"\u00da\b\t\1\2\u00da\u00dc\3\2\2\2\u00db\u00ce\3\2\2\2\u00db\u00d4\3\2"+
		"\2\2\u00dc\21\3\2\2\2\u00dd\u00de\7)\2\2\u00de\u00df\7*\2\2\u00df\u00e0"+
		"\7G\2\2\u00e0\u00e1\7H\2\2\u00e1\u00e2\5Z.\2\u00e2\u00e3\b\n\1\2\u00e3"+
		"\23\3\2\2\2\u00e4\u00e5\5\"\22\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\b\13"+
		"\1\2\u00e7\u0117\3\2\2\2\u00e8\u00e9\5\64\33\2\u00e9\u00ea\7\61\2\2\u00ea"+
		"\u00eb\b\13\1\2\u00eb\u0117\3\2\2\2\u00ec\u00ed\5:\36\2\u00ed\u00ee\7"+
		"\61\2\2\u00ee\u00ef\b\13\1\2\u00ef\u0117\3\2\2\2\u00f0\u00f1\5\30\r\2"+
		"\u00f1\u00f2\7\61\2\2\u00f2\u00f3\b\13\1\2\u00f3\u0117\3\2\2\2\u00f4\u00f5"+
		"\5B\"\2\u00f5\u00f6\b\13\1\2\u00f6\u0117\3\2\2\2\u00f7\u00f8\5N(\2\u00f8"+
		"\u00f9\b\13\1\2\u00f9\u0117\3\2\2\2\u00fa\u00fb\5$\23\2\u00fb\u00fc\b"+
		"\13\1\2\u00fc\u0117\3\2\2\2\u00fd\u00fe\5&\24\2\u00fe\u00ff\b\13\1\2\u00ff"+
		"\u0117\3\2\2\2\u0100\u0101\5(\25\2\u0101\u0102\b\13\1\2\u0102\u0117\3"+
		"\2\2\2\u0103\u0104\5*\26\2\u0104\u0105\7\61\2\2\u0105\u0106\b\13\1\2\u0106"+
		"\u0117\3\2\2\2\u0107\u0108\5,\27\2\u0108\u0109\7\61\2\2\u0109\u010a\b"+
		"\13\1\2\u010a\u0117\3\2\2\2\u010b\u010c\5\32\16\2\u010c\u010d\b\13\1\2"+
		"\u010d\u0117\3\2\2\2\u010e\u010f\5\36\20\2\u010f\u0110\7\61\2\2\u0110"+
		"\u0111\b\13\1\2\u0111\u0117\3\2\2\2\u0112\u0113\5 \21\2\u0113\u0114\7"+
		"\61\2\2\u0114\u0115\b\13\1\2\u0115\u0117\3\2\2\2\u0116\u00e4\3\2\2\2\u0116"+
		"\u00e8\3\2\2\2\u0116\u00ec\3\2\2\2\u0116\u00f0\3\2\2\2\u0116\u00f4\3\2"+
		"\2\2\u0116\u00f7\3\2\2\2\u0116\u00fa\3\2\2\2\u0116\u00fd\3\2\2\2\u0116"+
		"\u0100\3\2\2\2\u0116\u0103\3\2\2\2\u0116\u0107\3\2\2\2\u0116\u010b\3\2"+
		"\2\2\u0116\u010e\3\2\2\2\u0116\u0112\3\2\2\2\u0117\25\3\2\2\2\u0118\u0119"+
		"\5\"\22\2\u0119\u011a\b\f\1\2\u011a\u0140\3\2\2\2\u011b\u011c\5\64\33"+
		"\2\u011c\u011d\b\f\1\2\u011d\u0140\3\2\2\2\u011e\u011f\5:\36\2\u011f\u0120"+
		"\b\f\1\2\u0120\u0140\3\2\2\2\u0121\u0122\5\30\r\2\u0122\u0123\b\f\1\2"+
		"\u0123\u0140\3\2\2\2\u0124\u0125\5B\"\2\u0125\u0126\b\f\1\2\u0126\u0140"+
		"\3\2\2\2\u0127\u0128\5N(\2\u0128\u0129\b\f\1\2\u0129\u0140\3\2\2\2\u012a"+
		"\u012b\5$\23\2\u012b\u012c\b\f\1\2\u012c\u0140\3\2\2\2\u012d\u012e\5&"+
		"\24\2\u012e\u012f\b\f\1\2\u012f\u0140\3\2\2\2\u0130\u0131\5(\25\2\u0131"+
		"\u0132\b\f\1\2\u0132\u0140\3\2\2\2\u0133\u0134\5*\26\2\u0134\u0135\b\f"+
		"\1\2\u0135\u0140\3\2\2\2\u0136\u0137\5,\27\2\u0137\u0138\b\f\1\2\u0138"+
		"\u0140\3\2\2\2\u0139\u013a\5\36\20\2\u013a\u013b\b\f\1\2\u013b\u0140\3"+
		"\2\2\2\u013c\u013d\5 \21\2\u013d\u013e\b\f\1\2\u013e\u0140\3\2\2\2\u013f"+
		"\u0118\3\2\2\2\u013f\u011b\3\2\2\2\u013f\u011e\3\2\2\2\u013f\u0121\3\2"+
		"\2\2\u013f\u0124\3\2\2\2\u013f\u0127\3\2\2\2\u013f\u012a\3\2\2\2\u013f"+
		"\u012d\3\2\2\2\u013f\u0130\3\2\2\2\u013f\u0133\3\2\2\2\u013f\u0136\3\2"+
		"\2\2\u013f\u0139\3\2\2\2\u013f\u013c\3\2\2\2\u0140\27\3\2\2\2\u0141\u0142"+
		"\7\67\2\2\u0142\u0143\7/\2\2\u0143\u0144\7#\2\2\u0144\u0145\7G\2\2\u0145"+
		"\u0146\5`\61\2\u0146\u0147\7H\2\2\u0147\u0148\b\r\1\2\u0148\u0154\3\2"+
		"\2\2\u0149\u014a\7\67\2\2\u014a\u014b\7/\2\2\u014b\u014c\7%\2\2\u014c"+
		"\u014d\7G\2\2\u014d\u014e\5`\61\2\u014e\u014f\7\60\2\2\u014f\u0150\5`"+
		"\61\2\u0150\u0151\7H\2\2\u0151\u0152\b\r\1\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0141\3\2\2\2\u0153\u0149\3\2\2\2\u0154\31\3\2\2\2\u0155\u0156\7\32\2"+
		"\2\u0156\u0157\7\67\2\2\u0157\u0158\7I\2\2\u0158\u0159\5\34\17\2\u0159"+
		"\u015a\7J\2\2\u015a\u015b\b\16\1\2\u015b\33\3\2\2\2\u015c\u015d\b\17\1"+
		"\2\u015d\u015e\7\67\2\2\u015e\u015f\7\63\2\2\u015f\u0160\5^\60\2\u0160"+
		"\u0161\b\17\1\2\u0161\u0167\3\2\2\2\u0162\u0163\7\67\2\2\u0163\u0164\7"+
		"\63\2\2\u0164\u0165\7\67\2\2\u0165\u0167\b\17\1\2\u0166\u015c\3\2\2\2"+
		"\u0166\u0162\3\2\2\2\u0167\u0177\3\2\2\2\u0168\u0169\f\6\2\2\u0169\u016a"+
		"\7\60\2\2\u016a\u016b\7\67\2\2\u016b\u016c\7\63\2\2\u016c\u016d\5^\60"+
		"\2\u016d\u016e\b\17\1\2\u016e\u0176\3\2\2\2\u016f\u0170\f\5\2\2\u0170"+
		"\u0171\7\60\2\2\u0171\u0172\7\67\2\2\u0172\u0173\7\63\2\2\u0173\u0174"+
		"\7\67\2\2\u0174\u0176\b\17\1\2\u0175\u0168\3\2\2\2\u0175\u016f\3\2\2\2"+
		"\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\35"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\67\2\2\u017b\u017c\7G\2\2\u017c"+
		"\u017d\7H\2\2\u017d\u0185\b\20\1\2\u017e\u017f\7\67\2\2\u017f\u0180\7"+
		"G\2\2\u0180\u0181\5\60\31\2\u0181\u0182\7H\2\2\u0182\u0183\b\20\1\2\u0183"+
		"\u0185\3\2\2\2\u0184\u017a\3\2\2\2\u0184\u017e\3\2\2\2\u0185\37\3\2\2"+
		"\2\u0186\u0187\7+\2\2\u0187\u018d\b\21\1\2\u0188\u0189\7+\2\2\u0189\u018a"+
		"\5`\61\2\u018a\u018b\b\21\1\2\u018b\u018d\3\2\2\2\u018c\u0186\3\2\2\2"+
		"\u018c\u0188\3\2\2\2\u018d!\3\2\2\2\u018e\u018f\7\3\2\2\u018f\u0190\7"+
		"G\2\2\u0190\u0191\5.\30\2\u0191\u0192\7H\2\2\u0192\u0193\b\22\1\2\u0193"+
		"#\3\2\2\2\u0194\u0195\7\f\2\2\u0195\u0196\5Z.\2\u0196\u0197\b\23\1\2\u0197"+
		"%\3\2\2\2\u0198\u0199\7\13\2\2\u0199\u019a\5`\61\2\u019a\u019b\5Z.\2\u019b"+
		"\u019c\b\24\1\2\u019c\'\3\2\2\2\u019d\u019e\7\r\2\2\u019e\u019f\7\67\2"+
		"\2\u019f\u01a0\7\16\2\2\u01a0\u01a1\5`\61\2\u01a1\u01a2\5Z.\2\u01a2\u01a3"+
		"\b\25\1\2\u01a3)\3\2\2\2\u01a4\u01a5\7\17\2\2\u01a5\u01ab\b\26\1\2\u01a6"+
		"\u01a7\7\17\2\2\u01a7\u01a8\5`\61\2\u01a8\u01a9\b\26\1\2\u01a9\u01ab\3"+
		"\2\2\2\u01aa\u01a4\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab+\3\2\2\2\u01ac\u01ad"+
		"\7\20\2\2\u01ad\u01ae\b\27\1\2\u01ae-\3\2\2\2\u01af\u01b0\b\30\1\2\u01b0"+
		"\u01b1\5`\61\2\u01b1\u01b2\b\30\1\2\u01b2\u01ba\3\2\2\2\u01b3\u01b4\f"+
		"\4\2\2\u01b4\u01b5\7\60\2\2\u01b5\u01b6\5`\61\2\u01b6\u01b7\b\30\1\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb/\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be"+
		"\b\31\1\2\u01be\u01bf\5\62\32\2\u01bf\u01c0\5`\61\2\u01c0\u01c1\b\31\1"+
		"\2\u01c1\u01ca\3\2\2\2\u01c2\u01c3\f\4\2\2\u01c3\u01c4\7\60\2\2\u01c4"+
		"\u01c5\5\62\32\2\u01c5\u01c6\5`\61\2\u01c6\u01c7\b\31\1\2\u01c7\u01c9"+
		"\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\61\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7F\2\2"+
		"\u01ce\u01cf\7\31\2\2\u01cf\u01d2\b\32\1\2\u01d0\u01d2\b\32\1\2\u01d1"+
		"\u01cd\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\63\3\2\2\2\u01d3\u01d4\7\30\2"+
		"\2\u01d4\u01d5\5\66\34\2\u01d5\u01d6\7\67\2\2\u01d6\u01d7\7\63\2\2\u01d7"+
		"\u01d8\5^\60\2\u01d8\u01d9\7\64\2\2\u01d9\u01da\5`\61\2\u01da\u01db\b"+
		"\33\1\2\u01db\u022b\3\2\2\2\u01dc\u01dd\7\30\2\2\u01dd\u01de\5\66\34\2"+
		"\u01de\u01df\7\67\2\2\u01df\u01e0\7\64\2\2\u01e0\u01e1\5`\61\2\u01e1\u01e2"+
		"\b\33\1\2\u01e2\u022b\3\2\2\2\u01e3\u01e4\7\30\2\2\u01e4\u01e5\5\66\34"+
		"\2\u01e5\u01e6\7\67\2\2\u01e6\u01e7\7\63\2\2\u01e7\u01e8\58\35\2\u01e8"+
		"\u01e9\7\64\2\2\u01e9\u01ea\5`\61\2\u01ea\u01eb\b\33\1\2\u01eb\u022b\3"+
		"\2\2\2\u01ec\u01ed\7\30\2\2\u01ed\u01ee\5\66\34\2\u01ee\u01ef\7\67\2\2"+
		"\u01ef\u01f0\7\63\2\2\u01f0\u01f1\7\34\2\2\u01f1\u01f2\7=\2\2\u01f2\u01f3"+
		"\5^\60\2\u01f3\u01f4\7<\2\2\u01f4\u01f5\7\64\2\2\u01f5\u01f6\7\34\2\2"+
		"\u01f6\u01f7\7\62\2\2\u01f7\u01f8\7!\2\2\u01f8\u01f9\b\33\1\2\u01f9\u022b"+
		"\3\2\2\2\u01fa\u01fb\7\30\2\2\u01fb\u01fc\5\66\34\2\u01fc\u01fd\7\67\2"+
		"\2\u01fd\u01fe\7\63\2\2\u01fe\u01ff\7\34\2\2\u01ff\u0200\7=\2\2\u0200"+
		"\u0201\7\67\2\2\u0201\u0202\7<\2\2\u0202\u0203\7\64\2\2\u0203\u0204\7"+
		"\34\2\2\u0204\u0205\7\62\2\2\u0205\u0206\7!\2\2\u0206\u0207\b\33\1\2\u0207"+
		"\u022b\3\2\2\2\u0208\u0209\7\30\2\2\u0209\u020a\5\66\34\2\u020a\u020b"+
		"\7\67\2\2\u020b\u020c\7\63\2\2\u020c\u020d\7\34\2\2\u020d\u020e\7=\2\2"+
		"\u020e\u020f\5^\60\2\u020f\u0210\7<\2\2\u0210\u0211\7\64\2\2\u0211\u0212"+
		"\7\34\2\2\u0212\u0213\7\62\2\2\u0213\u0214\7\35\2\2\u0214\u0215\7G\2\2"+
		"\u0215\u0216\5`\61\2\u0216\u0217\7H\2\2\u0217\u0218\b\33\1\2\u0218\u022b"+
		"\3\2\2\2\u0219\u021a\7\30\2\2\u021a\u021b\5\66\34\2\u021b\u021c\7\67\2"+
		"\2\u021c\u021d\7\63\2\2\u021d\u021e\7\34\2\2\u021e\u021f\7=\2\2\u021f"+
		"\u0220\7\67\2\2\u0220\u0221\7<\2\2\u0221\u0222\7\64\2\2\u0222\u0223\7"+
		"\34\2\2\u0223\u0224\7\62\2\2\u0224\u0225\7\35\2\2\u0225\u0226\7G\2\2\u0226"+
		"\u0227\5`\61\2\u0227\u0228\7H\2\2\u0228\u0229\b\33\1\2\u0229\u022b\3\2"+
		"\2\2\u022a\u01d3\3\2\2\2\u022a\u01dc\3\2\2\2\u022a\u01e3\3\2\2\2\u022a"+
		"\u01ec\3\2\2\2\u022a\u01fa\3\2\2\2\u022a\u0208\3\2\2\2\u022a\u0219\3\2"+
		"\2\2\u022b\65\3\2\2\2\u022c\u022d\7\31\2\2\u022d\u0230\b\34\1\2\u022e"+
		"\u0230\3\2\2\2\u022f\u022c\3\2\2\2\u022f\u022e\3\2\2\2\u0230\67\3\2\2"+
		"\2\u0231\u0232\7K\2\2\u0232\u0233\58\35\2\u0233\u0234\7\61\2\2\u0234\u0235"+
		"\5`\61\2\u0235\u0236\7L\2\2\u0236\u0237\b\35\1\2\u0237\u0240\3\2\2\2\u0238"+
		"\u0239\7K\2\2\u0239\u023a\5^\60\2\u023a\u023b\7\61\2\2\u023b\u023c\5`"+
		"\61\2\u023c\u023d\7L\2\2\u023d\u023e\b\35\1\2\u023e\u0240\3\2\2\2\u023f"+
		"\u0231\3\2\2\2\u023f\u0238\3\2\2\2\u02409\3\2\2\2\u0241\u0242\7\67\2\2"+
		"\u0242\u0243\7\64\2\2\u0243\u0244\5`\61\2\u0244\u0245\b\36\1\2\u0245\u0252"+
		"\3\2\2\2\u0246\u0247\7\67\2\2\u0247\u0248\5> \2\u0248\u0249\7\64\2\2\u0249"+
		"\u024a\5`\61\2\u024a\u024b\b\36\1\2\u024b\u0252\3\2\2\2\u024c\u024d\5"+
		"<\37\2\u024d\u024e\7\64\2\2\u024e\u024f\5`\61\2\u024f\u0250\b\36\1\2\u0250"+
		"\u0252\3\2\2\2\u0251\u0241\3\2\2\2\u0251\u0246\3\2\2\2\u0251\u024c\3\2"+
		"\2\2\u0252;\3\2\2\2\u0253\u0254\b\37\1\2\u0254\u0255\7\67\2\2\u0255\u0256"+
		"\b\37\1\2\u0256\u025d\3\2\2\2\u0257\u0258\f\4\2\2\u0258\u0259\7/\2\2\u0259"+
		"\u025a\7\67\2\2\u025a\u025c\b\37\1\2\u025b\u0257\3\2\2\2\u025c\u025f\3"+
		"\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e=\3\2\2\2\u025f\u025d"+
		"\3\2\2\2\u0260\u0261\b \1\2\u0261\u0262\5@!\2\u0262\u0263\b \1\2\u0263"+
		"\u026a\3\2\2\2\u0264\u0265\f\4\2\2\u0265\u0266\5@!\2\u0266\u0267\b \1"+
		"\2\u0267\u0269\3\2\2\2\u0268\u0264\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b?\3\2\2\2\u026c\u026a\3\2\2\2\u026d"+
		"\u026e\7K\2\2\u026e\u026f\5`\61\2\u026f\u0270\7L\2\2\u0270\u0271\b!\1"+
		"\2\u0271A\3\2\2\2\u0272\u0273\7\t\2\2\u0273\u0274\5`\61\2\u0274\u0275"+
		"\5Z.\2\u0275\u0276\b\"\1\2\u0276\u028d\3\2\2\2\u0277\u0278\7\t\2\2\u0278"+
		"\u0279\5`\61\2\u0279\u027a\5Z.\2\u027a\u027b\7\n\2\2\u027b\u027c\5Z.\2"+
		"\u027c\u027d\b\"\1\2\u027d\u028d\3\2\2\2\u027e\u027f\7\t\2\2\u027f\u0280"+
		"\5`\61\2\u0280\u0281\5Z.\2\u0281\u0282\5F$\2\u0282\u0283\b\"\1\2\u0283"+
		"\u028d\3\2\2\2\u0284\u0285\7\t\2\2\u0285\u0286\5`\61\2\u0286\u0287\5Z"+
		".\2\u0287\u0288\5F$\2\u0288\u0289\7\n\2\2\u0289\u028a\5Z.\2\u028a\u028b"+
		"\b\"\1\2\u028b\u028d\3\2\2\2\u028c\u0272\3\2\2\2\u028c\u0277\3\2\2\2\u028c"+
		"\u027e\3\2\2\2\u028c\u0284\3\2\2\2\u028dC\3\2\2\2\u028e\u028f\7\t\2\2"+
		"\u028f\u0290\5`\61\2\u0290\u0291\5\\/\2\u0291\u0292\7\n\2\2\u0292\u0293"+
		"\5\\/\2\u0293\u0294\b#\1\2\u0294\u029e\3\2\2\2\u0295\u0296\7\t\2\2\u0296"+
		"\u0297\5`\61\2\u0297\u0298\5\\/\2\u0298\u0299\5H%\2\u0299\u029a\7\n\2"+
		"\2\u029a\u029b\5\\/\2\u029b\u029c\b#\1\2\u029c\u029e\3\2\2\2\u029d\u028e"+
		"\3\2\2\2\u029d\u0295\3\2\2\2\u029eE\3\2\2\2\u029f\u02a1\5J&\2\u02a0\u029f"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a5\b$\1\2\u02a5G\3\2\2\2\u02a6\u02a8\5L\'\2\u02a7"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\b%\1\2\u02acI\3\2\2\2\u02ad\u02ae"+
		"\7\n\2\2\u02ae\u02af\7\t\2\2\u02af\u02b0\5`\61\2\u02b0\u02b1\5Z.\2\u02b1"+
		"\u02b2\b&\1\2\u02b2K\3\2\2\2\u02b3\u02b4\7\n\2\2\u02b4\u02b5\7\t\2\2\u02b5"+
		"\u02b6\5`\61\2\u02b6\u02b7\5\\/\2\u02b7\u02b8\b\'\1\2\u02b8M\3\2\2\2\u02b9"+
		"\u02ba\7\21\2\2\u02ba\u02bb\5`\61\2\u02bb\u02bc\7I\2\2\u02bc\u02bd\5P"+
		")\2\u02bd\u02be\7J\2\2\u02be\u02bf\b(\1\2\u02bf\u02eb\3\2\2\2\u02c0\u02c1"+
		"\7\21\2\2\u02c1\u02c2\5`\61\2\u02c2\u02c3\7I\2\2\u02c3\u02c4\5P)\2\u02c4"+
		"\u02c5\7\66\2\2\u02c5\u02c6\7\65\2\2\u02c6\u02c8\5Z.\2\u02c7\u02c9\7\60"+
		"\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cb\7J\2\2\u02cb\u02cc\b(\1\2\u02cc\u02eb\3\2\2\2\u02cd\u02ce\7\21"+
		"\2\2\u02ce\u02cf\5`\61\2\u02cf\u02d0\7I\2\2\u02d0\u02d1\5P)\2\u02d1\u02d2"+
		"\7\66\2\2\u02d2\u02d3\7\65\2\2\u02d3\u02d4\5\26\f\2\u02d4\u02d5\7\60\2"+
		"\2\u02d5\u02d6\7J\2\2\u02d6\u02d7\b(\1\2\u02d7\u02eb\3\2\2\2\u02d8\u02d9"+
		"\7\21\2\2\u02d9\u02da\5`\61\2\u02da\u02db\7I\2\2\u02db\u02dc\5R*\2\u02dc"+
		"\u02dd\7J\2\2\u02dd\u02de\b(\1\2\u02de\u02eb\3\2\2\2\u02df\u02e0\7\21"+
		"\2\2\u02e0\u02e1\5`\61\2\u02e1\u02e2\7I\2\2\u02e2\u02e3\5R*\2\u02e3\u02e4"+
		"\7\66\2\2\u02e4\u02e5\7\65\2\2\u02e5\u02e6\5`\61\2\u02e6\u02e7\7\60\2"+
		"\2\u02e7\u02e8\7J\2\2\u02e8\u02e9\b(\1\2\u02e9\u02eb\3\2\2\2\u02ea\u02b9"+
		"\3\2\2\2\u02ea\u02c0\3\2\2\2\u02ea\u02cd\3\2\2\2\u02ea\u02d8\3\2\2\2\u02ea"+
		"\u02df\3\2\2\2\u02ebO\3\2\2\2\u02ec\u02ed\b)\1\2\u02ed\u02ee\5T+\2\u02ee"+
		"\u02ef\b)\1\2\u02ef\u02f6\3\2\2\2\u02f0\u02f1\f\4\2\2\u02f1\u02f2\5T+"+
		"\2\u02f2\u02f3\b)\1\2\u02f3\u02f5\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f5\u02f8"+
		"\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7Q\3\2\2\2\u02f8"+
		"\u02f6\3\2\2\2\u02f9\u02fa\b*\1\2\u02fa\u02fb\5V,\2\u02fb\u02fc\b*\1\2"+
		"\u02fc\u0303\3\2\2\2\u02fd\u02fe\f\4\2\2\u02fe\u02ff\5V,\2\u02ff\u0300"+
		"\b*\1\2\u0300\u0302\3\2\2\2\u0301\u02fd\3\2\2\2\u0302\u0305\3\2\2\2\u0303"+
		"\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304S\3\2\2\2\u0305\u0303\3\2\2\2"+
		"\u0306\u0307\5X-\2\u0307\u0308\7\65\2\2\u0308\u030a\5Z.\2\u0309\u030b"+
		"\7\60\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2"+
		"\u030c\u030d\b+\1\2\u030d\u0315\3\2\2\2\u030e\u030f\5X-\2\u030f\u0310"+
		"\7\65\2\2\u0310\u0311\5\26\f\2\u0311\u0312\7\60\2\2\u0312\u0313\b+\1\2"+
		"\u0313\u0315\3\2\2\2\u0314\u0306\3\2\2\2\u0314\u030e\3\2\2\2\u0315U\3"+
		"\2\2\2\u0316\u0317\5X-\2\u0317\u0318\7\65\2\2\u0318\u0319\5`\61\2\u0319"+
		"\u031a\7\60\2\2\u031a\u031b\b,\1\2\u031bW\3\2\2\2\u031c\u031d\b-\1\2\u031d"+
		"\u031e\5j\66\2\u031e\u031f\b-\1\2\u031f\u0327\3\2\2\2\u0320\u0321\f\4"+
		"\2\2\u0321\u0322\7\22\2\2\u0322\u0323\5j\66\2\u0323\u0324\b-\1\2\u0324"+
		"\u0326\3\2\2\2\u0325\u0320\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2"+
		"\2\2\u0327\u0328\3\2\2\2\u0328Y\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032b"+
		"\7I\2\2\u032b\u032c\5\4\3\2\u032c\u032d\7J\2\2\u032d\u032e\b.\1\2\u032e"+
		"\u0333\3\2\2\2\u032f\u0330\7I\2\2\u0330\u0331\7J\2\2\u0331\u0333\b.\1"+
		"\2\u0332\u032a\3\2\2\2\u0332\u032f\3\2\2\2\u0333[\3\2\2\2\u0334\u0335"+
		"\7I\2\2\u0335\u0336\5`\61\2\u0336\u0337\7J\2\2\u0337\u0338\b/\1\2\u0338"+
		"]\3\2\2\2\u0339\u033a\7\4\2\2\u033a\u0346\b\60\1\2\u033b\u033c\7\6\2\2"+
		"\u033c\u0346\b\60\1\2\u033d\u033e\7\5\2\2\u033e\u0346\b\60\1\2\u033f\u0340"+
		"\7\7\2\2\u0340\u0346\b\60\1\2\u0341\u0342\7\b\2\2\u0342\u0346\b\60\1\2"+
		"\u0343\u0344\7\32\2\2\u0344\u0346\b\60\1\2\u0345\u0339\3\2\2\2\u0345\u033b"+
		"\3\2\2\2\u0345\u033d\3\2\2\2\u0345\u033f\3\2\2\2\u0345\u0341\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0346_\3\2\2\2\u0347\u0348\b\61\1\2\u0348\u0349\5b\62\2"+
		"\u0349\u034a\b\61\1\2\u034a\u0359\3\2\2\2\u034b\u034c\7\67\2\2\u034c\u034d"+
		"\7/\2\2\u034d\u034e\7\"\2\2\u034e\u0359\b\61\1\2\u034f\u0350\7\67\2\2"+
		"\u0350\u0351\7/\2\2\u0351\u0352\7$\2\2\u0352\u0353\7G\2\2\u0353\u0354"+
		"\7F\2\2\u0354\u0355\5`\61\2\u0355\u0356\7H\2\2\u0356\u0357\b\61\1\2\u0357"+
		"\u0359\3\2\2\2\u0358\u0347\3\2\2\2\u0358\u034b\3\2\2\2\u0358\u034f\3\2"+
		"\2\2\u0359\u0362\3\2\2\2\u035a\u035b\f\3\2\2\u035b\u035c\7/\2\2\u035c"+
		"\u035d\7/\2\2\u035d\u035e\5`\61\4\u035e\u035f\b\61\1\2\u035f\u0361\3\2"+
		"\2\2\u0360\u035a\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363a\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0366\b\62\1\2"+
		"\u0366\u0367\7A\2\2\u0367\u0368\5b\62\31\u0368\u0369\b\62\1\2\u0369\u03c2"+
		"\3\2\2\2\u036a\u036b\7\4\2\2\u036b\u036c\7\62\2\2\u036c\u036d\7\26\2\2"+
		"\u036d\u036e\7G\2\2\u036e\u036f\5b\62\2\u036f\u0370\7\60\2\2\u0370\u0371"+
		"\5b\62\2\u0371\u0372\7H\2\2\u0372\u0373\b\62\1\2\u0373\u03c2\3\2\2\2\u0374"+
		"\u0375\7\5\2\2\u0375\u0376\7\62\2\2\u0376\u0377\7\27\2\2\u0377\u0378\7"+
		"G\2\2\u0378\u0379\5b\62\2\u0379\u037a\7\60\2\2\u037a\u037b\5b\62\2\u037b"+
		"\u037c\7H\2\2\u037c\u037d\b\62\1\2\u037d\u03c2\3\2\2\2\u037e\u037f\7E"+
		"\2\2\u037f\u0380\5b\62\22\u0380\u0381\b\62\1\2\u0381\u03c2\3\2\2\2\u0382"+
		"\u0383\7\33\2\2\u0383\u0384\7K\2\2\u0384\u0385\5`\61\2\u0385\u0386\7\61"+
		"\2\2\u0386\u0387\5`\61\2\u0387\u0388\7L\2\2\u0388\u0389\b\62\1\2\u0389"+
		"\u03c2\3\2\2\2\u038a\u038b\7\33\2\2\u038b\u038c\7K\2\2\u038c\u038d\5."+
		"\30\2\u038d\u038e\7L\2\2\u038e\u038f\b\62\1\2\u038f\u03c2\3\2\2\2\u0390"+
		"\u0391\7K\2\2\u0391\u0392\5`\61\2\u0392\u0393\7\61\2\2\u0393\u0394\5`"+
		"\61\2\u0394\u0395\7L\2\2\u0395\u0396\b\62\1\2\u0396\u03c2\3\2\2\2\u0397"+
		"\u0398\7K\2\2\u0398\u0399\5.\30\2\u0399\u039a\7L\2\2\u039a\u039b\b\62"+
		"\1\2\u039b\u03c2\3\2\2\2\u039c\u039d\7\67\2\2\u039d\u039e\7I\2\2\u039e"+
		"\u039f\5h\65\2\u039f\u03a0\7J\2\2\u03a0\u03a1\b\62\1\2\u03a1\u03c2\3\2"+
		"\2\2\u03a2\u03a3\5j\66\2\u03a3\u03a4\b\62\1\2\u03a4\u03c2\3\2\2\2\u03a5"+
		"\u03a6\7G\2\2\u03a6\u03a7\5`\61\2\u03a7\u03a8\7H\2\2\u03a8\u03a9\b\62"+
		"\1\2\u03a9\u03c2\3\2\2\2\u03aa\u03ab\5d\63\2\u03ab\u03ac\b\62\1\2\u03ac"+
		"\u03c2\3\2\2\2\u03ad\u03ae\5D#\2\u03ae\u03af\b\62\1\2\u03af\u03c2\3\2"+
		"\2\2\u03b0\u03b1\5N(\2\u03b1\u03b2\b\62\1\2\u03b2\u03c2\3\2\2\2\u03b3"+
		"\u03b4\5$\23\2\u03b4\u03b5\b\62\1\2\u03b5\u03c2\3\2\2\2\u03b6\u03b7\5"+
		"\36\20\2\u03b7\u03b8\b\62\1\2\u03b8\u03c2\3\2\2\2\u03b9\u03ba\7\67\2\2"+
		"\u03ba\u03bb\7/\2\2\u03bb\u03bc\7&\2\2\u03bc\u03bd\7G\2\2\u03bd\u03be"+
		"\5`\61\2\u03be\u03bf\7H\2\2\u03bf\u03c0\b\62\1\2\u03c0\u03c2\3\2\2\2\u03c1"+
		"\u0365\3\2\2\2\u03c1\u036a\3\2\2\2\u03c1\u0374\3\2\2\2\u03c1\u037e\3\2"+
		"\2\2\u03c1\u0382\3\2\2\2\u03c1\u038a\3\2\2\2\u03c1\u0390\3\2\2\2\u03c1"+
		"\u0397\3\2\2\2\u03c1\u039c\3\2\2\2\u03c1\u03a2\3\2\2\2\u03c1\u03a5\3\2"+
		"\2\2\u03c1\u03aa\3\2\2\2\u03c1\u03ad\3\2\2\2\u03c1\u03b0\3\2\2\2\u03c1"+
		"\u03b3\3\2\2\2\u03c1\u03b6\3\2\2\2\u03c1\u03b9\3\2\2\2\u03c2\u03e2\3\2"+
		"\2\2\u03c3\u03c4\f\26\2\2\u03c4\u03c5\t\2\2\2\u03c5\u03c6\5b\62\27\u03c6"+
		"\u03c7\b\62\1\2\u03c7\u03e1\3\2\2\2\u03c8\u03c9\f\24\2\2\u03c9\u03ca\t"+
		"\3\2\2\u03ca\u03cb\5b\62\25\u03cb\u03cc\b\62\1\2\u03cc\u03e1\3\2\2\2\u03cd"+
		"\u03ce\f\23\2\2\u03ce\u03cf\t\4\2\2\u03cf\u03d0\5b\62\24\u03d0\u03d1\b"+
		"\62\1\2\u03d1\u03e1\3\2\2\2\u03d2\u03d3\f\21\2\2\u03d3\u03d4\7C\2\2\u03d4"+
		"\u03d5\5b\62\22\u03d5\u03d6\b\62\1\2\u03d6\u03e1\3\2\2\2\u03d7\u03d8\f"+
		"\20\2\2\u03d8\u03d9\7D\2\2\u03d9\u03da\5b\62\21\u03da\u03db\b\62\1\2\u03db"+
		"\u03e1\3\2\2\2\u03dc\u03dd\f\25\2\2\u03dd\u03de\7/\2\2\u03de\u03df\7 "+
		"\2\2\u03df\u03e1\b\62\1\2\u03e0\u03c3\3\2\2\2\u03e0\u03c8\3\2\2\2\u03e0"+
		"\u03cd\3\2\2\2\u03e0\u03d2\3\2\2\2\u03e0\u03d7\3\2\2\2\u03e0\u03dc\3\2"+
		"\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3"+
		"c\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03e6\7G\2\2\u03e6\u03e7\5`\61\2\u03e7"+
		"\u03e8\7\25\2\2\u03e8\u03e9\5f\64\2\u03e9\u03ea\7H\2\2\u03ea\u03eb\b\63"+
		"\1\2\u03ebe\3\2\2\2\u03ec\u03ed\7\5\2\2\u03ed\u03f1\b\64\1\2\u03ee\u03ef"+
		"\7\4\2\2\u03ef\u03f1\b\64\1\2\u03f0\u03ec\3\2\2\2\u03f0\u03ee\3\2\2\2"+
		"\u03f1g\3\2\2\2\u03f2\u03f3\b\65\1\2\u03f3\u03f4\7\67\2\2\u03f4\u03f5"+
		"\7\63\2\2\u03f5\u03f6\5`\61\2\u03f6\u03f7\b\65\1\2\u03f7\u0401\3\2\2\2"+
		"\u03f8\u03f9\f\4\2\2\u03f9\u03fa\7\60\2\2\u03fa\u03fb\7\67\2\2\u03fb\u03fc"+
		"\7\63\2\2\u03fc\u03fd\5`\61\2\u03fd\u03fe\b\65\1\2\u03fe\u0400\3\2\2\2"+
		"\u03ff\u03f8\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402i\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0405\7,\2\2\u0405\u0413"+
		"\b\66\1\2\u0406\u0407\7-\2\2\u0407\u0413\b\66\1\2\u0408\u0409\5n8\2\u0409"+
		"\u040a\b\66\1\2\u040a\u0413\3\2\2\2\u040b\u040c\7\23\2\2\u040c\u0413\b"+
		"\66\1\2\u040d\u040e\7\24\2\2\u040e\u0413\b\66\1\2\u040f\u0410\5l\67\2"+
		"\u0410\u0411\b\66\1\2\u0411\u0413\3\2\2\2\u0412\u0404\3\2\2\2\u0412\u0406"+
		"\3\2\2\2\u0412\u0408\3\2\2\2\u0412\u040b\3\2\2\2\u0412\u040d\3\2\2\2\u0412"+
		"\u040f\3\2\2\2\u0413k\3\2\2\2\u0414\u0415\b\67\1\2\u0415\u0416\7\67\2"+
		"\2\u0416\u0417\b\67\1\2\u0417\u0424\3\2\2\2\u0418\u0419\f\5\2\2\u0419"+
		"\u041a\7K\2\2\u041a\u041b\5`\61\2\u041b\u041c\7L\2\2\u041c\u041d\b\67"+
		"\1\2\u041d\u0423\3\2\2\2\u041e\u041f\f\4\2\2\u041f\u0420\7/\2\2\u0420"+
		"\u0421\7\67\2\2\u0421\u0423\b\67\1\2\u0422\u0418\3\2\2\2\u0422\u041e\3"+
		"\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"m\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u0429\7F\2\2\u0428\u0427\3\2\2\2\u0429"+
		"\u042a\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042c\3\2"+
		"\2\2\u042c\u042e\7.\2\2\u042d\u042f\t\5\2\2\u042e\u042d\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0437\b8\1\2\u0431\u0432\7.\2"+
		"\2\u0432\u0433\t\5\2\2\u0433\u0437\b8\1\2\u0434\u0435\7.\2\2\u0435\u0437"+
		"\b8\1\2\u0436\u0428\3\2\2\2\u0436\u0431\3\2\2\2\u0436\u0434\3\2\2\2\u0437"+
		"o\3\2\2\2\65v\u0085\u008e\u00b9\u00be\u00cb\u00db\u0116\u013f\u0153\u0166"+
		"\u0175\u0177\u0184\u018c\u01aa\u01ba\u01ca\u01d1\u022a\u022f\u023f\u0251"+
		"\u025d\u026a\u028c\u029d\u02a2\u02a9\u02c8\u02ea\u02f6\u0303\u030a\u0314"+
		"\u0327\u0332\u0345\u0358\u0362\u03c1\u03e0\u03e2\u03f0\u0401\u0412\u0422"+
		"\u0424\u042a\u042e\u0436";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}