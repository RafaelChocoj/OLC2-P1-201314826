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
		TO_STRING=25, TO_OWNED=26, PUBLIC=27, TYPETHEN=28, FN=29, MAIN=30, RETURN=31, 
		REF=32, NUMBER=33, FLOAT=34, STRING=35, PUNTO=36, COMA=37, PTCOMA=38, 
		DOSPUNTO=39, DPUNTO2=40, ASIGNACION=41, MTHEN=42, GUIONB=43, ID=44, DISTINTO=45, 
		IGUAL=46, MAYORIGUAL=47, MENORIGUAL=48, MAYOR=49, MENOR=50, MUL=51, DIV=52, 
		ADD=53, SUB=54, MOD=55, AND=56, OR=57, NOT=58, AMP=59, PARIZQ=60, PARDER=61, 
		LLAVEIZQ=62, LLAVEDER=63, CORIZQ=64, CORDER=65, WHITESPACE=66, L_COMMENT=67;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_list_Funciones = 2, RULE_funcion = 3, 
		RULE_t_access = 4, RULE_params_declar = 5, RULE_declar_parametros = 6, 
		RULE_fn_main = 7, RULE_instruccion = 8, RULE_instruccion_only = 9, RULE_newStruct = 10, 
		RULE_listdecStruct = 11, RULE_callFunction = 12, RULE_returnFun = 13, 
		RULE_printconsola = 14, RULE_loopB = 15, RULE_lWhile = 16, RULE_lForin = 17, 
		RULE_lBreak = 18, RULE_lContinue = 19, RULE_listParams = 20, RULE_declaracion = 21, 
		RULE_is_mut = 22, RULE_array_type = 23, RULE_asignacion = 24, RULE_l_AccessStruct = 25, 
		RULE_list_index = 26, RULE_index_array = 27, RULE_if_sent = 28, RULE_if_exp = 29, 
		RULE_list_elseif = 30, RULE_list_elseif_exp = 31, RULE_else_if = 32, RULE_else_if_exp = 33, 
		RULE_match_sent = 34, RULE_match_brazos = 35, RULE_match_brazos_exp = 36, 
		RULE_matchbrazo = 37, RULE_matchbrazo_exp = 38, RULE_listaOpciones = 39, 
		RULE_bloque_inst = 40, RULE_bloque_exp = 41, RULE_tipos_var = 42, RULE_expression = 43, 
		RULE_expr_arit = 44, RULE_casteo = 45, RULE_tipo_cast = 46, RULE_l_StructExp = 47, 
		RULE_primitivo = 48, RULE_listIDArray = 49, RULE_strings = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "list_Funciones", "funcion", "t_access", "params_declar", 
			"declar_parametros", "fn_main", "instruccion", "instruccion_only", "newStruct", 
			"listdecStruct", "callFunction", "returnFun", "printconsola", "loopB", 
			"lWhile", "lForin", "lBreak", "lContinue", "listParams", "declaracion", 
			"is_mut", "array_type", "asignacion", "l_AccessStruct", "list_index", 
			"index_array", "if_sent", "if_exp", "list_elseif", "list_elseif_exp", 
			"else_if", "else_if_exp", "match_sent", "match_brazos", "match_brazos_exp", 
			"matchbrazo", "matchbrazo_exp", "listaOpciones", "bloque_inst", "bloque_exp", 
			"tipos_var", "expression", "expr_arit", "casteo", "tipo_cast", "l_StructExp", 
			"primitivo", "listIDArray", "strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'while'", "'loop'", "'for'", "'in'", "'break'", "'continue'", 
			"'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", 
			"'mut'", "'struct'", "'.to_string()'", "'.to_owned()'", "'pub'", "'->'", 
			"'fn'", "'main'", "'return'", "'&mut'", null, null, null, "'.'", "','", 
			"';'", "'::'", "':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", 
			"'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", 
			"'!'", "'&'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "WHILE", "LOOP", "FOR", "IN", "BREAK", "CONTINUE", "MATCH", 
			"MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", 
			"TO_STRING", "TO_OWNED", "PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", 
			"REF", "NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", 
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
			setState(102);
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
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_CON) | (1L << IF) | (1L << WHILE) | (1L << LOOP) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << MATCH) | (1L << LET) | (1L << STRUCT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(105);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(110);
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
			setState(114);
			((List_FuncionesContext)_localctx).funcion = funcion();
			 _localctx.lista.Add( ((List_FuncionesContext)_localctx).funcion.instr ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
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
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
					((List_FuncionesContext)_localctx).funcion = funcion();

					                                                    ((List_FuncionesContext)_localctx).lisfun.lista.Add( ((List_FuncionesContext)_localctx).funcion.instr)
					                                                    _localctx.lista =  ((List_FuncionesContext)_localctx).lisfun.lista
					                                                  
					}
					} 
				}
				setState(125);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((FuncionContext)_localctx).fn_main = fn_main();
				_localctx.instr =  ((FuncionContext)_localctx).fn_main.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				t_access();
				setState(130);
				match(FN);
				setState(131);
				((FuncionContext)_localctx).ID = match(ID);
				setState(132);
				match(PARIZQ);
				setState(133);
				match(PARDER);
				setState(134);
				match(TYPETHEN);
				setState(135);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(136);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, ((FuncionContext)_localctx).tipos_var.tipo, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				t_access();
				setState(140);
				match(FN);
				setState(141);
				((FuncionContext)_localctx).ID = match(ID);
				setState(142);
				match(PARIZQ);
				setState(143);
				match(PARDER);
				setState(144);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				t_access();
				setState(148);
				match(FN);
				setState(149);
				((FuncionContext)_localctx).ID = match(ID);
				setState(150);
				match(PARIZQ);
				setState(151);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(152);
				match(PARDER);
				setState(153);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),((FuncionContext)_localctx).params_declar.lista,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0) )
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				t_access();
				setState(157);
				match(FN);
				setState(158);
				((FuncionContext)_localctx).ID = match(ID);
				setState(159);
				match(PARIZQ);
				setState(160);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(161);
				match(PARDER);
				setState(162);
				match(TYPETHEN);
				setState(163);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(164);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
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
			setState(175);
			((Params_declarContext)_localctx).declar_parametros = declar_parametros();
			   _localctx.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec) 
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
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
					setState(178);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(179);
					match(COMA);
					setState(180);
					((Params_declarContext)_localctx).declar_parametros = declar_parametros();

					                                                                      ((Params_declarContext)_localctx).listdec.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec)
					                                                                      _localctx.lista =  ((Params_declarContext)_localctx).listdec.lista 
					}
					} 
				}
				setState(187);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				((Declar_parametrosContext)_localctx).isMut = is_mut();
				setState(189);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(190);
				match(DPUNTO2);
				setState(191);
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
				setState(194);
				((Declar_parametrosContext)_localctx).isMut = is_mut();
				setState(195);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(196);
				match(DPUNTO2);
				setState(197);
				match(REF);
				setState(198);
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
			setState(203);
			match(FN);
			setState(204);
			((Fn_mainContext)_localctx).MAIN = match(MAIN);
			setState(205);
			match(PARIZQ);
			setState(206);
			match(PARDER);
			setState(207);
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
		enterRule(_localctx, 16, RULE_instruccion);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((InstruccionContext)_localctx).printconsola = printconsola();
				setState(211);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(215);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(219);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				((InstruccionContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((InstruccionContext)_localctx).if_sent.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				((InstruccionContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((InstruccionContext)_localctx).match_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				((InstruccionContext)_localctx).loopB = loopB();
				 _localctx.instr = ((InstruccionContext)_localctx).loopB.lop 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(231);
				((InstruccionContext)_localctx).lWhile = lWhile();
				 _localctx.instr = ((InstruccionContext)_localctx).lWhile.lwh 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				((InstruccionContext)_localctx).lForin = lForin();
				 _localctx.instr = ((InstruccionContext)_localctx).lForin.lfor 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(237);
				((InstruccionContext)_localctx).lBreak = lBreak();
				setState(238);
				match(PTCOMA);
				 _localctx.instr = ((InstruccionContext)_localctx).lBreak.br 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(241);
				((InstruccionContext)_localctx).lContinue = lContinue();
				setState(242);
				match(PTCOMA);
				 _localctx.instr = ((InstruccionContext)_localctx).lContinue.cn 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(245);
				((InstruccionContext)_localctx).newStruct = newStruct();
				_localctx.instr = ((InstruccionContext)_localctx).newStruct.str
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(248);
				((InstruccionContext)_localctx).callFunction = callFunction();
				setState(249);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).callFunction.instr
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(252);
				((InstruccionContext)_localctx).returnFun = returnFun();
				setState(253);
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
		enterRule(_localctx, 18, RULE_instruccion_only);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				((Instruccion_onlyContext)_localctx).printconsola = printconsola();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((Instruccion_onlyContext)_localctx).declaracion = declaracion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				((Instruccion_onlyContext)_localctx).asignacion = asignacion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				((Instruccion_onlyContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).if_sent.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				((Instruccion_onlyContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).match_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				((Instruccion_onlyContext)_localctx).loopB = loopB();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).loopB.lop 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				((Instruccion_onlyContext)_localctx).lWhile = lWhile();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lWhile.lwh 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(279);
				((Instruccion_onlyContext)_localctx).lForin = lForin();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lForin.lfor 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(282);
				((Instruccion_onlyContext)_localctx).lBreak = lBreak();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lBreak.br 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(285);
				((Instruccion_onlyContext)_localctx).lContinue = lContinue();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lContinue.cn 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(288);
				((Instruccion_onlyContext)_localctx).callFunction = callFunction();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).callFunction.instr
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(291);
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
			setState(296);
			((NewStructContext)_localctx).STRUCT = match(STRUCT);
			setState(297);
			((NewStructContext)_localctx).ID = match(ID);
			setState(298);
			match(LLAVEIZQ);
			setState(299);
			((NewStructContext)_localctx).listdecStruct = listdecStruct(0);
			setState(300);
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
			setState(304);
			((ListdecStructContext)_localctx).ID = match(ID);
			setState(305);
			match(DPUNTO2);
			setState(306);
			((ListdecStructContext)_localctx).tipos_var = tipos_var();

			                    Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).ID!=null?((ListdecStructContext)_localctx).ID.getText():null), ((ListdecStructContext)_localctx).tipos_var.tipo)
			                    ((ListdecStructContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add(Str_atrib);
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
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
					setState(309);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(310);
					match(COMA);
					setState(311);
					((ListdecStructContext)_localctx).ID = match(ID);
					setState(312);
					match(DPUNTO2);
					setState(313);
					((ListdecStructContext)_localctx).tipos_var = tipos_var();

					                                                  Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).ID!=null?((ListdecStructContext)_localctx).ID.getText():null), ((ListdecStructContext)_localctx).tipos_var.tipo)
					                                                  ((ListdecStructContext)_localctx).list.l.Add(Str_atrib);
					                                                  ((ListdecStructContext)_localctx).l =  ((ListdecStructContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(320);
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
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(322);
				match(PARIZQ);
				setState(323);
				match(PARDER);

				                        _localctx.instr = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.p = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(326);
				match(PARIZQ);
				setState(327);
				((CallFunctionContext)_localctx).listParams = listParams(0);
				setState(328);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(RETURN);
				 _localctx.instr = instructionExpre.NewReturn(interfaces.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(RETURN);
				setState(336);
				((ReturnFunContext)_localctx).expression = expression(0);
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
			setState(341);
			((PrintconsolaContext)_localctx).PRINT_CON = match(PRINT_CON);
			setState(342);
			match(PARIZQ);
			setState(343);
			((PrintconsolaContext)_localctx).listParams = listParams(0);
			setState(344);
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
		enterRule(_localctx, 30, RULE_loopB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			((LoopBContext)_localctx).LOOP = match(LOOP);
			setState(348);
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
		enterRule(_localctx, 32, RULE_lWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			((LWhileContext)_localctx).WHILE = match(WHILE);
			setState(352);
			((LWhileContext)_localctx).expression = expression(0);
			setState(353);
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
		enterRule(_localctx, 34, RULE_lForin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			((LForinContext)_localctx).FOR = match(FOR);
			setState(357);
			((LForinContext)_localctx).ID = match(ID);
			setState(358);
			match(IN);
			setState(359);
			((LForinContext)_localctx).expression = expression(0);
			setState(360);
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
		enterRule(_localctx, 36, RULE_lBreak);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				((LBreakContext)_localctx).BREAK = match(BREAK);
				 _localctx.br = instructionExpre.NewBreak(nil, (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getLine():0), (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				((LBreakContext)_localctx).BREAK = match(BREAK);
				setState(366);
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
		enterRule(_localctx, 38, RULE_lContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_listParams, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(375);
			((ListParamsContext)_localctx).expression = expression(0);
			_localctx.l_e.Add(((ListParamsContext)_localctx).expression.p)
			}
			_ctx.stop = _input.LT(-1);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
					setState(378);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(379);
					match(COMA);
					setState(380);
					((ListParamsContext)_localctx).expression = expression(0);

					                                              ((ListParamsContext)_localctx).list.l_e.Add(((ListParamsContext)_localctx).expression.p)
					                                              _localctx.l_e = ((ListParamsContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(387);
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
		enterRule(_localctx, 42, RULE_declaracion);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(LET);
				setState(389);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(390);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(391);
				match(DPUNTO2);
				setState(392);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(393);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(394);
				((DeclaracionContext)_localctx).expression = expression(0);

				                        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(LET);
				setState(398);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(399);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(400);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(401);
				((DeclaracionContext)_localctx).expression = expression(0);

				                      _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(LET);
				setState(405);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(406);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(407);
				match(DPUNTO2);
				setState(408);
				((DeclaracionContext)_localctx).array_type = array_type();
				setState(409);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(410);
				((DeclaracionContext)_localctx).expression = expression(0);

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
		enterRule(_localctx, 44, RULE_is_mut);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
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
		enterRule(_localctx, 46, RULE_array_type);

		    _localctx.ty = arrayList.New()

		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(421);
				((Array_typeContext)_localctx).array_type = array_type();
				setState(422);
				match(PTCOMA);
				setState(423);
				((Array_typeContext)_localctx).expression = expression(0);
				setState(424);
				match(CORDER);

				                                        nType := interfaces.NewArrayType(interfaces.ARRAY, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                        ((Array_typeContext)_localctx).array_type.ty.Add(nType)
				                                        _localctx.ty = ((Array_typeContext)_localctx).array_type.ty
				                                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(428);
				((Array_typeContext)_localctx).tipos_var = tipos_var();
				setState(429);
				match(PTCOMA);
				setState(430);
				((Array_typeContext)_localctx).expression = expression(0);
				setState(431);
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
		enterRule(_localctx, 48, RULE_asignacion);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				((AsignacionContext)_localctx).id = match(ID);
				setState(437);
				match(ASIGNACION);
				setState(438);
				((AsignacionContext)_localctx).expression = expression(0);
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, nil, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				((AsignacionContext)_localctx).id = match(ID);
				setState(442);
				((AsignacionContext)_localctx).list_index = list_index(0);
				setState(443);
				match(ASIGNACION);
				setState(444);
				((AsignacionContext)_localctx).expression = expression(0);
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, ((AsignacionContext)_localctx).list_index.lista, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				((AsignacionContext)_localctx).l_AccessStruct = l_AccessStruct(0);
				setState(448);
				match(ASIGNACION);
				setState(449);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_l_AccessStruct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(455);
			((L_AccessStructContext)_localctx).ID = match(ID);

			            _localctx.l = arrayList.New()
			            _localctx.l.Add((((L_AccessStructContext)_localctx).ID!=null?((L_AccessStructContext)_localctx).ID.getText():null))

			}
			_ctx.stop = _input.LT(-1);
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
					setState(458);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(459);
					match(PUNTO);
					setState(460);
					((L_AccessStructContext)_localctx).ID = match(ID);

					                                             ((L_AccessStructContext)_localctx).list.l.Add((((L_AccessStructContext)_localctx).ID!=null?((L_AccessStructContext)_localctx).ID.getText():null))
					                                             _localctx.l = ((L_AccessStructContext)_localctx).list.l
					                                            
					}
					} 
				}
				setState(466);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_list_index, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(468);
			((List_indexContext)_localctx).index_array = index_array();
			_localctx.lista.Add(((List_indexContext)_localctx).index_array.index)
			}
			_ctx.stop = _input.LT(-1);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
					setState(471);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(472);
					((List_indexContext)_localctx).index_array = index_array();

					                                                ((List_indexContext)_localctx).listi.lista.Add(((List_indexContext)_localctx).index_array.index)
					                                                _localctx.lista = ((List_indexContext)_localctx).listi.lista
					                                            
					}
					} 
				}
				setState(479);
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
		enterRule(_localctx, 54, RULE_index_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(CORIZQ);
			setState(481);
			((Index_arrayContext)_localctx).expression = expression(0);
			setState(482);
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
		enterRule(_localctx, 56, RULE_if_sent);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				((If_sentContext)_localctx).IF = match(IF);
				setState(486);
				((If_sentContext)_localctx).expression = expression(0);
				setState(487);
				((If_sentContext)_localctx).bloque_inst = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p, ((If_sentContext)_localctx).bloque_inst.l, nil,nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				((If_sentContext)_localctx).IF = match(IF);
				setState(491);
				((If_sentContext)_localctx).expression = expression(0);
				setState(492);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(493);
				match(ELSE);
				setState(494);
				((If_sentContext)_localctx).belse = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,nil,((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				((If_sentContext)_localctx).IF = match(IF);
				setState(498);
				((If_sentContext)_localctx).expression = expression(0);
				setState(499);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(500);
				((If_sentContext)_localctx).list_elseif = list_elseif();

				        _localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,((If_sentContext)_localctx).list_elseif.lista, nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(503);
				((If_sentContext)_localctx).IF = match(IF);
				setState(504);
				((If_sentContext)_localctx).expression = expression(0);
				setState(505);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(506);
				((If_sentContext)_localctx).list_elseif = list_elseif();
				setState(507);
				match(ELSE);
				setState(508);
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
		enterRule(_localctx, 58, RULE_if_exp);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				((If_expContext)_localctx).IF = match(IF);
				setState(514);
				((If_expContext)_localctx).expression = expression(0);
				setState(515);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(516);
				match(ELSE);
				setState(517);
				((If_expContext)_localctx).belse_e = bloque_exp();
				_localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p, nil ,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, nil, ((If_expContext)_localctx).belse_e.p )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				((If_expContext)_localctx).IF = match(IF);
				setState(521);
				((If_expContext)_localctx).expression = expression(0);
				setState(522);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(523);
				((If_expContext)_localctx).list_elseif_exp = list_elseif_exp();
				setState(524);
				match(ELSE);
				setState(525);
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
		enterRule(_localctx, 60, RULE_list_elseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(530);
					((List_elseifContext)_localctx).else_if = else_if();
					((List_elseifContext)_localctx).list.add(((List_elseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(533); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 62, RULE_list_elseif_exp);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(537);
					((List_elseif_expContext)_localctx).else_if_exp = else_if_exp();
					((List_elseif_expContext)_localctx).list.add(((List_elseif_expContext)_localctx).else_if_exp);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(540); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 64, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			((Else_ifContext)_localctx).ELSE = match(ELSE);
			setState(545);
			match(IF);
			setState(546);
			((Else_ifContext)_localctx).expression = expression(0);
			setState(547);
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
		enterRule(_localctx, 66, RULE_else_if_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			((Else_if_expContext)_localctx).ELSE = match(ELSE);
			setState(551);
			match(IF);
			setState(552);
			((Else_if_expContext)_localctx).expression = expression(0);
			setState(553);
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
		enterRule(_localctx, 68, RULE_match_sent);
		int _la;
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(557);
				((Match_sentContext)_localctx).expression = expression(0);
				setState(558);
				match(LLAVEIZQ);
				setState(559);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(560);
				match(LLAVEDER);

				                        _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(564);
				((Match_sentContext)_localctx).expression = expression(0);
				setState(565);
				match(LLAVEIZQ);
				setState(566);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(567);
				match(GUIONB);
				setState(568);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(569);
				((Match_sentContext)_localctx).bloque_inst = bloque_inst();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(570);
					match(COMA);
					}
				}

				setState(573);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, ((Match_sentContext)_localctx).bloque_inst.l, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(577);
				((Match_sentContext)_localctx).expression = expression(0);
				setState(578);
				match(LLAVEIZQ);
				setState(579);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(580);
				match(GUIONB);
				setState(581);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(582);
				((Match_sentContext)_localctx).instruccion_only = instruccion_only();
				setState(583);
				match(COMA);
				setState(584);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil,  ((Match_sentContext)_localctx).instruccion_only.instr,  (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
				      
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(588);
				((Match_sentContext)_localctx).exp = expression(0);
				setState(589);
				match(LLAVEIZQ);
				setState(590);
				((Match_sentContext)_localctx).brazosexp = match_brazos_exp(0);
				setState(591);
				match(LLAVEDER);

				                        _localctx.p = instructionExpre.NewMatch(((Match_sentContext)_localctx).exp.p, ((Match_sentContext)_localctx).brazosexp.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, true )
				      
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(595);
				((Match_sentContext)_localctx).exp = expression(0);
				setState(596);
				match(LLAVEIZQ);
				setState(597);
				((Match_sentContext)_localctx).brazosexp = match_brazos_exp(0);
				setState(598);
				match(GUIONB);
				setState(599);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(600);
				((Match_sentContext)_localctx).exp_ = expression(0);
				setState(601);
				match(COMA);
				setState(602);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_match_brazos, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(608);
			((Match_brazosContext)_localctx).matchbrazo = matchbrazo();
			_localctx.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
					setState(611);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(612);
					((Match_brazosContext)_localctx).matchbrazo = matchbrazo();

					                                              ((Match_brazosContext)_localctx).listb.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
					                                              _localctx.l_brazos = ((Match_brazosContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(619);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_match_brazos_exp, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(621);
			((Match_brazos_expContext)_localctx).matchbrazo_exp = matchbrazo_exp();
			_localctx.l_brazos.Add(((Match_brazos_expContext)_localctx).matchbrazo_exp.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
					setState(624);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(625);
					((Match_brazos_expContext)_localctx).matchbrazo_exp = matchbrazo_exp();

					                                              ((Match_brazos_expContext)_localctx).listb.l_brazos.Add(((Match_brazos_expContext)_localctx).matchbrazo_exp.brazo)
					                                              _localctx.l_brazos = ((Match_brazos_expContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 74, RULE_matchbrazo);
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(634);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(635);
				((MatchbrazoContext)_localctx).bloque_inst = bloque_inst();
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(636);
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
				setState(641);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(642);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(643);
				((MatchbrazoContext)_localctx).instruccion_only = instruccion_only();
				setState(644);
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
		enterRule(_localctx, 76, RULE_matchbrazo_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			((Matchbrazo_expContext)_localctx).listaOpciones = listaOpciones(0);
			setState(650);
			((Matchbrazo_expContext)_localctx).th = match(MTHEN);
			setState(651);
			((Matchbrazo_expContext)_localctx).expression = expression(0);
			setState(652);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_listaOpciones, _p);

		    _localctx.lisop = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(656);
			((ListaOpcionesContext)_localctx).primitivo = primitivo();

			                    _localctx.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
			                  
			}
			_ctx.stop = _input.LT(-1);
			setState(666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
					setState(659);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(660);
					match(MTOR);
					setState(661);
					((ListaOpcionesContext)_localctx).primitivo = primitivo();

					                                                      ((ListaOpcionesContext)_localctx).list.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
					                                                      _localctx.lisop =  ((ListaOpcionesContext)_localctx).list.lisop
					                                                    
					}
					} 
				}
				setState(668);
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
		enterRule(_localctx, 80, RULE_bloque_inst);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				match(LLAVEIZQ);
				setState(670);
				((Bloque_instContext)_localctx).instrucciones = instrucciones();
				setState(671);
				match(LLAVEDER);
				_localctx.l = ((Bloque_instContext)_localctx).instrucciones.l 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(LLAVEIZQ);
				setState(675);
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
		enterRule(_localctx, 82, RULE_bloque_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(LLAVEIZQ);
			setState(680);
			((Bloque_expContext)_localctx).expression = expression(0);
			setState(681);
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
		enterRule(_localctx, 84, RULE_tipos_var);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				match(T_NUMBER);
				_localctx.tipo = interfaces.INTEGER
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				match(T_STRING);
				_localctx.tipo = interfaces.STRING
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				match(T_FLOAT);
				_localctx.tipo = interfaces.FLOAT
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(690);
				match(T_BOOL);
				_localctx.tipo = interfaces.BOOLEAN
				}
				break;
			case T_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(692);
				match(T_STR);
				_localctx.tipo = interfaces.STR
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(694);
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
		public ExpressionContext e_fin;
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public List<TerminalNode> PUNTO() { return getTokens(RustPar.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(RustPar.PUNTO, i);
		}
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(699);
			((ExpressionContext)_localctx).expr_arit = expr_arit(0);
			_localctx.p = ((ExpressionContext)_localctx).expr_arit.p
			}
			_ctx.stop = _input.LT(-1);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
					setState(702);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(703);
					match(PUNTO);
					setState(704);
					match(PUNTO);
					setState(705);
					((ExpressionContext)_localctx).e_fin = expression(2);
					 _localctx.p = expresion.NewRangeF(((ExpressionContext)_localctx).e_ini.p, ((ExpressionContext)_localctx).e_fin.p, (((ExpressionContext)_localctx).e_ini!=null?(((ExpressionContext)_localctx).e_ini.start):null).GetLine(),(((ExpressionContext)_localctx).e_ini!=null?(((ExpressionContext)_localctx).e_ini.start):null).GetColumn() ) 
					}
					} 
				}
				setState(712);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(714);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(715);
				((Expr_aritContext)_localctx).opU = expr_arit(19);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(718);
				match(T_NUMBER);
				setState(719);
				match(DOSPUNTO);
				setState(720);
				((Expr_aritContext)_localctx).op = match(POW);
				setState(721);
				match(PARIZQ);
				setState(722);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(723);
				match(COMA);
				setState(724);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(725);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 3:
				{
				setState(728);
				match(T_FLOAT);
				setState(729);
				match(DOSPUNTO);
				setState(730);
				((Expr_aritContext)_localctx).op = match(POWF);
				setState(731);
				match(PARIZQ);
				setState(732);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(733);
				match(COMA);
				setState(734);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(735);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 4:
				{
				setState(738);
				((Expr_aritContext)_localctx).op = match(NOT);
				setState(739);
				((Expr_aritContext)_localctx).opU = expr_arit(13);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"!",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 5:
				{
				setState(742);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(743);
				((Expr_aritContext)_localctx).exp = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(744);
				match(PTCOMA);
				setState(745);
				((Expr_aritContext)_localctx).tam = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(746);
				match(CORDER);
				 _localctx.p = expresion.NewArray(nil, ((Expr_aritContext)_localctx).exp.p, ((Expr_aritContext)_localctx).tam.p, 2, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 6:
				{
				setState(749);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(750);
				((Expr_aritContext)_localctx).listParams = listParams(0);
				setState(751);
				match(CORDER);
				 _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listParams.l_e, nil, nil, 1, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 7:
				{
				setState(754);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(755);
				match(LLAVEIZQ);
				setState(756);
				((Expr_aritContext)_localctx).l_StructExp = l_StructExp(0);
				setState(757);
				match(LLAVEDER);
				 _localctx.p = instructionExpre.NewStructExpre((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).l_StructExp.l, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0) ) 
				}
				break;
			case 8:
				{
				setState(760);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 9:
				{
				setState(763);
				match(PARIZQ);
				setState(764);
				((Expr_aritContext)_localctx).expression = expression(0);
				setState(765);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 10:
				{
				setState(768);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			case 11:
				{
				setState(771);
				((Expr_aritContext)_localctx).if_exp = if_exp();
				_localctx.p = ((Expr_aritContext)_localctx).if_exp.p
				}
				break;
			case 12:
				{
				setState(774);
				((Expr_aritContext)_localctx).match_sent = match_sent();
				_localctx.p = ((Expr_aritContext)_localctx).match_sent.p
				}
				break;
			case 13:
				{
				setState(777);
				((Expr_aritContext)_localctx).loopB = loopB();
				 _localctx.p = ((Expr_aritContext)_localctx).loopB.p 
				}
				break;
			case 14:
				{
				setState(780);
				((Expr_aritContext)_localctx).callFunction = callFunction();
				_localctx.p = ((Expr_aritContext)_localctx).callFunction.p
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(810);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(785);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(786);
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
						setState(787);
						((Expr_aritContext)_localctx).opDe = expr_arit(17);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(790);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(791);
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
						setState(792);
						((Expr_aritContext)_localctx).opDe = expr_arit(16);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(795);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(796);
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
						setState(797);
						((Expr_aritContext)_localctx).opDe = expr_arit(15);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(800);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(801);
						((Expr_aritContext)_localctx).op = match(AND);
						setState(802);
						((Expr_aritContext)_localctx).opDe = expr_arit(13);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(805);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(806);
						((Expr_aritContext)_localctx).op = match(OR);
						setState(807);
						((Expr_aritContext)_localctx).opDe = expr_arit(12);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					}
					} 
				}
				setState(814);
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
		enterRule(_localctx, 90, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(816);
			((CasteoContext)_localctx).expression = expression(0);
			setState(817);
			match(AS);
			setState(818);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(819);
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
		enterRule(_localctx, 92, RULE_tipo_cast);
		try {
			setState(826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_l_StructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(829);
			((L_StructExpContext)_localctx).ID = match(ID);
			setState(830);
			match(DPUNTO2);
			setState(831);
			((L_StructExpContext)_localctx).expression = expression(0);

			                    Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
			                    ((L_StructExpContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add(Str_ep);
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
					setState(834);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(835);
					match(COMA);
					setState(836);
					((L_StructExpContext)_localctx).ID = match(ID);
					setState(837);
					match(DPUNTO2);
					setState(838);
					((L_StructExpContext)_localctx).expression = expression(0);

					                                                  Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
					                                                  ((L_StructExpContext)_localctx).list.l.Add(Str_ep);
					                                                  ((L_StructExpContext)_localctx).l =  ((L_StructExpContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 96, RULE_primitivo);
		try {
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
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
				setState(848);
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
				setState(850);
				((PrimitivoContext)_localctx).strings = strings();
				_localctx.p = ((PrimitivoContext)_localctx).strings.p
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(853);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(855);
				((PrimitivoContext)_localctx).FALSE = match(FALSE);
				 _localctx.p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).FALSE!=null?((PrimitivoContext)_localctx).FALSE.getLine():0), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(857);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_listIDArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(863);
			((ListIDArrayContext)_localctx).ID = match(ID);
			 
			      _localctx.p = expresion.NewIdentificador((((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getLine():0), localctx.(*ListIDArrayContext).Get_ID().GetColumn() )
			}
			_ctx.stop = _input.LT(-1);
			setState(878);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(876);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ListIDArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listIDArray);
						setState(866);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(867);
						((ListIDArrayContext)_localctx).CORIZQ = match(CORIZQ);
						setState(868);
						((ListIDArrayContext)_localctx).expression = expression(0);
						setState(869);
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
						setState(872);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(873);
						match(PUNTO);
						setState(874);
						((ListIDArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expresion.NewStructAccess(((ListIDArrayContext)_localctx).list.p, (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).list!=null?(((ListIDArrayContext)_localctx).list.start):null).GetLine(), (((ListIDArrayContext)_localctx).list!=null?(((ListIDArrayContext)_localctx).list.start):null).GetColumn() )  
						}
						break;
					}
					} 
				}
				setState(880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 100, RULE_strings);
		int _la;
		try {
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(881);
					match(AMP);
					}
					}
					setState(884); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AMP );
				setState(886);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(887);
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
				setState(891);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(892);
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
				setState(894);
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
		case 20:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 25:
			return l_AccessStruct_sempred((L_AccessStructContext)_localctx, predIndex);
		case 26:
			return list_index_sempred((List_indexContext)_localctx, predIndex);
		case 35:
			return match_brazos_sempred((Match_brazosContext)_localctx, predIndex);
		case 36:
			return match_brazos_exp_sempred((Match_brazos_expContext)_localctx, predIndex);
		case 39:
			return listaOpciones_sempred((ListaOpcionesContext)_localctx, predIndex);
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 44:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 47:
			return l_StructExp_sempred((L_StructExpContext)_localctx, predIndex);
		case 49:
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
	private boolean l_AccessStruct_sempred(L_AccessStructContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean list_index_sempred(List_indexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_sempred(Match_brazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_exp_sempred(Match_brazos_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaOpciones_sempred(ListaOpcionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean l_StructExp_sempred(L_StructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listIDArray_sempred(ListIDArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0385\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u00aa\n\5\3\6\3\6\3\6\5\6\u00af\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00cc\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0103\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0129\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u013f\n\r\f\r\16\r\u0142"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u014e\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0156\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0174\n\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0182\n\26\f\26"+
		"\16\26\u0185\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u01a0\n\27\3\30\3\30\3\30\5\30\u01a5\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01b5\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u01c7\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01d1"+
		"\n\33\f\33\16\33\u01d4\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7"+
		"\34\u01de\n\34\f\34\16\34\u01e1\13\34\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0202\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0213\n\37\3 \6 \u0216\n \r \16 \u0217\3 \3 \3!\6!\u021d\n"+
		"!\r!\16!\u021e\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u023e\n$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\5$\u0260\n$\3%\3%\3%\3%\3%\3%\3%\3%\7%\u026a\n%\f%\16%\u026d\13"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0277\n&\f&\16&\u027a\13&\3\'\3\'\3\'\3\'"+
		"\5\'\u0280\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u028a\n\'\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u029b\n)\f)\16)\u029e\13)\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u02a8\n*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\5,\u02bb\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u02c7\n-\f"+
		"-\16-\u02ca\13-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\5.\u0312\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u032d\n.\f.\16.\u0330\13.\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\5\60\u033d\n\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u034c\n\61\f\61"+
		"\16\61\u034f\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u035f\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u036f\n\63\f\63\16\63\u0372\13"+
		"\63\3\64\6\64\u0375\n\64\r\64\16\64\u0376\3\64\3\64\5\64\u037b\n\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\5\64\u0383\n\64\3\64\2\17\6\f\30*\64\66H"+
		"JPXZ`d\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdf\2\6\4\2\65\6699\3\2\678\3\2/\64\3\2\33\34\2"+
		"\u03b4\2h\3\2\2\2\4n\3\2\2\2\6s\3\2\2\2\b\u00a9\3\2\2\2\n\u00ae\3\2\2"+
		"\2\f\u00b0\3\2\2\2\16\u00cb\3\2\2\2\20\u00cd\3\2\2\2\22\u0102\3\2\2\2"+
		"\24\u0128\3\2\2\2\26\u012a\3\2\2\2\30\u0131\3\2\2\2\32\u014d\3\2\2\2\34"+
		"\u0155\3\2\2\2\36\u0157\3\2\2\2 \u015d\3\2\2\2\"\u0161\3\2\2\2$\u0166"+
		"\3\2\2\2&\u0173\3\2\2\2(\u0175\3\2\2\2*\u0178\3\2\2\2,\u019f\3\2\2\2."+
		"\u01a4\3\2\2\2\60\u01b4\3\2\2\2\62\u01c6\3\2\2\2\64\u01c8\3\2\2\2\66\u01d5"+
		"\3\2\2\28\u01e2\3\2\2\2:\u0201\3\2\2\2<\u0212\3\2\2\2>\u0215\3\2\2\2@"+
		"\u021c\3\2\2\2B\u0222\3\2\2\2D\u0228\3\2\2\2F\u025f\3\2\2\2H\u0261\3\2"+
		"\2\2J\u026e\3\2\2\2L\u0289\3\2\2\2N\u028b\3\2\2\2P\u0291\3\2\2\2R\u02a7"+
		"\3\2\2\2T\u02a9\3\2\2\2V\u02ba\3\2\2\2X\u02bc\3\2\2\2Z\u0311\3\2\2\2\\"+
		"\u0331\3\2\2\2^\u033c\3\2\2\2`\u033e\3\2\2\2b\u035e\3\2\2\2d\u0360\3\2"+
		"\2\2f\u0382\3\2\2\2hi\5\6\4\2ij\b\2\1\2j\3\3\2\2\2km\5\22\n\2lk\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\b\3\1\2r\5\3\2"+
		"\2\2st\b\4\1\2tu\5\b\5\2uv\b\4\1\2v}\3\2\2\2wx\f\4\2\2xy\5\b\5\2yz\b\4"+
		"\1\2z|\3\2\2\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\7\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\5\20\t\2\u0081\u0082\b\5\1\2\u0082\u00aa\3\2\2\2"+
		"\u0083\u0084\5\n\6\2\u0084\u0085\7\37\2\2\u0085\u0086\7.\2\2\u0086\u0087"+
		"\7>\2\2\u0087\u0088\7?\2\2\u0088\u0089\7\36\2\2\u0089\u008a\5V,\2\u008a"+
		"\u008b\5R*\2\u008b\u008c\b\5\1\2\u008c\u00aa\3\2\2\2\u008d\u008e\5\n\6"+
		"\2\u008e\u008f\7\37\2\2\u008f\u0090\7.\2\2\u0090\u0091\7>\2\2\u0091\u0092"+
		"\7?\2\2\u0092\u0093\5R*\2\u0093\u0094\b\5\1\2\u0094\u00aa\3\2\2\2\u0095"+
		"\u0096\5\n\6\2\u0096\u0097\7\37\2\2\u0097\u0098\7.\2\2\u0098\u0099\7>"+
		"\2\2\u0099\u009a\5\f\7\2\u009a\u009b\7?\2\2\u009b\u009c\5R*\2\u009c\u009d"+
		"\b\5\1\2\u009d\u00aa\3\2\2\2\u009e\u009f\5\n\6\2\u009f\u00a0\7\37\2\2"+
		"\u00a0\u00a1\7.\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4"+
		"\7?\2\2\u00a4\u00a5\7\36\2\2\u00a5\u00a6\5V,\2\u00a6\u00a7\5R*\2\u00a7"+
		"\u00a8\b\5\1\2\u00a8\u00aa\3\2\2\2\u00a9\u0080\3\2\2\2\u00a9\u0083\3\2"+
		"\2\2\u00a9\u008d\3\2\2\2\u00a9\u0095\3\2\2\2\u00a9\u009e\3\2\2\2\u00aa"+
		"\t\3\2\2\2\u00ab\u00ac\7\35\2\2\u00ac\u00af\b\6\1\2\u00ad\u00af\b\6\1"+
		"\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\13\3\2\2\2\u00b0\u00b1"+
		"\b\7\1\2\u00b1\u00b2\5\16\b\2\u00b2\u00b3\b\7\1\2\u00b3\u00bb\3\2\2\2"+
		"\u00b4\u00b5\f\4\2\2\u00b5\u00b6\7\'\2\2\u00b6\u00b7\5\16\b\2\u00b7\u00b8"+
		"\b\7\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00bb\3\2\2\2"+
		"\u00be\u00bf\5.\30\2\u00bf\u00c0\7.\2\2\u00c0\u00c1\7*\2\2\u00c1\u00c2"+
		"\5V,\2\u00c2\u00c3\b\b\1\2\u00c3\u00cc\3\2\2\2\u00c4\u00c5\5.\30\2\u00c5"+
		"\u00c6\7.\2\2\u00c6\u00c7\7*\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\5\60"+
		"\31\2\u00c9\u00ca\b\b\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00be\3\2\2\2\u00cb"+
		"\u00c4\3\2\2\2\u00cc\17\3\2\2\2\u00cd\u00ce\7\37\2\2\u00ce\u00cf\7 \2"+
		"\2\u00cf\u00d0\7>\2\2\u00d0\u00d1\7?\2\2\u00d1\u00d2\5R*\2\u00d2\u00d3"+
		"\b\t\1\2\u00d3\21\3\2\2\2\u00d4\u00d5\5\36\20\2\u00d5\u00d6\7(\2\2\u00d6"+
		"\u00d7\b\n\1\2\u00d7\u0103\3\2\2\2\u00d8\u00d9\5,\27\2\u00d9\u00da\7("+
		"\2\2\u00da\u00db\b\n\1\2\u00db\u0103\3\2\2\2\u00dc\u00dd\5\62\32\2\u00dd"+
		"\u00de\7(\2\2\u00de\u00df\b\n\1\2\u00df\u0103\3\2\2\2\u00e0\u00e1\5:\36"+
		"\2\u00e1\u00e2\b\n\1\2\u00e2\u0103\3\2\2\2\u00e3\u00e4\5F$\2\u00e4\u00e5"+
		"\b\n\1\2\u00e5\u0103\3\2\2\2\u00e6\u00e7\5 \21\2\u00e7\u00e8\b\n\1\2\u00e8"+
		"\u0103\3\2\2\2\u00e9\u00ea\5\"\22\2\u00ea\u00eb\b\n\1\2\u00eb\u0103\3"+
		"\2\2\2\u00ec\u00ed\5$\23\2\u00ed\u00ee\b\n\1\2\u00ee\u0103\3\2\2\2\u00ef"+
		"\u00f0\5&\24\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\b\n\1\2\u00f2\u0103\3\2"+
		"\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\7(\2\2\u00f5\u00f6\b\n\1\2\u00f6"+
		"\u0103\3\2\2\2\u00f7\u00f8\5\26\f\2\u00f8\u00f9\b\n\1\2\u00f9\u0103\3"+
		"\2\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc\7(\2\2\u00fc\u00fd\b\n\1\2\u00fd"+
		"\u0103\3\2\2\2\u00fe\u00ff\5\34\17\2\u00ff\u0100\7(\2\2\u0100\u0101\b"+
		"\n\1\2\u0101\u0103\3\2\2\2\u0102\u00d4\3\2\2\2\u0102\u00d8\3\2\2\2\u0102"+
		"\u00dc\3\2\2\2\u0102\u00e0\3\2\2\2\u0102\u00e3\3\2\2\2\u0102\u00e6\3\2"+
		"\2\2\u0102\u00e9\3\2\2\2\u0102\u00ec\3\2\2\2\u0102\u00ef\3\2\2\2\u0102"+
		"\u00f3\3\2\2\2\u0102\u00f7\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fe\3\2"+
		"\2\2\u0103\23\3\2\2\2\u0104\u0105\5\36\20\2\u0105\u0106\b\13\1\2\u0106"+
		"\u0129\3\2\2\2\u0107\u0108\5,\27\2\u0108\u0109\b\13\1\2\u0109\u0129\3"+
		"\2\2\2\u010a\u010b\5\62\32\2\u010b\u010c\b\13\1\2\u010c\u0129\3\2\2\2"+
		"\u010d\u010e\5:\36\2\u010e\u010f\b\13\1\2\u010f\u0129\3\2\2\2\u0110\u0111"+
		"\5F$\2\u0111\u0112\b\13\1\2\u0112\u0129\3\2\2\2\u0113\u0114\5 \21\2\u0114"+
		"\u0115\b\13\1\2\u0115\u0129\3\2\2\2\u0116\u0117\5\"\22\2\u0117\u0118\b"+
		"\13\1\2\u0118\u0129\3\2\2\2\u0119\u011a\5$\23\2\u011a\u011b\b\13\1\2\u011b"+
		"\u0129\3\2\2\2\u011c\u011d\5&\24\2\u011d\u011e\b\13\1\2\u011e\u0129\3"+
		"\2\2\2\u011f\u0120\5(\25\2\u0120\u0121\b\13\1\2\u0121\u0129\3\2\2\2\u0122"+
		"\u0123\5\32\16\2\u0123\u0124\b\13\1\2\u0124\u0129\3\2\2\2\u0125\u0126"+
		"\5\34\17\2\u0126\u0127\b\13\1\2\u0127\u0129\3\2\2\2\u0128\u0104\3\2\2"+
		"\2\u0128\u0107\3\2\2\2\u0128\u010a\3\2\2\2\u0128\u010d\3\2\2\2\u0128\u0110"+
		"\3\2\2\2\u0128\u0113\3\2\2\2\u0128\u0116\3\2\2\2\u0128\u0119\3\2\2\2\u0128"+
		"\u011c\3\2\2\2\u0128\u011f\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0125\3\2"+
		"\2\2\u0129\25\3\2\2\2\u012a\u012b\7\32\2\2\u012b\u012c\7.\2\2\u012c\u012d"+
		"\7@\2\2\u012d\u012e\5\30\r\2\u012e\u012f\7A\2\2\u012f\u0130\b\f\1\2\u0130"+
		"\27\3\2\2\2\u0131\u0132\b\r\1\2\u0132\u0133\7.\2\2\u0133\u0134\7*\2\2"+
		"\u0134\u0135\5V,\2\u0135\u0136\b\r\1\2\u0136\u0140\3\2\2\2\u0137\u0138"+
		"\f\4\2\2\u0138\u0139\7\'\2\2\u0139\u013a\7.\2\2\u013a\u013b\7*\2\2\u013b"+
		"\u013c\5V,\2\u013c\u013d\b\r\1\2\u013d\u013f\3\2\2\2\u013e\u0137\3\2\2"+
		"\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\31"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7.\2\2\u0144\u0145\7>\2\2\u0145"+
		"\u0146\7?\2\2\u0146\u014e\b\16\1\2\u0147\u0148\7.\2\2\u0148\u0149\7>\2"+
		"\2\u0149\u014a\5*\26\2\u014a\u014b\7?\2\2\u014b\u014c\b\16\1\2\u014c\u014e"+
		"\3\2\2\2\u014d\u0143\3\2\2\2\u014d\u0147\3\2\2\2\u014e\33\3\2\2\2\u014f"+
		"\u0150\7!\2\2\u0150\u0156\b\17\1\2\u0151\u0152\7!\2\2\u0152\u0153\5X-"+
		"\2\u0153\u0154\b\17\1\2\u0154\u0156\3\2\2\2\u0155\u014f\3\2\2\2\u0155"+
		"\u0151\3\2\2\2\u0156\35\3\2\2\2\u0157\u0158\7\3\2\2\u0158\u0159\7>\2\2"+
		"\u0159\u015a\5*\26\2\u015a\u015b\7?\2\2\u015b\u015c\b\20\1\2\u015c\37"+
		"\3\2\2\2\u015d\u015e\7\f\2\2\u015e\u015f\5R*\2\u015f\u0160\b\21\1\2\u0160"+
		"!\3\2\2\2\u0161\u0162\7\13\2\2\u0162\u0163\5X-\2\u0163\u0164\5R*\2\u0164"+
		"\u0165\b\22\1\2\u0165#\3\2\2\2\u0166\u0167\7\r\2\2\u0167\u0168\7.\2\2"+
		"\u0168\u0169\7\16\2\2\u0169\u016a\5X-\2\u016a\u016b\5R*\2\u016b\u016c"+
		"\b\23\1\2\u016c%\3\2\2\2\u016d\u016e\7\17\2\2\u016e\u0174\b\24\1\2\u016f"+
		"\u0170\7\17\2\2\u0170\u0171\5X-\2\u0171\u0172\b\24\1\2\u0172\u0174\3\2"+
		"\2\2\u0173\u016d\3\2\2\2\u0173\u016f\3\2\2\2\u0174\'\3\2\2\2\u0175\u0176"+
		"\7\20\2\2\u0176\u0177\b\25\1\2\u0177)\3\2\2\2\u0178\u0179\b\26\1\2\u0179"+
		"\u017a\5X-\2\u017a\u017b\b\26\1\2\u017b\u0183\3\2\2\2\u017c\u017d\f\4"+
		"\2\2\u017d\u017e\7\'\2\2\u017e\u017f\5X-\2\u017f\u0180\b\26\1\2\u0180"+
		"\u0182\3\2\2\2\u0181\u017c\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184+\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187"+
		"\7\30\2\2\u0187\u0188\5.\30\2\u0188\u0189\7.\2\2\u0189\u018a\7*\2\2\u018a"+
		"\u018b\5V,\2\u018b\u018c\7+\2\2\u018c\u018d\5X-\2\u018d\u018e\b\27\1\2"+
		"\u018e\u01a0\3\2\2\2\u018f\u0190\7\30\2\2\u0190\u0191\5.\30\2\u0191\u0192"+
		"\7.\2\2\u0192\u0193\7+\2\2\u0193\u0194\5X-\2\u0194\u0195\b\27\1\2\u0195"+
		"\u01a0\3\2\2\2\u0196\u0197\7\30\2\2\u0197\u0198\5.\30\2\u0198\u0199\7"+
		".\2\2\u0199\u019a\7*\2\2\u019a\u019b\5\60\31\2\u019b\u019c\7+\2\2\u019c"+
		"\u019d\5X-\2\u019d\u019e\b\27\1\2\u019e\u01a0\3\2\2\2\u019f\u0186\3\2"+
		"\2\2\u019f\u018f\3\2\2\2\u019f\u0196\3\2\2\2\u01a0-\3\2\2\2\u01a1\u01a2"+
		"\7\31\2\2\u01a2\u01a5\b\30\1\2\u01a3\u01a5\3\2\2\2\u01a4\u01a1\3\2\2\2"+
		"\u01a4\u01a3\3\2\2\2\u01a5/\3\2\2\2\u01a6\u01a7\7B\2\2\u01a7\u01a8\5\60"+
		"\31\2\u01a8\u01a9\7(\2\2\u01a9\u01aa\5X-\2\u01aa\u01ab\7C\2\2\u01ab\u01ac"+
		"\b\31\1\2\u01ac\u01b5\3\2\2\2\u01ad\u01ae\7B\2\2\u01ae\u01af\5V,\2\u01af"+
		"\u01b0\7(\2\2\u01b0\u01b1\5X-\2\u01b1\u01b2\7C\2\2\u01b2\u01b3\b\31\1"+
		"\2\u01b3\u01b5\3\2\2\2\u01b4\u01a6\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b5\61"+
		"\3\2\2\2\u01b6\u01b7\7.\2\2\u01b7\u01b8\7+\2\2\u01b8\u01b9\5X-\2\u01b9"+
		"\u01ba\b\32\1\2\u01ba\u01c7\3\2\2\2\u01bb\u01bc\7.\2\2\u01bc\u01bd\5\66"+
		"\34\2\u01bd\u01be\7+\2\2\u01be\u01bf\5X-\2\u01bf\u01c0\b\32\1\2\u01c0"+
		"\u01c7\3\2\2\2\u01c1\u01c2\5\64\33\2\u01c2\u01c3\7+\2\2\u01c3\u01c4\5"+
		"X-\2\u01c4\u01c5\b\32\1\2\u01c5\u01c7\3\2\2\2\u01c6\u01b6\3\2\2\2\u01c6"+
		"\u01bb\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c7\63\3\2\2\2\u01c8\u01c9\b\33\1"+
		"\2\u01c9\u01ca\7.\2\2\u01ca\u01cb\b\33\1\2\u01cb\u01d2\3\2\2\2\u01cc\u01cd"+
		"\f\4\2\2\u01cd\u01ce\7&\2\2\u01ce\u01cf\7.\2\2\u01cf\u01d1\b\33\1\2\u01d0"+
		"\u01cc\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\65\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\b\34\1\2\u01d6\u01d7"+
		"\58\35\2\u01d7\u01d8\b\34\1\2\u01d8\u01df\3\2\2\2\u01d9\u01da\f\4\2\2"+
		"\u01da\u01db\58\35\2\u01db\u01dc\b\34\1\2\u01dc\u01de\3\2\2\2\u01dd\u01d9"+
		"\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\67\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7B\2\2\u01e3\u01e4\5X-\2\u01e4"+
		"\u01e5\7C\2\2\u01e5\u01e6\b\35\1\2\u01e69\3\2\2\2\u01e7\u01e8\7\t\2\2"+
		"\u01e8\u01e9\5X-\2\u01e9\u01ea\5R*\2\u01ea\u01eb\b\36\1\2\u01eb\u0202"+
		"\3\2\2\2\u01ec\u01ed\7\t\2\2\u01ed\u01ee\5X-\2\u01ee\u01ef\5R*\2\u01ef"+
		"\u01f0\7\n\2\2\u01f0\u01f1\5R*\2\u01f1\u01f2\b\36\1\2\u01f2\u0202\3\2"+
		"\2\2\u01f3\u01f4\7\t\2\2\u01f4\u01f5\5X-\2\u01f5\u01f6\5R*\2\u01f6\u01f7"+
		"\5> \2\u01f7\u01f8\b\36\1\2\u01f8\u0202\3\2\2\2\u01f9\u01fa\7\t\2\2\u01fa"+
		"\u01fb\5X-\2\u01fb\u01fc\5R*\2\u01fc\u01fd\5> \2\u01fd\u01fe\7\n\2\2\u01fe"+
		"\u01ff\5R*\2\u01ff\u0200\b\36\1\2\u0200\u0202\3\2\2\2\u0201\u01e7\3\2"+
		"\2\2\u0201\u01ec\3\2\2\2\u0201\u01f3\3\2\2\2\u0201\u01f9\3\2\2\2\u0202"+
		";\3\2\2\2\u0203\u0204\7\t\2\2\u0204\u0205\5X-\2\u0205\u0206\5T+\2\u0206"+
		"\u0207\7\n\2\2\u0207\u0208\5T+\2\u0208\u0209\b\37\1\2\u0209\u0213\3\2"+
		"\2\2\u020a\u020b\7\t\2\2\u020b\u020c\5X-\2\u020c\u020d\5T+\2\u020d\u020e"+
		"\5@!\2\u020e\u020f\7\n\2\2\u020f\u0210\5T+\2\u0210\u0211\b\37\1\2\u0211"+
		"\u0213\3\2\2\2\u0212\u0203\3\2\2\2\u0212\u020a\3\2\2\2\u0213=\3\2\2\2"+
		"\u0214\u0216\5B\"\2\u0215\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\b \1\2\u021a"+
		"?\3\2\2\2\u021b\u021d\5D#\2\u021c\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\b!"+
		"\1\2\u0221A\3\2\2\2\u0222\u0223\7\n\2\2\u0223\u0224\7\t\2\2\u0224\u0225"+
		"\5X-\2\u0225\u0226\5R*\2\u0226\u0227\b\"\1\2\u0227C\3\2\2\2\u0228\u0229"+
		"\7\n\2\2\u0229\u022a\7\t\2\2\u022a\u022b\5X-\2\u022b\u022c\5T+\2\u022c"+
		"\u022d\b#\1\2\u022dE\3\2\2\2\u022e\u022f\7\21\2\2\u022f\u0230\5X-\2\u0230"+
		"\u0231\7@\2\2\u0231\u0232\5H%\2\u0232\u0233\7A\2\2\u0233\u0234\b$\1\2"+
		"\u0234\u0260\3\2\2\2\u0235\u0236\7\21\2\2\u0236\u0237\5X-\2\u0237\u0238"+
		"\7@\2\2\u0238\u0239\5H%\2\u0239\u023a\7-\2\2\u023a\u023b\7,\2\2\u023b"+
		"\u023d\5R*\2\u023c\u023e\7\'\2\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2"+
		"\2\u023e\u023f\3\2\2\2\u023f\u0240\7A\2\2\u0240\u0241\b$\1\2\u0241\u0260"+
		"\3\2\2\2\u0242\u0243\7\21\2\2\u0243\u0244\5X-\2\u0244\u0245\7@\2\2\u0245"+
		"\u0246\5H%\2\u0246\u0247\7-\2\2\u0247\u0248\7,\2\2\u0248\u0249\5\24\13"+
		"\2\u0249\u024a\7\'\2\2\u024a\u024b\7A\2\2\u024b\u024c\b$\1\2\u024c\u0260"+
		"\3\2\2\2\u024d\u024e\7\21\2\2\u024e\u024f\5X-\2\u024f\u0250\7@\2\2\u0250"+
		"\u0251\5J&\2\u0251\u0252\7A\2\2\u0252\u0253\b$\1\2\u0253\u0260\3\2\2\2"+
		"\u0254\u0255\7\21\2\2\u0255\u0256\5X-\2\u0256\u0257\7@\2\2\u0257\u0258"+
		"\5J&\2\u0258\u0259\7-\2\2\u0259\u025a\7,\2\2\u025a\u025b\5X-\2\u025b\u025c"+
		"\7\'\2\2\u025c\u025d\7A\2\2\u025d\u025e\b$\1\2\u025e\u0260\3\2\2\2\u025f"+
		"\u022e\3\2\2\2\u025f\u0235\3\2\2\2\u025f\u0242\3\2\2\2\u025f\u024d\3\2"+
		"\2\2\u025f\u0254\3\2\2\2\u0260G\3\2\2\2\u0261\u0262\b%\1\2\u0262\u0263"+
		"\5L\'\2\u0263\u0264\b%\1\2\u0264\u026b\3\2\2\2\u0265\u0266\f\4\2\2\u0266"+
		"\u0267\5L\'\2\u0267\u0268\b%\1\2\u0268\u026a\3\2\2\2\u0269\u0265\3\2\2"+
		"\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026cI"+
		"\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\b&\1\2\u026f\u0270\5N(\2\u0270"+
		"\u0271\b&\1\2\u0271\u0278\3\2\2\2\u0272\u0273\f\4\2\2\u0273\u0274\5N("+
		"\2\u0274\u0275\b&\1\2\u0275\u0277\3\2\2\2\u0276\u0272\3\2\2\2\u0277\u027a"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279K\3\2\2\2\u027a"+
		"\u0278\3\2\2\2\u027b\u027c\5P)\2\u027c\u027d\7,\2\2\u027d\u027f\5R*\2"+
		"\u027e\u0280\7\'\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281\u0282\b\'\1\2\u0282\u028a\3\2\2\2\u0283\u0284\5P)\2\u0284"+
		"\u0285\7,\2\2\u0285\u0286\5\24\13\2\u0286\u0287\7\'\2\2\u0287\u0288\b"+
		"\'\1\2\u0288\u028a\3\2\2\2\u0289\u027b\3\2\2\2\u0289\u0283\3\2\2\2\u028a"+
		"M\3\2\2\2\u028b\u028c\5P)\2\u028c\u028d\7,\2\2\u028d\u028e\5X-\2\u028e"+
		"\u028f\7\'\2\2\u028f\u0290\b(\1\2\u0290O\3\2\2\2\u0291\u0292\b)\1\2\u0292"+
		"\u0293\5b\62\2\u0293\u0294\b)\1\2\u0294\u029c\3\2\2\2\u0295\u0296\f\4"+
		"\2\2\u0296\u0297\7\22\2\2\u0297\u0298\5b\62\2\u0298\u0299\b)\1\2\u0299"+
		"\u029b\3\2\2\2\u029a\u0295\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029dQ\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a0"+
		"\7@\2\2\u02a0\u02a1\5\4\3\2\u02a1\u02a2\7A\2\2\u02a2\u02a3\b*\1\2\u02a3"+
		"\u02a8\3\2\2\2\u02a4\u02a5\7@\2\2\u02a5\u02a6\7A\2\2\u02a6\u02a8\b*\1"+
		"\2\u02a7\u029f\3\2\2\2\u02a7\u02a4\3\2\2\2\u02a8S\3\2\2\2\u02a9\u02aa"+
		"\7@\2\2\u02aa\u02ab\5X-\2\u02ab\u02ac\7A\2\2\u02ac\u02ad\b+\1\2\u02ad"+
		"U\3\2\2\2\u02ae\u02af\7\4\2\2\u02af\u02bb\b,\1\2\u02b0\u02b1\7\6\2\2\u02b1"+
		"\u02bb\b,\1\2\u02b2\u02b3\7\5\2\2\u02b3\u02bb\b,\1\2\u02b4\u02b5\7\7\2"+
		"\2\u02b5\u02bb\b,\1\2\u02b6\u02b7\7\b\2\2\u02b7\u02bb\b,\1\2\u02b8\u02b9"+
		"\7\32\2\2\u02b9\u02bb\b,\1\2\u02ba\u02ae\3\2\2\2\u02ba\u02b0\3\2\2\2\u02ba"+
		"\u02b2\3\2\2\2\u02ba\u02b4\3\2\2\2\u02ba\u02b6\3\2\2\2\u02ba\u02b8\3\2"+
		"\2\2\u02bbW\3\2\2\2\u02bc\u02bd\b-\1\2\u02bd\u02be\5Z.\2\u02be\u02bf\b"+
		"-\1\2\u02bf\u02c8\3\2\2\2\u02c0\u02c1\f\3\2\2\u02c1\u02c2\7&\2\2\u02c2"+
		"\u02c3\7&\2\2\u02c3\u02c4\5X-\4\u02c4\u02c5\b-\1\2\u02c5\u02c7\3\2\2\2"+
		"\u02c6\u02c0\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9Y\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\b.\1\2\u02cc\u02cd"+
		"\78\2\2\u02cd\u02ce\5Z.\25\u02ce\u02cf\b.\1\2\u02cf\u0312\3\2\2\2\u02d0"+
		"\u02d1\7\4\2\2\u02d1\u02d2\7)\2\2\u02d2\u02d3\7\26\2\2\u02d3\u02d4\7>"+
		"\2\2\u02d4\u02d5\5Z.\2\u02d5\u02d6\7\'\2\2\u02d6\u02d7\5Z.\2\u02d7\u02d8"+
		"\7?\2\2\u02d8\u02d9\b.\1\2\u02d9\u0312\3\2\2\2\u02da\u02db\7\5\2\2\u02db"+
		"\u02dc\7)\2\2\u02dc\u02dd\7\27\2\2\u02dd\u02de\7>\2\2\u02de\u02df\5Z."+
		"\2\u02df\u02e0\7\'\2\2\u02e0\u02e1\5Z.\2\u02e1\u02e2\7?\2\2\u02e2\u02e3"+
		"\b.\1\2\u02e3\u0312\3\2\2\2\u02e4\u02e5\7<\2\2\u02e5\u02e6\5Z.\17\u02e6"+
		"\u02e7\b.\1\2\u02e7\u0312\3\2\2\2\u02e8\u02e9\7B\2\2\u02e9\u02ea\5X-\2"+
		"\u02ea\u02eb\7(\2\2\u02eb\u02ec\5X-\2\u02ec\u02ed\7C\2\2\u02ed\u02ee\b"+
		".\1\2\u02ee\u0312\3\2\2\2\u02ef\u02f0\7B\2\2\u02f0\u02f1\5*\26\2\u02f1"+
		"\u02f2\7C\2\2\u02f2\u02f3\b.\1\2\u02f3\u0312\3\2\2\2\u02f4\u02f5\7.\2"+
		"\2\u02f5\u02f6\7@\2\2\u02f6\u02f7\5`\61\2\u02f7\u02f8\7A\2\2\u02f8\u02f9"+
		"\b.\1\2\u02f9\u0312\3\2\2\2\u02fa\u02fb\5b\62\2\u02fb\u02fc\b.\1\2\u02fc"+
		"\u0312\3\2\2\2\u02fd\u02fe\7>\2\2\u02fe\u02ff\5X-\2\u02ff\u0300\7?\2\2"+
		"\u0300\u0301\b.\1\2\u0301\u0312\3\2\2\2\u0302\u0303\5\\/\2\u0303\u0304"+
		"\b.\1\2\u0304\u0312\3\2\2\2\u0305\u0306\5<\37\2\u0306\u0307\b.\1\2\u0307"+
		"\u0312\3\2\2\2\u0308\u0309\5F$\2\u0309\u030a\b.\1\2\u030a\u0312\3\2\2"+
		"\2\u030b\u030c\5 \21\2\u030c\u030d\b.\1\2\u030d\u0312\3\2\2\2\u030e\u030f"+
		"\5\32\16\2\u030f\u0310\b.\1\2\u0310\u0312\3\2\2\2\u0311\u02cb\3\2\2\2"+
		"\u0311\u02d0\3\2\2\2\u0311\u02da\3\2\2\2\u0311\u02e4\3\2\2\2\u0311\u02e8"+
		"\3\2\2\2\u0311\u02ef\3\2\2\2\u0311\u02f4\3\2\2\2\u0311\u02fa\3\2\2\2\u0311"+
		"\u02fd\3\2\2\2\u0311\u0302\3\2\2\2\u0311\u0305\3\2\2\2\u0311\u0308\3\2"+
		"\2\2\u0311\u030b\3\2\2\2\u0311\u030e\3\2\2\2\u0312\u032e\3\2\2\2\u0313"+
		"\u0314\f\22\2\2\u0314\u0315\t\2\2\2\u0315\u0316\5Z.\23\u0316\u0317\b."+
		"\1\2\u0317\u032d\3\2\2\2\u0318\u0319\f\21\2\2\u0319\u031a\t\3\2\2\u031a"+
		"\u031b\5Z.\22\u031b\u031c\b.\1\2\u031c\u032d\3\2\2\2\u031d\u031e\f\20"+
		"\2\2\u031e\u031f\t\4\2\2\u031f\u0320\5Z.\21\u0320\u0321\b.\1\2\u0321\u032d"+
		"\3\2\2\2\u0322\u0323\f\16\2\2\u0323\u0324\7:\2\2\u0324\u0325\5Z.\17\u0325"+
		"\u0326\b.\1\2\u0326\u032d\3\2\2\2\u0327\u0328\f\r\2\2\u0328\u0329\7;\2"+
		"\2\u0329\u032a\5Z.\16\u032a\u032b\b.\1\2\u032b\u032d\3\2\2\2\u032c\u0313"+
		"\3\2\2\2\u032c\u0318\3\2\2\2\u032c\u031d\3\2\2\2\u032c\u0322\3\2\2\2\u032c"+
		"\u0327\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2"+
		"\2\2\u032f[\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\7>\2\2\u0332\u0333"+
		"\5X-\2\u0333\u0334\7\25\2\2\u0334\u0335\5^\60\2\u0335\u0336\7?\2\2\u0336"+
		"\u0337\b/\1\2\u0337]\3\2\2\2\u0338\u0339\7\5\2\2\u0339\u033d\b\60\1\2"+
		"\u033a\u033b\7\4\2\2\u033b\u033d\b\60\1\2\u033c\u0338\3\2\2\2\u033c\u033a"+
		"\3\2\2\2\u033d_\3\2\2\2\u033e\u033f\b\61\1\2\u033f\u0340\7.\2\2\u0340"+
		"\u0341\7*\2\2\u0341\u0342\5X-\2\u0342\u0343\b\61\1\2\u0343\u034d\3\2\2"+
		"\2\u0344\u0345\f\4\2\2\u0345\u0346\7\'\2\2\u0346\u0347\7.\2\2\u0347\u0348"+
		"\7*\2\2\u0348\u0349\5X-\2\u0349\u034a\b\61\1\2\u034a\u034c\3\2\2\2\u034b"+
		"\u0344\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2"+
		"\2\2\u034ea\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0351\7#\2\2\u0351\u035f"+
		"\b\62\1\2\u0352\u0353\7$\2\2\u0353\u035f\b\62\1\2\u0354\u0355\5f\64\2"+
		"\u0355\u0356\b\62\1\2\u0356\u035f\3\2\2\2\u0357\u0358\7\23\2\2\u0358\u035f"+
		"\b\62\1\2\u0359\u035a\7\24\2\2\u035a\u035f\b\62\1\2\u035b\u035c\5d\63"+
		"\2\u035c\u035d\b\62\1\2\u035d\u035f\3\2\2\2\u035e\u0350\3\2\2\2\u035e"+
		"\u0352\3\2\2\2\u035e\u0354\3\2\2\2\u035e\u0357\3\2\2\2\u035e\u0359\3\2"+
		"\2\2\u035e\u035b\3\2\2\2\u035fc\3\2\2\2\u0360\u0361\b\63\1\2\u0361\u0362"+
		"\7.\2\2\u0362\u0363\b\63\1\2\u0363\u0370\3\2\2\2\u0364\u0365\f\5\2\2\u0365"+
		"\u0366\7B\2\2\u0366\u0367\5X-\2\u0367\u0368\7C\2\2\u0368\u0369\b\63\1"+
		"\2\u0369\u036f\3\2\2\2\u036a\u036b\f\4\2\2\u036b\u036c\7&\2\2\u036c\u036d"+
		"\7.\2\2\u036d\u036f\b\63\1\2\u036e\u0364\3\2\2\2\u036e\u036a\3\2\2\2\u036f"+
		"\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371e\3\2\2\2"+
		"\u0372\u0370\3\2\2\2\u0373\u0375\7=\2\2\u0374\u0373\3\2\2\2\u0375\u0376"+
		"\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u037a\7%\2\2\u0379\u037b\t\5\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2"+
		"\2\2\u037b\u037c\3\2\2\2\u037c\u0383\b\64\1\2\u037d\u037e\7%\2\2\u037e"+
		"\u037f\t\5\2\2\u037f\u0383\b\64\1\2\u0380\u0381\7%\2\2\u0381\u0383\b\64"+
		"\1\2\u0382\u0374\3\2\2\2\u0382\u037d\3\2\2\2\u0382\u0380\3\2\2\2\u0383"+
		"g\3\2\2\2.n}\u00a9\u00ae\u00bb\u00cb\u0102\u0128\u0140\u014d\u0155\u0173"+
		"\u0183\u019f\u01a4\u01b4\u01c6\u01d2\u01df\u0201\u0212\u0217\u021e\u023d"+
		"\u025f\u026b\u0278\u027f\u0289\u029c\u02a7\u02ba\u02c8\u0311\u032c\u032e"+
		"\u033c\u034d\u035e\u036e\u0370\u0376\u037a\u0382";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}