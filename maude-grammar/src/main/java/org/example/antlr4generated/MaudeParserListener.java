package org.example.antlr4generated;// Generated from MaudeParser.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MaudeParser}.
 */
public interface MaudeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MaudeParser#maudeTop}.
	 * @param ctx the parse tree
	 */
	void enterMaudeTop(MaudeParser.MaudeTopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#maudeTop}.
	 * @param ctx the parse tree
	 */
	void exitMaudeTop(MaudeParser.MaudeTopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(MaudeParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(MaudeParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#fmod}.
	 * @param ctx the parse tree
	 */
	void enterFmod(MaudeParser.FmodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#fmod}.
	 * @param ctx the parse tree
	 */
	void exitFmod(MaudeParser.FmodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Protecting}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void enterProtecting(MaudeParser.ProtectingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Protecting}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void exitProtecting(MaudeParser.ProtectingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Extending}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void enterExtending(MaudeParser.ExtendingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Extending}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void exitExtending(MaudeParser.ExtendingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GeneratedBy}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedBy(MaudeParser.GeneratedByContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GeneratedBy}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedBy(MaudeParser.GeneratedByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Including}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void enterIncluding(MaudeParser.IncludingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Including}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void exitIncluding(MaudeParser.IncludingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sorts}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void enterSorts(MaudeParser.SortsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sorts}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void exitSorts(MaudeParser.SortsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subsort}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void enterSubsort(MaudeParser.SubsortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subsort}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void exitSubsort(MaudeParser.SubsortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void enterOp(MaudeParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void exitOp(MaudeParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vars}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void enterVars(MaudeParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vars}
	 * labeled alternative in {@link MaudeParser#modElt}.
	 * @param ctx the parse tree
	 */
	void exitVars(MaudeParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MaudeParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(MaudeParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MaudeParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(MaudeParser.SortContext ctx);
}