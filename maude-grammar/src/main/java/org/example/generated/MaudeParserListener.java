package org.example.generated;// Generated from MaudeParser.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MaudeParser}.
 */
public interface MaudeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MaudeParser#strat}.
	 * @param ctx the parse tree
	 */
	void enterStrat(MaudeParser.StratContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#strat}.
	 * @param ctx the parse tree
	 */
	void exitStrat(MaudeParser.StratContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#ruleApp}.
	 * @param ctx the parse tree
	 */
	void enterRuleApp(MaudeParser.RuleAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#ruleApp}.
	 * @param ctx the parse tree
	 */
	void exitRuleApp(MaudeParser.RuleAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#substitution}.
	 * @param ctx the parse tree
	 */
	void enterSubstitution(MaudeParser.SubstitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#substitution}.
	 * @param ctx the parse tree
	 */
	void exitSubstitution(MaudeParser.SubstitutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#stratCall}.
	 * @param ctx the parse tree
	 */
	void enterStratCall(MaudeParser.StratCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#stratCall}.
	 * @param ctx the parse tree
	 */
	void exitStratCall(MaudeParser.StratCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#varStratList}.
	 * @param ctx the parse tree
	 */
	void enterVarStratList(MaudeParser.VarStratListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#varStratList}.
	 * @param ctx the parse tree
	 */
	void exitVarStratList(MaudeParser.VarStratListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#opForm}.
	 * @param ctx the parse tree
	 */
	void enterOpForm(MaudeParser.OpFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#opForm}.
	 * @param ctx the parse tree
	 */
	void exitOpForm(MaudeParser.OpFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#opFormPlus}.
	 * @param ctx the parse tree
	 */
	void enterOpFormPlus(MaudeParser.OpFormPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#opFormPlus}.
	 * @param ctx the parse tree
	 */
	void exitOpFormPlus(MaudeParser.OpFormPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MaudeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MaudeParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#termPlus}.
	 * @param ctx the parse tree
	 */
	void enterTermPlus(MaudeParser.TermPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#termPlus}.
	 * @param ctx the parse tree
	 */
	void exitTermPlus(MaudeParser.TermPlusContext ctx);
}