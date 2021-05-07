// Generated from R.g4 by ANTLR 4.9.2
package com.eco.bio7.reditor.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, RAW_STRING=54, HEX=55, INT=56, FLOAT=57, COMPLEX=58, STRING=59, 
		ID=60, USER_OP=61, POWER_OP=62, NL=63, WS=64, UNKNOWN=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "RAW_STRING", "INNER_RAW_STRING", 
			"HEX", "INT", "HEXDIGIT", "FLOAT", "DIGIT", "EXP", "COMPLEX", "STRING", 
			"ESC", "UNICODE_ESCAPE", "OCTAL_ESCAPE", "HEX_ESCAPE", "ID", "LETTER", 
			"USER_OP", "COMMENT", "POWER_OP", "NL", "WS", "UNKNOWN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'[['", "']'", "'['", "'::'", "':::'", "'$'", "'@'", "'-'", 
			"'+'", "':'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", 
			"'!'", "'&'", "'&&'", "'|'", "'||'", "'~'", "'<-'", "'<<-'", "'='", "'->'", 
			"'->>'", "':='", "'{'", "'}'", "'function'", "'('", "')'", "'if'", "'else'", 
			"'for'", "'in'", "'while'", "'repeat'", "'?'", "'next'", "'break'", "'NULL'", 
			"'NA'", "'Inf'", "'NaN'", "'TRUE'", "'FALSE'", "','", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "RAW_STRING", "HEX", "INT", "FLOAT", 
			"COMPLEX", "STRING", "ID", "USER_OP", "POWER_OP", "NL", "WS", "UNKNOWN"
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


		
		public static boolean skipwhitespace = true;
		


	public RLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "R.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u023b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\78"+
		"\u014f\n8\f8\168\u0152\138\38\38\38\78\u0157\n8\f8\168\u015a\138\38\3"+
		"8\38\78\u015f\n8\f8\168\u0162\138\38\58\u0165\n8\39\39\39\69\u016a\n9"+
		"\r9\169\u016b\39\59\u016f\n9\3:\6:\u0172\n:\r:\16:\u0173\3:\5:\u0177\n"+
		":\3;\3;\3<\6<\u017c\n<\r<\16<\u017d\3<\3<\7<\u0182\n<\f<\16<\u0185\13"+
		"<\3<\5<\u0188\n<\3<\5<\u018b\n<\3<\6<\u018e\n<\r<\16<\u018f\3<\5<\u0193"+
		"\n<\3<\5<\u0196\n<\3<\3<\6<\u019a\n<\r<\16<\u019b\3<\5<\u019f\n<\3<\5"+
		"<\u01a2\n<\5<\u01a4\n<\3=\3=\3>\3>\5>\u01aa\n>\3>\3>\3?\3?\3?\3?\3?\3"+
		"?\5?\u01b4\n?\3@\3@\3@\7@\u01b9\n@\f@\16@\u01bc\13@\3@\3@\3@\3@\7@\u01c2"+
		"\n@\f@\16@\u01c5\13@\3@\3@\3@\3@\7@\u01cb\n@\f@\16@\u01ce\13@\3@\5@\u01d1"+
		"\n@\3A\3A\3A\3A\3A\5A\u01d8\nA\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\5B\u01ea\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u01f5\nC\3D\3D\3D"+
		"\5D\u01fa\nD\3E\3E\3E\5E\u01ff\nE\3E\3E\3E\7E\u0204\nE\fE\16E\u0207\13"+
		"E\3E\3E\3E\3E\7E\u020d\nE\fE\16E\u0210\13E\3E\5E\u0213\nE\3F\3F\3G\3G"+
		"\7G\u0219\nG\fG\16G\u021c\13G\3G\3G\3H\3H\7H\u0222\nH\fH\16H\u0225\13"+
		"H\3H\3H\3I\3I\3I\5I\u022c\nI\3J\5J\u022f\nJ\3J\3J\3K\6K\u0234\nK\rK\16"+
		"K\u0235\3K\3K\3L\3L\t\u0150\u0158\u0160\u01ba\u01c3\u01cc\u021a\2M\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o\2q9"+
		"s:u\2w;y\2{\2}<\177=\u0081\2\u0083\2\u0085\2\u0087\2\u0089>\u008b\2\u008d"+
		"?\u008f\2\u0091@\u0093A\u0095B\u0097C\3\2\21\4\2TTtt\4\2ZZzz\4\2NNnn\5"+
		"\2\62;CHch\4\2GGgg\4\2--//\4\2$$^^\4\2))^^\13\2$$))^^cdhhppttvvxx\3\2"+
		"\62\65\3\2\629\4\2\60\60aa\4\2C\\c|\4\2\f\f\17\17\4\2\13\13\"\"\2\u0266"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2w\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0089\3"+
		"\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2"+
		"\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u0099\3\2\2\2\5\u009b\3\2\2\2\7\u009e"+
		"\3\2\2\2\t\u00a0\3\2\2\2\13\u00a2\3\2\2\2\r\u00a5\3\2\2\2\17\u00a9\3\2"+
		"\2\2\21\u00ab\3\2\2\2\23\u00ad\3\2\2\2\25\u00af\3\2\2\2\27\u00b1\3\2\2"+
		"\2\31\u00b3\3\2\2\2\33\u00b5\3\2\2\2\35\u00b7\3\2\2\2\37\u00b9\3\2\2\2"+
		"!\u00bc\3\2\2\2#\u00be\3\2\2\2%\u00c1\3\2\2\2\'\u00c4\3\2\2\2)\u00c7\3"+
		"\2\2\2+\u00c9\3\2\2\2-\u00cb\3\2\2\2/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63"+
		"\u00d3\3\2\2\2\65\u00d5\3\2\2\2\67\u00d8\3\2\2\29\u00dc\3\2\2\2;\u00de"+
		"\3\2\2\2=\u00e1\3\2\2\2?\u00e5\3\2\2\2A\u00e8\3\2\2\2C\u00ea\3\2\2\2E"+
		"\u00ec\3\2\2\2G\u00f5\3\2\2\2I\u00f7\3\2\2\2K\u00f9\3\2\2\2M\u00fc\3\2"+
		"\2\2O\u0101\3\2\2\2Q\u0105\3\2\2\2S\u0108\3\2\2\2U\u010e\3\2\2\2W\u0115"+
		"\3\2\2\2Y\u0117\3\2\2\2[\u011c\3\2\2\2]\u0122\3\2\2\2_\u0127\3\2\2\2a"+
		"\u012a\3\2\2\2c\u012e\3\2\2\2e\u0132\3\2\2\2g\u0137\3\2\2\2i\u013d\3\2"+
		"\2\2k\u013f\3\2\2\2m\u0143\3\2\2\2o\u0164\3\2\2\2q\u0166\3\2\2\2s\u0171"+
		"\3\2\2\2u\u0178\3\2\2\2w\u01a3\3\2\2\2y\u01a5\3\2\2\2{\u01a7\3\2\2\2}"+
		"\u01b3\3\2\2\2\177\u01d0\3\2\2\2\u0081\u01d7\3\2\2\2\u0083\u01e9\3\2\2"+
		"\2\u0085\u01f4\3\2\2\2\u0087\u01f6\3\2\2\2\u0089\u0212\3\2\2\2\u008b\u0214"+
		"\3\2\2\2\u008d\u0216\3\2\2\2\u008f\u021f\3\2\2\2\u0091\u022b\3\2\2\2\u0093"+
		"\u022e\3\2\2\2\u0095\u0233\3\2\2\2\u0097\u0239\3\2\2\2\u0099\u009a\7="+
		"\2\2\u009a\4\3\2\2\2\u009b\u009c\7]\2\2\u009c\u009d\7]\2\2\u009d\6\3\2"+
		"\2\2\u009e\u009f\7_\2\2\u009f\b\3\2\2\2\u00a0\u00a1\7]\2\2\u00a1\n\3\2"+
		"\2\2\u00a2\u00a3\7<\2\2\u00a3\u00a4\7<\2\2\u00a4\f\3\2\2\2\u00a5\u00a6"+
		"\7<\2\2\u00a6\u00a7\7<\2\2\u00a7\u00a8\7<\2\2\u00a8\16\3\2\2\2\u00a9\u00aa"+
		"\7&\2\2\u00aa\20\3\2\2\2\u00ab\u00ac\7B\2\2\u00ac\22\3\2\2\2\u00ad\u00ae"+
		"\7/\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7-\2\2\u00b0\26\3\2\2\2\u00b1\u00b2"+
		"\7<\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4\32\3\2\2\2\u00b5\u00b6"+
		"\7\61\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8\36\3\2\2\2\u00b9\u00ba"+
		"\7@\2\2\u00ba\u00bb\7?\2\2\u00bb \3\2\2\2\u00bc\u00bd\7>\2\2\u00bd\"\3"+
		"\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7?\2\2\u00c0$\3\2\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2\u00c3\7?\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6"+
		"\7?\2\2\u00c6(\3\2\2\2\u00c7\u00c8\7#\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7"+
		"(\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7(\2\2\u00cd.\3\2"+
		"\2\2\u00ce\u00cf\7~\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7~\2\2\u00d1\u00d2"+
		"\7~\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7\u0080\2\2\u00d4\64\3\2\2\2\u00d5"+
		"\u00d6\7>\2\2\u00d6\u00d7\7/\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9"+
		"\u00da\7>\2\2\u00da\u00db\7/\2\2\u00db8\3\2\2\2\u00dc\u00dd\7?\2\2\u00dd"+
		":\3\2\2\2\u00de\u00df\7/\2\2\u00df\u00e0\7@\2\2\u00e0<\3\2\2\2\u00e1\u00e2"+
		"\7/\2\2\u00e2\u00e3\7@\2\2\u00e3\u00e4\7@\2\2\u00e4>\3\2\2\2\u00e5\u00e6"+
		"\7<\2\2\u00e6\u00e7\7?\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7}\2\2\u00e9B\3"+
		"\2\2\2\u00ea\u00eb\7\177\2\2\u00ebD\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee"+
		"\7w\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7v\2\2\u00f1"+
		"\u00f2\7k\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4F\3\2\2\2\u00f5"+
		"\u00f6\7*\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8J\3\2\2\2\u00f9\u00fa"+
		"\7k\2\2\u00fa\u00fb\7h\2\2\u00fbL\3\2\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe"+
		"\7n\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100N\3\2\2\2\u0101\u0102"+
		"\7h\2\2\u0102\u0103\7q\2\2\u0103\u0104\7t\2\2\u0104P\3\2\2\2\u0105\u0106"+
		"\7k\2\2\u0106\u0107\7p\2\2\u0107R\3\2\2\2\u0108\u0109\7y\2\2\u0109\u010a"+
		"\7j\2\2\u010a\u010b\7k\2\2\u010b\u010c\7n\2\2\u010c\u010d\7g\2\2\u010d"+
		"T\3\2\2\2\u010e\u010f\7t\2\2\u010f\u0110\7g\2\2\u0110\u0111\7r\2\2\u0111"+
		"\u0112\7g\2\2\u0112\u0113\7c\2\2\u0113\u0114\7v\2\2\u0114V\3\2\2\2\u0115"+
		"\u0116\7A\2\2\u0116X\3\2\2\2\u0117\u0118\7p\2\2\u0118\u0119\7g\2\2\u0119"+
		"\u011a\7z\2\2\u011a\u011b\7v\2\2\u011bZ\3\2\2\2\u011c\u011d\7d\2\2\u011d"+
		"\u011e\7t\2\2\u011e\u011f\7g\2\2\u011f\u0120\7c\2\2\u0120\u0121\7m\2\2"+
		"\u0121\\\3\2\2\2\u0122\u0123\7P\2\2\u0123\u0124\7W\2\2\u0124\u0125\7N"+
		"\2\2\u0125\u0126\7N\2\2\u0126^\3\2\2\2\u0127\u0128\7P\2\2\u0128\u0129"+
		"\7C\2\2\u0129`\3\2\2\2\u012a\u012b\7K\2\2\u012b\u012c\7p\2\2\u012c\u012d"+
		"\7h\2\2\u012db\3\2\2\2\u012e\u012f\7P\2\2\u012f\u0130\7c\2\2\u0130\u0131"+
		"\7P\2\2\u0131d\3\2\2\2\u0132\u0133\7V\2\2\u0133\u0134\7T\2\2\u0134\u0135"+
		"\7W\2\2\u0135\u0136\7G\2\2\u0136f\3\2\2\2\u0137\u0138\7H\2\2\u0138\u0139"+
		"\7C\2\2\u0139\u013a\7N\2\2\u013a\u013b\7U\2\2\u013b\u013c\7G\2\2\u013c"+
		"h\3\2\2\2\u013d\u013e\7.\2\2\u013ej\3\2\2\2\u013f\u0140\7\60\2\2\u0140"+
		"\u0141\7\60\2\2\u0141\u0142\7\60\2\2\u0142l\3\2\2\2\u0143\u0144\t\2\2"+
		"\2\u0144\u0145\7$\2\2\u0145\u0146\5o8\2\u0146\u0147\7$\2\2\u0147n\3\2"+
		"\2\2\u0148\u0149\7/\2\2\u0149\u014a\5o8\2\u014a\u014b\7/\2\2\u014b\u0165"+
		"\3\2\2\2\u014c\u0150\7*\2\2\u014d\u014f\13\2\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0165\7+\2\2\u0154\u0158\7}\2\2\u0155\u0157"+
		"\13\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0159\3\2\2\2"+
		"\u0158\u0156\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u0165"+
		"\7\177\2\2\u015c\u0160\7]\2\2\u015d\u015f\13\2\2\2\u015e\u015d\3\2\2\2"+
		"\u015f\u0162\3\2\2\2\u0160\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0165\7_\2\2\u0164\u0148\3\2\2\2\u0164"+
		"\u014c\3\2\2\2\u0164\u0154\3\2\2\2\u0164\u015c\3\2\2\2\u0165p\3\2\2\2"+
		"\u0166\u0167\7\62\2\2\u0167\u0169\t\3\2\2\u0168\u016a\5u;\2\u0169\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016f\t\4\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016fr\3\2\2\2\u0170\u0172\5y=\2\u0171\u0170\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0177\t\4\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177t\3\2\2\2"+
		"\u0178\u0179\t\5\2\2\u0179v\3\2\2\2\u017a\u017c\5y=\2\u017b\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0183\7\60\2\2\u0180\u0182\5y=\2\u0181\u0180\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\5{>\2\u0187\u0186\3\2\2"+
		"\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u018b\t\4\2\2\u018a\u0189"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u01a4\3\2\2\2\u018c\u018e\5y=\2\u018d"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0192\3\2\2\2\u0191\u0193\5{>\2\u0192\u0191\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0196\t\4\2\2\u0195\u0194\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u01a4\3\2\2\2\u0197\u0199\7\60\2\2\u0198\u019a\5"+
		"y=\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f\5{>\2\u019e\u019d\3\2\2"+
		"\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\t\4\2\2\u01a1\u01a0"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u017b\3\2\2\2\u01a3"+
		"\u018d\3\2\2\2\u01a3\u0197\3\2\2\2\u01a4x\3\2\2\2\u01a5\u01a6\4\62;\2"+
		"\u01a6z\3\2\2\2\u01a7\u01a9\t\6\2\2\u01a8\u01aa\t\7\2\2\u01a9\u01a8\3"+
		"\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\5s:\2\u01ac"+
		"|\3\2\2\2\u01ad\u01ae\5s:\2\u01ae\u01af\7k\2\2\u01af\u01b4\3\2\2\2\u01b0"+
		"\u01b1\5w<\2\u01b1\u01b2\7k\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01ad\3\2\2"+
		"\2\u01b3\u01b0\3\2\2\2\u01b4~\3\2\2\2\u01b5\u01ba\7$\2\2\u01b6\u01b9\5"+
		"\u0081A\2\u01b7\u01b9\n\b\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2"+
		"\u01b9\u01bc\3\2\2\2\u01ba\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd"+
		"\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01d1\7$\2\2\u01be\u01c3\7)\2\2\u01bf"+
		"\u01c2\5\u0081A\2\u01c0\u01c2\n\t\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0"+
		"\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01d1\7)\2\2\u01c7\u01cc\7b\2"+
		"\2\u01c8\u01cb\5\u0081A\2\u01c9\u01cb\n\t\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\7b\2\2\u01d0"+
		"\u01b5\3\2\2\2\u01d0\u01be\3\2\2\2\u01d0\u01c7\3\2\2\2\u01d1\u0080\3\2"+
		"\2\2\u01d2\u01d3\7^\2\2\u01d3\u01d8\t\n\2\2\u01d4\u01d8\5\u0083B\2\u01d5"+
		"\u01d8\5\u0087D\2\u01d6\u01d8\5\u0085C\2\u01d7\u01d2\3\2\2\2\u01d7\u01d4"+
		"\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u0082\3\2\2\2\u01d9"+
		"\u01da\7^\2\2\u01da\u01db\7w\2\2\u01db\u01dc\5u;\2\u01dc\u01dd\5u;\2\u01dd"+
		"\u01de\5u;\2\u01de\u01df\5u;\2\u01df\u01ea\3\2\2\2\u01e0\u01e1\7^\2\2"+
		"\u01e1\u01e2\7w\2\2\u01e2\u01e3\7}\2\2\u01e3\u01e4\5u;\2\u01e4\u01e5\5"+
		"u;\2\u01e5\u01e6\5u;\2\u01e6\u01e7\5u;\2\u01e7\u01e8\7\177\2\2\u01e8\u01ea"+
		"\3\2\2\2\u01e9\u01d9\3\2\2\2\u01e9\u01e0\3\2\2\2\u01ea\u0084\3\2\2\2\u01eb"+
		"\u01ec\7^\2\2\u01ec\u01ed\t\13\2\2\u01ed\u01ee\t\f\2\2\u01ee\u01f5\t\f"+
		"\2\2\u01ef\u01f0\7^\2\2\u01f0\u01f1\t\f\2\2\u01f1\u01f5\t\f\2\2\u01f2"+
		"\u01f3\7^\2\2\u01f3\u01f5\t\f\2\2\u01f4\u01eb\3\2\2\2\u01f4\u01ef\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f5\u0086\3\2\2\2\u01f6\u01f7\7^\2\2\u01f7"+
		"\u01f9\5u;\2\u01f8\u01fa\5u;\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2"+
		"\u01fa\u0088\3\2\2\2\u01fb\u01fe\7\60\2\2\u01fc\u01ff\5\u008bF\2\u01fd"+
		"\u01ff\t\r\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0205\3\2"+
		"\2\2\u0200\u0204\5\u008bF\2\u0201\u0204\5y=\2\u0202\u0204\t\r\2\2\u0203"+
		"\u0200\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0213\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208\u020e\5\u008bF\2\u0209\u020d\5\u008bF\2\u020a\u020d"+
		"\5y=\2\u020b\u020d\t\r\2\2\u020c\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0213\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0213\7\60\2\2\u0212"+
		"\u01fb\3\2\2\2\u0212\u0208\3\2\2\2\u0212\u0211\3\2\2\2\u0213\u008a\3\2"+
		"\2\2\u0214\u0215\t\16\2\2\u0215\u008c\3\2\2\2\u0216\u021a\7\'\2\2\u0217"+
		"\u0219\13\2\2\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u021b\3"+
		"\2\2\2\u021a\u0218\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d"+
		"\u021e\7\'\2\2\u021e\u008e\3\2\2\2\u021f\u0223\7%\2\2\u0220\u0222\n\17"+
		"\2\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\bH"+
		"\2\2\u0227\u0090\3\2\2\2\u0228\u022c\7`\2\2\u0229\u022a\7,\2\2\u022a\u022c"+
		"\7,\2\2\u022b\u0228\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u0092\3\2\2\2\u022d"+
		"\u022f\7\17\2\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3"+
		"\2\2\2\u0230\u0231\7\f\2\2\u0231\u0094\3\2\2\2\u0232\u0234\t\20\2\2\u0233"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0238\bK\3\2\u0238\u0096\3\2\2\2\u0239"+
		"\u023a\13\2\2\2\u023a\u0098\3\2\2\2.\2\u0150\u0158\u0160\u0164\u016b\u016e"+
		"\u0173\u0176\u017d\u0183\u0187\u018a\u018f\u0192\u0195\u019b\u019e\u01a1"+
		"\u01a3\u01a9\u01b3\u01b8\u01ba\u01c1\u01c3\u01ca\u01cc\u01d0\u01d7\u01e9"+
		"\u01f4\u01f9\u01fe\u0203\u0205\u020c\u020e\u0212\u021a\u0223\u022b\u022e"+
		"\u0235\4\tA\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}