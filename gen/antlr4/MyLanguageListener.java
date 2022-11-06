// Generated from C:/Users/vera3/IdeaProjects/ConfigManager3/src/main/java/antlr4\MyLanguage.g4 by ANTLR 4.10.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(MyLanguageParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(MyLanguageParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(MyLanguageParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(MyLanguageParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(MyLanguageParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(MyLanguageParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#anchor}.
	 * @param ctx the parse tree
	 */
	void enterAnchor(MyLanguageParser.AnchorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#anchor}.
	 * @param ctx the parse tree
	 */
	void exitAnchor(MyLanguageParser.AnchorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#dog}.
	 * @param ctx the parse tree
	 */
	void enterDog(MyLanguageParser.DogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#dog}.
	 * @param ctx the parse tree
	 */
	void exitDog(MyLanguageParser.DogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#student}.
	 * @param ctx the parse tree
	 */
	void enterStudent(MyLanguageParser.StudentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#student}.
	 * @param ctx the parse tree
	 */
	void exitStudent(MyLanguageParser.StudentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(MyLanguageParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(MyLanguageParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(MyLanguageParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(MyLanguageParser.IgnoreContext ctx);
}