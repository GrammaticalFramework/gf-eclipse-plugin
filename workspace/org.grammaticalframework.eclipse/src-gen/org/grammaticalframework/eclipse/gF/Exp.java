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
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getBindList <em>Bind List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getV <em>V</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getE <em>E</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getDefList <em>Def List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp()
 * @model
 * @generated
 */
public interface Exp extends TupleComp
{
  /**
   * Returns the value of the '<em><b>Bind List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind List</em>' containment reference.
   * @see #setBindList(ListBind)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_BindList()
   * @model containment="true"
   * @generated
   */
  ListBind getBindList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getBindList <em>Bind List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind List</em>' containment reference.
   * @see #getBindList()
   * @generated
   */
  void setBindList(ListBind value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(EObject)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_V()
   * @model containment="true"
   * @generated
   */
  EObject getV();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(EObject value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp_E()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getE();

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

} // Exp
