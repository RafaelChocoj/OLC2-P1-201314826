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
		MUT=17, TO_STRING=18, TO_OWNED=19, NUMBER=20, FLOAT=21, STRING=22, PUNTO=23, 
		COMA=24, PTCOMA=25, DOSPUNTO=26, DPUNTO2=27, ASIGNACION=28, MTHEN=29, 
		GUIONB=30, ID=31, DISTINTO=32, IGUAL=33, MAYORIGUAL=34, MENORIGUAL=35, 
		MAYOR=36, MENOR=37, MUL=38, DIV=39, ADD=40, SUB=41, MOD=42, AND=43, OR=44, 
		NOT=45, AMP=46, PARIZQ=47, PARDER=48, LLAVEIZQ=49, LLAVEDER=50, CORIZQ=51, 
		CORDER=52, WHITESPACE=53, L_COMMENT=54;
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
			"MUT", "TO_STRING", "TO_OWNED", "NUMBER", "FLOAT", "STRING", "PUNTO", 
			"COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN", "GUIONB", 
			"ID", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", 
			"MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", "AMP", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE", "L_COMMENT", 
			"ESC_SEQ"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0152\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\6\25\u00dd\n\25\r\25\16\25\u00de\3\26\6\26\u00e2"+
		"\n\26\r\26\16\26\u00e3\3\26\3\26\6\26\u00e8\n\26\r\26\16\26\u00e9\3\27"+
		"\3\27\7\27\u00ee\n\27\f\27\16\27\u00f1\13\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3 \3 \7 \u0109\n \f \16 \u010c\13 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\6\66\u013f\n\66\r\66\16\66\u0140\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\7\67\u0149\n\67\f\67\16\67\u014c\13\67\3\67\3\67\38\38\38\2\29\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o\2\3"+
		"\2\n\3\2\62;\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17"+
		"\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u0157\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3q\3\2\2\2\5z\3\2\2"+
		"\2\7~\3\2\2\2\t\u0082\3\2\2\2\13\u0089\3\2\2\2\r\u008e\3\2\2\2\17\u0093"+
		"\3\2\2\2\21\u0096\3\2\2\2\23\u009b\3\2\2\2\25\u00a1\3\2\2\2\27\u00a3\3"+
		"\2\2\2\31\u00a8\3\2\2\2\33\u00ae\3\2\2\2\35\u00b1\3\2\2\2\37\u00b5\3\2"+
		"\2\2!\u00ba\3\2\2\2#\u00be\3\2\2\2%\u00c2\3\2\2\2\'\u00cf\3\2\2\2)\u00dc"+
		"\3\2\2\2+\u00e1\3\2\2\2-\u00eb\3\2\2\2/\u00f4\3\2\2\2\61\u00f6\3\2\2\2"+
		"\63\u00f8\3\2\2\2\65\u00fa\3\2\2\2\67\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0101"+
		"\3\2\2\2=\u0104\3\2\2\2?\u0106\3\2\2\2A\u010d\3\2\2\2C\u0110\3\2\2\2E"+
		"\u0113\3\2\2\2G\u0116\3\2\2\2I\u0119\3\2\2\2K\u011b\3\2\2\2M\u011d\3\2"+
		"\2\2O\u011f\3\2\2\2Q\u0121\3\2\2\2S\u0123\3\2\2\2U\u0125\3\2\2\2W\u0127"+
		"\3\2\2\2Y\u012a\3\2\2\2[\u012d\3\2\2\2]\u012f\3\2\2\2_\u0131\3\2\2\2a"+
		"\u0133\3\2\2\2c\u0135\3\2\2\2e\u0137\3\2\2\2g\u0139\3\2\2\2i\u013b\3\2"+
		"\2\2k\u013e\3\2\2\2m\u0144\3\2\2\2o\u014f\3\2\2\2qr\7r\2\2rs\7t\2\2st"+
		"\7k\2\2tu\7p\2\2uv\7v\2\2vw\7n\2\2wx\7p\2\2xy\7#\2\2y\4\3\2\2\2z{\7k\2"+
		"\2{|\78\2\2|}\7\66\2\2}\6\3\2\2\2~\177\7h\2\2\177\u0080\78\2\2\u0080\u0081"+
		"\7\66\2\2\u0081\b\3\2\2\2\u0082\u0083\7U\2\2\u0083\u0084\7v\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086\u0087\7p\2\2\u0087\u0088\7i\2\2"+
		"\u0088\n\3\2\2\2\u0089\u008a\7d\2\2\u008a\u008b\7q\2\2\u008b\u008c\7q"+
		"\2\2\u008c\u008d\7n\2\2\u008d\f\3\2\2\2\u008e\u008f\7(\2\2\u008f\u0090"+
		"\7u\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092\16\3\2\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7h\2\2\u0095\20\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\22\3\2\2\2\u009b\u009c"+
		"\7o\2\2\u009c\u009d\7c\2\2\u009d\u009e\7v\2\2\u009e\u009f\7e\2\2\u009f"+
		"\u00a0\7j\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7~\2\2\u00a2\26\3\2\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7g\2\2"+
		"\u00a7\30\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7"+
		"n\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7g\2\2\u00ad\32\3\2\2\2\u00ae\u00af"+
		"\7c\2\2\u00af\u00b0\7u\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3"+
		"\7q\2\2\u00b3\u00b4\7y\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7h\2\2\u00b9 \3\2\2\2\u00ba\u00bb"+
		"\7n\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7v\2\2\u00bd\"\3\2\2\2\u00be\u00bf"+
		"\7o\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7v\2\2\u00c1$\3\2\2\2\u00c2\u00c3"+
		"\7\60\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7a\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7p\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7*\2\2\u00cd\u00ce"+
		"\7+\2\2\u00ce&\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2"+
		"\7q\2\2\u00d2\u00d3\7a\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7y\2\2\u00d5"+
		"\u00d6\7p\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9\7*\2\2"+
		"\u00d9\u00da\7+\2\2\u00da(\3\2\2\2\u00db\u00dd\t\2\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"*\3\2\2\2\u00e0\u00e2\t\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2"+
		"\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7"+
		"\t\3\2\2\u00e6\u00e8\t\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea,\3\2\2\2\u00eb\u00ef\7$\2\2\u00ec"+
		"\u00ee\n\4\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\7$\2\2\u00f3.\3\2\2\2\u00f4\u00f5\7\60\2\2\u00f5\60\3\2\2\2\u00f6"+
		"\u00f7\7.\2\2\u00f7\62\3\2\2\2\u00f8\u00f9\7=\2\2\u00f9\64\3\2\2\2\u00fa"+
		"\u00fb\7<\2\2\u00fb\u00fc\7<\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7<\2\2\u00fe"+
		"8\3\2\2\2\u00ff\u0100\7?\2\2\u0100:\3\2\2\2\u0101\u0102\7?\2\2\u0102\u0103"+
		"\7@\2\2\u0103<\3\2\2\2\u0104\u0105\7a\2\2\u0105>\3\2\2\2\u0106\u010a\t"+
		"\5\2\2\u0107\u0109\t\6\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b@\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010d\u010e\7#\2\2\u010e\u010f\7?\2\2\u010fB\3\2\2\2\u0110\u0111\7?\2"+
		"\2\u0111\u0112\7?\2\2\u0112D\3\2\2\2\u0113\u0114\7@\2\2\u0114\u0115\7"+
		"?\2\2\u0115F\3\2\2\2\u0116\u0117\7>\2\2\u0117\u0118\7?\2\2\u0118H\3\2"+
		"\2\2\u0119\u011a\7@\2\2\u011aJ\3\2\2\2\u011b\u011c\7>\2\2\u011cL\3\2\2"+
		"\2\u011d\u011e\7,\2\2\u011eN\3\2\2\2\u011f\u0120\7\61\2\2\u0120P\3\2\2"+
		"\2\u0121\u0122\7-\2\2\u0122R\3\2\2\2\u0123\u0124\7/\2\2\u0124T\3\2\2\2"+
		"\u0125\u0126\7\'\2\2\u0126V\3\2\2\2\u0127\u0128\7(\2\2\u0128\u0129\7("+
		"\2\2\u0129X\3\2\2\2\u012a\u012b\7~\2\2\u012b\u012c\7~\2\2\u012cZ\3\2\2"+
		"\2\u012d\u012e\7#\2\2\u012e\\\3\2\2\2\u012f\u0130\7(\2\2\u0130^\3\2\2"+
		"\2\u0131\u0132\7*\2\2\u0132`\3\2\2\2\u0133\u0134\7+\2\2\u0134b\3\2\2\2"+
		"\u0135\u0136\7}\2\2\u0136d\3\2\2\2\u0137\u0138\7\177\2\2\u0138f\3\2\2"+
		"\2\u0139\u013a\7]\2\2\u013ah\3\2\2\2\u013b\u013c\7_\2\2\u013cj\3\2\2\2"+
		"\u013d\u013f\t\7\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b\66\2\2"+
		"\u0143l\3\2\2\2\u0144\u0145\7\61\2\2\u0145\u0146\7\61\2\2\u0146\u014a"+
		"\3\2\2\2\u0147\u0149\n\b\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014d\u014e\b\67\2\2\u014en\3\2\2\2\u014f\u0150\7^\2\2\u0150\u0151"+
		"\t\t\2\2\u0151p\3\2\2\2\n\2\u00de\u00e3\u00e9\u00ef\u010a\u0140\u014a"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}