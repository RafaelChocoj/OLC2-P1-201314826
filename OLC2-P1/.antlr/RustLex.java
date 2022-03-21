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
		PRINT_CON=1, T_NUMBER=2, T_FLOAT=3, T_STRING=4, T_BOOL=5, T_STR=6, IF=7, 
		ELSE=8, WHILE=9, LOOP=10, BREAK=11, CONTINUE=12, MATCH=13, MTOR=14, TRUE=15, 
		FALSE=16, AS=17, POW=18, POWF=19, LET=20, MUT=21, STRUCT=22, TO_STRING=23, 
		TO_OWNED=24, PUBLIC=25, TYPETHEN=26, FN=27, MAIN=28, RETURN=29, REF=30, 
		NUMBER=31, FLOAT=32, STRING=33, PUNTO=34, COMA=35, PTCOMA=36, DOSPUNTO=37, 
		DPUNTO2=38, ASIGNACION=39, MTHEN=40, GUIONB=41, ID=42, DISTINTO=43, IGUAL=44, 
		MAYORIGUAL=45, MENORIGUAL=46, MAYOR=47, MENOR=48, MUL=49, DIV=50, ADD=51, 
		SUB=52, MOD=53, AND=54, OR=55, NOT=56, AMP=57, PARIZQ=58, PARDER=59, LLAVEIZQ=60, 
		LLAVEDER=61, CORIZQ=62, CORDER=63, WHITESPACE=64, L_COMMENT=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "IF", 
			"ELSE", "WHILE", "LOOP", "BREAK", "CONTINUE", "MATCH", "MTOR", "TRUE", 
			"FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", "TO_STRING", "TO_OWNED", 
			"PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", "REF", "NUMBER", "FLOAT", 
			"STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", 
			"MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", 
			"AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"WHITESPACE", "L_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'while'", "'loop'", "'break'", "'continue'", "'match'", 
			"'|'", "'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", "'mut'", 
			"'struct'", "'.to_string()'", "'.to_owned()'", "'pub'", "'->'", "'fn'", 
			"'main'", "'return'", "'&mut'", null, null, null, "'.'", "','", "';'", 
			"'::'", "':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", "'<='", 
			"'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", 
			"'&'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "WHILE", "LOOP", "BREAK", "CONTINUE", "MATCH", "MTOR", 
			"TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", "TO_STRING", 
			"TO_OWNED", "PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", "REF", "NUMBER", 
			"FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \6 \u012f\n \r \16 \u0130\3!\6!"+
		"\u0134\n!\r!\16!\u0135\3!\3!\6!\u013a\n!\r!\16!\u013b\3\"\3\"\7\"\u0140"+
		"\n\"\f\"\16\"\u0143\13\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3)\3*\3*\3+\3+\7+\u015b\n+\f+\16+\u015e\13+\3,\3,\3,\3-\3-"+
		"\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3?\3?\3@\3@\3A\6A\u0191\nA\rA\16A\u0192\3A\3A\3B\3B\3B\3B\7"+
		"B\u019b\nB\fB\16B\u019e\13B\3B\3B\3C\3C\3C\2\2D\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085\2\3\2\n\3\2\62;\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u01a9\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0087"+
		"\3\2\2\2\5\u0090\3\2\2\2\7\u0094\3\2\2\2\t\u0098\3\2\2\2\13\u009f\3\2"+
		"\2\2\r\u00a4\3\2\2\2\17\u00a9\3\2\2\2\21\u00ac\3\2\2\2\23\u00b1\3\2\2"+
		"\2\25\u00b7\3\2\2\2\27\u00bc\3\2\2\2\31\u00c2\3\2\2\2\33\u00cb\3\2\2\2"+
		"\35\u00d1\3\2\2\2\37\u00d3\3\2\2\2!\u00d8\3\2\2\2#\u00de\3\2\2\2%\u00e1"+
		"\3\2\2\2\'\u00e5\3\2\2\2)\u00ea\3\2\2\2+\u00ee\3\2\2\2-\u00f2\3\2\2\2"+
		"/\u00f9\3\2\2\2\61\u0106\3\2\2\2\63\u0112\3\2\2\2\65\u0116\3\2\2\2\67"+
		"\u0119\3\2\2\29\u011c\3\2\2\2;\u0121\3\2\2\2=\u0128\3\2\2\2?\u012e\3\2"+
		"\2\2A\u0133\3\2\2\2C\u013d\3\2\2\2E\u0146\3\2\2\2G\u0148\3\2\2\2I\u014a"+
		"\3\2\2\2K\u014c\3\2\2\2M\u014f\3\2\2\2O\u0151\3\2\2\2Q\u0153\3\2\2\2S"+
		"\u0156\3\2\2\2U\u0158\3\2\2\2W\u015f\3\2\2\2Y\u0162\3\2\2\2[\u0165\3\2"+
		"\2\2]\u0168\3\2\2\2_\u016b\3\2\2\2a\u016d\3\2\2\2c\u016f\3\2\2\2e\u0171"+
		"\3\2\2\2g\u0173\3\2\2\2i\u0175\3\2\2\2k\u0177\3\2\2\2m\u0179\3\2\2\2o"+
		"\u017c\3\2\2\2q\u017f\3\2\2\2s\u0181\3\2\2\2u\u0183\3\2\2\2w\u0185\3\2"+
		"\2\2y\u0187\3\2\2\2{\u0189\3\2\2\2}\u018b\3\2\2\2\177\u018d\3\2\2\2\u0081"+
		"\u0190\3\2\2\2\u0083\u0196\3\2\2\2\u0085\u01a1\3\2\2\2\u0087\u0088\7r"+
		"\2\2\u0088\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c"+
		"\7v\2\2\u008c\u008d\7n\2\2\u008d\u008e\7p\2\2\u008e\u008f\7#\2\2\u008f"+
		"\4\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\78\2\2\u0092\u0093\7\66\2\2"+
		"\u0093\6\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\78\2\2\u0096\u0097\7\66"+
		"\2\2\u0097\b\3\2\2\2\u0098\u0099\7U\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7i\2\2\u009e"+
		"\n\3\2\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7q\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\f\3\2\2\2\u00a4\u00a5\7(\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\16\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ab\7h\2\2\u00ab\20\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae"+
		"\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2"+
		"\u00b3\7j\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6\24\3\2\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7"+
		"q\2\2\u00ba\u00bb\7r\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7m\2\2\u00c1"+
		"\30\3\2\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7p\2\2\u00c5"+
		"\u00c6\7v\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7w\2\2"+
		"\u00c9\u00ca\7g\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7"+
		"c\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7j\2\2\u00d0\34"+
		"\3\2\2\2\u00d1\u00d2\7~\2\2\u00d2\36\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4"+
		"\u00d5\7t\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7g\2\2\u00d7 \3\2\2\2\u00d8"+
		"\u00d9\7h\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7u\2\2"+
		"\u00dc\u00dd\7g\2\2\u00dd\"\3\2\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7u"+
		"\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7y\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8"+
		"\7y\2\2\u00e8\u00e9\7h\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7v\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0"+
		"\7w\2\2\u00f0\u00f1\7v\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4"+
		"\7v\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7e\2\2\u00f7"+
		"\u00f8\7v\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7\60\2\2\u00fa\u00fb\7v\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fc\u00fd\7a\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7v\2\2"+
		"\u00ff\u0100\7t\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103"+
		"\7i\2\2\u0103\u0104\7*\2\2\u0104\u0105\7+\2\2\u0105\60\3\2\2\2\u0106\u0107"+
		"\7\60\2\2\u0107\u0108\7v\2\2\u0108\u0109\7q\2\2\u0109\u010a\7a\2\2\u010a"+
		"\u010b\7q\2\2\u010b\u010c\7y\2\2\u010c\u010d\7p\2\2\u010d\u010e\7g\2\2"+
		"\u010e\u010f\7f\2\2\u010f\u0110\7*\2\2\u0110\u0111\7+\2\2\u0111\62\3\2"+
		"\2\2\u0112\u0113\7r\2\2\u0113\u0114\7w\2\2\u0114\u0115\7d\2\2\u0115\64"+
		"\3\2\2\2\u0116\u0117\7/\2\2\u0117\u0118\7@\2\2\u0118\66\3\2\2\2\u0119"+
		"\u011a\7h\2\2\u011a\u011b\7p\2\2\u011b8\3\2\2\2\u011c\u011d\7o\2\2\u011d"+
		"\u011e\7c\2\2\u011e\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120:\3\2\2\2\u0121"+
		"\u0122\7t\2\2\u0122\u0123\7g\2\2\u0123\u0124\7v\2\2\u0124\u0125\7w\2\2"+
		"\u0125\u0126\7t\2\2\u0126\u0127\7p\2\2\u0127<\3\2\2\2\u0128\u0129\7(\2"+
		"\2\u0129\u012a\7o\2\2\u012a\u012b\7w\2\2\u012b\u012c\7v\2\2\u012c>\3\2"+
		"\2\2\u012d\u012f\t\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131@\3\2\2\2\u0132\u0134\t\2\2\2"+
		"\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\t\3\2\2\u0138\u013a\t\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013cB\3\2\2\2\u013d\u0141\7$\2\2\u013e\u0140\n\4\2\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7$\2\2\u0145D\3\2\2\2\u0146"+
		"\u0147\7\60\2\2\u0147F\3\2\2\2\u0148\u0149\7.\2\2\u0149H\3\2\2\2\u014a"+
		"\u014b\7=\2\2\u014bJ\3\2\2\2\u014c\u014d\7<\2\2\u014d\u014e\7<\2\2\u014e"+
		"L\3\2\2\2\u014f\u0150\7<\2\2\u0150N\3\2\2\2\u0151\u0152\7?\2\2\u0152P"+
		"\3\2\2\2\u0153\u0154\7?\2\2\u0154\u0155\7@\2\2\u0155R\3\2\2\2\u0156\u0157"+
		"\7a\2\2\u0157T\3\2\2\2\u0158\u015c\t\5\2\2\u0159\u015b\t\6\2\2\u015a\u0159"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"V\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7#\2\2\u0160\u0161\7?\2\2\u0161"+
		"X\3\2\2\2\u0162\u0163\7?\2\2\u0163\u0164\7?\2\2\u0164Z\3\2\2\2\u0165\u0166"+
		"\7@\2\2\u0166\u0167\7?\2\2\u0167\\\3\2\2\2\u0168\u0169\7>\2\2\u0169\u016a"+
		"\7?\2\2\u016a^\3\2\2\2\u016b\u016c\7@\2\2\u016c`\3\2\2\2\u016d\u016e\7"+
		">\2\2\u016eb\3\2\2\2\u016f\u0170\7,\2\2\u0170d\3\2\2\2\u0171\u0172\7\61"+
		"\2\2\u0172f\3\2\2\2\u0173\u0174\7-\2\2\u0174h\3\2\2\2\u0175\u0176\7/\2"+
		"\2\u0176j\3\2\2\2\u0177\u0178\7\'\2\2\u0178l\3\2\2\2\u0179\u017a\7(\2"+
		"\2\u017a\u017b\7(\2\2\u017bn\3\2\2\2\u017c\u017d\7~\2\2\u017d\u017e\7"+
		"~\2\2\u017ep\3\2\2\2\u017f\u0180\7#\2\2\u0180r\3\2\2\2\u0181\u0182\7("+
		"\2\2\u0182t\3\2\2\2\u0183\u0184\7*\2\2\u0184v\3\2\2\2\u0185\u0186\7+\2"+
		"\2\u0186x\3\2\2\2\u0187\u0188\7}\2\2\u0188z\3\2\2\2\u0189\u018a\7\177"+
		"\2\2\u018a|\3\2\2\2\u018b\u018c\7]\2\2\u018c~\3\2\2\2\u018d\u018e\7_\2"+
		"\2\u018e\u0080\3\2\2\2\u018f\u0191\t\7\2\2\u0190\u018f\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0195\bA\2\2\u0195\u0082\3\2\2\2\u0196\u0197\7\61\2\2\u0197\u0198\7\61"+
		"\2\2\u0198\u019c\3\2\2\2\u0199\u019b\n\b\2\2\u019a\u0199\3\2\2\2\u019b"+
		"\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\bB\2\2\u01a0\u0084\3\2\2\2\u01a1"+
		"\u01a2\7^\2\2\u01a2\u01a3\t\t\2\2\u01a3\u0086\3\2\2\2\n\2\u0130\u0135"+
		"\u013b\u0141\u015c\u0192\u019c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}