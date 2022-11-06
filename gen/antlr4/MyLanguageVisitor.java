// Generated from C:/Users/vera3/IdeaProjects/ConfigManager3/src/main/java/antlr4\MyLanguage.g4 by ANTLR 4.10.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(MyLanguageParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(MyLanguageParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(MyLanguageParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#anchor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnchor(MyLanguageParser.AnchorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#dog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDog(MyLanguageParser.DogContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#student}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStudent(MyLanguageParser.StudentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(MyLanguageParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore(MyLanguageParser.IgnoreContext ctx);
}