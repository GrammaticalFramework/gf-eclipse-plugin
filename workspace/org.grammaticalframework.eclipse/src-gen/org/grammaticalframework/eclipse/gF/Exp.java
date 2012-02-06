/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getDefList <em>Def List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getCaseList <em>Case List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getExpList <em>Exp List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getAlts <em>Alts</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getInner <em>Inner</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#isSort <em>Sort</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#isString <em>String</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#isInteger <em>Integer</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#isDouble <em>Double</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#isEmptyString <em>Empty String</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#isListCat <em>List Cat</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getCategory <em>Category</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getList <em>List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#isRecord <em>Record</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#isTuple <em>Tuple</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getTupleList <em>Tuple List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getV <em>V</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getType <em>Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#isIdentity <em>Identity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp()
 * @model
 * @generated
 */
public interface Exp extends Patt, DDecl
{
  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference.
   * @see #setDecl(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Decl()
   * @model containment="true"
   * @generated
   */
  Exp getDecl();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(Exp value);

  /**
   * Returns the value of the '<em><b>Def List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def List</em>' containment reference.
   * @see #setDefList(ListLocDef)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_DefList()
   * @model containment="true"
   * @generated
   */
  ListLocDef getDefList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getDefList <em>Def List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def List</em>' containment reference.
   * @see #getDefList()
   * @generated
   */
  void setDefList(ListLocDef value);

  /**
   * Returns the value of the '<em><b>Case List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case List</em>' containment reference.
   * @see #setCaseList(ListCase)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_CaseList()
   * @model containment="true"
   * @generated
   */
  ListCase getCaseList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getCaseList <em>Case List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case List</em>' containment reference.
   * @see #getCaseList()
   * @generated
   */
  void setCaseList(ListCase value);

  /**
   * Returns the value of the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Type</em>' containment reference.
   * @see #setArgType(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_ArgType()
   * @model containment="true"
   * @generated
   */
  Exp getArgType();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getArgType <em>Arg Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg Type</em>' containment reference.
   * @see #getArgType()
   * @generated
   */
  void setArgType(Exp value);

  /**
   * Returns the value of the '<em><b>Exp List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp List</em>' containment reference.
   * @see #setExpList(ListExp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_ExpList()
   * @model containment="true"
   * @generated
   */
  ListExp getExpList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getExpList <em>Exp List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp List</em>' containment reference.
   * @see #getExpList()
   * @generated
   */
  void setExpList(ListExp value);

  /**
   * Returns the value of the '<em><b>Case Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Of</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Of</em>' containment reference.
   * @see #setCaseOf(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_CaseOf()
   * @model containment="true"
   * @generated
   */
  Exp getCaseOf();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getCaseOf <em>Case Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Of</em>' containment reference.
   * @see #getCaseOf()
   * @generated
   */
  void setCaseOf(Exp value);

  /**
   * Returns the value of the '<em><b>Alts</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Altern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alts</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Alts()
   * @model containment="true"
   * @generated
   */
  EList<Altern> getAlts();

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(Patt)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Pattern()
   * @model containment="true"
   * @generated
   */
  Patt getPattern();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Patt value);

  /**
   * Returns the value of the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner</em>' containment reference.
   * @see #setInner(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Inner()
   * @model containment="true"
   * @generated
   */
  Exp getInner();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getInner <em>Inner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner</em>' containment reference.
   * @see #getInner()
   * @generated
   */
  void setInner(Exp value);

  /**
   * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Label}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Labels</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Labels()
   * @model containment="true"
   * @generated
   */
  EList<Label> getLabels();

  /**
   * Returns the value of the '<em><b>Sort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' attribute.
   * @see #setSort(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Sort()
   * @model
   * @generated
   */
  boolean isSort();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#isSort <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' attribute.
   * @see #isSort()
   * @generated
   */
  void setSort(boolean value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_String()
   * @model
   * @generated
   */
  boolean isString();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#isString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #isString()
   * @generated
   */
  void setString(boolean value);

  /**
   * Returns the value of the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer</em>' attribute.
   * @see #setInteger(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Integer()
   * @model
   * @generated
   */
  boolean isInteger();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#isInteger <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer</em>' attribute.
   * @see #isInteger()
   * @generated
   */
  void setInteger(boolean value);

  /**
   * Returns the value of the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Double</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Double</em>' attribute.
   * @see #setDouble(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Double()
   * @model
   * @generated
   */
  boolean isDouble();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#isDouble <em>Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Double</em>' attribute.
   * @see #isDouble()
   * @generated
   */
  void setDouble(boolean value);

  /**
   * Returns the value of the '<em><b>Empty String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty String</em>' attribute.
   * @see #setEmptyString(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_EmptyString()
   * @model
   * @generated
   */
  boolean isEmptyString();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#isEmptyString <em>Empty String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty String</em>' attribute.
   * @see #isEmptyString()
   * @generated
   */
  void setEmptyString(boolean value);

  /**
   * Returns the value of the '<em><b>List Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Cat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Cat</em>' attribute.
   * @see #setListCat(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_ListCat()
   * @model
   * @generated
   */
  boolean isListCat();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#isListCat <em>List Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Cat</em>' attribute.
   * @see #isListCat()
   * @generated
   */
  void setListCat(boolean value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference.
   * @see #setCategory(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Category()
   * @model
   * @generated
   */
  Ident getCategory();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getCategory <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' reference.
   * @see #getCategory()
   * @generated
   */
  void setCategory(Ident value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(Exps)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_List()
   * @model containment="true"
   * @generated
   */
  Exps getList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(Exps value);

  /**
   * Returns the value of the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' attribute.
   * @see #setRecord(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Record()
   * @model
   * @generated
   */
  boolean isRecord();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#isRecord <em>Record</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' attribute.
   * @see #isRecord()
   * @generated
   */
  void setRecord(boolean value);

  /**
   * Returns the value of the '<em><b>Tuple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuple</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuple</em>' attribute.
   * @see #setTuple(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Tuple()
   * @model
   * @generated
   */
  boolean isTuple();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#isTuple <em>Tuple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tuple</em>' attribute.
   * @see #isTuple()
   * @generated
   */
  void setTuple(boolean value);

  /**
   * Returns the value of the '<em><b>Tuple List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tuple List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tuple List</em>' containment reference.
   * @see #setTupleList(ListTupleComp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_TupleList()
   * @model containment="true"
   * @generated
   */
  ListTupleComp getTupleList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getTupleList <em>Tuple List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tuple List</em>' containment reference.
   * @see #getTupleList()
   * @generated
   */
  void setTupleList(ListTupleComp value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_V()
   * @model containment="true"
   * @generated
   */
  Exp getV();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(Exp value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Type()
   * @model containment="true"
   * @generated
   */
  Exp getType();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Exp value);

  /**
   * Returns the value of the '<em><b>Identity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identity</em>' attribute.
   * @see #setIdentity(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_Identity()
   * @model
   * @generated
   */
  boolean isIdentity();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#isIdentity <em>Identity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identity</em>' attribute.
   * @see #isIdentity()
   * @generated
   */
  void setIdentity(boolean value);

} // Exp
