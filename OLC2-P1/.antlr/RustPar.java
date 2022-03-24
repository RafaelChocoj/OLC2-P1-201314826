// Generated from d:\ARCHIVOS\Documents\1s_2022\compi2\lab\Repositorio\OLC2-P1\RustPar.g4 by ANTLR 4.8

    import "OLC2/interfaces"
    import "OLC2/expresion"
    import "OLC2/instruction"
    import "OLC2/instructionExpre"
    import "OLC2/modules"
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
		PRINT_CON=1, T_NUMBER=2, T_FLOAT=3, T_STRING=4, T_BOOL=5, T_STR=6, T_CHAT=7, 
		T_ARRAY=8, T_VECTOR=9, USIZE=10, IF=11, ELSE=12, WHILE=13, LOOP=14, FOR=15, 
		IN=16, BREAK=17, CONTINUE=18, MATCH=19, MTOR=20, TRUE=21, FALSE=22, AS=23, 
		POW=24, POWF=25, LET=26, MUT=27, STRUCT=28, VEC=29, VECN=30, CAPACITY=31, 
		TO_STRING=32, TO_OWNED=33, LEN=34, NEW=35, CAPF=36, CLONE=37, ABS=38, 
		SQRT=39, PUSH=40, CONTAINS=41, INSERT=42, REMOVE=43, MODULO=44, PUBLIC=45, 
		TYPETHEN=46, FN=47, MAIN=48, RETURN=49, NUMBER=50, FLOAT=51, STRING=52, 
		PUNTO=53, COMA=54, PTCOMA=55, DOSPUNTO=56, DPUNTO2=57, ASIGNACION=58, 
		MTHEN=59, GUIONB=60, ID=61, DISTINTO=62, IGUAL=63, MAYORIGUAL=64, MENORIGUAL=65, 
		MAYOR=66, MENOR=67, MUL=68, DIV=69, ADD=70, SUB=71, MOD=72, AND=73, OR=74, 
		NOT=75, AMP=76, PARIZQ=77, PARDER=78, LLAVEIZQ=79, LLAVEDER=80, CORIZQ=81, 
		CORDER=82, CHAR=83, WHITESPACE=84, L_COMMENT=85, COMMENT=86;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_list_globals = 2, RULE_in_global = 3, 
		RULE_module = 4, RULE_bodyModule_l = 5, RULE_t_access = 6, RULE_itemMod = 7, 
		RULE_funcion = 8, RULE_params_declar = 9, RULE_declar_parametros = 10, 
		RULE_fn_main = 11, RULE_instruccion = 12, RULE_instruccion_only = 13, 
		RULE_pushVec = 14, RULE_newStruct = 15, RULE_listdecStruct = 16, RULE_callFunction = 17, 
		RULE_callModulo = 18, RULE_listModulec = 19, RULE_returnFun = 20, RULE_printconsola = 21, 
		RULE_loopB = 22, RULE_lWhile = 23, RULE_lForin = 24, RULE_lBreak = 25, 
		RULE_lContinue = 26, RULE_listParams = 27, RULE_listParamsCall = 28, RULE_is_ref = 29, 
		RULE_declaracion = 30, RULE_is_mut = 31, RULE_letid = 32, RULE_vector_types = 33, 
		RULE_array_type = 34, RULE_asignacion = 35, RULE_l_AccessStruct = 36, 
		RULE_list_index = 37, RULE_index_array = 38, RULE_if_sent = 39, RULE_if_exp = 40, 
		RULE_list_elseif = 41, RULE_list_elseif_exp = 42, RULE_else_if = 43, RULE_else_if_exp = 44, 
		RULE_match_sent = 45, RULE_match_brazos = 46, RULE_match_brazos_exp = 47, 
		RULE_matchbrazo = 48, RULE_matchbrazo_exp = 49, RULE_listaOpciones = 50, 
		RULE_bloque_inst = 51, RULE_bloque_exp = 52, RULE_tipos_var = 53, RULE_expression = 54, 
		RULE_expr_arit = 55, RULE_casteo = 56, RULE_tipo_cast = 57, RULE_l_StructExp = 58, 
		RULE_primitivo = 59, RULE_listIDArray = 60, RULE_strings = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "list_globals", "in_global", "module", "bodyModule_l", 
			"t_access", "itemMod", "funcion", "params_declar", "declar_parametros", 
			"fn_main", "instruccion", "instruccion_only", "pushVec", "newStruct", 
			"listdecStruct", "callFunction", "callModulo", "listModulec", "returnFun", 
			"printconsola", "loopB", "lWhile", "lForin", "lBreak", "lContinue", "listParams", 
			"listParamsCall", "is_ref", "declaracion", "is_mut", "letid", "vector_types", 
			"array_type", "asignacion", "l_AccessStruct", "list_index", "index_array", 
			"if_sent", "if_exp", "list_elseif", "list_elseif_exp", "else_if", "else_if_exp", 
			"match_sent", "match_brazos", "match_brazos_exp", "matchbrazo", "matchbrazo_exp", 
			"listaOpciones", "bloque_inst", "bloque_exp", "tipos_var", "expression", 
			"expr_arit", "casteo", "tipo_cast", "l_StructExp", "primitivo", "listIDArray", 
			"strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'char'", "'array'", "'Vector'", "'usize'", "'if'", "'else'", "'while'", 
			"'loop'", "'for'", "'in'", "'break'", "'continue'", "'match'", "'|'", 
			"'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", "'mut'", "'struct'", 
			"'vec!'", "'Vec'", "'with_capacity'", "'.to_string()'", "'.to_owned()'", 
			"'len()'", "'new()'", "'capacity()'", "'clone()'", "'abs()'", "'sqrt()'", 
			"'push'", "'contains'", "'insert'", "'remove'", "'mod'", "'pub'", "'->'", 
			"'fn'", "'main'", "'return'", null, null, null, "'.'", "','", "';'", 
			"'::'", "':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", "'<='", 
			"'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", 
			"'&'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"T_CHAT", "T_ARRAY", "T_VECTOR", "USIZE", "IF", "ELSE", "WHILE", "LOOP", 
			"FOR", "IN", "BREAK", "CONTINUE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", 
			"POW", "POWF", "LET", "MUT", "STRUCT", "VEC", "VECN", "CAPACITY", "TO_STRING", 
			"TO_OWNED", "LEN", "NEW", "CAPF", "CLONE", "ABS", "SQRT", "PUSH", "CONTAINS", 
			"INSERT", "REMOVE", "MODULO", "PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", 
			"NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", 
			"ASIGNACION", "MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", 
			"OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", 
			"CORDER", "CHAR", "WHITESPACE", "L_COMMENT", "COMMENT"
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
		public List_globalsContext list_globals;
		public List_globalsContext list_globals() {
			return getRuleContext(List_globalsContext.class,0);
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
			setState(124);
			((StartContext)_localctx).list_globals = list_globals(0);
			_localctx.lista = ((StartContext)_localctx).list_globals.lista
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
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_CON) | (1L << IF) | (1L << WHILE) | (1L << LOOP) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << MATCH) | (1L << LET) | (1L << STRUCT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(127);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(132);
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

	public static class List_globalsContext extends ParserRuleContext {
		public *arrayList.List lista;
		public List_globalsContext lisfun;
		public In_globalContext in_global;
		public In_globalContext in_global() {
			return getRuleContext(In_globalContext.class,0);
		}
		public List_globalsContext list_globals() {
			return getRuleContext(List_globalsContext.class,0);
		}
		public List_globalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_globals; }
	}

	public final List_globalsContext list_globals() throws RecognitionException {
		return list_globals(0);
	}

	private List_globalsContext list_globals(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_globalsContext _localctx = new List_globalsContext(_ctx, _parentState);
		List_globalsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_list_globals, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			((List_globalsContext)_localctx).in_global = in_global();
			 _localctx.lista.Add( ((List_globalsContext)_localctx).in_global.globals ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_globalsContext(_parentctx, _parentState);
					_localctx.lisfun = _prevctx;
					_localctx.lisfun = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list_globals);
					setState(139);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(140);
					((List_globalsContext)_localctx).in_global = in_global();

					                                                    ((List_globalsContext)_localctx).lisfun.lista.Add( ((List_globalsContext)_localctx).in_global.globals)
					                                                    _localctx.lista =  ((List_globalsContext)_localctx).lisfun.lista
					                                                  
					}
					} 
				}
				setState(147);
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

	public static class In_globalContext extends ParserRuleContext {
		public interfaces.Instruction globals;
		public FuncionContext funcion;
		public ModuleContext module;
		public NewStructContext newStruct;
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public NewStructContext newStruct() {
			return getRuleContext(NewStructContext.class,0);
		}
		public In_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_global; }
	}

	public final In_globalContext in_global() throws RecognitionException {
		In_globalContext _localctx = new In_globalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_in_global);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FN:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((In_globalContext)_localctx).funcion = funcion();
				_localctx.globals = ((In_globalContext)_localctx).funcion.instr
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				((In_globalContext)_localctx).module = module();
				 _localctx.globals = ((In_globalContext)_localctx).module.modu 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				((In_globalContext)_localctx).newStruct = newStruct();
				_localctx.globals = ((In_globalContext)_localctx).newStruct.str
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

	public static class ModuleContext extends ParserRuleContext {
		public interfaces.Instruction modu;
		public Token MODULO;
		public Token ID;
		public BodyModule_lContext bodyModule_l;
		public TerminalNode MODULO() { return getToken(RustPar.MODULO, 0); }
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(RustPar.LLAVEIZQ, 0); }
		public BodyModule_lContext bodyModule_l() {
			return getRuleContext(BodyModule_lContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(RustPar.LLAVEDER, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((ModuleContext)_localctx).MODULO = match(MODULO);
			setState(160);
			((ModuleContext)_localctx).ID = match(ID);
			setState(161);
			match(LLAVEIZQ);
			setState(162);
			((ModuleContext)_localctx).bodyModule_l = bodyModule_l(0);
			setState(163);
			match(LLAVEDER);
			 
			        _localctx.modu = modules.NewModule( (((ModuleContext)_localctx).ID!=null?((ModuleContext)_localctx).ID.getText():null), ((ModuleContext)_localctx).bodyModule_l.mod_list, (((ModuleContext)_localctx).MODULO!=null?((ModuleContext)_localctx).MODULO.getLine():0), (((ModuleContext)_localctx).MODULO!=null?((ModuleContext)_localctx).MODULO.getCharPositionInLine():0) ) 
			    
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

	public static class BodyModule_lContext extends ParserRuleContext {
		public *arrayList.List mod_list;
		public BodyModule_lContext l_mod;
		public T_accessContext t_access;
		public ModuleContext module;
		public ItemModContext itemMod;
		public T_accessContext t_access() {
			return getRuleContext(T_accessContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public ItemModContext itemMod() {
			return getRuleContext(ItemModContext.class,0);
		}
		public BodyModule_lContext bodyModule_l() {
			return getRuleContext(BodyModule_lContext.class,0);
		}
		public BodyModule_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyModule_l; }
	}

	public final BodyModule_lContext bodyModule_l() throws RecognitionException {
		return bodyModule_l(0);
	}

	private BodyModule_lContext bodyModule_l(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BodyModule_lContext _localctx = new BodyModule_lContext(_ctx, _parentState);
		BodyModule_lContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_bodyModule_l, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(167);
				((BodyModule_lContext)_localctx).t_access = t_access();
				setState(168);
				((BodyModule_lContext)_localctx).module = module();

				                            _localctx.mod_list = arrayList.New()
				                            newmod := modules.NewModuleCont(((BodyModule_lContext)_localctx).t_access.modAccess, interfaces.MOD, ((BodyModule_lContext)_localctx).module.modu)
				                            _localctx.mod_list.Add(newmod)
				                        
				}
				break;
			case 2:
				{
				setState(171);
				((BodyModule_lContext)_localctx).t_access = t_access();
				setState(172);
				((BodyModule_lContext)_localctx).itemMod = itemMod();

				                            _localctx.mod_list = arrayList.New()
				                            newmod := modules.NewModuleCont(((BodyModule_lContext)_localctx).t_access.modAccess, interfaces.INS, ((BodyModule_lContext)_localctx).itemMod.instr)
				                            _localctx.mod_list.Add(newmod)
				                        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new BodyModule_lContext(_parentctx, _parentState);
						_localctx.l_mod = _prevctx;
						_localctx.l_mod = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bodyModule_l);
						setState(177);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(178);
						((BodyModule_lContext)_localctx).t_access = t_access();
						setState(179);
						((BodyModule_lContext)_localctx).module = module();

						                                                      newmod := modules.NewModuleCont(((BodyModule_lContext)_localctx).t_access.modAccess, interfaces.MOD, ((BodyModule_lContext)_localctx).module.modu)
						                                                      ((BodyModule_lContext)_localctx).l_mod.mod_list.Add(newmod)
						                                                      _localctx.mod_list = ((BodyModule_lContext)_localctx).l_mod.mod_list
						                                                  
						}
						break;
					case 2:
						{
						_localctx = new BodyModule_lContext(_parentctx, _parentState);
						_localctx.l_mod = _prevctx;
						_localctx.l_mod = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bodyModule_l);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						((BodyModule_lContext)_localctx).t_access = t_access();
						setState(184);
						((BodyModule_lContext)_localctx).itemMod = itemMod();

						                                                      newmod := modules.NewModuleCont(((BodyModule_lContext)_localctx).t_access.modAccess, interfaces.INS, ((BodyModule_lContext)_localctx).itemMod.instr)
						                                                      ((BodyModule_lContext)_localctx).l_mod.mod_list.Add(newmod)
						                                                      _localctx.mod_list = ((BodyModule_lContext)_localctx).l_mod.mod_list
						                                                  
						}
						break;
					}
					} 
				}
				setState(191);
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
		enterRule(_localctx, 12, RULE_t_access);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(PUBLIC);
				 _localctx.modAccess = interfaces.PUBLIC
				}
				break;
			case STRUCT:
			case MODULO:
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

	public static class ItemModContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public FuncionContext funcion;
		public NewStructContext newStruct;
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public NewStructContext newStruct() {
			return getRuleContext(NewStructContext.class,0);
		}
		public ItemModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemMod; }
	}

	public final ItemModContext itemMod() throws RecognitionException {
		ItemModContext _localctx = new ItemModContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_itemMod);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FN:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				((ItemModContext)_localctx).funcion = funcion();
				_localctx.instr = ((ItemModContext)_localctx).funcion.instr
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				((ItemModContext)_localctx).newStruct = newStruct();
				_localctx.instr = ((ItemModContext)_localctx).newStruct.str
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
		public Token idob;
		public Params_declarContext params_declar;
		public Token id;
		public Fn_mainContext fn_main() {
			return getRuleContext(Fn_mainContext.class,0);
		}
		public TerminalNode FN() { return getToken(RustPar.FN, 0); }
		public List<TerminalNode> ID() { return getTokens(RustPar.ID); }
		public TerminalNode ID(int i) {
			return getToken(RustPar.ID, i);
		}
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public TerminalNode TYPETHEN() { return getToken(RustPar.TYPETHEN, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public TerminalNode VECN() { return getToken(RustPar.VECN, 0); }
		public TerminalNode MENOR() { return getToken(RustPar.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(RustPar.MAYOR, 0); }
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
		enterRule(_localctx, 16, RULE_funcion);
		 listParams :=  arrayList.New() 
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((FuncionContext)_localctx).fn_main = fn_main();
				_localctx.instr =  ((FuncionContext)_localctx).fn_main.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(FN);
				setState(209);
				((FuncionContext)_localctx).ID = match(ID);
				setState(210);
				match(PARIZQ);
				setState(211);
				match(PARDER);
				setState(212);
				match(TYPETHEN);
				setState(213);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(214);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, ((FuncionContext)_localctx).tipos_var.tipo, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0), "" )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(FN);
				setState(218);
				((FuncionContext)_localctx).ID = match(ID);
				setState(219);
				match(PARIZQ);
				setState(220);
				match(PARDER);
				setState(221);
				match(TYPETHEN);
				setState(222);
				match(VECN);
				setState(223);
				match(MENOR);
				setState(224);
				((FuncionContext)_localctx).idob = match(ID);
				setState(225);
				match(MAYOR);
				setState(226);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0),  (((FuncionContext)_localctx).idob!=null?((FuncionContext)_localctx).idob.getText():null) )
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(FN);
				setState(230);
				((FuncionContext)_localctx).ID = match(ID);
				setState(231);
				match(PARIZQ);
				setState(232);
				match(PARDER);
				setState(233);
				match(TYPETHEN);
				setState(234);
				((FuncionContext)_localctx).idob = match(ID);
				setState(235);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0),  (((FuncionContext)_localctx).idob!=null?((FuncionContext)_localctx).idob.getText():null) )
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(FN);
				setState(239);
				((FuncionContext)_localctx).ID = match(ID);
				setState(240);
				match(PARIZQ);
				setState(241);
				match(PARDER);
				setState(242);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0), "" )
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				match(FN);
				setState(246);
				((FuncionContext)_localctx).ID = match(ID);
				setState(247);
				match(PARIZQ);
				setState(248);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(249);
				match(PARDER);
				setState(250);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),((FuncionContext)_localctx).params_declar.lista,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0), "" )
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				match(FN);
				setState(254);
				((FuncionContext)_localctx).ID = match(ID);
				setState(255);
				match(PARIZQ);
				setState(256);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(257);
				match(PARDER);
				setState(258);
				match(TYPETHEN);
				setState(259);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(260);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),((FuncionContext)_localctx).params_declar.lista, ((FuncionContext)_localctx).bloque_inst.l,((FuncionContext)_localctx).tipos_var.tipo, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0), "" )
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				match(FN);
				setState(264);
				((FuncionContext)_localctx).id = match(ID);
				setState(265);
				match(PARIZQ);
				setState(266);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(267);
				match(PARDER);
				setState(268);
				match(TYPETHEN);
				setState(269);
				match(VECN);
				setState(270);
				match(MENOR);
				setState(271);
				((FuncionContext)_localctx).idob = match(ID);
				setState(272);
				match(MAYOR);
				setState(273);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getText():null),((FuncionContext)_localctx).params_declar.lista, ((FuncionContext)_localctx).bloque_inst.l, interfaces.VECTOR, (((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getLine():0), (((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getCharPositionInLine():0), (((FuncionContext)_localctx).idob!=null?((FuncionContext)_localctx).idob.getText():null)  )
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(276);
				match(FN);
				setState(277);
				((FuncionContext)_localctx).id = match(ID);
				setState(278);
				match(PARIZQ);
				setState(279);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(280);
				match(PARDER);
				setState(281);
				match(TYPETHEN);
				setState(282);
				match(VECN);
				setState(283);
				match(MENOR);
				setState(284);
				tipos_var();
				setState(285);
				match(MAYOR);
				setState(286);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getText():null),((FuncionContext)_localctx).params_declar.lista, ((FuncionContext)_localctx).bloque_inst.l, interfaces.VECTOR, (((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getLine():0), (((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getCharPositionInLine():0), ""  )
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(289);
				match(FN);
				setState(290);
				((FuncionContext)_localctx).id = match(ID);
				setState(291);
				match(PARIZQ);
				setState(292);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(293);
				match(PARDER);
				setState(294);
				match(TYPETHEN);
				setState(295);
				((FuncionContext)_localctx).idob = match(ID);
				setState(296);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getText():null),((FuncionContext)_localctx).params_declar.lista, ((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getLine():0), (((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getCharPositionInLine():0), (((FuncionContext)_localctx).idob!=null?((FuncionContext)_localctx).idob.getText():null)  )
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_params_declar, _p);

		_localctx.lista =  arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			((Params_declarContext)_localctx).declar_parametros = declar_parametros();
			   _localctx.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec) 
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
					setState(305);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(306);
					match(COMA);
					setState(307);
					((Params_declarContext)_localctx).declar_parametros = declar_parametros();

					                                                                      ((Params_declarContext)_localctx).listdec.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec)
					                                                                      _localctx.lista =  ((Params_declarContext)_localctx).listdec.lista 
					}
					} 
				}
				setState(314);
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

	public static class Declar_parametrosContext extends ParserRuleContext {
		public interfaces.Instruction in_dec;
		public Is_mutContext isMut;
		public Token ID;
		public Tipos_varContext tipos_var;
		public Array_typeContext array_type;
		public Token id;
		public Is_refContext is_ref;
		public Token idob;
		public Token idstruct;
		public List<TerminalNode> ID() { return getTokens(RustPar.ID); }
		public TerminalNode ID(int i) {
			return getToken(RustPar.ID, i);
		}
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
		public Is_refContext is_ref() {
			return getRuleContext(Is_refContext.class,0);
		}
		public TerminalNode VECN() { return getToken(RustPar.VECN, 0); }
		public TerminalNode MENOR() { return getToken(RustPar.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(RustPar.MAYOR, 0); }
		public Declar_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar_parametros; }
	}

	public final Declar_parametrosContext declar_parametros() throws RecognitionException {
		Declar_parametrosContext _localctx = new Declar_parametrosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declar_parametros);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				((Declar_parametrosContext)_localctx).isMut = is_mut();
				setState(316);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(317);
				match(DPUNTO2);
				setState(318);
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
				setState(321);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(322);
				match(DPUNTO2);
				setState(323);
				match(AMP);
				setState(324);
				match(MUT);
				setState(325);
				((Declar_parametrosContext)_localctx).array_type = array_type();

				                        listaIdes := arrayList.New()
				                        listaIdes.Add(expresion.NewIdentificador((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) ))
				                        decl := instruction.NewArrayDeclaration((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), ((Declar_parametrosContext)_localctx).array_type.ty, nil, true, (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.in_dec = decl
				                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				((Declar_parametrosContext)_localctx).id = match(ID);
				setState(329);
				match(DPUNTO2);
				setState(330);
				((Declar_parametrosContext)_localctx).is_ref = is_ref();
				setState(331);
				match(VECN);
				setState(332);
				match(MENOR);
				setState(333);
				((Declar_parametrosContext)_localctx).idob = match(ID);
				setState(334);
				match(MAYOR);

				                        //listaIdes := arrayList.New()
				                        //listaIdes.Add(expresion.NewIdentificador((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0) ))
				                        decl := instruction.NewVectorDeclaration((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), interfaces.NULL, nil, ((Declar_parametrosContext)_localctx).is_ref.ref, (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0), nil, (((Declar_parametrosContext)_localctx).idob!=null?((Declar_parametrosContext)_localctx).idob.getText():null))
				                        _localctx.in_dec = decl
				                    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				((Declar_parametrosContext)_localctx).id = match(ID);
				setState(338);
				match(DPUNTO2);
				setState(339);
				((Declar_parametrosContext)_localctx).is_ref = is_ref();
				setState(340);
				match(VECN);
				setState(341);
				match(MENOR);
				setState(342);
				((Declar_parametrosContext)_localctx).tipos_var = tipos_var();
				setState(343);
				match(MAYOR);

				                        //listaIdes := arrayList.New()
				                        //listaIdes.Add(expresion.NewIdentificador((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0) ))
				                        decl := instruction.NewVectorDeclaration((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), ((Declar_parametrosContext)_localctx).tipos_var.tipo, nil, ((Declar_parametrosContext)_localctx).is_ref.ref, (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0), nil, "")
				                        _localctx.in_dec = decl
				                    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				((Declar_parametrosContext)_localctx).id = match(ID);
				setState(347);
				match(DPUNTO2);
				setState(348);
				((Declar_parametrosContext)_localctx).is_ref = is_ref();
				setState(349);
				((Declar_parametrosContext)_localctx).idstruct = match(ID);
				 
				                            decl := instruction.NewDeclaration((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), interfaces.STRUCT, nil, ((Declar_parametrosContext)_localctx).is_ref.ref, (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0))
				                            _localctx.in_dec = decl
				                        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(352);
				((Declar_parametrosContext)_localctx).isMut = is_mut();
				setState(353);
				((Declar_parametrosContext)_localctx).id = match(ID);
				setState(354);
				match(DPUNTO2);
				setState(355);
				match(VECN);
				setState(356);
				match(MENOR);
				setState(357);
				((Declar_parametrosContext)_localctx).idob = match(ID);
				setState(358);
				match(MAYOR);

				                        decl := instruction.NewVectorDeclaration((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), interfaces.NULL, nil, ((Declar_parametrosContext)_localctx).isMut.mut, (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0), nil, (((Declar_parametrosContext)_localctx).idob!=null?((Declar_parametrosContext)_localctx).idob.getText():null))
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
		enterRule(_localctx, 22, RULE_fn_main);
		 listParams:= arrayList.New() 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(FN);
			setState(364);
			((Fn_mainContext)_localctx).MAIN = match(MAIN);
			setState(365);
			match(PARIZQ);
			setState(366);
			match(PARDER);
			setState(367);
			((Fn_mainContext)_localctx).bloque_inst = bloque_inst();
			 _localctx.instr = instructionExpre.NewFunction("main",listParams,((Fn_mainContext)_localctx).bloque_inst.l, interfaces.VOID, (((Fn_mainContext)_localctx).MAIN!=null?((Fn_mainContext)_localctx).MAIN.getLine():0), (((Fn_mainContext)_localctx).MAIN!=null?((Fn_mainContext)_localctx).MAIN.getCharPositionInLine():0), "" )
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
		public CallModuloContext callModulo;
		public Token ID;
		public ExpressionContext expression;
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
		public CallModuloContext callModulo() {
			return getRuleContext(CallModuloContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(RustPar.PUNTO, 0); }
		public TerminalNode REMOVE() { return getToken(RustPar.REMOVE, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instruccion);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				((InstruccionContext)_localctx).printconsola = printconsola();
				setState(371);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(375);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(379);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				((InstruccionContext)_localctx).pushVec = pushVec();
				setState(383);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).pushVec.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				((InstruccionContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((InstruccionContext)_localctx).if_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				((InstruccionContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((InstruccionContext)_localctx).match_sent.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				((InstruccionContext)_localctx).loopB = loopB();
				 _localctx.instr = ((InstruccionContext)_localctx).loopB.lop 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(395);
				((InstruccionContext)_localctx).lWhile = lWhile();
				 _localctx.instr = ((InstruccionContext)_localctx).lWhile.lwh 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(398);
				((InstruccionContext)_localctx).lForin = lForin();
				 _localctx.instr = ((InstruccionContext)_localctx).lForin.lfor 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(401);
				((InstruccionContext)_localctx).lBreak = lBreak();
				setState(402);
				match(PTCOMA);
				 _localctx.instr = ((InstruccionContext)_localctx).lBreak.br 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(405);
				((InstruccionContext)_localctx).lContinue = lContinue();
				setState(406);
				match(PTCOMA);
				 _localctx.instr = ((InstruccionContext)_localctx).lContinue.cn 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(409);
				((InstruccionContext)_localctx).newStruct = newStruct();
				_localctx.instr = ((InstruccionContext)_localctx).newStruct.str
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(412);
				((InstruccionContext)_localctx).callFunction = callFunction();
				setState(413);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).callFunction.instr
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(416);
				((InstruccionContext)_localctx).returnFun = returnFun();
				setState(417);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).returnFun.instr
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(420);
				((InstruccionContext)_localctx).callModulo = callModulo();
				setState(421);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).callModulo.instr
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(424);
				((InstruccionContext)_localctx).ID = match(ID);
				setState(425);
				match(PUNTO);
				setState(426);
				match(REMOVE);
				setState(427);
				match(PARIZQ);
				setState(428);
				((InstruccionContext)_localctx).expression = expression(0);
				setState(429);
				match(PARDER);
				setState(430);
				match(PTCOMA);
				 _localctx.instr = instructionExpre.NewRemove((((InstruccionContext)_localctx).ID!=null?((InstruccionContext)_localctx).ID.getText():null), ((InstruccionContext)_localctx).expression.p, (((InstruccionContext)_localctx).ID!=null?((InstruccionContext)_localctx).ID.getLine():0), (((InstruccionContext)_localctx).ID!=null?((InstruccionContext)_localctx).ID.getCharPositionInLine():0)) 
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
		public CallModuloContext callModulo;
		public Token ID;
		public ExpressionContext expression;
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
		public CallModuloContext callModulo() {
			return getRuleContext(CallModuloContext.class,0);
		}
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(RustPar.PUNTO, 0); }
		public TerminalNode REMOVE() { return getToken(RustPar.REMOVE, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public Instruccion_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_only; }
	}

	public final Instruccion_onlyContext instruccion_only() throws RecognitionException {
		Instruccion_onlyContext _localctx = new Instruccion_onlyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instruccion_only);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				((Instruccion_onlyContext)_localctx).printconsola = printconsola();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				((Instruccion_onlyContext)_localctx).declaracion = declaracion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				((Instruccion_onlyContext)_localctx).asignacion = asignacion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				((Instruccion_onlyContext)_localctx).pushVec = pushVec();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).pushVec.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				((Instruccion_onlyContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).if_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				((Instruccion_onlyContext)_localctx).match_sent = match_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).match_sent.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(453);
				((Instruccion_onlyContext)_localctx).loopB = loopB();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).loopB.lop 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(456);
				((Instruccion_onlyContext)_localctx).lWhile = lWhile();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lWhile.lwh 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(459);
				((Instruccion_onlyContext)_localctx).lForin = lForin();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lForin.lfor 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(462);
				((Instruccion_onlyContext)_localctx).lBreak = lBreak();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lBreak.br 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(465);
				((Instruccion_onlyContext)_localctx).lContinue = lContinue();
				 _localctx.instr = ((Instruccion_onlyContext)_localctx).lContinue.cn 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(468);
				((Instruccion_onlyContext)_localctx).callFunction = callFunction();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).callFunction.instr
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(471);
				((Instruccion_onlyContext)_localctx).returnFun = returnFun();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).returnFun.instr
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(474);
				((Instruccion_onlyContext)_localctx).callModulo = callModulo();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).callModulo.instr
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(477);
				((Instruccion_onlyContext)_localctx).ID = match(ID);
				setState(478);
				match(PUNTO);
				setState(479);
				match(REMOVE);
				setState(480);
				match(PARIZQ);
				setState(481);
				((Instruccion_onlyContext)_localctx).expression = expression(0);
				setState(482);
				match(PARDER);
				 _localctx.instr = instructionExpre.NewRemove((((Instruccion_onlyContext)_localctx).ID!=null?((Instruccion_onlyContext)_localctx).ID.getText():null), ((Instruccion_onlyContext)_localctx).expression.p, (((Instruccion_onlyContext)_localctx).ID!=null?((Instruccion_onlyContext)_localctx).ID.getLine():0), (((Instruccion_onlyContext)_localctx).ID!=null?((Instruccion_onlyContext)_localctx).ID.getCharPositionInLine():0)) 
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
		enterRule(_localctx, 28, RULE_pushVec);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				((PushVecContext)_localctx).ID = match(ID);
				setState(488);
				match(PUNTO);
				setState(489);
				match(PUSH);
				setState(490);
				match(PARIZQ);
				setState(491);
				((PushVecContext)_localctx).val = expression(0);
				setState(492);
				match(PARDER);
				_localctx.instr = instruction.NewPush((((PushVecContext)_localctx).ID!=null?((PushVecContext)_localctx).ID.getText():null), ((PushVecContext)_localctx).val.p, (((PushVecContext)_localctx).ID!=null?((PushVecContext)_localctx).ID.getLine():0), (((PushVecContext)_localctx).ID!=null?((PushVecContext)_localctx).ID.getCharPositionInLine():0)  )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				((PushVecContext)_localctx).ID = match(ID);
				setState(496);
				match(PUNTO);
				setState(497);
				match(INSERT);
				setState(498);
				match(PARIZQ);
				setState(499);
				((PushVecContext)_localctx).val1 = expression(0);
				setState(500);
				match(COMA);
				setState(501);
				((PushVecContext)_localctx).val2 = expression(0);
				setState(502);
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
		enterRule(_localctx, 30, RULE_newStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			((NewStructContext)_localctx).STRUCT = match(STRUCT);
			setState(508);
			((NewStructContext)_localctx).ID = match(ID);
			setState(509);
			match(LLAVEIZQ);
			setState(510);
			((NewStructContext)_localctx).listdecStruct = listdecStruct(0);
			setState(511);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_listdecStruct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(515);
				((ListdecStructContext)_localctx).id = match(ID);
				setState(516);
				match(DPUNTO2);
				setState(517);
				((ListdecStructContext)_localctx).tipos_var = tipos_var();

				                    Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).id!=null?((ListdecStructContext)_localctx).id.getText():null), ((ListdecStructContext)_localctx).tipos_var.tipo, "")
				                    ((ListdecStructContext)_localctx).l =  arrayList.New();
				                    _localctx.l.Add(Str_atrib);
				                
				}
				break;
			case 2:
				{
				setState(520);
				((ListdecStructContext)_localctx).id = match(ID);
				setState(521);
				match(DPUNTO2);
				setState(522);
				((ListdecStructContext)_localctx).idstru = match(ID);

				                    Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).id!=null?((ListdecStructContext)_localctx).id.getText():null), interfaces.NULL, (((ListdecStructContext)_localctx).idstru!=null?((ListdecStructContext)_localctx).idstru.getText():null))
				                    ((ListdecStructContext)_localctx).l =  arrayList.New();
				                    _localctx.l.Add(Str_atrib);
				                
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(539);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ListdecStructContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listdecStruct);
						setState(526);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(527);
						match(COMA);
						setState(528);
						((ListdecStructContext)_localctx).id = match(ID);
						setState(529);
						match(DPUNTO2);
						setState(530);
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
						setState(533);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(534);
						match(COMA);
						setState(535);
						((ListdecStructContext)_localctx).id = match(ID);
						setState(536);
						match(DPUNTO2);
						setState(537);
						((ListdecStructContext)_localctx).idstru = match(ID);

						                                                  Str_atrib := interfaces.NewStructType((((ListdecStructContext)_localctx).id!=null?((ListdecStructContext)_localctx).id.getText():null), interfaces.NULL, (((ListdecStructContext)_localctx).idstru!=null?((ListdecStructContext)_localctx).idstru.getText():null))
						                                                  ((ListdecStructContext)_localctx).list.l.Add(Str_atrib);
						                                                  ((ListdecStructContext)_localctx).l =  ((ListdecStructContext)_localctx).list.l;
						                                              
						}
						break;
					}
					} 
				}
				setState(543);
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
		enterRule(_localctx, 34, RULE_callFunction);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(545);
				match(PARIZQ);
				setState(546);
				match(PARDER);

				                        _localctx.instr = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.p = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(549);
				match(PARIZQ);
				setState(550);
				((CallFunctionContext)_localctx).listParamsCall = listParamsCall(0);
				setState(551);
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

	public static class CallModuloContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public interfaces.Expresion p;
		public ListModulecContext listModulec;
		public ExpressionContext expression;
		public ListModulecContext listModulec() {
			return getRuleContext(ListModulecContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callModulo; }
	}

	public final CallModuloContext callModulo() throws RecognitionException {
		CallModuloContext _localctx = new CallModuloContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_callModulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			((CallModuloContext)_localctx).listModulec = listModulec(0);
			setState(557);
			((CallModuloContext)_localctx).expression = expression(0);

			        _localctx.p = instructionExpre.NewModuleAccess(((CallModuloContext)_localctx).listModulec.lm, ((CallModuloContext)_localctx).expression.p, (((CallModuloContext)_localctx).listModulec!=null?(((CallModuloContext)_localctx).listModulec.start):null).GetLine(),(((CallModuloContext)_localctx).listModulec!=null?(((CallModuloContext)_localctx).listModulec.start):null).GetColumn() )
			        _localctx.instr = instructionExpre.NewModuleAccess(((CallModuloContext)_localctx).listModulec.lm, ((CallModuloContext)_localctx).expression.p, (((CallModuloContext)_localctx).listModulec!=null?(((CallModuloContext)_localctx).listModulec.start):null).GetLine(),(((CallModuloContext)_localctx).listModulec!=null?(((CallModuloContext)_localctx).listModulec.start):null).GetColumn() )
			    
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

	public static class ListModulecContext extends ParserRuleContext {
		public *arrayList.List lm;
		public ListModulecContext list;
		public Token ID;
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode DOSPUNTO() { return getToken(RustPar.DOSPUNTO, 0); }
		public ListModulecContext listModulec() {
			return getRuleContext(ListModulecContext.class,0);
		}
		public ListModulecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listModulec; }
	}

	public final ListModulecContext listModulec() throws RecognitionException {
		return listModulec(0);
	}

	private ListModulecContext listModulec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListModulecContext _localctx = new ListModulecContext(_ctx, _parentState);
		ListModulecContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_listModulec, _p);
		  _localctx.lm = arrayList.New()   
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(561);
			((ListModulecContext)_localctx).ID = match(ID);
			setState(562);
			match(DOSPUNTO);

			                    _localctx.lm.Add((((ListModulecContext)_localctx).ID!=null?((ListModulecContext)_localctx).ID.getText():null))
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListModulecContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listModulec);
					setState(565);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(566);
					((ListModulecContext)_localctx).ID = match(ID);
					setState(567);
					match(DOSPUNTO);

					                                          ((ListModulecContext)_localctx).list.lm.Add((((ListModulecContext)_localctx).ID!=null?((ListModulecContext)_localctx).ID.getText():null))
					                                          _localctx.lm = ((ListModulecContext)_localctx).list.lm
					                                      
					}
					} 
				}
				setState(573);
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
		enterRule(_localctx, 40, RULE_returnFun);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				((ReturnFunContext)_localctx).RETURN = match(RETURN);
				 _localctx.instr = instructionExpre.NewReturn(nil, (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getLine():0), (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getCharPositionInLine():0) )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				((ReturnFunContext)_localctx).RETURN = match(RETURN);
				setState(577);
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
		enterRule(_localctx, 42, RULE_printconsola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			((PrintconsolaContext)_localctx).PRINT_CON = match(PRINT_CON);
			setState(583);
			match(PARIZQ);
			setState(584);
			((PrintconsolaContext)_localctx).listParams = listParams(0);
			setState(585);
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
		enterRule(_localctx, 44, RULE_loopB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			((LoopBContext)_localctx).LOOP = match(LOOP);
			setState(589);
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
		enterRule(_localctx, 46, RULE_lWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			((LWhileContext)_localctx).WHILE = match(WHILE);
			setState(593);
			((LWhileContext)_localctx).expression = expression(0);
			setState(594);
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
		enterRule(_localctx, 48, RULE_lForin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			((LForinContext)_localctx).FOR = match(FOR);
			setState(598);
			((LForinContext)_localctx).ID = match(ID);
			setState(599);
			match(IN);
			setState(600);
			((LForinContext)_localctx).expression = expression(0);
			setState(601);
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
		enterRule(_localctx, 50, RULE_lBreak);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				((LBreakContext)_localctx).BREAK = match(BREAK);
				 _localctx.br = instructionExpre.NewBreak(nil, (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getLine():0), (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				((LBreakContext)_localctx).BREAK = match(BREAK);
				setState(607);
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
		enterRule(_localctx, 52, RULE_lContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_listParams, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(616);
			((ListParamsContext)_localctx).expression = expression(0);
			_localctx.l_e.Add(((ListParamsContext)_localctx).expression.p)
			}
			_ctx.stop = _input.LT(-1);
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
					setState(619);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(620);
					match(COMA);
					setState(621);
					((ListParamsContext)_localctx).expression = expression(0);

					                                              ((ListParamsContext)_localctx).list.l_e.Add(((ListParamsContext)_localctx).expression.p)
					                                              _localctx.l_e = ((ListParamsContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_listParamsCall, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(630);
			((ListParamsCallContext)_localctx).is_ref = is_ref();
			setState(631);
			((ListParamsCallContext)_localctx).expression = expression(0);
			   ref := instructionExpre.NewParameterBy(((ListParamsCallContext)_localctx).expression.p, ((ListParamsCallContext)_localctx).is_ref.ref)
			                        _localctx.l_e.Add(ref)
			                    
			}
			_ctx.stop = _input.LT(-1);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
					setState(634);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(635);
					match(COMA);
					setState(636);
					((ListParamsCallContext)_localctx).is_ref = is_ref();
					setState(637);
					((ListParamsCallContext)_localctx).expression = expression(0);

					                                              ref := instructionExpre.NewParameterBy(((ListParamsCallContext)_localctx).expression.p, ((ListParamsCallContext)_localctx).is_ref.ref)
					                                              ((ListParamsCallContext)_localctx).list.l_e.Add(ref)
					                                              _localctx.l_e = ((ListParamsCallContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(644);
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
		enterRule(_localctx, 58, RULE_is_ref);
		try {
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(AMP);
				setState(646);
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
		public Vector_typesContext vector_types;
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
		public LetidContext letid() {
			return getRuleContext(LetidContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Vector_typesContext vector_types() {
			return getRuleContext(Vector_typesContext.class,0);
		}
		public List<TerminalNode> VECN() { return getTokens(RustPar.VECN); }
		public TerminalNode VECN(int i) {
			return getToken(RustPar.VECN, i);
		}
		public TerminalNode DOSPUNTO() { return getToken(RustPar.DOSPUNTO, 0); }
		public TerminalNode NEW() { return getToken(RustPar.NEW, 0); }
		public TerminalNode MENOR() { return getToken(RustPar.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(RustPar.MAYOR, 0); }
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
		enterRule(_localctx, 60, RULE_declaracion);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(LET);
				setState(652);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(653);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(654);
				match(DPUNTO2);
				setState(655);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(656);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(657);
				((DeclaracionContext)_localctx).expression = expression(0);

				                        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(LET);
				setState(661);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(662);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(663);
				letid();
				setState(664);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(665);
				((DeclaracionContext)_localctx).expression = expression(0);
				 
				                      _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				match(LET);
				setState(669);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(670);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(671);
				match(DPUNTO2);
				setState(672);
				((DeclaracionContext)_localctx).array_type = array_type();
				setState(673);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(674);
				((DeclaracionContext)_localctx).expression = expression(0);

				                      _localctx.instr = instruction.NewArrayDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).array_type.ty, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(677);
				match(LET);
				setState(678);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(679);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(680);
				match(DPUNTO2);
				setState(681);
				((DeclaracionContext)_localctx).vector_types = vector_types();
				setState(682);
				match(ASIGNACION);
				setState(683);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(684);
				match(DOSPUNTO);
				setState(685);
				match(NEW);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).vector_types.tipo, nil, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), nil, "")
				                    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(688);
				match(LET);
				setState(689);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(690);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(691);
				match(DPUNTO2);
				setState(692);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(693);
				match(MENOR);
				setState(694);
				((DeclaracionContext)_localctx).idob = match(ID);
				setState(695);
				match(MAYOR);
				setState(696);
				match(ASIGNACION);
				setState(697);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(698);
				match(DOSPUNTO);
				setState(699);
				match(NEW);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.STRUCT, nil, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), nil, (((DeclaracionContext)_localctx).idob!=null?((DeclaracionContext)_localctx).idob.getText():null))
				                    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(702);
				match(LET);
				setState(703);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(704);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(705);
				match(DPUNTO2);
				setState(706);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(707);
				match(MENOR);
				setState(708);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(709);
				match(MAYOR);
				setState(710);
				match(ASIGNACION);
				setState(711);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(712);
				match(DOSPUNTO);
				setState(713);
				match(CAPACITY);
				setState(714);
				match(PARIZQ);
				setState(715);
				((DeclaracionContext)_localctx).expression = expression(0);
				setState(716);
				match(PARDER);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), nil, "")
				                    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(719);
				match(LET);
				setState(720);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(721);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(722);
				match(DPUNTO2);
				setState(723);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(724);
				match(MENOR);
				setState(725);
				((DeclaracionContext)_localctx).idob = match(ID);
				setState(726);
				match(MAYOR);
				setState(727);
				match(ASIGNACION);
				setState(728);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(729);
				match(DOSPUNTO);
				setState(730);
				match(CAPACITY);
				setState(731);
				match(PARIZQ);
				setState(732);
				((DeclaracionContext)_localctx).expression = expression(0);
				setState(733);
				match(PARDER);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), nil, (((DeclaracionContext)_localctx).idob!=null?((DeclaracionContext)_localctx).idob.getText():null))
				                    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(736);
				match(LET);
				setState(737);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(738);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(739);
				match(DPUNTO2);
				setState(740);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(741);
				match(MENOR);
				setState(742);
				((DeclaracionContext)_localctx).idob = match(ID);
				setState(743);
				match(MAYOR);
				setState(744);
				match(ASIGNACION);
				setState(745);
				((DeclaracionContext)_localctx).expression = expression(0);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, nil, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), ((DeclaracionContext)_localctx).expression.p, (((DeclaracionContext)_localctx).idob!=null?((DeclaracionContext)_localctx).idob.getText():null))
				                    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(748);
				match(LET);
				setState(749);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(750);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(751);
				match(DPUNTO2);
				setState(752);
				((DeclaracionContext)_localctx).VECN = match(VECN);
				setState(753);
				match(MENOR);
				setState(754);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(755);
				match(MAYOR);
				setState(756);
				match(ASIGNACION);
				setState(757);
				((DeclaracionContext)_localctx).expression = expression(0);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, nil, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getLine():0), (((DeclaracionContext)_localctx).VECN!=null?((DeclaracionContext)_localctx).VECN.getCharPositionInLine():0), ((DeclaracionContext)_localctx).expression.p, "")
				                    
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
		enterRule(_localctx, 62, RULE_is_mut);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
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

	public static class LetidContext extends ParserRuleContext {
		public TerminalNode DPUNTO2() { return getToken(RustPar.DPUNTO2, 0); }
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public LetidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letid; }
	}

	public final LetidContext letid() throws RecognitionException {
		LetidContext _localctx = new LetidContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_letid);
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DPUNTO2:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(DPUNTO2);
				setState(768);
				match(ID);
				}
				break;
			case ASIGNACION:
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

	public static class Vector_typesContext extends ParserRuleContext {
		public interfaces.TipoExpresion tipo;
		public Tipos_varContext tipos_var;
		public TerminalNode VECN() { return getToken(RustPar.VECN, 0); }
		public TerminalNode MENOR() { return getToken(RustPar.MENOR, 0); }
		public Vector_typesContext vector_types() {
			return getRuleContext(Vector_typesContext.class,0);
		}
		public TerminalNode MAYOR() { return getToken(RustPar.MAYOR, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public Vector_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_types; }
	}

	public final Vector_typesContext vector_types() throws RecognitionException {
		Vector_typesContext _localctx = new Vector_typesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_vector_types);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(VECN);
				setState(773);
				match(MENOR);
				setState(774);
				vector_types();
				setState(775);
				match(MAYOR);
				 _localctx.tipo = interfaces.VECTOR 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
				match(VECN);
				setState(779);
				match(MENOR);
				setState(780);
				((Vector_typesContext)_localctx).tipos_var = tipos_var();
				setState(781);
				match(MAYOR);
				 _localctx.tipo = ((Vector_typesContext)_localctx).tipos_var.tipo 
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
		enterRule(_localctx, 68, RULE_array_type);

		    _localctx.ty = arrayList.New()

		try {
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(787);
				((Array_typeContext)_localctx).array_type = array_type();
				setState(788);
				match(PTCOMA);
				setState(789);
				((Array_typeContext)_localctx).expression = expression(0);
				setState(790);
				match(CORDER);

				                                        nType := interfaces.NewArrayType(interfaces.ARRAY, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                        ((Array_typeContext)_localctx).array_type.ty.Add(nType)
				                                        _localctx.ty = ((Array_typeContext)_localctx).array_type.ty
				                                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(794);
				((Array_typeContext)_localctx).tipos_var = tipos_var();
				setState(795);
				match(PTCOMA);
				setState(796);
				((Array_typeContext)_localctx).expression = expression(0);
				setState(797);
				match(CORDER);

				                                      nType := interfaces.NewArrayType(((Array_typeContext)_localctx).tipos_var.tipo, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                      _localctx.ty.Add(nType)
				                                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(801);
				((Array_typeContext)_localctx).tipos_var = tipos_var();
				setState(802);
				match(CORDER);

				                                      nType := interfaces.NewArrayType(((Array_typeContext)_localctx).tipos_var.tipo, nil, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
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
		public ExpressionContext index;
		public ExpressionContext val;
		public TerminalNode ASIGNACION() { return getToken(RustPar.ASIGNACION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public List_indexContext list_index() {
			return getRuleContext(List_indexContext.class,0);
		}
		public L_AccessStructContext l_AccessStruct() {
			return getRuleContext(L_AccessStructContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(RustPar.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(RustPar.CORDER, 0); }
		public TerminalNode PUNTO() { return getToken(RustPar.PUNTO, 0); }
		public TerminalNode VECN() { return getToken(RustPar.VECN, 0); }
		public TerminalNode DOSPUNTO() { return getToken(RustPar.DOSPUNTO, 0); }
		public TerminalNode CAPACITY() { return getToken(RustPar.CAPACITY, 0); }
		public TerminalNode PARIZQ() { return getToken(RustPar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(RustPar.PARDER, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_asignacion);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				((AsignacionContext)_localctx).id = match(ID);
				setState(808);
				match(ASIGNACION);
				setState(809);
				((AsignacionContext)_localctx).expression = expression(0);
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, nil, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				((AsignacionContext)_localctx).id = match(ID);
				setState(813);
				((AsignacionContext)_localctx).list_index = list_index(0);
				setState(814);
				match(ASIGNACION);
				setState(815);
				((AsignacionContext)_localctx).expression = expression(0);
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, ((AsignacionContext)_localctx).list_index.lista, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				((AsignacionContext)_localctx).l_AccessStruct = l_AccessStruct(0);
				setState(819);
				match(ASIGNACION);
				setState(820);
				((AsignacionContext)_localctx).expression = expression(0);
				 _localctx.instr = instruction.NewAssignmentStruct(((AsignacionContext)_localctx).l_AccessStruct.l, ((AsignacionContext)_localctx).expression.p, (((AsignacionContext)_localctx).l_AccessStruct!=null?(((AsignacionContext)_localctx).l_AccessStruct.start):null).GetLine(),(((AsignacionContext)_localctx).l_AccessStruct!=null?(((AsignacionContext)_localctx).l_AccessStruct.start):null).GetColumn()) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(823);
				((AsignacionContext)_localctx).id = match(ID);
				setState(824);
				match(CORIZQ);
				setState(825);
				((AsignacionContext)_localctx).index = expression(0);
				setState(826);
				match(CORDER);
				setState(827);
				match(PUNTO);
				setState(828);
				((AsignacionContext)_localctx).l_AccessStruct = l_AccessStruct(0);
				setState(829);
				match(ASIGNACION);
				setState(830);
				((AsignacionContext)_localctx).val = expression(0);
				_localctx.instr = instruction.NewAssignmentVec((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null), ((AsignacionContext)_localctx).index.p, ((AsignacionContext)_localctx).l_AccessStruct.l, ((AsignacionContext)_localctx).val.p, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(833);
				((AsignacionContext)_localctx).id = match(ID);
				setState(834);
				match(ASIGNACION);
				setState(835);
				match(VECN);
				setState(836);
				match(DOSPUNTO);
				setState(837);
				match(CAPACITY);
				setState(838);
				match(PARIZQ);
				setState(839);
				((AsignacionContext)_localctx).expression = expression(0);
				setState(840);
				match(PARDER);

				                        _localctx.instr = instruction.NewAssignmentVecap((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null), ((AsignacionContext)_localctx).expression.p, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getCharPositionInLine():0))
				                
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_l_AccessStruct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(846);
			((L_AccessStructContext)_localctx).ID = match(ID);

			            _localctx.l = arrayList.New()
			            _localctx.l.Add((((L_AccessStructContext)_localctx).ID!=null?((L_AccessStructContext)_localctx).ID.getText():null))

			}
			_ctx.stop = _input.LT(-1);
			setState(855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
					setState(849);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(850);
					match(PUNTO);
					setState(851);
					((L_AccessStructContext)_localctx).ID = match(ID);

					                                             ((L_AccessStructContext)_localctx).list.l.Add((((L_AccessStructContext)_localctx).ID!=null?((L_AccessStructContext)_localctx).ID.getText():null))
					                                             _localctx.l = ((L_AccessStructContext)_localctx).list.l
					                                            
					}
					} 
				}
				setState(857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_list_index, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(859);
			((List_indexContext)_localctx).index_array = index_array();
			_localctx.lista.Add(((List_indexContext)_localctx).index_array.index)
			}
			_ctx.stop = _input.LT(-1);
			setState(868);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
					setState(862);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(863);
					((List_indexContext)_localctx).index_array = index_array();

					                                                ((List_indexContext)_localctx).listi.lista.Add(((List_indexContext)_localctx).index_array.index)
					                                                _localctx.lista = ((List_indexContext)_localctx).listi.lista
					                                            
					}
					} 
				}
				setState(870);
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
		enterRule(_localctx, 76, RULE_index_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(CORIZQ);
			setState(872);
			((Index_arrayContext)_localctx).expression = expression(0);
			setState(873);
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
		enterRule(_localctx, 78, RULE_if_sent);
		try {
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				((If_sentContext)_localctx).IF = match(IF);
				setState(877);
				((If_sentContext)_localctx).expression = expression(0);
				setState(878);
				((If_sentContext)_localctx).bloque_inst = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p, ((If_sentContext)_localctx).bloque_inst.l, nil,nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				((If_sentContext)_localctx).IF = match(IF);
				setState(882);
				((If_sentContext)_localctx).expression = expression(0);
				setState(883);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(884);
				match(ELSE);
				setState(885);
				((If_sentContext)_localctx).belse = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,nil,((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(888);
				((If_sentContext)_localctx).IF = match(IF);
				setState(889);
				((If_sentContext)_localctx).expression = expression(0);
				setState(890);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(891);
				((If_sentContext)_localctx).list_elseif = list_elseif();

				        _localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,((If_sentContext)_localctx).list_elseif.lista, nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(894);
				((If_sentContext)_localctx).IF = match(IF);
				setState(895);
				((If_sentContext)_localctx).expression = expression(0);
				setState(896);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(897);
				((If_sentContext)_localctx).list_elseif = list_elseif();
				setState(898);
				match(ELSE);
				setState(899);
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
		enterRule(_localctx, 80, RULE_if_exp);
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				((If_expContext)_localctx).IF = match(IF);
				setState(905);
				((If_expContext)_localctx).expression = expression(0);
				setState(906);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(907);
				match(ELSE);
				setState(908);
				((If_expContext)_localctx).belse_e = bloque_exp();
				_localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p, nil ,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, nil, ((If_expContext)_localctx).belse_e.p )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				((If_expContext)_localctx).IF = match(IF);
				setState(912);
				((If_expContext)_localctx).expression = expression(0);
				setState(913);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(914);
				((If_expContext)_localctx).list_elseif_exp = list_elseif_exp();
				setState(915);
				match(ELSE);
				setState(916);
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
		enterRule(_localctx, 82, RULE_list_elseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(922); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(921);
					((List_elseifContext)_localctx).else_if = else_if();
					((List_elseifContext)_localctx).list.add(((List_elseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(924); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 84, RULE_list_elseif_exp);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(929); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(928);
					((List_elseif_expContext)_localctx).else_if_exp = else_if_exp();
					((List_elseif_expContext)_localctx).list.add(((List_elseif_expContext)_localctx).else_if_exp);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(931); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 86, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			((Else_ifContext)_localctx).ELSE = match(ELSE);
			setState(936);
			match(IF);
			setState(937);
			((Else_ifContext)_localctx).expression = expression(0);
			setState(938);
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
		enterRule(_localctx, 88, RULE_else_if_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			((Else_if_expContext)_localctx).ELSE = match(ELSE);
			setState(942);
			match(IF);
			setState(943);
			((Else_if_expContext)_localctx).expression = expression(0);
			setState(944);
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
		enterRule(_localctx, 90, RULE_match_sent);
		int _la;
		try {
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(948);
				((Match_sentContext)_localctx).expression = expression(0);
				setState(949);
				match(LLAVEIZQ);
				setState(950);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(951);
				match(LLAVEDER);

				                        _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(955);
				((Match_sentContext)_localctx).expression = expression(0);
				setState(956);
				match(LLAVEIZQ);
				setState(957);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(958);
				match(GUIONB);
				setState(959);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(960);
				((Match_sentContext)_localctx).bloque_inst = bloque_inst();
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(961);
					match(COMA);
					}
				}

				setState(964);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, ((Match_sentContext)_localctx).bloque_inst.l, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(967);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(968);
				((Match_sentContext)_localctx).expression = expression(0);
				setState(969);
				match(LLAVEIZQ);
				setState(970);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(971);
				match(GUIONB);
				setState(972);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(973);
				((Match_sentContext)_localctx).instruccion_only = instruccion_only();
				setState(974);
				match(COMA);
				setState(975);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil,  ((Match_sentContext)_localctx).instruccion_only.instr,  (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, false )
				      
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(978);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(979);
				((Match_sentContext)_localctx).exp = expression(0);
				setState(980);
				match(LLAVEIZQ);
				setState(981);
				((Match_sentContext)_localctx).brazosexp = match_brazos_exp(0);
				setState(982);
				match(LLAVEDER);

				                        _localctx.p = instructionExpre.NewMatch(((Match_sentContext)_localctx).exp.p, ((Match_sentContext)_localctx).brazosexp.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn(), nil, true )
				      
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(985);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(986);
				((Match_sentContext)_localctx).exp = expression(0);
				setState(987);
				match(LLAVEIZQ);
				setState(988);
				((Match_sentContext)_localctx).brazosexp = match_brazos_exp(0);
				setState(989);
				match(GUIONB);
				setState(990);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(991);
				((Match_sentContext)_localctx).exp_ = expression(0);
				setState(992);
				match(COMA);
				setState(993);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_match_brazos, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(999);
			((Match_brazosContext)_localctx).matchbrazo = matchbrazo();
			_localctx.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(1008);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
					setState(1002);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1003);
					((Match_brazosContext)_localctx).matchbrazo = matchbrazo();

					                                              ((Match_brazosContext)_localctx).listb.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
					                                              _localctx.l_brazos = ((Match_brazosContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_match_brazos_exp, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1012);
			((Match_brazos_expContext)_localctx).matchbrazo_exp = matchbrazo_exp();
			_localctx.l_brazos.Add(((Match_brazos_expContext)_localctx).matchbrazo_exp.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(1021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
					setState(1015);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1016);
					((Match_brazos_expContext)_localctx).matchbrazo_exp = matchbrazo_exp();

					                                              ((Match_brazos_expContext)_localctx).listb.l_brazos.Add(((Match_brazos_expContext)_localctx).matchbrazo_exp.brazo)
					                                              _localctx.l_brazos = ((Match_brazos_expContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(1023);
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
		enterRule(_localctx, 96, RULE_matchbrazo);
		try {
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(1025);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(1026);
				((MatchbrazoContext)_localctx).bloque_inst = bloque_inst();
				setState(1028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(1027);
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
				setState(1032);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(1033);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(1034);
				((MatchbrazoContext)_localctx).instruccion_only = instruccion_only();
				setState(1035);
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
		enterRule(_localctx, 98, RULE_matchbrazo_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			((Matchbrazo_expContext)_localctx).listaOpciones = listaOpciones(0);
			setState(1041);
			((Matchbrazo_expContext)_localctx).th = match(MTHEN);
			setState(1042);
			((Matchbrazo_expContext)_localctx).expression = expression(0);
			setState(1043);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_listaOpciones, _p);

		    _localctx.lisop = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1047);
			((ListaOpcionesContext)_localctx).primitivo = primitivo();

			                    _localctx.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
			                  
			}
			_ctx.stop = _input.LT(-1);
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
					setState(1050);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1051);
					match(MTOR);
					setState(1052);
					((ListaOpcionesContext)_localctx).primitivo = primitivo();

					                                                      ((ListaOpcionesContext)_localctx).list.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
					                                                      _localctx.lisop =  ((ListaOpcionesContext)_localctx).list.lisop
					                                                    
					}
					} 
				}
				setState(1059);
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
		enterRule(_localctx, 102, RULE_bloque_inst);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				match(LLAVEIZQ);
				setState(1061);
				((Bloque_instContext)_localctx).instrucciones = instrucciones();
				setState(1062);
				match(LLAVEDER);
				_localctx.l = ((Bloque_instContext)_localctx).instrucciones.l 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				match(LLAVEIZQ);
				setState(1066);
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
		enterRule(_localctx, 104, RULE_bloque_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			match(LLAVEIZQ);
			setState(1071);
			((Bloque_expContext)_localctx).expression = expression(0);
			setState(1072);
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
		public TerminalNode T_CHAT() { return getToken(RustPar.T_CHAT, 0); }
		public TerminalNode T_ARRAY() { return getToken(RustPar.T_ARRAY, 0); }
		public TerminalNode T_VECTOR() { return getToken(RustPar.T_VECTOR, 0); }
		public TerminalNode USIZE() { return getToken(RustPar.USIZE, 0); }
		public Tipos_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_var; }
	}

	public final Tipos_varContext tipos_var() throws RecognitionException {
		Tipos_varContext _localctx = new Tipos_varContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tipos_var);
		try {
			setState(1095);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				match(T_NUMBER);
				_localctx.tipo = interfaces.INTEGER
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1077);
				match(T_STRING);
				_localctx.tipo = interfaces.STRING
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(T_FLOAT);
				_localctx.tipo = interfaces.FLOAT
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1081);
				match(T_BOOL);
				_localctx.tipo = interfaces.BOOLEAN
				}
				break;
			case T_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(1083);
				match(T_STR);
				_localctx.tipo = interfaces.STR
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1085);
				match(STRUCT);
				_localctx.tipo = interfaces.STRUCT
				}
				break;
			case T_CHAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1087);
				match(T_CHAT);
				_localctx.tipo = interfaces.CHAR
				}
				break;
			case T_ARRAY:
				enterOuterAlt(_localctx, 8);
				{
				setState(1089);
				match(T_ARRAY);
				_localctx.tipo = interfaces.ARRAY
				}
				break;
			case T_VECTOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(1091);
				match(T_VECTOR);
				_localctx.tipo = interfaces.VECTOR
				}
				break;
			case USIZE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1093);
				match(USIZE);
				 _localctx.tipo = interfaces.INTEGER 
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
		public ExpressionContext exp;
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
		public TerminalNode ABS() { return getToken(RustPar.ABS, 0); }
		public TerminalNode SQRT() { return getToken(RustPar.SQRT, 0); }
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1098);
			((ExpressionContext)_localctx).expr_arit = expr_arit(0);
			_localctx.p = ((ExpressionContext)_localctx).expr_arit.p
			}
			_ctx.stop = _input.LT(-1);
			setState(1117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e_ini = _prevctx;
						_localctx.e_ini = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1101);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1102);
						match(PUNTO);
						setState(1103);
						match(PUNTO);
						setState(1104);
						((ExpressionContext)_localctx).e_fin = expression(4);
						 _localctx.p = expresion.NewRangeF(((ExpressionContext)_localctx).e_ini.p, ((ExpressionContext)_localctx).e_fin.p, (((ExpressionContext)_localctx).e_ini!=null?(((ExpressionContext)_localctx).e_ini.start):null).GetLine(),(((ExpressionContext)_localctx).e_ini!=null?(((ExpressionContext)_localctx).e_ini.start):null).GetColumn() ) 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1108);
						match(PUNTO);
						setState(1109);
						match(ABS);
						 _localctx.p = expresion.NewAbs(((ExpressionContext)_localctx).exp.p, (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).GetLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).GetColumn() ) 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1111);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1112);
						match(PUNTO);
						setState(1113);
						match(SQRT);
						 _localctx.p = expresion.NewSqrt(((ExpressionContext)_localctx).exp.p, (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).GetLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).GetColumn() ) 
						}
						break;
					}
					} 
				}
				setState(1119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		public Token ID;
		public ExpressionContext val;
		public ExpressionContext expression;
		public Token CORIZQ;
		public ExpressionContext exp;
		public ExpressionContext tam;
		public ListParamsContext live;
		public ListParamsContext listParams;
		public L_StructExpContext l_StructExp;
		public PrimitivoContext primitivo;
		public CasteoContext casteo;
		public If_expContext if_exp;
		public Match_sentContext match_sent;
		public LoopBContext loopB;
		public CallFunctionContext callFunction;
		public CallModuloContext callModulo;
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
		public TerminalNode ID() { return getToken(RustPar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(RustPar.PUNTO, 0); }
		public TerminalNode CONTAINS() { return getToken(RustPar.CONTAINS, 0); }
		public TerminalNode AMP() { return getToken(RustPar.AMP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CAPF() { return getToken(RustPar.CAPF, 0); }
		public TerminalNode VEC() { return getToken(RustPar.VEC, 0); }
		public TerminalNode CORIZQ() { return getToken(RustPar.CORIZQ, 0); }
		public TerminalNode PTCOMA() { return getToken(RustPar.PTCOMA, 0); }
		public TerminalNode CORDER() { return getToken(RustPar.CORDER, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
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
		public CallModuloContext callModulo() {
			return getRuleContext(CallModuloContext.class,0);
		}
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
		public TerminalNode CLONE() { return getToken(RustPar.CLONE, 0); }
		public TerminalNode TO_STRING() { return getToken(RustPar.TO_STRING, 0); }
		public TerminalNode TO_OWNED() { return getToken(RustPar.TO_OWNED, 0); }
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(1121);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(1122);
				((Expr_aritContext)_localctx).opU = expr_arit(29);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(1125);
				match(T_NUMBER);
				setState(1126);
				match(DOSPUNTO);
				setState(1127);
				((Expr_aritContext)_localctx).op = match(POW);
				setState(1128);
				match(PARIZQ);
				setState(1129);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(1130);
				match(COMA);
				setState(1131);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(1132);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 3:
				{
				setState(1135);
				match(T_FLOAT);
				setState(1136);
				match(DOSPUNTO);
				setState(1137);
				((Expr_aritContext)_localctx).op = match(POWF);
				setState(1138);
				match(PARIZQ);
				setState(1139);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(1140);
				match(COMA);
				setState(1141);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(1142);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 4:
				{
				setState(1145);
				((Expr_aritContext)_localctx).op = match(NOT);
				setState(1146);
				((Expr_aritContext)_localctx).opU = expr_arit(22);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"!",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 5:
				{
				setState(1149);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(1150);
				match(PUNTO);
				setState(1151);
				match(CONTAINS);
				setState(1152);
				match(PARIZQ);
				setState(1153);
				match(AMP);
				setState(1154);
				((Expr_aritContext)_localctx).val = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(1155);
				match(PARDER);
				_localctx.p = expresion.NewContains((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).val.p, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0)  )
				}
				break;
			case 6:
				{
				setState(1158);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(1159);
				match(PUNTO);
				setState(1160);
				match(CAPF);
				_localctx.p = expresion.NewCapacity((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0)  )
				}
				break;
			case 7:
				{
				setState(1162);
				match(VEC);
				setState(1163);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(1164);
				((Expr_aritContext)_localctx).exp = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(1165);
				match(PTCOMA);
				setState(1166);
				((Expr_aritContext)_localctx).tam = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(1167);
				match(CORDER);
				 _localctx.p = expresion.NewVector(nil, ((Expr_aritContext)_localctx).exp.p, ((Expr_aritContext)_localctx).tam.p, 2, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 8:
				{
				setState(1170);
				match(VEC);
				setState(1171);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(1172);
				((Expr_aritContext)_localctx).live = ((Expr_aritContext)_localctx).listParams = listParams(0);
				setState(1173);
				match(CORDER);
				 _localctx.p = expresion.NewVector(((Expr_aritContext)_localctx).live.l_e, nil, nil, 1, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 9:
				{
				setState(1176);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(1177);
				((Expr_aritContext)_localctx).exp = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(1178);
				match(PTCOMA);
				setState(1179);
				((Expr_aritContext)_localctx).tam = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(1180);
				match(CORDER);
				 _localctx.p = expresion.NewArray(nil, ((Expr_aritContext)_localctx).exp.p, ((Expr_aritContext)_localctx).tam.p, 2, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 10:
				{
				setState(1183);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(1184);
				((Expr_aritContext)_localctx).listParams = listParams(0);
				setState(1185);
				match(CORDER);
				    _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listParams.l_e, nil, nil, 1, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 11:
				{
				setState(1188);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(1189);
				match(LLAVEIZQ);
				setState(1190);
				((Expr_aritContext)_localctx).l_StructExp = l_StructExp(0);
				setState(1191);
				match(LLAVEDER);
				 _localctx.p = instructionExpre.NewStructExpre((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).l_StructExp.l, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0) ) 
				}
				break;
			case 12:
				{
				setState(1194);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 13:
				{
				setState(1197);
				match(PARIZQ);
				setState(1198);
				((Expr_aritContext)_localctx).expression = expression(0);
				setState(1199);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 14:
				{
				setState(1202);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			case 15:
				{
				setState(1205);
				((Expr_aritContext)_localctx).if_exp = if_exp();
				_localctx.p = ((Expr_aritContext)_localctx).if_exp.p
				}
				break;
			case 16:
				{
				setState(1208);
				((Expr_aritContext)_localctx).match_sent = match_sent();
				_localctx.p = ((Expr_aritContext)_localctx).match_sent.p
				}
				break;
			case 17:
				{
				setState(1211);
				((Expr_aritContext)_localctx).loopB = loopB();
				 _localctx.p = ((Expr_aritContext)_localctx).loopB.p 
				}
				break;
			case 18:
				{
				setState(1214);
				((Expr_aritContext)_localctx).callFunction = callFunction();
				_localctx.p = ((Expr_aritContext)_localctx).callFunction.p
				}
				break;
			case 19:
				{
				setState(1217);
				((Expr_aritContext)_localctx).callModulo = callModulo();
				_localctx.p = ((Expr_aritContext)_localctx).callModulo.p
				}
				break;
			case 20:
				{
				setState(1220);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(1221);
				match(PUNTO);
				setState(1222);
				match(REMOVE);
				setState(1223);
				match(PARIZQ);
				setState(1224);
				((Expr_aritContext)_localctx).expression = expression(0);
				setState(1225);
				match(PARDER);
				 _localctx.p = instructionExpre.NewRemove((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).expression.p, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0)) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1230);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1231);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (MUL - 68)) | (1L << (DIV - 68)) | (1L << (MOD - 68)))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1232);
						((Expr_aritContext)_localctx).opDe = expr_arit(27);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1235);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1236);
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
						setState(1237);
						((Expr_aritContext)_localctx).opDe = expr_arit(25);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1240);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1241);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (DISTINTO - 62)) | (1L << (IGUAL - 62)) | (1L << (MAYORIGUAL - 62)) | (1L << (MENORIGUAL - 62)) | (1L << (MAYOR - 62)) | (1L << (MENOR - 62)))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1242);
						((Expr_aritContext)_localctx).opDe = expr_arit(24);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1245);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1246);
						((Expr_aritContext)_localctx).op = match(AND);
						setState(1247);
						((Expr_aritContext)_localctx).opDe = expr_arit(22);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1250);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1251);
						((Expr_aritContext)_localctx).op = match(OR);
						setState(1252);
						((Expr_aritContext)_localctx).opDe = expr_arit(21);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 6:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1255);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1256);
						match(PUNTO);
						setState(1257);
						match(LEN);
						_localctx.p = expresion.NewLen(((Expr_aritContext)_localctx).opIz.p, (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(), (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn()  )
						}
						break;
					case 7:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1259);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1260);
						match(PUNTO);
						setState(1261);
						match(CLONE);
						 _localctx.p = expresion.NewClone(((Expr_aritContext)_localctx).opIz.p, (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(), (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn() ) 
						}
						break;
					case 8:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1263);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1264);
						match(TO_STRING);
						 _localctx.p = expresion.NewToString(((Expr_aritContext)_localctx).opIz.p, (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(), (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn() ) 
						}
						break;
					case 9:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1266);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1267);
						match(TO_OWNED);
						 _localctx.p = expresion.NewToString(((Expr_aritContext)_localctx).opIz.p, (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(), (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn() ) 
						}
						break;
					}
					} 
				}
				setState(1273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 112, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(1275);
			((CasteoContext)_localctx).expression = expression(0);
			setState(1276);
			match(AS);
			setState(1277);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(1278);
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
		public TerminalNode USIZE() { return getToken(RustPar.USIZE, 0); }
		public Tipo_castContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_cast; }
	}

	public final Tipo_castContext tipo_cast() throws RecognitionException {
		Tipo_castContext _localctx = new Tipo_castContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_tipo_cast);
		try {
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				match(T_NUMBER);
				_localctx.tc = interfaces.INTEGER
				}
				break;
			case USIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1285);
				match(USIZE);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_l_StructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1290);
			((L_StructExpContext)_localctx).ID = match(ID);
			setState(1291);
			match(DPUNTO2);
			setState(1292);
			((L_StructExpContext)_localctx).expression = expression(0);

			                    Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
			                    ((L_StructExpContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add(Str_ep);
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(1304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
					setState(1295);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1296);
					match(COMA);
					setState(1297);
					((L_StructExpContext)_localctx).ID = match(ID);
					setState(1298);
					match(DPUNTO2);
					setState(1299);
					((L_StructExpContext)_localctx).expression = expression(0);

					                                                  Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
					                                                  ((L_StructExpContext)_localctx).list.l.Add(Str_ep);
					                                                  ((L_StructExpContext)_localctx).l =  ((L_StructExpContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		public Token CHAR;
		public Token TRUE;
		public Token FALSE;
		public ListIDArrayContext list;
		public TerminalNode NUMBER() { return getToken(RustPar.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(RustPar.FLOAT, 0); }
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(RustPar.CHAR, 0); }
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
		enterRule(_localctx, 118, RULE_primitivo);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307);
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
				setState(1309);
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
				setState(1311);
				((PrimitivoContext)_localctx).strings = strings();
				_localctx.p = ((PrimitivoContext)_localctx).strings.p
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1314);
				((PrimitivoContext)_localctx).CHAR = match(CHAR);

				                chr := (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null)
				                _localctx.p = expresion.NewPrimitivo(chr[1:len(chr)-1],interfaces.CHAR, (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getLine():0), (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getCharPositionInLine():0))
				                
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1316);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1318);
				((PrimitivoContext)_localctx).FALSE = match(FALSE);
				 _localctx.p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).FALSE!=null?((PrimitivoContext)_localctx).FALSE.getLine():0), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(1320);
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_listIDArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1326);
			((ListIDArrayContext)_localctx).ID = match(ID);
			 
			      _localctx.p = expresion.NewIdentificador((((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getLine():0), localctx.(*ListIDArrayContext).Get_ID().GetColumn() )
			}
			_ctx.stop = _input.LT(-1);
			setState(1341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new ListIDArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listIDArray);
						setState(1329);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1330);
						((ListIDArrayContext)_localctx).CORIZQ = match(CORIZQ);
						setState(1331);
						((ListIDArrayContext)_localctx).expression = expression(0);
						setState(1332);
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
						setState(1335);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1336);
						match(PUNTO);
						setState(1337);
						((ListIDArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expresion.NewStructAccess(((ListIDArrayContext)_localctx).list.p, (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).list!=null?(((ListIDArrayContext)_localctx).list.start):null).GetLine(), (((ListIDArrayContext)_localctx).list!=null?(((ListIDArrayContext)_localctx).list.start):null).GetColumn() )  
						}
						break;
					}
					} 
				}
				setState(1343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 122, RULE_strings);
		int _la;
		try {
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1344);
					match(AMP);
					}
					}
					setState(1347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AMP );
				setState(1349);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(1351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(1350);
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
				setState(1354);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(1355);
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
				setState(1357);
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
			return list_globals_sempred((List_globalsContext)_localctx, predIndex);
		case 5:
			return bodyModule_l_sempred((BodyModule_lContext)_localctx, predIndex);
		case 9:
			return params_declar_sempred((Params_declarContext)_localctx, predIndex);
		case 16:
			return listdecStruct_sempred((ListdecStructContext)_localctx, predIndex);
		case 19:
			return listModulec_sempred((ListModulecContext)_localctx, predIndex);
		case 27:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 28:
			return listParamsCall_sempred((ListParamsCallContext)_localctx, predIndex);
		case 36:
			return l_AccessStruct_sempred((L_AccessStructContext)_localctx, predIndex);
		case 37:
			return list_index_sempred((List_indexContext)_localctx, predIndex);
		case 46:
			return match_brazos_sempred((Match_brazosContext)_localctx, predIndex);
		case 47:
			return match_brazos_exp_sempred((Match_brazos_expContext)_localctx, predIndex);
		case 50:
			return listaOpciones_sempred((ListaOpcionesContext)_localctx, predIndex);
		case 54:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 55:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 58:
			return l_StructExp_sempred((L_StructExpContext)_localctx, predIndex);
		case 60:
			return listIDArray_sempred((ListIDArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean list_globals_sempred(List_globalsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bodyModule_l_sempred(BodyModule_lContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean params_declar_sempred(Params_declarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listdecStruct_sempred(ListdecStructContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listModulec_sempred(ListModulecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParamsCall_sempred(ListParamsCallContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean l_AccessStruct_sempred(L_AccessStructContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean list_index_sempred(List_indexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_sempred(Match_brazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_exp_sempred(Match_brazos_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaOpciones_sempred(ListaOpcionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 26);
		case 18:
			return precpred(_ctx, 24);
		case 19:
			return precpred(_ctx, 23);
		case 20:
			return precpred(_ctx, 21);
		case 21:
			return precpred(_ctx, 20);
		case 22:
			return precpred(_ctx, 25);
		case 23:
			return precpred(_ctx, 19);
		case 24:
			return precpred(_ctx, 18);
		case 25:
			return precpred(_ctx, 17);
		}
		return true;
	}
	private boolean l_StructExp_sempred(L_StructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listIDArray_sempred(ListIDArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 3);
		case 28:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3X\u0554\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0092\n\4\f\4\16\4\u0095\13\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a0\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b2\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1\13\7\3\b\3\b\3\b"+
		"\5\b\u00c6\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ce\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u012e\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u0139\n\13\f\13\16\13\u013c\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u016c\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u01b4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u01e8\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01fc\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u020f\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u021e\n\22\f\22\16\22\u0221\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u022d\n\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u023c\n\25\f\25\16\25\u023f"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0247\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0265\n\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0273"+
		"\n\35\f\35\16\35\u0276\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\7\36\u0283\n\36\f\36\16\36\u0286\13\36\3\37\3\37\3\37\3"+
		"\37\5\37\u028c\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \5 \u02fb\n \3!\3!\3!\5!\u0300\n!\3\"\3\"\3\"\5\"\u0305\n\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0313\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0328\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\5%\u034e\n%\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0358\n&\f&\16&\u035b"+
		"\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0365\n\'\f\'\16\'\u0368\13\'"+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0389\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\5*\u039a\n*\3+\6+\u039d\n+\r+\16+\u039e\3+\3+\3,\6,\u03a4"+
		"\n,\r,\16,\u03a5\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u03c5\n/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u03e7\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u03f1\n"+
		"\60\f\60\16\60\u03f4\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u03fe\n\61\f\61\16\61\u0401\13\61\3\62\3\62\3\62\3\62\5\62\u0407\n\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0411\n\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0422"+
		"\n\64\f\64\16\64\u0425\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5"+
		"\65\u042f\n\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u044a\n\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\78\u045e\n8\f8\168\u0461\138\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\59\u04cf\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\79\u04f8\n9\f9\169\u04fb\139\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\5"+
		";\u050a\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u0519\n<\f<\16<\u051c"+
		"\13<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u052e\n=\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\7>\u053e\n>\f>\16>\u0541\13>\3?"+
		"\6?\u0544\n?\r?\16?\u0545\3?\3?\5?\u054a\n?\3?\3?\3?\3?\3?\3?\5?\u0552"+
		"\n?\3?\2\22\6\f\24\"(8:JL^`fnpvz@\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\6\4\2F"+
		"GJJ\3\2HI\3\2@E\3\2\"#\2\u05b0\2~\3\2\2\2\4\u0084\3\2\2\2\6\u0089\3\2"+
		"\2\2\b\u009f\3\2\2\2\n\u00a1\3\2\2\2\f\u00b1\3\2\2\2\16\u00c5\3\2\2\2"+
		"\20\u00cd\3\2\2\2\22\u012d\3\2\2\2\24\u012f\3\2\2\2\26\u016b\3\2\2\2\30"+
		"\u016d\3\2\2\2\32\u01b3\3\2\2\2\34\u01e7\3\2\2\2\36\u01fb\3\2\2\2 \u01fd"+
		"\3\2\2\2\"\u020e\3\2\2\2$\u022c\3\2\2\2&\u022e\3\2\2\2(\u0232\3\2\2\2"+
		"*\u0246\3\2\2\2,\u0248\3\2\2\2.\u024e\3\2\2\2\60\u0252\3\2\2\2\62\u0257"+
		"\3\2\2\2\64\u0264\3\2\2\2\66\u0266\3\2\2\28\u0269\3\2\2\2:\u0277\3\2\2"+
		"\2<\u028b\3\2\2\2>\u02fa\3\2\2\2@\u02ff\3\2\2\2B\u0304\3\2\2\2D\u0312"+
		"\3\2\2\2F\u0327\3\2\2\2H\u034d\3\2\2\2J\u034f\3\2\2\2L\u035c\3\2\2\2N"+
		"\u0369\3\2\2\2P\u0388\3\2\2\2R\u0399\3\2\2\2T\u039c\3\2\2\2V\u03a3\3\2"+
		"\2\2X\u03a9\3\2\2\2Z\u03af\3\2\2\2\\\u03e6\3\2\2\2^\u03e8\3\2\2\2`\u03f5"+
		"\3\2\2\2b\u0410\3\2\2\2d\u0412\3\2\2\2f\u0418\3\2\2\2h\u042e\3\2\2\2j"+
		"\u0430\3\2\2\2l\u0449\3\2\2\2n\u044b\3\2\2\2p\u04ce\3\2\2\2r\u04fc\3\2"+
		"\2\2t\u0509\3\2\2\2v\u050b\3\2\2\2x\u052d\3\2\2\2z\u052f\3\2\2\2|\u0551"+
		"\3\2\2\2~\177\5\6\4\2\177\u0080\b\2\1\2\u0080\3\3\2\2\2\u0081\u0083\5"+
		"\32\16\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\b\3"+
		"\1\2\u0088\5\3\2\2\2\u0089\u008a\b\4\1\2\u008a\u008b\5\b\5\2\u008b\u008c"+
		"\b\4\1\2\u008c\u0093\3\2\2\2\u008d\u008e\f\4\2\2\u008e\u008f\5\b\5\2\u008f"+
		"\u0090\b\4\1\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\7\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\5\22\n\2\u0097\u0098\b\5\1\2\u0098\u00a0\3\2\2\2"+
		"\u0099\u009a\5\n\6\2\u009a\u009b\b\5\1\2\u009b\u00a0\3\2\2\2\u009c\u009d"+
		"\5 \21\2\u009d\u009e\b\5\1\2\u009e\u00a0\3\2\2\2\u009f\u0096\3\2\2\2\u009f"+
		"\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\t\3\2\2\2\u00a1\u00a2\7.\2\2"+
		"\u00a2\u00a3\7?\2\2\u00a3\u00a4\7Q\2\2\u00a4\u00a5\5\f\7\2\u00a5\u00a6"+
		"\7R\2\2\u00a6\u00a7\b\6\1\2\u00a7\13\3\2\2\2\u00a8\u00a9\b\7\1\2\u00a9"+
		"\u00aa\5\16\b\2\u00aa\u00ab\5\n\6\2\u00ab\u00ac\b\7\1\2\u00ac\u00b2\3"+
		"\2\2\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\5\20\t\2\u00af\u00b0\b\7\1\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\u00bf\3\2"+
		"\2\2\u00b3\u00b4\f\6\2\2\u00b4\u00b5\5\16\b\2\u00b5\u00b6\5\n\6\2\u00b6"+
		"\u00b7\b\7\1\2\u00b7\u00be\3\2\2\2\u00b8\u00b9\f\5\2\2\u00b9\u00ba\5\16"+
		"\b\2\u00ba\u00bb\5\20\t\2\u00bb\u00bc\b\7\1\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b3\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\r\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3"+
		"\7/\2\2\u00c3\u00c6\b\b\1\2\u00c4\u00c6\b\b\1\2\u00c5\u00c2\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\17\3\2\2\2\u00c7\u00c8\5\22\n\2\u00c8\u00c9\b\t\1"+
		"\2\u00c9\u00ce\3\2\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\b\t\1\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\21\3\2\2\2\u00cf"+
		"\u00d0\5\30\r\2\u00d0\u00d1\b\n\1\2\u00d1\u012e\3\2\2\2\u00d2\u00d3\7"+
		"\61\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5\7O\2\2\u00d5\u00d6\7P\2\2\u00d6"+
		"\u00d7\7\60\2\2\u00d7\u00d8\5l\67\2\u00d8\u00d9\5h\65\2\u00d9\u00da\b"+
		"\n\1\2\u00da\u012e\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd\7?\2\2\u00dd"+
		"\u00de\7O\2\2\u00de\u00df\7P\2\2\u00df\u00e0\7\60\2\2\u00e0\u00e1\7 \2"+
		"\2\u00e1\u00e2\7E\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7D\2\2\u00e4\u00e5"+
		"\5h\65\2\u00e5\u00e6\b\n\1\2\u00e6\u012e\3\2\2\2\u00e7\u00e8\7\61\2\2"+
		"\u00e8\u00e9\7?\2\2\u00e9\u00ea\7O\2\2\u00ea\u00eb\7P\2\2\u00eb\u00ec"+
		"\7\60\2\2\u00ec\u00ed\7?\2\2\u00ed\u00ee\5h\65\2\u00ee\u00ef\b\n\1\2\u00ef"+
		"\u012e\3\2\2\2\u00f0\u00f1\7\61\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f3\7O"+
		"\2\2\u00f3\u00f4\7P\2\2\u00f4\u00f5\5h\65\2\u00f5\u00f6\b\n\1\2\u00f6"+
		"\u012e\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7?\2\2\u00f9\u00fa\7O"+
		"\2\2\u00fa\u00fb\5\24\13\2\u00fb\u00fc\7P\2\2\u00fc\u00fd\5h\65\2\u00fd"+
		"\u00fe\b\n\1\2\u00fe\u012e\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0101\7"+
		"?\2\2\u0101\u0102\7O\2\2\u0102\u0103\5\24\13\2\u0103\u0104\7P\2\2\u0104"+
		"\u0105\7\60\2\2\u0105\u0106\5l\67\2\u0106\u0107\5h\65\2\u0107\u0108\b"+
		"\n\1\2\u0108\u012e\3\2\2\2\u0109\u010a\7\61\2\2\u010a\u010b\7?\2\2\u010b"+
		"\u010c\7O\2\2\u010c\u010d\5\24\13\2\u010d\u010e\7P\2\2\u010e\u010f\7\60"+
		"\2\2\u010f\u0110\7 \2\2\u0110\u0111\7E\2\2\u0111\u0112\7?\2\2\u0112\u0113"+
		"\7D\2\2\u0113\u0114\5h\65\2\u0114\u0115\b\n\1\2\u0115\u012e\3\2\2\2\u0116"+
		"\u0117\7\61\2\2\u0117\u0118\7?\2\2\u0118\u0119\7O\2\2\u0119\u011a\5\24"+
		"\13\2\u011a\u011b\7P\2\2\u011b\u011c\7\60\2\2\u011c\u011d\7 \2\2\u011d"+
		"\u011e\7E\2\2\u011e\u011f\5l\67\2\u011f\u0120\7D\2\2\u0120\u0121\5h\65"+
		"\2\u0121\u0122\b\n\1\2\u0122\u012e\3\2\2\2\u0123\u0124\7\61\2\2\u0124"+
		"\u0125\7?\2\2\u0125\u0126\7O\2\2\u0126\u0127\5\24\13\2\u0127\u0128\7P"+
		"\2\2\u0128\u0129\7\60\2\2\u0129\u012a\7?\2\2\u012a\u012b\5h\65\2\u012b"+
		"\u012c\b\n\1\2\u012c\u012e\3\2\2\2\u012d\u00cf\3\2\2\2\u012d\u00d2\3\2"+
		"\2\2\u012d\u00db\3\2\2\2\u012d\u00e7\3\2\2\2\u012d\u00f0\3\2\2\2\u012d"+
		"\u00f7\3\2\2\2\u012d\u00ff\3\2\2\2\u012d\u0109\3\2\2\2\u012d\u0116\3\2"+
		"\2\2\u012d\u0123\3\2\2\2\u012e\23\3\2\2\2\u012f\u0130\b\13\1\2\u0130\u0131"+
		"\5\26\f\2\u0131\u0132\b\13\1\2\u0132\u013a\3\2\2\2\u0133\u0134\f\4\2\2"+
		"\u0134\u0135\78\2\2\u0135\u0136\5\26\f\2\u0136\u0137\b\13\1\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0133\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\25\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\5@!\2"+
		"\u013e\u013f\7?\2\2\u013f\u0140\7;\2\2\u0140\u0141\5l\67\2\u0141\u0142"+
		"\b\f\1\2\u0142\u016c\3\2\2\2\u0143\u0144\7?\2\2\u0144\u0145\7;\2\2\u0145"+
		"\u0146\7N\2\2\u0146\u0147\7\35\2\2\u0147\u0148\5F$\2\u0148\u0149\b\f\1"+
		"\2\u0149\u016c\3\2\2\2\u014a\u014b\7?\2\2\u014b\u014c\7;\2\2\u014c\u014d"+
		"\5<\37\2\u014d\u014e\7 \2\2\u014e\u014f\7E\2\2\u014f\u0150\7?\2\2\u0150"+
		"\u0151\7D\2\2\u0151\u0152\b\f\1\2\u0152\u016c\3\2\2\2\u0153\u0154\7?\2"+
		"\2\u0154\u0155\7;\2\2\u0155\u0156\5<\37\2\u0156\u0157\7 \2\2\u0157\u0158"+
		"\7E\2\2\u0158\u0159\5l\67\2\u0159\u015a\7D\2\2\u015a\u015b\b\f\1\2\u015b"+
		"\u016c\3\2\2\2\u015c\u015d\7?\2\2\u015d\u015e\7;\2\2\u015e\u015f\5<\37"+
		"\2\u015f\u0160\7?\2\2\u0160\u0161\b\f\1\2\u0161\u016c\3\2\2\2\u0162\u0163"+
		"\5@!\2\u0163\u0164\7?\2\2\u0164\u0165\7;\2\2\u0165\u0166\7 \2\2\u0166"+
		"\u0167\7E\2\2\u0167\u0168\7?\2\2\u0168\u0169\7D\2\2\u0169\u016a\b\f\1"+
		"\2\u016a\u016c\3\2\2\2\u016b\u013d\3\2\2\2\u016b\u0143\3\2\2\2\u016b\u014a"+
		"\3\2\2\2\u016b\u0153\3\2\2\2\u016b\u015c\3\2\2\2\u016b\u0162\3\2\2\2\u016c"+
		"\27\3\2\2\2\u016d\u016e\7\61\2\2\u016e\u016f\7\62\2\2\u016f\u0170\7O\2"+
		"\2\u0170\u0171\7P\2\2\u0171\u0172\5h\65\2\u0172\u0173\b\r\1\2\u0173\31"+
		"\3\2\2\2\u0174\u0175\5,\27\2\u0175\u0176\79\2\2\u0176\u0177\b\16\1\2\u0177"+
		"\u01b4\3\2\2\2\u0178\u0179\5> \2\u0179\u017a\79\2\2\u017a\u017b\b\16\1"+
		"\2\u017b\u01b4\3\2\2\2\u017c\u017d\5H%\2\u017d\u017e\79\2\2\u017e\u017f"+
		"\b\16\1\2\u017f\u01b4\3\2\2\2\u0180\u0181\5\36\20\2\u0181\u0182\79\2\2"+
		"\u0182\u0183\b\16\1\2\u0183\u01b4\3\2\2\2\u0184\u0185\5P)\2\u0185\u0186"+
		"\b\16\1\2\u0186\u01b4\3\2\2\2\u0187\u0188\5\\/\2\u0188\u0189\b\16\1\2"+
		"\u0189\u01b4\3\2\2\2\u018a\u018b\5.\30\2\u018b\u018c\b\16\1\2\u018c\u01b4"+
		"\3\2\2\2\u018d\u018e\5\60\31\2\u018e\u018f\b\16\1\2\u018f\u01b4\3\2\2"+
		"\2\u0190\u0191\5\62\32\2\u0191\u0192\b\16\1\2\u0192\u01b4\3\2\2\2\u0193"+
		"\u0194\5\64\33\2\u0194\u0195\79\2\2\u0195\u0196\b\16\1\2\u0196\u01b4\3"+
		"\2\2\2\u0197\u0198\5\66\34\2\u0198\u0199\79\2\2\u0199\u019a\b\16\1\2\u019a"+
		"\u01b4\3\2\2\2\u019b\u019c\5 \21\2\u019c\u019d\b\16\1\2\u019d\u01b4\3"+
		"\2\2\2\u019e\u019f\5$\23\2\u019f\u01a0\79\2\2\u01a0\u01a1\b\16\1\2\u01a1"+
		"\u01b4\3\2\2\2\u01a2\u01a3\5*\26\2\u01a3\u01a4\79\2\2\u01a4\u01a5\b\16"+
		"\1\2\u01a5\u01b4\3\2\2\2\u01a6\u01a7\5&\24\2\u01a7\u01a8\79\2\2\u01a8"+
		"\u01a9\b\16\1\2\u01a9\u01b4\3\2\2\2\u01aa\u01ab\7?\2\2\u01ab\u01ac\7\67"+
		"\2\2\u01ac\u01ad\7-\2\2\u01ad\u01ae\7O\2\2\u01ae\u01af\5n8\2\u01af\u01b0"+
		"\7P\2\2\u01b0\u01b1\79\2\2\u01b1\u01b2\b\16\1\2\u01b2\u01b4\3\2\2\2\u01b3"+
		"\u0174\3\2\2\2\u01b3\u0178\3\2\2\2\u01b3\u017c\3\2\2\2\u01b3\u0180\3\2"+
		"\2\2\u01b3\u0184\3\2\2\2\u01b3\u0187\3\2\2\2\u01b3\u018a\3\2\2\2\u01b3"+
		"\u018d\3\2\2\2\u01b3\u0190\3\2\2\2\u01b3\u0193\3\2\2\2\u01b3\u0197\3\2"+
		"\2\2\u01b3\u019b\3\2\2\2\u01b3\u019e\3\2\2\2\u01b3\u01a2\3\2\2\2\u01b3"+
		"\u01a6\3\2\2\2\u01b3\u01aa\3\2\2\2\u01b4\33\3\2\2\2\u01b5\u01b6\5,\27"+
		"\2\u01b6\u01b7\b\17\1\2\u01b7\u01e8\3\2\2\2\u01b8\u01b9\5> \2\u01b9\u01ba"+
		"\b\17\1\2\u01ba\u01e8\3\2\2\2\u01bb\u01bc\5H%\2\u01bc\u01bd\b\17\1\2\u01bd"+
		"\u01e8\3\2\2\2\u01be\u01bf\5\36\20\2\u01bf\u01c0\b\17\1\2\u01c0\u01e8"+
		"\3\2\2\2\u01c1\u01c2\5P)\2\u01c2\u01c3\b\17\1\2\u01c3\u01e8\3\2\2\2\u01c4"+
		"\u01c5\5\\/\2\u01c5\u01c6\b\17\1\2\u01c6\u01e8\3\2\2\2\u01c7\u01c8\5."+
		"\30\2\u01c8\u01c9\b\17\1\2\u01c9\u01e8\3\2\2\2\u01ca\u01cb\5\60\31\2\u01cb"+
		"\u01cc\b\17\1\2\u01cc\u01e8\3\2\2\2\u01cd\u01ce\5\62\32\2\u01ce\u01cf"+
		"\b\17\1\2\u01cf\u01e8\3\2\2\2\u01d0\u01d1\5\64\33\2\u01d1\u01d2\b\17\1"+
		"\2\u01d2\u01e8\3\2\2\2\u01d3\u01d4\5\66\34\2\u01d4\u01d5\b\17\1\2\u01d5"+
		"\u01e8\3\2\2\2\u01d6\u01d7\5$\23\2\u01d7\u01d8\b\17\1\2\u01d8\u01e8\3"+
		"\2\2\2\u01d9\u01da\5*\26\2\u01da\u01db\b\17\1\2\u01db\u01e8\3\2\2\2\u01dc"+
		"\u01dd\5&\24\2\u01dd\u01de\b\17\1\2\u01de\u01e8\3\2\2\2\u01df\u01e0\7"+
		"?\2\2\u01e0\u01e1\7\67\2\2\u01e1\u01e2\7-\2\2\u01e2\u01e3\7O\2\2\u01e3"+
		"\u01e4\5n8\2\u01e4\u01e5\7P\2\2\u01e5\u01e6\b\17\1\2\u01e6\u01e8\3\2\2"+
		"\2\u01e7\u01b5\3\2\2\2\u01e7\u01b8\3\2\2\2\u01e7\u01bb\3\2\2\2\u01e7\u01be"+
		"\3\2\2\2\u01e7\u01c1\3\2\2\2\u01e7\u01c4\3\2\2\2\u01e7\u01c7\3\2\2\2\u01e7"+
		"\u01ca\3\2\2\2\u01e7\u01cd\3\2\2\2\u01e7\u01d0\3\2\2\2\u01e7\u01d3\3\2"+
		"\2\2\u01e7\u01d6\3\2\2\2\u01e7\u01d9\3\2\2\2\u01e7\u01dc\3\2\2\2\u01e7"+
		"\u01df\3\2\2\2\u01e8\35\3\2\2\2\u01e9\u01ea\7?\2\2\u01ea\u01eb\7\67\2"+
		"\2\u01eb\u01ec\7*\2\2\u01ec\u01ed\7O\2\2\u01ed\u01ee\5n8\2\u01ee\u01ef"+
		"\7P\2\2\u01ef\u01f0\b\20\1\2\u01f0\u01fc\3\2\2\2\u01f1\u01f2\7?\2\2\u01f2"+
		"\u01f3\7\67\2\2\u01f3\u01f4\7,\2\2\u01f4\u01f5\7O\2\2\u01f5\u01f6\5n8"+
		"\2\u01f6\u01f7\78\2\2\u01f7\u01f8\5n8\2\u01f8\u01f9\7P\2\2\u01f9\u01fa"+
		"\b\20\1\2\u01fa\u01fc\3\2\2\2\u01fb\u01e9\3\2\2\2\u01fb\u01f1\3\2\2\2"+
		"\u01fc\37\3\2\2\2\u01fd\u01fe\7\36\2\2\u01fe\u01ff\7?\2\2\u01ff\u0200"+
		"\7Q\2\2\u0200\u0201\5\"\22\2\u0201\u0202\7R\2\2\u0202\u0203\b\21\1\2\u0203"+
		"!\3\2\2\2\u0204\u0205\b\22\1\2\u0205\u0206\7?\2\2\u0206\u0207\7;\2\2\u0207"+
		"\u0208\5l\67\2\u0208\u0209\b\22\1\2\u0209\u020f\3\2\2\2\u020a\u020b\7"+
		"?\2\2\u020b\u020c\7;\2\2\u020c\u020d\7?\2\2\u020d\u020f\b\22\1\2\u020e"+
		"\u0204\3\2\2\2\u020e\u020a\3\2\2\2\u020f\u021f\3\2\2\2\u0210\u0211\f\6"+
		"\2\2\u0211\u0212\78\2\2\u0212\u0213\7?\2\2\u0213\u0214\7;\2\2\u0214\u0215"+
		"\5l\67\2\u0215\u0216\b\22\1\2\u0216\u021e\3\2\2\2\u0217\u0218\f\5\2\2"+
		"\u0218\u0219\78\2\2\u0219\u021a\7?\2\2\u021a\u021b\7;\2\2\u021b\u021c"+
		"\7?\2\2\u021c\u021e\b\22\1\2\u021d\u0210\3\2\2\2\u021d\u0217\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220#\3\2\2\2"+
		"\u0221\u021f\3\2\2\2\u0222\u0223\7?\2\2\u0223\u0224\7O\2\2\u0224\u0225"+
		"\7P\2\2\u0225\u022d\b\23\1\2\u0226\u0227\7?\2\2\u0227\u0228\7O\2\2\u0228"+
		"\u0229\5:\36\2\u0229\u022a\7P\2\2\u022a\u022b\b\23\1\2\u022b\u022d\3\2"+
		"\2\2\u022c\u0222\3\2\2\2\u022c\u0226\3\2\2\2\u022d%\3\2\2\2\u022e\u022f"+
		"\5(\25\2\u022f\u0230\5n8\2\u0230\u0231\b\24\1\2\u0231\'\3\2\2\2\u0232"+
		"\u0233\b\25\1\2\u0233\u0234\7?\2\2\u0234\u0235\7:\2\2\u0235\u0236\b\25"+
		"\1\2\u0236\u023d\3\2\2\2\u0237\u0238\f\4\2\2\u0238\u0239\7?\2\2\u0239"+
		"\u023a\7:\2\2\u023a\u023c\b\25\1\2\u023b\u0237\3\2\2\2\u023c\u023f\3\2"+
		"\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e)\3\2\2\2\u023f\u023d"+
		"\3\2\2\2\u0240\u0241\7\63\2\2\u0241\u0247\b\26\1\2\u0242\u0243\7\63\2"+
		"\2\u0243\u0244\5n8\2\u0244\u0245\b\26\1\2\u0245\u0247\3\2\2\2\u0246\u0240"+
		"\3\2\2\2\u0246\u0242\3\2\2\2\u0247+\3\2\2\2\u0248\u0249\7\3\2\2\u0249"+
		"\u024a\7O\2\2\u024a\u024b\58\35\2\u024b\u024c\7P\2\2\u024c\u024d\b\27"+
		"\1\2\u024d-\3\2\2\2\u024e\u024f\7\20\2\2\u024f\u0250\5h\65\2\u0250\u0251"+
		"\b\30\1\2\u0251/\3\2\2\2\u0252\u0253\7\17\2\2\u0253\u0254\5n8\2\u0254"+
		"\u0255\5h\65\2\u0255\u0256\b\31\1\2\u0256\61\3\2\2\2\u0257\u0258\7\21"+
		"\2\2\u0258\u0259\7?\2\2\u0259\u025a\7\22\2\2\u025a\u025b\5n8\2\u025b\u025c"+
		"\5h\65\2\u025c\u025d\b\32\1\2\u025d\63\3\2\2\2\u025e\u025f\7\23\2\2\u025f"+
		"\u0265\b\33\1\2\u0260\u0261\7\23\2\2\u0261\u0262\5n8\2\u0262\u0263\b\33"+
		"\1\2\u0263\u0265\3\2\2\2\u0264\u025e\3\2\2\2\u0264\u0260\3\2\2\2\u0265"+
		"\65\3\2\2\2\u0266\u0267\7\24\2\2\u0267\u0268\b\34\1\2\u0268\67\3\2\2\2"+
		"\u0269\u026a\b\35\1\2\u026a\u026b\5n8\2\u026b\u026c\b\35\1\2\u026c\u0274"+
		"\3\2\2\2\u026d\u026e\f\4\2\2\u026e\u026f\78\2\2\u026f\u0270\5n8\2\u0270"+
		"\u0271\b\35\1\2\u0271\u0273\3\2\2\2\u0272\u026d\3\2\2\2\u0273\u0276\3"+
		"\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u02759\3\2\2\2\u0276\u0274"+
		"\3\2\2\2\u0277\u0278\b\36\1\2\u0278\u0279\5<\37\2\u0279\u027a\5n8\2\u027a"+
		"\u027b\b\36\1\2\u027b\u0284\3\2\2\2\u027c\u027d\f\4\2\2\u027d\u027e\7"+
		"8\2\2\u027e\u027f\5<\37\2\u027f\u0280\5n8\2\u0280\u0281\b\36\1\2\u0281"+
		"\u0283\3\2\2\2\u0282\u027c\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2"+
		"\2\2\u0284\u0285\3\2\2\2\u0285;\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288"+
		"\7N\2\2\u0288\u0289\7\35\2\2\u0289\u028c\b\37\1\2\u028a\u028c\b\37\1\2"+
		"\u028b\u0287\3\2\2\2\u028b\u028a\3\2\2\2\u028c=\3\2\2\2\u028d\u028e\7"+
		"\34\2\2\u028e\u028f\5@!\2\u028f\u0290\7?\2\2\u0290\u0291\7;\2\2\u0291"+
		"\u0292\5l\67\2\u0292\u0293\7<\2\2\u0293\u0294\5n8\2\u0294\u0295\b \1\2"+
		"\u0295\u02fb\3\2\2\2\u0296\u0297\7\34\2\2\u0297\u0298\5@!\2\u0298\u0299"+
		"\7?\2\2\u0299\u029a\5B\"\2\u029a\u029b\7<\2\2\u029b\u029c\5n8\2\u029c"+
		"\u029d\b \1\2\u029d\u02fb\3\2\2\2\u029e\u029f\7\34\2\2\u029f\u02a0\5@"+
		"!\2\u02a0\u02a1\7?\2\2\u02a1\u02a2\7;\2\2\u02a2\u02a3\5F$\2\u02a3\u02a4"+
		"\7<\2\2\u02a4\u02a5\5n8\2\u02a5\u02a6\b \1\2\u02a6\u02fb\3\2\2\2\u02a7"+
		"\u02a8\7\34\2\2\u02a8\u02a9\5@!\2\u02a9\u02aa\7?\2\2\u02aa\u02ab\7;\2"+
		"\2\u02ab\u02ac\5D#\2\u02ac\u02ad\7<\2\2\u02ad\u02ae\7 \2\2\u02ae\u02af"+
		"\7:\2\2\u02af\u02b0\7%\2\2\u02b0\u02b1\b \1\2\u02b1\u02fb\3\2\2\2\u02b2"+
		"\u02b3\7\34\2\2\u02b3\u02b4\5@!\2\u02b4\u02b5\7?\2\2\u02b5\u02b6\7;\2"+
		"\2\u02b6\u02b7\7 \2\2\u02b7\u02b8\7E\2\2\u02b8\u02b9\7?\2\2\u02b9\u02ba"+
		"\7D\2\2\u02ba\u02bb\7<\2\2\u02bb\u02bc\7 \2\2\u02bc\u02bd\7:\2\2\u02bd"+
		"\u02be\7%\2\2\u02be\u02bf\b \1\2\u02bf\u02fb\3\2\2\2\u02c0\u02c1\7\34"+
		"\2\2\u02c1\u02c2\5@!\2\u02c2\u02c3\7?\2\2\u02c3\u02c4\7;\2\2\u02c4\u02c5"+
		"\7 \2\2\u02c5\u02c6\7E\2\2\u02c6\u02c7\5l\67\2\u02c7\u02c8\7D\2\2\u02c8"+
		"\u02c9\7<\2\2\u02c9\u02ca\7 \2\2\u02ca\u02cb\7:\2\2\u02cb\u02cc\7!\2\2"+
		"\u02cc\u02cd\7O\2\2\u02cd\u02ce\5n8\2\u02ce\u02cf\7P\2\2\u02cf\u02d0\b"+
		" \1\2\u02d0\u02fb\3\2\2\2\u02d1\u02d2\7\34\2\2\u02d2\u02d3\5@!\2\u02d3"+
		"\u02d4\7?\2\2\u02d4\u02d5\7;\2\2\u02d5\u02d6\7 \2\2\u02d6\u02d7\7E\2\2"+
		"\u02d7\u02d8\7?\2\2\u02d8\u02d9\7D\2\2\u02d9\u02da\7<\2\2\u02da\u02db"+
		"\7 \2\2\u02db\u02dc\7:\2\2\u02dc\u02dd\7!\2\2\u02dd\u02de\7O\2\2\u02de"+
		"\u02df\5n8\2\u02df\u02e0\7P\2\2\u02e0\u02e1\b \1\2\u02e1\u02fb\3\2\2\2"+
		"\u02e2\u02e3\7\34\2\2\u02e3\u02e4\5@!\2\u02e4\u02e5\7?\2\2\u02e5\u02e6"+
		"\7;\2\2\u02e6\u02e7\7 \2\2\u02e7\u02e8\7E\2\2\u02e8\u02e9\7?\2\2\u02e9"+
		"\u02ea\7D\2\2\u02ea\u02eb\7<\2\2\u02eb\u02ec\5n8\2\u02ec\u02ed\b \1\2"+
		"\u02ed\u02fb\3\2\2\2\u02ee\u02ef\7\34\2\2\u02ef\u02f0\5@!\2\u02f0\u02f1"+
		"\7?\2\2\u02f1\u02f2\7;\2\2\u02f2\u02f3\7 \2\2\u02f3\u02f4\7E\2\2\u02f4"+
		"\u02f5\5l\67\2\u02f5\u02f6\7D\2\2\u02f6\u02f7\7<\2\2\u02f7\u02f8\5n8\2"+
		"\u02f8\u02f9\b \1\2\u02f9\u02fb\3\2\2\2\u02fa\u028d\3\2\2\2\u02fa\u0296"+
		"\3\2\2\2\u02fa\u029e\3\2\2\2\u02fa\u02a7\3\2\2\2\u02fa\u02b2\3\2\2\2\u02fa"+
		"\u02c0\3\2\2\2\u02fa\u02d1\3\2\2\2\u02fa\u02e2\3\2\2\2\u02fa\u02ee\3\2"+
		"\2\2\u02fb?\3\2\2\2\u02fc\u02fd\7\35\2\2\u02fd\u0300\b!\1\2\u02fe\u0300"+
		"\3\2\2\2\u02ff\u02fc\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300A\3\2\2\2\u0301"+
		"\u0302\7;\2\2\u0302\u0305\7?\2\2\u0303\u0305\3\2\2\2\u0304\u0301\3\2\2"+
		"\2\u0304\u0303\3\2\2\2\u0305C\3\2\2\2\u0306\u0307\7 \2\2\u0307\u0308\7"+
		"E\2\2\u0308\u0309\5D#\2\u0309\u030a\7D\2\2\u030a\u030b\b#\1\2\u030b\u0313"+
		"\3\2\2\2\u030c\u030d\7 \2\2\u030d\u030e\7E\2\2\u030e\u030f\5l\67\2\u030f"+
		"\u0310\7D\2\2\u0310\u0311\b#\1\2\u0311\u0313\3\2\2\2\u0312\u0306\3\2\2"+
		"\2\u0312\u030c\3\2\2\2\u0313E\3\2\2\2\u0314\u0315\7S\2\2\u0315\u0316\5"+
		"F$\2\u0316\u0317\79\2\2\u0317\u0318\5n8\2\u0318\u0319\7T\2\2\u0319\u031a"+
		"\b$\1\2\u031a\u0328\3\2\2\2\u031b\u031c\7S\2\2\u031c\u031d\5l\67\2\u031d"+
		"\u031e\79\2\2\u031e\u031f\5n8\2\u031f\u0320\7T\2\2\u0320\u0321\b$\1\2"+
		"\u0321\u0328\3\2\2\2\u0322\u0323\7S\2\2\u0323\u0324\5l\67\2\u0324\u0325"+
		"\7T\2\2\u0325\u0326\b$\1\2\u0326\u0328\3\2\2\2\u0327\u0314\3\2\2\2\u0327"+
		"\u031b\3\2\2\2\u0327\u0322\3\2\2\2\u0328G\3\2\2\2\u0329\u032a\7?\2\2\u032a"+
		"\u032b\7<\2\2\u032b\u032c\5n8\2\u032c\u032d\b%\1\2\u032d\u034e\3\2\2\2"+
		"\u032e\u032f\7?\2\2\u032f\u0330\5L\'\2\u0330\u0331\7<\2\2\u0331\u0332"+
		"\5n8\2\u0332\u0333\b%\1\2\u0333\u034e\3\2\2\2\u0334\u0335\5J&\2\u0335"+
		"\u0336\7<\2\2\u0336\u0337\5n8\2\u0337\u0338\b%\1\2\u0338\u034e\3\2\2\2"+
		"\u0339\u033a\7?\2\2\u033a\u033b\7S\2\2\u033b\u033c\5n8\2\u033c\u033d\7"+
		"T\2\2\u033d\u033e\7\67\2\2\u033e\u033f\5J&\2\u033f\u0340\7<\2\2\u0340"+
		"\u0341\5n8\2\u0341\u0342\b%\1\2\u0342\u034e\3\2\2\2\u0343\u0344\7?\2\2"+
		"\u0344\u0345\7<\2\2\u0345\u0346\7 \2\2\u0346\u0347\7:\2\2\u0347\u0348"+
		"\7!\2\2\u0348\u0349\7O\2\2\u0349\u034a\5n8\2\u034a\u034b\7P\2\2\u034b"+
		"\u034c\b%\1\2\u034c\u034e\3\2\2\2\u034d\u0329\3\2\2\2\u034d\u032e\3\2"+
		"\2\2\u034d\u0334\3\2\2\2\u034d\u0339\3\2\2\2\u034d\u0343\3\2\2\2\u034e"+
		"I\3\2\2\2\u034f\u0350\b&\1\2\u0350\u0351\7?\2\2\u0351\u0352\b&\1\2\u0352"+
		"\u0359\3\2\2\2\u0353\u0354\f\4\2\2\u0354\u0355\7\67\2\2\u0355\u0356\7"+
		"?\2\2\u0356\u0358\b&\1\2\u0357\u0353\3\2\2\2\u0358\u035b\3\2\2\2\u0359"+
		"\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035aK\3\2\2\2\u035b\u0359\3\2\2\2"+
		"\u035c\u035d\b\'\1\2\u035d\u035e\5N(\2\u035e\u035f\b\'\1\2\u035f\u0366"+
		"\3\2\2\2\u0360\u0361\f\4\2\2\u0361\u0362\5N(\2\u0362\u0363\b\'\1\2\u0363"+
		"\u0365\3\2\2\2\u0364\u0360\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2"+
		"\2\2\u0366\u0367\3\2\2\2\u0367M\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a"+
		"\7S\2\2\u036a\u036b\5n8\2\u036b\u036c\7T\2\2\u036c\u036d\b(\1\2\u036d"+
		"O\3\2\2\2\u036e\u036f\7\r\2\2\u036f\u0370\5n8\2\u0370\u0371\5h\65\2\u0371"+
		"\u0372\b)\1\2\u0372\u0389\3\2\2\2\u0373\u0374\7\r\2\2\u0374\u0375\5n8"+
		"\2\u0375\u0376\5h\65\2\u0376\u0377\7\16\2\2\u0377\u0378\5h\65\2\u0378"+
		"\u0379\b)\1\2\u0379\u0389\3\2\2\2\u037a\u037b\7\r\2\2\u037b\u037c\5n8"+
		"\2\u037c\u037d\5h\65\2\u037d\u037e\5T+\2\u037e\u037f\b)\1\2\u037f\u0389"+
		"\3\2\2\2\u0380\u0381\7\r\2\2\u0381\u0382\5n8\2\u0382\u0383\5h\65\2\u0383"+
		"\u0384\5T+\2\u0384\u0385\7\16\2\2\u0385\u0386\5h\65\2\u0386\u0387\b)\1"+
		"\2\u0387\u0389\3\2\2\2\u0388\u036e\3\2\2\2\u0388\u0373\3\2\2\2\u0388\u037a"+
		"\3\2\2\2\u0388\u0380\3\2\2\2\u0389Q\3\2\2\2\u038a\u038b\7\r\2\2\u038b"+
		"\u038c\5n8\2\u038c\u038d\5j\66\2\u038d\u038e\7\16\2\2\u038e\u038f\5j\66"+
		"\2\u038f\u0390\b*\1\2\u0390\u039a\3\2\2\2\u0391\u0392\7\r\2\2\u0392\u0393"+
		"\5n8\2\u0393\u0394\5j\66\2\u0394\u0395\5V,\2\u0395\u0396\7\16\2\2\u0396"+
		"\u0397\5j\66\2\u0397\u0398\b*\1\2\u0398\u039a\3\2\2\2\u0399\u038a\3\2"+
		"\2\2\u0399\u0391\3\2\2\2\u039aS\3\2\2\2\u039b\u039d\5X-\2\u039c\u039b"+
		"\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a1\b+\1\2\u03a1U\3\2\2\2\u03a2\u03a4\5Z.\2\u03a3"+
		"\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2"+
		"\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\b,\1\2\u03a8W\3\2\2\2\u03a9\u03aa"+
		"\7\16\2\2\u03aa\u03ab\7\r\2\2\u03ab\u03ac\5n8\2\u03ac\u03ad\5h\65\2\u03ad"+
		"\u03ae\b-\1\2\u03aeY\3\2\2\2\u03af\u03b0\7\16\2\2\u03b0\u03b1\7\r\2\2"+
		"\u03b1\u03b2\5n8\2\u03b2\u03b3\5j\66\2\u03b3\u03b4\b.\1\2\u03b4[\3\2\2"+
		"\2\u03b5\u03b6\7\25\2\2\u03b6\u03b7\5n8\2\u03b7\u03b8\7Q\2\2\u03b8\u03b9"+
		"\5^\60\2\u03b9\u03ba\7R\2\2\u03ba\u03bb\b/\1\2\u03bb\u03e7\3\2\2\2\u03bc"+
		"\u03bd\7\25\2\2\u03bd\u03be\5n8\2\u03be\u03bf\7Q\2\2\u03bf\u03c0\5^\60"+
		"\2\u03c0\u03c1\7>\2\2\u03c1\u03c2\7=\2\2\u03c2\u03c4\5h\65\2\u03c3\u03c5"+
		"\78\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03c7\7R\2\2\u03c7\u03c8\b/\1\2\u03c8\u03e7\3\2\2\2\u03c9\u03ca\7\25"+
		"\2\2\u03ca\u03cb\5n8\2\u03cb\u03cc\7Q\2\2\u03cc\u03cd\5^\60\2\u03cd\u03ce"+
		"\7>\2\2\u03ce\u03cf\7=\2\2\u03cf\u03d0\5\34\17\2\u03d0\u03d1\78\2\2\u03d1"+
		"\u03d2\7R\2\2\u03d2\u03d3\b/\1\2\u03d3\u03e7\3\2\2\2\u03d4\u03d5\7\25"+
		"\2\2\u03d5\u03d6\5n8\2\u03d6\u03d7\7Q\2\2\u03d7\u03d8\5`\61\2\u03d8\u03d9"+
		"\7R\2\2\u03d9\u03da\b/\1\2\u03da\u03e7\3\2\2\2\u03db\u03dc\7\25\2\2\u03dc"+
		"\u03dd\5n8\2\u03dd\u03de\7Q\2\2\u03de\u03df\5`\61\2\u03df\u03e0\7>\2\2"+
		"\u03e0\u03e1\7=\2\2\u03e1\u03e2\5n8\2\u03e2\u03e3\78\2\2\u03e3\u03e4\7"+
		"R\2\2\u03e4\u03e5\b/\1\2\u03e5\u03e7\3\2\2\2\u03e6\u03b5\3\2\2\2\u03e6"+
		"\u03bc\3\2\2\2\u03e6\u03c9\3\2\2\2\u03e6\u03d4\3\2\2\2\u03e6\u03db\3\2"+
		"\2\2\u03e7]\3\2\2\2\u03e8\u03e9\b\60\1\2\u03e9\u03ea\5b\62\2\u03ea\u03eb"+
		"\b\60\1\2\u03eb\u03f2\3\2\2\2\u03ec\u03ed\f\4\2\2\u03ed\u03ee\5b\62\2"+
		"\u03ee\u03ef\b\60\1\2\u03ef\u03f1\3\2\2\2\u03f0\u03ec\3\2\2\2\u03f1\u03f4"+
		"\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3_\3\2\2\2\u03f4"+
		"\u03f2\3\2\2\2\u03f5\u03f6\b\61\1\2\u03f6\u03f7\5d\63\2\u03f7\u03f8\b"+
		"\61\1\2\u03f8\u03ff\3\2\2\2\u03f9\u03fa\f\4\2\2\u03fa\u03fb\5d\63\2\u03fb"+
		"\u03fc\b\61\1\2\u03fc\u03fe\3\2\2\2\u03fd\u03f9\3\2\2\2\u03fe\u0401\3"+
		"\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400a\3\2\2\2\u0401\u03ff"+
		"\3\2\2\2\u0402\u0403\5f\64\2\u0403\u0404\7=\2\2\u0404\u0406\5h\65\2\u0405"+
		"\u0407\78\2\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2"+
		"\2\2\u0408\u0409\b\62\1\2\u0409\u0411\3\2\2\2\u040a\u040b\5f\64\2\u040b"+
		"\u040c\7=\2\2\u040c\u040d\5\34\17\2\u040d\u040e\78\2\2\u040e\u040f\b\62"+
		"\1\2\u040f\u0411\3\2\2\2\u0410\u0402\3\2\2\2\u0410\u040a\3\2\2\2\u0411"+
		"c\3\2\2\2\u0412\u0413\5f\64\2\u0413\u0414\7=\2\2\u0414\u0415\5n8\2\u0415"+
		"\u0416\78\2\2\u0416\u0417\b\63\1\2\u0417e\3\2\2\2\u0418\u0419\b\64\1\2"+
		"\u0419\u041a\5x=\2\u041a\u041b\b\64\1\2\u041b\u0423\3\2\2\2\u041c\u041d"+
		"\f\4\2\2\u041d\u041e\7\26\2\2\u041e\u041f\5x=\2\u041f\u0420\b\64\1\2\u0420"+
		"\u0422\3\2\2\2\u0421\u041c\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2"+
		"\2\2\u0423\u0424\3\2\2\2\u0424g\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427"+
		"\7Q\2\2\u0427\u0428\5\4\3\2\u0428\u0429\7R\2\2\u0429\u042a\b\65\1\2\u042a"+
		"\u042f\3\2\2\2\u042b\u042c\7Q\2\2\u042c\u042d\7R\2\2\u042d\u042f\b\65"+
		"\1\2\u042e\u0426\3\2\2\2\u042e\u042b\3\2\2\2\u042fi\3\2\2\2\u0430\u0431"+
		"\7Q\2\2\u0431\u0432\5n8\2\u0432\u0433\7R\2\2\u0433\u0434\b\66\1\2\u0434"+
		"k\3\2\2\2\u0435\u0436\7\4\2\2\u0436\u044a\b\67\1\2\u0437\u0438\7\6\2\2"+
		"\u0438\u044a\b\67\1\2\u0439\u043a\7\5\2\2\u043a\u044a\b\67\1\2\u043b\u043c"+
		"\7\7\2\2\u043c\u044a\b\67\1\2\u043d\u043e\7\b\2\2\u043e\u044a\b\67\1\2"+
		"\u043f\u0440\7\36\2\2\u0440\u044a\b\67\1\2\u0441\u0442\7\t\2\2\u0442\u044a"+
		"\b\67\1\2\u0443\u0444\7\n\2\2\u0444\u044a\b\67\1\2\u0445\u0446\7\13\2"+
		"\2\u0446\u044a\b\67\1\2\u0447\u0448\7\f\2\2\u0448\u044a\b\67\1\2\u0449"+
		"\u0435\3\2\2\2\u0449\u0437\3\2\2\2\u0449\u0439\3\2\2\2\u0449\u043b\3\2"+
		"\2\2\u0449\u043d\3\2\2\2\u0449\u043f\3\2\2\2\u0449\u0441\3\2\2\2\u0449"+
		"\u0443\3\2\2\2\u0449\u0445\3\2\2\2\u0449\u0447\3\2\2\2\u044am\3\2\2\2"+
		"\u044b\u044c\b8\1\2\u044c\u044d\5p9\2\u044d\u044e\b8\1\2\u044e\u045f\3"+
		"\2\2\2\u044f\u0450\f\5\2\2\u0450\u0451\7\67\2\2\u0451\u0452\7\67\2\2\u0452"+
		"\u0453\5n8\6\u0453\u0454\b8\1\2\u0454\u045e\3\2\2\2\u0455\u0456\f\4\2"+
		"\2\u0456\u0457\7\67\2\2\u0457\u0458\7(\2\2\u0458\u045e\b8\1\2\u0459\u045a"+
		"\f\3\2\2\u045a\u045b\7\67\2\2\u045b\u045c\7)\2\2\u045c\u045e\b8\1\2\u045d"+
		"\u044f\3\2\2\2\u045d\u0455\3\2\2\2\u045d\u0459\3\2\2\2\u045e\u0461\3\2"+
		"\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460o\3\2\2\2\u0461\u045f"+
		"\3\2\2\2\u0462\u0463\b9\1\2\u0463\u0464\7I\2\2\u0464\u0465\5p9\37\u0465"+
		"\u0466\b9\1\2\u0466\u04cf\3\2\2\2\u0467\u0468\7\4\2\2\u0468\u0469\7:\2"+
		"\2\u0469\u046a\7\32\2\2\u046a\u046b\7O\2\2\u046b\u046c\5p9\2\u046c\u046d"+
		"\78\2\2\u046d\u046e\5p9\2\u046e\u046f\7P\2\2\u046f\u0470\b9\1\2\u0470"+
		"\u04cf\3\2\2\2\u0471\u0472\7\5\2\2\u0472\u0473\7:\2\2\u0473\u0474\7\33"+
		"\2\2\u0474\u0475\7O\2\2\u0475\u0476\5p9\2\u0476\u0477\78\2\2\u0477\u0478"+
		"\5p9\2\u0478\u0479\7P\2\2\u0479\u047a\b9\1\2\u047a\u04cf\3\2\2\2\u047b"+
		"\u047c\7M\2\2\u047c\u047d\5p9\30\u047d\u047e\b9\1\2\u047e\u04cf\3\2\2"+
		"\2\u047f\u0480\7?\2\2\u0480\u0481\7\67\2\2\u0481\u0482\7+\2\2\u0482\u0483"+
		"\7O\2\2\u0483\u0484\7N\2\2\u0484\u0485\5n8\2\u0485\u0486\7P\2\2\u0486"+
		"\u0487\b9\1\2\u0487\u04cf\3\2\2\2\u0488\u0489\7?\2\2\u0489\u048a\7\67"+
		"\2\2\u048a\u048b\7&\2\2\u048b\u04cf\b9\1\2\u048c\u048d\7\37\2\2\u048d"+
		"\u048e\7S\2\2\u048e\u048f\5n8\2\u048f\u0490\79\2\2\u0490\u0491\5n8\2\u0491"+
		"\u0492\7T\2\2\u0492\u0493\b9\1\2\u0493\u04cf\3\2\2\2\u0494\u0495\7\37"+
		"\2\2\u0495\u0496\7S\2\2\u0496\u0497\58\35\2\u0497\u0498\7T\2\2\u0498\u0499"+
		"\b9\1\2\u0499\u04cf\3\2\2\2\u049a\u049b\7S\2\2\u049b\u049c\5n8\2\u049c"+
		"\u049d\79\2\2\u049d\u049e\5n8\2\u049e\u049f\7T\2\2\u049f\u04a0\b9\1\2"+
		"\u04a0\u04cf\3\2\2\2\u04a1\u04a2\7S\2\2\u04a2\u04a3\58\35\2\u04a3\u04a4"+
		"\7T\2\2\u04a4\u04a5\b9\1\2\u04a5\u04cf\3\2\2\2\u04a6\u04a7\7?\2\2\u04a7"+
		"\u04a8\7Q\2\2\u04a8\u04a9\5v<\2\u04a9\u04aa\7R\2\2\u04aa\u04ab\b9\1\2"+
		"\u04ab\u04cf\3\2\2\2\u04ac\u04ad\5x=\2\u04ad\u04ae\b9\1\2\u04ae\u04cf"+
		"\3\2\2\2\u04af\u04b0\7O\2\2\u04b0\u04b1\5n8\2\u04b1\u04b2\7P\2\2\u04b2"+
		"\u04b3\b9\1\2\u04b3\u04cf\3\2\2\2\u04b4\u04b5\5r:\2\u04b5\u04b6\b9\1\2"+
		"\u04b6\u04cf\3\2\2\2\u04b7\u04b8\5R*\2\u04b8\u04b9\b9\1\2\u04b9\u04cf"+
		"\3\2\2\2\u04ba\u04bb\5\\/\2\u04bb\u04bc\b9\1\2\u04bc\u04cf\3\2\2\2\u04bd"+
		"\u04be\5.\30\2\u04be\u04bf\b9\1\2\u04bf\u04cf\3\2\2\2\u04c0\u04c1\5$\23"+
		"\2\u04c1\u04c2\b9\1\2\u04c2\u04cf\3\2\2\2\u04c3\u04c4\5&\24\2\u04c4\u04c5"+
		"\b9\1\2\u04c5\u04cf\3\2\2\2\u04c6\u04c7\7?\2\2\u04c7\u04c8\7\67\2\2\u04c8"+
		"\u04c9\7-\2\2\u04c9\u04ca\7O\2\2\u04ca\u04cb\5n8\2\u04cb\u04cc\7P\2\2"+
		"\u04cc\u04cd\b9\1\2\u04cd\u04cf\3\2\2\2\u04ce\u0462\3\2\2\2\u04ce\u0467"+
		"\3\2\2\2\u04ce\u0471\3\2\2\2\u04ce\u047b\3\2\2\2\u04ce\u047f\3\2\2\2\u04ce"+
		"\u0488\3\2\2\2\u04ce\u048c\3\2\2\2\u04ce\u0494\3\2\2\2\u04ce\u049a\3\2"+
		"\2\2\u04ce\u04a1\3\2\2\2\u04ce\u04a6\3\2\2\2\u04ce\u04ac\3\2\2\2\u04ce"+
		"\u04af\3\2\2\2\u04ce\u04b4\3\2\2\2\u04ce\u04b7\3\2\2\2\u04ce\u04ba\3\2"+
		"\2\2\u04ce\u04bd\3\2\2\2\u04ce\u04c0\3\2\2\2\u04ce\u04c3\3\2\2\2\u04ce"+
		"\u04c6\3\2\2\2\u04cf\u04f9\3\2\2\2\u04d0\u04d1\f\34\2\2\u04d1\u04d2\t"+
		"\2\2\2\u04d2\u04d3\5p9\35\u04d3\u04d4\b9\1\2\u04d4\u04f8\3\2\2\2\u04d5"+
		"\u04d6\f\32\2\2\u04d6\u04d7\t\3\2\2\u04d7\u04d8\5p9\33\u04d8\u04d9\b9"+
		"\1\2\u04d9\u04f8\3\2\2\2\u04da\u04db\f\31\2\2\u04db\u04dc\t\4\2\2\u04dc"+
		"\u04dd\5p9\32\u04dd\u04de\b9\1\2\u04de\u04f8\3\2\2\2\u04df\u04e0\f\27"+
		"\2\2\u04e0\u04e1\7K\2\2\u04e1\u04e2\5p9\30\u04e2\u04e3\b9\1\2\u04e3\u04f8"+
		"\3\2\2\2\u04e4\u04e5\f\26\2\2\u04e5\u04e6\7L\2\2\u04e6\u04e7\5p9\27\u04e7"+
		"\u04e8\b9\1\2\u04e8\u04f8\3\2\2\2\u04e9\u04ea\f\33\2\2\u04ea\u04eb\7\67"+
		"\2\2\u04eb\u04ec\7$\2\2\u04ec\u04f8\b9\1\2\u04ed\u04ee\f\25\2\2\u04ee"+
		"\u04ef\7\67\2\2\u04ef\u04f0\7\'\2\2\u04f0\u04f8\b9\1\2\u04f1\u04f2\f\24"+
		"\2\2\u04f2\u04f3\7\"\2\2\u04f3\u04f8\b9\1\2\u04f4\u04f5\f\23\2\2\u04f5"+
		"\u04f6\7#\2\2\u04f6\u04f8\b9\1\2\u04f7\u04d0\3\2\2\2\u04f7\u04d5\3\2\2"+
		"\2\u04f7\u04da\3\2\2\2\u04f7\u04df\3\2\2\2\u04f7\u04e4\3\2\2\2\u04f7\u04e9"+
		"\3\2\2\2\u04f7\u04ed\3\2\2\2\u04f7\u04f1\3\2\2\2\u04f7\u04f4\3\2\2\2\u04f8"+
		"\u04fb\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04faq\3\2\2\2"+
		"\u04fb\u04f9\3\2\2\2\u04fc\u04fd\7O\2\2\u04fd\u04fe\5n8\2\u04fe\u04ff"+
		"\7\31\2\2\u04ff\u0500\5t;\2\u0500\u0501\7P\2\2\u0501\u0502\b:\1\2\u0502"+
		"s\3\2\2\2\u0503\u0504\7\5\2\2\u0504\u050a\b;\1\2\u0505\u0506\7\4\2\2\u0506"+
		"\u050a\b;\1\2\u0507\u0508\7\f\2\2\u0508\u050a\b;\1\2\u0509\u0503\3\2\2"+
		"\2\u0509\u0505\3\2\2\2\u0509\u0507\3\2\2\2\u050au\3\2\2\2\u050b\u050c"+
		"\b<\1\2\u050c\u050d\7?\2\2\u050d\u050e\7;\2\2\u050e\u050f\5n8\2\u050f"+
		"\u0510\b<\1\2\u0510\u051a\3\2\2\2\u0511\u0512\f\4\2\2\u0512\u0513\78\2"+
		"\2\u0513\u0514\7?\2\2\u0514\u0515\7;\2\2\u0515\u0516\5n8\2\u0516\u0517"+
		"\b<\1\2\u0517\u0519\3\2\2\2\u0518\u0511\3\2\2\2\u0519\u051c\3\2\2\2\u051a"+
		"\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051bw\3\2\2\2\u051c\u051a\3\2\2\2"+
		"\u051d\u051e\7\64\2\2\u051e\u052e\b=\1\2\u051f\u0520\7\65\2\2\u0520\u052e"+
		"\b=\1\2\u0521\u0522\5|?\2\u0522\u0523\b=\1\2\u0523\u052e\3\2\2\2\u0524"+
		"\u0525\7U\2\2\u0525\u052e\b=\1\2\u0526\u0527\7\27\2\2\u0527\u052e\b=\1"+
		"\2\u0528\u0529\7\30\2\2\u0529\u052e\b=\1\2\u052a\u052b\5z>\2\u052b\u052c"+
		"\b=\1\2\u052c\u052e\3\2\2\2\u052d\u051d\3\2\2\2\u052d\u051f\3\2\2\2\u052d"+
		"\u0521\3\2\2\2\u052d\u0524\3\2\2\2\u052d\u0526\3\2\2\2\u052d\u0528\3\2"+
		"\2\2\u052d\u052a\3\2\2\2\u052ey\3\2\2\2\u052f\u0530\b>\1\2\u0530\u0531"+
		"\7?\2\2\u0531\u0532\b>\1\2\u0532\u053f\3\2\2\2\u0533\u0534\f\5\2\2\u0534"+
		"\u0535\7S\2\2\u0535\u0536\5n8\2\u0536\u0537\7T\2\2\u0537\u0538\b>\1\2"+
		"\u0538\u053e\3\2\2\2\u0539\u053a\f\4\2\2\u053a\u053b\7\67\2\2\u053b\u053c"+
		"\7?\2\2\u053c\u053e\b>\1\2\u053d\u0533\3\2\2\2\u053d\u0539\3\2\2\2\u053e"+
		"\u0541\3\2\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540{\3\2\2\2"+
		"\u0541\u053f\3\2\2\2\u0542\u0544\7N\2\2\u0543\u0542\3\2\2\2\u0544\u0545"+
		"\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3\2\2\2\u0547"+
		"\u0549\7\66\2\2\u0548\u054a\t\5\2\2\u0549\u0548\3\2\2\2\u0549\u054a\3"+
		"\2\2\2\u054a\u054b\3\2\2\2\u054b\u0552\b?\1\2\u054c\u054d\7\66\2\2\u054d"+
		"\u054e\t\5\2\2\u054e\u0552\b?\1\2\u054f\u0550\7\66\2\2\u0550\u0552\b?"+
		"\1\2\u0551\u0543\3\2\2\2\u0551\u054c\3\2\2\2\u0551\u054f\3\2\2\2\u0552"+
		"}\3\2\2\2<\u0084\u0093\u009f\u00b1\u00bd\u00bf\u00c5\u00cd\u012d\u013a"+
		"\u016b\u01b3\u01e7\u01fb\u020e\u021d\u021f\u022c\u023d\u0246\u0264\u0274"+
		"\u0284\u028b\u02fa\u02ff\u0304\u0312\u0327\u034d\u0359\u0366\u0388\u0399"+
		"\u039e\u03a5\u03c4\u03e6\u03f2\u03ff\u0406\u0410\u0423\u042e\u0449\u045d"+
		"\u045f\u04ce\u04f7\u04f9\u0509\u051a\u052d\u053d\u053f\u0545\u0549\u0551";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}