package org.example.generated;// Generated from MaudeParser.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MaudeParser}.
 */
public interface MaudeParserListener extends ParseTreeListener {
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