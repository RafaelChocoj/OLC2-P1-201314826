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
		CAPF=32, PUBLIC=33, TYPETHEN=34, FN=35, MAIN=36, RETURN=37, REF=38, NUMBER=39, 
		FLOAT=40, STRING=41, PUNTO=42, COMA=43, PTCOMA=44, DOSPUNTO=45, DPUNTO2=46, 
		ASIGNACION=47, MTHEN=48, GUIONB=49, ID=50, DISTINTO=51, IGUAL=52, MAYORIGUAL=53, 
		MENORIGUAL=54, MAYOR=55, MENOR=56, MUL=57, DIV=58, ADD=59, SUB=60, MOD=61, 
		AND=62, OR=63, NOT=64, AMP=65, PARIZQ=66, PARDER=67, LLAVEIZQ=68, LLAVEDER=69, 
		CORIZQ=70, CORDER=71, WHITESPACE=72, L_COMMENT=73;
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
			"VECN", "CAPACITY", "TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", "PUBLIC", 
			"TYPETHEN", "FN", "MAIN", "RETURN", "REF", "NUMBER", "FLOAT", "STRING", 
			"PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN", 
			"GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", 
			"MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", "AMP", 
			"PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "WHITESPACE", 
			"L_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'while'", "'loop'", "'for'", "'in'", "'break'", "'continue'", 
			"'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", 
			"'mut'", "'struct'", "'vec!'", "'Vec'", "'with_capacity'", "'.to_string()'", 
			"'.to_owned()'", "'len()'", "'new()'", "'capacity()'", "'pub'", "'->'", 
			"'fn'", "'main'", "'return'", "'&mut'", null, null, null, "'.'", "','", 
			"';'", "'::'", "':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", 
			"'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", 
			"'!'", "'&'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "WHILE", "LOOP", "FOR", "IN", "BREAK", "CONTINUE", "MATCH", 
			"MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "STRUCT", 
			"VEC", "VECN", "CAPACITY", "TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u01e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3("+
		"\6(\u0174\n(\r(\16(\u0175\3)\6)\u0179\n)\r)\16)\u017a\3)\3)\6)\u017f\n"+
		")\r)\16)\u0180\3*\3*\7*\u0185\n*\f*\16*\u0188\13*\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\7\63"+
		"\u01a0\n\63\f\63\16\63\u01a3\13\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\6"+
		"I\u01d6\nI\rI\16I\u01d7\3I\3I\3J\3J\3J\3J\7J\u01e0\nJ\fJ\16J\u01e3\13"+
		"J\3J\3J\3K\3K\3K\2\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095\2\3\2\n\3\2\62;\3\2\60\60\3"+
		"\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2"+
		"\"#%%--/\60<<BB]_\2\u01ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\3\u0097\3\2\2\2\5\u00a0\3\2\2\2\7\u00a4\3\2\2\2\t\u00a8\3\2\2"+
		"\2\13\u00af\3\2\2\2\r\u00b4\3\2\2\2\17\u00b9\3\2\2\2\21\u00bc\3\2\2\2"+
		"\23\u00c1\3\2\2\2\25\u00c7\3\2\2\2\27\u00cc\3\2\2\2\31\u00d0\3\2\2\2\33"+
		"\u00d3\3\2\2\2\35\u00d9\3\2\2\2\37\u00e2\3\2\2\2!\u00e8\3\2\2\2#\u00ea"+
		"\3\2\2\2%\u00ef\3\2\2\2\'\u00f5\3\2\2\2)\u00f8\3\2\2\2+\u00fc\3\2\2\2"+
		"-\u0101\3\2\2\2/\u0105\3\2\2\2\61\u0109\3\2\2\2\63\u0110\3\2\2\2\65\u0115"+
		"\3\2\2\2\67\u0119\3\2\2\29\u0127\3\2\2\2;\u0134\3\2\2\2=\u0140\3\2\2\2"+
		"?\u0146\3\2\2\2A\u014c\3\2\2\2C\u0157\3\2\2\2E\u015b\3\2\2\2G\u015e\3"+
		"\2\2\2I\u0161\3\2\2\2K\u0166\3\2\2\2M\u016d\3\2\2\2O\u0173\3\2\2\2Q\u0178"+
		"\3\2\2\2S\u0182\3\2\2\2U\u018b\3\2\2\2W\u018d\3\2\2\2Y\u018f\3\2\2\2["+
		"\u0191\3\2\2\2]\u0194\3\2\2\2_\u0196\3\2\2\2a\u0198\3\2\2\2c\u019b\3\2"+
		"\2\2e\u019d\3\2\2\2g\u01a4\3\2\2\2i\u01a7\3\2\2\2k\u01aa\3\2\2\2m\u01ad"+
		"\3\2\2\2o\u01b0\3\2\2\2q\u01b2\3\2\2\2s\u01b4\3\2\2\2u\u01b6\3\2\2\2w"+
		"\u01b8\3\2\2\2y\u01ba\3\2\2\2{\u01bc\3\2\2\2}\u01be\3\2\2\2\177\u01c1"+
		"\3\2\2\2\u0081\u01c4\3\2\2\2\u0083\u01c6\3\2\2\2\u0085\u01c8\3\2\2\2\u0087"+
		"\u01ca\3\2\2\2\u0089\u01cc\3\2\2\2\u008b\u01ce\3\2\2\2\u008d\u01d0\3\2"+
		"\2\2\u008f\u01d2\3\2\2\2\u0091\u01d5\3\2\2\2\u0093\u01db\3\2\2\2\u0095"+
		"\u01e6\3\2\2\2\u0097\u0098\7r\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2"+
		"\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7n\2\2\u009d\u009e"+
		"\7p\2\2\u009e\u009f\7#\2\2\u009f\4\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2"+
		"\78\2\2\u00a2\u00a3\7\66\2\2\u00a3\6\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5"+
		"\u00a6\78\2\2\u00a6\u00a7\7\66\2\2\u00a7\b\3\2\2\2\u00a8\u00a9\7U\2\2"+
		"\u00a9\u00aa\7v\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7p\2\2\u00ad\u00ae\7i\2\2\u00ae\n\3\2\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7n\2\2\u00b3\f\3\2\2\2\u00b4\u00b5"+
		"\7(\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8"+
		"\16\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7h\2\2\u00bb\20\3\2\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2"+
		"\u00c0\22\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7"+
		"k\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7g\2\2\u00c6\24\3\2\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7r\2\2\u00cb"+
		"\26\3\2\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7t\2\2\u00cf"+
		"\30\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\32\3\2\2\2\u00d3"+
		"\u00d4\7d\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7c\2\2"+
		"\u00d7\u00d8\7m\2\2\u00d8\34\3\2\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7"+
		"q\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7k\2\2\u00de\u00df"+
		"\7p\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7g\2\2\u00e1\36\3\2\2\2\u00e2\u00e3"+
		"\7o\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7e\2\2\u00e6"+
		"\u00e7\7j\2\2\u00e7 \3\2\2\2\u00e8\u00e9\7~\2\2\u00e9\"\3\2\2\2\u00ea"+
		"\u00eb\7v\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee$\3\2\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2"+
		"\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7g\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7"+
		"c\2\2\u00f6\u00f7\7u\2\2\u00f7(\3\2\2\2\u00f8\u00f9\7r\2\2\u00f9\u00fa"+
		"\7q\2\2\u00fa\u00fb\7y\2\2\u00fb*\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe"+
		"\7q\2\2\u00fe\u00ff\7y\2\2\u00ff\u0100\7h\2\2\u0100,\3\2\2\2\u0101\u0102"+
		"\7n\2\2\u0102\u0103\7g\2\2\u0103\u0104\7v\2\2\u0104.\3\2\2\2\u0105\u0106"+
		"\7o\2\2\u0106\u0107\7w\2\2\u0107\u0108\7v\2\2\u0108\60\3\2\2\2\u0109\u010a"+
		"\7u\2\2\u010a\u010b\7v\2\2\u010b\u010c\7t\2\2\u010c\u010d\7w\2\2\u010d"+
		"\u010e\7e\2\2\u010e\u010f\7v\2\2\u010f\62\3\2\2\2\u0110\u0111\7x\2\2\u0111"+
		"\u0112\7g\2\2\u0112\u0113\7e\2\2\u0113\u0114\7#\2\2\u0114\64\3\2\2\2\u0115"+
		"\u0116\7X\2\2\u0116\u0117\7g\2\2\u0117\u0118\7e\2\2\u0118\66\3\2\2\2\u0119"+
		"\u011a\7y\2\2\u011a\u011b\7k\2\2\u011b\u011c\7v\2\2\u011c\u011d\7j\2\2"+
		"\u011d\u011e\7a\2\2\u011e\u011f\7e\2\2\u011f\u0120\7c\2\2\u0120\u0121"+
		"\7r\2\2\u0121\u0122\7c\2\2\u0122\u0123\7e\2\2\u0123\u0124\7k\2\2\u0124"+
		"\u0125\7v\2\2\u0125\u0126\7{\2\2\u01268\3\2\2\2\u0127\u0128\7\60\2\2\u0128"+
		"\u0129\7v\2\2\u0129\u012a\7q\2\2\u012a\u012b\7a\2\2\u012b\u012c\7u\2\2"+
		"\u012c\u012d\7v\2\2\u012d\u012e\7t\2\2\u012e\u012f\7k\2\2\u012f\u0130"+
		"\7p\2\2\u0130\u0131\7i\2\2\u0131\u0132\7*\2\2\u0132\u0133\7+\2\2\u0133"+
		":\3\2\2\2\u0134\u0135\7\60\2\2\u0135\u0136\7v\2\2\u0136\u0137\7q\2\2\u0137"+
		"\u0138\7a\2\2\u0138\u0139\7q\2\2\u0139\u013a\7y\2\2\u013a\u013b\7p\2\2"+
		"\u013b\u013c\7g\2\2\u013c\u013d\7f\2\2\u013d\u013e\7*\2\2\u013e\u013f"+
		"\7+\2\2\u013f<\3\2\2\2\u0140\u0141\7n\2\2\u0141\u0142\7g\2\2\u0142\u0143"+
		"\7p\2\2\u0143\u0144\7*\2\2\u0144\u0145\7+\2\2\u0145>\3\2\2\2\u0146\u0147"+
		"\7p\2\2\u0147\u0148\7g\2\2\u0148\u0149\7y\2\2\u0149\u014a\7*\2\2\u014a"+
		"\u014b\7+\2\2\u014b@\3\2\2\2\u014c\u014d\7e\2\2\u014d\u014e\7c\2\2\u014e"+
		"\u014f\7r\2\2\u014f\u0150\7c\2\2\u0150\u0151\7e\2\2\u0151\u0152\7k\2\2"+
		"\u0152\u0153\7v\2\2\u0153\u0154\7{\2\2\u0154\u0155\7*\2\2\u0155\u0156"+
		"\7+\2\2\u0156B\3\2\2\2\u0157\u0158\7r\2\2\u0158\u0159\7w\2\2\u0159\u015a"+
		"\7d\2\2\u015aD\3\2\2\2\u015b\u015c\7/\2\2\u015c\u015d\7@\2\2\u015dF\3"+
		"\2\2\2\u015e\u015f\7h\2\2\u015f\u0160\7p\2\2\u0160H\3\2\2\2\u0161\u0162"+
		"\7o\2\2\u0162\u0163\7c\2\2\u0163\u0164\7k\2\2\u0164\u0165\7p\2\2\u0165"+
		"J\3\2\2\2\u0166\u0167\7t\2\2\u0167\u0168\7g\2\2\u0168\u0169\7v\2\2\u0169"+
		"\u016a\7w\2\2\u016a\u016b\7t\2\2\u016b\u016c\7p\2\2\u016cL\3\2\2\2\u016d"+
		"\u016e\7(\2\2\u016e\u016f\7o\2\2\u016f\u0170\7w\2\2\u0170\u0171\7v\2\2"+
		"\u0171N\3\2\2\2\u0172\u0174\t\2\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3"+
		"\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176P\3\2\2\2\u0177\u0179"+
		"\t\2\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\t\3\2\2\u017d\u017f\t\2"+
		"\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181R\3\2\2\2\u0182\u0186\7$\2\2\u0183\u0185\n\4\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7$\2\2\u018a"+
		"T\3\2\2\2\u018b\u018c\7\60\2\2\u018cV\3\2\2\2\u018d\u018e\7.\2\2\u018e"+
		"X\3\2\2\2\u018f\u0190\7=\2\2\u0190Z\3\2\2\2\u0191\u0192\7<\2\2\u0192\u0193"+
		"\7<\2\2\u0193\\\3\2\2\2\u0194\u0195\7<\2\2\u0195^\3\2\2\2\u0196\u0197"+
		"\7?\2\2\u0197`\3\2\2\2\u0198\u0199\7?\2\2\u0199\u019a\7@\2\2\u019ab\3"+
		"\2\2\2\u019b\u019c\7a\2\2\u019cd\3\2\2\2\u019d\u01a1\t\5\2\2\u019e\u01a0"+
		"\t\6\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2f\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7#\2\2\u01a5"+
		"\u01a6\7?\2\2\u01a6h\3\2\2\2\u01a7\u01a8\7?\2\2\u01a8\u01a9\7?\2\2\u01a9"+
		"j\3\2\2\2\u01aa\u01ab\7@\2\2\u01ab\u01ac\7?\2\2\u01acl\3\2\2\2\u01ad\u01ae"+
		"\7>\2\2\u01ae\u01af\7?\2\2\u01afn\3\2\2\2\u01b0\u01b1\7@\2\2\u01b1p\3"+
		"\2\2\2\u01b2\u01b3\7>\2\2\u01b3r\3\2\2\2\u01b4\u01b5\7,\2\2\u01b5t\3\2"+
		"\2\2\u01b6\u01b7\7\61\2\2\u01b7v\3\2\2\2\u01b8\u01b9\7-\2\2\u01b9x\3\2"+
		"\2\2\u01ba\u01bb\7/\2\2\u01bbz\3\2\2\2\u01bc\u01bd\7\'\2\2\u01bd|\3\2"+
		"\2\2\u01be\u01bf\7(\2\2\u01bf\u01c0\7(\2\2\u01c0~\3\2\2\2\u01c1\u01c2"+
		"\7~\2\2\u01c2\u01c3\7~\2\2\u01c3\u0080\3\2\2\2\u01c4\u01c5\7#\2\2\u01c5"+
		"\u0082\3\2\2\2\u01c6\u01c7\7(\2\2\u01c7\u0084\3\2\2\2\u01c8\u01c9\7*\2"+
		"\2\u01c9\u0086\3\2\2\2\u01ca\u01cb\7+\2\2\u01cb\u0088\3\2\2\2\u01cc\u01cd"+
		"\7}\2\2\u01cd\u008a\3\2\2\2\u01ce\u01cf\7\177\2\2\u01cf\u008c\3\2\2\2"+
		"\u01d0\u01d1\7]\2\2\u01d1\u008e\3\2\2\2\u01d2\u01d3\7_\2\2\u01d3\u0090"+
		"\3\2\2\2\u01d4\u01d6\t\7\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\bI"+
		"\2\2\u01da\u0092\3\2\2\2\u01db\u01dc\7\61\2\2\u01dc\u01dd\7\61\2\2\u01dd"+
		"\u01e1\3\2\2\2\u01de\u01e0\n\b\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e5\bJ\2\2\u01e5\u0094\3\2\2\2\u01e6\u01e7\7^\2"+
		"\2\u01e7\u01e8\t\t\2\2\u01e8\u0096\3\2\2\2\n\2\u0175\u017a\u0180\u0186"+
		"\u01a1\u01d7\u01e1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}