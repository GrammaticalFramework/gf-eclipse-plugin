/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import org.grammaticalframework.eclipse.gF.ListLocDef;
import org.grammaticalframework.eclipse.gF.ListPatt;
import org.grammaticalframework.eclipse.gF.ListPattAss;
import org.grammaticalframework.eclipse.gF.ListPattTupleComp;
import org.grammaticalframework.eclipse.gF.ListTupleComp;
import org.grammaticalframework.eclipse.gF.LocDef;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.ModContent;
import org.grammaticalframework.eclipse.gF.ModDef;
import org.grammaticalframework.eclipse.gF.ModType;
import org.grammaticalframework.eclipse.gF.Name;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.OperDef;
import org.grammaticalframework.eclipse.gF.ParConstr;
import org.grammaticalframework.eclipse.gF.ParamDef;
import org.grammaticalframework.eclipse.gF.Patt;
import org.grammaticalframework.eclipse.gF.PattAss;
import org.grammaticalframework.eclipse.gF.TermDef;
import org.grammaticalframework.eclipse.gF.TopDef;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.grammaticalframework.eclipse.gF.GFPackage
 * @generated
 */
public class GFSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GFPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GFSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GFPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GFPackage.MOD_DEF:
      {
        ModDef modDef = (ModDef)theEObject;
        T result = caseModDef(modDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.MOD_TYPE:
      {
        ModType modType = (ModType)theEObject;
        T result = caseModType(modType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.MOD_BODY:
      {
        ModBody modBody = (ModBody)theEObject;
        T result = caseModBody(modBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.MOD_CONTENT:
      {
        ModContent modContent = (ModContent)theEObject;
        T result = caseModContent(modContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.OPEN:
      {
        Open open = (Open)theEObject;
        T result = caseOpen(open);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.INST:
      {
        Inst inst = (Inst)theEObject;
        T result = caseInst(inst);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.INCLUDED:
      {
        Included included = (Included)theEObject;
        T result = caseIncluded(included);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.TOP_DEF:
      {
        TopDef topDef = (TopDef)theEObject;
        T result = caseTopDef(topDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.CAT_DEF:
      {
        CatDef catDef = (CatDef)theEObject;
        T result = caseCatDef(catDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.FUN_DEF:
      {
        FunDef funDef = (FunDef)theEObject;
        T result = caseFunDef(funDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.DEF_DEF:
      {
        DefDef defDef = (DefDef)theEObject;
        T result = caseDefDef(defDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.DATA_DEF:
      {
        DataDef dataDef = (DataDef)theEObject;
        T result = caseDataDef(dataDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.PARAM_DEF:
      {
        ParamDef paramDef = (ParamDef)theEObject;
        T result = caseParamDef(paramDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.OPER_DEF:
      {
        OperDef operDef = (OperDef)theEObject;
        T result = caseOperDef(operDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LIN_DEF:
      {
        LinDef linDef = (LinDef)theEObject;
        T result = caseLinDef(linDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.TERM_DEF:
      {
        TermDef termDef = (TermDef)theEObject;
        T result = caseTermDef(termDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.FLAG_DEF:
      {
        FlagDef flagDef = (FlagDef)theEObject;
        T result = caseFlagDef(flagDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.PAR_CONSTR:
      {
        ParConstr parConstr = (ParConstr)theEObject;
        T result = caseParConstr(parConstr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LOC_DEF:
      {
        LocDef locDef = (LocDef)theEObject;
        T result = caseLocDef(locDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LIST_LOC_DEF:
      {
        ListLocDef listLocDef = (ListLocDef)theEObject;
        T result = caseListLocDef(listLocDef);
        if (result == null) result = caseExp(listLocDef);
        if (result == null) result = casePatt(listLocDef);
        if (result == null) result = caseDDecl(listLocDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.EXP:
      {
        Exp exp = (Exp)theEObject;
        T result = caseExp(exp);
        if (result == null) result = casePatt(exp);
        if (result == null) result = caseDDecl(exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LIST_EXP:
      {
        ListExp listExp = (ListExp)theEObject;
        T result = caseListExp(listExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.EXPS:
      {
        Exps exps = (Exps)theEObject;
        T result = caseExps(exps);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.PATT:
      {
        Patt patt = (Patt)theEObject;
        T result = casePatt(patt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.PATT_ASS:
      {
        PattAss pattAss = (PattAss)theEObject;
        T result = casePattAss(pattAss);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LIST_PATT_ASS:
      {
        ListPattAss listPattAss = (ListPattAss)theEObject;
        T result = caseListPattAss(listPattAss);
        if (result == null) result = casePatt(listPattAss);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LIST_PATT:
      {
        ListPatt listPatt = (ListPatt)theEObject;
        T result = caseListPatt(listPatt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.ARG:
      {
        Arg arg = (Arg)theEObject;
        T result = caseArg(arg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.BIND:
      {
        Bind bind = (Bind)theEObject;
        T result = caseBind(bind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LIST_BIND:
      {
        ListBind listBind = (ListBind)theEObject;
        T result = caseListBind(listBind);
        if (result == null) result = caseExp(listBind);
        if (result == null) result = casePatt(listBind);
        if (result == null) result = caseDDecl(listBind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LIST_TUPLE_COMP:
      {
        ListTupleComp listTupleComp = (ListTupleComp)theEObject;
        T result = caseListTupleComp(listTupleComp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LIST_PATT_TUPLE_COMP:
      {
        ListPattTupleComp listPattTupleComp = (ListPattTupleComp)theEObject;
        T result = caseListPattTupleComp(listPattTupleComp);
        if (result == null) result = casePatt(listPattTupleComp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.CASE:
      {
        Case case_ = (Case)theEObject;
        T result = caseCase(case_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.LIST_CASE:
      {
        ListCase listCase = (ListCase)theEObject;
        T result = caseListCase(listCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.ALTERN:
      {
        Altern altern = (Altern)theEObject;
        T result = caseAltern(altern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.DDECL:
      {
        DDecl dDecl = (DDecl)theEObject;
        T result = caseDDecl(dDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.IDENT:
      {
        Ident ident = (Ident)theEObject;
        T result = caseIdent(ident);
        if (result == null) result = caseExp(ident);
        if (result == null) result = casePatt(ident);
        if (result == null) result = caseDDecl(ident);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.EXP_LF13:
      {
        ExpLF13 expLF13 = (ExpLF13)theEObject;
        T result = caseExpLF13(expLF13);
        if (result == null) result = caseExp(expLF13);
        if (result == null) result = casePatt(expLF13);
        if (result == null) result = caseDDecl(expLF13);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.EXP1:
      {
        Exp1 exp1 = (Exp1)theEObject;
        T result = caseExp1(exp1);
        if (result == null) result = caseExp(exp1);
        if (result == null) result = casePatt(exp1);
        if (result == null) result = caseDDecl(exp1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.EXP2:
      {
        Exp2 exp2 = (Exp2)theEObject;
        T result = caseExp2(exp2);
        if (result == null) result = caseExp(exp2);
        if (result == null) result = casePatt(exp2);
        if (result == null) result = caseDDecl(exp2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.EXP3:
      {
        Exp3 exp3 = (Exp3)theEObject;
        T result = caseExp3(exp3);
        if (result == null) result = caseExp(exp3);
        if (result == null) result = casePatt(exp3);
        if (result == null) result = caseDDecl(exp3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.EXP4:
      {
        Exp4 exp4 = (Exp4)theEObject;
        T result = caseExp4(exp4);
        if (result == null) result = caseExp(exp4);
        if (result == null) result = casePatt(exp4);
        if (result == null) result = caseDDecl(exp4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.INTEGER:
      {
        org.grammaticalframework.eclipse.gF.Integer integer = (org.grammaticalframework.eclipse.gF.Integer)theEObject;
        T result = caseInteger(integer);
        if (result == null) result = casePatt(integer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.DOUBLE:
      {
        org.grammaticalframework.eclipse.gF.Double double_ = (org.grammaticalframework.eclipse.gF.Double)theEObject;
        T result = caseDouble(double_);
        if (result == null) result = casePatt(double_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GFPackage.STRING:
      {
        org.grammaticalframework.eclipse.gF.String string = (org.grammaticalframework.eclipse.gF.String)theEObject;
        T result = caseString(string);
        if (result == null) result = casePatt(string);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModDef(ModDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModType(ModType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModBody(ModBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModContent(ModContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpen(Open object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inst</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inst</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInst(Inst object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Included</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Included</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncluded(Included object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopDef(TopDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cat Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cat Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCatDef(CatDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fun Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fun Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunDef(FunDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefDef(DefDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataDef(DataDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamDef(ParamDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Oper Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Oper Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperDef(OperDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lin Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lin Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinDef(LinDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermDef(TermDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flag Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flag Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlagDef(FlagDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Par Constr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Par Constr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParConstr(ParConstr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loc Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loc Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocDef(LocDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Loc Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Loc Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListLocDef(ListLocDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp(Exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListExp(ListExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exps</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exps</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExps(Exps object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Patt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Patt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatt(Patt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Patt Ass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Patt Ass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattAss(PattAss object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Patt Ass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Patt Ass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListPattAss(ListPattAss object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Patt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Patt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListPatt(ListPatt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArg(Arg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBind(Bind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Bind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Bind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListBind(ListBind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Tuple Comp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Tuple Comp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListTupleComp(ListTupleComp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Patt Tuple Comp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Patt Tuple Comp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListPattTupleComp(ListPattTupleComp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCase(Case object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListCase(ListCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Altern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Altern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAltern(Altern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DDecl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DDecl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDDecl(DDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ident</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ident</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdent(Ident object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp LF13</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp LF13</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpLF13(ExpLF13 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp1(Exp1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp2(Exp2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp3(Exp3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp4(Exp4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteger(org.grammaticalframework.eclipse.gF.Integer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDouble(org.grammaticalframework.eclipse.gF.Double object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseString(org.grammaticalframework.eclipse.gF.String object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GFSwitch
