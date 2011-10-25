/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.grammaticalframework.eclipse.gF.GFPackage
 * @generated
 */
public interface GFFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GFFactory eINSTANCE = org.grammaticalframework.eclipse.gF.impl.GFFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Mod Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mod Def</em>'.
   * @generated
   */
  ModDef createModDef();

  /**
   * Returns a new object of class '<em>Mod Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mod Type</em>'.
   * @generated
   */
  ModType createModType();

  /**
   * Returns a new object of class '<em>Mod Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mod Body</em>'.
   * @generated
   */
  ModBody createModBody();

  /**
   * Returns a new object of class '<em>Open</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Open</em>'.
   * @generated
   */
  Open createOpen();

  /**
   * Returns a new object of class '<em>Included</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Included</em>'.
   * @generated
   */
  Included createIncluded();

  /**
   * Returns a new object of class '<em>Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def</em>'.
   * @generated
   */
  Def createDef();

  /**
   * Returns a new object of class '<em>Top Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Def</em>'.
   * @generated
   */
  TopDef createTopDef();

  /**
   * Returns a new object of class '<em>Cat Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cat Def</em>'.
   * @generated
   */
  CatDef createCatDef();

  /**
   * Returns a new object of class '<em>Fun Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fun Def</em>'.
   * @generated
   */
  FunDef createFunDef();

  /**
   * Returns a new object of class '<em>Data Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Def</em>'.
   * @generated
   */
  DataDef createDataDef();

  /**
   * Returns a new object of class '<em>Data Constr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Constr</em>'.
   * @generated
   */
  DataConstr createDataConstr();

  /**
   * Returns a new object of class '<em>Par Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Par Def</em>'.
   * @generated
   */
  ParDef createParDef();

  /**
   * Returns a new object of class '<em>Par Constr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Par Constr</em>'.
   * @generated
   */
  ParConstr createParConstr();

  /**
   * Returns a new object of class '<em>Print Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Print Def</em>'.
   * @generated
   */
  PrintDef createPrintDef();

  /**
   * Returns a new object of class '<em>Flag Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flag Def</em>'.
   * @generated
   */
  FlagDef createFlagDef();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns a new object of class '<em>Loc Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loc Def</em>'.
   * @generated
   */
  LocDef createLocDef();

  /**
   * Returns a new object of class '<em>List Loc Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Loc Def</em>'.
   * @generated
   */
  ListLocDef createListLocDef();

  /**
   * Returns a new object of class '<em>Exp6</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp6</em>'.
   * @generated
   */
  Exp6 createExp6();

  /**
   * Returns a new object of class '<em>Exp5</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp5</em>'.
   * @generated
   */
  Exp5 createExp5();

  /**
   * Returns a new object of class '<em>Exp4</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp4</em>'.
   * @generated
   */
  Exp4 createExp4();

  /**
   * Returns a new object of class '<em>Exp3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp3</em>'.
   * @generated
   */
  Exp3 createExp3();

  /**
   * Returns a new object of class '<em>Exp2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp2</em>'.
   * @generated
   */
  Exp2 createExp2();

  /**
   * Returns a new object of class '<em>Exp1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp1</em>'.
   * @generated
   */
  Exp1 createExp1();

  /**
   * Returns a new object of class '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp</em>'.
   * @generated
   */
  Exp createExp();

  /**
   * Returns a new object of class '<em>List Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Exp</em>'.
   * @generated
   */
  ListExp createListExp();

  /**
   * Returns a new object of class '<em>Exps</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exps</em>'.
   * @generated
   */
  Exps createExps();

  /**
   * Returns a new object of class '<em>Patt2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Patt2</em>'.
   * @generated
   */
  Patt2 createPatt2();

  /**
   * Returns a new object of class '<em>Patt1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Patt1</em>'.
   * @generated
   */
  Patt1 createPatt1();

  /**
   * Returns a new object of class '<em>Patt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Patt</em>'.
   * @generated
   */
  Patt createPatt();

  /**
   * Returns a new object of class '<em>Patt Ass</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Patt Ass</em>'.
   * @generated
   */
  PattAss createPattAss();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>List Patt Ass</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Patt Ass</em>'.
   * @generated
   */
  ListPattAss createListPattAss();

  /**
   * Returns a new object of class '<em>List Patt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Patt</em>'.
   * @generated
   */
  ListPatt createListPatt();

  /**
   * Returns a new object of class '<em>Bind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bind</em>'.
   * @generated
   */
  Bind createBind();

  /**
   * Returns a new object of class '<em>List Bind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Bind</em>'.
   * @generated
   */
  ListBind createListBind();

  /**
   * Returns a new object of class '<em>Tuple Comp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple Comp</em>'.
   * @generated
   */
  TupleComp createTupleComp();

  /**
   * Returns a new object of class '<em>Patt Tuple Comp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Patt Tuple Comp</em>'.
   * @generated
   */
  PattTupleComp createPattTupleComp();

  /**
   * Returns a new object of class '<em>List Tuple Comp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Tuple Comp</em>'.
   * @generated
   */
  ListTupleComp createListTupleComp();

  /**
   * Returns a new object of class '<em>List Patt Tuple Comp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Patt Tuple Comp</em>'.
   * @generated
   */
  ListPattTupleComp createListPattTupleComp();

  /**
   * Returns a new object of class '<em>Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case</em>'.
   * @generated
   */
  Case createCase();

  /**
   * Returns a new object of class '<em>List Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Case</em>'.
   * @generated
   */
  ListCase createListCase();

  /**
   * Returns a new object of class '<em>DDecl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DDecl</em>'.
   * @generated
   */
  DDecl createDDecl();

  /**
   * Returns a new object of class '<em>Ident</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ident</em>'.
   * @generated
   */
  Ident createIdent();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GFPackage getGFPackage();

} //GFFactory
