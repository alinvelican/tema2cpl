// Generated from C:/Users/alin/Downloads/tema22/src/main/java/cool/parser\CoolParser.g4 by ANTLR 4.7
package cool.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#classxx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassxx(CoolParser.ClassxxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functie}
	 * labeled alternative in {@link CoolParser#featurexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctie(CoolParser.FunctieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribut}
	 * labeled alternative in {@link CoolParser#featurexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribut(CoolParser.AtributContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#formalxx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalxx(CoolParser.FormalxxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(CoolParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(CoolParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code egal}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEgal(CoolParser.EgalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CoolParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(CoolParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funccall}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(CoolParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inm}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInm(CoolParser.InmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code body}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CoolParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imp}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp(CoolParser.ImpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(CoolParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileloop}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(CoolParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(CoolParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intt}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntt(CoolParser.InttContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casee}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasee(CoolParser.CaseeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code til}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTil(CoolParser.TilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paran}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParan(CoolParser.ParanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ineg}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIneg(CoolParser.InegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifthenelse}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelse(CoolParser.IfthenelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(CoolParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuire}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuire(CoolParser.AtribuireContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CoolParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objfunccall}
	 * labeled alternative in {@link CoolParser#expresiexx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjfunccall(CoolParser.ObjfunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#ifbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfbody(CoolParser.IfbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#ifthen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthen(CoolParser.IfthenContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(CoolParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#ifcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcond(CoolParser.IfcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#whilehead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilehead(CoolParser.WhileheadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#letcorp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetcorp(CoolParser.LetcorpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#letbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetbody(CoolParser.LetbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#casebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasebody(CoolParser.CasebodyContext ctx);
}