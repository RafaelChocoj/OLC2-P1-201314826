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
		NUMBER=8, FLOAT=9, STRING=10, PUNTO=11, PTCOMA=12, IGUAL=13, MAYORIGUAL=14, 
		MENORIGUAL=15, MAYOR=16, MENOR=17, MUL=18, DIV=19, ADD=20, SUB=21, PARIZQ=22, 
		PARDER=23, LLAVEIZQ=24, LLAVEDER=25, WHITESPACE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", "AS", 
			"NUMBER", "FLOAT", "STRING", "PUNTO", "PTCOMA", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'string'", "'true'", "'false'", 
			"'as'", null, null, null, "'.'", "';'", "'='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "TRUE", "FALSE", 
			"AS", "NUMBER", "FLOAT", "STRING", "PUNTO", "PTCOMA", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "PARIZQ", 
			"PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\6\ta\n\t\r\t\16\t"+
		"b\3\n\6\nf\n\n\r\n\16\ng\3\n\3\n\6\nl\n\n\r\n\16\nm\3\13\3\13\7\13r\n"+
		"\13\f\13\16\13u\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33\u009a\n\33"+
		"\r\33\16\33\u009b\3\33\3\33\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\2\3\2\7\3\2\62;\3\2\60\60\3\2$$"+
		"\6\2\13\f\17\17\"\"^^\t\2\"#%%--/\60<<BB]_\2\u00a5\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\39\3\2\2\2\5B\3\2\2\2\7F\3\2\2\2\tJ\3\2\2\2\13Q\3"+
		"\2\2\2\rV\3\2\2\2\17\\\3\2\2\2\21`\3\2\2\2\23e\3\2\2\2\25o\3\2\2\2\27"+
		"x\3\2\2\2\31z\3\2\2\2\33|\3\2\2\2\35~\3\2\2\2\37\u0081\3\2\2\2!\u0084"+
		"\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u008a\3\2\2\2)\u008c\3\2\2\2"+
		"+\u008e\3\2\2\2-\u0090\3\2\2\2/\u0092\3\2\2\2\61\u0094\3\2\2\2\63\u0096"+
		"\3\2\2\2\65\u0099\3\2\2\2\67\u009f\3\2\2\29:\7r\2\2:;\7t\2\2;<\7k\2\2"+
		"<=\7p\2\2=>\7v\2\2>?\7n\2\2?@\7p\2\2@A\7#\2\2A\4\3\2\2\2BC\7k\2\2CD\7"+
		"8\2\2DE\7\66\2\2E\6\3\2\2\2FG\7h\2\2GH\78\2\2HI\7\66\2\2I\b\3\2\2\2JK"+
		"\7u\2\2KL\7v\2\2LM\7t\2\2MN\7k\2\2NO\7p\2\2OP\7i\2\2P\n\3\2\2\2QR\7v\2"+
		"\2RS\7t\2\2ST\7w\2\2TU\7g\2\2U\f\3\2\2\2VW\7h\2\2WX\7c\2\2XY\7n\2\2YZ"+
		"\7u\2\2Z[\7g\2\2[\16\3\2\2\2\\]\7c\2\2]^\7u\2\2^\20\3\2\2\2_a\t\2\2\2"+
		"`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\22\3\2\2\2df\t\2\2\2ed\3\2\2"+
		"\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\t\3\2\2jl\t\2\2\2kj\3\2\2"+
		"\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\24\3\2\2\2os\7$\2\2pr\n\4\2\2qp\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7$\2\2w\26\3"+
		"\2\2\2xy\7\60\2\2y\30\3\2\2\2z{\7=\2\2{\32\3\2\2\2|}\7?\2\2}\34\3\2\2"+
		"\2~\177\7@\2\2\177\u0080\7?\2\2\u0080\36\3\2\2\2\u0081\u0082\7>\2\2\u0082"+
		"\u0083\7?\2\2\u0083 \3\2\2\2\u0084\u0085\7@\2\2\u0085\"\3\2\2\2\u0086"+
		"\u0087\7>\2\2\u0087$\3\2\2\2\u0088\u0089\7,\2\2\u0089&\3\2\2\2\u008a\u008b"+
		"\7\61\2\2\u008b(\3\2\2\2\u008c\u008d\7-\2\2\u008d*\3\2\2\2\u008e\u008f"+
		"\7/\2\2\u008f,\3\2\2\2\u0090\u0091\7*\2\2\u0091.\3\2\2\2\u0092\u0093\7"+
		"+\2\2\u0093\60\3\2\2\2\u0094\u0095\7}\2\2\u0095\62\3\2\2\2\u0096\u0097"+
		"\7\177\2\2\u0097\64\3\2\2\2\u0098\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\b\33\2\2\u009e\66\3\2\2\2\u009f\u00a0\7^\2\2\u00a0\u00a1"+
		"\t\6\2\2\u00a18\3\2\2\2\b\2bgms\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}