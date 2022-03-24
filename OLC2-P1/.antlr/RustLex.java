// Generated from d:\ARCHIVOS\Documents\1s_2022\compi2\lab\Repositorio\OLC2-P1\RustLex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RustLex extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "T_CHAT", 
			"T_ARRAY", "T_VECTOR", "USIZE", "IF", "ELSE", "WHILE", "LOOP", "FOR", 
			"IN", "BREAK", "CONTINUE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", 
			"POWF", "LET", "MUT", "STRUCT", "VEC", "VECN", "CAPACITY", "TO_STRING", 
			"TO_OWNED", "LEN", "NEW", "CAPF", "CLONE", "ABS", "SQRT", "PUSH", "CONTAINS", 
			"INSERT", "REMOVE", "MODULO", "PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", 
			"NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", 
			"ASIGNACION", "MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", 
			"OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", 
			"CORDER", "CHAR", "WHITESPACE", "L_COMMENT", "COMMENT", "ESC_SEQ"
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


	public RustLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RustLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2X\u025d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3"+
		"/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\6\63\u01d6\n\63\r\63\16\63\u01d7\3\64\6\64\u01db\n\64\r\64"+
		"\16\64\u01dc\3\64\3\64\6\64\u01e1\n\64\r\64\16\64\u01e2\3\65\3\65\7\65"+
		"\u01e7\n\65\f\65\16\65\u01ea\13\65\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3>\3>\7>\u0202\n>\f>\16>\u0205\13"+
		">\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3"+
		"H\3H\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3"+
		"R\3S\3S\3T\3T\3T\3T\3U\6U\u023c\nU\rU\16U\u023d\3U\3U\3V\3V\3V\3V\7V\u0246"+
		"\nV\fV\16V\u0249\13V\3V\3V\3W\3W\3W\3W\7W\u0251\nW\fW\16W\u0254\13W\3"+
		"W\3W\3W\3W\3W\3X\3X\3X\3\u0252\2Y\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00ad"+
		"X\u00af\2\3\2\f\3\2\62;\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\3\2"+
		"))\5\2\62;C\\c|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB"+
		"]_\2\u0263\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\3\u00b1\3\2\2"+
		"\2\5\u00ba\3\2\2\2\7\u00be\3\2\2\2\t\u00c2\3\2\2\2\13\u00c9\3\2\2\2\r"+
		"\u00ce\3\2\2\2\17\u00d3\3\2\2\2\21\u00d8\3\2\2\2\23\u00de\3\2\2\2\25\u00e5"+
		"\3\2\2\2\27\u00eb\3\2\2\2\31\u00ee\3\2\2\2\33\u00f3\3\2\2\2\35\u00f9\3"+
		"\2\2\2\37\u00fe\3\2\2\2!\u0102\3\2\2\2#\u0105\3\2\2\2%\u010b\3\2\2\2\'"+
		"\u0114\3\2\2\2)\u011a\3\2\2\2+\u011c\3\2\2\2-\u0121\3\2\2\2/\u0127\3\2"+
		"\2\2\61\u012a\3\2\2\2\63\u012e\3\2\2\2\65\u0133\3\2\2\2\67\u0137\3\2\2"+
		"\29\u013b\3\2\2\2;\u0142\3\2\2\2=\u0147\3\2\2\2?\u014b\3\2\2\2A\u0159"+
		"\3\2\2\2C\u0166\3\2\2\2E\u0172\3\2\2\2G\u0178\3\2\2\2I\u017e\3\2\2\2K"+
		"\u0189\3\2\2\2M\u0191\3\2\2\2O\u0197\3\2\2\2Q\u019e\3\2\2\2S\u01a3\3\2"+
		"\2\2U\u01ac\3\2\2\2W\u01b3\3\2\2\2Y\u01ba\3\2\2\2[\u01be\3\2\2\2]\u01c2"+
		"\3\2\2\2_\u01c5\3\2\2\2a\u01c8\3\2\2\2c\u01cd\3\2\2\2e\u01d5\3\2\2\2g"+
		"\u01da\3\2\2\2i\u01e4\3\2\2\2k\u01ed\3\2\2\2m\u01ef\3\2\2\2o\u01f1\3\2"+
		"\2\2q\u01f3\3\2\2\2s\u01f6\3\2\2\2u\u01f8\3\2\2\2w\u01fa\3\2\2\2y\u01fd"+
		"\3\2\2\2{\u01ff\3\2\2\2}\u0206\3\2\2\2\177\u0209\3\2\2\2\u0081\u020c\3"+
		"\2\2\2\u0083\u020f\3\2\2\2\u0085\u0212\3\2\2\2\u0087\u0214\3\2\2\2\u0089"+
		"\u0216\3\2\2\2\u008b\u0218\3\2\2\2\u008d\u021a\3\2\2\2\u008f\u021c\3\2"+
		"\2\2\u0091\u021e\3\2\2\2\u0093\u0220\3\2\2\2\u0095\u0223\3\2\2\2\u0097"+
		"\u0226\3\2\2\2\u0099\u0228\3\2\2\2\u009b\u022a\3\2\2\2\u009d\u022c\3\2"+
		"\2\2\u009f\u022e\3\2\2\2\u00a1\u0230\3\2\2\2\u00a3\u0232\3\2\2\2\u00a5"+
		"\u0234\3\2\2\2\u00a7\u0236\3\2\2\2\u00a9\u023b\3\2\2\2\u00ab\u0241\3\2"+
		"\2\2\u00ad\u024c\3\2\2\2\u00af\u025a\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2"+
		"\u00b6\u00b7\7n\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7#\2\2\u00b9\4\3\2"+
		"\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\78\2\2\u00bc\u00bd\7\66\2\2\u00bd"+
		"\6\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\78\2\2\u00c0\u00c1\7\66\2\2"+
		"\u00c1\b\3\2\2\2\u00c2\u00c3\7U\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t"+
		"\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7i\2\2\u00c8\n"+
		"\3\2\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7q\2\2\u00cc"+
		"\u00cd\7n\2\2\u00cd\f\3\2\2\2\u00ce\u00cf\7(\2\2\u00cf\u00d0\7u\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\16\3\2\2\2\u00d3\u00d4\7e\2\2\u00d4"+
		"\u00d5\7j\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7t\2\2\u00d7\20\3\2\2\2\u00d8"+
		"\u00d9\7c\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7c\2\2"+
		"\u00dc\u00dd\7{\2\2\u00dd\22\3\2\2\2\u00de\u00df\7X\2\2\u00df\u00e0\7"+
		"g\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\24\3\2\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7k\2\2\u00e8\u00e9\7|\2\2\u00e9\u00ea\7g\2\2\u00ea\26\3\2\2\2\u00eb\u00ec"+
		"\7k\2\2\u00ec\u00ed\7h\2\2\u00ed\30\3\2\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0"+
		"\7n\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7g\2\2\u00f2\32\3\2\2\2\u00f3\u00f4"+
		"\7y\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7n\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\34\3\2\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7q\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fc\u00fd\7r\2\2\u00fd\36\3\2\2\2\u00fe\u00ff\7h\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7t\2\2\u0101 \3\2\2\2\u0102\u0103\7k\2\2\u0103"+
		"\u0104\7p\2\2\u0104\"\3\2\2\2\u0105\u0106\7d\2\2\u0106\u0107\7t\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7c\2\2\u0109\u010a\7m\2\2\u010a$\3\2\2\2\u010b"+
		"\u010c\7e\2\2\u010c\u010d\7q\2\2\u010d\u010e\7p\2\2\u010e\u010f\7v\2\2"+
		"\u010f\u0110\7k\2\2\u0110\u0111\7p\2\2\u0111\u0112\7w\2\2\u0112\u0113"+
		"\7g\2\2\u0113&\3\2\2\2\u0114\u0115\7o\2\2\u0115\u0116\7c\2\2\u0116\u0117"+
		"\7v\2\2\u0117\u0118\7e\2\2\u0118\u0119\7j\2\2\u0119(\3\2\2\2\u011a\u011b"+
		"\7~\2\2\u011b*\3\2\2\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f"+
		"\7w\2\2\u011f\u0120\7g\2\2\u0120,\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123"+
		"\7c\2\2\u0123\u0124\7n\2\2\u0124\u0125\7u\2\2\u0125\u0126\7g\2\2\u0126"+
		".\3\2\2\2\u0127\u0128\7c\2\2\u0128\u0129\7u\2\2\u0129\60\3\2\2\2\u012a"+
		"\u012b\7r\2\2\u012b\u012c\7q\2\2\u012c\u012d\7y\2\2\u012d\62\3\2\2\2\u012e"+
		"\u012f\7r\2\2\u012f\u0130\7q\2\2\u0130\u0131\7y\2\2\u0131\u0132\7h\2\2"+
		"\u0132\64\3\2\2\2\u0133\u0134\7n\2\2\u0134\u0135\7g\2\2\u0135\u0136\7"+
		"v\2\2\u0136\66\3\2\2\2\u0137\u0138\7o\2\2\u0138\u0139\7w\2\2\u0139\u013a"+
		"\7v\2\2\u013a8\3\2\2\2\u013b\u013c\7u\2\2\u013c\u013d\7v\2\2\u013d\u013e"+
		"\7t\2\2\u013e\u013f\7w\2\2\u013f\u0140\7e\2\2\u0140\u0141\7v\2\2\u0141"+
		":\3\2\2\2\u0142\u0143\7x\2\2\u0143\u0144\7g\2\2\u0144\u0145\7e\2\2\u0145"+
		"\u0146\7#\2\2\u0146<\3\2\2\2\u0147\u0148\7X\2\2\u0148\u0149\7g\2\2\u0149"+
		"\u014a\7e\2\2\u014a>\3\2\2\2\u014b\u014c\7y\2\2\u014c\u014d\7k\2\2\u014d"+
		"\u014e\7v\2\2\u014e\u014f\7j\2\2\u014f\u0150\7a\2\2\u0150\u0151\7e\2\2"+
		"\u0151\u0152\7c\2\2\u0152\u0153\7r\2\2\u0153\u0154\7c\2\2\u0154\u0155"+
		"\7e\2\2\u0155\u0156\7k\2\2\u0156\u0157\7v\2\2\u0157\u0158\7{\2\2\u0158"+
		"@\3\2\2\2\u0159\u015a\7\60\2\2\u015a\u015b\7v\2\2\u015b\u015c\7q\2\2\u015c"+
		"\u015d\7a\2\2\u015d\u015e\7u\2\2\u015e\u015f\7v\2\2\u015f\u0160\7t\2\2"+
		"\u0160\u0161\7k\2\2\u0161\u0162\7p\2\2\u0162\u0163\7i\2\2\u0163\u0164"+
		"\7*\2\2\u0164\u0165\7+\2\2\u0165B\3\2\2\2\u0166\u0167\7\60\2\2\u0167\u0168"+
		"\7v\2\2\u0168\u0169\7q\2\2\u0169\u016a\7a\2\2\u016a\u016b\7q\2\2\u016b"+
		"\u016c\7y\2\2\u016c\u016d\7p\2\2\u016d\u016e\7g\2\2\u016e\u016f\7f\2\2"+
		"\u016f\u0170\7*\2\2\u0170\u0171\7+\2\2\u0171D\3\2\2\2\u0172\u0173\7n\2"+
		"\2\u0173\u0174\7g\2\2\u0174\u0175\7p\2\2\u0175\u0176\7*\2\2\u0176\u0177"+
		"\7+\2\2\u0177F\3\2\2\2\u0178\u0179\7p\2\2\u0179\u017a\7g\2\2\u017a\u017b"+
		"\7y\2\2\u017b\u017c\7*\2\2\u017c\u017d\7+\2\2\u017dH\3\2\2\2\u017e\u017f"+
		"\7e\2\2\u017f\u0180\7c\2\2\u0180\u0181\7r\2\2\u0181\u0182\7c\2\2\u0182"+
		"\u0183\7e\2\2\u0183\u0184\7k\2\2\u0184\u0185\7v\2\2\u0185\u0186\7{\2\2"+
		"\u0186\u0187\7*\2\2\u0187\u0188\7+\2\2\u0188J\3\2\2\2\u0189\u018a\7e\2"+
		"\2\u018a\u018b\7n\2\2\u018b\u018c\7q\2\2\u018c\u018d\7p\2\2\u018d\u018e"+
		"\7g\2\2\u018e\u018f\7*\2\2\u018f\u0190\7+\2\2\u0190L\3\2\2\2\u0191\u0192"+
		"\7c\2\2\u0192\u0193\7d\2\2\u0193\u0194\7u\2\2\u0194\u0195\7*\2\2\u0195"+
		"\u0196\7+\2\2\u0196N\3\2\2\2\u0197\u0198\7u\2\2\u0198\u0199\7s\2\2\u0199"+
		"\u019a\7t\2\2\u019a\u019b\7v\2\2\u019b\u019c\7*\2\2\u019c\u019d\7+\2\2"+
		"\u019dP\3\2\2\2\u019e\u019f\7r\2\2\u019f\u01a0\7w\2\2\u01a0\u01a1\7u\2"+
		"\2\u01a1\u01a2\7j\2\2\u01a2R\3\2\2\2\u01a3\u01a4\7e\2\2\u01a4\u01a5\7"+
		"q\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9"+
		"\7k\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7u\2\2\u01abT\3\2\2\2\u01ac\u01ad"+
		"\7k\2\2\u01ad\u01ae\7p\2\2\u01ae\u01af\7u\2\2\u01af\u01b0\7g\2\2\u01b0"+
		"\u01b1\7t\2\2\u01b1\u01b2\7v\2\2\u01b2V\3\2\2\2\u01b3\u01b4\7t\2\2\u01b4"+
		"\u01b5\7g\2\2\u01b5\u01b6\7o\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8\7x\2\2"+
		"\u01b8\u01b9\7g\2\2\u01b9X\3\2\2\2\u01ba\u01bb\7o\2\2\u01bb\u01bc\7q\2"+
		"\2\u01bc\u01bd\7f\2\2\u01bdZ\3\2\2\2\u01be\u01bf\7r\2\2\u01bf\u01c0\7"+
		"w\2\2\u01c0\u01c1\7d\2\2\u01c1\\\3\2\2\2\u01c2\u01c3\7/\2\2\u01c3\u01c4"+
		"\7@\2\2\u01c4^\3\2\2\2\u01c5\u01c6\7h\2\2\u01c6\u01c7\7p\2\2\u01c7`\3"+
		"\2\2\2\u01c8\u01c9\7o\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7k\2\2\u01cb"+
		"\u01cc\7p\2\2\u01ccb\3\2\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf\7g\2\2\u01cf"+
		"\u01d0\7v\2\2\u01d0\u01d1\7w\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3\7p\2\2"+
		"\u01d3d\3\2\2\2\u01d4\u01d6\t\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3"+
		"\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8f\3\2\2\2\u01d9\u01db"+
		"\t\2\2\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\t\3\2\2\u01df\u01e1\t\2"+
		"\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3h\3\2\2\2\u01e4\u01e8\7$\2\2\u01e5\u01e7\n\4\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\7$\2\2\u01ec"+
		"j\3\2\2\2\u01ed\u01ee\7\60\2\2\u01eel\3\2\2\2\u01ef\u01f0\7.\2\2\u01f0"+
		"n\3\2\2\2\u01f1\u01f2\7=\2\2\u01f2p\3\2\2\2\u01f3\u01f4\7<\2\2\u01f4\u01f5"+
		"\7<\2\2\u01f5r\3\2\2\2\u01f6\u01f7\7<\2\2\u01f7t\3\2\2\2\u01f8\u01f9\7"+
		"?\2\2\u01f9v\3\2\2\2\u01fa\u01fb\7?\2\2\u01fb\u01fc\7@\2\2\u01fcx\3\2"+
		"\2\2\u01fd\u01fe\7a\2\2\u01fez\3\2\2\2\u01ff\u0203\t\5\2\2\u0200\u0202"+
		"\t\6\2\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204|\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7#\2\2\u0207"+
		"\u0208\7?\2\2\u0208~\3\2\2\2\u0209\u020a\7?\2\2\u020a\u020b\7?\2\2\u020b"+
		"\u0080\3\2\2\2\u020c\u020d\7@\2\2\u020d\u020e\7?\2\2\u020e\u0082\3\2\2"+
		"\2\u020f\u0210\7>\2\2\u0210\u0211\7?\2\2\u0211\u0084\3\2\2\2\u0212\u0213"+
		"\7@\2\2\u0213\u0086\3\2\2\2\u0214\u0215\7>\2\2\u0215\u0088\3\2\2\2\u0216"+
		"\u0217\7,\2\2\u0217\u008a\3\2\2\2\u0218\u0219\7\61\2\2\u0219\u008c\3\2"+
		"\2\2\u021a\u021b\7-\2\2\u021b\u008e\3\2\2\2\u021c\u021d\7/\2\2\u021d\u0090"+
		"\3\2\2\2\u021e\u021f\7\'\2\2\u021f\u0092\3\2\2\2\u0220\u0221\7(\2\2\u0221"+
		"\u0222\7(\2\2\u0222\u0094\3\2\2\2\u0223\u0224\7~\2\2\u0224\u0225\7~\2"+
		"\2\u0225\u0096\3\2\2\2\u0226\u0227\7#\2\2\u0227\u0098\3\2\2\2\u0228\u0229"+
		"\7(\2\2\u0229\u009a\3\2\2\2\u022a\u022b\7*\2\2\u022b\u009c\3\2\2\2\u022c"+
		"\u022d\7+\2\2\u022d\u009e\3\2\2\2\u022e\u022f\7}\2\2\u022f\u00a0\3\2\2"+
		"\2\u0230\u0231\7\177\2\2\u0231\u00a2\3\2\2\2\u0232\u0233\7]\2\2\u0233"+
		"\u00a4\3\2\2\2\u0234\u0235\7_\2\2\u0235\u00a6\3\2\2\2\u0236\u0237\t\7"+
		"\2\2\u0237\u0238\t\b\2\2\u0238\u0239\t\7\2\2\u0239\u00a8\3\2\2\2\u023a"+
		"\u023c\t\t\2\2\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\bU\2\2\u0240"+
		"\u00aa\3\2\2\2\u0241\u0242\7\61\2\2\u0242\u0243\7\61\2\2\u0243\u0247\3"+
		"\2\2\2\u0244\u0246\n\n\2\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u024a\u024b\bV\2\2\u024b\u00ac\3\2\2\2\u024c\u024d\7\61\2\2\u024d"+
		"\u024e\7,\2\2\u024e\u0252\3\2\2\2\u024f\u0251\13\2\2\2\u0250\u024f\3\2"+
		"\2\2\u0251\u0254\3\2\2\2\u0252\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253"+
		"\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7,\2\2\u0256\u0257\7\61"+
		"\2\2\u0257\u0258\3\2\2\2\u0258\u0259\bW\2\2\u0259\u00ae\3\2\2\2\u025a"+
		"\u025b\7^\2\2\u025b\u025c\t\13\2\2\u025c\u00b0\3\2\2\2\13\2\u01d7\u01dc"+
		"\u01e2\u01e8\u0203\u023d\u0247\u0252\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}