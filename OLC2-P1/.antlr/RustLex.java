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
		PRINT_CON=1, T_NUMBER=2, T_FLOAT=3, T_STRING=4, TRUE=5, FALSE=6, AS=7, 
		POW=8, POWF=9, TO_STRING=10, TO_OWNED=11, NUMBER=12, FLOAT=13, STRING=14, 
		PUNTO=15, COMA=16, PTCOMA=17, DOSPUNTO=18, DISTINTO=19, IGUAL=20, MAYORIGUAL=21, 
		MENORIGUAL=22, MAYOR=23, MENOR=24, MUL=25, DIV=26, ADD=27, SUB=28, MOD=29, 
		AND=30, OR=31, NOT=32, AMP=33, PARIZQ=34, PARDER=35, LLAVEIZQ=36, LLAVEDER=37, 
		WHITESPACE=38, L_COMMENT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", "AS", 
			"POW", "POWF", "TO_STRING", "TO_OWNED", "NUMBER", "FLOAT", "STRING", 
			"PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DISTINTO", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", 
			"OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", 
			"L_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'string'", "'true'", "'false'", 
			"'as'", "'pow'", "'powf'", "'.to_string()'", "'.to_owned()'", null, null, 
			null, "'.'", "','", "';'", "'::'", "'!='", "'=='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", 
			"AS", "POW", "POWF", "TO_STRING", "TO_OWNED", "NUMBER", "FLOAT", "STRING", 
			"PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DISTINTO", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", 
			"OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", 
			"L_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u00fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\6\r\u009d\n\r\r\r\16\r\u009e\3\16\6\16\u00a2\n\16\r\16\16"+
		"\16\u00a3\3\16\3\16\6\16\u00a8\n\16\r\16\16\16\u00a9\3\17\3\17\7\17\u00ae"+
		"\n\17\f\17\16\17\u00b1\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\6\'\u00eb\n\'\r\'\16\'\u00ec\3\'\3\'\3(\3(\3(\3(\7(\u00f5\n(\f(\16(\u00f8"+
		"\13(\3(\3(\3)\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2\3\2\b\3\2\62;\3\2\60"+
		"\60\3\2$$\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u0102"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3S\3\2\2\2\5\\\3\2\2\2"+
		"\7`\3\2\2\2\td\3\2\2\2\13k\3\2\2\2\rp\3\2\2\2\17v\3\2\2\2\21y\3\2\2\2"+
		"\23}\3\2\2\2\25\u0082\3\2\2\2\27\u008f\3\2\2\2\31\u009c\3\2\2\2\33\u00a1"+
		"\3\2\2\2\35\u00ab\3\2\2\2\37\u00b4\3\2\2\2!\u00b6\3\2\2\2#\u00b8\3\2\2"+
		"\2%\u00ba\3\2\2\2\'\u00bd\3\2\2\2)\u00c0\3\2\2\2+\u00c3\3\2\2\2-\u00c6"+
		"\3\2\2\2/\u00c9\3\2\2\2\61\u00cb\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2"+
		"\2\2\67\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d5\3\2\2\2=\u00d7\3\2\2\2?\u00da"+
		"\3\2\2\2A\u00dd\3\2\2\2C\u00df\3\2\2\2E\u00e1\3\2\2\2G\u00e3\3\2\2\2I"+
		"\u00e5\3\2\2\2K\u00e7\3\2\2\2M\u00ea\3\2\2\2O\u00f0\3\2\2\2Q\u00fb\3\2"+
		"\2\2ST\7r\2\2TU\7t\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2XY\7n\2\2YZ\7p\2\2Z["+
		"\7#\2\2[\4\3\2\2\2\\]\7k\2\2]^\78\2\2^_\7\66\2\2_\6\3\2\2\2`a\7h\2\2a"+
		"b\78\2\2bc\7\66\2\2c\b\3\2\2\2de\7u\2\2ef\7v\2\2fg\7t\2\2gh\7k\2\2hi\7"+
		"p\2\2ij\7i\2\2j\n\3\2\2\2kl\7v\2\2lm\7t\2\2mn\7w\2\2no\7g\2\2o\f\3\2\2"+
		"\2pq\7h\2\2qr\7c\2\2rs\7n\2\2st\7u\2\2tu\7g\2\2u\16\3\2\2\2vw\7c\2\2w"+
		"x\7u\2\2x\20\3\2\2\2yz\7r\2\2z{\7q\2\2{|\7y\2\2|\22\3\2\2\2}~\7r\2\2~"+
		"\177\7q\2\2\177\u0080\7y\2\2\u0080\u0081\7h\2\2\u0081\24\3\2\2\2\u0082"+
		"\u0083\7\60\2\2\u0083\u0084\7v\2\2\u0084\u0085\7q\2\2\u0085\u0086\7a\2"+
		"\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7i\2\2\u008c\u008d\7*\2\2\u008d"+
		"\u008e\7+\2\2\u008e\26\3\2\2\2\u008f\u0090\7\60\2\2\u0090\u0091\7v\2\2"+
		"\u0091\u0092\7q\2\2\u0092\u0093\7a\2\2\u0093\u0094\7q\2\2\u0094\u0095"+
		"\7y\2\2\u0095\u0096\7p\2\2\u0096\u0097\7g\2\2\u0097\u0098\7f\2\2\u0098"+
		"\u0099\7*\2\2\u0099\u009a\7+\2\2\u009a\30\3\2\2\2\u009b\u009d\t\2\2\2"+
		"\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\32\3\2\2\2\u00a0\u00a2\t\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\34\3\2\2"+
		"\2\u00ab\u00af\7$\2\2\u00ac\u00ae\n\4\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3\36\3\2\2\2\u00b4\u00b5\7\60\2"+
		"\2\u00b5 \3\2\2\2\u00b6\u00b7\7.\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7=\2"+
		"\2\u00b9$\3\2\2\2\u00ba\u00bb\7<\2\2\u00bb\u00bc\7<\2\2\u00bc&\3\2\2\2"+
		"\u00bd\u00be\7#\2\2\u00be\u00bf\7?\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7?\2"+
		"\2\u00c1\u00c2\7?\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4\u00c5\7"+
		"?\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8\7?\2\2\u00c8.\3\2"+
		"\2\2\u00c9\u00ca\7@\2\2\u00ca\60\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc\62\3"+
		"\2\2\2\u00cd\u00ce\7,\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0"+
		"\66\3\2\2\2\u00d1\u00d2\7-\2\2\u00d28\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4"+
		":\3\2\2\2\u00d5\u00d6\7\'\2\2\u00d6<\3\2\2\2\u00d7\u00d8\7(\2\2\u00d8"+
		"\u00d9\7(\2\2\u00d9>\3\2\2\2\u00da\u00db\7~\2\2\u00db\u00dc\7~\2\2\u00dc"+
		"@\3\2\2\2\u00dd\u00de\7#\2\2\u00deB\3\2\2\2\u00df\u00e0\7(\2\2\u00e0D"+
		"\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2F\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4H\3"+
		"\2\2\2\u00e5\u00e6\7}\2\2\u00e6J\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e8L"+
		"\3\2\2\2\u00e9\u00eb\t\5\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\'"+
		"\2\2\u00efN\3\2\2\2\u00f0\u00f1\7\61\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f6"+
		"\3\2\2\2\u00f3\u00f5\n\6\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fa\b(\2\2\u00faP\3\2\2\2\u00fb\u00fc\7^\2\2\u00fc\u00fd"+
		"\t\7\2\2\u00fdR\3\2\2\2\t\2\u009e\u00a3\u00a9\u00af\u00ec\u00f6\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}