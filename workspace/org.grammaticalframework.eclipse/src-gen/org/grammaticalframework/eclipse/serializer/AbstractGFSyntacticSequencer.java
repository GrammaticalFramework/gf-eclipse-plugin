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
	protected AbstractElementAlias match_DataDef_VerticalLineKeyword_2_2_q;
	protected AbstractElementAlias match_Exp3_AsteriskAsteriskKeyword_0_1_0_2_or_AsteriskKeyword_0_1_0_1_or_ExclamationMarkKeyword_0_1_0_0;
	protected AbstractElementAlias match_Exp3_AsteriskAsteriskKeyword_1_2_0_2_or_AsteriskKeyword_1_2_0_1_or_ExclamationMarkKeyword_1_2_0_0;
	protected AbstractElementAlias match_Exp6_IntegerTerminalRuleCall_6_1_q;
	protected AbstractElementAlias match_Exp_AsteriskAsteriskKeyword_5_1_0_0_0_2_or_AsteriskKeyword_5_1_0_0_0_1_or_ExclamationMarkKeyword_5_1_0_0_0_0;
	protected AbstractElementAlias match_Exp_AsteriskAsteriskKeyword_6_2_0_2_or_AsteriskKeyword_6_2_0_1_or_ExclamationMarkKeyword_6_2_0_0;
	protected AbstractElementAlias match_ListExp_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ListLocDef_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ListPattAss_SemicolonKeyword_1_2_q;
	protected AbstractElementAlias match_ModBody_AsteriskAsteriskKeyword_0_1_1_q;
	protected AbstractElementAlias match_ModBody___AsteriskAsteriskKeyword_0_1_1_q___OpenKeyword_0_2_0_InKeyword_0_2_2__q_LeftCurlyBracketKeyword_0_3_RightCurlyBracketKeyword_0_5__q;
	protected AbstractElementAlias match_ModBody___OpenKeyword_0_2_0_InKeyword_0_2_2__q;
	protected AbstractElementAlias match_ModBody___OpenKeyword_3_5_0_InKeyword_3_5_2__q;
	protected AbstractElementAlias match_ModBody___OpenKeyword_5_7_0_InKeyword_5_7_2__q;
	protected AbstractElementAlias match_ModDef_SemicolonKeyword_4_a;
	protected AbstractElementAlias match_OperDef_SemicolonKeyword_0_3_1_3_2_q;
	protected AbstractElementAlias match_OperDef_SemicolonKeyword_1_4_1_1_3_2_q;
	protected AbstractElementAlias match_OperDef_SemicolonKeyword_2_6_2_q;
	protected AbstractElementAlias match_ParDef_VerticalLineKeyword_0_2_2_q;
	protected AbstractElementAlias match_Patt1_HyphenMinusKeyword_3_0_q;
	protected AbstractElementAlias match_Patt2_DoubleTerminalRuleCall_4_1_or_IntegerTerminalRuleCall_3_1_or_QuestionMarkKeyword_9_1_or_StringTerminalRuleCall_5_1_or__Keyword_0_1;
	protected AbstractElementAlias match_Patt_PlusSignKeyword_1_0_1_or_VerticalLineKeyword_1_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GFGrammarAccess) access;
		match_DataDef_VerticalLineKeyword_2_2_q = new TokenAlias(true, false, grammarAccess.getDataDefAccess().getVerticalLineKeyword_2_2());
		match_Exp3_AsteriskAsteriskKeyword_0_1_0_2_or_AsteriskKeyword_0_1_0_1_or_ExclamationMarkKeyword_0_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExp3Access().getAsteriskAsteriskKeyword_0_1_0_2()), new TokenAlias(false, false, grammarAccess.getExp3Access().getAsteriskKeyword_0_1_0_1()), new TokenAlias(false, false, grammarAccess.getExp3Access().getExclamationMarkKeyword_0_1_0_0()));
		match_Exp3_AsteriskAsteriskKeyword_1_2_0_2_or_AsteriskKeyword_1_2_0_1_or_ExclamationMarkKeyword_1_2_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExp3Access().getAsteriskAsteriskKeyword_1_2_0_2()), new TokenAlias(false, false, grammarAccess.getExp3Access().getAsteriskKeyword_1_2_0_1()), new TokenAlias(false, false, grammarAccess.getExp3Access().getExclamationMarkKeyword_1_2_0_0()));
		match_Exp6_IntegerTerminalRuleCall_6_1_q = new TokenAlias(true, false, grammarAccess.getExp6Access().getIntegerTerminalRuleCall_6_1());
		match_Exp_AsteriskAsteriskKeyword_5_1_0_0_0_2_or_AsteriskKeyword_5_1_0_0_0_1_or_ExclamationMarkKeyword_5_1_0_0_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpAccess().getAsteriskAsteriskKeyword_5_1_0_0_0_2()), new TokenAlias(false, false, grammarAccess.getExpAccess().getAsteriskKeyword_5_1_0_0_0_1()), new TokenAlias(false, false, grammarAccess.getExpAccess().getExclamationMarkKeyword_5_1_0_0_0_0()));
		match_Exp_AsteriskAsteriskKeyword_6_2_0_2_or_AsteriskKeyword_6_2_0_1_or_ExclamationMarkKeyword_6_2_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpAccess().getAsteriskAsteriskKeyword_6_2_0_2()), new TokenAlias(false, false, grammarAccess.getExpAccess().getAsteriskKeyword_6_2_0_1()), new TokenAlias(false, false, grammarAccess.getExpAccess().getExclamationMarkKeyword_6_2_0_0()));
		match_ListExp_SemicolonKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListExpAccess().getSemicolonKeyword_1_2());
		match_ListLocDef_SemicolonKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListLocDefAccess().getSemicolonKeyword_1_2());
		match_ListPattAss_SemicolonKeyword_1_2_q = new TokenAlias(true, false, grammarAccess.getListPattAssAccess().getSemicolonKeyword_1_2());
		match_ModBody_AsteriskAsteriskKeyword_0_1_1_q = new TokenAlias(true, false, grammarAccess.getModBodyAccess().getAsteriskAsteriskKeyword_0_1_1());
		match_ModBody___AsteriskAsteriskKeyword_0_1_1_q___OpenKeyword_0_2_0_InKeyword_0_2_2__q_LeftCurlyBracketKeyword_0_3_RightCurlyBracketKeyword_0_5__q = new GroupAlias(true, false, new TokenAlias(true, false, grammarAccess.getModBodyAccess().getAsteriskAsteriskKeyword_0_1_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getModBodyAccess().getOpenKeyword_0_2_0()), new TokenAlias(false, false, grammarAccess.getModBodyAccess().getInKeyword_0_2_2())), new TokenAlias(false, false, grammarAccess.getModBodyAccess().getLeftCurlyBracketKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getModBodyAccess().getRightCurlyBracketKeyword_0_5()));
		match_ModBody___OpenKeyword_0_2_0_InKeyword_0_2_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getModBodyAccess().getOpenKeyword_0_2_0()), new TokenAlias(false, false, grammarAccess.getModBodyAccess().getInKeyword_0_2_2()));
		match_ModBody___OpenKeyword_3_5_0_InKeyword_3_5_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getModBodyAccess().getOpenKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getModBodyAccess().getInKeyword_3_5_2()));
		match_ModBody___OpenKeyword_5_7_0_InKeyword_5_7_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getModBodyAccess().getOpenKeyword_5_7_0()), new TokenAlias(false, false, grammarAccess.getModBodyAccess().getInKeyword_5_7_2()));
		match_ModDef_SemicolonKeyword_4_a = new TokenAlias(true, true, grammarAccess.getModDefAccess().getSemicolonKeyword_4());
		match_OperDef_SemicolonKeyword_0_3_1_3_2_q = new TokenAlias(true, false, grammarAccess.getOperDefAccess().getSemicolonKeyword_0_3_1_3_2());
		match_OperDef_SemicolonKeyword_1_4_1_1_3_2_q = new TokenAlias(true, false, grammarAccess.getOperDefAccess().getSemicolonKeyword_1_4_1_1_3_2());
		match_OperDef_SemicolonKeyword_2_6_2_q = new TokenAlias(true, false, grammarAccess.getOperDefAccess().getSemicolonKeyword_2_6_2());
		match_ParDef_VerticalLineKeyword_0_2_2_q = new TokenAlias(true, false, grammarAccess.getParDefAccess().getVerticalLineKeyword_0_2_2());
		match_Patt1_HyphenMinusKeyword_3_0_q = new TokenAlias(true, false, grammarAccess.getPatt1Access().getHyphenMinusKeyword_3_0());
		match_Patt2_DoubleTerminalRuleCall_4_1_or_IntegerTerminalRuleCall_3_1_or_QuestionMarkKeyword_9_1_or_StringTerminalRuleCall_5_1_or__Keyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPatt2Access().getDoubleTerminalRuleCall_4_1()), new TokenAlias(false, false, grammarAccess.getPatt2Access().getIntegerTerminalRuleCall_3_1()), new TokenAlias(false, false, grammarAccess.getPatt2Access().getQuestionMarkKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getPatt2Access().getStringTerminalRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getPatt2Access().get_Keyword_0_1()));
		match_Patt_PlusSignKeyword_1_0_1_or_VerticalLineKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPattAccess().getPlusSignKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getPattAccess().getVerticalLineKeyword_1_0_0()));
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
			if(match_DataDef_VerticalLineKeyword_2_2_q.equals(syntax))
				emit_DataDef_VerticalLineKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exp3_AsteriskAsteriskKeyword_0_1_0_2_or_AsteriskKeyword_0_1_0_1_or_ExclamationMarkKeyword_0_1_0_0.equals(syntax))
				emit_Exp3_AsteriskAsteriskKeyword_0_1_0_2_or_AsteriskKeyword_0_1_0_1_or_ExclamationMarkKeyword_0_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exp3_AsteriskAsteriskKeyword_1_2_0_2_or_AsteriskKeyword_1_2_0_1_or_ExclamationMarkKeyword_1_2_0_0.equals(syntax))
				emit_Exp3_AsteriskAsteriskKeyword_1_2_0_2_or_AsteriskKeyword_1_2_0_1_or_ExclamationMarkKeyword_1_2_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exp6_IntegerTerminalRuleCall_6_1_q.equals(syntax))
				emit_Exp6_IntegerTerminalRuleCall_6_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exp_AsteriskAsteriskKeyword_5_1_0_0_0_2_or_AsteriskKeyword_5_1_0_0_0_1_or_ExclamationMarkKeyword_5_1_0_0_0_0.equals(syntax))
				emit_Exp_AsteriskAsteriskKeyword_5_1_0_0_0_2_or_AsteriskKeyword_5_1_0_0_0_1_or_ExclamationMarkKeyword_5_1_0_0_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exp_AsteriskAsteriskKeyword_6_2_0_2_or_AsteriskKeyword_6_2_0_1_or_ExclamationMarkKeyword_6_2_0_0.equals(syntax))
				emit_Exp_AsteriskAsteriskKeyword_6_2_0_2_or_AsteriskKeyword_6_2_0_1_or_ExclamationMarkKeyword_6_2_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListExp_SemicolonKeyword_1_2_q.equals(syntax))
				emit_ListExp_SemicolonKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListLocDef_SemicolonKeyword_1_2_q.equals(syntax))
				emit_ListLocDef_SemicolonKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListPattAss_SemicolonKeyword_1_2_q.equals(syntax))
				emit_ListPattAss_SemicolonKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModBody_AsteriskAsteriskKeyword_0_1_1_q.equals(syntax))
				emit_ModBody_AsteriskAsteriskKeyword_0_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModBody___AsteriskAsteriskKeyword_0_1_1_q___OpenKeyword_0_2_0_InKeyword_0_2_2__q_LeftCurlyBracketKeyword_0_3_RightCurlyBracketKeyword_0_5__q.equals(syntax))
				emit_ModBody___AsteriskAsteriskKeyword_0_1_1_q___OpenKeyword_0_2_0_InKeyword_0_2_2__q_LeftCurlyBracketKeyword_0_3_RightCurlyBracketKeyword_0_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModBody___OpenKeyword_0_2_0_InKeyword_0_2_2__q.equals(syntax))
				emit_ModBody___OpenKeyword_0_2_0_InKeyword_0_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModBody___OpenKeyword_3_5_0_InKeyword_3_5_2__q.equals(syntax))
				emit_ModBody___OpenKeyword_3_5_0_InKeyword_3_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModBody___OpenKeyword_5_7_0_InKeyword_5_7_2__q.equals(syntax))
				emit_ModBody___OpenKeyword_5_7_0_InKeyword_5_7_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ModDef_SemicolonKeyword_4_a.equals(syntax))
				emit_ModDef_SemicolonKeyword_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperDef_SemicolonKeyword_0_3_1_3_2_q.equals(syntax))
				emit_OperDef_SemicolonKeyword_0_3_1_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperDef_SemicolonKeyword_1_4_1_1_3_2_q.equals(syntax))
				emit_OperDef_SemicolonKeyword_1_4_1_1_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperDef_SemicolonKeyword_2_6_2_q.equals(syntax))
				emit_OperDef_SemicolonKeyword_2_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParDef_VerticalLineKeyword_0_2_2_q.equals(syntax))
				emit_ParDef_VerticalLineKeyword_0_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt1_HyphenMinusKeyword_3_0_q.equals(syntax))
				emit_Patt1_HyphenMinusKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt2_DoubleTerminalRuleCall_4_1_or_IntegerTerminalRuleCall_3_1_or_QuestionMarkKeyword_9_1_or_StringTerminalRuleCall_5_1_or__Keyword_0_1.equals(syntax))
				emit_Patt2_DoubleTerminalRuleCall_4_1_or_IntegerTerminalRuleCall_3_1_or_QuestionMarkKeyword_9_1_or_StringTerminalRuleCall_5_1_or__Keyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Patt_PlusSignKeyword_1_0_1_or_VerticalLineKeyword_1_0_0.equals(syntax))
				emit_Patt_PlusSignKeyword_1_0_1_or_VerticalLineKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '|'?
	 */
	protected void emit_DataDef_VerticalLineKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '**' | '!' | '*'
	 */
	protected void emit_Exp3_AsteriskAsteriskKeyword_0_1_0_2_or_AsteriskKeyword_0_1_0_1_or_ExclamationMarkKeyword_0_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!' | '**' | '*'
	 */
	protected void emit_Exp3_AsteriskAsteriskKeyword_1_2_0_2_or_AsteriskKeyword_1_2_0_1_or_ExclamationMarkKeyword_1_2_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Integer?
	 */
	protected void emit_Exp6_IntegerTerminalRuleCall_6_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '**' | '*' | '!'
	 */
	protected void emit_Exp_AsteriskAsteriskKeyword_5_1_0_0_0_2_or_AsteriskKeyword_5_1_0_0_0_1_or_ExclamationMarkKeyword_5_1_0_0_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '*' | '**' | '!'
	 */
	protected void emit_Exp_AsteriskAsteriskKeyword_6_2_0_2_or_AsteriskKeyword_6_2_0_1_or_ExclamationMarkKeyword_6_2_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '**'?
	 */
	protected void emit_ModBody_AsteriskAsteriskKeyword_0_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('**'? ('open' 'in')? '{' '}')?
	 */
	protected void emit_ModBody___AsteriskAsteriskKeyword_0_1_1_q___OpenKeyword_0_2_0_InKeyword_0_2_2__q_LeftCurlyBracketKeyword_0_3_RightCurlyBracketKeyword_0_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('open' 'in')?
	 */
	protected void emit_ModBody___OpenKeyword_0_2_0_InKeyword_0_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('open' 'in')?
	 */
	protected void emit_ModBody___OpenKeyword_3_5_0_InKeyword_3_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('open' 'in')?
	 */
	protected void emit_ModBody___OpenKeyword_5_7_0_InKeyword_5_7_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_OperDef_SemicolonKeyword_0_3_1_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_OperDef_SemicolonKeyword_1_4_1_1_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_OperDef_SemicolonKeyword_2_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '|'?
	 */
	protected void emit_ParDef_VerticalLineKeyword_0_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_Patt1_HyphenMinusKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     String | '?' | Integer | '_' | Double
	 */
	protected void emit_Patt2_DoubleTerminalRuleCall_4_1_or_IntegerTerminalRuleCall_3_1_or_QuestionMarkKeyword_9_1_or_StringTerminalRuleCall_5_1_or__Keyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '+' | '|'
	 */
	protected void emit_Patt_PlusSignKeyword_1_0_1_or_VerticalLineKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
