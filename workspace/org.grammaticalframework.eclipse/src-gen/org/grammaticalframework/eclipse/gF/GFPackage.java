/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.grammaticalframework.eclipse.gF.GFFactory
 * @model kind="package"
 * @generated
 */
public interface GFPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gF";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.grammaticalframework.org/eclipse/GF";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gF";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GFPackage eINSTANCE = org.grammaticalframework.eclipse.gF.impl.GFPackageImpl.init();

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ModDefImpl <em>Mod Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ModDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getModDef()
   * @generated
   */
  int MOD_DEF = 0;

  /**
   * The feature id for the '<em><b>Incomplete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_DEF__INCOMPLETE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_DEF__TYPE = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_DEF__BODY = 2;

  /**
   * The number of structural features of the '<em>Mod Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ModTypeImpl <em>Mod Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ModTypeImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getModType()
   * @generated
   */
  int MOD_TYPE = 1;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_TYPE__ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_TYPE__RESOURCE = 2;

  /**
   * The feature id for the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_TYPE__INTERFACE = 3;

  /**
   * The feature id for the '<em><b>Concrete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_TYPE__CONCRETE = 4;

  /**
   * The feature id for the '<em><b>Abstract Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_TYPE__ABSTRACT_NAME = 5;

  /**
   * The feature id for the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_TYPE__INSTANCE = 6;

  /**
   * The number of structural features of the '<em>Mod Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_TYPE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl <em>Mod Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ModBodyImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getModBody()
   * @generated
   */
  int MOD_BODY = 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__EXTENDS = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__CONTENT = 1;

  /**
   * The feature id for the '<em><b>Functor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__FUNCTOR = 2;

  /**
   * The feature id for the '<em><b>Functor Instantiation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__FUNCTOR_INSTANTIATION = 3;

  /**
   * The feature id for the '<em><b>Instantiations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__INSTANTIATIONS = 4;

  /**
   * The number of structural features of the '<em>Mod Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ModContentImpl <em>Mod Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ModContentImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getModContent()
   * @generated
   */
  int MOD_CONTENT = 3;

  /**
   * The feature id for the '<em><b>Opens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_CONTENT__OPENS = 0;

  /**
   * The feature id for the '<em><b>Judgements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_CONTENT__JUDGEMENTS = 1;

  /**
   * The number of structural features of the '<em>Mod Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_CONTENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.OpenImpl <em>Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.OpenImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getOpen()
   * @generated
   */
  int OPEN = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__NAME = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN__ALIAS = 1;

  /**
   * The number of structural features of the '<em>Open</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.InstImpl <em>Inst</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.InstImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getInst()
   * @generated
   */
  int INST = 5;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST__INTERFACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST__NAME = 1;

  /**
   * The number of structural features of the '<em>Inst</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.IncludedImpl <em>Included</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.IncludedImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getIncluded()
   * @generated
   */
  int INCLUDED = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDED__NAME = 0;

  /**
   * The feature id for the '<em><b>Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDED__INCLUSIVE = 1;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDED__INCLUDES = 2;

  /**
   * The feature id for the '<em><b>Exclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDED__EXCLUSIVE = 3;

  /**
   * The feature id for the '<em><b>Excludes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDED__EXCLUDES = 4;

  /**
   * The number of structural features of the '<em>Included</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDED_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl <em>Top Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.TopDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getTopDef()
   * @generated
   */
  int TOP_DEF = 7;

  /**
   * The feature id for the '<em><b>Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__CAT = 0;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__DEFINITIONS = 1;

  /**
   * The feature id for the '<em><b>Fun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__FUN = 2;

  /**
   * The feature id for the '<em><b>Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__DEF = 3;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__DATA = 4;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__PARAM = 5;

  /**
   * The feature id for the '<em><b>Oper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__OPER = 6;

  /**
   * The feature id for the '<em><b>Lincat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__LINCAT = 7;

  /**
   * The feature id for the '<em><b>Lindef</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__LINDEF = 8;

  /**
   * The feature id for the '<em><b>Lin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__LIN = 9;

  /**
   * The feature id for the '<em><b>Printname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__PRINTNAME = 10;

  /**
   * The feature id for the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__FLAGS = 11;

  /**
   * The number of structural features of the '<em>Top Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.CatDefImpl <em>Cat Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.CatDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getCatDef()
   * @generated
   */
  int CAT_DEF = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAT_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Context</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAT_DEF__CONTEXT = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAT_DEF__SIZE = 2;

  /**
   * The number of structural features of the '<em>Cat Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAT_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.FunDefImpl <em>Fun Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.FunDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getFunDef()
   * @generated
   */
  int FUN_DEF = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_DEF__TYPE = 1;

  /**
   * The number of structural features of the '<em>Fun Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.DefDefImpl <em>Def Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.DefDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDefDef()
   * @generated
   */
  int DEF_DEF = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DEF__DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DEF__PATTERNS = 2;

  /**
   * The number of structural features of the '<em>Def Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.DataDefImpl <em>Data Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.DataDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDataDef()
   * @generated
   */
  int DATA_DEF = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEF__CONSTRUCTORS = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEF__TYPE = 2;

  /**
   * The number of structural features of the '<em>Data Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ParamDefImpl <em>Param Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ParamDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getParamDef()
   * @generated
   */
  int PARAM_DEF = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DEF__CONSTRUCTORS = 1;

  /**
   * The number of structural features of the '<em>Param Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.OperDefImpl <em>Oper Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.OperDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getOperDef()
   * @generated
   */
  int OPER_DEF = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPER_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPER_DEF__TYPE = 1;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPER_DEF__DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Overload</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPER_DEF__OVERLOAD = 3;

  /**
   * The feature id for the '<em><b>Overloads</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPER_DEF__OVERLOADS = 4;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPER_DEF__ARGS = 5;

  /**
   * The number of structural features of the '<em>Oper Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPER_DEF_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.LinDefImpl <em>Lin Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.LinDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getLinDef()
   * @generated
   */
  int LIN_DEF = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIN_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIN_DEF__DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIN_DEF__ARGS = 2;

  /**
   * The number of structural features of the '<em>Lin Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIN_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.TermDefImpl <em>Term Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.TermDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getTermDef()
   * @generated
   */
  int TERM_DEF = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_DEF__DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Term Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.FlagDefImpl <em>Flag Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.FlagDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getFlagDef()
   * @generated
   */
  int FLAG_DEF = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAG_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAG_DEF__VALUE = 1;

  /**
   * The number of structural features of the '<em>Flag Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAG_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ParConstrImpl <em>Par Constr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ParConstrImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getParConstr()
   * @generated
   */
  int PAR_CONSTR = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_CONSTR__NAME = 0;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_CONSTR__CONSTRUCTORS = 1;

  /**
   * The number of structural features of the '<em>Par Constr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_CONSTR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.NameImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getName_()
   * @generated
   */
  int NAME = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.LocDefImpl <em>Loc Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.LocDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getLocDef()
   * @generated
   */
  int LOC_DEF = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_DEF__TYPE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_DEF__VALUE = 2;

  /**
   * The number of structural features of the '<em>Loc Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOC_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.PattImpl <em>Patt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.PattImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPatt()
   * @generated
   */
  int PATT = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__LEFT = 0;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__OR = 1;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__AND = 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__RIGHT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__NAME = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__VALUE = 5;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__LABEL = 6;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__META = 7;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__TOKEN_LIST = 8;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__WILDCARD = 9;

  /**
   * The number of structural features of the '<em>Patt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ExpImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp()
   * @generated
   */
  int EXP = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__LEFT = PATT__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__OR = PATT__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__AND = PATT__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__RIGHT = PATT__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__NAME = PATT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__VALUE = PATT__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__LABEL = PATT__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__META = PATT__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__TOKEN_LIST = PATT__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__WILDCARD = PATT__WILDCARD;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__BIND_LIST = PATT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__E = PATT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__DEF_LIST = PATT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__CASE_LIST = PATT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__ARG_TYPE = PATT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__EXP_LIST = PATT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__CASE_OF = PATT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Alts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__ALTS = PATT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__PATTERN = PATT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__INNER = PATT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__SORT = PATT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__STRING = PATT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__INTEGER = PATT_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__DOUBLE = PATT_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__EMPTY_STRING = PATT_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__LIST_CAT = PATT_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__CATEGORY = PATT_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__LIST = PATT_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__RECORD = PATT_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__TUPLE = PATT_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__TUPLE_LIST = PATT_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__V = PATT_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__TYPE = PATT_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__IDENTITY = PATT_FEATURE_COUNT + 23;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = PATT_FEATURE_COUNT + 24;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListLocDefImpl <em>List Loc Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListLocDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListLocDef()
   * @generated
   */
  int LIST_LOC_DEF = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__OR = EXP__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__AND = EXP__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__RIGHT = EXP__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__NAME = EXP__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__LABEL = EXP__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__META = EXP__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__TOKEN_LIST = EXP__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__WILDCARD = EXP__WILDCARD;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__BIND_LIST = EXP__BIND_LIST;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__E = EXP__E;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__DEF_LIST = EXP__DEF_LIST;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__CASE_LIST = EXP__CASE_LIST;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__ARG_TYPE = EXP__ARG_TYPE;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__EXP_LIST = EXP__EXP_LIST;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__CASE_OF = EXP__CASE_OF;

  /**
   * The feature id for the '<em><b>Alts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__ALTS = EXP__ALTS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__PATTERN = EXP__PATTERN;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__INNER = EXP__INNER;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__SORT = EXP__SORT;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__STRING = EXP__STRING;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__INTEGER = EXP__INTEGER;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__DOUBLE = EXP__DOUBLE;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__EMPTY_STRING = EXP__EMPTY_STRING;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__LIST_CAT = EXP__LIST_CAT;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__CATEGORY = EXP__CATEGORY;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__LIST = EXP__LIST;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__RECORD = EXP__RECORD;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__TUPLE = EXP__TUPLE;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__TUPLE_LIST = EXP__TUPLE_LIST;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__V = EXP__V;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__TYPE = EXP__TYPE;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__IDENTITY = EXP__IDENTITY;

  /**
   * The feature id for the '<em><b>Local Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__LOCAL_DEFINITIONS = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Loc Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListExpImpl <em>List Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListExpImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListExp()
   * @generated
   */
  int LIST_EXP = 22;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXP__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>List Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_EXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ExpsImpl <em>Exps</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ExpsImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExps()
   * @generated
   */
  int EXPS = 23;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPS__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Exps</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.PattAssImpl <em>Patt Ass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.PattAssImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPattAss()
   * @generated
   */
  int PATT_ASS = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT_ASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT_ASS__VALUE = 1;

  /**
   * The number of structural features of the '<em>Patt Ass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT_ASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.LabelImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__INDEX = 1;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListPattAssImpl <em>List Patt Ass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListPattAssImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListPattAss()
   * @generated
   */
  int LIST_PATT_ASS = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__LEFT = PATT__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__OR = PATT__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__AND = PATT__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__RIGHT = PATT__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__NAME = PATT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__VALUE = PATT__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__LABEL = PATT__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__META = PATT__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__TOKEN_LIST = PATT__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__WILDCARD = PATT__WILDCARD;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__ASSIGNMENTS = PATT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Patt Ass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS_FEATURE_COUNT = PATT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListPattImpl <em>List Patt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListPattImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListPatt()
   * @generated
   */
  int LIST_PATT = 28;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT__PATTERNS = 0;

  /**
   * The number of structural features of the '<em>List Patt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ArgImpl <em>Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ArgImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getArg()
   * @generated
   */
  int ARG = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__NAME = 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG__WILDCARD = 1;

  /**
   * The number of structural features of the '<em>Arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.BindImpl <em>Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.BindImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getBind()
   * @generated
   */
  int BIND = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND__NAME = 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND__WILDCARD = 1;

  /**
   * The number of structural features of the '<em>Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListBindImpl <em>List Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListBindImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListBind()
   * @generated
   */
  int LIST_BIND = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__OR = EXP__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__AND = EXP__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__RIGHT = EXP__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__NAME = EXP__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__LABEL = EXP__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__META = EXP__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__TOKEN_LIST = EXP__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__WILDCARD = EXP__WILDCARD;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__BIND_LIST = EXP__BIND_LIST;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__E = EXP__E;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__DEF_LIST = EXP__DEF_LIST;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__CASE_LIST = EXP__CASE_LIST;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__ARG_TYPE = EXP__ARG_TYPE;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__EXP_LIST = EXP__EXP_LIST;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__CASE_OF = EXP__CASE_OF;

  /**
   * The feature id for the '<em><b>Alts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__ALTS = EXP__ALTS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__PATTERN = EXP__PATTERN;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__INNER = EXP__INNER;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__SORT = EXP__SORT;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__STRING = EXP__STRING;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__INTEGER = EXP__INTEGER;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__DOUBLE = EXP__DOUBLE;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__EMPTY_STRING = EXP__EMPTY_STRING;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__LIST_CAT = EXP__LIST_CAT;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__CATEGORY = EXP__CATEGORY;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__LIST = EXP__LIST;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__RECORD = EXP__RECORD;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__TUPLE = EXP__TUPLE;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__TUPLE_LIST = EXP__TUPLE_LIST;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__V = EXP__V;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__TYPE = EXP__TYPE;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__IDENTITY = EXP__IDENTITY;

  /**
   * The feature id for the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__DECL = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__BINDINGS = EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListTupleCompImpl <em>List Tuple Comp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListTupleCompImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListTupleComp()
   * @generated
   */
  int LIST_TUPLE_COMP = 32;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TUPLE_COMP__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>List Tuple Comp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TUPLE_COMP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListPattTupleCompImpl <em>List Patt Tuple Comp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListPattTupleCompImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListPattTupleComp()
   * @generated
   */
  int LIST_PATT_TUPLE_COMP = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__LEFT = PATT__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__OR = PATT__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__AND = PATT__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__RIGHT = PATT__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__NAME = PATT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__VALUE = PATT__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__LABEL = PATT__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__META = PATT__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__TOKEN_LIST = PATT__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__WILDCARD = PATT__WILDCARD;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__PATTERNS = PATT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Patt Tuple Comp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP_FEATURE_COUNT = PATT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.CaseImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getCase()
   * @generated
   */
  int CASE = 34;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__PATTERN = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE__E = 1;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListCaseImpl <em>List Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListCaseImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListCase()
   * @generated
   */
  int LIST_CASE = 35;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_CASE__CASES = 0;

  /**
   * The number of structural features of the '<em>List Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_CASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.AlternImpl <em>Altern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.AlternImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getAltern()
   * @generated
   */
  int ALTERN = 36;

  /**
   * The feature id for the '<em><b>Alt1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERN__ALT1 = 0;

  /**
   * The feature id for the '<em><b>Alt2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERN__ALT2 = 1;

  /**
   * The number of structural features of the '<em>Altern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.DDeclImpl <em>DDecl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.DDeclImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDDecl()
   * @generated
   */
  int DDECL = 37;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DDECL__BIND_LIST = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DDECL__E = 1;

  /**
   * The number of structural features of the '<em>DDecl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DDECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.IdentImpl <em>Ident</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.IdentImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getIdent()
   * @generated
   */
  int IDENT = 38;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__OR = EXP__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__AND = EXP__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__RIGHT = EXP__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__NAME = EXP__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__LABEL = EXP__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__META = EXP__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__TOKEN_LIST = EXP__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__WILDCARD = EXP__WILDCARD;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__BIND_LIST = EXP__BIND_LIST;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__E = EXP__E;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__DEF_LIST = EXP__DEF_LIST;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__CASE_LIST = EXP__CASE_LIST;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__ARG_TYPE = EXP__ARG_TYPE;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__EXP_LIST = EXP__EXP_LIST;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__CASE_OF = EXP__CASE_OF;

  /**
   * The feature id for the '<em><b>Alts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__ALTS = EXP__ALTS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__PATTERN = EXP__PATTERN;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__INNER = EXP__INNER;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__SORT = EXP__SORT;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__STRING = EXP__STRING;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__INTEGER = EXP__INTEGER;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__DOUBLE = EXP__DOUBLE;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__EMPTY_STRING = EXP__EMPTY_STRING;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__LIST_CAT = EXP__LIST_CAT;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__CATEGORY = EXP__CATEGORY;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__LIST = EXP__LIST;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__RECORD = EXP__RECORD;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__TUPLE = EXP__TUPLE;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__TUPLE_LIST = EXP__TUPLE_LIST;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__V = EXP__V;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__TYPE = EXP__TYPE;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__IDENTITY = EXP__IDENTITY;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__S = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ident</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ExpLF13Impl <em>Exp LF13</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ExpLF13Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExpLF13()
   * @generated
   */
  int EXP_LF13 = 39;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__OR = EXP__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__AND = EXP__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__RIGHT = EXP__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__NAME = EXP__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__LABEL = EXP__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__META = EXP__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__TOKEN_LIST = EXP__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__WILDCARD = EXP__WILDCARD;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__BIND_LIST = EXP__BIND_LIST;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__E = EXP__E;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__DEF_LIST = EXP__DEF_LIST;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__CASE_LIST = EXP__CASE_LIST;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__ARG_TYPE = EXP__ARG_TYPE;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__EXP_LIST = EXP__EXP_LIST;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__CASE_OF = EXP__CASE_OF;

  /**
   * The feature id for the '<em><b>Alts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__ALTS = EXP__ALTS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__PATTERN = EXP__PATTERN;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__INNER = EXP__INNER;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__SORT = EXP__SORT;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__STRING = EXP__STRING;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__INTEGER = EXP__INTEGER;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__DOUBLE = EXP__DOUBLE;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__EMPTY_STRING = EXP__EMPTY_STRING;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__LIST_CAT = EXP__LIST_CAT;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__CATEGORY = EXP__CATEGORY;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__LIST = EXP__LIST;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__RECORD = EXP__RECORD;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__TUPLE = EXP__TUPLE;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__TUPLE_LIST = EXP__TUPLE_LIST;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__V = EXP__V;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__TYPE = EXP__TYPE;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13__IDENTITY = EXP__IDENTITY;

  /**
   * The number of structural features of the '<em>Exp LF13</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_LF13_FEATURE_COUNT = EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp1Impl <em>Exp1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp1Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp1()
   * @generated
   */
  int EXP1 = 40;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__OR = EXP__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__AND = EXP__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__RIGHT = EXP__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__NAME = EXP__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__LABEL = EXP__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__META = EXP__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__TOKEN_LIST = EXP__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__WILDCARD = EXP__WILDCARD;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__BIND_LIST = EXP__BIND_LIST;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__E = EXP__E;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__DEF_LIST = EXP__DEF_LIST;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__CASE_LIST = EXP__CASE_LIST;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__ARG_TYPE = EXP__ARG_TYPE;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__EXP_LIST = EXP__EXP_LIST;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__CASE_OF = EXP__CASE_OF;

  /**
   * The feature id for the '<em><b>Alts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__ALTS = EXP__ALTS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__PATTERN = EXP__PATTERN;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__INNER = EXP__INNER;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__SORT = EXP__SORT;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__STRING = EXP__STRING;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__INTEGER = EXP__INTEGER;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__DOUBLE = EXP__DOUBLE;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__EMPTY_STRING = EXP__EMPTY_STRING;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__LIST_CAT = EXP__LIST_CAT;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__CATEGORY = EXP__CATEGORY;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__LIST = EXP__LIST;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__RECORD = EXP__RECORD;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__TUPLE = EXP__TUPLE;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__TUPLE_LIST = EXP__TUPLE_LIST;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__V = EXP__V;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__TYPE = EXP__TYPE;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__IDENTITY = EXP__IDENTITY;

  /**
   * The number of structural features of the '<em>Exp1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1_FEATURE_COUNT = EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp2Impl <em>Exp2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp2Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp2()
   * @generated
   */
  int EXP2 = 41;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__OR = EXP__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__AND = EXP__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__RIGHT = EXP__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__NAME = EXP__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__LABEL = EXP__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__META = EXP__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__TOKEN_LIST = EXP__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__WILDCARD = EXP__WILDCARD;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__BIND_LIST = EXP__BIND_LIST;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__E = EXP__E;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__DEF_LIST = EXP__DEF_LIST;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__CASE_LIST = EXP__CASE_LIST;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__ARG_TYPE = EXP__ARG_TYPE;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__EXP_LIST = EXP__EXP_LIST;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__CASE_OF = EXP__CASE_OF;

  /**
   * The feature id for the '<em><b>Alts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__ALTS = EXP__ALTS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__PATTERN = EXP__PATTERN;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__INNER = EXP__INNER;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__SORT = EXP__SORT;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__STRING = EXP__STRING;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__INTEGER = EXP__INTEGER;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__DOUBLE = EXP__DOUBLE;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__EMPTY_STRING = EXP__EMPTY_STRING;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__LIST_CAT = EXP__LIST_CAT;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__CATEGORY = EXP__CATEGORY;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__LIST = EXP__LIST;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__RECORD = EXP__RECORD;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__TUPLE = EXP__TUPLE;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__TUPLE_LIST = EXP__TUPLE_LIST;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__V = EXP__V;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__TYPE = EXP__TYPE;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__IDENTITY = EXP__IDENTITY;

  /**
   * The number of structural features of the '<em>Exp2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2_FEATURE_COUNT = EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp3Impl <em>Exp3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp3Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp3()
   * @generated
   */
  int EXP3 = 42;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__OR = EXP__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__AND = EXP__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__RIGHT = EXP__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__NAME = EXP__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__LABEL = EXP__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__META = EXP__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__TOKEN_LIST = EXP__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__WILDCARD = EXP__WILDCARD;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__BIND_LIST = EXP__BIND_LIST;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__E = EXP__E;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__DEF_LIST = EXP__DEF_LIST;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__CASE_LIST = EXP__CASE_LIST;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__ARG_TYPE = EXP__ARG_TYPE;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__EXP_LIST = EXP__EXP_LIST;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__CASE_OF = EXP__CASE_OF;

  /**
   * The feature id for the '<em><b>Alts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__ALTS = EXP__ALTS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__PATTERN = EXP__PATTERN;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__INNER = EXP__INNER;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__SORT = EXP__SORT;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__STRING = EXP__STRING;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__INTEGER = EXP__INTEGER;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__DOUBLE = EXP__DOUBLE;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__EMPTY_STRING = EXP__EMPTY_STRING;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__LIST_CAT = EXP__LIST_CAT;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__CATEGORY = EXP__CATEGORY;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__LIST = EXP__LIST;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__RECORD = EXP__RECORD;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__TUPLE = EXP__TUPLE;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__TUPLE_LIST = EXP__TUPLE_LIST;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__V = EXP__V;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__TYPE = EXP__TYPE;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__IDENTITY = EXP__IDENTITY;

  /**
   * The number of structural features of the '<em>Exp3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3_FEATURE_COUNT = EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl <em>Exp4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp4Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp4()
   * @generated
   */
  int EXP4 = 43;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__LEFT = EXP__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__OR = EXP__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__AND = EXP__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__RIGHT = EXP__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__NAME = EXP__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__VALUE = EXP__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__LABEL = EXP__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__META = EXP__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__TOKEN_LIST = EXP__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__WILDCARD = EXP__WILDCARD;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__BIND_LIST = EXP__BIND_LIST;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__E = EXP__E;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__DEF_LIST = EXP__DEF_LIST;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__CASE_LIST = EXP__CASE_LIST;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__ARG_TYPE = EXP__ARG_TYPE;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__EXP_LIST = EXP__EXP_LIST;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__CASE_OF = EXP__CASE_OF;

  /**
   * The feature id for the '<em><b>Alts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__ALTS = EXP__ALTS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__PATTERN = EXP__PATTERN;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__INNER = EXP__INNER;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__SORT = EXP__SORT;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__STRING = EXP__STRING;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__INTEGER = EXP__INTEGER;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__DOUBLE = EXP__DOUBLE;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__EMPTY_STRING = EXP__EMPTY_STRING;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__LIST_CAT = EXP__LIST_CAT;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__CATEGORY = EXP__CATEGORY;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__LIST = EXP__LIST;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__RECORD = EXP__RECORD;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__TUPLE = EXP__TUPLE;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__TUPLE_LIST = EXP__TUPLE_LIST;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__V = EXP__V;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__TYPE = EXP__TYPE;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__IDENTITY = EXP__IDENTITY;

  /**
   * The number of structural features of the '<em>Exp4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4_FEATURE_COUNT = EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.IntegerImpl <em>Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.IntegerImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getInteger()
   * @generated
   */
  int INTEGER = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__LEFT = PATT__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__OR = PATT__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__AND = PATT__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__RIGHT = PATT__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__NAME = PATT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__VALUE = PATT__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__LABEL = PATT__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__META = PATT__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__TOKEN_LIST = PATT__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__WILDCARD = PATT__WILDCARD;

  /**
   * The number of structural features of the '<em>Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_FEATURE_COUNT = PATT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.DoubleImpl <em>Double</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.DoubleImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDouble()
   * @generated
   */
  int DOUBLE = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__LEFT = PATT__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__OR = PATT__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__AND = PATT__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__RIGHT = PATT__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__NAME = PATT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__VALUE = PATT__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__LABEL = PATT__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__META = PATT__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__TOKEN_LIST = PATT__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE__WILDCARD = PATT__WILDCARD;

  /**
   * The number of structural features of the '<em>Double</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_FEATURE_COUNT = PATT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.StringImpl <em>String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.StringImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getString()
   * @generated
   */
  int STRING = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__LEFT = PATT__LEFT;

  /**
   * The feature id for the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__OR = PATT__OR;

  /**
   * The feature id for the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__AND = PATT__AND;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__RIGHT = PATT__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__NAME = PATT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__VALUE = PATT__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__LABEL = PATT__LABEL;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__META = PATT__META;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__TOKEN_LIST = PATT__TOKEN_LIST;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__WILDCARD = PATT__WILDCARD;

  /**
   * The number of structural features of the '<em>String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_COUNT = PATT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ModDef <em>Mod Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModDef
   * @generated
   */
  EClass getModDef();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.ModDef#isIncomplete <em>Incomplete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Incomplete</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModDef#isIncomplete()
   * @see #getModDef()
   * @generated
   */
  EAttribute getModDef_Incomplete();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ModDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModDef#getType()
   * @see #getModDef()
   * @generated
   */
  EReference getModDef_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ModDef#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModDef#getBody()
   * @see #getModDef()
   * @generated
   */
  EReference getModDef_Body();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ModType <em>Mod Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModType
   * @generated
   */
  EClass getModType();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.ModType#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModType#isAbstract()
   * @see #getModType()
   * @generated
   */
  EAttribute getModType_Abstract();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ModType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModType#getName()
   * @see #getModType()
   * @generated
   */
  EReference getModType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.ModType#isResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resource</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModType#isResource()
   * @see #getModType()
   * @generated
   */
  EAttribute getModType_Resource();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.ModType#isInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModType#isInterface()
   * @see #getModType()
   * @generated
   */
  EAttribute getModType_Interface();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.ModType#isConcrete <em>Concrete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Concrete</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModType#isConcrete()
   * @see #getModType()
   * @generated
   */
  EAttribute getModType_Concrete();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ModType#getAbstractName <em>Abstract Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModType#getAbstractName()
   * @see #getModType()
   * @generated
   */
  EReference getModType_AbstractName();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.ModType#isInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModType#isInstance()
   * @see #getModType()
   * @generated
   */
  EAttribute getModType_Instance();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ModBody <em>Mod Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Body</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModBody
   * @generated
   */
  EClass getModBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ModBody#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extends</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModBody#getExtends()
   * @see #getModBody()
   * @generated
   */
  EReference getModBody_Extends();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ModBody#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModBody#getContent()
   * @see #getModBody()
   * @generated
   */
  EReference getModBody_Content();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ModBody#getFunctor <em>Functor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Functor</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModBody#getFunctor()
   * @see #getModBody()
   * @generated
   */
  EReference getModBody_Functor();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.ModBody#isFunctorInstantiation <em>Functor Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Functor Instantiation</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModBody#isFunctorInstantiation()
   * @see #getModBody()
   * @generated
   */
  EAttribute getModBody_FunctorInstantiation();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ModBody#getInstantiations <em>Instantiations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instantiations</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModBody#getInstantiations()
   * @see #getModBody()
   * @generated
   */
  EReference getModBody_Instantiations();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ModContent <em>Mod Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Content</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModContent
   * @generated
   */
  EClass getModContent();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ModContent#getOpens <em>Opens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Opens</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModContent#getOpens()
   * @see #getModContent()
   * @generated
   */
  EReference getModContent_Opens();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ModContent#getJudgements <em>Judgements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Judgements</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModContent#getJudgements()
   * @see #getModContent()
   * @generated
   */
  EReference getModContent_Judgements();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Open <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open</em>'.
   * @see org.grammaticalframework.eclipse.gF.Open
   * @generated
   */
  EClass getOpen();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Open#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Open#getName()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Open#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alias</em>'.
   * @see org.grammaticalframework.eclipse.gF.Open#getAlias()
   * @see #getOpen()
   * @generated
   */
  EReference getOpen_Alias();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Inst <em>Inst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst</em>'.
   * @see org.grammaticalframework.eclipse.gF.Inst
   * @generated
   */
  EClass getInst();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Inst#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see org.grammaticalframework.eclipse.gF.Inst#getInterface()
   * @see #getInst()
   * @generated
   */
  EReference getInst_Interface();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Inst#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Inst#getName()
   * @see #getInst()
   * @generated
   */
  EReference getInst_Name();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Included <em>Included</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Included</em>'.
   * @see org.grammaticalframework.eclipse.gF.Included
   * @generated
   */
  EClass getIncluded();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Included#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Included#getName()
   * @see #getIncluded()
   * @generated
   */
  EReference getIncluded_Name();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Included#isInclusive <em>Inclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inclusive</em>'.
   * @see org.grammaticalframework.eclipse.gF.Included#isInclusive()
   * @see #getIncluded()
   * @generated
   */
  EAttribute getIncluded_Inclusive();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Included#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see org.grammaticalframework.eclipse.gF.Included#getIncludes()
   * @see #getIncluded()
   * @generated
   */
  EReference getIncluded_Includes();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Included#isExclusive <em>Exclusive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exclusive</em>'.
   * @see org.grammaticalframework.eclipse.gF.Included#isExclusive()
   * @see #getIncluded()
   * @generated
   */
  EAttribute getIncluded_Exclusive();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Included#getExcludes <em>Excludes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Excludes</em>'.
   * @see org.grammaticalframework.eclipse.gF.Included#getExcludes()
   * @see #getIncluded()
   * @generated
   */
  EReference getIncluded_Excludes();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.TopDef <em>Top Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef
   * @generated
   */
  EClass getTopDef();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isCat <em>Cat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cat</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isCat()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Cat();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.TopDef#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#getDefinitions()
   * @see #getTopDef()
   * @generated
   */
  EReference getTopDef_Definitions();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isFun <em>Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fun</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isFun()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Fun();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isDef()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Def();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isData()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Data();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isParam()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Param();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isOper <em>Oper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Oper</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isOper()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Oper();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isLincat <em>Lincat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lincat</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isLincat()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Lincat();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isLindef <em>Lindef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lindef</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isLindef()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Lindef();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isLin <em>Lin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lin</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isLin()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Lin();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isPrintname <em>Printname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Printname</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isPrintname()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Printname();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.TopDef#isFlags <em>Flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flags</em>'.
   * @see org.grammaticalframework.eclipse.gF.TopDef#isFlags()
   * @see #getTopDef()
   * @generated
   */
  EAttribute getTopDef_Flags();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.CatDef <em>Cat Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cat Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.CatDef
   * @generated
   */
  EClass getCatDef();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.CatDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.CatDef#getName()
   * @see #getCatDef()
   * @generated
   */
  EReference getCatDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.CatDef#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Context</em>'.
   * @see org.grammaticalframework.eclipse.gF.CatDef#getContext()
   * @see #getCatDef()
   * @generated
   */
  EReference getCatDef_Context();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.CatDef#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.grammaticalframework.eclipse.gF.CatDef#getSize()
   * @see #getCatDef()
   * @generated
   */
  EAttribute getCatDef_Size();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.FunDef <em>Fun Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fun Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.FunDef
   * @generated
   */
  EClass getFunDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.FunDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.FunDef#getName()
   * @see #getFunDef()
   * @generated
   */
  EReference getFunDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.FunDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.FunDef#getType()
   * @see #getFunDef()
   * @generated
   */
  EReference getFunDef_Type();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.DefDef <em>Def Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.DefDef
   * @generated
   */
  EClass getDefDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.DefDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.DefDef#getName()
   * @see #getDefDef()
   * @generated
   */
  EReference getDefDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.DefDef#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.grammaticalframework.eclipse.gF.DefDef#getDefinition()
   * @see #getDefDef()
   * @generated
   */
  EReference getDefDef_Definition();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.DefDef#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Patterns</em>'.
   * @see org.grammaticalframework.eclipse.gF.DefDef#getPatterns()
   * @see #getDefDef()
   * @generated
   */
  EReference getDefDef_Patterns();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.DataDef <em>Data Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.DataDef
   * @generated
   */
  EClass getDataDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.DataDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.DataDef#getName()
   * @see #getDataDef()
   * @generated
   */
  EReference getDataDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.DataDef#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see org.grammaticalframework.eclipse.gF.DataDef#getConstructors()
   * @see #getDataDef()
   * @generated
   */
  EReference getDataDef_Constructors();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.DataDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.DataDef#getType()
   * @see #getDataDef()
   * @generated
   */
  EReference getDataDef_Type();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ParamDef <em>Param Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParamDef
   * @generated
   */
  EClass getParamDef();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ParamDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParamDef#getName()
   * @see #getParamDef()
   * @generated
   */
  EReference getParamDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ParamDef#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParamDef#getConstructors()
   * @see #getParamDef()
   * @generated
   */
  EReference getParamDef_Constructors();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.OperDef <em>Oper Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Oper Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.OperDef
   * @generated
   */
  EClass getOperDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.OperDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.OperDef#getName()
   * @see #getOperDef()
   * @generated
   */
  EReference getOperDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.OperDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.OperDef#getType()
   * @see #getOperDef()
   * @generated
   */
  EReference getOperDef_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.OperDef#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.grammaticalframework.eclipse.gF.OperDef#getDefinition()
   * @see #getOperDef()
   * @generated
   */
  EReference getOperDef_Definition();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.OperDef#isOverload <em>Overload</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overload</em>'.
   * @see org.grammaticalframework.eclipse.gF.OperDef#isOverload()
   * @see #getOperDef()
   * @generated
   */
  EAttribute getOperDef_Overload();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.OperDef#getOverloads <em>Overloads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Overloads</em>'.
   * @see org.grammaticalframework.eclipse.gF.OperDef#getOverloads()
   * @see #getOperDef()
   * @generated
   */
  EReference getOperDef_Overloads();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.OperDef#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.grammaticalframework.eclipse.gF.OperDef#getArgs()
   * @see #getOperDef()
   * @generated
   */
  EReference getOperDef_Args();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.LinDef <em>Lin Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lin Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.LinDef
   * @generated
   */
  EClass getLinDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.LinDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.LinDef#getName()
   * @see #getLinDef()
   * @generated
   */
  EReference getLinDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.LinDef#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.grammaticalframework.eclipse.gF.LinDef#getDefinition()
   * @see #getLinDef()
   * @generated
   */
  EReference getLinDef_Definition();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.LinDef#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.grammaticalframework.eclipse.gF.LinDef#getArgs()
   * @see #getLinDef()
   * @generated
   */
  EReference getLinDef_Args();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.TermDef <em>Term Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.TermDef
   * @generated
   */
  EClass getTermDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.TermDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.TermDef#getName()
   * @see #getTermDef()
   * @generated
   */
  EReference getTermDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.TermDef#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.grammaticalframework.eclipse.gF.TermDef#getDefinition()
   * @see #getTermDef()
   * @generated
   */
  EReference getTermDef_Definition();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.FlagDef <em>Flag Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flag Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.FlagDef
   * @generated
   */
  EClass getFlagDef();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.FlagDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.FlagDef#getName()
   * @see #getFlagDef()
   * @generated
   */
  EReference getFlagDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.FlagDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.grammaticalframework.eclipse.gF.FlagDef#getValue()
   * @see #getFlagDef()
   * @generated
   */
  EReference getFlagDef_Value();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ParConstr <em>Par Constr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Par Constr</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParConstr
   * @generated
   */
  EClass getParConstr();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ParConstr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParConstr#getName()
   * @see #getParConstr()
   * @generated
   */
  EReference getParConstr_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ParConstr#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParConstr#getConstructors()
   * @see #getParConstr()
   * @generated
   */
  EReference getParConstr_Constructors();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Name#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Name#getName()
   * @see #getName_()
   * @generated
   */
  EReference getName_Name();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.LocDef <em>Loc Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loc Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.LocDef
   * @generated
   */
  EClass getLocDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.LocDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.LocDef#getName()
   * @see #getLocDef()
   * @generated
   */
  EReference getLocDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.LocDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.LocDef#getType()
   * @see #getLocDef()
   * @generated
   */
  EReference getLocDef_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.LocDef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.grammaticalframework.eclipse.gF.LocDef#getValue()
   * @see #getLocDef()
   * @generated
   */
  EReference getLocDef_Value();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ListLocDef <em>List Loc Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Loc Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListLocDef
   * @generated
   */
  EClass getListLocDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListLocDef#getLocalDefinitions <em>Local Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Local Definitions</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListLocDef#getLocalDefinitions()
   * @see #getListLocDef()
   * @generated
   */
  EReference getListLocDef_LocalDefinitions();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getDefList <em>Def List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getDefList()
   * @see #getExp()
   * @generated
   */
  EReference getExp_DefList();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getCaseList <em>Case List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getCaseList()
   * @see #getExp()
   * @generated
   */
  EReference getExp_CaseList();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getArgType <em>Arg Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getArgType()
   * @see #getExp()
   * @generated
   */
  EReference getExp_ArgType();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getExpList <em>Exp List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getExpList()
   * @see #getExp()
   * @generated
   */
  EReference getExp_ExpList();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getCaseOf <em>Case Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Of</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getCaseOf()
   * @see #getExp()
   * @generated
   */
  EReference getExp_CaseOf();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Exp#getAlts <em>Alts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alts</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getAlts()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Alts();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getPattern()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inner</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getInner()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Inner();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp#isSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#isSort()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_Sort();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp#isString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#isString()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_String();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp#isInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#isInteger()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_Integer();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp#isDouble <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#isDouble()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_Double();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp#isEmptyString <em>Empty String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty String</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#isEmptyString()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_EmptyString();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp#isListCat <em>List Cat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Cat</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#isListCat()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_ListCat();

  /**
   * Returns the meta object for the reference '{@link org.grammaticalframework.eclipse.gF.Exp#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getCategory()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Category();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getList()
   * @see #getExp()
   * @generated
   */
  EReference getExp_List();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp#isRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Record</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#isRecord()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_Record();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp#isTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tuple</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#isTuple()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getTupleList <em>Tuple List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getTupleList()
   * @see #getExp()
   * @generated
   */
  EReference getExp_TupleList();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getV()
   * @see #getExp()
   * @generated
   */
  EReference getExp_V();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getType()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Type();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp#isIdentity <em>Identity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identity</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#isIdentity()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_Identity();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ListExp <em>List Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Exp</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListExp
   * @generated
   */
  EClass getListExp();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListExp#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListExp#getExpressions()
   * @see #getListExp()
   * @generated
   */
  EReference getListExp_Expressions();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Exps <em>Exps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exps</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exps
   * @generated
   */
  EClass getExps();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Exps#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exps#getExpressions()
   * @see #getExps()
   * @generated
   */
  EReference getExps_Expressions();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Patt <em>Patt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patt</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt
   * @generated
   */
  EClass getPatt();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Patt#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#getLeft()
   * @see #getPatt()
   * @generated
   */
  EReference getPatt_Left();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Patt#isOr <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Or</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#isOr()
   * @see #getPatt()
   * @generated
   */
  EAttribute getPatt_Or();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Patt#isAnd <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>And</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#isAnd()
   * @see #getPatt()
   * @generated
   */
  EAttribute getPatt_And();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Patt#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#getRight()
   * @see #getPatt()
   * @generated
   */
  EReference getPatt_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Patt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#getName()
   * @see #getPatt()
   * @generated
   */
  EReference getPatt_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Patt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#getValue()
   * @see #getPatt()
   * @generated
   */
  EReference getPatt_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Patt#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#getLabel()
   * @see #getPatt()
   * @generated
   */
  EReference getPatt_Label();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Patt#isMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#isMeta()
   * @see #getPatt()
   * @generated
   */
  EAttribute getPatt_Meta();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Patt#isTokenList <em>Token List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Token List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#isTokenList()
   * @see #getPatt()
   * @generated
   */
  EAttribute getPatt_TokenList();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Patt#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#isWildcard()
   * @see #getPatt()
   * @generated
   */
  EAttribute getPatt_Wildcard();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.PattAss <em>Patt Ass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patt Ass</em>'.
   * @see org.grammaticalframework.eclipse.gF.PattAss
   * @generated
   */
  EClass getPattAss();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.PattAss#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.PattAss#getName()
   * @see #getPattAss()
   * @generated
   */
  EReference getPattAss_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.PattAss#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.grammaticalframework.eclipse.gF.PattAss#getValue()
   * @see #getPattAss()
   * @generated
   */
  EReference getPattAss_Value();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.grammaticalframework.eclipse.gF.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EReference getLabel_Name();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Label#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.grammaticalframework.eclipse.gF.Label#getIndex()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Index();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ListPattAss <em>List Patt Ass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Patt Ass</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListPattAss
   * @generated
   */
  EClass getListPattAss();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListPattAss#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListPattAss#getAssignments()
   * @see #getListPattAss()
   * @generated
   */
  EReference getListPattAss_Assignments();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ListPatt <em>List Patt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Patt</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListPatt
   * @generated
   */
  EClass getListPatt();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListPatt#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListPatt#getPatterns()
   * @see #getListPatt()
   * @generated
   */
  EReference getListPatt_Patterns();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Arg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg</em>'.
   * @see org.grammaticalframework.eclipse.gF.Arg
   * @generated
   */
  EClass getArg();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Arg#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Arg#getName()
   * @see #getArg()
   * @generated
   */
  EReference getArg_Name();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Arg#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.grammaticalframework.eclipse.gF.Arg#isWildcard()
   * @see #getArg()
   * @generated
   */
  EAttribute getArg_Wildcard();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind</em>'.
   * @see org.grammaticalframework.eclipse.gF.Bind
   * @generated
   */
  EClass getBind();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Bind#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Bind#getName()
   * @see #getBind()
   * @generated
   */
  EReference getBind_Name();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Bind#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.grammaticalframework.eclipse.gF.Bind#isWildcard()
   * @see #getBind()
   * @generated
   */
  EAttribute getBind_Wildcard();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ListBind <em>List Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Bind</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListBind
   * @generated
   */
  EClass getListBind();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ListBind#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Decl</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListBind#getDecl()
   * @see #getListBind()
   * @generated
   */
  EReference getListBind_Decl();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListBind#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListBind#getBindings()
   * @see #getListBind()
   * @generated
   */
  EReference getListBind_Bindings();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ListTupleComp <em>List Tuple Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Tuple Comp</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListTupleComp
   * @generated
   */
  EClass getListTupleComp();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListTupleComp#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListTupleComp#getElements()
   * @see #getListTupleComp()
   * @generated
   */
  EReference getListTupleComp_Elements();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ListPattTupleComp <em>List Patt Tuple Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Patt Tuple Comp</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListPattTupleComp
   * @generated
   */
  EClass getListPattTupleComp();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListPattTupleComp#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patterns</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListPattTupleComp#getPatterns()
   * @see #getListPattTupleComp()
   * @generated
   */
  EReference getListPattTupleComp_Patterns();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Case <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see org.grammaticalframework.eclipse.gF.Case
   * @generated
   */
  EClass getCase();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Case#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see org.grammaticalframework.eclipse.gF.Case#getPattern()
   * @see #getCase()
   * @generated
   */
  EReference getCase_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Case#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.grammaticalframework.eclipse.gF.Case#getE()
   * @see #getCase()
   * @generated
   */
  EReference getCase_E();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ListCase <em>List Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Case</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListCase
   * @generated
   */
  EClass getListCase();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListCase#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListCase#getCases()
   * @see #getListCase()
   * @generated
   */
  EReference getListCase_Cases();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Altern <em>Altern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Altern</em>'.
   * @see org.grammaticalframework.eclipse.gF.Altern
   * @generated
   */
  EClass getAltern();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Altern#getAlt1 <em>Alt1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alt1</em>'.
   * @see org.grammaticalframework.eclipse.gF.Altern#getAlt1()
   * @see #getAltern()
   * @generated
   */
  EReference getAltern_Alt1();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Altern#getAlt2 <em>Alt2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alt2</em>'.
   * @see org.grammaticalframework.eclipse.gF.Altern#getAlt2()
   * @see #getAltern()
   * @generated
   */
  EReference getAltern_Alt2();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.DDecl <em>DDecl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DDecl</em>'.
   * @see org.grammaticalframework.eclipse.gF.DDecl
   * @generated
   */
  EClass getDDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.DDecl#getBindList <em>Bind List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bind List</em>'.
   * @see org.grammaticalframework.eclipse.gF.DDecl#getBindList()
   * @see #getDDecl()
   * @generated
   */
  EReference getDDecl_BindList();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.DDecl#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E</em>'.
   * @see org.grammaticalframework.eclipse.gF.DDecl#getE()
   * @see #getDDecl()
   * @generated
   */
  EReference getDDecl_E();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Ident <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ident</em>'.
   * @see org.grammaticalframework.eclipse.gF.Ident
   * @generated
   */
  EClass getIdent();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Ident#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see org.grammaticalframework.eclipse.gF.Ident#getS()
   * @see #getIdent()
   * @generated
   */
  EAttribute getIdent_S();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ExpLF13 <em>Exp LF13</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp LF13</em>'.
   * @see org.grammaticalframework.eclipse.gF.ExpLF13
   * @generated
   */
  EClass getExpLF13();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Exp1 <em>Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp1</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp1
   * @generated
   */
  EClass getExp1();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Exp2 <em>Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp2</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp2
   * @generated
   */
  EClass getExp2();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Exp3 <em>Exp3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp3</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp3
   * @generated
   */
  EClass getExp3();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Exp4 <em>Exp4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp4</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp4
   * @generated
   */
  EClass getExp4();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Integer <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer</em>'.
   * @see org.grammaticalframework.eclipse.gF.Integer
   * @generated
   */
  EClass getInteger();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Double <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double</em>'.
   * @see org.grammaticalframework.eclipse.gF.Double
   * @generated
   */
  EClass getDouble();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.String <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String</em>'.
   * @see org.grammaticalframework.eclipse.gF.String
   * @generated
   */
  EClass getString();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GFFactory getGFFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ModDefImpl <em>Mod Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ModDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getModDef()
     * @generated
     */
    EClass MOD_DEF = eINSTANCE.getModDef();

    /**
     * The meta object literal for the '<em><b>Incomplete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_DEF__INCOMPLETE = eINSTANCE.getModDef_Incomplete();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_DEF__TYPE = eINSTANCE.getModDef_Type();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_DEF__BODY = eINSTANCE.getModDef_Body();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ModTypeImpl <em>Mod Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ModTypeImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getModType()
     * @generated
     */
    EClass MOD_TYPE = eINSTANCE.getModType();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_TYPE__ABSTRACT = eINSTANCE.getModType_Abstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_TYPE__NAME = eINSTANCE.getModType_Name();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_TYPE__RESOURCE = eINSTANCE.getModType_Resource();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_TYPE__INTERFACE = eINSTANCE.getModType_Interface();

    /**
     * The meta object literal for the '<em><b>Concrete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_TYPE__CONCRETE = eINSTANCE.getModType_Concrete();

    /**
     * The meta object literal for the '<em><b>Abstract Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_TYPE__ABSTRACT_NAME = eINSTANCE.getModType_AbstractName();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_TYPE__INSTANCE = eINSTANCE.getModType_Instance();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl <em>Mod Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ModBodyImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getModBody()
     * @generated
     */
    EClass MOD_BODY = eINSTANCE.getModBody();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_BODY__EXTENDS = eINSTANCE.getModBody_Extends();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_BODY__CONTENT = eINSTANCE.getModBody_Content();

    /**
     * The meta object literal for the '<em><b>Functor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_BODY__FUNCTOR = eINSTANCE.getModBody_Functor();

    /**
     * The meta object literal for the '<em><b>Functor Instantiation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD_BODY__FUNCTOR_INSTANTIATION = eINSTANCE.getModBody_FunctorInstantiation();

    /**
     * The meta object literal for the '<em><b>Instantiations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_BODY__INSTANTIATIONS = eINSTANCE.getModBody_Instantiations();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ModContentImpl <em>Mod Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ModContentImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getModContent()
     * @generated
     */
    EClass MOD_CONTENT = eINSTANCE.getModContent();

    /**
     * The meta object literal for the '<em><b>Opens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_CONTENT__OPENS = eINSTANCE.getModContent_Opens();

    /**
     * The meta object literal for the '<em><b>Judgements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_CONTENT__JUDGEMENTS = eINSTANCE.getModContent_Judgements();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.OpenImpl <em>Open</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.OpenImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getOpen()
     * @generated
     */
    EClass OPEN = eINSTANCE.getOpen();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__NAME = eINSTANCE.getOpen_Name();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN__ALIAS = eINSTANCE.getOpen_Alias();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.InstImpl <em>Inst</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.InstImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getInst()
     * @generated
     */
    EClass INST = eINSTANCE.getInst();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INST__INTERFACE = eINSTANCE.getInst_Interface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INST__NAME = eINSTANCE.getInst_Name();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.IncludedImpl <em>Included</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.IncludedImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getIncluded()
     * @generated
     */
    EClass INCLUDED = eINSTANCE.getIncluded();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDED__NAME = eINSTANCE.getIncluded_Name();

    /**
     * The meta object literal for the '<em><b>Inclusive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDED__INCLUSIVE = eINSTANCE.getIncluded_Inclusive();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDED__INCLUDES = eINSTANCE.getIncluded_Includes();

    /**
     * The meta object literal for the '<em><b>Exclusive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDED__EXCLUSIVE = eINSTANCE.getIncluded_Exclusive();

    /**
     * The meta object literal for the '<em><b>Excludes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDED__EXCLUDES = eINSTANCE.getIncluded_Excludes();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl <em>Top Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.TopDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getTopDef()
     * @generated
     */
    EClass TOP_DEF = eINSTANCE.getTopDef();

    /**
     * The meta object literal for the '<em><b>Cat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__CAT = eINSTANCE.getTopDef_Cat();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_DEF__DEFINITIONS = eINSTANCE.getTopDef_Definitions();

    /**
     * The meta object literal for the '<em><b>Fun</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__FUN = eINSTANCE.getTopDef_Fun();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__DEF = eINSTANCE.getTopDef_Def();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__DATA = eINSTANCE.getTopDef_Data();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__PARAM = eINSTANCE.getTopDef_Param();

    /**
     * The meta object literal for the '<em><b>Oper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__OPER = eINSTANCE.getTopDef_Oper();

    /**
     * The meta object literal for the '<em><b>Lincat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__LINCAT = eINSTANCE.getTopDef_Lincat();

    /**
     * The meta object literal for the '<em><b>Lindef</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__LINDEF = eINSTANCE.getTopDef_Lindef();

    /**
     * The meta object literal for the '<em><b>Lin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__LIN = eINSTANCE.getTopDef_Lin();

    /**
     * The meta object literal for the '<em><b>Printname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__PRINTNAME = eINSTANCE.getTopDef_Printname();

    /**
     * The meta object literal for the '<em><b>Flags</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__FLAGS = eINSTANCE.getTopDef_Flags();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.CatDefImpl <em>Cat Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.CatDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getCatDef()
     * @generated
     */
    EClass CAT_DEF = eINSTANCE.getCatDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAT_DEF__NAME = eINSTANCE.getCatDef_Name();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAT_DEF__CONTEXT = eINSTANCE.getCatDef_Context();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAT_DEF__SIZE = eINSTANCE.getCatDef_Size();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.FunDefImpl <em>Fun Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.FunDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getFunDef()
     * @generated
     */
    EClass FUN_DEF = eINSTANCE.getFunDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN_DEF__NAME = eINSTANCE.getFunDef_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN_DEF__TYPE = eINSTANCE.getFunDef_Type();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.DefDefImpl <em>Def Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.DefDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDefDef()
     * @generated
     */
    EClass DEF_DEF = eINSTANCE.getDefDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_DEF__NAME = eINSTANCE.getDefDef_Name();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_DEF__DEFINITION = eINSTANCE.getDefDef_Definition();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_DEF__PATTERNS = eINSTANCE.getDefDef_Patterns();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.DataDefImpl <em>Data Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.DataDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDataDef()
     * @generated
     */
    EClass DATA_DEF = eINSTANCE.getDataDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEF__NAME = eINSTANCE.getDataDef_Name();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEF__CONSTRUCTORS = eINSTANCE.getDataDef_Constructors();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_DEF__TYPE = eINSTANCE.getDataDef_Type();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ParamDefImpl <em>Param Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ParamDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getParamDef()
     * @generated
     */
    EClass PARAM_DEF = eINSTANCE.getParamDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_DEF__NAME = eINSTANCE.getParamDef_Name();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_DEF__CONSTRUCTORS = eINSTANCE.getParamDef_Constructors();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.OperDefImpl <em>Oper Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.OperDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getOperDef()
     * @generated
     */
    EClass OPER_DEF = eINSTANCE.getOperDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPER_DEF__NAME = eINSTANCE.getOperDef_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPER_DEF__TYPE = eINSTANCE.getOperDef_Type();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPER_DEF__DEFINITION = eINSTANCE.getOperDef_Definition();

    /**
     * The meta object literal for the '<em><b>Overload</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPER_DEF__OVERLOAD = eINSTANCE.getOperDef_Overload();

    /**
     * The meta object literal for the '<em><b>Overloads</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPER_DEF__OVERLOADS = eINSTANCE.getOperDef_Overloads();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPER_DEF__ARGS = eINSTANCE.getOperDef_Args();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.LinDefImpl <em>Lin Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.LinDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getLinDef()
     * @generated
     */
    EClass LIN_DEF = eINSTANCE.getLinDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIN_DEF__NAME = eINSTANCE.getLinDef_Name();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIN_DEF__DEFINITION = eINSTANCE.getLinDef_Definition();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIN_DEF__ARGS = eINSTANCE.getLinDef_Args();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.TermDefImpl <em>Term Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.TermDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getTermDef()
     * @generated
     */
    EClass TERM_DEF = eINSTANCE.getTermDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_DEF__NAME = eINSTANCE.getTermDef_Name();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_DEF__DEFINITION = eINSTANCE.getTermDef_Definition();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.FlagDefImpl <em>Flag Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.FlagDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getFlagDef()
     * @generated
     */
    EClass FLAG_DEF = eINSTANCE.getFlagDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLAG_DEF__NAME = eINSTANCE.getFlagDef_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLAG_DEF__VALUE = eINSTANCE.getFlagDef_Value();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ParConstrImpl <em>Par Constr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ParConstrImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getParConstr()
     * @generated
     */
    EClass PAR_CONSTR = eINSTANCE.getParConstr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_CONSTR__NAME = eINSTANCE.getParConstr_Name();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_CONSTR__CONSTRUCTORS = eINSTANCE.getParConstr_Constructors();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.NameImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME__NAME = eINSTANCE.getName_Name();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.LocDefImpl <em>Loc Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.LocDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getLocDef()
     * @generated
     */
    EClass LOC_DEF = eINSTANCE.getLocDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_DEF__NAME = eINSTANCE.getLocDef_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_DEF__TYPE = eINSTANCE.getLocDef_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOC_DEF__VALUE = eINSTANCE.getLocDef_Value();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ListLocDefImpl <em>List Loc Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ListLocDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListLocDef()
     * @generated
     */
    EClass LIST_LOC_DEF = eINSTANCE.getListLocDef();

    /**
     * The meta object literal for the '<em><b>Local Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LOC_DEF__LOCAL_DEFINITIONS = eINSTANCE.getListLocDef_LocalDefinitions();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ExpImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '<em><b>Def List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__DEF_LIST = eINSTANCE.getExp_DefList();

    /**
     * The meta object literal for the '<em><b>Case List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__CASE_LIST = eINSTANCE.getExp_CaseList();

    /**
     * The meta object literal for the '<em><b>Arg Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__ARG_TYPE = eINSTANCE.getExp_ArgType();

    /**
     * The meta object literal for the '<em><b>Exp List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__EXP_LIST = eINSTANCE.getExp_ExpList();

    /**
     * The meta object literal for the '<em><b>Case Of</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__CASE_OF = eINSTANCE.getExp_CaseOf();

    /**
     * The meta object literal for the '<em><b>Alts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__ALTS = eINSTANCE.getExp_Alts();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__PATTERN = eINSTANCE.getExp_Pattern();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__INNER = eINSTANCE.getExp_Inner();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__SORT = eINSTANCE.getExp_Sort();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__STRING = eINSTANCE.getExp_String();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__INTEGER = eINSTANCE.getExp_Integer();

    /**
     * The meta object literal for the '<em><b>Double</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__DOUBLE = eINSTANCE.getExp_Double();

    /**
     * The meta object literal for the '<em><b>Empty String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__EMPTY_STRING = eINSTANCE.getExp_EmptyString();

    /**
     * The meta object literal for the '<em><b>List Cat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__LIST_CAT = eINSTANCE.getExp_ListCat();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__CATEGORY = eINSTANCE.getExp_Category();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__LIST = eINSTANCE.getExp_List();

    /**
     * The meta object literal for the '<em><b>Record</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__RECORD = eINSTANCE.getExp_Record();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__TUPLE = eINSTANCE.getExp_Tuple();

    /**
     * The meta object literal for the '<em><b>Tuple List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__TUPLE_LIST = eINSTANCE.getExp_TupleList();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__V = eINSTANCE.getExp_V();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__TYPE = eINSTANCE.getExp_Type();

    /**
     * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__IDENTITY = eINSTANCE.getExp_Identity();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ListExpImpl <em>List Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ListExpImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListExp()
     * @generated
     */
    EClass LIST_EXP = eINSTANCE.getListExp();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_EXP__EXPRESSIONS = eINSTANCE.getListExp_Expressions();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ExpsImpl <em>Exps</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ExpsImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExps()
     * @generated
     */
    EClass EXPS = eINSTANCE.getExps();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPS__EXPRESSIONS = eINSTANCE.getExps_Expressions();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.PattImpl <em>Patt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.PattImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPatt()
     * @generated
     */
    EClass PATT = eINSTANCE.getPatt();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT__LEFT = eINSTANCE.getPatt_Left();

    /**
     * The meta object literal for the '<em><b>Or</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATT__OR = eINSTANCE.getPatt_Or();

    /**
     * The meta object literal for the '<em><b>And</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATT__AND = eINSTANCE.getPatt_And();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT__RIGHT = eINSTANCE.getPatt_Right();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT__NAME = eINSTANCE.getPatt_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT__VALUE = eINSTANCE.getPatt_Value();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT__LABEL = eINSTANCE.getPatt_Label();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATT__META = eINSTANCE.getPatt_Meta();

    /**
     * The meta object literal for the '<em><b>Token List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATT__TOKEN_LIST = eINSTANCE.getPatt_TokenList();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATT__WILDCARD = eINSTANCE.getPatt_Wildcard();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.PattAssImpl <em>Patt Ass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.PattAssImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPattAss()
     * @generated
     */
    EClass PATT_ASS = eINSTANCE.getPattAss();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT_ASS__NAME = eINSTANCE.getPattAss_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT_ASS__VALUE = eINSTANCE.getPattAss_Value();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.LabelImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABEL__NAME = eINSTANCE.getLabel_Name();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__INDEX = eINSTANCE.getLabel_Index();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ListPattAssImpl <em>List Patt Ass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ListPattAssImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListPattAss()
     * @generated
     */
    EClass LIST_PATT_ASS = eINSTANCE.getListPattAss();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PATT_ASS__ASSIGNMENTS = eINSTANCE.getListPattAss_Assignments();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ListPattImpl <em>List Patt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ListPattImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListPatt()
     * @generated
     */
    EClass LIST_PATT = eINSTANCE.getListPatt();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PATT__PATTERNS = eINSTANCE.getListPatt_Patterns();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ArgImpl <em>Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ArgImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getArg()
     * @generated
     */
    EClass ARG = eINSTANCE.getArg();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG__NAME = eINSTANCE.getArg_Name();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARG__WILDCARD = eINSTANCE.getArg_Wildcard();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.BindImpl <em>Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.BindImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getBind()
     * @generated
     */
    EClass BIND = eINSTANCE.getBind();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND__NAME = eINSTANCE.getBind_Name();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIND__WILDCARD = eINSTANCE.getBind_Wildcard();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ListBindImpl <em>List Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ListBindImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListBind()
     * @generated
     */
    EClass LIST_BIND = eINSTANCE.getListBind();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_BIND__DECL = eINSTANCE.getListBind_Decl();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_BIND__BINDINGS = eINSTANCE.getListBind_Bindings();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ListTupleCompImpl <em>List Tuple Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ListTupleCompImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListTupleComp()
     * @generated
     */
    EClass LIST_TUPLE_COMP = eINSTANCE.getListTupleComp();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TUPLE_COMP__ELEMENTS = eINSTANCE.getListTupleComp_Elements();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ListPattTupleCompImpl <em>List Patt Tuple Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ListPattTupleCompImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListPattTupleComp()
     * @generated
     */
    EClass LIST_PATT_TUPLE_COMP = eINSTANCE.getListPattTupleComp();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PATT_TUPLE_COMP__PATTERNS = eINSTANCE.getListPattTupleComp_Patterns();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.CaseImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getCase()
     * @generated
     */
    EClass CASE = eINSTANCE.getCase();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__PATTERN = eINSTANCE.getCase_Pattern();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE__E = eINSTANCE.getCase_E();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ListCaseImpl <em>List Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ListCaseImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListCase()
     * @generated
     */
    EClass LIST_CASE = eINSTANCE.getListCase();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_CASE__CASES = eINSTANCE.getListCase_Cases();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.AlternImpl <em>Altern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.AlternImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getAltern()
     * @generated
     */
    EClass ALTERN = eINSTANCE.getAltern();

    /**
     * The meta object literal for the '<em><b>Alt1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERN__ALT1 = eINSTANCE.getAltern_Alt1();

    /**
     * The meta object literal for the '<em><b>Alt2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERN__ALT2 = eINSTANCE.getAltern_Alt2();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.DDeclImpl <em>DDecl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.DDeclImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDDecl()
     * @generated
     */
    EClass DDECL = eINSTANCE.getDDecl();

    /**
     * The meta object literal for the '<em><b>Bind List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DDECL__BIND_LIST = eINSTANCE.getDDecl_BindList();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DDECL__E = eINSTANCE.getDDecl_E();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.IdentImpl <em>Ident</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.IdentImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getIdent()
     * @generated
     */
    EClass IDENT = eINSTANCE.getIdent();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENT__S = eINSTANCE.getIdent_S();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ExpLF13Impl <em>Exp LF13</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ExpLF13Impl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExpLF13()
     * @generated
     */
    EClass EXP_LF13 = eINSTANCE.getExpLF13();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp1Impl <em>Exp1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.Exp1Impl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp1()
     * @generated
     */
    EClass EXP1 = eINSTANCE.getExp1();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp2Impl <em>Exp2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.Exp2Impl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp2()
     * @generated
     */
    EClass EXP2 = eINSTANCE.getExp2();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp3Impl <em>Exp3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.Exp3Impl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp3()
     * @generated
     */
    EClass EXP3 = eINSTANCE.getExp3();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl <em>Exp4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.Exp4Impl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp4()
     * @generated
     */
    EClass EXP4 = eINSTANCE.getExp4();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.IntegerImpl <em>Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.IntegerImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getInteger()
     * @generated
     */
    EClass INTEGER = eINSTANCE.getInteger();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.DoubleImpl <em>Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.DoubleImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDouble()
     * @generated
     */
    EClass DOUBLE = eINSTANCE.getDouble();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.StringImpl <em>String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.StringImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getString()
     * @generated
     */
    EClass STRING = eINSTANCE.getString();

  }

} //GFPackage
