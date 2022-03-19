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
		ELSE=8, MATCH=9, MTOR=10, TRUE=11, FALSE=12, AS=13, POW=14, POWF=15, LET=16, 
		MUT=17, TO_STRING=18, TO_OWNED=19, PUBLIC=20, TYPETHEN=21, FN=22, MAIN=23, 
		RETURN=24, NUMBER=25, FLOAT=26, STRING=27, PUNTO=28, COMA=29, PTCOMA=30, 
		DOSPUNTO=31, DPUNTO2=32, ASIGNACION=33, MTHEN=34, GUIONB=35, ID=36, DISTINTO=37, 
		IGUAL=38, MAYORIGUAL=39, MENORIGUAL=40, MAYOR=41, MENOR=42, MUL=43, DIV=44, 
		ADD=45, SUB=46, MOD=47, AND=48, OR=49, NOT=50, AMP=51, PARIZQ=52, PARDER=53, 
		LLAVEIZQ=54, LLAVEDER=55, CORIZQ=56, CORDER=57, WHITESPACE=58, L_COMMENT=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "IF", 
			"ELSE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", "LET", 
			"MUT", "TO_STRING", "TO_OWNED", "PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", 
			"NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", 
			"ASIGNACION", "MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", 
			"OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", 
			"CORDER", "WHITESPACE", "L_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", 
			"'powf'", "'let'", "'mut'", "'.to_string()'", "'.to_owned()'", "'pub'", 
			"'->'", "'fn'", "'main'", "'return'", null, null, null, "'.'", "','", 
			"';'", "'::'", "':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", 
			"'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", 
			"'!'", "'&'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", 
			"LET", "MUT", "TO_STRING", "TO_OWNED", "PUBLIC", "TYPETHEN", "FN", "MAIN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0172\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\6\32\u00fd\n\32\r\32\16\32\u00fe\3\33\6\33\u0102"+
		"\n\33\r\33\16\33\u0103\3\33\3\33\6\33\u0108\n\33\r\33\16\33\u0109\3\34"+
		"\3\34\7\34\u010e\n\34\f\34\16\34\u0111\13\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\7%\u0129\n"+
		"%\f%\16%\u012c\13%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\6;"+
		"\u015f\n;\r;\16;\u0160\3;\3;\3<\3<\3<\3<\7<\u0169\n<\f<\16<\u016c\13<"+
		"\3<\3<\3=\3=\3=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y\2\3\2\n\3\2\62;\3\2\60\60\3\2$$\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<"+
		"<BB]_\2\u0177\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3"+
		"{\3\2\2\2\5\u0084\3\2\2\2\7\u0088\3\2\2\2\t\u008c\3\2\2\2\13\u0093\3\2"+
		"\2\2\r\u0098\3\2\2\2\17\u009d\3\2\2\2\21\u00a0\3\2\2\2\23\u00a5\3\2\2"+
		"\2\25\u00ab\3\2\2\2\27\u00ad\3\2\2\2\31\u00b2\3\2\2\2\33\u00b8\3\2\2\2"+
		"\35\u00bb\3\2\2\2\37\u00bf\3\2\2\2!\u00c4\3\2\2\2#\u00c8\3\2\2\2%\u00cc"+
		"\3\2\2\2\'\u00d9\3\2\2\2)\u00e5\3\2\2\2+\u00e9\3\2\2\2-\u00ec\3\2\2\2"+
		"/\u00ef\3\2\2\2\61\u00f4\3\2\2\2\63\u00fc\3\2\2\2\65\u0101\3\2\2\2\67"+
		"\u010b\3\2\2\29\u0114\3\2\2\2;\u0116\3\2\2\2=\u0118\3\2\2\2?\u011a\3\2"+
		"\2\2A\u011d\3\2\2\2C\u011f\3\2\2\2E\u0121\3\2\2\2G\u0124\3\2\2\2I\u0126"+
		"\3\2\2\2K\u012d\3\2\2\2M\u0130\3\2\2\2O\u0133\3\2\2\2Q\u0136\3\2\2\2S"+
		"\u0139\3\2\2\2U\u013b\3\2\2\2W\u013d\3\2\2\2Y\u013f\3\2\2\2[\u0141\3\2"+
		"\2\2]\u0143\3\2\2\2_\u0145\3\2\2\2a\u0147\3\2\2\2c\u014a\3\2\2\2e\u014d"+
		"\3\2\2\2g\u014f\3\2\2\2i\u0151\3\2\2\2k\u0153\3\2\2\2m\u0155\3\2\2\2o"+
		"\u0157\3\2\2\2q\u0159\3\2\2\2s\u015b\3\2\2\2u\u015e\3\2\2\2w\u0164\3\2"+
		"\2\2y\u016f\3\2\2\2{|\7r\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7"+
		"v\2\2\u0080\u0081\7n\2\2\u0081\u0082\7p\2\2\u0082\u0083\7#\2\2\u0083\4"+
		"\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\78\2\2\u0086\u0087\7\66\2\2\u0087"+
		"\6\3\2\2\2\u0088\u0089\7h\2\2\u0089\u008a\78\2\2\u008a\u008b\7\66\2\2"+
		"\u008b\b\3\2\2\2\u008c\u008d\7U\2\2\u008d\u008e\7v\2\2\u008e\u008f\7t"+
		"\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7i\2\2\u0092\n"+
		"\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096"+
		"\u0097\7n\2\2\u0097\f\3\2\2\2\u0098\u0099\7(\2\2\u0099\u009a\7u\2\2\u009a"+
		"\u009b\7v\2\2\u009b\u009c\7t\2\2\u009c\16\3\2\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7h\2\2\u009f\20\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\7o\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7j\2\2"+
		"\u00aa\24\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7v\2"+
		"\2\u00ae\u00af\7t\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7g\2\2\u00b1\30\3"+
		"\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7c\2\2\u00b9"+
		"\u00ba\7u\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7q\2\2\u00bd"+
		"\u00be\7y\2\2\u00be\36\3\2\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7y\2\2\u00c2\u00c3\7h\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7n\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7v\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7o\2\2\u00c9"+
		"\u00ca\7w\2\2\u00ca\u00cb\7v\2\2\u00cb$\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd"+
		"\u00ce\7v\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7a\2\2\u00d0\u00d1\7u\2\2"+
		"\u00d1\u00d2\7v\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5"+
		"\7p\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\7+\2\2\u00d8"+
		"&\3\2\2\2\u00d9\u00da\7\60\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7a\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7y\2\2\u00df\u00e0\7p\2\2"+
		"\u00e0\u00e1\7g\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7*\2\2\u00e3\u00e4"+
		"\7+\2\2\u00e4(\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8"+
		"\7d\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb\7@\2\2\u00eb,\3"+
		"\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7p\2\2\u00ee.\3\2\2\2\u00ef\u00f0"+
		"\7o\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3"+
		"\60\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		"\u00f8\7w\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7p\2\2\u00fa\62\3\2\2\2\u00fb"+
		"\u00fd\t\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\64\3\2\2\2\u0100\u0102\t\2\2\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0107\t\3\2\2\u0106\u0108\t\2\2\2\u0107\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\66\3\2\2\2\u010b\u010f\7$\2\2\u010c\u010e\n\4\2\2\u010d\u010c\3\2\2\2"+
		"\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7$\2\2\u01138\3\2\2\2\u0114\u0115"+
		"\7\60\2\2\u0115:\3\2\2\2\u0116\u0117\7.\2\2\u0117<\3\2\2\2\u0118\u0119"+
		"\7=\2\2\u0119>\3\2\2\2\u011a\u011b\7<\2\2\u011b\u011c\7<\2\2\u011c@\3"+
		"\2\2\2\u011d\u011e\7<\2\2\u011eB\3\2\2\2\u011f\u0120\7?\2\2\u0120D\3\2"+
		"\2\2\u0121\u0122\7?\2\2\u0122\u0123\7@\2\2\u0123F\3\2\2\2\u0124\u0125"+
		"\7a\2\2\u0125H\3\2\2\2\u0126\u012a\t\5\2\2\u0127\u0129\t\6\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"J\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7#\2\2\u012e\u012f\7?\2\2\u012f"+
		"L\3\2\2\2\u0130\u0131\7?\2\2\u0131\u0132\7?\2\2\u0132N\3\2\2\2\u0133\u0134"+
		"\7@\2\2\u0134\u0135\7?\2\2\u0135P\3\2\2\2\u0136\u0137\7>\2\2\u0137\u0138"+
		"\7?\2\2\u0138R\3\2\2\2\u0139\u013a\7@\2\2\u013aT\3\2\2\2\u013b\u013c\7"+
		">\2\2\u013cV\3\2\2\2\u013d\u013e\7,\2\2\u013eX\3\2\2\2\u013f\u0140\7\61"+
		"\2\2\u0140Z\3\2\2\2\u0141\u0142\7-\2\2\u0142\\\3\2\2\2\u0143\u0144\7/"+
		"\2\2\u0144^\3\2\2\2\u0145\u0146\7\'\2\2\u0146`\3\2\2\2\u0147\u0148\7("+
		"\2\2\u0148\u0149\7(\2\2\u0149b\3\2\2\2\u014a\u014b\7~\2\2\u014b\u014c"+
		"\7~\2\2\u014cd\3\2\2\2\u014d\u014e\7#\2\2\u014ef\3\2\2\2\u014f\u0150\7"+
		"(\2\2\u0150h\3\2\2\2\u0151\u0152\7*\2\2\u0152j\3\2\2\2\u0153\u0154\7+"+
		"\2\2\u0154l\3\2\2\2\u0155\u0156\7}\2\2\u0156n\3\2\2\2\u0157\u0158\7\177"+
		"\2\2\u0158p\3\2\2\2\u0159\u015a\7]\2\2\u015ar\3\2\2\2\u015b\u015c\7_\2"+
		"\2\u015ct\3\2\2\2\u015d\u015f\t\7\2\2\u015e\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\b;\2\2\u0163v\3\2\2\2\u0164\u0165\7\61\2\2\u0165\u0166\7\61\2\2"+
		"\u0166\u016a\3\2\2\2\u0167\u0169\n\b\2\2\u0168\u0167\3\2\2\2\u0169\u016c"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\b<\2\2\u016ex\3\2\2\2\u016f\u0170\7^\2\2\u0170"+
		"\u0171\t\t\2\2\u0171z\3\2\2\2\n\2\u00fe\u0103\u0109\u010f\u012a\u0160"+
		"\u016a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}