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
		MUT=17, TO_STRING=18, TO_OWNED=19, NUMBER=20, FLOAT=21, STRING=22, ID=23, 
		PUNTO=24, COMA=25, PTCOMA=26, DOSPUNTO=27, DPUNTO2=28, ASIGNACION=29, 
		MTHEN=30, DISTINTO=31, IGUAL=32, MAYORIGUAL=33, MENORIGUAL=34, MAYOR=35, 
		MENOR=36, MUL=37, DIV=38, ADD=39, SUB=40, MOD=41, AND=42, OR=43, NOT=44, 
		AMP=45, PARIZQ=46, PARDER=47, LLAVEIZQ=48, LLAVEDER=49, WHITESPACE=50, 
		L_COMMENT=51;
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
			"MUT", "TO_STRING", "TO_OWNED", "NUMBER", "FLOAT", "STRING", "ID", "PUNTO", 
			"COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN", "DISTINTO", 
			"IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", 
			"ADD", "SUB", "MOD", "AND", "OR", "NOT", "AMP", "PARIZQ", "PARDER", "LLAVEIZQ", 
			"LLAVEDER", "WHITESPACE", "L_COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println!'", "'i64'", "'f64'", "'String'", "'bool'", "'&str'", 
			"'if'", "'else'", "'match'", "'|'", "'true'", "'false'", "'as'", "'pow'", 
			"'powf'", "'let'", "'mut'", "'.to_string()'", "'.to_owned()'", null, 
			null, null, null, "'.'", "','", "';'", "'::'", "':'", "'='", "'=>'", 
			"'!='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", 
			"'%'", "'&&'", "'||'", "'!'", "'&'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"IF", "ELSE", "MATCH", "MTOR", "TRUE", "FALSE", "AS", "POW", "POWF", 
			"LET", "MUT", "TO_STRING", "TO_OWNED", "NUMBER", "FLOAT", "STRING", "ID", 
			"PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN", 
			"DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", 
			"DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", "AMP", "PARIZQ", "PARDER", 
			"LLAVEIZQ", "LLAVEDER", "WHITESPACE", "L_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0146\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\6\25\u00d7\n\25\r\25\16\25\u00d8\3\26\6\26\u00dc\n\26\r\26\16\26\u00dd"+
		"\3\26\3\26\6\26\u00e2\n\26\r\26\16\26\u00e3\3\27\3\27\7\27\u00e8\n\27"+
		"\f\27\16\27\u00eb\13\27\3\27\3\27\3\30\3\30\7\30\u00f1\n\30\f\30\16\30"+
		"\u00f4\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\6\63\u0133\n\63\r\63\16\63\u0134"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u013d\n\64\f\64\16\64\u0140\13\64"+
		"\3\64\3\64\3\65\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\2\3\2\n\3\2\62;\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62"+
		";C\\aac|\6\2\13\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u014b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3k\3\2\2\2\5t\3\2\2\2\7x\3\2\2"+
		"\2\t|\3\2\2\2\13\u0083\3\2\2\2\r\u0088\3\2\2\2\17\u008d\3\2\2\2\21\u0090"+
		"\3\2\2\2\23\u0095\3\2\2\2\25\u009b\3\2\2\2\27\u009d\3\2\2\2\31\u00a2\3"+
		"\2\2\2\33\u00a8\3\2\2\2\35\u00ab\3\2\2\2\37\u00af\3\2\2\2!\u00b4\3\2\2"+
		"\2#\u00b8\3\2\2\2%\u00bc\3\2\2\2\'\u00c9\3\2\2\2)\u00d6\3\2\2\2+\u00db"+
		"\3\2\2\2-\u00e5\3\2\2\2/\u00ee\3\2\2\2\61\u00f5\3\2\2\2\63\u00f7\3\2\2"+
		"\2\65\u00f9\3\2\2\2\67\u00fb\3\2\2\29\u00fe\3\2\2\2;\u0100\3\2\2\2=\u0102"+
		"\3\2\2\2?\u0105\3\2\2\2A\u0108\3\2\2\2C\u010b\3\2\2\2E\u010e\3\2\2\2G"+
		"\u0111\3\2\2\2I\u0113\3\2\2\2K\u0115\3\2\2\2M\u0117\3\2\2\2O\u0119\3\2"+
		"\2\2Q\u011b\3\2\2\2S\u011d\3\2\2\2U\u011f\3\2\2\2W\u0122\3\2\2\2Y\u0125"+
		"\3\2\2\2[\u0127\3\2\2\2]\u0129\3\2\2\2_\u012b\3\2\2\2a\u012d\3\2\2\2c"+
		"\u012f\3\2\2\2e\u0132\3\2\2\2g\u0138\3\2\2\2i\u0143\3\2\2\2kl\7r\2\2l"+
		"m\7t\2\2mn\7k\2\2no\7p\2\2op\7v\2\2pq\7n\2\2qr\7p\2\2rs\7#\2\2s\4\3\2"+
		"\2\2tu\7k\2\2uv\78\2\2vw\7\66\2\2w\6\3\2\2\2xy\7h\2\2yz\78\2\2z{\7\66"+
		"\2\2{\b\3\2\2\2|}\7U\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7k\2\2\u0080\u0081"+
		"\7p\2\2\u0081\u0082\7i\2\2\u0082\n\3\2\2\2\u0083\u0084\7d\2\2\u0084\u0085"+
		"\7q\2\2\u0085\u0086\7q\2\2\u0086\u0087\7n\2\2\u0087\f\3\2\2\2\u0088\u0089"+
		"\7(\2\2\u0089\u008a\7u\2\2\u008a\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c"+
		"\16\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7h\2\2\u008f\20\3\2\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2"+
		"\u0094\22\3\2\2\2\u0095\u0096\7o\2\2\u0096\u0097\7c\2\2\u0097\u0098\7"+
		"v\2\2\u0098\u0099\7e\2\2\u0099\u009a\7j\2\2\u009a\24\3\2\2\2\u009b\u009c"+
		"\7~\2\2\u009c\26\3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f\u00a0"+
		"\7w\2\2\u00a0\u00a1\7g\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4"+
		"\7c\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\32\3\2\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7u\2\2\u00aa\34\3\2\2\2\u00ab"+
		"\u00ac\7r\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7y\2\2\u00ae\36\3\2\2\2\u00af"+
		"\u00b0\7r\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7y\2\2\u00b2\u00b3\7h\2\2"+
		"\u00b3 \3\2\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7v\2"+
		"\2\u00b7\"\3\2\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7"+
		"v\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd\u00be\7v\2\2\u00be\u00bf"+
		"\7q\2\2\u00bf\u00c0\7a\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7i\2\2"+
		"\u00c6\u00c7\7*\2\2\u00c7\u00c8\7+\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7\60"+
		"\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7a\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7f\2\2\u00d2\u00d3\7*\2\2\u00d3\u00d4\7+\2\2\u00d4(\3\2\2\2\u00d5"+
		"\u00d7\t\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9*\3\2\2\2\u00da\u00dc\t\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\t\3\2\2\u00e0\u00e2\t\2\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		",\3\2\2\2\u00e5\u00e9\7$\2\2\u00e6\u00e8\n\4\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7$\2\2\u00ed.\3\2\2\2\u00ee\u00f2"+
		"\t\5\2\2\u00ef\u00f1\t\6\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\60\3\2\2\2\u00f4\u00f2\3\2\2"+
		"\2\u00f5\u00f6\7\60\2\2\u00f6\62\3\2\2\2\u00f7\u00f8\7.\2\2\u00f8\64\3"+
		"\2\2\2\u00f9\u00fa\7=\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7<\2\2\u00fc\u00fd"+
		"\7<\2\2\u00fd8\3\2\2\2\u00fe\u00ff\7<\2\2\u00ff:\3\2\2\2\u0100\u0101\7"+
		"?\2\2\u0101<\3\2\2\2\u0102\u0103\7?\2\2\u0103\u0104\7@\2\2\u0104>\3\2"+
		"\2\2\u0105\u0106\7#\2\2\u0106\u0107\7?\2\2\u0107@\3\2\2\2\u0108\u0109"+
		"\7?\2\2\u0109\u010a\7?\2\2\u010aB\3\2\2\2\u010b\u010c\7@\2\2\u010c\u010d"+
		"\7?\2\2\u010dD\3\2\2\2\u010e\u010f\7>\2\2\u010f\u0110\7?\2\2\u0110F\3"+
		"\2\2\2\u0111\u0112\7@\2\2\u0112H\3\2\2\2\u0113\u0114\7>\2\2\u0114J\3\2"+
		"\2\2\u0115\u0116\7,\2\2\u0116L\3\2\2\2\u0117\u0118\7\61\2\2\u0118N\3\2"+
		"\2\2\u0119\u011a\7-\2\2\u011aP\3\2\2\2\u011b\u011c\7/\2\2\u011cR\3\2\2"+
		"\2\u011d\u011e\7\'\2\2\u011eT\3\2\2\2\u011f\u0120\7(\2\2\u0120\u0121\7"+
		"(\2\2\u0121V\3\2\2\2\u0122\u0123\7~\2\2\u0123\u0124\7~\2\2\u0124X\3\2"+
		"\2\2\u0125\u0126\7#\2\2\u0126Z\3\2\2\2\u0127\u0128\7(\2\2\u0128\\\3\2"+
		"\2\2\u0129\u012a\7*\2\2\u012a^\3\2\2\2\u012b\u012c\7+\2\2\u012c`\3\2\2"+
		"\2\u012d\u012e\7}\2\2\u012eb\3\2\2\2\u012f\u0130\7\177\2\2\u0130d\3\2"+
		"\2\2\u0131\u0133\t\7\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b\63"+
		"\2\2\u0137f\3\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a\7\61\2\2\u013a\u013e"+
		"\3\2\2\2\u013b\u013d\n\b\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0142\b\64\2\2\u0142h\3\2\2\2\u0143\u0144\7^\2\2\u0144\u0145"+
		"\t\t\2\2\u0145j\3\2\2\2\n\2\u00d8\u00dd\u00e3\u00e9\u00f2\u0134\u013e"+
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