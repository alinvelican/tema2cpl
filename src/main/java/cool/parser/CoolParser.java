// Generated from C:/Users/alin/Downloads/tema22/src/main/java/cool/parser\CoolParser.g4 by ANTLR 4.7
package cool.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, CLASS=2, INHERITS=3, NOT=4, TIL=5, ISVOID=6, NEW=7, IF=8, THEN=9, 
		ELSE=10, FI=11, BOOL=12, WHILE=13, LOOP=14, POOL=15, LET=16, IN=17, CASE=18, 
		ESAC=19, OF=20, REZULTA=21, TYPE=22, ID=23, PV=24, INT=25, AS=26, AD=27, 
		DP=28, PS=29, PD=30, VIRGULA=31, STRING=32, PLUS=33, MINUS=34, INM=35, 
		IMP=36, PUNCT=37, AT=38, ATRIBUIRE=39, COMMENT=40, INEGALITATI=41, EGALITATE=42, 
		WS=43, BLOCK_COMMENT=44, NEWLINE=45;
	public static final int
		RULE_program = 0, RULE_classxx = 1, RULE_featurexx = 2, RULE_formalxx = 3, 
		RULE_expresiexx = 4, RULE_ifbody = 5, RULE_ifthen = 6, RULE_ifelse = 7, 
		RULE_ifcond = 8, RULE_whilehead = 9, RULE_letcorp = 10, RULE_letbody = 11, 
		RULE_casebody = 12;
	public static final String[] ruleNames = {
		"program", "classxx", "featurexx", "formalxx", "expresiexx", "ifbody", 
		"ifthen", "ifelse", "ifcond", "whilehead", "letcorp", "letbody", "casebody"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'class'", "'inherits'", "'not'", "'~'", "'isvoid'", "'new'", 
		"'if'", "'then'", "'else'", "'fi'", null, "'while'", "'loop'", "'pool'", 
		"'let'", "'in'", "'case'", "'esac'", "'of'", "'=>'", null, null, "';'", 
		null, "'{'", "'}'", "':'", "'('", "')'", "','", null, "'+'", "'-'", "'*'", 
		"'/'", "'.'", "'@'", "'<-'", null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "CLASS", "INHERITS", "NOT", "TIL", "ISVOID", "NEW", "IF", 
		"THEN", "ELSE", "FI", "BOOL", "WHILE", "LOOP", "POOL", "LET", "IN", "CASE", 
		"ESAC", "OF", "REZULTA", "TYPE", "ID", "PV", "INT", "AS", "AD", "DP", 
		"PS", "PD", "VIRGULA", "STRING", "PLUS", "MINUS", "INM", "IMP", "PUNCT", 
		"AT", "ATRIBUIRE", "COMMENT", "INEGALITATI", "EGALITATE", "WS", "BLOCK_COMMENT", 
		"NEWLINE"
	};
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

	@Override
	public String getGrammarFileName() { return "CoolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public List<ClassxxContext> classxx() {
			return getRuleContexts(ClassxxContext.class);
		}
		public ClassxxContext classxx(int i) {
			return getRuleContext(ClassxxContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(CoolParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(CoolParser.PV, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				classxx();
				setState(27);
				match(PV);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(33);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassxxContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(CoolParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolParser.TYPE, i);
		}
		public TerminalNode AS() { return getToken(CoolParser.AS, 0); }
		public TerminalNode AD() { return getToken(CoolParser.AD, 0); }
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<FeaturexxContext> featurexx() {
			return getRuleContexts(FeaturexxContext.class);
		}
		public FeaturexxContext featurexx(int i) {
			return getRuleContext(FeaturexxContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(CoolParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(CoolParser.PV, i);
		}
		public ClassxxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classxx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClassxx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClassxx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClassxx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassxxContext classxx() throws RecognitionException {
		ClassxxContext _localctx = new ClassxxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classxx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(CLASS);
			setState(36);
			match(TYPE);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(37);
				match(INHERITS);
				setState(38);
				match(TYPE);
				}
			}

			setState(41);
			match(AS);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(42);
				featurexx();
				setState(43);
				match(PV);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(AD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeaturexxContext extends ParserRuleContext {
		public FeaturexxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featurexx; }
	 
		public FeaturexxContext() { }
		public void copyFrom(FeaturexxContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtributContext extends FeaturexxContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode DP() { return getToken(CoolParser.DP, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ATRIBUIRE() { return getToken(CoolParser.ATRIBUIRE, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public AtributContext(FeaturexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAtribut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAtribut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAtribut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctieContext extends FeaturexxContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode PS() { return getToken(CoolParser.PS, 0); }
		public TerminalNode PD() { return getToken(CoolParser.PD, 0); }
		public TerminalNode DP() { return getToken(CoolParser.DP, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode AS() { return getToken(CoolParser.AS, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public TerminalNode AD() { return getToken(CoolParser.AD, 0); }
		public List<FormalxxContext> formalxx() {
			return getRuleContexts(FormalxxContext.class);
		}
		public FormalxxContext formalxx(int i) {
			return getRuleContext(FormalxxContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CoolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CoolParser.VIRGULA, i);
		}
		public FunctieContext(FeaturexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFunctie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFunctie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFunctie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeaturexxContext featurexx() throws RecognitionException {
		FeaturexxContext _localctx = new FeaturexxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_featurexx);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FunctieContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(ID);
				setState(53);
				match(PS);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(54);
					formalxx();
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(55);
						match(VIRGULA);
						setState(56);
						formalxx();
						}
						}
						setState(61);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				match(PD);
				setState(68);
				match(DP);
				setState(69);
				match(TYPE);
				setState(70);
				match(AS);
				setState(71);
				expresiexx(0);
				setState(72);
				match(AD);
				}
				break;
			case 2:
				_localctx = new AtributContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(ID);
				setState(75);
				match(DP);
				setState(76);
				match(TYPE);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATRIBUIRE) {
					{
					setState(77);
					match(ATRIBUIRE);
					setState(78);
					expresiexx(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalxxContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode DP() { return getToken(CoolParser.DP, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public FormalxxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalxx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFormalxx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFormalxx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFormalxx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalxxContext formalxx() throws RecognitionException {
		FormalxxContext _localctx = new FormalxxContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalxx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ID);
			setState(84);
			match(DP);
			setState(85);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresiexxContext extends ParserRuleContext {
		public ExpresiexxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresiexx; }
	 
		public ExpresiexxContext() { }
		public void copyFrom(ExpresiexxContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewContext extends ExpresiexxContext {
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public NewContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpresiexxContext {
		public List<ExpresiexxContext> expresiexx() {
			return getRuleContexts(ExpresiexxContext.class);
		}
		public ExpresiexxContext expresiexx(int i) {
			return getRuleContext(ExpresiexxContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public MinusContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EgalContext extends ExpresiexxContext {
		public List<ExpresiexxContext> expresiexx() {
			return getRuleContexts(ExpresiexxContext.class);
		}
		public ExpresiexxContext expresiexx(int i) {
			return getRuleContext(ExpresiexxContext.class,i);
		}
		public TerminalNode EGALITATE() { return getToken(CoolParser.EGALITATE, 0); }
		public EgalContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterEgal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitEgal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitEgal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpresiexxContext {
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public StringContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpresiexxContext {
		public TerminalNode BOOL() { return getToken(CoolParser.BOOL, 0); }
		public BoolContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunccallContext extends ExpresiexxContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode PS() { return getToken(CoolParser.PS, 0); }
		public TerminalNode PD() { return getToken(CoolParser.PD, 0); }
		public List<ExpresiexxContext> expresiexx() {
			return getRuleContexts(ExpresiexxContext.class);
		}
		public ExpresiexxContext expresiexx(int i) {
			return getRuleContext(ExpresiexxContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CoolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CoolParser.VIRGULA, i);
		}
		public FunccallContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends ExpresiexxContext {
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public IsvoidContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InmContext extends ExpresiexxContext {
		public List<ExpresiexxContext> expresiexx() {
			return getRuleContexts(ExpresiexxContext.class);
		}
		public ExpresiexxContext expresiexx(int i) {
			return getRuleContext(ExpresiexxContext.class,i);
		}
		public TerminalNode INM() { return getToken(CoolParser.INM, 0); }
		public InmContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterInm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitInm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitInm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BodyContext extends ExpresiexxContext {
		public TerminalNode AS() { return getToken(CoolParser.AS, 0); }
		public TerminalNode AD() { return getToken(CoolParser.AD, 0); }
		public List<ExpresiexxContext> expresiexx() {
			return getRuleContexts(ExpresiexxContext.class);
		}
		public ExpresiexxContext expresiexx(int i) {
			return getRuleContext(ExpresiexxContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(CoolParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(CoolParser.PV, i);
		}
		public BodyContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpContext extends ExpresiexxContext {
		public List<ExpresiexxContext> expresiexx() {
			return getRuleContexts(ExpresiexxContext.class);
		}
		public ExpresiexxContext expresiexx(int i) {
			return getRuleContext(ExpresiexxContext.class,i);
		}
		public TerminalNode IMP() { return getToken(CoolParser.IMP, 0); }
		public ImpContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitImp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitImp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExpresiexxContext {
		public List<ExpresiexxContext> expresiexx() {
			return getRuleContexts(ExpresiexxContext.class);
		}
		public ExpresiexxContext expresiexx(int i) {
			return getRuleContext(ExpresiexxContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CoolParser.PLUS, 0); }
		public PlusContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileloopContext extends ExpresiexxContext {
		public WhileheadContext whilehead() {
			return getRuleContext(WhileheadContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public WhileloopContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitWhileloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpresiexxContext {
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public NotContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InttContext extends ExpresiexxContext {
		public TerminalNode INT() { return getToken(CoolParser.INT, 0); }
		public InttContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIntt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIntt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIntt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseeContext extends ExpresiexxContext {
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public List<CasebodyContext> casebody() {
			return getRuleContexts(CasebodyContext.class);
		}
		public CasebodyContext casebody(int i) {
			return getRuleContext(CasebodyContext.class,i);
		}
		public CaseeContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCasee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCasee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCasee(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TilContext extends ExpresiexxContext {
		public TerminalNode TIL() { return getToken(CoolParser.TIL, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public TilContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterTil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitTil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitTil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanContext extends ExpresiexxContext {
		public TerminalNode PS() { return getToken(CoolParser.PS, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public TerminalNode PD() { return getToken(CoolParser.PD, 0); }
		public ParanContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterParan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitParan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitParan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InegContext extends ExpresiexxContext {
		public List<ExpresiexxContext> expresiexx() {
			return getRuleContexts(ExpresiexxContext.class);
		}
		public ExpresiexxContext expresiexx(int i) {
			return getRuleContext(ExpresiexxContext.class,i);
		}
		public TerminalNode INEGALITATI() { return getToken(CoolParser.INEGALITATI, 0); }
		public InegContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIneg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIneg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfthenelseContext extends ExpresiexxContext {
		public IfcondContext ifcond() {
			return getRuleContext(IfcondContext.class,0);
		}
		public IfbodyContext ifbody() {
			return getRuleContext(IfbodyContext.class,0);
		}
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public IfthenelseContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIfthenelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIfthenelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIfthenelse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends ExpresiexxContext {
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public List<LetbodyContext> letbody() {
			return getRuleContexts(LetbodyContext.class);
		}
		public LetbodyContext letbody(int i) {
			return getRuleContext(LetbodyContext.class,i);
		}
		public LetcorpContext letcorp() {
			return getRuleContext(LetcorpContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(CoolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CoolParser.VIRGULA, i);
		}
		public LetContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuireContext extends ExpresiexxContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode ATRIBUIRE() { return getToken(CoolParser.ATRIBUIRE, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public AtribuireContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAtribuire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAtribuire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAtribuire(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpresiexxContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public IdContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjfunccallContext extends ExpresiexxContext {
		public List<ExpresiexxContext> expresiexx() {
			return getRuleContexts(ExpresiexxContext.class);
		}
		public ExpresiexxContext expresiexx(int i) {
			return getRuleContext(ExpresiexxContext.class,i);
		}
		public TerminalNode PUNCT() { return getToken(CoolParser.PUNCT, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode PS() { return getToken(CoolParser.PS, 0); }
		public TerminalNode PD() { return getToken(CoolParser.PD, 0); }
		public TerminalNode AT() { return getToken(CoolParser.AT, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(CoolParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(CoolParser.VIRGULA, i);
		}
		public ObjfunccallContext(ExpresiexxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterObjfunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitObjfunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitObjfunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresiexxContext expresiexx() throws RecognitionException {
		return expresiexx(0);
	}

	private ExpresiexxContext expresiexx(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresiexxContext _localctx = new ExpresiexxContext(_ctx, _parentState);
		ExpresiexxContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expresiexx, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new FunccallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				match(ID);
				setState(89);
				match(PS);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TIL) | (1L << ISVOID) | (1L << NEW) | (1L << IF) | (1L << BOOL) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ID) | (1L << INT) | (1L << AS) | (1L << PS) | (1L << STRING))) != 0)) {
					{
					{
					setState(90);
					expresiexx(0);
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(91);
						match(VIRGULA);
						setState(92);
						expresiexx(0);
						}
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(PD);
				}
				break;
			case 2:
				{
				_localctx = new IfthenelseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				ifcond();
				setState(105);
				ifbody();
				setState(106);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileloopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				whilehead();
				setState(109);
				match(LOOP);
				setState(110);
				expresiexx(0);
				setState(111);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BodyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(AS);
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(114);
					expresiexx(0);
					setState(115);
					match(PV);
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TIL) | (1L << ISVOID) | (1L << NEW) | (1L << IF) | (1L << BOOL) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ID) | (1L << INT) | (1L << AS) | (1L << PS) | (1L << STRING))) != 0) );
				setState(121);
				match(AD);
				}
				break;
			case 5:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(LET);
				setState(124);
				letbody();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(125);
					match(VIRGULA);
					setState(126);
					letbody();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				letcorp();
				}
				break;
			case 6:
				{
				_localctx = new CaseeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(CASE);
				setState(135);
				expresiexx(0);
				setState(136);
				match(OF);
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					casebody();
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(142);
				match(ESAC);
				}
				break;
			case 7:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(NEW);
				setState(145);
				match(TYPE);
				}
				break;
			case 8:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(ISVOID);
				setState(147);
				expresiexx(15);
				}
				break;
			case 9:
				{
				_localctx = new AtribuireContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(ID);
				setState(149);
				match(ATRIBUIRE);
				setState(150);
				expresiexx(10);
				}
				break;
			case 10:
				{
				_localctx = new TilContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(TIL);
				setState(152);
				expresiexx(9);
				}
				break;
			case 11:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(NOT);
				setState(154);
				expresiexx(6);
				}
				break;
			case 12:
				{
				_localctx = new ParanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(PS);
				setState(156);
				expresiexx(0);
				setState(157);
				match(PD);
				}
				break;
			case 13:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(ID);
				}
				break;
			case 14:
				{
				_localctx = new InttContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(INT);
				}
				break;
			case 15:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new InmContext(new ExpresiexxContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
						setState(165);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(166);
						match(INM);
						setState(167);
						expresiexx(15);
						}
						break;
					case 2:
						{
						_localctx = new ImpContext(new ExpresiexxContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
						setState(168);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(169);
						match(IMP);
						setState(170);
						expresiexx(14);
						}
						break;
					case 3:
						{
						_localctx = new PlusContext(new ExpresiexxContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
						setState(171);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(172);
						match(PLUS);
						setState(173);
						expresiexx(13);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExpresiexxContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
						setState(174);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(175);
						match(MINUS);
						setState(176);
						expresiexx(12);
						}
						break;
					case 5:
						{
						_localctx = new InegContext(new ExpresiexxContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						match(INEGALITATI);
						setState(179);
						expresiexx(9);
						}
						break;
					case 6:
						{
						_localctx = new EgalContext(new ExpresiexxContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						match(EGALITATE);
						setState(182);
						expresiexx(8);
						}
						break;
					case 7:
						{
						_localctx = new ObjfunccallContext(new ExpresiexxContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
						setState(183);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(184);
							match(AT);
							setState(185);
							match(TYPE);
							}
						}

						setState(188);
						match(PUNCT);
						setState(189);
						match(ID);
						setState(190);
						match(PS);
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TIL) | (1L << ISVOID) | (1L << NEW) | (1L << IF) | (1L << BOOL) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ID) | (1L << INT) | (1L << AS) | (1L << PS) | (1L << STRING))) != 0)) {
							{
							{
							setState(191);
							expresiexx(0);
							setState(196);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==VIRGULA) {
								{
								{
								setState(192);
								match(VIRGULA);
								setState(193);
								expresiexx(0);
								}
								}
								setState(198);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(203);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(204);
						match(PD);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfbodyContext extends ParserRuleContext {
		public IfthenContext ifthen() {
			return getRuleContext(IfthenContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public IfbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIfbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIfbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIfbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfbodyContext ifbody() throws RecognitionException {
		IfbodyContext _localctx = new IfbodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			ifthen();
			setState(211);
			ifelse();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfthenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public IfthenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIfthen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIfthen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIfthen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfthenContext ifthen() throws RecognitionException {
		IfthenContext _localctx = new IfthenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifthen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(THEN);
			setState(214);
			expresiexx(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ELSE);
			setState(217);
			expresiexx(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfcondContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public IfcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIfcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIfcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIfcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcondContext ifcond() throws RecognitionException {
		IfcondContext _localctx = new IfcondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(IF);
			setState(220);
			expresiexx(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileheadContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public WhileheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilehead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterWhilehead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitWhilehead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitWhilehead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileheadContext whilehead() throws RecognitionException {
		WhileheadContext _localctx = new WhileheadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilehead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(WHILE);
			setState(223);
			expresiexx(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetcorpContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public LetcorpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letcorp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLetcorp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLetcorp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLetcorp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetcorpContext letcorp() throws RecognitionException {
		LetcorpContext _localctx = new LetcorpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_letcorp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IN);
			setState(226);
			expresiexx(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetbodyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode DP() { return getToken(CoolParser.DP, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ATRIBUIRE() { return getToken(CoolParser.ATRIBUIRE, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public LetbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLetbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLetbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLetbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetbodyContext letbody() throws RecognitionException {
		LetbodyContext _localctx = new LetbodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_letbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(229);
			match(DP);
			setState(230);
			match(TYPE);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUIRE) {
				{
				setState(231);
				match(ATRIBUIRE);
				setState(232);
				expresiexx(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasebodyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode DP() { return getToken(CoolParser.DP, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode REZULTA() { return getToken(CoolParser.REZULTA, 0); }
		public ExpresiexxContext expresiexx() {
			return getRuleContext(ExpresiexxContext.class,0);
		}
		public TerminalNode PV() { return getToken(CoolParser.PV, 0); }
		public CasebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCasebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCasebody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCasebody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasebodyContext casebody() throws RecognitionException {
		CasebodyContext _localctx = new CasebodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_casebody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ID);
			setState(236);
			match(DP);
			setState(237);
			match(TYPE);
			setState(238);
			match(REZULTA);
			setState(239);
			expresiexx(0);
			setState(240);
			match(PV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expresiexx_sempred((ExpresiexxContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresiexx_sempred(ExpresiexxContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\7\4A\n\4\f\4\16\4D"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\5\4T\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\7\6"+
		"e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\6\6x\n\6\r\6\16\6y\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0082\n\6\f\6\16"+
		"\6\u0085\13\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u008d\n\6\r\6\16\6\u008e\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00a6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6\u00c5\n\6\f\6\16\6\u00c8\13\6\7\6\u00ca\n\6\f\6\16\6\u00cd"+
		"\13\6\3\6\7\6\u00d0\n\6\f\6\16\6\u00d3\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00ec\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\3\n\17\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\2\2\2\u010d\2\37\3\2\2\2\4%\3\2\2\2\6S\3\2"+
		"\2\2\bU\3\2\2\2\n\u00a5\3\2\2\2\f\u00d4\3\2\2\2\16\u00d7\3\2\2\2\20\u00da"+
		"\3\2\2\2\22\u00dd\3\2\2\2\24\u00e0\3\2\2\2\26\u00e3\3\2\2\2\30\u00e6\3"+
		"\2\2\2\32\u00ed\3\2\2\2\34\35\5\4\3\2\35\36\7\32\2\2\36 \3\2\2\2\37\34"+
		"\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\2\2\3$\3\3\2"+
		"\2\2%&\7\4\2\2&)\7\30\2\2\'(\7\5\2\2(*\7\30\2\2)\'\3\2\2\2)*\3\2\2\2*"+
		"+\3\2\2\2+\61\7\34\2\2,-\5\6\4\2-.\7\32\2\2.\60\3\2\2\2/,\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7"+
		"\35\2\2\65\5\3\2\2\2\66\67\7\31\2\2\67B\7\37\2\28=\5\b\5\29:\7!\2\2:<"+
		"\5\b\5\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@"+
		"8\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7 \2\2F"+
		"G\7\36\2\2GH\7\30\2\2HI\7\34\2\2IJ\5\n\6\2JK\7\35\2\2KT\3\2\2\2LM\7\31"+
		"\2\2MN\7\36\2\2NQ\7\30\2\2OP\7)\2\2PR\5\n\6\2QO\3\2\2\2QR\3\2\2\2RT\3"+
		"\2\2\2S\66\3\2\2\2SL\3\2\2\2T\7\3\2\2\2UV\7\31\2\2VW\7\36\2\2WX\7\30\2"+
		"\2X\t\3\2\2\2YZ\b\6\1\2Z[\7\31\2\2[f\7\37\2\2\\a\5\n\6\2]^\7!\2\2^`\5"+
		"\n\6\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2d\\"+
		"\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2i\u00a6\7 \2"+
		"\2jk\5\22\n\2kl\5\f\7\2lm\7\r\2\2m\u00a6\3\2\2\2no\5\24\13\2op\7\20\2"+
		"\2pq\5\n\6\2qr\7\21\2\2r\u00a6\3\2\2\2sw\7\34\2\2tu\5\n\6\2uv\7\32\2\2"+
		"vx\3\2\2\2wt\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\35\2"+
		"\2|\u00a6\3\2\2\2}~\7\22\2\2~\u0083\5\30\r\2\177\u0080\7!\2\2\u0080\u0082"+
		"\5\30\r\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\26"+
		"\f\2\u0087\u00a6\3\2\2\2\u0088\u0089\7\24\2\2\u0089\u008a\5\n\6\2\u008a"+
		"\u008c\7\26\2\2\u008b\u008d\5\32\16\2\u008c\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7\25\2\2\u0091\u00a6\3\2\2\2\u0092\u0093\7\t\2\2\u0093\u00a6\7"+
		"\30\2\2\u0094\u0095\7\b\2\2\u0095\u00a6\5\n\6\21\u0096\u0097\7\31\2\2"+
		"\u0097\u0098\7)\2\2\u0098\u00a6\5\n\6\f\u0099\u009a\7\7\2\2\u009a\u00a6"+
		"\5\n\6\13\u009b\u009c\7\6\2\2\u009c\u00a6\5\n\6\b\u009d\u009e\7\37\2\2"+
		"\u009e\u009f\5\n\6\2\u009f\u00a0\7 \2\2\u00a0\u00a6\3\2\2\2\u00a1\u00a6"+
		"\7\31\2\2\u00a2\u00a6\7\33\2\2\u00a3\u00a6\7\"\2\2\u00a4\u00a6\7\16\2"+
		"\2\u00a5Y\3\2\2\2\u00a5j\3\2\2\2\u00a5n\3\2\2\2\u00a5s\3\2\2\2\u00a5}"+
		"\3\2\2\2\u00a5\u0088\3\2\2\2\u00a5\u0092\3\2\2\2\u00a5\u0094\3\2\2\2\u00a5"+
		"\u0096\3\2\2\2\u00a5\u0099\3\2\2\2\u00a5\u009b\3\2\2\2\u00a5\u009d\3\2"+
		"\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00d1\3\2\2\2\u00a7\u00a8\f\20\2\2\u00a8\u00a9\7"+
		"%\2\2\u00a9\u00d0\5\n\6\21\u00aa\u00ab\f\17\2\2\u00ab\u00ac\7&\2\2\u00ac"+
		"\u00d0\5\n\6\20\u00ad\u00ae\f\16\2\2\u00ae\u00af\7#\2\2\u00af\u00d0\5"+
		"\n\6\17\u00b0\u00b1\f\r\2\2\u00b1\u00b2\7$\2\2\u00b2\u00d0\5\n\6\16\u00b3"+
		"\u00b4\f\n\2\2\u00b4\u00b5\7+\2\2\u00b5\u00d0\5\n\6\13\u00b6\u00b7\f\t"+
		"\2\2\u00b7\u00b8\7,\2\2\u00b8\u00d0\5\n\6\n\u00b9\u00bc\f\31\2\2\u00ba"+
		"\u00bb\7(\2\2\u00bb\u00bd\7\30\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\'\2\2\u00bf\u00c0\7\31\2\2\u00c0"+
		"\u00cb\7\37\2\2\u00c1\u00c6\5\n\6\2\u00c2\u00c3\7!\2\2\u00c3\u00c5\5\n"+
		"\6\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c1\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\7 \2\2\u00cf\u00a7\3\2"+
		"\2\2\u00cf\u00aa\3\2\2\2\u00cf\u00ad\3\2\2\2\u00cf\u00b0\3\2\2\2\u00cf"+
		"\u00b3\3\2\2\2\u00cf\u00b6\3\2\2\2\u00cf\u00b9\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\13\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d5\5\16\b\2\u00d5\u00d6\5\20\t\2\u00d6\r\3\2\2\2\u00d7"+
		"\u00d8\7\13\2\2\u00d8\u00d9\5\n\6\2\u00d9\17\3\2\2\2\u00da\u00db\7\f\2"+
		"\2\u00db\u00dc\5\n\6\2\u00dc\21\3\2\2\2\u00dd\u00de\7\n\2\2\u00de\u00df"+
		"\5\n\6\2\u00df\23\3\2\2\2\u00e0\u00e1\7\17\2\2\u00e1\u00e2\5\n\6\2\u00e2"+
		"\25\3\2\2\2\u00e3\u00e4\7\23\2\2\u00e4\u00e5\5\n\6\2\u00e5\27\3\2\2\2"+
		"\u00e6\u00e7\7\31\2\2\u00e7\u00e8\7\36\2\2\u00e8\u00eb\7\30\2\2\u00e9"+
		"\u00ea\7)\2\2\u00ea\u00ec\5\n\6\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\31\3\2\2\2\u00ed\u00ee\7\31\2\2\u00ee\u00ef\7\36\2\2\u00ef"+
		"\u00f0\7\30\2\2\u00f0\u00f1\7\27\2\2\u00f1\u00f2\5\n\6\2\u00f2\u00f3\7"+
		"\32\2\2\u00f3\33\3\2\2\2\25!)\61=BQSafy\u0083\u008e\u00a5\u00bc\u00c6"+
		"\u00cb\u00cf\u00d1\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}