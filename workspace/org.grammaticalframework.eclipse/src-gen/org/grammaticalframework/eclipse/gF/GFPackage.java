/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

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
   * The feature id for the '<em><b>Opens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__OPENS = 1;

  /**
   * The feature id for the '<em><b>Judgements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__JUDGEMENTS = 2;

  /**
   * The feature id for the '<em><b>Functor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__FUNCTOR = 3;

  /**
   * The feature id for the '<em><b>Functor Instantiation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__FUNCTOR_INSTANTIATION = 4;

  /**
   * The feature id for the '<em><b>Instantiations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY__INSTANTIATIONS = 5;

  /**
   * The number of structural features of the '<em>Mod Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_BODY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.OpenImpl <em>Open</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.OpenImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getOpen()
   * @generated
   */
  int OPEN = 3;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.IncludedImpl <em>Included</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.IncludedImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getIncluded()
   * @generated
   */
  int INCLUDED = 4;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.DefImpl <em>Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.DefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDef()
   * @generated
   */
  int DEF = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__TYPE = 2;

  /**
   * The feature id for the '<em><b>Patterns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__PATTERNS = 3;

  /**
   * The feature id for the '<em><b>Overload</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__OVERLOAD = 4;

  /**
   * The feature id for the '<em><b>Overloads</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF__OVERLOADS = 5;

  /**
   * The number of structural features of the '<em>Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl <em>Top Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.TopDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getTopDef()
   * @generated
   */
  int TOP_DEF = 6;

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
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__DATA = 3;

  /**
   * The feature id for the '<em><b>Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_DEF__DEF = 4;

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
  int CAT_DEF = 7;

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
  int FUN_DEF = 8;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.DataDefImpl <em>Data Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.DataDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDataDef()
   * @generated
   */
  int DATA_DEF = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
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
   * The number of structural features of the '<em>Data Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.DataConstrImpl <em>Data Constr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.DataConstrImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDataConstr()
   * @generated
   */
  int DATA_CONSTR = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONSTR__NAME = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONSTR__MODULE = 1;

  /**
   * The number of structural features of the '<em>Data Constr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_CONSTR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ParDefImpl <em>Par Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ParDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getParDef()
   * @generated
   */
  int PAR_DEF = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_DEF__CONSTRUCTORS = 1;

  /**
   * The feature id for the '<em><b>Id2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_DEF__ID2 = 2;

  /**
   * The number of structural features of the '<em>Par Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ParConstrImpl <em>Par Constr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ParConstrImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getParConstr()
   * @generated
   */
  int PAR_CONSTR = 12;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.PrintDefImpl <em>Print Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.PrintDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPrintDef()
   * @generated
   */
  int PRINT_DEF = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Printname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_DEF__PRINTNAME = 1;

  /**
   * The number of structural features of the '<em>Print Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.FlagDefImpl <em>Flag Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.FlagDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getFlagDef()
   * @generated
   */
  int FLAG_DEF = 14;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.NameImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getName_()
   * @generated
   */
  int NAME = 15;

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
  int LOC_DEF = 16;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListLocDefImpl <em>List Loc Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListLocDefImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListLocDef()
   * @generated
   */
  int LIST_LOC_DEF = 17;

  /**
   * The feature id for the '<em><b>Local Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF__LOCAL_DEFINITIONS = 0;

  /**
   * The number of structural features of the '<em>List Loc Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LOC_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.DDeclImpl <em>DDecl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.DDeclImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDDecl()
   * @generated
   */
  int DDECL = 42;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl <em>Exp6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp6Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp6()
   * @generated
   */
  int EXP6 = 18;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__BIND_LIST = DDECL__BIND_LIST;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__E = DDECL__E;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__NAME = DDECL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__SORT = DDECL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Built In Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__BUILT_IN_CAT = DDECL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__STRING = DDECL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__INTEGER = DDECL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__DOUBLE = DDECL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__META = DDECL_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__EMPTY_STRING = DDECL_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__DATA = DDECL_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__LIST_CAT = DDECL_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__CATEGORY = DDECL_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__LIST = DDECL_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__TOKEN_LIST = DDECL_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__RECORD = DDECL_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__DEF_LIST = DDECL_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__TUPLE = DDECL_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__TUPLE_LIST = DDECL_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__V = DDECL_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__TYPE = DDECL_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6__IDENTITY = DDECL_FEATURE_COUNT + 19;

  /**
   * The number of structural features of the '<em>Exp6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP6_FEATURE_COUNT = DDECL_FEATURE_COUNT + 20;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp5Impl <em>Exp5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp5Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp5()
   * @generated
   */
  int EXP5 = 19;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP5__V = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP5__LABEL = 1;

  /**
   * The number of structural features of the '<em>Exp5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP5_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl <em>Exp4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp4Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp4()
   * @generated
   */
  int EXP4 = 20;

  /**
   * The feature id for the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__CASE_LIST = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__ARGS = 1;

  /**
   * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__ARG_TYPE = 2;

  /**
   * The feature id for the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__EXP_LIST = 3;

  /**
   * The feature id for the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__CASE_OF = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__NAME = 5;

  /**
   * The feature id for the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__INNER = 6;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4__V = 7;

  /**
   * The number of structural features of the '<em>Exp4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP4_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp3Impl <em>Exp3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp3Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp3()
   * @generated
   */
  int EXP3 = 21;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__V = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3__E = 1;

  /**
   * The number of structural features of the '<em>Exp3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP3_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp2Impl <em>Exp2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp2Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp2()
   * @generated
   */
  int EXP2 = 22;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__V = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2__E = 1;

  /**
   * The number of structural features of the '<em>Exp2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP2_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp1Impl <em>Exp1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Exp1Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp1()
   * @generated
   */
  int EXP1 = 23;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__V = 0;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1__E = 1;

  /**
   * The number of structural features of the '<em>Exp1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.TupleCompImpl <em>Tuple Comp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.TupleCompImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getTupleComp()
   * @generated
   */
  int TUPLE_COMP = 36;

  /**
   * The number of structural features of the '<em>Tuple Comp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_COMP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ExpImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp()
   * @generated
   */
  int EXP = 24;

  /**
   * The feature id for the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__BIND_LIST = TUPLE_COMP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__V = TUPLE_COMP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__E = TUPLE_COMP_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__DEF_LIST = TUPLE_COMP_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__TYPE = TUPLE_COMP_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = TUPLE_COMP_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListExpImpl <em>List Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListExpImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListExp()
   * @generated
   */
  int LIST_EXP = 25;

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
  int EXPS = 26;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Patt1Impl <em>Patt1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Patt1Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPatt1()
   * @generated
   */
  int PATT1 = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT1__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT1__VALUE = 1;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT1__LABEL = 2;

  /**
   * The number of structural features of the '<em>Patt1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT1_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.Patt2Impl <em>Patt2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.Patt2Impl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPatt2()
   * @generated
   */
  int PATT2 = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT2__NAME = PATT1__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT2__VALUE = PATT1__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT2__LABEL = PATT1__LABEL;

  /**
   * The number of structural features of the '<em>Patt2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT2_FEATURE_COUNT = PATT1_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.PattImpl <em>Patt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.PattImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPatt()
   * @generated
   */
  int PATT = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__NAME = PATT2__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__VALUE = PATT2__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__LABEL = PATT2__LABEL;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT__P = PATT2_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Patt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT_FEATURE_COUNT = PATT2_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.PattAssImpl <em>Patt Ass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.PattAssImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPattAss()
   * @generated
   */
  int PATT_ASS = 30;

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
  int LABEL = 31;

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
  int LIST_PATT_ASS = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__NAME = PATT2__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__VALUE = PATT2__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__LABEL = PATT2__LABEL;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS__ASSIGNMENTS = PATT2_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Patt Ass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_ASS_FEATURE_COUNT = PATT2_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListPattImpl <em>List Patt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListPattImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListPatt()
   * @generated
   */
  int LIST_PATT = 33;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.BindImpl <em>Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.BindImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getBind()
   * @generated
   */
  int BIND = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND__NAME = 0;

  /**
   * The number of structural features of the '<em>Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListBindImpl <em>List Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListBindImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListBind()
   * @generated
   */
  int LIST_BIND = 35;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND__BINDINGS = 0;

  /**
   * The number of structural features of the '<em>List Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BIND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.PattTupleCompImpl <em>Patt Tuple Comp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.PattTupleCompImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPattTupleComp()
   * @generated
   */
  int PATT_TUPLE_COMP = 37;

  /**
   * The number of structural features of the '<em>Patt Tuple Comp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATT_TUPLE_COMP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.ListTupleCompImpl <em>List Tuple Comp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.ListTupleCompImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getListTupleComp()
   * @generated
   */
  int LIST_TUPLE_COMP = 38;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TUPLE_COMP__L = 0;

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
  int LIST_PATT_TUPLE_COMP = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__NAME = PATT2__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__VALUE = PATT2__VALUE;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__LABEL = PATT2__LABEL;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP__L = PATT2_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Patt Tuple Comp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PATT_TUPLE_COMP_FEATURE_COUNT = PATT2_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.CaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.CaseImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getCase()
   * @generated
   */
  int CASE = 40;

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
  int LIST_CASE = 41;

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
   * The meta object id for the '{@link org.grammaticalframework.eclipse.gF.impl.IdentImpl <em>Ident</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.grammaticalframework.eclipse.gF.impl.IdentImpl
   * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getIdent()
   * @generated
   */
  int IDENT = 43;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT__S = 0;

  /**
   * The number of structural features of the '<em>Ident</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENT_FEATURE_COUNT = 1;


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
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ModBody#getOpens <em>Opens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Opens</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModBody#getOpens()
   * @see #getModBody()
   * @generated
   */
  EReference getModBody_Opens();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ModBody#getJudgements <em>Judgements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Judgements</em>'.
   * @see org.grammaticalframework.eclipse.gF.ModBody#getJudgements()
   * @see #getModBody()
   * @generated
   */
  EReference getModBody_Judgements();

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
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Def <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.Def
   * @generated
   */
  EClass getDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Def#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Def#getName()
   * @see #getDef()
   * @generated
   */
  EReference getDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Def#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.grammaticalframework.eclipse.gF.Def#getDefinition()
   * @see #getDef()
   * @generated
   */
  EReference getDef_Definition();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Def#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.Def#getType()
   * @see #getDef()
   * @generated
   */
  EReference getDef_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Def#getPatterns <em>Patterns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Patterns</em>'.
   * @see org.grammaticalframework.eclipse.gF.Def#getPatterns()
   * @see #getDef()
   * @generated
   */
  EReference getDef_Patterns();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Def#isOverload <em>Overload</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overload</em>'.
   * @see org.grammaticalframework.eclipse.gF.Def#isOverload()
   * @see #getDef()
   * @generated
   */
  EAttribute getDef_Overload();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Def#getOverloads <em>Overloads</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Overloads</em>'.
   * @see org.grammaticalframework.eclipse.gF.Def#getOverloads()
   * @see #getDef()
   * @generated
   */
  EReference getDef_Overloads();

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
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.DataDef <em>Data Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.DataDef
   * @generated
   */
  EClass getDataDef();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.DataDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
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
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.DataConstr <em>Data Constr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Constr</em>'.
   * @see org.grammaticalframework.eclipse.gF.DataConstr
   * @generated
   */
  EClass getDataConstr();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.DataConstr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.DataConstr#getName()
   * @see #getDataConstr()
   * @generated
   */
  EReference getDataConstr_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.DataConstr#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see org.grammaticalframework.eclipse.gF.DataConstr#getModule()
   * @see #getDataConstr()
   * @generated
   */
  EReference getDataConstr_Module();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.ParDef <em>Par Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Par Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParDef
   * @generated
   */
  EClass getParDef();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ParDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParDef#getName()
   * @see #getParDef()
   * @generated
   */
  EReference getParDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ParDef#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParDef#getConstructors()
   * @see #getParDef()
   * @generated
   */
  EReference getParDef_Constructors();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.ParDef#getId2 <em>Id2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id2</em>'.
   * @see org.grammaticalframework.eclipse.gF.ParDef#getId2()
   * @see #getParDef()
   * @generated
   */
  EReference getParDef_Id2();

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
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.PrintDef <em>Print Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Def</em>'.
   * @see org.grammaticalframework.eclipse.gF.PrintDef
   * @generated
   */
  EClass getPrintDef();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.PrintDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.PrintDef#getName()
   * @see #getPrintDef()
   * @generated
   */
  EReference getPrintDef_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.PrintDef#getPrintname <em>Printname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Printname</em>'.
   * @see org.grammaticalframework.eclipse.gF.PrintDef#getPrintname()
   * @see #getPrintDef()
   * @generated
   */
  EReference getPrintDef_Printname();

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
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Exp6 <em>Exp6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp6</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6
   * @generated
   */
  EClass getExp6();

  /**
   * Returns the meta object for the reference '{@link org.grammaticalframework.eclipse.gF.Exp6#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#getName()
   * @see #getExp6()
   * @generated
   */
  EReference getExp6_Name();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isSort <em>Sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sort</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isSort()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_Sort();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isBuiltInCat <em>Built In Cat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Cat</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isBuiltInCat()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_BuiltInCat();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isString()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_String();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isInteger()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_Integer();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isDouble <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isDouble()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_Double();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isMeta()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_Meta();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isEmptyString <em>Empty String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty String</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isEmptyString()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_EmptyString();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isData()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_Data();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isListCat <em>List Cat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List Cat</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isListCat()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_ListCat();

  /**
   * Returns the meta object for the reference '{@link org.grammaticalframework.eclipse.gF.Exp6#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Category</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#getCategory()
   * @see #getExp6()
   * @generated
   */
  EReference getExp6_Category();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp6#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#getList()
   * @see #getExp6()
   * @generated
   */
  EReference getExp6_List();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isTokenList <em>Token List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Token List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isTokenList()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_TokenList();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Record</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isRecord()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_Record();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp6#getDefList <em>Def List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#getDefList()
   * @see #getExp6()
   * @generated
   */
  EReference getExp6_DefList();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tuple</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isTuple()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_Tuple();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp6#getTupleList <em>Tuple List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#getTupleList()
   * @see #getExp6()
   * @generated
   */
  EReference getExp6_TupleList();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp6#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#getV()
   * @see #getExp6()
   * @generated
   */
  EReference getExp6_V();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp6#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#getType()
   * @see #getExp6()
   * @generated
   */
  EReference getExp6_Type();

  /**
   * Returns the meta object for the attribute '{@link org.grammaticalframework.eclipse.gF.Exp6#isIdentity <em>Identity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identity</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp6#isIdentity()
   * @see #getExp6()
   * @generated
   */
  EAttribute getExp6_Identity();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Exp5 <em>Exp5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp5</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp5
   * @generated
   */
  EClass getExp5();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp5#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp5#getV()
   * @see #getExp5()
   * @generated
   */
  EReference getExp5_V();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Exp5#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Label</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp5#getLabel()
   * @see #getExp5()
   * @generated
   */
  EReference getExp5_Label();

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
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp4#getCaseList <em>Case List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp4#getCaseList()
   * @see #getExp4()
   * @generated
   */
  EReference getExp4_CaseList();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Exp4#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp4#getArgs()
   * @see #getExp4()
   * @generated
   */
  EReference getExp4_Args();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp4#getArgType <em>Arg Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg Type</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp4#getArgType()
   * @see #getExp4()
   * @generated
   */
  EReference getExp4_ArgType();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp4#getExpList <em>Exp List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp4#getExpList()
   * @see #getExp4()
   * @generated
   */
  EReference getExp4_ExpList();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp4#getCaseOf <em>Case Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Of</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp4#getCaseOf()
   * @see #getExp4()
   * @generated
   */
  EReference getExp4_CaseOf();

  /**
   * Returns the meta object for the reference '{@link org.grammaticalframework.eclipse.gF.Exp4#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp4#getName()
   * @see #getExp4()
   * @generated
   */
  EReference getExp4_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp4#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inner</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp4#getInner()
   * @see #getExp4()
   * @generated
   */
  EReference getExp4_Inner();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp4#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp4#getV()
   * @see #getExp4()
   * @generated
   */
  EReference getExp4_V();

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
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp3#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp3#getV()
   * @see #getExp3()
   * @generated
   */
  EReference getExp3_V();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Exp3#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp3#getE()
   * @see #getExp3()
   * @generated
   */
  EReference getExp3_E();

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
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp2#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp2#getV()
   * @see #getExp2()
   * @generated
   */
  EReference getExp2_V();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Exp2#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp2#getE()
   * @see #getExp2()
   * @generated
   */
  EReference getExp2_E();

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
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp1#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp1#getV()
   * @see #getExp1()
   * @generated
   */
  EReference getExp1_V();

  /**
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Exp1#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp1#getE()
   * @see #getExp1()
   * @generated
   */
  EReference getExp1_E();

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
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Exp#getBindList <em>Bind List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bind List</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getBindList()
   * @see #getExp()
   * @generated
   */
  EReference getExp_BindList();

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
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Exp#getE <em>E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E</em>'.
   * @see org.grammaticalframework.eclipse.gF.Exp#getE()
   * @see #getExp()
   * @generated
   */
  EReference getExp_E();

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
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Patt2 <em>Patt2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patt2</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt2
   * @generated
   */
  EClass getPatt2();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Patt1 <em>Patt1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patt1</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt1
   * @generated
   */
  EClass getPatt1();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Patt1#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt1#getName()
   * @see #getPatt1()
   * @generated
   */
  EReference getPatt1_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Patt1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt1#getValue()
   * @see #getPatt1()
   * @generated
   */
  EReference getPatt1_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Patt1#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt1#getLabel()
   * @see #getPatt1()
   * @generated
   */
  EReference getPatt1_Label();

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
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.Patt#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>P</em>'.
   * @see org.grammaticalframework.eclipse.gF.Patt#getP()
   * @see #getPatt()
   * @generated
   */
  EReference getPatt_P();

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
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind</em>'.
   * @see org.grammaticalframework.eclipse.gF.Bind
   * @generated
   */
  EClass getBind();

  /**
   * Returns the meta object for the containment reference '{@link org.grammaticalframework.eclipse.gF.Bind#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.grammaticalframework.eclipse.gF.Bind#getName()
   * @see #getBind()
   * @generated
   */
  EReference getBind_Name();

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
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.TupleComp <em>Tuple Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Comp</em>'.
   * @see org.grammaticalframework.eclipse.gF.TupleComp
   * @generated
   */
  EClass getTupleComp();

  /**
   * Returns the meta object for class '{@link org.grammaticalframework.eclipse.gF.PattTupleComp <em>Patt Tuple Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Patt Tuple Comp</em>'.
   * @see org.grammaticalframework.eclipse.gF.PattTupleComp
   * @generated
   */
  EClass getPattTupleComp();

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
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListTupleComp#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>L</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListTupleComp#getL()
   * @see #getListTupleComp()
   * @generated
   */
  EReference getListTupleComp_L();

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
   * Returns the meta object for the containment reference list '{@link org.grammaticalframework.eclipse.gF.ListPattTupleComp#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>L</em>'.
   * @see org.grammaticalframework.eclipse.gF.ListPattTupleComp#getL()
   * @see #getListPattTupleComp()
   * @generated
   */
  EReference getListPattTupleComp_L();

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
     * The meta object literal for the '<em><b>Opens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_BODY__OPENS = eINSTANCE.getModBody_Opens();

    /**
     * The meta object literal for the '<em><b>Judgements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_BODY__JUDGEMENTS = eINSTANCE.getModBody_Judgements();

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
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.DefImpl <em>Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.DefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDef()
     * @generated
     */
    EClass DEF = eINSTANCE.getDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__NAME = eINSTANCE.getDef_Name();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__DEFINITION = eINSTANCE.getDef_Definition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__TYPE = eINSTANCE.getDef_Type();

    /**
     * The meta object literal for the '<em><b>Patterns</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__PATTERNS = eINSTANCE.getDef_Patterns();

    /**
     * The meta object literal for the '<em><b>Overload</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF__OVERLOAD = eINSTANCE.getDef_Overload();

    /**
     * The meta object literal for the '<em><b>Overloads</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF__OVERLOADS = eINSTANCE.getDef_Overloads();

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
     * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__DATA = eINSTANCE.getTopDef_Data();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOP_DEF__DEF = eINSTANCE.getTopDef_Def();

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
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.DataDefImpl <em>Data Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.DataDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDataDef()
     * @generated
     */
    EClass DATA_DEF = eINSTANCE.getDataDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
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
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.DataConstrImpl <em>Data Constr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.DataConstrImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getDataConstr()
     * @generated
     */
    EClass DATA_CONSTR = eINSTANCE.getDataConstr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONSTR__NAME = eINSTANCE.getDataConstr_Name();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_CONSTR__MODULE = eINSTANCE.getDataConstr_Module();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.ParDefImpl <em>Par Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.ParDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getParDef()
     * @generated
     */
    EClass PAR_DEF = eINSTANCE.getParDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_DEF__NAME = eINSTANCE.getParDef_Name();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_DEF__CONSTRUCTORS = eINSTANCE.getParDef_Constructors();

    /**
     * The meta object literal for the '<em><b>Id2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_DEF__ID2 = eINSTANCE.getParDef_Id2();

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
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.PrintDefImpl <em>Print Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.PrintDefImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPrintDef()
     * @generated
     */
    EClass PRINT_DEF = eINSTANCE.getPrintDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINT_DEF__NAME = eINSTANCE.getPrintDef_Name();

    /**
     * The meta object literal for the '<em><b>Printname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINT_DEF__PRINTNAME = eINSTANCE.getPrintDef_Printname();

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
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl <em>Exp6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.Exp6Impl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp6()
     * @generated
     */
    EClass EXP6 = eINSTANCE.getExp6();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP6__NAME = eINSTANCE.getExp6_Name();

    /**
     * The meta object literal for the '<em><b>Sort</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__SORT = eINSTANCE.getExp6_Sort();

    /**
     * The meta object literal for the '<em><b>Built In Cat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__BUILT_IN_CAT = eINSTANCE.getExp6_BuiltInCat();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__STRING = eINSTANCE.getExp6_String();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__INTEGER = eINSTANCE.getExp6_Integer();

    /**
     * The meta object literal for the '<em><b>Double</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__DOUBLE = eINSTANCE.getExp6_Double();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__META = eINSTANCE.getExp6_Meta();

    /**
     * The meta object literal for the '<em><b>Empty String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__EMPTY_STRING = eINSTANCE.getExp6_EmptyString();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__DATA = eINSTANCE.getExp6_Data();

    /**
     * The meta object literal for the '<em><b>List Cat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__LIST_CAT = eINSTANCE.getExp6_ListCat();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP6__CATEGORY = eINSTANCE.getExp6_Category();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP6__LIST = eINSTANCE.getExp6_List();

    /**
     * The meta object literal for the '<em><b>Token List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__TOKEN_LIST = eINSTANCE.getExp6_TokenList();

    /**
     * The meta object literal for the '<em><b>Record</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__RECORD = eINSTANCE.getExp6_Record();

    /**
     * The meta object literal for the '<em><b>Def List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP6__DEF_LIST = eINSTANCE.getExp6_DefList();

    /**
     * The meta object literal for the '<em><b>Tuple</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__TUPLE = eINSTANCE.getExp6_Tuple();

    /**
     * The meta object literal for the '<em><b>Tuple List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP6__TUPLE_LIST = eINSTANCE.getExp6_TupleList();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP6__V = eINSTANCE.getExp6_V();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP6__TYPE = eINSTANCE.getExp6_Type();

    /**
     * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP6__IDENTITY = eINSTANCE.getExp6_Identity();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.Exp5Impl <em>Exp5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.Exp5Impl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getExp5()
     * @generated
     */
    EClass EXP5 = eINSTANCE.getExp5();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP5__V = eINSTANCE.getExp5_V();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP5__LABEL = eINSTANCE.getExp5_Label();

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
     * The meta object literal for the '<em><b>Case List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP4__CASE_LIST = eINSTANCE.getExp4_CaseList();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP4__ARGS = eINSTANCE.getExp4_Args();

    /**
     * The meta object literal for the '<em><b>Arg Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP4__ARG_TYPE = eINSTANCE.getExp4_ArgType();

    /**
     * The meta object literal for the '<em><b>Exp List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP4__EXP_LIST = eINSTANCE.getExp4_ExpList();

    /**
     * The meta object literal for the '<em><b>Case Of</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP4__CASE_OF = eINSTANCE.getExp4_CaseOf();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP4__NAME = eINSTANCE.getExp4_Name();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP4__INNER = eINSTANCE.getExp4_Inner();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP4__V = eINSTANCE.getExp4_V();

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
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP3__V = eINSTANCE.getExp3_V();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP3__E = eINSTANCE.getExp3_E();

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
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP2__V = eINSTANCE.getExp2_V();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP2__E = eINSTANCE.getExp2_E();

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
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP1__V = eINSTANCE.getExp1_V();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP1__E = eINSTANCE.getExp1_E();

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
     * The meta object literal for the '<em><b>Bind List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__BIND_LIST = eINSTANCE.getExp_BindList();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__V = eINSTANCE.getExp_V();

    /**
     * The meta object literal for the '<em><b>E</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__E = eINSTANCE.getExp_E();

    /**
     * The meta object literal for the '<em><b>Def List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__DEF_LIST = eINSTANCE.getExp_DefList();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__TYPE = eINSTANCE.getExp_Type();

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
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.Patt2Impl <em>Patt2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.Patt2Impl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPatt2()
     * @generated
     */
    EClass PATT2 = eINSTANCE.getPatt2();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.Patt1Impl <em>Patt1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.Patt1Impl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPatt1()
     * @generated
     */
    EClass PATT1 = eINSTANCE.getPatt1();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT1__NAME = eINSTANCE.getPatt1_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT1__VALUE = eINSTANCE.getPatt1_Value();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT1__LABEL = eINSTANCE.getPatt1_Label();

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
     * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATT__P = eINSTANCE.getPatt_P();

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
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.BindImpl <em>Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.BindImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getBind()
     * @generated
     */
    EClass BIND = eINSTANCE.getBind();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND__NAME = eINSTANCE.getBind_Name();

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
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_BIND__BINDINGS = eINSTANCE.getListBind_Bindings();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.TupleCompImpl <em>Tuple Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.TupleCompImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getTupleComp()
     * @generated
     */
    EClass TUPLE_COMP = eINSTANCE.getTupleComp();

    /**
     * The meta object literal for the '{@link org.grammaticalframework.eclipse.gF.impl.PattTupleCompImpl <em>Patt Tuple Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.grammaticalframework.eclipse.gF.impl.PattTupleCompImpl
     * @see org.grammaticalframework.eclipse.gF.impl.GFPackageImpl#getPattTupleComp()
     * @generated
     */
    EClass PATT_TUPLE_COMP = eINSTANCE.getPattTupleComp();

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
     * The meta object literal for the '<em><b>L</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TUPLE_COMP__L = eINSTANCE.getListTupleComp_L();

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
     * The meta object literal for the '<em><b>L</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PATT_TUPLE_COMP__L = eINSTANCE.getListPattTupleComp_L();

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

  }

} //GFPackage
