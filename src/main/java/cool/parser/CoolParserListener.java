// Generated from C:/Users/alin/Downloads/tema22/src/main/java/cool/parser\CoolParser.g4 by ANTLR 4.7
package cool.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#classxx}.
	 * @param ctx the parse tree
	 */
	void enterClassxx(CoolParser.ClassxxContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#classxx}.
	 * @param ctx the parse tree
	 */
	void exitClassxx(CoolParser.ClassxxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functie}
	 * labeled alternative in {@link CoolParser#featurexx}.
	 * @param ctx the parse tree
	 */
	void enterFunctie(CoolParser.FunctieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functie}
	 * labeled alternative in {@link CoolParser#featurexx}.
	 * @param ctx the parse tree
	 */
	void exitFunctie(CoolParser.FunctieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribut}
	 * labeled alternative in {@link CoolParser#featurexx}.
	 * @param ctx the parse tree
	 */
	void enterAtribut(CoolParser.AtributContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribut}
	 * labeled alternative in {@link CoolParser#featurexx}.
	 * @param ctx the parse tree
	 */
	void exitAtribut(CoolParser.AtributContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formalxx}.
	 * @param ctx the parse tree
	 */
	void enterFormalxx(CoolParser.FormalxxContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formalxx}.
	 * @param ctx the parse tree
	 */
	void exitFormalxx(CoolParser.FormalxxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterNew(CoolParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitNew(CoolParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterMinus(CoolParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitMinus(CoolParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code egal}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterEgal(CoolParser.EgalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code egal}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitEgal(CoolParser.EgalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterString(CoolParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitString(CoolParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterBool(CoolParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitBool(CoolParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funccall}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(CoolParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funccall}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(CoolParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inm}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterInm(CoolParser.InmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inm}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitInm(CoolParser.InmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code body}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterBody(CoolParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code body}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitBody(CoolParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imp}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterImp(CoolParser.ImpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imp}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitImp(CoolParser.ImpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterPlus(CoolParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitPlus(CoolParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileloop}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(CoolParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileloop}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(CoolParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterNot(CoolParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitNot(CoolParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intt}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterIntt(CoolParser.InttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intt}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitIntt(CoolParser.InttContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casee}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterCasee(CoolParser.CaseeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casee}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitCasee(CoolParser.CaseeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code til}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterTil(CoolParser.TilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code til}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitTil(CoolParser.TilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paran}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterParan(CoolParser.ParanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitParan(CoolParser.ParanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ineg}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterIneg(CoolParser.InegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ineg}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitIneg(CoolParser.InegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelse(CoolParser.IfthenelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelse(CoolParser.IfthenelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterLet(CoolParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitLet(CoolParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuire}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterAtribuire(CoolParser.AtribuireContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuire}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitAtribuire(CoolParser.AtribuireContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterId(CoolParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitId(CoolParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objfunccall}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void enterObjfunccall(CoolParser.ObjfunccallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objfunccall}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 */
	void exitObjfunccall(CoolParser.ObjfunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#ifbody}.
	 * @param ctx the parse tree
	 */
	void enterIfbody(CoolParser.IfbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#ifbody}.
	 * @param ctx the parse tree
	 */
	void exitIfbody(CoolParser.IfbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#ifthen}.
	 * @param ctx the parse tree
	 */
	void enterIfthen(CoolParser.IfthenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#ifthen}.
	 * @param ctx the parse tree
	 */
	void exitIfthen(CoolParser.IfthenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(CoolParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(CoolParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#ifcond}.
	 * @param ctx the parse tree
	 */
	void enterIfcond(CoolParser.IfcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#ifcond}.
	 * @param ctx the parse tree
	 */
	void exitIfcond(CoolParser.IfcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#whilehead}.
	 * @param ctx the parse tree
	 */
	void enterWhilehead(CoolParser.WhileheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#whilehead}.
	 * @param ctx the parse tree
	 */
	void exitWhilehead(CoolParser.WhileheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#letcorp}.
	 * @param ctx the parse tree
	 */
	void enterLetcorp(CoolParser.LetcorpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#letcorp}.
	 * @param ctx the parse tree
	 */
	void exitLetcorp(CoolParser.LetcorpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#letbody}.
	 * @param ctx the parse tree
	 */
	void enterLetbody(CoolParser.LetbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#letbody}.
	 * @param ctx the parse tree
	 */
	void exitLetbody(CoolParser.LetbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#casebody}.
	 * @param ctx the parse tree
	 */
	void enterCasebody(CoolParser.CasebodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#casebody}.
	 * @param ctx the parse tree
	 */
	void exitCasebody(CoolParser.CasebodyContext ctx);
}