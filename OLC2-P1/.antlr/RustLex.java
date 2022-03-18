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
		NUMBER=24, FLOAT=25, STRING=26, PUNTO=27, COMA=28, PTCOMA=29, DOSPUNTO=30, 
		DPUNTO2=31, ASIGNACION=32, MTHEN=33, GUIONB=34, ID=35, DISTINTO=36, IGUAL=37, 
		MAYORIGUAL=38, MENORIGUAL=39, MAYOR=40, MENOR=41, MUL=42, DIV=43, ADD=44, 
		SUB=45, MOD=46, AND=47, OR=48, NOT=49, AMP=50, PARIZQ=51, PARDER=52, LLAVEIZQ=53, 
		LLAVEDER=54, CORIZQ=55, CORDER=56, WHITESPACE=57, L_COMMENT=58;
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
			"MUT", "TO_STRING", "TO_OWNED", "PUBLIC", "TYPETHEN", "FN", "MAIN", "NUMBER", 
			"FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", 
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
			"'->'", "'fn'", "'main'", null, null, null, "'.'", "','", "';'", "'::'", 
			"':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", 
			"LET", "MUT", "TO_STRING", "TO_OWNED", "PUBLIC", "TYPETHEN", "FN", "MAIN", 
			"NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0169\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\6\31\u00f4\n\31"+
		"\r\31\16\31\u00f5\3\32\6\32\u00f9\n\32\r\32\16\32\u00fa\3\32\3\32\6\32"+
		"\u00ff\n\32\r\32\16\32\u0100\3\33\3\33\7\33\u0105\n\33\f\33\16\33\u0108"+
		"\13\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3$\3$\7$\u0120\n$\f$\16$\u0123\13$\3%\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\6:\u0156\n:\r:\16:\u0157\3:\3:\3;"+
		"\3;\3;\3;\7;\u0160\n;\f;\16;\u0163\13;\3;\3;\3<\3<\3<\2\2=\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w\2\3"+
		"\2\n\3\2\62;\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17"+
		"\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u016e\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\3y\3\2\2\2\5\u0082\3\2\2\2\7\u0086\3\2\2\2\t"+
		"\u008a\3\2\2\2\13\u0091\3\2\2\2\r\u0096\3\2\2\2\17\u009b\3\2\2\2\21\u009e"+
		"\3\2\2\2\23\u00a3\3\2\2\2\25\u00a9\3\2\2\2\27\u00ab\3\2\2\2\31\u00b0\3"+
		"\2\2\2\33\u00b6\3\2\2\2\35\u00b9\3\2\2\2\37\u00bd\3\2\2\2!\u00c2\3\2\2"+
		"\2#\u00c6\3\2\2\2%\u00ca\3\2\2\2\'\u00d7\3\2\2\2)\u00e3\3\2\2\2+\u00e7"+
		"\3\2\2\2-\u00ea\3\2\2\2/\u00ed\3\2\2\2\61\u00f3\3\2\2\2\63\u00f8\3\2\2"+
		"\2\65\u0102\3\2\2\2\67\u010b\3\2\2\29\u010d\3\2\2\2;\u010f\3\2\2\2=\u0111"+
		"\3\2\2\2?\u0114\3\2\2\2A\u0116\3\2\2\2C\u0118\3\2\2\2E\u011b\3\2\2\2G"+
		"\u011d\3\2\2\2I\u0124\3\2\2\2K\u0127\3\2\2\2M\u012a\3\2\2\2O\u012d\3\2"+
		"\2\2Q\u0130\3\2\2\2S\u0132\3\2\2\2U\u0134\3\2\2\2W\u0136\3\2\2\2Y\u0138"+
		"\3\2\2\2[\u013a\3\2\2\2]\u013c\3\2\2\2_\u013e\3\2\2\2a\u0141\3\2\2\2c"+
		"\u0144\3\2\2\2e\u0146\3\2\2\2g\u0148\3\2\2\2i\u014a\3\2\2\2k\u014c\3\2"+
		"\2\2m\u014e\3\2\2\2o\u0150\3\2\2\2q\u0152\3\2\2\2s\u0155\3\2\2\2u\u015b"+
		"\3\2\2\2w\u0166\3\2\2\2yz\7r\2\2z{\7t\2\2{|\7k\2\2|}\7p\2\2}~\7v\2\2~"+
		"\177\7n\2\2\177\u0080\7p\2\2\u0080\u0081\7#\2\2\u0081\4\3\2\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\78\2\2\u0084\u0085\7\66\2\2\u0085\6\3\2\2\2"+
		"\u0086\u0087\7h\2\2\u0087\u0088\78\2\2\u0088\u0089\7\66\2\2\u0089\b\3"+
		"\2\2\2\u008a\u008b\7U\2\2\u008b\u008c\7v\2\2\u008c\u008d\7t\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7i\2\2\u0090\n\3\2\2\2\u0091"+
		"\u0092\7d\2\2\u0092\u0093\7q\2\2\u0093\u0094\7q\2\2\u0094\u0095\7n\2\2"+
		"\u0095\f\3\2\2\2\u0096\u0097\7(\2\2\u0097\u0098\7u\2\2\u0098\u0099\7v"+
		"\2\2\u0099\u009a\7t\2\2\u009a\16\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7h\2\2\u009d\20\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7j\2\2\u00a8"+
		"\24\3\2\2\2\u00a9\u00aa\7~\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7g\2\2\u00af\30\3\2\2\2\u00b0"+
		"\u00b1\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7u\2\2"+
		"\u00b4\u00b5\7g\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7"+
		"u\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7y\2\2\u00bc\36\3\2\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0"+
		"\7y\2\2\u00c0\u00c1\7h\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7v\2\2\u00c5\"\3\2\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8"+
		"\7w\2\2\u00c8\u00c9\7v\2\2\u00c9$\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb\u00cc"+
		"\7v\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7a\2\2\u00ce\u00cf\7u\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2"+
		"\u00d3\u00d4\7i\2\2\u00d4\u00d5\7*\2\2\u00d5\u00d6\7+\2\2\u00d6&\3\2\2"+
		"\2\u00d7\u00d8\7\60\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7q\2\2\u00da\u00db"+
		"\7a\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7y\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7g\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7*\2\2\u00e1\u00e2\7+\2\2"+
		"\u00e2(\3\2\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7d\2"+
		"\2\u00e6*\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9\7@\2\2\u00e9,\3\2\2\2"+
		"\u00ea\u00eb\7h\2\2\u00eb\u00ec\7p\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7o\2"+
		"\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\60\3"+
		"\2\2\2\u00f2\u00f4\t\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\62\3\2\2\2\u00f7\u00f9\t\2\2"+
		"\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\t\3\2\2\u00fd\u00ff\t\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\64\3\2\2\2\u0102\u0106\7$\2\2\u0103\u0105\n\4\2\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7$\2\2\u010a\66\3\2\2\2"+
		"\u010b\u010c\7\60\2\2\u010c8\3\2\2\2\u010d\u010e\7.\2\2\u010e:\3\2\2\2"+
		"\u010f\u0110\7=\2\2\u0110<\3\2\2\2\u0111\u0112\7<\2\2\u0112\u0113\7<\2"+
		"\2\u0113>\3\2\2\2\u0114\u0115\7<\2\2\u0115@\3\2\2\2\u0116\u0117\7?\2\2"+
		"\u0117B\3\2\2\2\u0118\u0119\7?\2\2\u0119\u011a\7@\2\2\u011aD\3\2\2\2\u011b"+
		"\u011c\7a\2\2\u011cF\3\2\2\2\u011d\u0121\t\5\2\2\u011e\u0120\t\6\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122H\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7#\2\2\u0125\u0126"+
		"\7?\2\2\u0126J\3\2\2\2\u0127\u0128\7?\2\2\u0128\u0129\7?\2\2\u0129L\3"+
		"\2\2\2\u012a\u012b\7@\2\2\u012b\u012c\7?\2\2\u012cN\3\2\2\2\u012d\u012e"+
		"\7>\2\2\u012e\u012f\7?\2\2\u012fP\3\2\2\2\u0130\u0131\7@\2\2\u0131R\3"+
		"\2\2\2\u0132\u0133\7>\2\2\u0133T\3\2\2\2\u0134\u0135\7,\2\2\u0135V\3\2"+
		"\2\2\u0136\u0137\7\61\2\2\u0137X\3\2\2\2\u0138\u0139\7-\2\2\u0139Z\3\2"+
		"\2\2\u013a\u013b\7/\2\2\u013b\\\3\2\2\2\u013c\u013d\7\'\2\2\u013d^\3\2"+
		"\2\2\u013e\u013f\7(\2\2\u013f\u0140\7(\2\2\u0140`\3\2\2\2\u0141\u0142"+
		"\7~\2\2\u0142\u0143\7~\2\2\u0143b\3\2\2\2\u0144\u0145\7#\2\2\u0145d\3"+
		"\2\2\2\u0146\u0147\7(\2\2\u0147f\3\2\2\2\u0148\u0149\7*\2\2\u0149h\3\2"+
		"\2\2\u014a\u014b\7+\2\2\u014bj\3\2\2\2\u014c\u014d\7}\2\2\u014dl\3\2\2"+
		"\2\u014e\u014f\7\177\2\2\u014fn\3\2\2\2\u0150\u0151\7]\2\2\u0151p\3\2"+
		"\2\2\u0152\u0153\7_\2\2\u0153r\3\2\2\2\u0154\u0156\t\7\2\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\b:\2\2\u015at\3\2\2\2\u015b\u015c\7\61\2\2"+
		"\u015c\u015d\7\61\2\2\u015d\u0161\3\2\2\2\u015e\u0160\n\b\2\2\u015f\u015e"+
		"\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\b;\2\2\u0165v\3\2\2\2\u0166"+
		"\u0167\7^\2\2\u0167\u0168\t\t\2\2\u0168x\3\2\2\2\n\2\u00f5\u00fa\u0100"+
		"\u0106\u0121\u0157\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}