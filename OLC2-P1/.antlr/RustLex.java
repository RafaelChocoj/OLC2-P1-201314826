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
		POW=8, POWF=9, NUMBER=10, FLOAT=11, STRING=12, PUNTO=13, COMA=14, PTCOMA=15, 
		DOSPUNTO=16, IGUAL=17, MAYORIGUAL=18, MENORIGUAL=19, MAYOR=20, MENOR=21, 
		MUL=22, DIV=23, ADD=24, SUB=25, MOD=26, PARIZQ=27, PARDER=28, LLAVEIZQ=29, 
		LLAVEDER=30, WHITESPACE=31, L_COMMENT=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", "AS", 
			"POW", "POWF", "NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", 
			"DOSPUNTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", 
			"DIV", "ADD", "SUB", "MOD", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"WHITESPACE", "L_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'string'", "'true'", "'false'", 
			"'as'", "'pow'", "'powf'", null, null, null, "'.'", "','", "';'", "'::'", 
			"'='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", 
			"AS", "POW", "POWF", "NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", 
			"DOSPUNTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", 
			"DIV", "ADD", "SUB", "MOD", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\6\13"+
		"v\n\13\r\13\16\13w\3\f\6\f{\n\f\r\f\16\f|\3\f\3\f\6\f\u0081\n\f\r\f\16"+
		"\f\u0082\3\r\3\r\7\r\u0087\n\r\f\r\16\r\u008a\13\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \6 \u00b6\n \r \16 \u00b7"+
		"\3 \3 \3!\3!\3!\3!\7!\u00c0\n!\f!\16!\u00c3\13!\3!\3!\3\"\3\"\3\"\2\2"+
		"#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C\2\3\2\b\3\2\62;\3\2\60\60\3\2$$\6\2\13\f\17\17\"\"^^\4\2\f\f"+
		"\17\17\t\2\"#%%--/\60<<BB]_\2\u00cd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\3E\3\2\2\2\5N\3\2\2\2\7R\3\2\2\2\tV\3\2\2\2\13]\3\2\2\2\rb\3\2\2"+
		"\2\17h\3\2\2\2\21k\3\2\2\2\23o\3\2\2\2\25u\3\2\2\2\27z\3\2\2\2\31\u0084"+
		"\3\2\2\2\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0093\3\2"+
		"\2\2#\u0096\3\2\2\2%\u0098\3\2\2\2\'\u009b\3\2\2\2)\u009e\3\2\2\2+\u00a0"+
		"\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8\3\2\2"+
		"\2\65\u00aa\3\2\2\2\67\u00ac\3\2\2\29\u00ae\3\2\2\2;\u00b0\3\2\2\2=\u00b2"+
		"\3\2\2\2?\u00b5\3\2\2\2A\u00bb\3\2\2\2C\u00c6\3\2\2\2EF\7r\2\2FG\7t\2"+
		"\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2JK\7n\2\2KL\7p\2\2LM\7#\2\2M\4\3\2\2\2NO"+
		"\7k\2\2OP\78\2\2PQ\7\66\2\2Q\6\3\2\2\2RS\7h\2\2ST\78\2\2TU\7\66\2\2U\b"+
		"\3\2\2\2VW\7u\2\2WX\7v\2\2XY\7t\2\2YZ\7k\2\2Z[\7p\2\2[\\\7i\2\2\\\n\3"+
		"\2\2\2]^\7v\2\2^_\7t\2\2_`\7w\2\2`a\7g\2\2a\f\3\2\2\2bc\7h\2\2cd\7c\2"+
		"\2de\7n\2\2ef\7u\2\2fg\7g\2\2g\16\3\2\2\2hi\7c\2\2ij\7u\2\2j\20\3\2\2"+
		"\2kl\7r\2\2lm\7q\2\2mn\7y\2\2n\22\3\2\2\2op\7r\2\2pq\7q\2\2qr\7y\2\2r"+
		"s\7h\2\2s\24\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2"+
		"x\26\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2"+
		"\2~\u0080\t\3\2\2\177\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\30\3\2\2\2\u0084\u0088"+
		"\7$\2\2\u0085\u0087\n\4\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\7$\2\2\u008c\32\3\2\2\2\u008d\u008e\7\60\2\2\u008e\34"+
		"\3\2\2\2\u008f\u0090\7.\2\2\u0090\36\3\2\2\2\u0091\u0092\7=\2\2\u0092"+
		" \3\2\2\2\u0093\u0094\7<\2\2\u0094\u0095\7<\2\2\u0095\"\3\2\2\2\u0096"+
		"\u0097\7?\2\2\u0097$\3\2\2\2\u0098\u0099\7@\2\2\u0099\u009a\7?\2\2\u009a"+
		"&\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d(\3\2\2\2\u009e\u009f"+
		"\7@\2\2\u009f*\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7"+
		",\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\60\3\2\2\2\u00a6\u00a7"+
		"\7-\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\64\3\2\2\2\u00aa\u00ab"+
		"\7\'\2\2\u00ab\66\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad8\3\2\2\2\u00ae\u00af"+
		"\7+\2\2\u00af:\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1<\3\2\2\2\u00b2\u00b3\7"+
		"\177\2\2\u00b3>\3\2\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\b \2\2\u00ba@\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd"+
		"\7\61\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\n\6\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\b!\2\2\u00c5B\3\2\2\2\u00c6\u00c7"+
		"\7^\2\2\u00c7\u00c8\t\7\2\2\u00c8D\3\2\2\2\t\2w|\u0082\u0088\u00b7\u00c1"+
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