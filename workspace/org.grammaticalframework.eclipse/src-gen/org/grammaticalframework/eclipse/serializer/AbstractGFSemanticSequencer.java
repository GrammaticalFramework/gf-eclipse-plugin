package org.grammaticalframework.eclipse.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.grammaticalframework.eclipse.gF.Altern;
import org.grammaticalframework.eclipse.gF.Arg;
import org.grammaticalframework.eclipse.gF.Bind;
import org.grammaticalframework.eclipse.gF.Case;
import org.grammaticalframework.eclipse.gF.CatDef;
import org.grammaticalframework.eclipse.gF.DDecl;
import org.grammaticalframework.eclipse.gF.DataDef;
import org.grammaticalframework.eclipse.gF.DefDef;
import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.Exp1;
import org.grammaticalframework.eclipse.gF.Exp2;
import org.grammaticalframework.eclipse.gF.Exp3;
import org.grammaticalframework.eclipse.gF.Exp4;
import org.grammaticalframework.eclipse.gF.ExpLF13;
import org.grammaticalframework.eclipse.gF.Exps;
import org.grammaticalframework.eclipse.gF.FlagDef;
import org.grammaticalframework.eclipse.gF.FunDef;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Included;
import org.grammaticalframework.eclipse.gF.Inst;
import org.grammaticalframework.eclipse.gF.Label;
import org.grammaticalframework.eclipse.gF.LinDef;
import org.grammaticalframework.eclipse.gF.ListBind;
import org.grammaticalframework.eclipse.gF.ListCase;
import org.grammaticalframework.eclipse.gF.ListExp;
import org.grammaticalframework.eclipse.gF.ListIncluded;
import org.grammaticalframework.eclipse.gF.ListInst;
import org.grammaticalframework.eclipse.gF.ListLocDef;
import org.grammaticalframework.eclipse.gF.ListOpen;
import org.grammaticalframework.eclipse.gF.ListPatt;
import org.grammaticalframework.eclipse.gF.ListPattAss;
import org.grammaticalframework.eclipse.gF.ListPattTupleComp;
import org.grammaticalframework.eclipse.gF.ListTupleComp;
import org.grammaticalframework.eclipse.gF.LocDef;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.ModContent;
import org.grammaticalframework.eclipse.gF.ModOpen;
import org.grammaticalframework.eclipse.gF.ModType;
import org.grammaticalframework.eclipse.gF.Name;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.OperDef;
import org.grammaticalframework.eclipse.gF.ParConstr;
import org.grammaticalframework.eclipse.gF.ParamDef;
import org.grammaticalframework.eclipse.gF.Patt;
import org.grammaticalframework.eclipse.gF.PattAss;
import org.grammaticalframework.eclipse.gF.SourceModule;
import org.grammaticalframework.eclipse.gF.TermDef;
import org.grammaticalframework.eclipse.gF.TopDef;
import org.grammaticalframework.eclipse.services.GFGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractGFSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected GFGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GFPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GFPackage.ALTERN:
				if(context == grammarAccess.getAlternRule()) {
					sequence_Altern(context, (Altern) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.ARG:
				if(context == grammarAccess.getArgRule()) {
					sequence_Arg(context, (Arg) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.BIND:
				if(context == grammarAccess.getBindRule()) {
					sequence_Bind(context, (Bind) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.CASE:
				if(context == grammarAccess.getCaseRule()) {
					sequence_Case(context, (Case) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.CAT_DEF:
				if(context == grammarAccess.getCatDefRule()) {
					sequence_CatDef(context, (CatDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.DDECL:
				if(context == grammarAccess.getDDeclRule()) {
					sequence_DDecl(context, (DDecl) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.DATA_DEF:
				if(context == grammarAccess.getDataDefRule()) {
					sequence_DataDef(context, (DataDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.DEF_DEF:
				if(context == grammarAccess.getDefDefRule()) {
					sequence_DefDef(context, (DefDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.DOUBLE:
				if(context == grammarAccess.getPattRule() ||
				   context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule() ||
				   context == grammarAccess.getPatt2LFRule() ||
				   context == grammarAccess.getPatt3Rule() ||
				   context == grammarAccess.getPattArgRule() ||
				   context == grammarAccess.getPattAccess().getPattLeftAction_1_0()) {
					sequence_Patt(context, (org.grammaticalframework.eclipse.gF.Double) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExp1Rule() ||
				   context == grammarAccess.getExp1Access().getExp1LeftAction_1_0() ||
				   context == grammarAccess.getExp2Rule() ||
				   context == grammarAccess.getExp2Access().getExp2LeftAction_1_0() ||
				   context == grammarAccess.getExp3Rule() ||
				   context == grammarAccess.getExp3LFRule() ||
				   context == grammarAccess.getExp3Access().getExp3LeftAction_1_0() ||
				   context == grammarAccess.getExp4Rule() ||
				   context == grammarAccess.getExp4LFRule() ||
				   context == grammarAccess.getExp4Access().getExp4LeftAction_1_0() ||
				   context == grammarAccess.getExp5Rule() ||
				   context == grammarAccess.getExpLF_AfterExp3Rule() ||
				   context == grammarAccess.getExpLF_Exp1or3Rule() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_1_0() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_1_0()) {
					sequence_Exp5(context, (Exp) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDDeclRule() ||
				   context == grammarAccess.getExp6Rule() ||
				   context == grammarAccess.getPattRule() ||
				   context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule() ||
				   context == grammarAccess.getPatt2LFRule() ||
				   context == grammarAccess.getPatt3Rule() ||
				   context == grammarAccess.getPattArgRule() ||
				   context == grammarAccess.getPattAccess().getPattLeftAction_1_0()) {
					sequence_Exp6(context, (Exp) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP1:
				if(context == grammarAccess.getExp1Rule() ||
				   context == grammarAccess.getExp1Access().getExp1LeftAction_1_0()) {
					sequence_Exp1(context, (Exp1) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP2:
				if(context == grammarAccess.getExp1Rule() ||
				   context == grammarAccess.getExp1Access().getExp1LeftAction_1_0() ||
				   context == grammarAccess.getExp2Rule() ||
				   context == grammarAccess.getExp2Access().getExp2LeftAction_1_0()) {
					sequence_Exp2(context, (Exp2) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP3:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExp1Rule() ||
				   context == grammarAccess.getExp1Access().getExp1LeftAction_1_0() ||
				   context == grammarAccess.getExp2Rule() ||
				   context == grammarAccess.getExp2Access().getExp2LeftAction_1_0() ||
				   context == grammarAccess.getExp3Rule() ||
				   context == grammarAccess.getExp3Access().getExp3LeftAction_1_0() ||
				   context == grammarAccess.getExpLF_AfterExp3Rule() ||
				   context == grammarAccess.getExpLF_Exp1or3Rule() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_1_0() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_1_0()) {
					sequence_Exp3(context, (Exp3) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP4:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExp1Rule() ||
				   context == grammarAccess.getExp1Access().getExp1LeftAction_1_0() ||
				   context == grammarAccess.getExp2Rule() ||
				   context == grammarAccess.getExp2Access().getExp2LeftAction_1_0() ||
				   context == grammarAccess.getExp3Rule() ||
				   context == grammarAccess.getExp3LFRule() ||
				   context == grammarAccess.getExp3Access().getExp3LeftAction_1_0() ||
				   context == grammarAccess.getExp4Rule() ||
				   context == grammarAccess.getExp4Access().getExp4LeftAction_1_0() ||
				   context == grammarAccess.getExpLF_AfterExp3Rule() ||
				   context == grammarAccess.getExpLF_Exp1or3Rule() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_1_0() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_1_0()) {
					sequence_Exp4(context, (Exp4) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP_LF13:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpLF_AfterExp3Rule() ||
				   context == grammarAccess.getExpLF_Exp1or3Rule()) {
					sequence_ExpLF_Exp1or3(context, (ExpLF13) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_1_0()) {
					sequence_ExpLF_Exp1or3_ExpLF13_1_0_0_0_ExpLF13_1_0_1_0(context, (ExpLF13) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXPS:
				if(context == grammarAccess.getExpsRule()) {
					sequence_Exps(context, (Exps) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.FLAG_DEF:
				if(context == grammarAccess.getFlagDefRule()) {
					sequence_FlagDef(context, (FlagDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.FUN_DEF:
				if(context == grammarAccess.getFunDefRule()) {
					sequence_FunDef(context, (FunDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.IDENT:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExp1Rule() ||
				   context == grammarAccess.getExp1Access().getExp1LeftAction_1_0() ||
				   context == grammarAccess.getExp2Rule() ||
				   context == grammarAccess.getExp2Access().getExp2LeftAction_1_0() ||
				   context == grammarAccess.getExp3Rule() ||
				   context == grammarAccess.getExp3LFRule() ||
				   context == grammarAccess.getExp3Access().getExp3LeftAction_1_0() ||
				   context == grammarAccess.getExp4Rule() ||
				   context == grammarAccess.getExp4LFRule() ||
				   context == grammarAccess.getExp4Access().getExp4LeftAction_1_0() ||
				   context == grammarAccess.getExpLF_AfterExp3Rule() ||
				   context == grammarAccess.getExpLF_Exp1or3Rule() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_0_1_0() ||
				   context == grammarAccess.getExpLF_Exp1or3Access().getExpLF13LeftAction_1_1_0()) {
					sequence_Exp4LF(context, (Ident) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIdentRule()) {
					sequence_Ident(context, (Ident) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.INCLUDED:
				if(context == grammarAccess.getIncludedRule()) {
					sequence_Included(context, (Included) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.INST:
				if(context == grammarAccess.getInstRule()) {
					sequence_Inst(context, (Inst) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.INTEGER:
				if(context == grammarAccess.getPattRule() ||
				   context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule() ||
				   context == grammarAccess.getPatt2LFRule() ||
				   context == grammarAccess.getPatt3Rule() ||
				   context == grammarAccess.getPattArgRule() ||
				   context == grammarAccess.getPattAccess().getPattLeftAction_1_0()) {
					sequence_Patt(context, (org.grammaticalframework.eclipse.gF.Integer) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LABEL:
				if(context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIN_DEF:
				if(context == grammarAccess.getLinDefRule()) {
					sequence_LinDef(context, (LinDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_BIND:
				if(context == grammarAccess.getListBindRule()) {
					sequence_ListBind(context, (ListBind) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_CASE:
				if(context == grammarAccess.getListCaseRule()) {
					sequence_ListCase(context, (ListCase) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_EXP:
				if(context == grammarAccess.getListExpRule()) {
					sequence_ListExp(context, (ListExp) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_INCLUDED:
				if(context == grammarAccess.getListIncludedRule()) {
					sequence_ListIncluded(context, (ListIncluded) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_INST:
				if(context == grammarAccess.getListInstRule()) {
					sequence_ListInst(context, (ListInst) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_LOC_DEF:
				if(context == grammarAccess.getExpLF_AfterExp3Rule() ||
				   context == grammarAccess.getListLocDefRule()) {
					sequence_ListLocDef(context, (ListLocDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_OPEN:
				if(context == grammarAccess.getListOpenRule()) {
					sequence_ListOpen(context, (ListOpen) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_PATT:
				if(context == grammarAccess.getListPattRule()) {
					sequence_ListPatt(context, (ListPatt) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_PATT_ASS:
				if(context == grammarAccess.getListPattAssRule() ||
				   context == grammarAccess.getPattRule() ||
				   context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule() ||
				   context == grammarAccess.getPatt2LFRule() ||
				   context == grammarAccess.getPatt3Rule() ||
				   context == grammarAccess.getPattArgRule() ||
				   context == grammarAccess.getPattAccess().getPattLeftAction_1_0()) {
					sequence_ListPattAss(context, (ListPattAss) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_PATT_TUPLE_COMP:
				if(context == grammarAccess.getListPattTupleCompRule() ||
				   context == grammarAccess.getPattRule() ||
				   context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule() ||
				   context == grammarAccess.getPatt2LFRule() ||
				   context == grammarAccess.getPatt3Rule() ||
				   context == grammarAccess.getPattArgRule() ||
				   context == grammarAccess.getPattAccess().getPattLeftAction_1_0()) {
					sequence_ListPattTupleComp(context, (ListPattTupleComp) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_TUPLE_COMP:
				if(context == grammarAccess.getListTupleCompRule()) {
					sequence_ListTupleComp(context, (ListTupleComp) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LOC_DEF:
				if(context == grammarAccess.getLocDefRule()) {
					sequence_LocDef(context, (LocDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.MOD_BODY:
				if(context == grammarAccess.getModBodyRule()) {
					sequence_ModBody(context, (ModBody) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getModHeaderBodyRule()) {
					sequence_ModHeaderBody(context, (ModBody) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.MOD_CONTENT:
				if(context == grammarAccess.getModContentRule()) {
					sequence_ModContent(context, (ModContent) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.MOD_OPEN:
				if(context == grammarAccess.getModOpenRule()) {
					sequence_ModOpen(context, (ModOpen) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.MOD_TYPE:
				if(context == grammarAccess.getModTypeRule()) {
					sequence_ModType(context, (ModType) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.NAME:
				if(context == grammarAccess.getNameRule()) {
					sequence_Name(context, (Name) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.OPEN:
				if(context == grammarAccess.getOpenRule()) {
					sequence_Open(context, (Open) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.OPER_DEF:
				if(context == grammarAccess.getOperDefRule()) {
					sequence_OperDef(context, (OperDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PAR_CONSTR:
				if(context == grammarAccess.getParConstrRule()) {
					sequence_ParConstr(context, (ParConstr) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PARAM_DEF:
				if(context == grammarAccess.getParamDefRule()) {
					sequence_ParamDef(context, (ParamDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PATT:
				if(context == grammarAccess.getPatt2Rule() ||
				   context == grammarAccess.getPatt2LFRule() ||
				   context == grammarAccess.getPattArgRule()) {
					sequence_Patt1(context, (Patt) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPatt1Rule()) {
					sequence_Patt1(context, (Patt) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPattRule() ||
				   context == grammarAccess.getPattAccess().getPattLeftAction_1_0()) {
					sequence_Patt1(context, (Patt) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPatt3Rule()) {
					sequence_Patt(context, (Patt) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PATT_ASS:
				if(context == grammarAccess.getPattAssRule()) {
					sequence_PattAss(context, (PattAss) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.SOURCE_MODULE:
				if(context == grammarAccess.getModDefRule() ||
				   context == grammarAccess.getSourceModuleRule()) {
					sequence_ModDef(context, (SourceModule) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getModHeaderRule()) {
					sequence_ModHeader(context, (SourceModule) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.STRING:
				if(context == grammarAccess.getPattRule() ||
				   context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule() ||
				   context == grammarAccess.getPatt2LFRule() ||
				   context == grammarAccess.getPatt3Rule() ||
				   context == grammarAccess.getPattArgRule() ||
				   context == grammarAccess.getPattAccess().getPattLeftAction_1_0()) {
					sequence_Patt(context, (org.grammaticalframework.eclipse.gF.String) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.TERM_DEF:
				if(context == grammarAccess.getTermDefRule()) {
					sequence_TermDef(context, (TermDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.TOP_DEF:
				if(context == grammarAccess.getTopDefRule()) {
					sequence_TopDef(context, (TopDef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (alt1=Exp alt2=Exp)
	 */
	protected void sequence_Altern(EObject context, Altern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.ALTERN__ALT1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.ALTERN__ALT1));
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.ALTERN__ALT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.ALTERN__ALT2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlternAccess().getAlt1ExpParserRuleCall_0_0(), semanticObject.getAlt1());
		feeder.accept(grammarAccess.getAlternAccess().getAlt2ExpParserRuleCall_2_0(), semanticObject.getAlt2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Ident | wildcard?='_' | name+=Ident+)
	 */
	protected void sequence_Arg(EObject context, Arg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Ident | wildcard?='_' | (name+=Ident name+=Ident*))
	 */
	protected void sequence_Bind(EObject context, Bind semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pattern=Patt right=Exp)
	 */
	protected void sequence_Case(EObject context, Case semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.CASE__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.CASE__PATTERN));
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.CASE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.CASE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCaseAccess().getPatternPattParserRuleCall_0_0(), semanticObject.getPattern());
		feeder.accept(grammarAccess.getCaseAccess().getRightExpParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name=Ident context+=DDecl*) | (list?='[' name=Ident context+=DDecl* size=Integer?))
	 */
	protected void sequence_CatDef(EObject context, CatDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bindList=ListBind e=Exp)
	 */
	protected void sequence_DDecl(EObject context, DDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.DDECL__BIND_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.DDECL__BIND_LIST));
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.DDECL__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.DDECL__E));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDDeclAccess().getBindListListBindParserRuleCall_0_1_0(), semanticObject.getBindList());
		feeder.accept(grammarAccess.getDDeclAccess().getEExpParserRuleCall_0_3_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name+=Ident constructors+=Ident constructors+=Ident*) | (name+=Ident name+=Ident* type=Exp))
	 */
	protected void sequence_DataDef(EObject context, DataDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name+=Name name+=Name* definition=Exp) | (name+=Name patternList=ListPatt definition=Exp))
	 */
	protected void sequence_DefDef(EObject context, DefDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Exp1_Exp1_1_0 right=Exp2)
	 */
	protected void sequence_Exp1(EObject context, Exp1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Exp2_Exp2_1_0 right=Exp3)
	 */
	protected void sequence_Exp2(EObject context, Exp2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Exp3_Exp3_1_0 right=Exp4)
	 */
	protected void sequence_Exp3(EObject context, Exp3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (s=ID alts+=Altern alts+=Altern*)
	 */
	protected void sequence_Exp4LF(EObject context, Ident semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Exp4_Exp4_1_0 (right=Exp5 | right=Exp))
	 */
	protected void sequence_Exp4(EObject context, Exp4 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             name=[Ident|ID] | 
	 *             sort?=Sort | 
	 *             string?=String | 
	 *             integer?=Integer | 
	 *             double?=Double | 
	 *             meta?='?' | 
	 *             emptyString?='[' | 
	 *             (listCat?='[' category=[Ident|ID] list=Exps) | 
	 *             tokenList?='[' | 
	 *             (record?='{' defList=ListLocDef) | 
	 *             (tuple?='<' (tupleList=ListTupleComp | (v=Exp type=Exp))) | 
	 *             (identity?='(' v=Exp)
	 *         ) 
	 *         labels+=Label*
	 *     )
	 */
	protected void sequence_Exp5(EObject context, Exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=[Ident|ID] | 
	 *         sort?=Sort | 
	 *         string?=String | 
	 *         integer?=Integer | 
	 *         double?=Double | 
	 *         meta?='?' | 
	 *         emptyString?='[' | 
	 *         (listCat?='[' category=[Ident|ID] list=Exps) | 
	 *         tokenList?='[' | 
	 *         (record?='{' defList=ListLocDef) | 
	 *         (tuple?='<' (tupleList=ListTupleComp | (v=Exp type=Exp))) | 
	 *         (identity?='(' v=Exp)
	 *     )
	 */
	protected void sequence_Exp6(EObject context, Exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=ExpLF_Exp1or3_ExpLF13_1_0_1_0 right=Exp) | 
	 *         (left=ExpLF_Exp1or3_ExpLF13_1_0_0_0 right=Exp3) | 
	 *         (left=ExpLF_Exp1or3_ExpLF13_1_1_0 right=ExpLF_AfterExp3)
	 *     )
	 */
	protected void sequence_ExpLF_Exp1or3(EObject context, ExpLF13 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ExpLF_Exp1or3_ExpLF13_1_0_0_0 right=Exp3)
	 */
	protected void sequence_ExpLF_Exp1or3_ExpLF13_1_0_0_0_ExpLF13_1_0_1_0(EObject context, ExpLF13 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=Exp6*)
	 */
	protected void sequence_Exps(EObject context, Exps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident value=Ident?)
	 */
	protected void sequence_FlagDef(EObject context, FlagDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Ident name+=Ident* type=Exp)
	 */
	protected void sequence_FunDef(EObject context, FunDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     s=ID
	 */
	protected void sequence_Ident(EObject context, Ident semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident | (name=Ident inclusive?='[' includes+=Ident includes+=Ident*) | (name=Ident exclusive?='-' excludes+=Ident excludes+=Ident*))
	 */
	protected void sequence_Included(EObject context, Included semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interface=Ident name=Ident)
	 */
	protected void sequence_Inst(EObject context, Inst semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.INST__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.INST__INTERFACE));
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.INST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.INST__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstAccess().getInterfaceIdentParserRuleCall_1_0(), semanticObject.getInterface());
		feeder.accept(grammarAccess.getInstAccess().getNameIdentParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident | index=Integer)
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name+=Name name+=Name* definition=Exp) | (name+=Name args+=Arg+ definition=Exp))
	 */
	protected void sequence_LinDef(EObject context, LinDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bindings+=Bind bindings+=Bind*)
	 */
	protected void sequence_ListBind(EObject context, ListBind semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=Case cases+=Case*)
	 */
	protected void sequence_ListCase(EObject context, ListCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expressions+=Exp expressions+=Exp*)?)
	 */
	protected void sequence_ListExp(EObject context, ListExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (included+=Included included+=Included*)
	 */
	protected void sequence_ListIncluded(EObject context, ListIncluded semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instantiations+=Inst instantiations+=Inst*)
	 */
	protected void sequence_ListInst(EObject context, ListInst semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((localDefinitions+=LocDef localDefinitions+=LocDef*)?)
	 */
	protected void sequence_ListLocDef(EObject context, ListLocDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opens+=Open opens+=Open*)
	 */
	protected void sequence_ListOpen(EObject context, ListOpen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((assignments+=PattAss assignments+=PattAss*)?)
	 */
	protected void sequence_ListPattAss(EObject context, ListPattAss semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((patterns+=Patt patterns+=Patt*)?)
	 */
	protected void sequence_ListPattTupleComp(EObject context, ListPattTupleComp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     patterns+=PattArg+
	 */
	protected void sequence_ListPatt(EObject context, ListPatt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=Exp elements+=Exp*)?)
	 */
	protected void sequence_ListTupleComp(EObject context, ListTupleComp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name+=Ident name+=Ident* type=Exp value=Exp?) | (name+=Ident name+=Ident* value=Exp))
	 */
	protected void sequence_LocDef(EObject context, LocDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (extendList=ListIncluded (functor=Included functorInstantiation?='with' instantiationList=ListInst)? modContent=ModContent?) | 
	 *         (functor=Included functorInstantiation?='with' instantiationList=ListInst modContent=ModContent?) | 
	 *         modContent=ModContent
	 *     )
	 */
	protected void sequence_ModBody(EObject context, ModBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (judgements+=TopDef*)
	 */
	protected void sequence_ModContent(EObject context, ModContent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (incomplete?='incomplete'? type=ModType body=ModBody)
	 */
	protected void sequence_ModDef(EObject context, SourceModule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (extendList=ListIncluded (functor=Included functorInstantiation?='with' instantiationList=ListInst)? modOpen=ModOpen?) | 
	 *         (functor=Included functorInstantiation?='with' instantiationList=ListInst modOpen=ModOpen?) | 
	 *         modOpen=ModOpen
	 *     )
	 */
	protected void sequence_ModHeaderBody(EObject context, ModBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (incomplete?='incomplete'? type=ModType body=ModHeaderBody)
	 */
	protected void sequence_ModHeader(EObject context, SourceModule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (openList=ListOpen?)
	 */
	protected void sequence_ModOpen(EObject context, ModOpen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (abstract?='abstract' name=Ident) | 
	 *         (resource?='resource' name=Ident) | 
	 *         (interface?='interface' name=Ident) | 
	 *         (concrete?='concrete' name=Ident abstractName=Ident) | 
	 *         (instance?='instance' name=Ident interfaceInclude=Included)
	 *     )
	 */
	protected void sequence_ModType(EObject context, ModType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident | name=Ident)
	 */
	protected void sequence_Name(EObject context, Name semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident | (alias=Ident name=Ident))
	 */
	protected void sequence_Open(EObject context, Open semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name+=Name name+=Name* type=Exp (definition=Exp | (overload?='overload' overloads+=DefDef overloads+=DefDef*))?) | 
	 *         (name+=Name name+=Name* (definition=Exp | (overload?='overload' overloads+=DefDef overloads+=DefDef*))) | 
	 *         (name+=Name args+=Arg+ definition=Exp)
	 *     )
	 */
	protected void sequence_OperDef(EObject context, OperDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident constructors+=DDecl*)
	 */
	protected void sequence_ParConstr(EObject context, ParConstr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident (constructors+=ParConstr constructors+=ParConstr*)?)
	 */
	protected void sequence_ParamDef(EObject context, ParamDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         meta?='?' | 
	 *         tokenList?='[' | 
	 *         (name=Ident label=Ident?) | 
	 *         wildcard?='_' | 
	 *         (name=Ident value=Patt3) | 
	 *         (left=Patt_Patt_1_0 (or?='|' | and?='+') right=Patt1)
	 *     )
	 */
	protected void sequence_Patt1(EObject context, Patt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Ident name+=Ident* value=Patt)
	 */
	protected void sequence_PattAss(EObject context, PattAss semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Double}
	 */
	protected void sequence_Patt(EObject context, org.grammaticalframework.eclipse.gF.Double semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Integer}
	 */
	protected void sequence_Patt(EObject context, org.grammaticalframework.eclipse.gF.Integer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=Patt_Patt_1_0 (or?='|' | and?='+') right=Patt1) | (name=Ident value=Patt3))
	 */
	protected void sequence_Patt(EObject context, Patt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {String}
	 */
	protected void sequence_Patt(EObject context, org.grammaticalframework.eclipse.gF.String semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Name name+=Name* definition=Exp)
	 */
	protected void sequence_TermDef(EObject context, TermDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (cat?='cat' definitions+=CatDef+) | 
	 *         (fun?='fun' definitions+=FunDef+) | 
	 *         (def?='def' definitions+=DefDef+) | 
	 *         (data?='data' definitions+=DataDef+) | 
	 *         (param?='param' definitions+=ParamDef+) | 
	 *         (oper?='oper' definitions+=OperDef+) | 
	 *         (lincat?='lincat' definitions+=TermDef+) | 
	 *         (lindef?='lindef' definitions+=TermDef+) | 
	 *         (lin?='lin' definitions+=LinDef+) | 
	 *         (printname?='printname' definitions+=TermDef+) | 
	 *         (printname?='printname' definitions+=TermDef+) | 
	 *         (flags?='flags' definitions+=FlagDef+)
	 *     )
	 */
	protected void sequence_TopDef(EObject context, TopDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
