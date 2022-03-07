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
		PRINT_CON=1, T_NUMBER=2, T_FLOAT=3, T_STRING=4, T_BOOL=5, T_STR=6, TRUE=7, 
		FALSE=8, AS=9, POW=10, POWF=11, LET=12, MUT=13, TO_STRING=14, TO_OWNED=15, 
		NUMBER=16, FLOAT=17, STRING=18, ID=19, PUNTO=20, COMA=21, PTCOMA=22, DOSPUNTO=23, 
		DPUNTO2=24, ASIGNACION=25, DISTINTO=26, IGUAL=27, MAYORIGUAL=28, MENORIGUAL=29, 
		MAYOR=30, MENOR=31, MUL=32, DIV=33, ADD=34, SUB=35, MOD=36, AND=37, OR=38, 
		NOT=39, AMP=40, PARIZQ=41, PARDER=42, LLAVEIZQ=43, LLAVEDER=44, WHITESPACE=45, 
		L_COMMENT=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "TRUE", 
			"FALSE", "AS", "POW", "POWF", "LET", "MUT", "TO_STRING", "TO_OWNED", 
			"NUMBER", "FLOAT", "STRING", "ID", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", 
			"DPUNTO2", "ASIGNACION", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", 
			"AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "L_COMMENT", 
			"ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", "'mut'", "'.to_string()'", 
			"'.to_owned()'", null, null, null, null, "'.'", "','", "';'", "'::'", 
			"':'", "'='", "'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", 
			"'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "TO_STRING", "TO_OWNED", 
			"NUMBER", "FLOAT", "STRING", "ID", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", 
			"DPUNTO2", "ASIGNACION", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", 
			"AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", "L_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0129\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\6\21\u00bd\n\21\r\21\16\21\u00be\3\22\6\22\u00c2\n\22"+
		"\r\22\16\22\u00c3\3\22\3\22\6\22\u00c8\n\22\r\22\16\22\u00c9\3\23\3\23"+
		"\7\23\u00ce\n\23\f\23\16\23\u00d1\13\23\3\23\3\23\3\24\3\24\7\24\u00d7"+
		"\n\24\f\24\16\24\u00da\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\6.\u0116\n.\r.\16"+
		".\u0117\3.\3.\3/\3/\3/\3/\7/\u0120\n/\f/\16/\u0123\13/\3/\3/\3\60\3\60"+
		"\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2\3\2\n\3\2\62;"+
		"\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f"+
		"\f\17\17\t\2\"#%%--/\60<<BB]_\2\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\3a\3\2\2\2\5j\3\2\2\2\7n\3\2\2\2\tr\3\2\2\2\13y\3"+
		"\2\2\2\r~\3\2\2\2\17\u0083\3\2\2\2\21\u0088\3\2\2\2\23\u008e\3\2\2\2\25"+
		"\u0091\3\2\2\2\27\u0095\3\2\2\2\31\u009a\3\2\2\2\33\u009e\3\2\2\2\35\u00a2"+
		"\3\2\2\2\37\u00af\3\2\2\2!\u00bc\3\2\2\2#\u00c1\3\2\2\2%\u00cb\3\2\2\2"+
		"\'\u00d4\3\2\2\2)\u00db\3\2\2\2+\u00dd\3\2\2\2-\u00df\3\2\2\2/\u00e1\3"+
		"\2\2\2\61\u00e4\3\2\2\2\63\u00e6\3\2\2\2\65\u00e8\3\2\2\2\67\u00eb\3\2"+
		"\2\29\u00ee\3\2\2\2;\u00f1\3\2\2\2=\u00f4\3\2\2\2?\u00f6\3\2\2\2A\u00f8"+
		"\3\2\2\2C\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u00fe\3\2\2\2I\u0100\3\2\2\2K"+
		"\u0102\3\2\2\2M\u0105\3\2\2\2O\u0108\3\2\2\2Q\u010a\3\2\2\2S\u010c\3\2"+
		"\2\2U\u010e\3\2\2\2W\u0110\3\2\2\2Y\u0112\3\2\2\2[\u0115\3\2\2\2]\u011b"+
		"\3\2\2\2_\u0126\3\2\2\2ab\7r\2\2bc\7t\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2f"+
		"g\7n\2\2gh\7p\2\2hi\7#\2\2i\4\3\2\2\2jk\7k\2\2kl\78\2\2lm\7\66\2\2m\6"+
		"\3\2\2\2no\7h\2\2op\78\2\2pq\7\66\2\2q\b\3\2\2\2rs\7U\2\2st\7v\2\2tu\7"+
		"t\2\2uv\7k\2\2vw\7p\2\2wx\7i\2\2x\n\3\2\2\2yz\7d\2\2z{\7q\2\2{|\7q\2\2"+
		"|}\7n\2\2}\f\3\2\2\2~\177\7(\2\2\177\u0080\7u\2\2\u0080\u0081\7v\2\2\u0081"+
		"\u0082\7t\2\2\u0082\16\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7w\2\2\u0086\u0087\7g\2\2\u0087\20\3\2\2\2\u0088\u0089\7h\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2"+
		"\u008d\22\3\2\2\2\u008e\u008f\7c\2\2\u008f\u0090\7u\2\2\u0090\24\3\2\2"+
		"\2\u0091\u0092\7r\2\2\u0092\u0093\7q\2\2\u0093\u0094\7y\2\2\u0094\26\3"+
		"\2\2\2\u0095\u0096\7r\2\2\u0096\u0097\7q\2\2\u0097\u0098\7y\2\2\u0098"+
		"\u0099\7h\2\2\u0099\30\3\2\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7v\2\2\u009d\32\3\2\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7w\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7\60\2\2\u00a3\u00a4\7v\2\2"+
		"\u00a4\u00a5\7q\2\2\u00a5\u00a6\7a\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"\u00ac\7i\2\2\u00ac\u00ad\7*\2\2\u00ad\u00ae\7+\2\2\u00ae\36\3\2\2\2\u00af"+
		"\u00b0\7\60\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7a\2"+
		"\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7*\2\2\u00b9\u00ba\7+\2\2\u00ba"+
		" \3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\"\3\2\2\2\u00c0\u00c2\t"+
		"\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\t\3\2\2\u00c6\u00c8\t\2"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca$\3\2\2\2\u00cb\u00cf\7$\2\2\u00cc\u00ce\n\4\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3"+
		"&\3\2\2\2\u00d4\u00d8\t\5\2\2\u00d5\u00d7\t\6\2\2\u00d6\u00d5\3\2\2\2"+
		"\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9(\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc*\3\2\2\2\u00dd\u00de"+
		"\7.\2\2\u00de,\3\2\2\2\u00df\u00e0\7=\2\2\u00e0.\3\2\2\2\u00e1\u00e2\7"+
		"<\2\2\u00e2\u00e3\7<\2\2\u00e3\60\3\2\2\2\u00e4\u00e5\7<\2\2\u00e5\62"+
		"\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7\64\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9"+
		"\u00ea\7?\2\2\u00ea\66\3\2\2\2\u00eb\u00ec\7?\2\2\u00ec\u00ed\7?\2\2\u00ed"+
		"8\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\7?\2\2\u00f0:\3\2\2\2\u00f1\u00f2"+
		"\7>\2\2\u00f2\u00f3\7?\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5>\3"+
		"\2\2\2\u00f6\u00f7\7>\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9B\3\2"+
		"\2\2\u00fa\u00fb\7\61\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7-\2\2\u00fdF\3\2"+
		"\2\2\u00fe\u00ff\7/\2\2\u00ffH\3\2\2\2\u0100\u0101\7\'\2\2\u0101J\3\2"+
		"\2\2\u0102\u0103\7(\2\2\u0103\u0104\7(\2\2\u0104L\3\2\2\2\u0105\u0106"+
		"\7~\2\2\u0106\u0107\7~\2\2\u0107N\3\2\2\2\u0108\u0109\7#\2\2\u0109P\3"+
		"\2\2\2\u010a\u010b\7(\2\2\u010bR\3\2\2\2\u010c\u010d\7*\2\2\u010dT\3\2"+
		"\2\2\u010e\u010f\7+\2\2\u010fV\3\2\2\2\u0110\u0111\7}\2\2\u0111X\3\2\2"+
		"\2\u0112\u0113\7\177\2\2\u0113Z\3\2\2\2\u0114\u0116\t\7\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\b.\2\2\u011a\\\3\2\2\2\u011b\u011c\7\61\2\2"+
		"\u011c\u011d\7\61\2\2\u011d\u0121\3\2\2\2\u011e\u0120\n\b\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\b/\2\2\u0125^\3\2\2\2\u0126"+
		"\u0127\7^\2\2\u0127\u0128\t\t\2\2\u0128`\3\2\2\2\n\2\u00be\u00c3\u00c9"+
		"\u00cf\u00d8\u0117\u0121\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}