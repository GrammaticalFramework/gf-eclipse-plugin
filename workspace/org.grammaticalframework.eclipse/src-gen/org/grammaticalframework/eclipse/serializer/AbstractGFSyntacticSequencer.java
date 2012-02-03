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
	protected AbstractElementAlias match_ExpLF13_PlusSignKeyword_1_0_0_1_1_or_PlusSignPlusSignKeyword_1_0_0_1_0;
	protected AbstractElementAlias match_ExpLF_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_0_0;
	protected AbstractElementAlias match_Exp_InKeyword_6_0_q;
	protected AbstractElementAlias match_ListExp_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ListLocDef_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ListPattAss_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ListPattTupleComp_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_ListTupleComp_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_ModBody_AsteriskAsteriskKeyword_0_1_1_q;
	protected AbstractElementAlias match_ModContent___OpenKeyword_1_0_InKeyword_1_2__q;
	protected AbstractElementAlias match_ModDef_SemicolonKeyword_4_a;
	protected AbstractElementAlias match_OperDef_SemicolonKeyword_0_4_1_1_4_q;
	protected AbstractElementAlias match_OperDef_SemicolonKeyword_1_3_1_4_q;
	protected AbstractElementAlias match_ParamDef_VerticalLineKeyword_1_3_q;
	protected AbstractElementAlias match_Patt1_AsteriskKeyword_2_1_q;
	protected AbstractElementAlias match_Patt2LF_HyphenMinusKeyword_1_0_q;
	protected AbstractElementAlias match_Patt2LF_Patt3_PattArg_LeftCurlyBracketKeyword_1_0_q_or___LeftCurlyBracketKeyword_1_0_q___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p__;
	protected AbstractElementAlias match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__a;
	protected AbstractElementAlias match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__p;
	protected AbstractElementAlias match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__a;
	protected AbstractElementAlias match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p;
	protected AbstractElementAlias match_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_HyphenMinusKeyword_1_0_q__a;
	protected AbstractElementAlias match_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_a_HyphenMinusKeyword_1_0__a;
	protected AbstractElementAlias match_Patt3_LeftParenthesisKeyword_9_0_a;
	protected AbstractElementAlias match_Patt3_NumberSignKeyword_2_0_q;
	protected AbstractElementAlias match_PattArg_LeftCurlyBracketKeyword_1_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GFGrammarAccess) access;
		match_Exp3_AsteriskAsteriskKeyword_1_1_2_or_AsteriskKeyword_1_1_1_or_ExclamationMarkKeyword_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExp3Access().getAsteriskAsteriskKeyword_1_1_2()), new TokenAlias(false, false, grammarAccess.getExp3Access().getAsteriskKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getExp3Access().getExclamationMarkKeyword_1_1_0()));
		match_ExpLF13_PlusSignKeyword_1_0_0_1_1_or_PlusSignPlusSignKeyword_1_0_0_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpLF13Access().getPlusSignKeyword_1_0_0_1_1()), new TokenAlias(false, false, grammarAccess.getExpLF13Access().getPlusSignPlusSignKeyword_1_0_0_1_0()));
		match_ExpLF_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpLFAccess().getEqualsSignGreaterThanSignKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getExpLFAccess().getHyphenMinusGreaterThanSignKeyword_0_0()));
		match_Exp_InKeyword_6_0_q = new TokenAlias(true, false, grammarAccess.getExpAccess().getInKeyword_6_0());
		match_ListExp_SemicolonKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListExpAccess().getSemicolonKeyword_1_2());
		match_ListLocDef_SemicolonKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListLocDefAccess().getSemicolonKeyword_1_2());
		match_ListPattAss_SemicolonKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListPattAssAccess().getSemicolonKeyword_1_2());
		match_ListPattTupleComp_CommaKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListPattTupleCompAccess().getCommaKeyword_1_2());
		match_ListTupleComp_CommaKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListTupleCompAccess().getCommaKeyword_1_2());
		match_ModBody_AsteriskAsteriskKeyword_0_1_1_q = new TokenAlias(true, false, grammarAccess.getModBodyAccess().getAsteriskAsteriskKeyword_0_1_1());
		match_ModContent___OpenKeyword_1_0_InKeyword_1_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getModContentAccess().getOpenKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getModContentAccess().getInKeyword_1_2()));
		match_ModDef_SemicolonKeyword_4_a = new TokenAlias(true, true, grammarAccess.getModDefAccess().getSemicolonKeyword_4());
		match_OperDef_SemicolonKeyword_0_4_1_1_4_q = new TokenAlias(true, false, grammarAccess.getOperDefAccess().getSemicolonKeyword_0_4_1_1_4());
		match_OperDef_SemicolonKeyword_1_3_1_4_q = new TokenAlias(true, false, grammarAccess.getOperDefAccess().getSemicolonKeyword_1_3_1_4());
		match_ParamDef_VerticalLineKeyword_1_3_q = new TokenAlias(true, false, grammarAccess.getParamDefAccess().getVerticalLineKeyword_1_3());
		match_Patt1_AsteriskKeyword_2_1_q = new TokenAlias(true, false, grammarAccess.getPatt1Access().getAsteriskKeyword_2_1());
		match_Patt2LF_HyphenMinusKeyword_1_0_q = new TokenAlias(true, false, grammarAccess.getPatt2LFAccess().getHyphenMinusKeyword_1_0());
		match_Patt2LF_Patt3_PattArg_LeftCurlyBracketKeyword_1_0_q_or___LeftCurlyBracketKeyword_1_0_q___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(true, false, grammarAccess.getPattArgAccess().getLeftCurlyBracketKeyword_1_0()), new GroupAlias(false, true, new TokenAlias(true, false, grammarAccess.getPatt2LFAccess().getHyphenMinusKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_9_0()))), new TokenAlias(true, false, grammarAccess.getPattArgAccess().getLeftCurlyBracketKeyword_1_0()));
		match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatt2LFAccess().getHyphenMinusKeyword_1_0()), new TokenAlias(false, true, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_9_0()));
		match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__p = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPatt2LFAccess().getHyphenMinusKeyword_1_0()), new TokenAlias(false, true, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_9_0()));
		match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__a = new GroupAlias(true, true, new TokenAlias(true, false, grammarAccess.getPatt2LFAccess().getHyphenMinusKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_9_0()));
		match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p = new GroupAlias(false, true, new TokenAlias(true, false, grammarAccess.getPatt2LFAccess().getHyphenMinusKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_9_0()));
		match_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_HyphenMinusKeyword_1_0_q__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_9_0()), new TokenAlias(true, false, grammarAccess.getPatt2LFAccess().getHyphenMinusKeyword_1_0()));
		match_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_a_HyphenMinusKeyword_1_0__a = new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getPatt2LFAccess().getHyphenMinusKeyword_1_0()));
		match_Patt3_LeftParenthesisKeyword_9_0_a = new TokenAlias(true, true, grammarAccess.getPatt3Access().getLeftParenthesisKeyword_9_0());
		match_Patt3_NumberSignKeyword_2_0_q = new TokenAlias(true, false, grammarAccess.getPatt3Access().getNumberSignKeyword_2_0());
		match_PattArg_LeftCurlyBracketKeyword_1_0_q = new TokenAlias(true, false, grammarAccess.getPattArgAccess().getLeftCurlyBracketKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDoubleRule())
			return getDoubleToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIntegerRule())
			return getIntegerToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getStringRule())
			return getStringToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getDoubleToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	protected String getIntegerToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getStringToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Exp3_AsteriskAsteriskKeyword_1_1_2_or_AsteriskKeyword_1_1_1_or_ExclamationMarkKeyword_1_1_0.equals(syntax))
				emit_Exp3_AsteriskAsteriskKeyword_1_1_2_or_AsteriskKeyword_1_1_1_or_ExclamationMarkKeyword_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExpLF13_PlusSignKeyword_1_0_0_1_1_or_PlusSignPlusSignKeyword_1_0_0_1_0.equals(syntax))
				emit_ExpLF13_PlusSignKeyword_1_0_0_1_1_or_PlusSignPlusSignKeyword_1_0_0_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExpLF_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_0_0.equals(syntax))
				emit_ExpLF_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exp_InKeyword_6_0_q.equals(syntax))
				emit_Exp_InKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
			else if(match_ModBody_AsteriskAsteriskKeyword_0_1_1_q.equals(syntax))
				emit_ModBody_AsteriskAsteriskKeyword_0_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModContent___OpenKeyword_1_0_InKeyword_1_2__q.equals(syntax))
				emit_ModContent___OpenKeyword_1_0_InKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModDef_SemicolonKeyword_4_a.equals(syntax))
				emit_ModDef_SemicolonKeyword_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperDef_SemicolonKeyword_0_4_1_1_4_q.equals(syntax))
				emit_OperDef_SemicolonKeyword_0_4_1_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperDef_SemicolonKeyword_1_3_1_4_q.equals(syntax))
				emit_OperDef_SemicolonKeyword_1_3_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParamDef_VerticalLineKeyword_1_3_q.equals(syntax))
				emit_ParamDef_VerticalLineKeyword_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt1_AsteriskKeyword_2_1_q.equals(syntax))
				emit_Patt1_AsteriskKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt2LF_HyphenMinusKeyword_1_0_q.equals(syntax))
				emit_Patt2LF_HyphenMinusKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt2LF_Patt3_PattArg_LeftCurlyBracketKeyword_1_0_q_or___LeftCurlyBracketKeyword_1_0_q___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p__.equals(syntax))
				emit_Patt2LF_Patt3_PattArg_LeftCurlyBracketKeyword_1_0_q_or___LeftCurlyBracketKeyword_1_0_q___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__a.equals(syntax))
				emit_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__p.equals(syntax))
				emit_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__a.equals(syntax))
				emit_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p.equals(syntax))
				emit_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_HyphenMinusKeyword_1_0_q__a.equals(syntax))
				emit_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_HyphenMinusKeyword_1_0_q__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_a_HyphenMinusKeyword_1_0__a.equals(syntax))
				emit_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_a_HyphenMinusKeyword_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt3_LeftParenthesisKeyword_9_0_a.equals(syntax))
				emit_Patt3_LeftParenthesisKeyword_9_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt3_NumberSignKeyword_2_0_q.equals(syntax))
				emit_Patt3_NumberSignKeyword_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PattArg_LeftCurlyBracketKeyword_1_0_q.equals(syntax))
				emit_PattArg_LeftCurlyBracketKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '**' | '!' | '*'
	 */
	protected void emit_Exp3_AsteriskAsteriskKeyword_1_1_2_or_AsteriskKeyword_1_1_1_or_ExclamationMarkKeyword_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '++' | '+'
	 */
	protected void emit_ExpLF13_PlusSignKeyword_1_0_0_1_1_or_PlusSignPlusSignKeyword_1_0_0_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '->' | '=>'
	 */
	protected void emit_ExpLF_EqualsSignGreaterThanSignKeyword_1_0_or_HyphenMinusGreaterThanSignKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'in'?
	 */
	protected void emit_Exp_InKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '**'?
	 */
	protected void emit_ModBody_AsteriskAsteriskKeyword_0_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('open' 'in')?
	 */
	protected void emit_ModContent___OpenKeyword_1_0_InKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_OperDef_SemicolonKeyword_0_4_1_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_OperDef_SemicolonKeyword_1_3_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '|'?
	 */
	protected void emit_ParamDef_VerticalLineKeyword_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '-'?
	 */
	protected void emit_Patt2LF_HyphenMinusKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '{'? | ('{'? ('-'? '(')+)
	 */
	protected void emit_Patt2LF_Patt3_PattArg_LeftCurlyBracketKeyword_1_0_q_or___LeftCurlyBracketKeyword_1_0_q___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('-' '('+)*
	 */
	protected void emit_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('-' '('+)+
	 */
	protected void emit_Patt2LF_Patt3___HyphenMinusKeyword_1_0_LeftParenthesisKeyword_9_0_p__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('-'? '(')*
	 */
	protected void emit_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('-'? '(')+
	 */
	protected void emit_Patt2LF_Patt3___HyphenMinusKeyword_1_0_q_LeftParenthesisKeyword_9_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' '-'?)*
	 */
	protected void emit_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_HyphenMinusKeyword_1_0_q__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('('* '-')*
	 */
	protected void emit_Patt2LF_Patt3___LeftParenthesisKeyword_9_0_a_HyphenMinusKeyword_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Patt3_LeftParenthesisKeyword_9_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '#'?
	 */
	protected void emit_Patt3_NumberSignKeyword_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
