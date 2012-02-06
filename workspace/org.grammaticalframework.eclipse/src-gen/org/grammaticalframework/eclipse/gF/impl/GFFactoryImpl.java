/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.grammaticalframework.eclipse.gF.GFFactory;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GFFactoryImpl extends EFactoryImpl implements GFFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GFFactory init()
  {
    try
    {
      GFFactory theGFFactory = (GFFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.grammaticalframework.org/eclipse/GF"); 
      if (theGFFactory != null)
      {
        return theGFFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GFFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GFFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GFPackage.SOURCE_MODULE: return createSourceModule();
      case GFPackage.MOD_TYPE: return createModType();
      case GFPackage.MOD_BODY: return createModBody();
      case GFPackage.MOD_OPEN: return createModOpen();
      case GFPackage.MOD_CONTENT: return createModContent();
      case GFPackage.LIST_OPEN: return createListOpen();
      case GFPackage.OPEN: return createOpen();
      case GFPackage.LIST_INST: return createListInst();
      case GFPackage.INST: return createInst();
      case GFPackage.LIST_INCLUDED: return createListIncluded();
      case GFPackage.INCLUDED: return createIncluded();
      case GFPackage.TOP_DEF: return createTopDef();
      case GFPackage.CAT_DEF: return createCatDef();
      case GFPackage.FUN_DEF: return createFunDef();
      case GFPackage.DEF_DEF: return createDefDef();
      case GFPackage.DATA_DEF: return createDataDef();
      case GFPackage.PARAM_DEF: return createParamDef();
      case GFPackage.OPER_DEF: return createOperDef();
      case GFPackage.LIN_DEF: return createLinDef();
      case GFPackage.TERM_DEF: return createTermDef();
      case GFPackage.FLAG_DEF: return createFlagDef();
      case GFPackage.PAR_CONSTR: return createParConstr();
      case GFPackage.NAME: return createName();
      case GFPackage.LOC_DEF: return createLocDef();
      case GFPackage.LIST_LOC_DEF: return createListLocDef();
      case GFPackage.EXP: return createExp();
      case GFPackage.LIST_EXP: return createListExp();
      case GFPackage.EXPS: return createExps();
      case GFPackage.PATT: return createPatt();
      case GFPackage.PATT_ASS: return createPattAss();
      case GFPackage.LABEL: return createLabel();
      case GFPackage.LIST_PATT_ASS: return createListPattAss();
      case GFPackage.LIST_PATT: return createListPatt();
      case GFPackage.ARG: return createArg();
      case GFPackage.BIND: return createBind();
      case GFPackage.LIST_BIND: return createListBind();
      case GFPackage.LIST_TUPLE_COMP: return createListTupleComp();
      case GFPackage.LIST_PATT_TUPLE_COMP: return createListPattTupleComp();
      case GFPackage.CASE: return createCase();
      case GFPackage.LIST_CASE: return createListCase();
      case GFPackage.ALTERN: return createAltern();
      case GFPackage.DDECL: return createDDecl();
      case GFPackage.IDENT: return createIdent();
      case GFPackage.EXP_LF13: return createExpLF13();
      case GFPackage.EXP1: return createExp1();
      case GFPackage.EXP2: return createExp2();
      case GFPackage.EXP3: return createExp3();
      case GFPackage.EXP4: return createExp4();
      case GFPackage.INTEGER: return createInteger();
      case GFPackage.DOUBLE: return createDouble();
      case GFPackage.STRING: return createString();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceModule createSourceModule()
  {
    SourceModuleImpl sourceModule = new SourceModuleImpl();
    return sourceModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModType createModType()
  {
    ModTypeImpl modType = new ModTypeImpl();
    return modType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModBody createModBody()
  {
    ModBodyImpl modBody = new ModBodyImpl();
    return modBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModOpen createModOpen()
  {
    ModOpenImpl modOpen = new ModOpenImpl();
    return modOpen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModContent createModContent()
  {
    ModContentImpl modContent = new ModContentImpl();
    return modContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOpen createListOpen()
  {
    ListOpenImpl listOpen = new ListOpenImpl();
    return listOpen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Open createOpen()
  {
    OpenImpl open = new OpenImpl();
    return open;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListInst createListInst()
  {
    ListInstImpl listInst = new ListInstImpl();
    return listInst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inst createInst()
  {
    InstImpl inst = new InstImpl();
    return inst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListIncluded createListIncluded()
  {
    ListIncludedImpl listIncluded = new ListIncludedImpl();
    return listIncluded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Included createIncluded()
  {
    IncludedImpl included = new IncludedImpl();
    return included;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopDef createTopDef()
  {
    TopDefImpl topDef = new TopDefImpl();
    return topDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CatDef createCatDef()
  {
    CatDefImpl catDef = new CatDefImpl();
    return catDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunDef createFunDef()
  {
    FunDefImpl funDef = new FunDefImpl();
    return funDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefDef createDefDef()
  {
    DefDefImpl defDef = new DefDefImpl();
    return defDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDef createDataDef()
  {
    DataDefImpl dataDef = new DataDefImpl();
    return dataDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamDef createParamDef()
  {
    ParamDefImpl paramDef = new ParamDefImpl();
    return paramDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperDef createOperDef()
  {
    OperDefImpl operDef = new OperDefImpl();
    return operDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinDef createLinDef()
  {
    LinDefImpl linDef = new LinDefImpl();
    return linDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermDef createTermDef()
  {
    TermDefImpl termDef = new TermDefImpl();
    return termDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlagDef createFlagDef()
  {
    FlagDefImpl flagDef = new FlagDefImpl();
    return flagDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParConstr createParConstr()
  {
    ParConstrImpl parConstr = new ParConstrImpl();
    return parConstr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocDef createLocDef()
  {
    LocDefImpl locDef = new LocDefImpl();
    return locDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListLocDef createListLocDef()
  {
    ListLocDefImpl listLocDef = new ListLocDefImpl();
    return listLocDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListExp createListExp()
  {
    ListExpImpl listExp = new ListExpImpl();
    return listExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exps createExps()
  {
    ExpsImpl exps = new ExpsImpl();
    return exps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patt createPatt()
  {
    PattImpl patt = new PattImpl();
    return patt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PattAss createPattAss()
  {
    PattAssImpl pattAss = new PattAssImpl();
    return pattAss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListPattAss createListPattAss()
  {
    ListPattAssImpl listPattAss = new ListPattAssImpl();
    return listPattAss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListPatt createListPatt()
  {
    ListPattImpl listPatt = new ListPattImpl();
    return listPatt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arg createArg()
  {
    ArgImpl arg = new ArgImpl();
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bind createBind()
  {
    BindImpl bind = new BindImpl();
    return bind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListBind createListBind()
  {
    ListBindImpl listBind = new ListBindImpl();
    return listBind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListTupleComp createListTupleComp()
  {
    ListTupleCompImpl listTupleComp = new ListTupleCompImpl();
    return listTupleComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListPattTupleComp createListPattTupleComp()
  {
    ListPattTupleCompImpl listPattTupleComp = new ListPattTupleCompImpl();
    return listPattTupleComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListCase createListCase()
  {
    ListCaseImpl listCase = new ListCaseImpl();
    return listCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Altern createAltern()
  {
    AlternImpl altern = new AlternImpl();
    return altern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DDecl createDDecl()
  {
    DDeclImpl dDecl = new DDeclImpl();
    return dDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident createIdent()
  {
    IdentImpl ident = new IdentImpl();
    return ident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpLF13 createExpLF13()
  {
    ExpLF13Impl expLF13 = new ExpLF13Impl();
    return expLF13;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp1 createExp1()
  {
    Exp1Impl exp1 = new Exp1Impl();
    return exp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp2 createExp2()
  {
    Exp2Impl exp2 = new Exp2Impl();
    return exp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp3 createExp3()
  {
    Exp3Impl exp3 = new Exp3Impl();
    return exp3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp4 createExp4()
  {
    Exp4Impl exp4 = new Exp4Impl();
    return exp4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.grammaticalframework.eclipse.gF.Integer createInteger()
  {
    IntegerImpl integer = new IntegerImpl();
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.grammaticalframework.eclipse.gF.Double createDouble()
  {
    DoubleImpl double_ = new DoubleImpl();
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.grammaticalframework.eclipse.gF.String createString()
  {
    StringImpl string = new StringImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GFPackage getGFPackage()
  {
    return (GFPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GFPackage getPackage()
  {
    return GFPackage.eINSTANCE;
  }

} //GFFactoryImpl
