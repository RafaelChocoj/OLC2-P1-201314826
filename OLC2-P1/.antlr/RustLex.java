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
		ELSE=8, TRUE=9, FALSE=10, AS=11, POW=12, POWF=13, LET=14, MUT=15, TO_STRING=16, 
		TO_OWNED=17, NUMBER=18, FLOAT=19, STRING=20, ID=21, PUNTO=22, COMA=23, 
		PTCOMA=24, DOSPUNTO=25, DPUNTO2=26, ASIGNACION=27, DISTINTO=28, IGUAL=29, 
		MAYORIGUAL=30, MENORIGUAL=31, MAYOR=32, MENOR=33, MUL=34, DIV=35, ADD=36, 
		SUB=37, MOD=38, AND=39, OR=40, NOT=41, AMP=42, PARIZQ=43, PARDER=44, LLAVEIZQ=45, 
		LLAVEDER=46, WHITESPACE=47, L_COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "IF", 
			"ELSE", "TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "TO_STRING", 
			"TO_OWNED", "NUMBER", "FLOAT", "STRING", "ID", "PUNTO", "COMA", "PTCOMA", 
			"DOSPUNTO", "DPUNTO2", "ASIGNACION", "DISTINTO", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", 
			"OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "WHITESPACE", 
			"L_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'true'", "'false'", "'as'", "'pow'", "'powf'", "'let'", 
			"'mut'", "'.to_string()'", "'.to_owned()'", null, null, null, null, "'.'", 
			"','", "';'", "'::'", "':'", "'='", "'!='", "'=='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "TRUE", "FALSE", "AS", "POW", "POWF", "LET", "MUT", "TO_STRING", 
			"TO_OWNED", "NUMBER", "FLOAT", "STRING", "ID", "PUNTO", "COMA", "PTCOMA", 
			"DOSPUNTO", "DPUNTO2", "ASIGNACION", "DISTINTO", "IGUAL", "MAYORIGUAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0135\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\6\23\u00c9\n\23\r\23\16\23\u00ca\3\24\6\24\u00ce\n\24\r\24\16"+
		"\24\u00cf\3\24\3\24\6\24\u00d4\n\24\r\24\16\24\u00d5\3\25\3\25\7\25\u00da"+
		"\n\25\f\25\16\25\u00dd\13\25\3\25\3\25\3\26\3\26\7\26\u00e3\n\26\f\26"+
		"\16\26\u00e6\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\6\60\u0122\n\60\r\60\16\60\u0123\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\7\61\u012c\n\61\f\61\16\61\u012f\13\61\3\61"+
		"\3\61\3\62\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\2\3\2\n\3\2\62;\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13"+
		"\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u013a\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3e\3\2"+
		"\2\2\5n\3\2\2\2\7r\3\2\2\2\tv\3\2\2\2\13}\3\2\2\2\r\u0082\3\2\2\2\17\u0087"+
		"\3\2\2\2\21\u008a\3\2\2\2\23\u008f\3\2\2\2\25\u0094\3\2\2\2\27\u009a\3"+
		"\2\2\2\31\u009d\3\2\2\2\33\u00a1\3\2\2\2\35\u00a6\3\2\2\2\37\u00aa\3\2"+
		"\2\2!\u00ae\3\2\2\2#\u00bb\3\2\2\2%\u00c8\3\2\2\2\'\u00cd\3\2\2\2)\u00d7"+
		"\3\2\2\2+\u00e0\3\2\2\2-\u00e7\3\2\2\2/\u00e9\3\2\2\2\61\u00eb\3\2\2\2"+
		"\63\u00ed\3\2\2\2\65\u00f0\3\2\2\2\67\u00f2\3\2\2\29\u00f4\3\2\2\2;\u00f7"+
		"\3\2\2\2=\u00fa\3\2\2\2?\u00fd\3\2\2\2A\u0100\3\2\2\2C\u0102\3\2\2\2E"+
		"\u0104\3\2\2\2G\u0106\3\2\2\2I\u0108\3\2\2\2K\u010a\3\2\2\2M\u010c\3\2"+
		"\2\2O\u010e\3\2\2\2Q\u0111\3\2\2\2S\u0114\3\2\2\2U\u0116\3\2\2\2W\u0118"+
		"\3\2\2\2Y\u011a\3\2\2\2[\u011c\3\2\2\2]\u011e\3\2\2\2_\u0121\3\2\2\2a"+
		"\u0127\3\2\2\2c\u0132\3\2\2\2ef\7r\2\2fg\7t\2\2gh\7k\2\2hi\7p\2\2ij\7"+
		"v\2\2jk\7n\2\2kl\7p\2\2lm\7#\2\2m\4\3\2\2\2no\7k\2\2op\78\2\2pq\7\66\2"+
		"\2q\6\3\2\2\2rs\7h\2\2st\78\2\2tu\7\66\2\2u\b\3\2\2\2vw\7U\2\2wx\7v\2"+
		"\2xy\7t\2\2yz\7k\2\2z{\7p\2\2{|\7i\2\2|\n\3\2\2\2}~\7d\2\2~\177\7q\2\2"+
		"\177\u0080\7q\2\2\u0080\u0081\7n\2\2\u0081\f\3\2\2\2\u0082\u0083\7(\2"+
		"\2\u0083\u0084\7u\2\2\u0084\u0085\7v\2\2\u0085\u0086\7t\2\2\u0086\16\3"+
		"\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7h\2\2\u0089\20\3\2\2\2\u008a\u008b"+
		"\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092"+
		"\u0093\7g\2\2\u0093\24\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\26\3\2\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7u\2\2\u009c\30\3\2\2\2\u009d\u009e\7r\2\2\u009e"+
		"\u009f\7q\2\2\u009f\u00a0\7y\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2"+
		"\u00a3\7q\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7h\2\2\u00a5\34\3\2\2\2\u00a6"+
		"\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9\36\3\2\2\2\u00aa"+
		"\u00ab\7o\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7v\2\2\u00ad \3\2\2\2\u00ae"+
		"\u00af\7\60\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7a\2"+
		"\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7i\2\2\u00b8\u00b9\7*\2\2\u00b9"+
		"\u00ba\7+\2\2\u00ba\"\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc\u00bd\7v\2\2"+
		"\u00bd\u00be\7q\2\2\u00be\u00bf\7a\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1"+
		"\7y\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7f\2\2\u00c4"+
		"\u00c5\7*\2\2\u00c5\u00c6\7+\2\2\u00c6$\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb&\3\2\2\2\u00cc\u00ce\t\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\t\3\2\2\u00d2\u00d4\t\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6(\3\2\2\2\u00d7\u00db"+
		"\7$\2\2\u00d8\u00da\n\4\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\7$\2\2\u00df*\3\2\2\2\u00e0\u00e4\t\5\2\2\u00e1\u00e3"+
		"\t\6\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5,\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\60\2\2"+
		"\u00e8.\3\2\2\2\u00e9\u00ea\7.\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7=\2\2"+
		"\u00ec\62\3\2\2\2\u00ed\u00ee\7<\2\2\u00ee\u00ef\7<\2\2\u00ef\64\3\2\2"+
		"\2\u00f0\u00f1\7<\2\2\u00f1\66\3\2\2\2\u00f2\u00f3\7?\2\2\u00f38\3\2\2"+
		"\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7?\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7"+
		"?\2\2\u00f8\u00f9\7?\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7@\2\2\u00fb\u00fc"+
		"\7?\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7?\2\2\u00ff@\3"+
		"\2\2\2\u0100\u0101\7@\2\2\u0101B\3\2\2\2\u0102\u0103\7>\2\2\u0103D\3\2"+
		"\2\2\u0104\u0105\7,\2\2\u0105F\3\2\2\2\u0106\u0107\7\61\2\2\u0107H\3\2"+
		"\2\2\u0108\u0109\7-\2\2\u0109J\3\2\2\2\u010a\u010b\7/\2\2\u010bL\3\2\2"+
		"\2\u010c\u010d\7\'\2\2\u010dN\3\2\2\2\u010e\u010f\7(\2\2\u010f\u0110\7"+
		"(\2\2\u0110P\3\2\2\2\u0111\u0112\7~\2\2\u0112\u0113\7~\2\2\u0113R\3\2"+
		"\2\2\u0114\u0115\7#\2\2\u0115T\3\2\2\2\u0116\u0117\7(\2\2\u0117V\3\2\2"+
		"\2\u0118\u0119\7*\2\2\u0119X\3\2\2\2\u011a\u011b\7+\2\2\u011bZ\3\2\2\2"+
		"\u011c\u011d\7}\2\2\u011d\\\3\2\2\2\u011e\u011f\7\177\2\2\u011f^\3\2\2"+
		"\2\u0120\u0122\t\7\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b\60\2\2"+
		"\u0126`\3\2\2\2\u0127\u0128\7\61\2\2\u0128\u0129\7\61\2\2\u0129\u012d"+
		"\3\2\2\2\u012a\u012c\n\b\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0131\b\61\2\2\u0131b\3\2\2\2\u0132\u0133\7^\2\2\u0133\u0134"+
		"\t\t\2\2\u0134d\3\2\2\2\n\2\u00ca\u00cf\u00d5\u00db\u00e4\u0123\u012d"+
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