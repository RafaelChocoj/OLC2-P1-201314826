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
		NOT=45, AMP=46, PARIZQ=47, PARDER=48, LLAVEIZQ=49, LLAVEDER=50, WHITESPACE=51, 
		L_COMMENT=52;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_instruccion_only = 3, 
		RULE_printconsola = 4, RULE_declaracion = 5, RULE_is_mut = 6, RULE_asignacion = 7, 
		RULE_if_sent = 8, RULE_if_exp = 9, RULE_list_elseif = 10, RULE_list_elseif_exp = 11, 
		RULE_else_if = 12, RULE_else_if_exp = 13, RULE_match_sent = 14, RULE_match_brazos = 15, 
		RULE_matchbrazo = 16, RULE_listaOpciones = 17, RULE_bloque_inst = 18, 
		RULE_bloque_exp = 19, RULE_tipos_var = 20, RULE_expression = 21, RULE_expr_arit = 22, 
		RULE_casteo = 23, RULE_tipo_cast = 24, RULE_primitivo = 25, RULE_strings = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "instruccion_only", "printconsola", 
			"declaracion", "is_mut", "asignacion", "if_sent", "if_exp", "list_elseif", 
			"list_elseif_exp", "else_if", "else_if_exp", "match_sent", "match_brazos", 
			"matchbrazo", "listaOpciones", "bloque_inst", "bloque_exp", "tipos_var", 
			"expression", "expr_arit", "casteo", "tipo_cast", "primitivo", "strings"
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
			"'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'", "'{'", "'}'"
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
			"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "L_COMMENT"
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
			setState(54);
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_CON) | (1L << IF) | (1L << MATCH) | (1L << LET) | (1L << ID))) != 0)) {
				{
				{
				setState(57);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(62);
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((InstruccionContext)_localctx).printconsola = printconsola();
				setState(66);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(70);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(74);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				((InstruccionContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((InstruccionContext)_localctx).if_sent.instr
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				((Instruccion_onlyContext)_localctx).printconsola = printconsola();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).printconsola.instr
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				((Instruccion_onlyContext)_localctx).declaracion = declaracion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).declaracion.instr
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				((Instruccion_onlyContext)_localctx).asignacion = asignacion();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).asignacion.instr
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				((Instruccion_onlyContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((Instruccion_onlyContext)_localctx).if_sent.instr
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
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
		enterRule(_localctx, 8, RULE_printconsola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PRINT_CON);
			setState(103);
			match(PARIZQ);
			setState(104);
			((PrintconsolaContext)_localctx).expression = expression();
			setState(105);
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
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(LET);
				setState(109);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(110);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(111);
				match(DPUNTO2);
				setState(112);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(113);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(114);
				((DeclaracionContext)_localctx).expression = expression();

				                        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isMut.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(LET);
				setState(118);
				((DeclaracionContext)_localctx).isMut = is_mut();
				setState(119);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(120);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(121);
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
		enterRule(_localctx, 12, RULE_is_mut);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
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
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((AsignacionContext)_localctx).id = match(ID);
			setState(132);
			match(ASIGNACION);
			setState(133);
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
		enterRule(_localctx, 16, RULE_if_sent);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((If_sentContext)_localctx).IF = match(IF);
				setState(137);
				((If_sentContext)_localctx).expression = expression();
				setState(138);
				((If_sentContext)_localctx).bloque_inst = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p, ((If_sentContext)_localctx).bloque_inst.l, nil,nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((If_sentContext)_localctx).IF = match(IF);
				setState(142);
				((If_sentContext)_localctx).expression = expression();
				setState(143);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(144);
				match(ELSE);
				setState(145);
				((If_sentContext)_localctx).belse = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,nil,((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				((If_sentContext)_localctx).IF = match(IF);
				setState(149);
				((If_sentContext)_localctx).expression = expression();
				setState(150);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(151);
				((If_sentContext)_localctx).list_elseif = list_elseif();
				setState(152);
				match(ELSE);
				setState(153);
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
		enterRule(_localctx, 18, RULE_if_exp);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				((If_expContext)_localctx).IF = match(IF);
				setState(159);
				((If_expContext)_localctx).expression = expression();
				setState(160);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(161);
				match(ELSE);
				setState(162);
				((If_expContext)_localctx).belse_e = bloque_exp();
				_localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p, nil ,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, nil, ((If_expContext)_localctx).belse_e.p )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				((If_expContext)_localctx).IF = match(IF);
				setState(166);
				((If_expContext)_localctx).expression = expression();
				setState(167);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(168);
				((If_expContext)_localctx).list_elseif_exp = list_elseif_exp();
				setState(169);
				match(ELSE);
				setState(170);
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
		enterRule(_localctx, 20, RULE_list_elseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					((List_elseifContext)_localctx).else_if = else_if();
					((List_elseifContext)_localctx).list.add(((List_elseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 22, RULE_list_elseif_exp);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182);
					((List_elseif_expContext)_localctx).else_if_exp = else_if_exp();
					((List_elseif_expContext)_localctx).list.add(((List_elseif_expContext)_localctx).else_if_exp);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 24, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((Else_ifContext)_localctx).ELSE = match(ELSE);
			setState(190);
			match(IF);
			setState(191);
			((Else_ifContext)_localctx).expression = expression();
			setState(192);
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
		enterRule(_localctx, 26, RULE_else_if_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((Else_if_expContext)_localctx).ELSE = match(ELSE);
			setState(196);
			match(IF);
			setState(197);
			((Else_if_expContext)_localctx).expression = expression();
			setState(198);
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
		enterRule(_localctx, 28, RULE_match_sent);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(202);
				((Match_sentContext)_localctx).expression = expression();
				setState(203);
				match(LLAVEIZQ);
				setState(204);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(205);
				match(LLAVEDER);

				                        _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, nil, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(209);
				((Match_sentContext)_localctx).expression = expression();
				setState(210);
				match(LLAVEIZQ);
				setState(211);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(212);
				match(GUIONB);
				setState(213);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(214);
				((Match_sentContext)_localctx).bloque_inst = bloque_inst();
				setState(215);
				match(COMA);
				setState(216);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Match_sentContext)_localctx).expression.p, ((Match_sentContext)_localctx).brazos.l_brazos, ((Match_sentContext)_localctx).bloque_inst.l, nil, (((Match_sentContext)_localctx).MATCH!=null?((Match_sentContext)_localctx).MATCH.getLine():0), localctx.(*Match_sentContext).Get_MATCH().GetColumn() )
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				((Match_sentContext)_localctx).MATCH = match(MATCH);
				setState(220);
				((Match_sentContext)_localctx).expression = expression();
				setState(221);
				match(LLAVEIZQ);
				setState(222);
				((Match_sentContext)_localctx).brazos = match_brazos(0);
				setState(223);
				match(GUIONB);
				setState(224);
				((Match_sentContext)_localctx).th = match(MTHEN);
				setState(225);
				((Match_sentContext)_localctx).instruccion_only = instruccion_only();
				setState(226);
				match(COMA);
				setState(227);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_match_brazos, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(233);
			((Match_brazosContext)_localctx).matchbrazo = matchbrazo();
			_localctx.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
					setState(236);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(237);
					((Match_brazosContext)_localctx).matchbrazo = matchbrazo();

					                                              ((Match_brazosContext)_localctx).listb.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
					                                              _localctx.l_brazos = ((Match_brazosContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(244);
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
		enterRule(_localctx, 32, RULE_matchbrazo);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(246);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(247);
				((MatchbrazoContext)_localctx).bloque_inst = bloque_inst();
				setState(248);
				match(COMA);
				 _localctx.brazo = instructionExpre.NewBrazoMatch(((MatchbrazoContext)_localctx).listaOpciones.lisop, ((MatchbrazoContext)_localctx).bloque_inst.l, nil, (((MatchbrazoContext)_localctx).th!=null?((MatchbrazoContext)_localctx).th.getLine():0), localctx.(*MatchbrazoContext).GetTh().GetColumn() ) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(252);
				((MatchbrazoContext)_localctx).th = match(MTHEN);
				setState(253);
				((MatchbrazoContext)_localctx).instruccion_only = instruccion_only();
				setState(254);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_listaOpciones, _p);

		    _localctx.lisop = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(260);
			((ListaOpcionesContext)_localctx).primitivo = primitivo();

			                    _localctx.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
			                  
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
					setState(263);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(264);
					match(MTOR);
					setState(265);
					((ListaOpcionesContext)_localctx).primitivo = primitivo();

					                                                      ((ListaOpcionesContext)_localctx).list.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
					                                                      _localctx.lisop =  ((ListaOpcionesContext)_localctx).list.lisop
					                                                    
					}
					} 
				}
				setState(272);
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
		enterRule(_localctx, 36, RULE_bloque_inst);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(LLAVEIZQ);
				setState(274);
				((Bloque_instContext)_localctx).instrucciones = instrucciones();
				setState(275);
				match(LLAVEDER);
				_localctx.l = ((Bloque_instContext)_localctx).instrucciones.l 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(LLAVEIZQ);
				setState(279);
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
		enterRule(_localctx, 38, RULE_bloque_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(LLAVEIZQ);
			setState(284);
			((Bloque_expContext)_localctx).expression = expression();
			setState(285);
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
		enterRule(_localctx, 40, RULE_tipos_var);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(T_NUMBER);
				_localctx.tipo = interfaces.INTEGER
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T_STRING);
				_localctx.tipo = interfaces.STRING
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(T_FLOAT);
				_localctx.tipo = interfaces.FLOAT
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(T_BOOL);
				_localctx.tipo = interfaces.BOOLEAN
				}
				break;
			case T_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
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
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(304);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(305);
				((Expr_aritContext)_localctx).opU = expr_arit(13);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(308);
				match(T_NUMBER);
				setState(309);
				match(DOSPUNTO);
				setState(310);
				((Expr_aritContext)_localctx).op = match(POW);
				setState(311);
				match(PARIZQ);
				setState(312);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(313);
				match(COMA);
				setState(314);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(315);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 3:
				{
				setState(318);
				match(T_FLOAT);
				setState(319);
				match(DOSPUNTO);
				setState(320);
				((Expr_aritContext)_localctx).op = match(POWF);
				setState(321);
				match(PARIZQ);
				setState(322);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(323);
				match(COMA);
				setState(324);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(325);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 4:
				{
				setState(328);
				((Expr_aritContext)_localctx).op = match(NOT);
				setState(329);
				((Expr_aritContext)_localctx).opU = expr_arit(7);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"!",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 5:
				{
				setState(332);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 6:
				{
				setState(335);
				match(PARIZQ);
				setState(336);
				((Expr_aritContext)_localctx).expression = expression();
				setState(337);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 7:
				{
				setState(340);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			case 8:
				{
				setState(343);
				((Expr_aritContext)_localctx).if_exp = if_exp();
				_localctx.p = ((Expr_aritContext)_localctx).if_exp.p
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(373);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(348);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(349);
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
						setState(350);
						((Expr_aritContext)_localctx).opDe = expr_arit(11);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(353);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(354);
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
						setState(355);
						((Expr_aritContext)_localctx).opDe = expr_arit(10);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(358);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(359);
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
						setState(360);
						((Expr_aritContext)_localctx).opDe = expr_arit(9);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(363);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(364);
						((Expr_aritContext)_localctx).op = match(AND);
						setState(365);
						((Expr_aritContext)_localctx).opDe = expr_arit(7);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(368);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(369);
						((Expr_aritContext)_localctx).op = match(OR);
						setState(370);
						((Expr_aritContext)_localctx).opDe = expr_arit(6);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					}
					} 
				}
				setState(377);
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
		enterRule(_localctx, 46, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(379);
			((CasteoContext)_localctx).expression = expression();
			setState(380);
			match(AS);
			setState(381);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(382);
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
		enterRule(_localctx, 48, RULE_tipo_cast);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
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
		enterRule(_localctx, 50, RULE_primitivo);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
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
				setState(393);
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
				setState(395);
				((PrimitivoContext)_localctx).strings = strings();
				_localctx.p = ((PrimitivoContext)_localctx).strings.p
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				((PrimitivoContext)_localctx).ID = match(ID);
				 
				      _localctx.p = expresion.NewIdentificador((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), (((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getLine():0), localctx.(*PrimitivoContext).Get_ID().GetColumn() )
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(402);
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
		enterRule(_localctx, 52, RULE_strings);
		int _la;
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(406);
					match(AMP);
					}
					}
					setState(409); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AMP );
				setState(411);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(412);
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
				setState(416);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(417);
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
				setState(419);
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
		case 15:
			return match_brazos_sempred((Match_brazosContext)_localctx, predIndex);
		case 17:
			return listaOpciones_sempred((ListaOpcionesContext)_localctx, predIndex);
		case 22:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean match_brazos_sempred(Match_brazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaOpciones_sempred(ListaOpcionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u01aa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\b\5\b\u0084"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b0\n\13"+
		"\3\f\6\f\u00b3\n\f\r\f\16\f\u00b4\3\f\3\f\3\r\6\r\u00ba\n\r\r\r\16\r\u00bb"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00e9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f3"+
		"\n\21\f\21\16\21\u00f6\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0104\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u010f\n\23\f\23\16\23\u0112\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u011c\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u012d\n\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u015d\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u0178\n\30\f\30\16\30\u017b\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0188\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0197\n\33\3\34\6\34\u019a"+
		"\n\34\r\34\16\34\u019b\3\34\3\34\5\34\u01a0\n\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u01a8\n\34\3\34\2\5 $.\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\6\4\2(),,\3\2*+\3\2\"\'\3\2\24\25\2\u01be"+
		"\28\3\2\2\2\4>\3\2\2\2\6U\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\f~\3\2\2\2\16"+
		"\u0083\3\2\2\2\20\u0085\3\2\2\2\22\u009e\3\2\2\2\24\u00af\3\2\2\2\26\u00b2"+
		"\3\2\2\2\30\u00b9\3\2\2\2\32\u00bf\3\2\2\2\34\u00c5\3\2\2\2\36\u00e8\3"+
		"\2\2\2 \u00ea\3\2\2\2\"\u0103\3\2\2\2$\u0105\3\2\2\2&\u011b\3\2\2\2(\u011d"+
		"\3\2\2\2*\u012c\3\2\2\2,\u012e\3\2\2\2.\u015c\3\2\2\2\60\u017c\3\2\2\2"+
		"\62\u0187\3\2\2\2\64\u0196\3\2\2\2\66\u01a7\3\2\2\289\5\4\3\29:\b\2\1"+
		"\2:\3\3\2\2\2;=\5\6\4\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2"+
		"\2\2@>\3\2\2\2AB\b\3\1\2B\5\3\2\2\2CD\5\n\6\2DE\7\33\2\2EF\b\4\1\2FV\3"+
		"\2\2\2GH\5\f\7\2HI\7\33\2\2IJ\b\4\1\2JV\3\2\2\2KL\5\20\t\2LM\7\33\2\2"+
		"MN\b\4\1\2NV\3\2\2\2OP\5\22\n\2PQ\b\4\1\2QV\3\2\2\2RS\5\36\20\2ST\b\4"+
		"\1\2TV\3\2\2\2UC\3\2\2\2UG\3\2\2\2UK\3\2\2\2UO\3\2\2\2UR\3\2\2\2V\7\3"+
		"\2\2\2WX\5\n\6\2XY\b\5\1\2Yg\3\2\2\2Z[\5\f\7\2[\\\b\5\1\2\\g\3\2\2\2]"+
		"^\5\20\t\2^_\b\5\1\2_g\3\2\2\2`a\5\22\n\2ab\b\5\1\2bg\3\2\2\2cd\5\36\20"+
		"\2de\b\5\1\2eg\3\2\2\2fW\3\2\2\2fZ\3\2\2\2f]\3\2\2\2f`\3\2\2\2fc\3\2\2"+
		"\2g\t\3\2\2\2hi\7\3\2\2ij\7\61\2\2jk\5,\27\2kl\7\62\2\2lm\b\6\1\2m\13"+
		"\3\2\2\2no\7\22\2\2op\5\16\b\2pq\7!\2\2qr\7\35\2\2rs\5*\26\2st\7\36\2"+
		"\2tu\5,\27\2uv\b\7\1\2v\177\3\2\2\2wx\7\22\2\2xy\5\16\b\2yz\7!\2\2z{\7"+
		"\36\2\2{|\5,\27\2|}\b\7\1\2}\177\3\2\2\2~n\3\2\2\2~w\3\2\2\2\177\r\3\2"+
		"\2\2\u0080\u0081\7\23\2\2\u0081\u0084\b\b\1\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0082\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086\7!\2\2"+
		"\u0086\u0087\7\36\2\2\u0087\u0088\5,\27\2\u0088\u0089\b\t\1\2\u0089\21"+
		"\3\2\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5,\27\2\u008c\u008d\5&\24\2\u008d"+
		"\u008e\b\n\1\2\u008e\u009f\3\2\2\2\u008f\u0090\7\t\2\2\u0090\u0091\5,"+
		"\27\2\u0091\u0092\5&\24\2\u0092\u0093\7\n\2\2\u0093\u0094\5&\24\2\u0094"+
		"\u0095\b\n\1\2\u0095\u009f\3\2\2\2\u0096\u0097\7\t\2\2\u0097\u0098\5,"+
		"\27\2\u0098\u0099\5&\24\2\u0099\u009a\5\26\f\2\u009a\u009b\7\n\2\2\u009b"+
		"\u009c\5&\24\2\u009c\u009d\b\n\1\2\u009d\u009f\3\2\2\2\u009e\u008a\3\2"+
		"\2\2\u009e\u008f\3\2\2\2\u009e\u0096\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1"+
		"\7\t\2\2\u00a1\u00a2\5,\27\2\u00a2\u00a3\5(\25\2\u00a3\u00a4\7\n\2\2\u00a4"+
		"\u00a5\5(\25\2\u00a5\u00a6\b\13\1\2\u00a6\u00b0\3\2\2\2\u00a7\u00a8\7"+
		"\t\2\2\u00a8\u00a9\5,\27\2\u00a9\u00aa\5(\25\2\u00aa\u00ab\5\30\r\2\u00ab"+
		"\u00ac\7\n\2\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\b\13\1\2\u00ae\u00b0\3"+
		"\2\2\2\u00af\u00a0\3\2\2\2\u00af\u00a7\3\2\2\2\u00b0\25\3\2\2\2\u00b1"+
		"\u00b3\5\32\16\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\f\1\2\u00b7"+
		"\27\3\2\2\2\u00b8\u00ba\5\34\17\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\b\r\1\2\u00be\31\3\2\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00c1\7\t\2"+
		"\2\u00c1\u00c2\5,\27\2\u00c2\u00c3\5&\24\2\u00c3\u00c4\b\16\1\2\u00c4"+
		"\33\3\2\2\2\u00c5\u00c6\7\n\2\2\u00c6\u00c7\7\t\2\2\u00c7\u00c8\5,\27"+
		"\2\u00c8\u00c9\5(\25\2\u00c9\u00ca\b\17\1\2\u00ca\35\3\2\2\2\u00cb\u00cc"+
		"\7\13\2\2\u00cc\u00cd\5,\27\2\u00cd\u00ce\7\63\2\2\u00ce\u00cf\5 \21\2"+
		"\u00cf\u00d0\7\64\2\2\u00d0\u00d1\b\20\1\2\u00d1\u00e9\3\2\2\2\u00d2\u00d3"+
		"\7\13\2\2\u00d3\u00d4\5,\27\2\u00d4\u00d5\7\63\2\2\u00d5\u00d6\5 \21\2"+
		"\u00d6\u00d7\7 \2\2\u00d7\u00d8\7\37\2\2\u00d8\u00d9\5&\24\2\u00d9\u00da"+
		"\7\32\2\2\u00da\u00db\7\64\2\2\u00db\u00dc\b\20\1\2\u00dc\u00e9\3\2\2"+
		"\2\u00dd\u00de\7\13\2\2\u00de\u00df\5,\27\2\u00df\u00e0\7\63\2\2\u00e0"+
		"\u00e1\5 \21\2\u00e1\u00e2\7 \2\2\u00e2\u00e3\7\37\2\2\u00e3\u00e4\5\b"+
		"\5\2\u00e4\u00e5\7\32\2\2\u00e5\u00e6\7\64\2\2\u00e6\u00e7\b\20\1\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00cb\3\2\2\2\u00e8\u00d2\3\2\2\2\u00e8\u00dd\3\2"+
		"\2\2\u00e9\37\3\2\2\2\u00ea\u00eb\b\21\1\2\u00eb\u00ec\5\"\22\2\u00ec"+
		"\u00ed\b\21\1\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\f\4\2\2\u00ef\u00f0\5"+
		"\"\22\2\u00f0\u00f1\b\21\1\2\u00f1\u00f3\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5!\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f7\u00f8\5$\23\2\u00f8\u00f9\7\37\2\2\u00f9\u00fa"+
		"\5&\24\2\u00fa\u00fb\7\32\2\2\u00fb\u00fc\b\22\1\2\u00fc\u0104\3\2\2\2"+
		"\u00fd\u00fe\5$\23\2\u00fe\u00ff\7\37\2\2\u00ff\u0100\5\b\5\2\u0100\u0101"+
		"\7\32\2\2\u0101\u0102\b\22\1\2\u0102\u0104\3\2\2\2\u0103\u00f7\3\2\2\2"+
		"\u0103\u00fd\3\2\2\2\u0104#\3\2\2\2\u0105\u0106\b\23\1\2\u0106\u0107\5"+
		"\64\33\2\u0107\u0108\b\23\1\2\u0108\u0110\3\2\2\2\u0109\u010a\f\4\2\2"+
		"\u010a\u010b\7\f\2\2\u010b\u010c\5\64\33\2\u010c\u010d\b\23\1\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0109\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111%\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114"+
		"\7\63\2\2\u0114\u0115\5\4\3\2\u0115\u0116\7\64\2\2\u0116\u0117\b\24\1"+
		"\2\u0117\u011c\3\2\2\2\u0118\u0119\7\63\2\2\u0119\u011a\7\64\2\2\u011a"+
		"\u011c\b\24\1\2\u011b\u0113\3\2\2\2\u011b\u0118\3\2\2\2\u011c\'\3\2\2"+
		"\2\u011d\u011e\7\63\2\2\u011e\u011f\5,\27\2\u011f\u0120\7\64\2\2\u0120"+
		"\u0121\b\25\1\2\u0121)\3\2\2\2\u0122\u0123\7\4\2\2\u0123\u012d\b\26\1"+
		"\2\u0124\u0125\7\6\2\2\u0125\u012d\b\26\1\2\u0126\u0127\7\5\2\2\u0127"+
		"\u012d\b\26\1\2\u0128\u0129\7\7\2\2\u0129\u012d\b\26\1\2\u012a\u012b\7"+
		"\b\2\2\u012b\u012d\b\26\1\2\u012c\u0122\3\2\2\2\u012c\u0124\3\2\2\2\u012c"+
		"\u0126\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u012a\3\2\2\2\u012d+\3\2\2\2"+
		"\u012e\u012f\5.\30\2\u012f\u0130\b\27\1\2\u0130-\3\2\2\2\u0131\u0132\b"+
		"\30\1\2\u0132\u0133\7+\2\2\u0133\u0134\5.\30\17\u0134\u0135\b\30\1\2\u0135"+
		"\u015d\3\2\2\2\u0136\u0137\7\4\2\2\u0137\u0138\7\34\2\2\u0138\u0139\7"+
		"\20\2\2\u0139\u013a\7\61\2\2\u013a\u013b\5.\30\2\u013b\u013c\7\32\2\2"+
		"\u013c\u013d\5.\30\2\u013d\u013e\7\62\2\2\u013e\u013f\b\30\1\2\u013f\u015d"+
		"\3\2\2\2\u0140\u0141\7\5\2\2\u0141\u0142\7\34\2\2\u0142\u0143\7\21\2\2"+
		"\u0143\u0144\7\61\2\2\u0144\u0145\5.\30\2\u0145\u0146\7\32\2\2\u0146\u0147"+
		"\5.\30\2\u0147\u0148\7\62\2\2\u0148\u0149\b\30\1\2\u0149\u015d\3\2\2\2"+
		"\u014a\u014b\7/\2\2\u014b\u014c\5.\30\t\u014c\u014d\b\30\1\2\u014d\u015d"+
		"\3\2\2\2\u014e\u014f\5\64\33\2\u014f\u0150\b\30\1\2\u0150\u015d\3\2\2"+
		"\2\u0151\u0152\7\61\2\2\u0152\u0153\5,\27\2\u0153\u0154\7\62\2\2\u0154"+
		"\u0155\b\30\1\2\u0155\u015d\3\2\2\2\u0156\u0157\5\60\31\2\u0157\u0158"+
		"\b\30\1\2\u0158\u015d\3\2\2\2\u0159\u015a\5\24\13\2\u015a\u015b\b\30\1"+
		"\2\u015b\u015d\3\2\2\2\u015c\u0131\3\2\2\2\u015c\u0136\3\2\2\2\u015c\u0140"+
		"\3\2\2\2\u015c\u014a\3\2\2\2\u015c\u014e\3\2\2\2\u015c\u0151\3\2\2\2\u015c"+
		"\u0156\3\2\2\2\u015c\u0159\3\2\2\2\u015d\u0179\3\2\2\2\u015e\u015f\f\f"+
		"\2\2\u015f\u0160\t\2\2\2\u0160\u0161\5.\30\r\u0161\u0162\b\30\1\2\u0162"+
		"\u0178\3\2\2\2\u0163\u0164\f\13\2\2\u0164\u0165\t\3\2\2\u0165\u0166\5"+
		".\30\f\u0166\u0167\b\30\1\2\u0167\u0178\3\2\2\2\u0168\u0169\f\n\2\2\u0169"+
		"\u016a\t\4\2\2\u016a\u016b\5.\30\13\u016b\u016c\b\30\1\2\u016c\u0178\3"+
		"\2\2\2\u016d\u016e\f\b\2\2\u016e\u016f\7-\2\2\u016f\u0170\5.\30\t\u0170"+
		"\u0171\b\30\1\2\u0171\u0178\3\2\2\2\u0172\u0173\f\7\2\2\u0173\u0174\7"+
		".\2\2\u0174\u0175\5.\30\b\u0175\u0176\b\30\1\2\u0176\u0178\3\2\2\2\u0177"+
		"\u015e\3\2\2\2\u0177\u0163\3\2\2\2\u0177\u0168\3\2\2\2\u0177\u016d\3\2"+
		"\2\2\u0177\u0172\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a/\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7\61\2\2"+
		"\u017d\u017e\5,\27\2\u017e\u017f\7\17\2\2\u017f\u0180\5\62\32\2\u0180"+
		"\u0181\7\62\2\2\u0181\u0182\b\31\1\2\u0182\61\3\2\2\2\u0183\u0184\7\5"+
		"\2\2\u0184\u0188\b\32\1\2\u0185\u0186\7\4\2\2\u0186\u0188\b\32\1\2\u0187"+
		"\u0183\3\2\2\2\u0187\u0185\3\2\2\2\u0188\63\3\2\2\2\u0189\u018a\7\26\2"+
		"\2\u018a\u0197\b\33\1\2\u018b\u018c\7\27\2\2\u018c\u0197\b\33\1\2\u018d"+
		"\u018e\5\66\34\2\u018e\u018f\b\33\1\2\u018f\u0197\3\2\2\2\u0190\u0191"+
		"\7!\2\2\u0191\u0197\b\33\1\2\u0192\u0193\7\r\2\2\u0193\u0197\b\33\1\2"+
		"\u0194\u0195\7\16\2\2\u0195\u0197\b\33\1\2\u0196\u0189\3\2\2\2\u0196\u018b"+
		"\3\2\2\2\u0196\u018d\3\2\2\2\u0196\u0190\3\2\2\2\u0196\u0192\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\65\3\2\2\2\u0198\u019a\7\60\2\2\u0199\u0198\3\2\2"+
		"\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u019f\7\30\2\2\u019e\u01a0\t\5\2\2\u019f\u019e\3\2\2\2"+
		"\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a8\b\34\1\2\u01a2\u01a3"+
		"\7\30\2\2\u01a3\u01a4\t\5\2\2\u01a4\u01a8\b\34\1\2\u01a5\u01a6\7\30\2"+
		"\2\u01a6\u01a8\b\34\1\2\u01a7\u0199\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\67\3\2\2\2\31>Uf~\u0083\u009e\u00af\u00b4\u00bb\u00e8"+
		"\u00f4\u0103\u0110\u011b\u012c\u015c\u0177\u0179\u0187\u0196\u019b\u019f"+
		"\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}