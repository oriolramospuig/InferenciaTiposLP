// Generated from c:/Users/oriol/OneDrive/Escriptori/FIB/23-24Q2/LP/PracticaOriolRamos/hm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class hmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, BARRA=2, E=3, D=4, FLETXA=5, OPER=6, ASSIGN=7, WRITE=8, TIPUSBASIC=9, 
		ID=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUM", "BARRA", "E", "D", "FLETXA", "OPER", "ASSIGN", "WRITE", "TIPUSBASIC", 
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\'", "'('", "')'", "'->'", null, "'::'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUM", "BARRA", "E", "D", "FLETXA", "OPER", "ASSIGN", "WRITE", 
			"TIPUSBASIC", "ID", "WS"
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


	public hmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "hm.g4"; }

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
		"\u0004\u0000\u000bL\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0004\u0000\u0019\b\u0000\u000b\u0000\f\u0000\u001a\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u00052\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tA\b\t\n\t\f\tD\t\t\u0001"+
		"\n\u0004\nG\b\n\u000b\n\f\nH\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u0004\u0001\u000009\u0002\u0000"+
		"AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  Q\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0001\u0018\u0001\u0000\u0000\u0000\u0003\u001c\u0001\u0000\u0000\u0000"+
		"\u0005\u001e\u0001\u0000\u0000\u0000\u0007 \u0001\u0000\u0000\u0000\t"+
		"\"\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000"+
		"\u0000\u0000\u000f6\u0001\u0000\u0000\u0000\u0011<\u0001\u0000\u0000\u0000"+
		"\u0013>\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017\u0019"+
		"\u0007\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b\u0002\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\\\u0000\u0000\u001d\u0004\u0001\u0000\u0000\u0000\u001e\u001f\u0005"+
		"(\u0000\u0000\u001f\u0006\u0001\u0000\u0000\u0000 !\u0005)\u0000\u0000"+
		"!\b\u0001\u0000\u0000\u0000\"#\u0005-\u0000\u0000#$\u0005>\u0000\u0000"+
		"$\n\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000&\'\u0005+\u0000\u0000"+
		"\'2\u0005)\u0000\u0000()\u0005(\u0000\u0000)*\u0005-\u0000\u0000*2\u0005"+
		")\u0000\u0000+,\u0005(\u0000\u0000,-\u0005*\u0000\u0000-2\u0005)\u0000"+
		"\u0000./\u0005(\u0000\u0000/0\u0005/\u0000\u000002\u0005)\u0000\u0000"+
		"1%\u0001\u0000\u0000\u00001(\u0001\u0000\u0000\u00001+\u0001\u0000\u0000"+
		"\u00001.\u0001\u0000\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005:\u0000"+
		"\u000045\u0005:\u0000\u00005\u000e\u0001\u0000\u0000\u000067\u0005w\u0000"+
		"\u000078\u0005r\u0000\u000089\u0005i\u0000\u00009:\u0005t\u0000\u0000"+
		":;\u0005e\u0000\u0000;\u0010\u0001\u0000\u0000\u0000<=\u0002AZ\u0000="+
		"\u0012\u0001\u0000\u0000\u0000>B\u0007\u0001\u0000\u0000?A\u0007\u0002"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0014\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EG\u0007\u0003\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0006\n\u0000\u0000K\u0016"+
		"\u0001\u0000\u0000\u0000\u0005\u0000\u001a1BH\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}