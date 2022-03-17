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
		MUT=17, TO_STRING=18, TO_OWNED=19, NUMBER=20, FLOAT=21, STRING=22, PUNTO=23, 
		COMA=24, PTCOMA=25, DOSPUNTO=26, DPUNTO2=27, ASIGNACION=28, MTHEN=29, 
		GUIONB=30, ID=31, DISTINTO=32, IGUAL=33, MAYORIGUAL=34, MENORIGUAL=35, 
		MAYOR=36, MENOR=37, MUL=38, DIV=39, ADD=40, SUB=41, MOD=42, AND=43, OR=44, 
		NOT=45, AMP=46, PARIZQ=47, PARDER=48, LLAVEIZQ=49, LLAVEDER=50, CORIZQ=51, 
		CORDER=52, WHITESPACE=53, L_COMMENT=54;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_instruccion_only = 3, 
		RULE_printconsola = 4, RULE_listParams = 5, RULE_declaracion = 6, RULE_is_mut = 7, 
		RULE_array_type = 8, RULE_asignacion = 9, RULE_list_index = 10, RULE_index_array = 11, 
		RULE_if_sent = 12, RULE_if_exp = 13, RULE_list_elseif = 14, RULE_list_elseif_exp = 15, 
		RULE_else_if = 16, RULE_else_if_exp = 17, RULE_match_sent = 18, RULE_match_brazos = 19, 
		RULE_matchbrazo = 20, RULE_listaOpciones = 21, RULE_bloque_inst = 22, 
		RULE_bloque_exp = 23, RULE_tipos_var = 24, RULE_expression = 25, RULE_expr_arit = 26, 
		RULE_casteo = 27, RULE_tipo_cast = 28, RULE_primitivo = 29, RULE_listIDArray = 30, 
		RULE_strings = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "instruccion_only", "printconsola", 
			"listParams", "declaracion", "is_mut", "array_type", "asignacion", "list_index", 
			"index_array", "if_sent", "if_exp", "list_elseif", "list_elseif_exp", 
			"else_if", "else_if_exp", "match_sent", "match_brazos", "matchbrazo", 
			"listaOpciones", "bloque_inst", "bloque_exp", "tipos_var", "expression", 
			"expr_arit", "casteo", "tipo_cast", "primitivo", "listIDArray", "strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", 
			"'powf'", "'let'", "'mut'", "'.to_string()'", "'.to_owned()'", null, 
			null, null, "'.'", "','", "';'", "'::'", "':'", "'='", "'=>'", "'_'", 
			null, "'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", 
			"'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", 
			"LET", "MUT", "TO_STRING", "TO_OWNED", "NUMBER", "FLOAT", "STRING", "PUNTO", 
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
			setState(64);
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
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_CON) | (1L << IF) | (1L << MATCH) | (1L << LET) | (1L << ID))) != 0)) {
				{
				{
				setState(67);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(72);
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
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((InstruccionContext)_localctx).printconsola = printconsola();
				setState(76);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(80);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(84);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				((InstruccionContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((InstruccionContext)_localctx).if_sent.instr
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
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
		enterRule(_localctx, 6, RULE_instruccion_only);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				((Instruccion_onlyContext)_localctx).printconsola = printconsola();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).printconsola.instr
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				((Instruccion_onlyContext)_localctx).declaracion = declaracion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).declaracion.instr
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				((Instruccion_onlyContext)_localctx).asignacion = asignacion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).asignacion.instr
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				((Instruccion_onlyContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).if_sent.instr
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
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
		enterRule(_localctx, 8, RULE_printconsola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((PrintconsolaContext)_localctx).PRINT_CON = match(PRINT_CON);
			setState(113);
			match(PARIZQ);
			setState(114);
			((PrintconsolaContext)_localctx).listParams = listParams(0);
			setState(115);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_listParams, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			((ListParamsContext)_localctx).expression = expression();
			_localctx.l_e.Add(((ListParamsContext)_localctx).expression.p)
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
					setState(122);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(123);
					match(COMA);
					setState(124);
					((ListParamsContext)_localctx).expression = expression();

					                                              ((ListParamsContext)_localctx).list.l_e.Add(((ListParamsContext)_localctx).expression.p)
					                                              _localctx.l_e = ((ListParamsContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(131);
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
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(LET);
				setState(133);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(134);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(135);
				match(DPUNTO2);
				setState(136);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(137);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(138);
				((DeclaracionContext)_localctx).expression = expression();

				                        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(LET);
				setState(142);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(143);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(144);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(145);
				((DeclaracionContext)_localctx).expression = expression();

				                      _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(LET);
				setState(149);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(150);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(151);
				match(DPUNTO2);
				setState(152);
				((DeclaracionContext)_localctx).array_type = array_type();
				setState(153);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(154);
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
		enterRule(_localctx, 14, RULE_is_mut);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
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
		enterRule(_localctx, 16, RULE_array_type);

		    _localctx.ty = arrayList.New()

		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(165);
				((Array_typeContext)_localctx).array_type = array_type();
				setState(166);
				match(PTCOMA);
				setState(167);
				((Array_typeContext)_localctx).expression = expression();
				setState(168);
				match(CORDER);

				                                        nType := interfaces.NewArrayType(interfaces.ARRAY, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                        ((Array_typeContext)_localctx).array_type.ty.Add(nType)
				                                        _localctx.ty = ((Array_typeContext)_localctx).array_type.ty
				                                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(172);
				((Array_typeContext)_localctx).tipos_var = tipos_var();
				setState(173);
				match(PTCOMA);
				setState(174);
				((Array_typeContext)_localctx).expression = expression();
				setState(175);
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
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				((AsignacionContext)_localctx).id = match(ID);
				setState(181);
				match(ASIGNACION);
				setState(182);
				((AsignacionContext)_localctx).expression = expression();
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, nil, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				((AsignacionContext)_localctx).id = match(ID);
				setState(186);
				((AsignacionContext)_localctx).list_index = list_index(0);
				setState(187);
				match(ASIGNACION);
				setState(188);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_list_index, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			((List_indexContext)_localctx).index_array = index_array();
			_localctx.lista.Add(((List_indexContext)_localctx).index_array.index)
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
					setState(197);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(198);
					((List_indexContext)_localctx).index_array = index_array();

					                                                ((List_indexContext)_localctx).listi.lista.Add(((List_indexContext)_localctx).index_array.index)
					                                                _localctx.lista = ((List_indexContext)_localctx).listi.lista
					                                            
					}
					} 
				}
				setState(205);
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
		enterRule(_localctx, 22, RULE_index_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CORIZQ);
			setState(207);
			((Index_arrayContext)_localctx).expression = expression();
			setState(208);
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
		enterRule(_localctx, 24, RULE_if_sent);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((If_sentContext)_localctx).IF = match(IF);
				setState(212);
				((If_sentContext)_localctx).expression = expression();
				setState(213);
				((If_sentContext)_localctx).bloque_inst = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p, ((If_sentContext)_localctx).bloque_inst.l, nil,nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				((If_sentContext)_localctx).IF = match(IF);
				setState(217);
				((If_sentContext)_localctx).expression = expression();
				setState(218);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(219);
				match(ELSE);
				setState(220);
				((If_sentContext)_localctx).belse = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,nil,((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				((If_sentContext)_localctx).IF = match(IF);
				setState(224);
				((If_sentContext)_localctx).expression = expression();
				setState(225);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(226);
				((If_sentContext)_localctx).list_elseif = list_elseif();
				setState(227);
				match(ELSE);
				setState(228);
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
		enterRule(_localctx, 26, RULE_if_exp);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((If_expContext)_localctx).IF = match(IF);
				setState(234);
				((If_expContext)_localctx).expression = expression();
				setState(235);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(236);
				match(ELSE);
				setState(237);
				((If_expContext)_localctx).belse_e = bloque_exp();
				_localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p, nil ,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, nil, ((If_expContext)_localctx).belse_e.p )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				((If_expContext)_localctx).IF = match(IF);
				setState(241);
				((If_expContext)_localctx).expression = expression();
				setState(242);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(243);
				((If_expContext)_localctx).list_elseif_exp = list_elseif_exp();
				setState(244);
				match(ELSE);
				setState(245);
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
		enterRule(_localctx, 28, RULE_list_elseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(250);
					((List_elseifContext)_localctx).else_if = else_if();
					((List_elseifContext)_localctx).list.add(((List_elseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 30, RULE_list_elseif_exp);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(257);
					((List_elseif_expContext)_localctx).else_if_exp = else_if_exp();
					((List_elseif_expContext)_localctx).list.add(((List_elseif_expContext)_localctx).else_if_exp);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(260); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 32, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			((Else_ifContext)_localctx).ELSE = match(ELSE);
			setState(265);
			match(IF);
			setState(266);
			((Else_ifContext)_localctx).expression = expression();
			setState(267);
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
		enterRule(_localctx, 34, RULE_else_if_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			((Else_if_expContext)_localctx).ELSE = match(ELSE);
			setState(271);
			match(IF);
			setState(272);
			((Else_if_expContext)_localctx).expression = expression();
			setState(273);
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
		enterRule(_localctx, 36, RULE_match_sent);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(277);
				((Match_sentContext)_localctx).expression = expression();
				setState(278);
				match(LLAVEIZQ);
				setState(279);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(280);
				match(LLAVEDER);

				                        _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(284);
				((Match_sentContext)_localctx).expression = expression();
				setState(285);
				match(LLAVEIZQ);
				setState(286);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(287);
				match(GUIONB);
				setState(288);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(289);
				((Match_sentContext)_localctx).bloque_inst = bloque_inst();
				setState(290);
				match(COMA);
				setState(291);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, ((Match_sentContext)_localctx).bloque_inst.l, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(295);
				((Match_sentContext)_localctx).expression = expression();
				setState(296);
				match(LLAVEIZQ);
				setState(297);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(298);
				match(GUIONB);
				setState(299);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(300);
				((Match_sentContext)_localctx).instruccion_only = instruccion_only();
				setState(301);
				match(COMA);
				setState(302);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_match_brazos, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			((Match_brazosContext)_localctx).matchbrazo = matchbrazo();
			_localctx.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
					setState(311);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(312);
					((Match_brazosContext)_localctx).matchbrazo = matchbrazo();

					                                              ((Match_brazosContext)_localctx).listb.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
					                                              _localctx.l_brazos = ((Match_brazosContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 40, RULE_matchbrazo);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(321);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(322);
				((MatchbrazoContext)_localctx).bloque_inst = bloque_inst();
				setState(323);
				match(COMA);
				 _localctx.brazo = instructionExpre.NewBrazoMatch(((MatchbrazoContext)_localctx).listaOpciones.lisop, ((MatchbrazoContext)_localctx).bloque_inst.l, nil, (((MatchbrazoContext)_localctx).th!=null?((MatchbrazoContext)_localctx).th.getLine():0), localctx.(*MatchbrazoContext).GetTh().GetColumn() ) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(327);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(328);
				((MatchbrazoContext)_localctx).instruccion_only = instruccion_only();
				setState(329);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_listaOpciones, _p);

		    _localctx.lisop = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(335);
			((ListaOpcionesContext)_localctx).primitivo = primitivo();

			                    _localctx.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
			                  
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
					setState(338);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(339);
					match(MTOR);
					setState(340);
					((ListaOpcionesContext)_localctx).primitivo = primitivo();

					                                                      ((ListaOpcionesContext)_localctx).list.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
					                                                      _localctx.lisop =  ((ListaOpcionesContext)_localctx).list.lisop
					                                                    
					}
					} 
				}
				setState(347);
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
		enterRule(_localctx, 44, RULE_bloque_inst);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(LLAVEIZQ);
				setState(349);
				((Bloque_instContext)_localctx).instrucciones = instrucciones();
				setState(350);
				match(LLAVEDER);
				_localctx.l = ((Bloque_instContext)_localctx).instrucciones.l 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(LLAVEIZQ);
				setState(354);
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
		enterRule(_localctx, 46, RULE_bloque_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(LLAVEIZQ);
			setState(359);
			((Bloque_expContext)_localctx).expression = expression();
			setState(360);
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
		enterRule(_localctx, 48, RULE_tipos_var);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(T_NUMBER);
				_localctx.tipo = interfaces.INTEGER
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(T_STRING);
				_localctx.tipo = interfaces.STRING
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(T_FLOAT);
				_localctx.tipo = interfaces.FLOAT
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				match(T_BOOL);
				_localctx.tipo = interfaces.BOOLEAN
				}
				break;
			case T_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
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
		enterRule(_localctx, 50, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(379);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(380);
				((Expr_aritContext)_localctx).opU = expr_arit(15);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(383);
				match(T_NUMBER);
				setState(384);
				match(DOSPUNTO);
				setState(385);
				((Expr_aritContext)_localctx).op = match(POW);
				setState(386);
				match(PARIZQ);
				setState(387);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(388);
				match(COMA);
				setState(389);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(390);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 3:
				{
				setState(393);
				match(T_FLOAT);
				setState(394);
				match(DOSPUNTO);
				setState(395);
				((Expr_aritContext)_localctx).op = match(POWF);
				setState(396);
				match(PARIZQ);
				setState(397);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(398);
				match(COMA);
				setState(399);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(400);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 4:
				{
				setState(403);
				((Expr_aritContext)_localctx).op = match(NOT);
				setState(404);
				((Expr_aritContext)_localctx).opU = expr_arit(9);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"!",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 5:
				{
				setState(407);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(408);
				((Expr_aritContext)_localctx).exp = ((Expr_aritContext)_localctx).expression = expression();
				setState(409);
				match(PTCOMA);
				setState(410);
				((Expr_aritContext)_localctx).tam = ((Expr_aritContext)_localctx).expression = expression();
				setState(411);
				match(CORDER);
				 _localctx.p = expresion.NewArray(nil, ((Expr_aritContext)_localctx).exp.p, ((Expr_aritContext)_localctx).tam.p, 2, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 6:
				{
				setState(414);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(415);
				((Expr_aritContext)_localctx).listParams = listParams(0);
				setState(416);
				match(CORDER);
				 _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listParams.l_e, nil, nil, 1, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 7:
				{
				setState(419);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 8:
				{
				setState(422);
				match(PARIZQ);
				setState(423);
				((Expr_aritContext)_localctx).expression = expression();
				setState(424);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 9:
				{
				setState(427);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			case 10:
				{
				setState(430);
				((Expr_aritContext)_localctx).if_exp = if_exp();
				_localctx.p = ((Expr_aritContext)_localctx).if_exp.p
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(435);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(436);
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
						setState(437);
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
						setState(440);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(441);
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
						setState(442);
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
						setState(445);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(446);
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
						setState(447);
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
						setState(450);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(451);
						((Expr_aritContext)_localctx).op = match(AND);
						setState(452);
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
						setState(455);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(456);
						((Expr_aritContext)_localctx).op = match(OR);
						setState(457);
						((Expr_aritContext)_localctx).opDe = expr_arit(8);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					}
					} 
				}
				setState(464);
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
		enterRule(_localctx, 54, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(466);
			((CasteoContext)_localctx).expression = expression();
			setState(467);
			match(AS);
			setState(468);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(469);
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
		enterRule(_localctx, 56, RULE_tipo_cast);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
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
		enterRule(_localctx, 58, RULE_primitivo);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
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
				setState(480);
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
				setState(482);
				((PrimitivoContext)_localctx).strings = strings();
				_localctx.p = ((PrimitivoContext)_localctx).strings.p
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				((PrimitivoContext)_localctx).FALSE = match(FALSE);
				 _localctx.p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).FALSE!=null?((PrimitivoContext)_localctx).FALSE.getLine():0), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(489);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_listIDArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(495);
			((ListIDArrayContext)_localctx).ID = match(ID);
			 
			      _localctx.p = expresion.NewIdentificador((((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getLine():0), localctx.(*ListIDArrayContext).Get_ID().GetColumn() )
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
					setState(498);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(499);
					((ListIDArrayContext)_localctx).CORIZQ = match(CORIZQ);
					setState(500);
					((ListIDArrayContext)_localctx).expression = expression();
					setState(501);
					match(CORDER);
					 _localctx.p = expresion.NewArrayAccess(((ListIDArrayContext)_localctx).list.p, ((ListIDArrayContext)_localctx).expression.p, (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getLine():0), (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
					}
					} 
				}
				setState(508);
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
		enterRule(_localctx, 62, RULE_strings);
		int _la;
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(509);
					match(AMP);
					}
					}
					setState(512); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AMP );
				setState(514);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(515);
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
				setState(519);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(520);
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
				setState(522);
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
		case 5:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 10:
			return list_index_sempred((List_indexContext)_localctx, predIndex);
		case 19:
			return match_brazos_sempred((Match_brazosContext)_localctx, predIndex);
		case 21:
			return listaOpciones_sempred((ListaOpcionesContext)_localctx, predIndex);
		case 26:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 30:
			return listIDArray_sempred((ListIDArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean list_index_sempred(List_indexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_sempred(Match_brazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaOpciones_sempred(ListaOpcionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean listIDArray_sempred(ListIDArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0211\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5q\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0082\n\7\f"+
		"\7\16\7\u0085\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a0\n\b\3\t\3\t"+
		"\3\t\5\t\u00a5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00b5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00c2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cc\n\f\f\f"+
		"\16\f\u00cf\13\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ea\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00fb\n\17\3\20\6\20\u00fe\n\20\r\20\16\20\u00ff"+
		"\3\20\3\20\3\21\6\21\u0105\n\21\r\21\16\21\u0106\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0134\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u013e\n\25\f\25\16\25\u0141"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u014f\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u015a\n"+
		"\27\f\27\16\27\u015d\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0167\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0178\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01b4\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01cf\n\34\f\34\16\34\u01d2"+
		"\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u01df"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u01ef\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u01fb\n \f \16"+
		" \u01fe\13 \3!\6!\u0201\n!\r!\16!\u0202\3!\3!\5!\u0207\n!\3!\3!\3!\3!"+
		"\3!\3!\5!\u020f\n!\3!\2\b\f\26(,\66>\"\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@\2\6\4\2(),,\3\2*+\3\2\"\'\3\2\24\25\2"+
		"\u0228\2B\3\2\2\2\4H\3\2\2\2\6_\3\2\2\2\bp\3\2\2\2\nr\3\2\2\2\fx\3\2\2"+
		"\2\16\u009f\3\2\2\2\20\u00a4\3\2\2\2\22\u00b4\3\2\2\2\24\u00c1\3\2\2\2"+
		"\26\u00c3\3\2\2\2\30\u00d0\3\2\2\2\32\u00e9\3\2\2\2\34\u00fa\3\2\2\2\36"+
		"\u00fd\3\2\2\2 \u0104\3\2\2\2\"\u010a\3\2\2\2$\u0110\3\2\2\2&\u0133\3"+
		"\2\2\2(\u0135\3\2\2\2*\u014e\3\2\2\2,\u0150\3\2\2\2.\u0166\3\2\2\2\60"+
		"\u0168\3\2\2\2\62\u0177\3\2\2\2\64\u0179\3\2\2\2\66\u01b3\3\2\2\28\u01d3"+
		"\3\2\2\2:\u01de\3\2\2\2<\u01ee\3\2\2\2>\u01f0\3\2\2\2@\u020e\3\2\2\2B"+
		"C\5\4\3\2CD\b\2\1\2D\3\3\2\2\2EG\5\6\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2"+
		"HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\b\3\1\2L\5\3\2\2\2MN\5\n\6\2NO\7\33\2"+
		"\2OP\b\4\1\2P`\3\2\2\2QR\5\16\b\2RS\7\33\2\2ST\b\4\1\2T`\3\2\2\2UV\5\24"+
		"\13\2VW\7\33\2\2WX\b\4\1\2X`\3\2\2\2YZ\5\32\16\2Z[\b\4\1\2[`\3\2\2\2\\"+
		"]\5&\24\2]^\b\4\1\2^`\3\2\2\2_M\3\2\2\2_Q\3\2\2\2_U\3\2\2\2_Y\3\2\2\2"+
		"_\\\3\2\2\2`\7\3\2\2\2ab\5\n\6\2bc\b\5\1\2cq\3\2\2\2de\5\16\b\2ef\b\5"+
		"\1\2fq\3\2\2\2gh\5\24\13\2hi\b\5\1\2iq\3\2\2\2jk\5\32\16\2kl\b\5\1\2l"+
		"q\3\2\2\2mn\5&\24\2no\b\5\1\2oq\3\2\2\2pa\3\2\2\2pd\3\2\2\2pg\3\2\2\2"+
		"pj\3\2\2\2pm\3\2\2\2q\t\3\2\2\2rs\7\3\2\2st\7\61\2\2tu\5\f\7\2uv\7\62"+
		"\2\2vw\b\6\1\2w\13\3\2\2\2xy\b\7\1\2yz\5\64\33\2z{\b\7\1\2{\u0083\3\2"+
		"\2\2|}\f\4\2\2}~\7\32\2\2~\177\5\64\33\2\177\u0080\b\7\1\2\u0080\u0082"+
		"\3\2\2\2\u0081|\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\r\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\22\2"+
		"\2\u0087\u0088\5\20\t\2\u0088\u0089\7!\2\2\u0089\u008a\7\35\2\2\u008a"+
		"\u008b\5\62\32\2\u008b\u008c\7\36\2\2\u008c\u008d\5\64\33\2\u008d\u008e"+
		"\b\b\1\2\u008e\u00a0\3\2\2\2\u008f\u0090\7\22\2\2\u0090\u0091\5\20\t\2"+
		"\u0091\u0092\7!\2\2\u0092\u0093\7\36\2\2\u0093\u0094\5\64\33\2\u0094\u0095"+
		"\b\b\1\2\u0095\u00a0\3\2\2\2\u0096\u0097\7\22\2\2\u0097\u0098\5\20\t\2"+
		"\u0098\u0099\7!\2\2\u0099\u009a\7\35\2\2\u009a\u009b\5\22\n\2\u009b\u009c"+
		"\7\36\2\2\u009c\u009d\5\64\33\2\u009d\u009e\b\b\1\2\u009e\u00a0\3\2\2"+
		"\2\u009f\u0086\3\2\2\2\u009f\u008f\3\2\2\2\u009f\u0096\3\2\2\2\u00a0\17"+
		"\3\2\2\2\u00a1\u00a2\7\23\2\2\u00a2\u00a5\b\t\1\2\u00a3\u00a5\3\2\2\2"+
		"\u00a4\u00a1\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00a7"+
		"\7\65\2\2\u00a7\u00a8\5\22\n\2\u00a8\u00a9\7\33\2\2\u00a9\u00aa\5\64\33"+
		"\2\u00aa\u00ab\7\66\2\2\u00ab\u00ac\b\n\1\2\u00ac\u00b5\3\2\2\2\u00ad"+
		"\u00ae\7\65\2\2\u00ae\u00af\5\62\32\2\u00af\u00b0\7\33\2\2\u00b0\u00b1"+
		"\5\64\33\2\u00b1\u00b2\7\66\2\2\u00b2\u00b3\b\n\1\2\u00b3\u00b5\3\2\2"+
		"\2\u00b4\u00a6\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b5\23\3\2\2\2\u00b6\u00b7"+
		"\7!\2\2\u00b7\u00b8\7\36\2\2\u00b8\u00b9\5\64\33\2\u00b9\u00ba\b\13\1"+
		"\2\u00ba\u00c2\3\2\2\2\u00bb\u00bc\7!\2\2\u00bc\u00bd\5\26\f\2\u00bd\u00be"+
		"\7\36\2\2\u00be\u00bf\5\64\33\2\u00bf\u00c0\b\13\1\2\u00c0\u00c2\3\2\2"+
		"\2\u00c1\u00b6\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c4"+
		"\b\f\1\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\b\f\1\2\u00c6\u00cd\3\2\2\2"+
		"\u00c7\u00c8\f\4\2\2\u00c8\u00c9\5\30\r\2\u00c9\u00ca\b\f\1\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\27\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\65\2"+
		"\2\u00d1\u00d2\5\64\33\2\u00d2\u00d3\7\66\2\2\u00d3\u00d4\b\r\1\2\u00d4"+
		"\31\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\5\64\33\2\u00d7\u00d8\5.\30"+
		"\2\u00d8\u00d9\b\16\1\2\u00d9\u00ea\3\2\2\2\u00da\u00db\7\t\2\2\u00db"+
		"\u00dc\5\64\33\2\u00dc\u00dd\5.\30\2\u00dd\u00de\7\n\2\2\u00de\u00df\5"+
		".\30\2\u00df\u00e0\b\16\1\2\u00e0\u00ea\3\2\2\2\u00e1\u00e2\7\t\2\2\u00e2"+
		"\u00e3\5\64\33\2\u00e3\u00e4\5.\30\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6"+
		"\7\n\2\2\u00e6\u00e7\5.\30\2\u00e7\u00e8\b\16\1\2\u00e8\u00ea\3\2\2\2"+
		"\u00e9\u00d5\3\2\2\2\u00e9\u00da\3\2\2\2\u00e9\u00e1\3\2\2\2\u00ea\33"+
		"\3\2\2\2\u00eb\u00ec\7\t\2\2\u00ec\u00ed\5\64\33\2\u00ed\u00ee\5\60\31"+
		"\2\u00ee\u00ef\7\n\2\2\u00ef\u00f0\5\60\31\2\u00f0\u00f1\b\17\1\2\u00f1"+
		"\u00fb\3\2\2\2\u00f2\u00f3\7\t\2\2\u00f3\u00f4\5\64\33\2\u00f4\u00f5\5"+
		"\60\31\2\u00f5\u00f6\5 \21\2\u00f6\u00f7\7\n\2\2\u00f7\u00f8\5\60\31\2"+
		"\u00f8\u00f9\b\17\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00eb\3\2\2\2\u00fa\u00f2"+
		"\3\2\2\2\u00fb\35\3\2\2\2\u00fc\u00fe\5\"\22\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\b\20\1\2\u0102\37\3\2\2\2\u0103\u0105\5$\23\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\b\21\1\2\u0109!\3\2\2\2\u010a\u010b\7\n\2\2"+
		"\u010b\u010c\7\t\2\2\u010c\u010d\5\64\33\2\u010d\u010e\5.\30\2\u010e\u010f"+
		"\b\22\1\2\u010f#\3\2\2\2\u0110\u0111\7\n\2\2\u0111\u0112\7\t\2\2\u0112"+
		"\u0113\5\64\33\2\u0113\u0114\5\60\31\2\u0114\u0115\b\23\1\2\u0115%\3\2"+
		"\2\2\u0116\u0117\7\13\2\2\u0117\u0118\5\64\33\2\u0118\u0119\7\63\2\2\u0119"+
		"\u011a\5(\25\2\u011a\u011b\7\64\2\2\u011b\u011c\b\24\1\2\u011c\u0134\3"+
		"\2\2\2\u011d\u011e\7\13\2\2\u011e\u011f\5\64\33\2\u011f\u0120\7\63\2\2"+
		"\u0120\u0121\5(\25\2\u0121\u0122\7 \2\2\u0122\u0123\7\37\2\2\u0123\u0124"+
		"\5.\30\2\u0124\u0125\7\32\2\2\u0125\u0126\7\64\2\2\u0126\u0127\b\24\1"+
		"\2\u0127\u0134\3\2\2\2\u0128\u0129\7\13\2\2\u0129\u012a\5\64\33\2\u012a"+
		"\u012b\7\63\2\2\u012b\u012c\5(\25\2\u012c\u012d\7 \2\2\u012d\u012e\7\37"+
		"\2\2\u012e\u012f\5\b\5\2\u012f\u0130\7\32\2\2\u0130\u0131\7\64\2\2\u0131"+
		"\u0132\b\24\1\2\u0132\u0134\3\2\2\2\u0133\u0116\3\2\2\2\u0133\u011d\3"+
		"\2\2\2\u0133\u0128\3\2\2\2\u0134\'\3\2\2\2\u0135\u0136\b\25\1\2\u0136"+
		"\u0137\5*\26\2\u0137\u0138\b\25\1\2\u0138\u013f\3\2\2\2\u0139\u013a\f"+
		"\4\2\2\u013a\u013b\5*\26\2\u013b\u013c\b\25\1\2\u013c\u013e\3\2\2\2\u013d"+
		"\u0139\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140)\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\5,\27\2\u0143\u0144"+
		"\7\37\2\2\u0144\u0145\5.\30\2\u0145\u0146\7\32\2\2\u0146\u0147\b\26\1"+
		"\2\u0147\u014f\3\2\2\2\u0148\u0149\5,\27\2\u0149\u014a\7\37\2\2\u014a"+
		"\u014b\5\b\5\2\u014b\u014c\7\32\2\2\u014c\u014d\b\26\1\2\u014d\u014f\3"+
		"\2\2\2\u014e\u0142\3\2\2\2\u014e\u0148\3\2\2\2\u014f+\3\2\2\2\u0150\u0151"+
		"\b\27\1\2\u0151\u0152\5<\37\2\u0152\u0153\b\27\1\2\u0153\u015b\3\2\2\2"+
		"\u0154\u0155\f\4\2\2\u0155\u0156\7\f\2\2\u0156\u0157\5<\37\2\u0157\u0158"+
		"\b\27\1\2\u0158\u015a\3\2\2\2\u0159\u0154\3\2\2\2\u015a\u015d\3\2\2\2"+
		"\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c-\3\2\2\2\u015d\u015b\3"+
		"\2\2\2\u015e\u015f\7\63\2\2\u015f\u0160\5\4\3\2\u0160\u0161\7\64\2\2\u0161"+
		"\u0162\b\30\1\2\u0162\u0167\3\2\2\2\u0163\u0164\7\63\2\2\u0164\u0165\7"+
		"\64\2\2\u0165\u0167\b\30\1\2\u0166\u015e\3\2\2\2\u0166\u0163\3\2\2\2\u0167"+
		"/\3\2\2\2\u0168\u0169\7\63\2\2\u0169\u016a\5\64\33\2\u016a\u016b\7\64"+
		"\2\2\u016b\u016c\b\31\1\2\u016c\61\3\2\2\2\u016d\u016e\7\4\2\2\u016e\u0178"+
		"\b\32\1\2\u016f\u0170\7\6\2\2\u0170\u0178\b\32\1\2\u0171\u0172\7\5\2\2"+
		"\u0172\u0178\b\32\1\2\u0173\u0174\7\7\2\2\u0174\u0178\b\32\1\2\u0175\u0176"+
		"\7\b\2\2\u0176\u0178\b\32\1\2\u0177\u016d\3\2\2\2\u0177\u016f\3\2\2\2"+
		"\u0177\u0171\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0175\3\2\2\2\u0178\63"+
		"\3\2\2\2\u0179\u017a\5\66\34\2\u017a\u017b\b\33\1\2\u017b\65\3\2\2\2\u017c"+
		"\u017d\b\34\1\2\u017d\u017e\7+\2\2\u017e\u017f\5\66\34\21\u017f\u0180"+
		"\b\34\1\2\u0180\u01b4\3\2\2\2\u0181\u0182\7\4\2\2\u0182\u0183\7\34\2\2"+
		"\u0183\u0184\7\20\2\2\u0184\u0185\7\61\2\2\u0185\u0186\5\66\34\2\u0186"+
		"\u0187\7\32\2\2\u0187\u0188\5\66\34\2\u0188\u0189\7\62\2\2\u0189\u018a"+
		"\b\34\1\2\u018a\u01b4\3\2\2\2\u018b\u018c\7\5\2\2\u018c\u018d\7\34\2\2"+
		"\u018d\u018e\7\21\2\2\u018e\u018f\7\61\2\2\u018f\u0190\5\66\34\2\u0190"+
		"\u0191\7\32\2\2\u0191\u0192\5\66\34\2\u0192\u0193\7\62\2\2\u0193\u0194"+
		"\b\34\1\2\u0194\u01b4\3\2\2\2\u0195\u0196\7/\2\2\u0196\u0197\5\66\34\13"+
		"\u0197\u0198\b\34\1\2\u0198\u01b4\3\2\2\2\u0199\u019a\7\65\2\2\u019a\u019b"+
		"\5\64\33\2\u019b\u019c\7\33\2\2\u019c\u019d\5\64\33\2\u019d\u019e\7\66"+
		"\2\2\u019e\u019f\b\34\1\2\u019f\u01b4\3\2\2\2\u01a0\u01a1\7\65\2\2\u01a1"+
		"\u01a2\5\f\7\2\u01a2\u01a3\7\66\2\2\u01a3\u01a4\b\34\1\2\u01a4\u01b4\3"+
		"\2\2\2\u01a5\u01a6\5<\37\2\u01a6\u01a7\b\34\1\2\u01a7\u01b4\3\2\2\2\u01a8"+
		"\u01a9\7\61\2\2\u01a9\u01aa\5\64\33\2\u01aa\u01ab\7\62\2\2\u01ab\u01ac"+
		"\b\34\1\2\u01ac\u01b4\3\2\2\2\u01ad\u01ae\58\35\2\u01ae\u01af\b\34\1\2"+
		"\u01af\u01b4\3\2\2\2\u01b0\u01b1\5\34\17\2\u01b1\u01b2\b\34\1\2\u01b2"+
		"\u01b4\3\2\2\2\u01b3\u017c\3\2\2\2\u01b3\u0181\3\2\2\2\u01b3\u018b\3\2"+
		"\2\2\u01b3\u0195\3\2\2\2\u01b3\u0199\3\2\2\2\u01b3\u01a0\3\2\2\2\u01b3"+
		"\u01a5\3\2\2\2\u01b3\u01a8\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01b0\3\2"+
		"\2\2\u01b4\u01d0\3\2\2\2\u01b5\u01b6\f\16\2\2\u01b6\u01b7\t\2\2\2\u01b7"+
		"\u01b8\5\66\34\17\u01b8\u01b9\b\34\1\2\u01b9\u01cf\3\2\2\2\u01ba\u01bb"+
		"\f\r\2\2\u01bb\u01bc\t\3\2\2\u01bc\u01bd\5\66\34\16\u01bd\u01be\b\34\1"+
		"\2\u01be\u01cf\3\2\2\2\u01bf\u01c0\f\f\2\2\u01c0\u01c1\t\4\2\2\u01c1\u01c2"+
		"\5\66\34\r\u01c2\u01c3\b\34\1\2\u01c3\u01cf\3\2\2\2\u01c4\u01c5\f\n\2"+
		"\2\u01c5\u01c6\7-\2\2\u01c6\u01c7\5\66\34\13\u01c7\u01c8\b\34\1\2\u01c8"+
		"\u01cf\3\2\2\2\u01c9\u01ca\f\t\2\2\u01ca\u01cb\7.\2\2\u01cb\u01cc\5\66"+
		"\34\n\u01cc\u01cd\b\34\1\2\u01cd\u01cf\3\2\2\2\u01ce\u01b5\3\2\2\2\u01ce"+
		"\u01ba\3\2\2\2\u01ce\u01bf\3\2\2\2\u01ce\u01c4\3\2\2\2\u01ce\u01c9\3\2"+
		"\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\67\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7\61\2\2\u01d4\u01d5\5\64"+
		"\33\2\u01d5\u01d6\7\17\2\2\u01d6\u01d7\5:\36\2\u01d7\u01d8\7\62\2\2\u01d8"+
		"\u01d9\b\35\1\2\u01d99\3\2\2\2\u01da\u01db\7\5\2\2\u01db\u01df\b\36\1"+
		"\2\u01dc\u01dd\7\4\2\2\u01dd\u01df\b\36\1\2\u01de\u01da\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df;\3\2\2\2\u01e0\u01e1\7\26\2\2\u01e1\u01ef\b\37\1"+
		"\2\u01e2\u01e3\7\27\2\2\u01e3\u01ef\b\37\1\2\u01e4\u01e5\5@!\2\u01e5\u01e6"+
		"\b\37\1\2\u01e6\u01ef\3\2\2\2\u01e7\u01e8\7\r\2\2\u01e8\u01ef\b\37\1\2"+
		"\u01e9\u01ea\7\16\2\2\u01ea\u01ef\b\37\1\2\u01eb\u01ec\5> \2\u01ec\u01ed"+
		"\b\37\1\2\u01ed\u01ef\3\2\2\2\u01ee\u01e0\3\2\2\2\u01ee\u01e2\3\2\2\2"+
		"\u01ee\u01e4\3\2\2\2\u01ee\u01e7\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ee\u01eb"+
		"\3\2\2\2\u01ef=\3\2\2\2\u01f0\u01f1\b \1\2\u01f1\u01f2\7!\2\2\u01f2\u01f3"+
		"\b \1\2\u01f3\u01fc\3\2\2\2\u01f4\u01f5\f\4\2\2\u01f5\u01f6\7\65\2\2\u01f6"+
		"\u01f7\5\64\33\2\u01f7\u01f8\7\66\2\2\u01f8\u01f9\b \1\2\u01f9\u01fb\3"+
		"\2\2\2\u01fa\u01f4\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd?\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\7\60\2\2"+
		"\u0200\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\7\30\2\2\u0205\u0207\t\5\2\2"+
		"\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020f"+
		"\b!\1\2\u0209\u020a\7\30\2\2\u020a\u020b\t\5\2\2\u020b\u020f\b!\1\2\u020c"+
		"\u020d\7\30\2\2\u020d\u020f\b!\1\2\u020e\u0200\3\2\2\2\u020e\u0209\3\2"+
		"\2\2\u020e\u020c\3\2\2\2\u020fA\3\2\2\2\36H_p\u0083\u009f\u00a4\u00b4"+
		"\u00c1\u00cd\u00e9\u00fa\u00ff\u0106\u0133\u013f\u014e\u015b\u0166\u0177"+
		"\u01b3\u01ce\u01d0\u01de\u01ee\u01fc\u0202\u0206\u020e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}