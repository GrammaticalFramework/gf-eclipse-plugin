/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DDecl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.DDecl#getBindList <em>Bind List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.DDecl#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getDDecl()
 * @model
 * @generated
 */
public interface DDecl extends EObject
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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getDDecl_BindList()
   * @model containment="true"
   * @generated
   */
  ListBind getBindList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.DDecl#getBindList <em>Bind List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind List</em>' containment reference.
   * @see #getBindList()
   * @generated
   */
  void setBindList(ListBind value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getDDecl_E()
   * @model containment="true"
   * @generated
   */
  Exp getE();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.DDecl#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(Exp value);

} // DDecl
