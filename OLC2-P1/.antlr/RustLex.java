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
		ELSE=8, LOOP=9, BREAK=10, CONTINUE=11, MATCH=12, MTOR=13, TRUE=14, FALSE=15, 
		AS=16, POW=17, POWF=18, LET=19, MUT=20, STRUCT=21, TO_STRING=22, TO_OWNED=23, 
		PUBLIC=24, TYPETHEN=25, FN=26, MAIN=27, RETURN=28, REF=29, NUMBER=30, 
		FLOAT=31, STRING=32, PUNTO=33, COMA=34, PTCOMA=35, DOSPUNTO=36, DPUNTO2=37, 
		ASIGNACION=38, MTHEN=39, GUIONB=40, ID=41, DISTINTO=42, IGUAL=43, MAYORIGUAL=44, 
		MENORIGUAL=45, MAYOR=46, MENOR=47, MUL=48, DIV=49, ADD=50, SUB=51, MOD=52, 
		AND=53, OR=54, NOT=55, AMP=56, PARIZQ=57, PARDER=58, LLAVEIZQ=59, LLAVEDER=60, 
		CORIZQ=61, CORDER=62, WHITESPACE=63, L_COMMENT=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "IF", 
			"ELSE", "LOOP", "BREAK", "CONTINUE", "MATCH", "MTOR", "TRUE", "FALSE", 
			"AS", "POW", "POWF", "LET", "MUT", "STRUCT", "TO_STRING", "TO_OWNED", 
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
			"'if'", "'else'", "'loop'", "'break'", "'continue'", "'match'", "'|'", 
			"'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", "'mut'", "'struct'", 
			"'.to_string()'", "'.to_owned()'", "'pub'", "'->'", "'fn'", "'main'", 
			"'return'", "'&mut'", null, null, null, "'.'", "','", "';'", "'::'", 
			"':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "LOOP", "BREAK", "CONTINUE", "MATCH", "MTOR", "TRUE", "FALSE", 
			"AS", "POW", "POWF", "LET", "MUT", "STRUCT", "TO_STRING", "TO_OWNED", 
			"PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", "REF", "NUMBER", "FLOAT", 
			"STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", 
			"MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", 
			"AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"WHITESPACE", "L_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u019c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\6\37\u0127\n\37\r\37\16\37\u0128\3 \6 \u012c\n \r \16 \u012d\3 \3"+
		" \6 \u0132\n \r \16 \u0133\3!\3!\7!\u0138\n!\f!\16!\u013b\13!\3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\7*\u0153"+
		"\n*\f*\16*\u0156\13*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\6@\u0189"+
		"\n@\r@\16@\u018a\3@\3@\3A\3A\3A\3A\7A\u0193\nA\fA\16A\u0196\13A\3A\3A"+
		"\3B\3B\3B\2\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\3\2\n\3\2\62;\3\2\60"+
		"\60\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17"+
		"\t\2\"#%%--/\60<<BB]_\2\u01a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\3\u0085\3\2\2\2\5\u008e\3\2\2\2\7\u0092\3\2\2\2\t\u0096\3\2\2"+
		"\2\13\u009d\3\2\2\2\r\u00a2\3\2\2\2\17\u00a7\3\2\2\2\21\u00aa\3\2\2\2"+
		"\23\u00af\3\2\2\2\25\u00b4\3\2\2\2\27\u00ba\3\2\2\2\31\u00c3\3\2\2\2\33"+
		"\u00c9\3\2\2\2\35\u00cb\3\2\2\2\37\u00d0\3\2\2\2!\u00d6\3\2\2\2#\u00d9"+
		"\3\2\2\2%\u00dd\3\2\2\2\'\u00e2\3\2\2\2)\u00e6\3\2\2\2+\u00ea\3\2\2\2"+
		"-\u00f1\3\2\2\2/\u00fe\3\2\2\2\61\u010a\3\2\2\2\63\u010e\3\2\2\2\65\u0111"+
		"\3\2\2\2\67\u0114\3\2\2\29\u0119\3\2\2\2;\u0120\3\2\2\2=\u0126\3\2\2\2"+
		"?\u012b\3\2\2\2A\u0135\3\2\2\2C\u013e\3\2\2\2E\u0140\3\2\2\2G\u0142\3"+
		"\2\2\2I\u0144\3\2\2\2K\u0147\3\2\2\2M\u0149\3\2\2\2O\u014b\3\2\2\2Q\u014e"+
		"\3\2\2\2S\u0150\3\2\2\2U\u0157\3\2\2\2W\u015a\3\2\2\2Y\u015d\3\2\2\2["+
		"\u0160\3\2\2\2]\u0163\3\2\2\2_\u0165\3\2\2\2a\u0167\3\2\2\2c\u0169\3\2"+
		"\2\2e\u016b\3\2\2\2g\u016d\3\2\2\2i\u016f\3\2\2\2k\u0171\3\2\2\2m\u0174"+
		"\3\2\2\2o\u0177\3\2\2\2q\u0179\3\2\2\2s\u017b\3\2\2\2u\u017d\3\2\2\2w"+
		"\u017f\3\2\2\2y\u0181\3\2\2\2{\u0183\3\2\2\2}\u0185\3\2\2\2\177\u0188"+
		"\3\2\2\2\u0081\u018e\3\2\2\2\u0083\u0199\3\2\2\2\u0085\u0086\7r\2\2\u0086"+
		"\u0087\7t\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2"+
		"\u008a\u008b\7n\2\2\u008b\u008c\7p\2\2\u008c\u008d\7#\2\2\u008d\4\3\2"+
		"\2\2\u008e\u008f\7k\2\2\u008f\u0090\78\2\2\u0090\u0091\7\66\2\2\u0091"+
		"\6\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\78\2\2\u0094\u0095\7\66\2\2"+
		"\u0095\b\3\2\2\2\u0096\u0097\7U\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t"+
		"\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7i\2\2\u009c\n"+
		"\3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a1\7n\2\2\u00a1\f\3\2\2\2\u00a2\u00a3\7(\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\16\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7h\2\2\u00a9\20\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7n\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\u00b1\7q\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7r\2\2\u00b3\24\3\2\2\2\u00b4"+
		"\u00b5\7d\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7c\2\2"+
		"\u00b8\u00b9\7m\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7"+
		"q\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7p\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7g\2\2\u00c2\30\3\2\2\2\u00c3\u00c4"+
		"\7o\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7e\2\2\u00c7"+
		"\u00c8\7j\2\2\u00c8\32\3\2\2\2\u00c9\u00ca\7~\2\2\u00ca\34\3\2\2\2\u00cb"+
		"\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7g\2\2"+
		"\u00cf\36\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7"+
		"n\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5 \3\2\2\2\u00d6\u00d7"+
		"\7c\2\2\u00d7\u00d8\7u\2\2\u00d8\"\3\2\2\2\u00d9\u00da\7r\2\2\u00da\u00db"+
		"\7q\2\2\u00db\u00dc\7y\2\2\u00dc$\3\2\2\2\u00dd\u00de\7r\2\2\u00de\u00df"+
		"\7q\2\2\u00df\u00e0\7y\2\2\u00e0\u00e1\7h\2\2\u00e1&\3\2\2\2\u00e2\u00e3"+
		"\7n\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7v\2\2\u00e5(\3\2\2\2\u00e6\u00e7"+
		"\7o\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7v\2\2\u00e9*\3\2\2\2\u00ea\u00eb"+
		"\7u\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00ef\7e\2\2\u00ef\u00f0\7v\2\2\u00f0,\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2"+
		"\u00f3\7v\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7a\2\2\u00f5\u00f6\7u\2\2"+
		"\u00f6\u00f7\7v\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc\7*\2\2\u00fc\u00fd\7+\2\2\u00fd"+
		".\3\2\2\2\u00fe\u00ff\7\60\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7q\2\2\u0101"+
		"\u0102\7a\2\2\u0102\u0103\7q\2\2\u0103\u0104\7y\2\2\u0104\u0105\7p\2\2"+
		"\u0105\u0106\7g\2\2\u0106\u0107\7f\2\2\u0107\u0108\7*\2\2\u0108\u0109"+
		"\7+\2\2\u0109\60\3\2\2\2\u010a\u010b\7r\2\2\u010b\u010c\7w\2\2\u010c\u010d"+
		"\7d\2\2\u010d\62\3\2\2\2\u010e\u010f\7/\2\2\u010f\u0110\7@\2\2\u0110\64"+
		"\3\2\2\2\u0111\u0112\7h\2\2\u0112\u0113\7p\2\2\u0113\66\3\2\2\2\u0114"+
		"\u0115\7o\2\2\u0115\u0116\7c\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2"+
		"\u01188\3\2\2\2\u0119\u011a\7t\2\2\u011a\u011b\7g\2\2\u011b\u011c\7v\2"+
		"\2\u011c\u011d\7w\2\2\u011d\u011e\7t\2\2\u011e\u011f\7p\2\2\u011f:\3\2"+
		"\2\2\u0120\u0121\7(\2\2\u0121\u0122\7o\2\2\u0122\u0123\7w\2\2\u0123\u0124"+
		"\7v\2\2\u0124<\3\2\2\2\u0125\u0127\t\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129>\3\2\2\2\u012a"+
		"\u012c\t\2\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\t\3\2\2\u0130"+
		"\u0132\t\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134@\3\2\2\2\u0135\u0139\7$\2\2\u0136\u0138"+
		"\n\4\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7$"+
		"\2\2\u013dB\3\2\2\2\u013e\u013f\7\60\2\2\u013fD\3\2\2\2\u0140\u0141\7"+
		".\2\2\u0141F\3\2\2\2\u0142\u0143\7=\2\2\u0143H\3\2\2\2\u0144\u0145\7<"+
		"\2\2\u0145\u0146\7<\2\2\u0146J\3\2\2\2\u0147\u0148\7<\2\2\u0148L\3\2\2"+
		"\2\u0149\u014a\7?\2\2\u014aN\3\2\2\2\u014b\u014c\7?\2\2\u014c\u014d\7"+
		"@\2\2\u014dP\3\2\2\2\u014e\u014f\7a\2\2\u014fR\3\2\2\2\u0150\u0154\t\5"+
		"\2\2\u0151\u0153\t\6\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155T\3\2\2\2\u0156\u0154\3\2\2\2"+
		"\u0157\u0158\7#\2\2\u0158\u0159\7?\2\2\u0159V\3\2\2\2\u015a\u015b\7?\2"+
		"\2\u015b\u015c\7?\2\2\u015cX\3\2\2\2\u015d\u015e\7@\2\2\u015e\u015f\7"+
		"?\2\2\u015fZ\3\2\2\2\u0160\u0161\7>\2\2\u0161\u0162\7?\2\2\u0162\\\3\2"+
		"\2\2\u0163\u0164\7@\2\2\u0164^\3\2\2\2\u0165\u0166\7>\2\2\u0166`\3\2\2"+
		"\2\u0167\u0168\7,\2\2\u0168b\3\2\2\2\u0169\u016a\7\61\2\2\u016ad\3\2\2"+
		"\2\u016b\u016c\7-\2\2\u016cf\3\2\2\2\u016d\u016e\7/\2\2\u016eh\3\2\2\2"+
		"\u016f\u0170\7\'\2\2\u0170j\3\2\2\2\u0171\u0172\7(\2\2\u0172\u0173\7("+
		"\2\2\u0173l\3\2\2\2\u0174\u0175\7~\2\2\u0175\u0176\7~\2\2\u0176n\3\2\2"+
		"\2\u0177\u0178\7#\2\2\u0178p\3\2\2\2\u0179\u017a\7(\2\2\u017ar\3\2\2\2"+
		"\u017b\u017c\7*\2\2\u017ct\3\2\2\2\u017d\u017e\7+\2\2\u017ev\3\2\2\2\u017f"+
		"\u0180\7}\2\2\u0180x\3\2\2\2\u0181\u0182\7\177\2\2\u0182z\3\2\2\2\u0183"+
		"\u0184\7]\2\2\u0184|\3\2\2\2\u0185\u0186\7_\2\2\u0186~\3\2\2\2\u0187\u0189"+
		"\t\7\2\2\u0188\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\b@\2\2\u018d\u0080\3\2"+
		"\2\2\u018e\u018f\7\61\2\2\u018f\u0190\7\61\2\2\u0190\u0194\3\2\2\2\u0191"+
		"\u0193\n\b\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0198\bA\2\2\u0198\u0082\3\2\2\2\u0199\u019a\7^\2\2\u019a\u019b\t\t\2"+
		"\2\u019b\u0084\3\2\2\2\n\2\u0128\u012d\u0133\u0139\u0154\u018a\u0194\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}