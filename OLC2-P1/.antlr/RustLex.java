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
		ELSE=8, WHILE=9, LOOP=10, FOR=11, IN=12, BREAK=13, CONTINUE=14, MATCH=15, 
		MTOR=16, TRUE=17, FALSE=18, AS=19, POW=20, POWF=21, LET=22, MUT=23, STRUCT=24, 
		VEC=25, VECN=26, CAPACITY=27, TO_STRING=28, TO_OWNED=29, LEN=30, NEW=31, 
		CAPF=32, PUSH=33, CONTAINS=34, PUBLIC=35, TYPETHEN=36, FN=37, MAIN=38, 
		RETURN=39, NUMBER=40, FLOAT=41, STRING=42, PUNTO=43, COMA=44, PTCOMA=45, 
		DOSPUNTO=46, DPUNTO2=47, ASIGNACION=48, MTHEN=49, GUIONB=50, ID=51, DISTINTO=52, 
		IGUAL=53, MAYORIGUAL=54, MENORIGUAL=55, MAYOR=56, MENOR=57, MUL=58, DIV=59, 
		ADD=60, SUB=61, MOD=62, AND=63, OR=64, NOT=65, AMP=66, PARIZQ=67, PARDER=68, 
		LLAVEIZQ=69, LLAVEDER=70, CORIZQ=71, CORDER=72, WHITESPACE=73, L_COMMENT=74;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "IF", 
			"ELSE", "WHILE", "LOOP", "FOR", "IN", "BREAK", "CONTINUE", "MATCH", "MTOR", 
			"TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", "VEC", 
			"VECN", "CAPACITY", "TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", "PUSH", 
			"CONTAINS", "PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", "NUMBER", "FLOAT", 
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
			"'if'", "'else'", "'while'", "'loop'", "'for'", "'in'", "'break'", "'continue'", 
			"'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", 
			"'mut'", "'struct'", "'vec!'", "'Vec'", "'with_capacity'", "'.to_string()'", 
			"'.to_owned()'", "'len()'", "'new()'", "'capacity()'", "'push'", "'contains'", 
			"'pub'", "'->'", "'fn'", "'main'", "'return'", null, null, null, "'.'", 
			"','", "';'", "'::'", "':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", 
			"'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", 
			"'||'", "'!'", "'&'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "WHILE", "LOOP", "FOR", "IN", "BREAK", "CONTINUE", "MATCH", 
			"MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", 
			"VEC", "VECN", "CAPACITY", "TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", 
			"PUSH", "CONTAINS", "PUBLIC", "TYPETHEN", "FN", "MAIN", "RETURN", "NUMBER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u01f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\6)\u017f\n)\r)\16)\u0180\3*\6*\u0184"+
		"\n*\r*\16*\u0185\3*\3*\6*\u018a\n*\r*\16*\u018b\3+\3+\7+\u0190\n+\f+\16"+
		"+\u0193\13+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\7\64\u01ab\n\64\f\64\16\64\u01ae\13\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3;"+
		"\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E"+
		"\3F\3F\3G\3G\3H\3H\3I\3I\3J\6J\u01e1\nJ\rJ\16J\u01e2\3J\3J\3K\3K\3K\3"+
		"K\7K\u01eb\nK\fK\16K\u01ee\13K\3K\3K\3L\3L\3L\2\2M\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097\2\3\2\n\3\2\62;\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u01f9\2"+
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
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0099"+
		"\3\2\2\2\5\u00a2\3\2\2\2\7\u00a6\3\2\2\2\t\u00aa\3\2\2\2\13\u00b1\3\2"+
		"\2\2\r\u00b6\3\2\2\2\17\u00bb\3\2\2\2\21\u00be\3\2\2\2\23\u00c3\3\2\2"+
		"\2\25\u00c9\3\2\2\2\27\u00ce\3\2\2\2\31\u00d2\3\2\2\2\33\u00d5\3\2\2\2"+
		"\35\u00db\3\2\2\2\37\u00e4\3\2\2\2!\u00ea\3\2\2\2#\u00ec\3\2\2\2%\u00f1"+
		"\3\2\2\2\'\u00f7\3\2\2\2)\u00fa\3\2\2\2+\u00fe\3\2\2\2-\u0103\3\2\2\2"+
		"/\u0107\3\2\2\2\61\u010b\3\2\2\2\63\u0112\3\2\2\2\65\u0117\3\2\2\2\67"+
		"\u011b\3\2\2\29\u0129\3\2\2\2;\u0136\3\2\2\2=\u0142\3\2\2\2?\u0148\3\2"+
		"\2\2A\u014e\3\2\2\2C\u0159\3\2\2\2E\u015e\3\2\2\2G\u0167\3\2\2\2I\u016b"+
		"\3\2\2\2K\u016e\3\2\2\2M\u0171\3\2\2\2O\u0176\3\2\2\2Q\u017e\3\2\2\2S"+
		"\u0183\3\2\2\2U\u018d\3\2\2\2W\u0196\3\2\2\2Y\u0198\3\2\2\2[\u019a\3\2"+
		"\2\2]\u019c\3\2\2\2_\u019f\3\2\2\2a\u01a1\3\2\2\2c\u01a3\3\2\2\2e\u01a6"+
		"\3\2\2\2g\u01a8\3\2\2\2i\u01af\3\2\2\2k\u01b2\3\2\2\2m\u01b5\3\2\2\2o"+
		"\u01b8\3\2\2\2q\u01bb\3\2\2\2s\u01bd\3\2\2\2u\u01bf\3\2\2\2w\u01c1\3\2"+
		"\2\2y\u01c3\3\2\2\2{\u01c5\3\2\2\2}\u01c7\3\2\2\2\177\u01c9\3\2\2\2\u0081"+
		"\u01cc\3\2\2\2\u0083\u01cf\3\2\2\2\u0085\u01d1\3\2\2\2\u0087\u01d3\3\2"+
		"\2\2\u0089\u01d5\3\2\2\2\u008b\u01d7\3\2\2\2\u008d\u01d9\3\2\2\2\u008f"+
		"\u01db\3\2\2\2\u0091\u01dd\3\2\2\2\u0093\u01e0\3\2\2\2\u0095\u01e6\3\2"+
		"\2\2\u0097\u01f1\3\2\2\2\u0099\u009a\7r\2\2\u009a\u009b\7t\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7p\2\2\u00a0\u00a1\7#\2\2\u00a1\4\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\78\2\2\u00a4\u00a5\7\66\2\2\u00a5\6\3\2\2\2\u00a6\u00a7\7h\2\2"+
		"\u00a7\u00a8\78\2\2\u00a8\u00a9\7\66\2\2\u00a9\b\3\2\2\2\u00aa\u00ab\7"+
		"U\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af"+
		"\7p\2\2\u00af\u00b0\7i\2\2\u00b0\n\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3"+
		"\7q\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7n\2\2\u00b5\f\3\2\2\2\u00b6\u00b7"+
		"\7(\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba"+
		"\16\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7h\2\2\u00bd\20\3\2\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2"+
		"\u00c2\22\3\2\2\2\u00c3\u00c4\7y\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7"+
		"k\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8\24\3\2\2\2\u00c9\u00ca"+
		"\7n\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7r\2\2\u00cd"+
		"\26\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2\2\u00d1"+
		"\30\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\32\3\2\2\2\u00d5"+
		"\u00d6\7d\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7c\2\2"+
		"\u00d9\u00da\7m\2\2\u00da\34\3\2\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7"+
		"q\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7g\2\2\u00e3\36\3\2\2\2\u00e4\u00e5"+
		"\7o\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7e\2\2\u00e8"+
		"\u00e9\7j\2\2\u00e9 \3\2\2\2\u00ea\u00eb\7~\2\2\u00eb\"\3\2\2\2\u00ec"+
		"\u00ed\7v\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0$\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7n\2"+
		"\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6&\3\2\2\2\u00f7\u00f8\7"+
		"c\2\2\u00f8\u00f9\7u\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7y\2\2\u00fd*\3\2\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100"+
		"\7q\2\2\u0100\u0101\7y\2\2\u0101\u0102\7h\2\2\u0102,\3\2\2\2\u0103\u0104"+
		"\7n\2\2\u0104\u0105\7g\2\2\u0105\u0106\7v\2\2\u0106.\3\2\2\2\u0107\u0108"+
		"\7o\2\2\u0108\u0109\7w\2\2\u0109\u010a\7v\2\2\u010a\60\3\2\2\2\u010b\u010c"+
		"\7u\2\2\u010c\u010d\7v\2\2\u010d\u010e\7t\2\2\u010e\u010f\7w\2\2\u010f"+
		"\u0110\7e\2\2\u0110\u0111\7v\2\2\u0111\62\3\2\2\2\u0112\u0113\7x\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0115\7e\2\2\u0115\u0116\7#\2\2\u0116\64\3\2\2\2\u0117"+
		"\u0118\7X\2\2\u0118\u0119\7g\2\2\u0119\u011a\7e\2\2\u011a\66\3\2\2\2\u011b"+
		"\u011c\7y\2\2\u011c\u011d\7k\2\2\u011d\u011e\7v\2\2\u011e\u011f\7j\2\2"+
		"\u011f\u0120\7a\2\2\u0120\u0121\7e\2\2\u0121\u0122\7c\2\2\u0122\u0123"+
		"\7r\2\2\u0123\u0124\7c\2\2\u0124\u0125\7e\2\2\u0125\u0126\7k\2\2\u0126"+
		"\u0127\7v\2\2\u0127\u0128\7{\2\2\u01288\3\2\2\2\u0129\u012a\7\60\2\2\u012a"+
		"\u012b\7v\2\2\u012b\u012c\7q\2\2\u012c\u012d\7a\2\2\u012d\u012e\7u\2\2"+
		"\u012e\u012f\7v\2\2\u012f\u0130\7t\2\2\u0130\u0131\7k\2\2\u0131\u0132"+
		"\7p\2\2\u0132\u0133\7i\2\2\u0133\u0134\7*\2\2\u0134\u0135\7+\2\2\u0135"+
		":\3\2\2\2\u0136\u0137\7\60\2\2\u0137\u0138\7v\2\2\u0138\u0139\7q\2\2\u0139"+
		"\u013a\7a\2\2\u013a\u013b\7q\2\2\u013b\u013c\7y\2\2\u013c\u013d\7p\2\2"+
		"\u013d\u013e\7g\2\2\u013e\u013f\7f\2\2\u013f\u0140\7*\2\2\u0140\u0141"+
		"\7+\2\2\u0141<\3\2\2\2\u0142\u0143\7n\2\2\u0143\u0144\7g\2\2\u0144\u0145"+
		"\7p\2\2\u0145\u0146\7*\2\2\u0146\u0147\7+\2\2\u0147>\3\2\2\2\u0148\u0149"+
		"\7p\2\2\u0149\u014a\7g\2\2\u014a\u014b\7y\2\2\u014b\u014c\7*\2\2\u014c"+
		"\u014d\7+\2\2\u014d@\3\2\2\2\u014e\u014f\7e\2\2\u014f\u0150\7c\2\2\u0150"+
		"\u0151\7r\2\2\u0151\u0152\7c\2\2\u0152\u0153\7e\2\2\u0153\u0154\7k\2\2"+
		"\u0154\u0155\7v\2\2\u0155\u0156\7{\2\2\u0156\u0157\7*\2\2\u0157\u0158"+
		"\7+\2\2\u0158B\3\2\2\2\u0159\u015a\7r\2\2\u015a\u015b\7w\2\2\u015b\u015c"+
		"\7u\2\2\u015c\u015d\7j\2\2\u015dD\3\2\2\2\u015e\u015f\7e\2\2\u015f\u0160"+
		"\7q\2\2\u0160\u0161\7p\2\2\u0161\u0162\7v\2\2\u0162\u0163\7c\2\2\u0163"+
		"\u0164\7k\2\2\u0164\u0165\7p\2\2\u0165\u0166\7u\2\2\u0166F\3\2\2\2\u0167"+
		"\u0168\7r\2\2\u0168\u0169\7w\2\2\u0169\u016a\7d\2\2\u016aH\3\2\2\2\u016b"+
		"\u016c\7/\2\2\u016c\u016d\7@\2\2\u016dJ\3\2\2\2\u016e\u016f\7h\2\2\u016f"+
		"\u0170\7p\2\2\u0170L\3\2\2\2\u0171\u0172\7o\2\2\u0172\u0173\7c\2\2\u0173"+
		"\u0174\7k\2\2\u0174\u0175\7p\2\2\u0175N\3\2\2\2\u0176\u0177\7t\2\2\u0177"+
		"\u0178\7g\2\2\u0178\u0179\7v\2\2\u0179\u017a\7w\2\2\u017a\u017b\7t\2\2"+
		"\u017b\u017c\7p\2\2\u017cP\3\2\2\2\u017d\u017f\t\2\2\2\u017e\u017d\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"R\3\2\2\2\u0182\u0184\t\2\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2"+
		"\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189"+
		"\t\3\2\2\u0188\u018a\t\2\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018cT\3\2\2\2\u018d\u0191\7$\2\2\u018e"+
		"\u0190\n\4\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194"+
		"\u0195\7$\2\2\u0195V\3\2\2\2\u0196\u0197\7\60\2\2\u0197X\3\2\2\2\u0198"+
		"\u0199\7.\2\2\u0199Z\3\2\2\2\u019a\u019b\7=\2\2\u019b\\\3\2\2\2\u019c"+
		"\u019d\7<\2\2\u019d\u019e\7<\2\2\u019e^\3\2\2\2\u019f\u01a0\7<\2\2\u01a0"+
		"`\3\2\2\2\u01a1\u01a2\7?\2\2\u01a2b\3\2\2\2\u01a3\u01a4\7?\2\2\u01a4\u01a5"+
		"\7@\2\2\u01a5d\3\2\2\2\u01a6\u01a7\7a\2\2\u01a7f\3\2\2\2\u01a8\u01ac\t"+
		"\5\2\2\u01a9\u01ab\t\6\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01adh\3\2\2\2\u01ae\u01ac\3\2\2\2"+
		"\u01af\u01b0\7#\2\2\u01b0\u01b1\7?\2\2\u01b1j\3\2\2\2\u01b2\u01b3\7?\2"+
		"\2\u01b3\u01b4\7?\2\2\u01b4l\3\2\2\2\u01b5\u01b6\7@\2\2\u01b6\u01b7\7"+
		"?\2\2\u01b7n\3\2\2\2\u01b8\u01b9\7>\2\2\u01b9\u01ba\7?\2\2\u01bap\3\2"+
		"\2\2\u01bb\u01bc\7@\2\2\u01bcr\3\2\2\2\u01bd\u01be\7>\2\2\u01bet\3\2\2"+
		"\2\u01bf\u01c0\7,\2\2\u01c0v\3\2\2\2\u01c1\u01c2\7\61\2\2\u01c2x\3\2\2"+
		"\2\u01c3\u01c4\7-\2\2\u01c4z\3\2\2\2\u01c5\u01c6\7/\2\2\u01c6|\3\2\2\2"+
		"\u01c7\u01c8\7\'\2\2\u01c8~\3\2\2\2\u01c9\u01ca\7(\2\2\u01ca\u01cb\7("+
		"\2\2\u01cb\u0080\3\2\2\2\u01cc\u01cd\7~\2\2\u01cd\u01ce\7~\2\2\u01ce\u0082"+
		"\3\2\2\2\u01cf\u01d0\7#\2\2\u01d0\u0084\3\2\2\2\u01d1\u01d2\7(\2\2\u01d2"+
		"\u0086\3\2\2\2\u01d3\u01d4\7*\2\2\u01d4\u0088\3\2\2\2\u01d5\u01d6\7+\2"+
		"\2\u01d6\u008a\3\2\2\2\u01d7\u01d8\7}\2\2\u01d8\u008c\3\2\2\2\u01d9\u01da"+
		"\7\177\2\2\u01da\u008e\3\2\2\2\u01db\u01dc\7]\2\2\u01dc\u0090\3\2\2\2"+
		"\u01dd\u01de\7_\2\2\u01de\u0092\3\2\2\2\u01df\u01e1\t\7\2\2\u01e0\u01df"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e5\bJ\2\2\u01e5\u0094\3\2\2\2\u01e6\u01e7\7\61"+
		"\2\2\u01e7\u01e8\7\61\2\2\u01e8\u01ec\3\2\2\2\u01e9\u01eb\n\b\2\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\bK\2\2\u01f0"+
		"\u0096\3\2\2\2\u01f1\u01f2\7^\2\2\u01f2\u01f3\t\t\2\2\u01f3\u0098\3\2"+
		"\2\2\n\2\u0180\u0185\u018b\u0191\u01ac\u01e2\u01ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}