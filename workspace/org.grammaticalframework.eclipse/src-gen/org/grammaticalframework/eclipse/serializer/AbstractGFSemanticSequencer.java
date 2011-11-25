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
import org.grammaticalframework.eclipse.gF.Bind;
import org.grammaticalframework.eclipse.gF.Case;
import org.grammaticalframework.eclipse.gF.CatDef;
import org.grammaticalframework.eclipse.gF.DDecl;
import org.grammaticalframework.eclipse.gF.DataConstr;
import org.grammaticalframework.eclipse.gF.DataDef;
import org.grammaticalframework.eclipse.gF.Def;
import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.Exp1;
import org.grammaticalframework.eclipse.gF.Exp2;
import org.grammaticalframework.eclipse.gF.Exp3;
import org.grammaticalframework.eclipse.gF.Exp4;
import org.grammaticalframework.eclipse.gF.Exp5;
import org.grammaticalframework.eclipse.gF.Exp6;
import org.grammaticalframework.eclipse.gF.Exps;
import org.grammaticalframework.eclipse.gF.FlagDef;
import org.grammaticalframework.eclipse.gF.FunDef;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Included;
import org.grammaticalframework.eclipse.gF.Label;
import org.grammaticalframework.eclipse.gF.ListBind;
import org.grammaticalframework.eclipse.gF.ListCase;
import org.grammaticalframework.eclipse.gF.ListExp;
import org.grammaticalframework.eclipse.gF.ListLocDef;
import org.grammaticalframework.eclipse.gF.ListPatt;
import org.grammaticalframework.eclipse.gF.ListPattAss;
import org.grammaticalframework.eclipse.gF.ListPattTupleComp;
import org.grammaticalframework.eclipse.gF.ListTupleComp;
import org.grammaticalframework.eclipse.gF.LocDef;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.ModDef;
import org.grammaticalframework.eclipse.gF.ModType;
import org.grammaticalframework.eclipse.gF.Name;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.ParConstr;
import org.grammaticalframework.eclipse.gF.ParDef;
import org.grammaticalframework.eclipse.gF.Patt;
import org.grammaticalframework.eclipse.gF.Patt1;
import org.grammaticalframework.eclipse.gF.Patt2;
import org.grammaticalframework.eclipse.gF.PattAss;
import org.grammaticalframework.eclipse.gF.PrintDef;
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
			case GFPackage.DATA_CONSTR:
				if(context == grammarAccess.getDataConstrRule()) {
					sequence_DataConstr(context, (DataConstr) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.DATA_DEF:
				if(context == grammarAccess.getDataDefRule()) {
					sequence_DataDef(context, (DataDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.DEF:
				if(context == grammarAccess.getDefRule()) {
					sequence_Def(context, (Def) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOperDefRule()) {
					sequence_OperDef(context, (Def) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP:
				if(context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getTupleCompRule()) {
					sequence_Exp(context, (Exp) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP1:
				if(context == grammarAccess.getExp1Rule()) {
					sequence_Exp1(context, (Exp1) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP2:
				if(context == grammarAccess.getExp2Rule()) {
					sequence_Exp2(context, (Exp2) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP3:
				if(context == grammarAccess.getExp3Rule()) {
					sequence_Exp3(context, (Exp3) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP4:
				if(context == grammarAccess.getExp4Rule()) {
					sequence_Exp4(context, (Exp4) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP5:
				if(context == grammarAccess.getExp5Rule()) {
					sequence_Exp5(context, (Exp5) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.EXP6:
				if(context == grammarAccess.getDDeclRule() ||
				   context == grammarAccess.getExp6Rule()) {
					sequence_Exp6(context, (Exp6) semanticObject); 
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
				if(context == grammarAccess.getIdentRule()) {
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
			case GFPackage.LABEL:
				if(context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
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
			case GFPackage.LIST_LOC_DEF:
				if(context == grammarAccess.getListLocDefRule()) {
					sequence_ListLocDef(context, (ListLocDef) semanticObject); 
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
				   context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule()) {
					sequence_ListPattAss(context, (ListPattAss) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.LIST_PATT_TUPLE_COMP:
				if(context == grammarAccess.getListPattTupleCompRule() ||
				   context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule()) {
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
				else break;
			case GFPackage.MOD_DEF:
				if(context == grammarAccess.getModDefRule()) {
					sequence_ModDef(context, (ModDef) semanticObject); 
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
			case GFPackage.PAR_CONSTR:
				if(context == grammarAccess.getParConstrRule()) {
					sequence_ParConstr(context, (ParConstr) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PAR_DEF:
				if(context == grammarAccess.getParDefRule()) {
					sequence_ParDef(context, (ParDef) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PATT:
				if(context == grammarAccess.getPattRule() ||
				   context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule() ||
				   context == grammarAccess.getPattTupleCompRule()) {
					sequence_Patt(context, (Patt) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PATT1:
				if(context == grammarAccess.getPatt1Rule()) {
					sequence_Patt1(context, (Patt1) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PATT2:
				if(context == grammarAccess.getPatt1Rule() ||
				   context == grammarAccess.getPatt2Rule()) {
					sequence_Patt2(context, (Patt2) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PATT_ASS:
				if(context == grammarAccess.getPattAssRule()) {
					sequence_PattAss(context, (PattAss) semanticObject); 
					return; 
				}
				else break;
			case GFPackage.PRINT_DEF:
				if(context == grammarAccess.getPrintDefRule()) {
					sequence_PrintDef(context, (PrintDef) semanticObject); 
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
	 *     {Bind}
	 *
	 * Features:
	 */
	protected void sequence_Bind(EObject context, Bind semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pattern=Patt e=Exp)
	 *
	 * Features:
	 *    pattern[1, 1]
	 *    e[1, 1]
	 */
	protected void sequence_Case(EObject context, Case semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.CASE__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.CASE__PATTERN));
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.CASE__E) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.CASE__E));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCaseAccess().getPatternPattParserRuleCall_0_0(), semanticObject.getPattern());
		feeder.accept(grammarAccess.getCaseAccess().getEExpParserRuleCall_2_0(), semanticObject.getE());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name=Ident context+=DDecl*) | (name=Ident context+=DDecl* size=Integer?))
	 *
	 * Features:
	 *    name[0, 2]
	 *    context[0, *]
	 *    size[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET context
	 */
	protected void sequence_CatDef(EObject context, CatDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bindList=ListBind e=Exp)
	 *
	 * Features:
	 *    bindList[1, 1]
	 *    e[1, 1]
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
	 *     (name=Ident | (module=Ident name=Ident))
	 *
	 * Features:
	 *    name[0, 2]
	 *    module[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 */
	protected void sequence_DataConstr(EObject context, DataConstr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident (constructors+=DataConstr constructors+=DataConstr*)?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    constructors[0, *]
	 */
	protected void sequence_DataDef(EObject context, DataDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name+=Name name+=Name* definition=Exp) | (name+=Name name+=Name* type=Exp definition=Exp?) | (name+=Name patterns=ListPatt definition=Exp))
	 *
	 * Features:
	 *    name[0, *]
	 *    definition[0, 3]
	 *    type[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         MANDATORY_IF_SET name
	 *         MANDATORY_IF_SET definition
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET definition
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET patterns
	 *         EXCLUDE_IF_SET definition
	 *    patterns[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_UNSET definition
	 *         MANDATORY_IF_SET definition
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET definition
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET definition
	 */
	protected void sequence_Def(EObject context, Def semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (v=Exp2 e+=Exp1?)
	 *
	 * Features:
	 *    v[1, 1]
	 *    e[0, 1]
	 */
	protected void sequence_Exp1(EObject context, Exp1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (v=Exp3 e+=Exp2?)
	 *
	 * Features:
	 *    v[1, 1]
	 *    e[0, 1]
	 */
	protected void sequence_Exp2(EObject context, Exp2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((v=Exp4 e+=Exp4*) | (v=Patt2 e+=Exp4*))
	 *
	 * Features:
	 *    v[0, 2]
	 *    e[0, *]
	 */
	protected void sequence_Exp3(EObject context, Exp3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (caseList=ListCase args+=Exp5*) | 
	 *         (argType=Exp6 (caseList=ListCase | expList=ListExp) args+=Exp5*) | 
	 *         (caseOf=Exp caseList=ListCase args+=Exp5*) | 
	 *         (expList=ListExp args+=Exp5*) | 
	 *         (caseList=ListCase args+=Exp5*) | 
	 *         (name=[Ident|ID] args+=Exp5*) | 
	 *         (name=[Ident|ID] inner=Exp6 args+=Exp5*) | 
	 *         (v=Exp5 args+=Exp5*)
	 *     )
	 *
	 * Features:
	 *    caseList[0, 4]
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET inner
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET args
	 *    args[0, *]
	 *    argType[0, 1]
	 *         MANDATORY_IF_SET caseList
	 *         MANDATORY_IF_SET expList
	 *         MANDATORY_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseOf
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET inner
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET args
	 *    expList[0, 2]
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseOf
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET inner
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET args
	 *    caseOf[0, 1]
	 *         EXCLUDE_IF_UNSET caseList
	 *         MANDATORY_IF_SET caseList
	 *         MANDATORY_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET argType
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET inner
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET args
	 *    name[0, 2]
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET argType
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseOf
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET args
	 *    inner[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         MANDATORY_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET argType
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseOf
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET args
	 *    v[0, 1]
	 *         MANDATORY_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET argType
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseOf
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET expList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET caseList
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET args
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET inner
	 *         EXCLUDE_IF_SET args
	 */
	protected void sequence_Exp4(EObject context, Exp4 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (v=Exp6 label+=Label*)
	 *
	 * Features:
	 *    v[1, 1]
	 *    label[0, *]
	 */
	protected void sequence_Exp5(EObject context, Exp5 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=[Ident|ID] | 
	 *         sort?=Sort | 
	 *         builtInCat?=BuiltInCat | 
	 *         string?=String | 
	 *         integer?=Integer | 
	 *         double?=Double | 
	 *         meta?='?' | 
	 *         emptyString?='[' | 
	 *         data?='data' | 
	 *         (listCat?='[' category=[Ident|ID] list=Exps) | 
	 *         tokenList?='[' | 
	 *         (record?='{' defList=ListLocDef) | 
	 *         (tuple?='<' (tupleList=ListTupleComp | (v=Exp type=Exp))) | 
	 *         (identity?='(' v=Exp)
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    sort[0, 1]
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    builtInCat[0, 1]
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    string[0, 1]
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    integer[0, 1]
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    double[0, 1]
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    meta[0, 1]
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    emptyString[0, 1]
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    data[0, 1]
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    listCat[0, 1]
	 *         EXCLUDE_IF_UNSET category
	 *         MANDATORY_IF_SET category
	 *         EXCLUDE_IF_UNSET list
	 *         MANDATORY_IF_SET list
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    category[0, 1]
	 *         EXCLUDE_IF_UNSET listCat
	 *         MANDATORY_IF_SET listCat
	 *         EXCLUDE_IF_UNSET list
	 *         MANDATORY_IF_SET list
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    list[0, 1]
	 *         EXCLUDE_IF_UNSET listCat
	 *         MANDATORY_IF_SET listCat
	 *         EXCLUDE_IF_UNSET category
	 *         MANDATORY_IF_SET category
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    tokenList[0, 1]
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    record[0, 1]
	 *         EXCLUDE_IF_UNSET defList
	 *         MANDATORY_IF_SET defList
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    defList[0, 1]
	 *         EXCLUDE_IF_UNSET record
	 *         MANDATORY_IF_SET record
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    tuple[0, 1]
	 *         MANDATORY_IF_SET tupleList
	 *         MANDATORY_IF_SET v
	 *         MANDATORY_IF_SET type
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    tupleList[0, 1]
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_UNSET tuple
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    v[0, 2]
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *    type[0, 1]
	 *         EXCLUDE_IF_UNSET v
	 *         MANDATORY_IF_SET v
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_UNSET tuple
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET identity
	 *         EXCLUDE_IF_SET v
	 *    identity[0, 1]
	 *         EXCLUDE_IF_UNSET v
	 *         MANDATORY_IF_SET v
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET sort
	 *         EXCLUDE_IF_SET builtInCat
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET integer
	 *         EXCLUDE_IF_SET double
	 *         EXCLUDE_IF_SET meta
	 *         EXCLUDE_IF_SET emptyString
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET listCat
	 *         EXCLUDE_IF_SET category
	 *         EXCLUDE_IF_SET list
	 *         EXCLUDE_IF_SET tokenList
	 *         EXCLUDE_IF_SET record
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET tuple
	 *         EXCLUDE_IF_SET tupleList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET type
	 */
	protected void sequence_Exp6(EObject context, Exp6 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (bindList=ListBind v=Exp e+=Exp1*) | 
	 *         (bindList=ListBind v=Exp e+=Exp1*) | 
	 *         (defList=ListLocDef v=Exp e+=Exp1*) | 
	 *         (defList=ListLocDef v=Exp e+=Exp1*) | 
	 *         (bindList=ListBind type=Exp v=Exp e+=Exp1*) | 
	 *         (v=Exp4 ((e+=Exp4* (e+=Exp | defList=ListLocDef | (e+=Exp2? e+=Exp1?))) | e+=Exp) e+=Exp1*) | 
	 *         (v=Patt2 e+=Exp4* (e+=Exp | defList=ListLocDef | (e+=Exp2? e+=Exp1?)) e+=Exp1*)
	 *     )
	 *
	 * Features:
	 *    bindList[0, 3]
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *    v[0, 7]
	 *    e[0, *]
	 *    defList[0, 4]
	 *         EXCLUDE_IF_SET bindList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET bindList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET bindList
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *    type[0, 1]
	 *         EXCLUDE_IF_UNSET bindList
	 *         MANDATORY_IF_SET bindList
	 *         EXCLUDE_IF_UNSET v
	 *         MANDATORY_IF_SET v
	 *         MANDATORY_IF_SET e
	 *         EXCLUDE_IF_SET bindList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET bindList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET defList
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 *         EXCLUDE_IF_SET e
	 */
	protected void sequence_Exp(EObject context, Exp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=Exp6*)
	 *
	 * Features:
	 *    expressions[0, *]
	 */
	protected void sequence_Exps(EObject context, Exps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident value=Ident?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    value[0, 1]
	 */
	protected void sequence_FlagDef(EObject context, FlagDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Ident name+=Ident* type=Exp)
	 *
	 * Features:
	 *    name[1, *]
	 *    type[1, 1]
	 */
	protected void sequence_FunDef(EObject context, FunDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     s=ID
	 *
	 * Features:
	 *    s[1, 1]
	 */
	protected void sequence_Ident(EObject context, Ident semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GFPackage.Literals.IDENT__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GFPackage.Literals.IDENT__S));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentAccess().getSIDTerminalRuleCall_0(), semanticObject.getS());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident | (name=Ident inclusive?='[' includes+=Ident includes+=Ident*) | (name=Ident exclusive?='-' excludes+=Ident excludes+=Ident*))
	 *
	 * Features:
	 *    name[0, 3]
	 *    inclusive[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_UNSET includes
	 *         MANDATORY_IF_SET includes
	 *         MANDATORY_IF_SET includes
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET exclusive
	 *         EXCLUDE_IF_SET excludes
	 *         EXCLUDE_IF_SET excludes
	 *    includes[0, *]
	 *         EXCLUDE_IF_UNSET name
	 *         EXCLUDE_IF_UNSET inclusive
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET exclusive
	 *         EXCLUDE_IF_SET excludes
	 *         EXCLUDE_IF_SET excludes
	 *    exclusive[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_UNSET excludes
	 *         MANDATORY_IF_SET excludes
	 *         MANDATORY_IF_SET excludes
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET inclusive
	 *         EXCLUDE_IF_SET includes
	 *         EXCLUDE_IF_SET includes
	 *    excludes[0, *]
	 *         EXCLUDE_IF_UNSET name
	 *         EXCLUDE_IF_UNSET exclusive
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET inclusive
	 *         EXCLUDE_IF_SET includes
	 *         EXCLUDE_IF_SET includes
	 */
	protected void sequence_Included(EObject context, Included semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident | index=Integer)
	 *
	 * Features:
	 *    name[0, 1]
	 *         EXCLUDE_IF_SET index
	 *    index[0, 1]
	 *         EXCLUDE_IF_SET name
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((bindings+=Bind bindings+=Bind*)?)
	 *
	 * Features:
	 *    bindings[0, *]
	 */
	protected void sequence_ListBind(EObject context, ListBind semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=Case cases+=Case*)
	 *
	 * Features:
	 *    cases[1, *]
	 */
	protected void sequence_ListCase(EObject context, ListCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expressions+=Exp expressions+=Exp*)?)
	 *
	 * Features:
	 *    expressions[0, *]
	 */
	protected void sequence_ListExp(EObject context, ListExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((localDefinitions+=LocDef localDefinitions+=LocDef*)?)
	 *
	 * Features:
	 *    localDefinitions[0, *]
	 */
	protected void sequence_ListLocDef(EObject context, ListLocDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((assignments+=PattAss assignments+=PattAss*)?)
	 *
	 * Features:
	 *    assignments[0, *]
	 */
	protected void sequence_ListPattAss(EObject context, ListPattAss semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((l+=PattTupleComp l+=PattTupleComp*)?)
	 *
	 * Features:
	 *    l[0, *]
	 */
	protected void sequence_ListPattTupleComp(EObject context, ListPattTupleComp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     patterns+=Patt2+
	 *
	 * Features:
	 *    patterns[1, *]
	 */
	protected void sequence_ListPatt(EObject context, ListPatt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((l+=TupleComp l+=TupleComp*)?)
	 *
	 * Features:
	 *    l[0, *]
	 */
	protected void sequence_ListTupleComp(EObject context, ListTupleComp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name+=Ident name+=Ident* type=Exp value=Exp?) | (name+=Ident name+=Ident* value=Exp))
	 *
	 * Features:
	 *    name[0, *]
	 *    type[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         MANDATORY_IF_SET name
	 *         MANDATORY_IF_SET value
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET value
	 *    value[0, 2]
	 */
	protected void sequence_LocDef(EObject context, LocDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((extends+=Included extends+=Included*)? (opens+=Open opens+=Open*)? judgements+=TopDef*) | 
	 *         ((extends+=Included extends+=Included*)?) | 
	 *         (functor=Included functorInstantiation?='with' (instantiations+=Open instantiations+=Open*)?) | 
	 *         (functor=Included functorInstantiation?='with' (instantiations+=Open instantiations+=Open*)? (opens+=Open opens+=Open*)? judgements+=TopDef*) | 
	 *         ((extends+=Included extends+=Included*)? functor=Included functorInstantiation?='with' (instantiations+=Open instantiations+=Open*)?) | 
	 *         (
	 *             (extends+=Included extends+=Included*)? 
	 *             functor=Included 
	 *             functorInstantiation?='with' 
	 *             (instantiations+=Open instantiations+=Open*)? 
	 *             (opens+=Open opens+=Open*)? 
	 *             judgements+=TopDef*
	 *         )
	 *     )
	 *
	 * Features:
	 *    extends[0, *]
	 *         EXCLUDE_IF_SET functor
	 *         EXCLUDE_IF_SET functorInstantiation
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET functor
	 *         EXCLUDE_IF_SET functorInstantiation
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET opens
	 *         EXCLUDE_IF_SET opens
	 *         EXCLUDE_IF_SET judgements
	 *    opens[0, *]
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET functor
	 *         EXCLUDE_IF_SET functorInstantiation
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET functor
	 *         EXCLUDE_IF_SET functorInstantiation
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET instantiations
	 *    judgements[0, *]
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET functor
	 *         EXCLUDE_IF_SET functorInstantiation
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET functor
	 *         EXCLUDE_IF_SET functorInstantiation
	 *         EXCLUDE_IF_SET instantiations
	 *         EXCLUDE_IF_SET instantiations
	 *    functor[0, 4]
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET opens
	 *         EXCLUDE_IF_SET opens
	 *         EXCLUDE_IF_SET judgements
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 *    functorInstantiation[0, 4]
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET opens
	 *         EXCLUDE_IF_SET opens
	 *         EXCLUDE_IF_SET judgements
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 *    instantiations[0, *]
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET opens
	 *         EXCLUDE_IF_SET opens
	 *         EXCLUDE_IF_SET judgements
	 *         EXCLUDE_IF_SET extends
	 *         EXCLUDE_IF_SET extends
	 */
	protected void sequence_ModBody(EObject context, ModBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (incomplete?='incomplete'? type=ModType body=ModBody)
	 *
	 * Features:
	 *    incomplete[0, 1]
	 *    type[1, 1]
	 *    body[1, 1]
	 */
	protected void sequence_ModDef(EObject context, ModDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (abstract?='abstract' name=Ident) | 
	 *         (resource?='resource' name=Ident) | 
	 *         (interface?='interface' name=Ident) | 
	 *         (concrete?='concrete' name=Ident abstractName=Ident) | 
	 *         (instance?='instance' name=Ident abstractName=Ident)
	 *     )
	 *
	 * Features:
	 *    abstract[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET resource
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET interface
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET concrete
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET abstractName
	 *         EXCLUDE_IF_SET instance
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET abstractName
	 *    name[0, 5]
	 *    resource[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET abstract
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET interface
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET concrete
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET abstractName
	 *         EXCLUDE_IF_SET instance
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET abstractName
	 *    interface[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET abstract
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET resource
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET concrete
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET abstractName
	 *         EXCLUDE_IF_SET instance
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET abstractName
	 *    concrete[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_UNSET abstractName
	 *         MANDATORY_IF_SET abstractName
	 *         EXCLUDE_IF_SET abstract
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET resource
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET interface
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET instance
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET abstractName
	 *    abstractName[0, 2]
	 *         EXCLUDE_IF_SET abstract
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET resource
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET interface
	 *         EXCLUDE_IF_SET name
	 *    instance[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_UNSET abstractName
	 *         MANDATORY_IF_SET abstractName
	 *         EXCLUDE_IF_SET abstract
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET resource
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET interface
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET concrete
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET abstractName
	 */
	protected void sequence_ModType(EObject context, ModType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident | name=Ident)
	 *
	 * Features:
	 *    name[0, 2]
	 */
	protected void sequence_Name(EObject context, Name semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident | name=Ident | (alias=Ident name=Ident))
	 *
	 * Features:
	 *    name[0, 3]
	 *    alias[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 */
	protected void sequence_Open(EObject context, Open semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name+=Name name+=Name* (definition=Exp | (overload?='overload' overloads+=Def overloads+=Def*))) | 
	 *         (name+=Name name+=Name* type=Exp (definition=Exp | (overload?='overload' overloads+=Def overloads+=Def*))?) | 
	 *         (name+=Name name+=Name* overload?='overload' overloads+=Def overloads+=Def*) | 
	 *         (name+=Name patterns=ListPatt definition=Exp)
	 *     )
	 *
	 * Features:
	 *    name[0, *]
	 *    definition[0, 3]
	 *         EXCLUDE_IF_SET overload
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET overload
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET overload
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET overloads
	 *    type[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         MANDATORY_IF_SET name
	 *         MANDATORY_IF_SET definition
	 *         MANDATORY_IF_SET overload
	 *         MANDATORY_IF_SET overloads
	 *         MANDATORY_IF_SET overloads
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET definition
	 *         EXCLUDE_IF_SET overload
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET overload
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET patterns
	 *         EXCLUDE_IF_SET definition
	 *    patterns[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_UNSET definition
	 *         MANDATORY_IF_SET definition
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET definition
	 *         EXCLUDE_IF_SET overload
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET definition
	 *         EXCLUDE_IF_SET overload
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET overload
	 *         EXCLUDE_IF_SET overloads
	 *         EXCLUDE_IF_SET overloads
	 *    overload[0, 3]
	 *         EXCLUDE_IF_SET definition
	 *         EXCLUDE_IF_SET definition
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET patterns
	 *         EXCLUDE_IF_SET definition
	 *    overloads[0, *]
	 *         EXCLUDE_IF_SET definition
	 *         EXCLUDE_IF_SET definition
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET patterns
	 *         EXCLUDE_IF_SET definition
	 */
	protected void sequence_OperDef(EObject context, Def semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident constructors+=DDecl*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    constructors[0, *]
	 */
	protected void sequence_ParConstr(EObject context, ParConstr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=Ident (constructors+=ParConstr constructors+=ParConstr*)?) | (name=Ident id2=Ident) | name=Ident)
	 *
	 * Features:
	 *    name[0, 3]
	 *    constructors[0, *]
	 *         EXCLUDE_IF_UNSET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET id2
	 *         EXCLUDE_IF_SET name
	 *    id2[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET constructors
	 *         EXCLUDE_IF_SET constructors
	 *         EXCLUDE_IF_SET name
	 */
	protected void sequence_ParDef(EObject context, ParDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=Ident value=ListPatt) | (name=Ident label=Ident value=ListPatt) | (name=Ident value=Patt2))
	 *
	 * Features:
	 *    name[0, 3]
	 *    value[0, 3]
	 *    label[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_UNSET value
	 *         MANDATORY_IF_SET value
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET value
	 */
	protected void sequence_Patt1(EObject context, Patt1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Ident | (name=Ident label=Ident) | name=Ident)
	 *
	 * Features:
	 *    name[0, 3]
	 *    label[0, 1]
	 *         EXCLUDE_IF_UNSET name
	 *         MANDATORY_IF_SET name
	 *         EXCLUDE_IF_SET name
	 *         EXCLUDE_IF_SET name
	 */
	protected void sequence_Patt2(EObject context, Patt2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Ident name+=Ident* value=Patt)
	 *
	 * Features:
	 *    name[1, *]
	 *    value[1, 1]
	 */
	protected void sequence_PattAss(EObject context, PattAss semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (p+=Patt1 p+=Patt1*)
	 *
	 * Features:
	 *    p[1, *]
	 */
	protected void sequence_Patt(EObject context, Patt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Name name+=Name* printname=Exp)
	 *
	 * Features:
	 *    name[1, *]
	 *    printname[1, 1]
	 */
	protected void sequence_PrintDef(EObject context, PrintDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (cat?='cat' definitions+=CatDef+) | 
	 *         (fun?='fun' definitions+=FunDef+) | 
	 *         (data?='data' definitions+=FunDef+) | 
	 *         (def?='def' definitions+=Def+) | 
	 *         (data?='data' definitions+=DataDef+) | 
	 *         (param?='param' definitions+=ParDef+) | 
	 *         (oper?='oper' definitions+=OperDef+) | 
	 *         (lincat?='lincat' definitions+=PrintDef+) | 
	 *         (lindef?='lindef' definitions+=Def+) | 
	 *         (lin?='lin' definitions+=Def+) | 
	 *         (printname?='printname' definitions+=PrintDef+) | 
	 *         (printname?='printname' definitions+=PrintDef+) | 
	 *         (flags?='flags' definitions+=FlagDef+)
	 *     )
	 *
	 * Features:
	 *    cat[0, 1]
	 *         EXCLUDE_IF_UNSET definitions
	 *         MANDATORY_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    definitions[0, *]
	 *    fun[0, 1]
	 *         EXCLUDE_IF_UNSET definitions
	 *         MANDATORY_IF_SET definitions
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    data[0, 2]
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    def[0, 1]
	 *         EXCLUDE_IF_UNSET definitions
	 *         MANDATORY_IF_SET definitions
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    param[0, 1]
	 *         EXCLUDE_IF_UNSET definitions
	 *         MANDATORY_IF_SET definitions
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    oper[0, 1]
	 *         EXCLUDE_IF_UNSET definitions
	 *         MANDATORY_IF_SET definitions
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    lincat[0, 1]
	 *         EXCLUDE_IF_UNSET definitions
	 *         MANDATORY_IF_SET definitions
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    lindef[0, 1]
	 *         EXCLUDE_IF_UNSET definitions
	 *         MANDATORY_IF_SET definitions
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    lin[0, 1]
	 *         EXCLUDE_IF_UNSET definitions
	 *         MANDATORY_IF_SET definitions
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    printname[0, 2]
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET flags
	 *         EXCLUDE_IF_SET definitions
	 *    flags[0, 1]
	 *         EXCLUDE_IF_UNSET definitions
	 *         MANDATORY_IF_SET definitions
	 *         EXCLUDE_IF_SET cat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET fun
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET def
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET data
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET param
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET oper
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lincat
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lindef
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET lin
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 *         EXCLUDE_IF_SET printname
	 *         EXCLUDE_IF_SET definitions
	 */
	protected void sequence_TopDef(EObject context, TopDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
