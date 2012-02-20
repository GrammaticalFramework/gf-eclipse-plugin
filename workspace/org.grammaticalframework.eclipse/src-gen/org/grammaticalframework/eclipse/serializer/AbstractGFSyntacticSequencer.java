package org.grammaticalframework.eclipse.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.grammaticalframework.eclipse.services.GFGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractGFSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GFGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Exp3_AsteriskAsteriskKeyword_1_1_2_or_AsteriskKeyword_1_1_1_or_ExclamationMarkKeyword_1_1_0;
	protected AbstractElementAlias match_ListExp_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ListLocDef_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ListPattAss_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ListPattTupleComp_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_ListTupleComp_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_ModContent___InKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_3__q;
	protected AbstractElementAlias match_ModContent___LeftCurlyBracketKeyword_0_1_0_RightCurlyBracketKeyword_0_1_2__q;
	protected AbstractElementAlias match_ModDef_SemicolonKeyword_4_a;
	protected AbstractElementAlias match_OperDef_SemicolonKeyword_3_7_q;
	protected AbstractElementAlias match_OperDef_SemicolonKeyword_4_7_q;
	protected AbstractElementAlias match_Patt1_AsteriskKeyword_2_1_q;
	protected AbstractElementAlias match_Patt3_LeftParenthesisKeyword_10_0_a;
	protected AbstractElementAlias match_Patt3_LeftParenthesisKeyword_10_0_p;
	protected AbstractElementAlias match_Patt3_PattArg_LeftParenthesisKeyword_10_0_a_or___LeftCurlyBracketKeyword_1_0_LeftParenthesisKeyword_10_0_a__;
	protected AbstractElementAlias match_PattArg_LeftCurlyBracketKeyword_1_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GFGrammarAccess) access;
		match_Exp3_AsteriskAsteriskKeyword_1_1_2_or_AsteriskKeyword_1_1_1_or_ExclamationMarkKeyword_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExp3Access().getAsteriskAsteriskKeyword_1_1_2()), new TokenAlias(false, false, grammarAccess.getExp3Access().getAsteriskKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getExp3Access().getExclamationMarkKeyword_1_1_0()));
		match_ListExp_SemicolonKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListExpAccess().getSemicolonKeyword_1_2());
		match_ListLocDef_SemicolonKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListLocDefAccess().getSemicolonKeyword_1_2());
		match_ListPattAss_SemicolonKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListPattAssAccess().getSemicolonKeyword_1_2());
		match_ListPattTupleComp_CommaKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListPattTupleCompAccess().getCommaKeyword_1_2());
		match_ListTupleComp_CommaKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListTupleCompAccess().getCommaKeyword_1_2());
		match_ModContent___InKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_3__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getModContentAccess().getInKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getModContentAccess().getLeftCurlyBracketKeyword_1_2_1()), new TokenAlias(false, false, grammarAccess.getModContentAccess().getRightCurlyBracketKeyword_1_2_3()));
		match_ModContent___LeftCurlyBracketKeyword_0_1_0_RightCurlyBracketKeyword_0_1_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getModContentAccess().getLeftCurlyBracketKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getModContentAccess().getRightCurlyBracketKeyword_0_1_2()));
		match_ModDef_SemicolonKeyword_4_a = new TokenAlias(true, true, grammarAccess.getModDefAccess().getSemicolonKeyword_4());
		match_OperDef_SemicolonKeyword_3_7_q = new TokenAlias(true, false, grammarAccess.getOperDefAccess().getSemicolonKeyword_3_7());
		match_OperDef_SemicolonKeyword_4_7_q = new TokenAlias(true, false, grammarAccess.getOperDefAccess().getSemicolonKeyword_4_7());
		match_Patt1_AsteriskKeyword_2_1_q = new TokenAlias(true, false, grammarAccess.getPatt1Access().getAsteriskKeyword_2_1());
		match_Patt3_LeftParenthesisKeyword_10_0_a = new TokenAlias(true, true, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_10_0());
		match_Patt3_LeftParenthesisKeyword_10_0_p = new TokenAlias(false, true, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_10_0());
		match_Patt3_PattArg_LeftParenthesisKeyword_10_0_a_or___LeftCurlyBracketKeyword_1_0_LeftParenthesisKeyword_10_0_a__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPattArgAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(true, true, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_10_0())), new TokenAlias(true, true, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_10_0()));
		match_PattArg_LeftCurlyBracketKeyword_1_0_q = new TokenAlias(true, false, grammarAccess.getPattArgAccess().getLeftCurlyBracketKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Exp3_AsteriskAsteriskKeyword_1_1_2_or_AsteriskKeyword_1_1_1_or_ExclamationMarkKeyword_1_1_0.equals(syntax))
				emit_Exp3_AsteriskAsteriskKeyword_1_1_2_or_AsteriskKeyword_1_1_1_or_ExclamationMarkKeyword_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListExp_SemicolonKeyword_1_2_q.equals(syntax))
				emit_ListExp_SemicolonKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListLocDef_SemicolonKeyword_1_2_q.equals(syntax))
				emit_ListLocDef_SemicolonKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListPattAss_SemicolonKeyword_1_2_q.equals(syntax))
				emit_ListPattAss_SemicolonKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListPattTupleComp_CommaKeyword_1_2_q.equals(syntax))
				emit_ListPattTupleComp_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListTupleComp_CommaKeyword_1_2_q.equals(syntax))
				emit_ListTupleComp_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModContent___InKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_3__q.equals(syntax))
				emit_ModContent___InKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModContent___LeftCurlyBracketKeyword_0_1_0_RightCurlyBracketKeyword_0_1_2__q.equals(syntax))
				emit_ModContent___LeftCurlyBracketKeyword_0_1_0_RightCurlyBracketKeyword_0_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModDef_SemicolonKeyword_4_a.equals(syntax))
				emit_ModDef_SemicolonKeyword_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperDef_SemicolonKeyword_3_7_q.equals(syntax))
				emit_OperDef_SemicolonKeyword_3_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperDef_SemicolonKeyword_4_7_q.equals(syntax))
				emit_OperDef_SemicolonKeyword_4_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt1_AsteriskKeyword_2_1_q.equals(syntax))
				emit_Patt1_AsteriskKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt3_LeftParenthesisKeyword_10_0_a.equals(syntax))
				emit_Patt3_LeftParenthesisKeyword_10_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt3_LeftParenthesisKeyword_10_0_p.equals(syntax))
				emit_Patt3_LeftParenthesisKeyword_10_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt3_PattArg_LeftParenthesisKeyword_10_0_a_or___LeftCurlyBracketKeyword_1_0_LeftParenthesisKeyword_10_0_a__.equals(syntax))
				emit_Patt3_PattArg_LeftParenthesisKeyword_10_0_a_or___LeftCurlyBracketKeyword_1_0_LeftParenthesisKeyword_10_0_a__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PattArg_LeftCurlyBracketKeyword_1_0_q.equals(syntax))
				emit_PattArg_LeftCurlyBracketKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '!' | '*' | '**'
	 */
	protected void emit_Exp3_AsteriskAsteriskKeyword_1_1_2_or_AsteriskKeyword_1_1_1_or_ExclamationMarkKeyword_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ListExp_SemicolonKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ListLocDef_SemicolonKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ListPattAss_SemicolonKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ListPattTupleComp_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ListTupleComp_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('in' '{' '}')?
	 */
	protected void emit_ModContent___InKeyword_1_2_0_LeftCurlyBracketKeyword_1_2_1_RightCurlyBracketKeyword_1_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_ModContent___LeftCurlyBracketKeyword_0_1_0_RightCurlyBracketKeyword_0_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'*
	 */
	protected void emit_ModDef_SemicolonKeyword_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_OperDef_SemicolonKeyword_3_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_OperDef_SemicolonKeyword_4_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '*'?
	 */
	protected void emit_Patt1_AsteriskKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Patt3_LeftParenthesisKeyword_10_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Patt3_LeftParenthesisKeyword_10_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('* | ('{' '('*)
	 */
	protected void emit_Patt3_PattArg_LeftParenthesisKeyword_10_0_a_or___LeftCurlyBracketKeyword_1_0_LeftParenthesisKeyword_10_0_a__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '{'?
	 */
	protected void emit_PattArg_LeftCurlyBracketKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
