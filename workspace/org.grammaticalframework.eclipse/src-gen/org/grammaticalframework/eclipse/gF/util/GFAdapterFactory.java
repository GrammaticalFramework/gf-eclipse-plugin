/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.grammaticalframework.eclipse.gF.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.grammaticalframework.eclipse.gF.GFPackage
 * @generated
 */
public class GFAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GFPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GFAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GFPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GFSwitch<Adapter> modelSwitch =
    new GFSwitch<Adapter>()
    {
      @Override
      public Adapter caseSourceModule(SourceModule object)
      {
        return createSourceModuleAdapter();
      }
      @Override
      public Adapter caseModType(ModType object)
      {
        return createModTypeAdapter();
      }
      @Override
      public Adapter caseModBody(ModBody object)
      {
        return createModBodyAdapter();
      }
      @Override
      public Adapter caseModContent(ModContent object)
      {
        return createModContentAdapter();
      }
      @Override
      public Adapter caseListOpen(ListOpen object)
      {
        return createListOpenAdapter();
      }
      @Override
      public Adapter caseOpen(Open object)
      {
        return createOpenAdapter();
      }
      @Override
      public Adapter caseListInst(ListInst object)
      {
        return createListInstAdapter();
      }
      @Override
      public Adapter caseInst(Inst object)
      {
        return createInstAdapter();
      }
      @Override
      public Adapter caseListIncluded(ListIncluded object)
      {
        return createListIncludedAdapter();
      }
      @Override
      public Adapter caseIncluded(Included object)
      {
        return createIncludedAdapter();
      }
      @Override
      public Adapter caseTopDef(TopDef object)
      {
        return createTopDefAdapter();
      }
      @Override
      public Adapter caseCatDef(CatDef object)
      {
        return createCatDefAdapter();
      }
      @Override
      public Adapter caseFunDef(FunDef object)
      {
        return createFunDefAdapter();
      }
      @Override
      public Adapter caseDefDef(DefDef object)
      {
        return createDefDefAdapter();
      }
      @Override
      public Adapter caseDataDef(DataDef object)
      {
        return createDataDefAdapter();
      }
      @Override
      public Adapter caseParamDef(ParamDef object)
      {
        return createParamDefAdapter();
      }
      @Override
      public Adapter caseOperDef(OperDef object)
      {
        return createOperDefAdapter();
      }
      @Override
      public Adapter caseLinDef(LinDef object)
      {
        return createLinDefAdapter();
      }
      @Override
      public Adapter caseTermDef(TermDef object)
      {
        return createTermDefAdapter();
      }
      @Override
      public Adapter caseFlagDef(FlagDef object)
      {
        return createFlagDefAdapter();
      }
      @Override
      public Adapter caseParConstr(ParConstr object)
      {
        return createParConstrAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter caseLocDef(LocDef object)
      {
        return createLocDefAdapter();
      }
      @Override
      public Adapter caseListLocDef(ListLocDef object)
      {
        return createListLocDefAdapter();
      }
      @Override
      public Adapter caseExp(Exp object)
      {
        return createExpAdapter();
      }
      @Override
      public Adapter caseListExp(ListExp object)
      {
        return createListExpAdapter();
      }
      @Override
      public Adapter caseExps(Exps object)
      {
        return createExpsAdapter();
      }
      @Override
      public Adapter casePatt(Patt object)
      {
        return createPattAdapter();
      }
      @Override
      public Adapter casePattAss(PattAss object)
      {
        return createPattAssAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseListPattAss(ListPattAss object)
      {
        return createListPattAssAdapter();
      }
      @Override
      public Adapter caseListPatt(ListPatt object)
      {
        return createListPattAdapter();
      }
      @Override
      public Adapter caseArg(Arg object)
      {
        return createArgAdapter();
      }
      @Override
      public Adapter caseBind(Bind object)
      {
        return createBindAdapter();
      }
      @Override
      public Adapter caseListBind(ListBind object)
      {
        return createListBindAdapter();
      }
      @Override
      public Adapter caseListTupleComp(ListTupleComp object)
      {
        return createListTupleCompAdapter();
      }
      @Override
      public Adapter caseListPattTupleComp(ListPattTupleComp object)
      {
        return createListPattTupleCompAdapter();
      }
      @Override
      public Adapter caseCase(Case object)
      {
        return createCaseAdapter();
      }
      @Override
      public Adapter caseListCase(ListCase object)
      {
        return createListCaseAdapter();
      }
      @Override
      public Adapter caseAltern(Altern object)
      {
        return createAlternAdapter();
      }
      @Override
      public Adapter caseDDecl(DDecl object)
      {
        return createDDeclAdapter();
      }
      @Override
      public Adapter caseIdent(Ident object)
      {
        return createIdentAdapter();
      }
      @Override
      public Adapter caseExpLF13(ExpLF13 object)
      {
        return createExpLF13Adapter();
      }
      @Override
      public Adapter caseExp1(Exp1 object)
      {
        return createExp1Adapter();
      }
      @Override
      public Adapter caseExp2(Exp2 object)
      {
        return createExp2Adapter();
      }
      @Override
      public Adapter caseExp3(Exp3 object)
      {
        return createExp3Adapter();
      }
      @Override
      public Adapter caseExp4(Exp4 object)
      {
        return createExp4Adapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.SourceModule <em>Source Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.SourceModule
   * @generated
   */
  public Adapter createSourceModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ModType <em>Mod Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ModType
   * @generated
   */
  public Adapter createModTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ModBody <em>Mod Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ModBody
   * @generated
   */
  public Adapter createModBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ModContent <em>Mod Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ModContent
   * @generated
   */
  public Adapter createModContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListOpen <em>List Open</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListOpen
   * @generated
   */
  public Adapter createListOpenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Open <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Open
   * @generated
   */
  public Adapter createOpenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListInst <em>List Inst</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListInst
   * @generated
   */
  public Adapter createListInstAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Inst <em>Inst</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Inst
   * @generated
   */
  public Adapter createInstAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListIncluded <em>List Included</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListIncluded
   * @generated
   */
  public Adapter createListIncludedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Included <em>Included</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Included
   * @generated
   */
  public Adapter createIncludedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.TopDef <em>Top Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.TopDef
   * @generated
   */
  public Adapter createTopDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.CatDef <em>Cat Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.CatDef
   * @generated
   */
  public Adapter createCatDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.FunDef <em>Fun Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.FunDef
   * @generated
   */
  public Adapter createFunDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.DefDef <em>Def Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.DefDef
   * @generated
   */
  public Adapter createDefDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.DataDef <em>Data Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.DataDef
   * @generated
   */
  public Adapter createDataDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ParamDef <em>Param Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ParamDef
   * @generated
   */
  public Adapter createParamDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.OperDef <em>Oper Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.OperDef
   * @generated
   */
  public Adapter createOperDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.LinDef <em>Lin Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.LinDef
   * @generated
   */
  public Adapter createLinDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.TermDef <em>Term Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.TermDef
   * @generated
   */
  public Adapter createTermDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.FlagDef <em>Flag Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.FlagDef
   * @generated
   */
  public Adapter createFlagDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ParConstr <em>Par Constr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ParConstr
   * @generated
   */
  public Adapter createParConstrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.LocDef <em>Loc Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.LocDef
   * @generated
   */
  public Adapter createLocDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListLocDef <em>List Loc Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListLocDef
   * @generated
   */
  public Adapter createListLocDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Exp
   * @generated
   */
  public Adapter createExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListExp <em>List Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListExp
   * @generated
   */
  public Adapter createListExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Exps <em>Exps</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Exps
   * @generated
   */
  public Adapter createExpsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Patt <em>Patt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Patt
   * @generated
   */
  public Adapter createPattAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.PattAss <em>Patt Ass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.PattAss
   * @generated
   */
  public Adapter createPattAssAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListPattAss <em>List Patt Ass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListPattAss
   * @generated
   */
  public Adapter createListPattAssAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListPatt <em>List Patt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListPatt
   * @generated
   */
  public Adapter createListPattAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Arg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Arg
   * @generated
   */
  public Adapter createArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Bind
   * @generated
   */
  public Adapter createBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListBind <em>List Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListBind
   * @generated
   */
  public Adapter createListBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListTupleComp <em>List Tuple Comp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListTupleComp
   * @generated
   */
  public Adapter createListTupleCompAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListPattTupleComp <em>List Patt Tuple Comp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListPattTupleComp
   * @generated
   */
  public Adapter createListPattTupleCompAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Case
   * @generated
   */
  public Adapter createCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ListCase <em>List Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ListCase
   * @generated
   */
  public Adapter createListCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Altern <em>Altern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Altern
   * @generated
   */
  public Adapter createAlternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.DDecl <em>DDecl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.DDecl
   * @generated
   */
  public Adapter createDDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Ident <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Ident
   * @generated
   */
  public Adapter createIdentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.ExpLF13 <em>Exp LF13</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.ExpLF13
   * @generated
   */
  public Adapter createExpLF13Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Exp1 <em>Exp1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Exp1
   * @generated
   */
  public Adapter createExp1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Exp2 <em>Exp2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Exp2
   * @generated
   */
  public Adapter createExp2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Exp3 <em>Exp3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Exp3
   * @generated
   */
  public Adapter createExp3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.grammaticalframework.eclipse.gF.Exp4 <em>Exp4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.grammaticalframework.eclipse.gF.Exp4
   * @generated
   */
  public Adapter createExp4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GFAdapterFactory
