/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp4#getCaseList <em>Case List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp4#getArgs <em>Args</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp4#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp4#getExpList <em>Exp List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp4#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp4#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp4#getInner <em>Inner</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp4#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp4()
 * @model
 * @generated
 */
public interface Exp4 extends EObject
{
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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp4_CaseList()
   * @model containment="true"
   * @generated
   */
  ListCase getCaseList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp4#getCaseList <em>Case List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case List</em>' containment reference.
   * @see #getCaseList()
   * @generated
   */
  void setCaseList(ListCase value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Exp5}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp4_Args()
   * @model containment="true"
   * @generated
   */
  EList<Exp5> getArgs();

  /**
   * Returns the value of the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Type</em>' containment reference.
   * @see #setArgType(Exp6)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp4_ArgType()
   * @model containment="true"
   * @generated
   */
  Exp6 getArgType();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp4#getArgType <em>Arg Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg Type</em>' containment reference.
   * @see #getArgType()
   * @generated
   */
  void setArgType(Exp6 value);

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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp4_ExpList()
   * @model containment="true"
   * @generated
   */
  ListExp getExpList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp4#getExpList <em>Exp List</em>}' containment reference.
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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp4_CaseOf()
   * @model containment="true"
   * @generated
   */
  Exp getCaseOf();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp4#getCaseOf <em>Case Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Of</em>' containment reference.
   * @see #getCaseOf()
   * @generated
   */
  void setCaseOf(Exp value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp4_Name()
   * @model
   * @generated
   */
  Ident getName();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp4#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Ident value);

  /**
   * Returns the value of the '<em><b>Inner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner</em>' containment reference.
   * @see #setInner(Exp6)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp4_Inner()
   * @model containment="true"
   * @generated
   */
  Exp6 getInner();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp4#getInner <em>Inner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner</em>' containment reference.
   * @see #getInner()
   * @generated
   */
  void setInner(Exp6 value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(Exp5)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp4_V()
   * @model containment="true"
   * @generated
   */
  Exp5 getV();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp4#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(Exp5 value);

} // Exp4
