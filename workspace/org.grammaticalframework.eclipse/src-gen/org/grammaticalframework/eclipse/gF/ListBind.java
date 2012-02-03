/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListBind#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListBind#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getListBind()
 * @model
 * @generated
 */
public interface ListBind extends Exp
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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListBind_Decl()
   * @model containment="true"
   * @generated
   */
  Exp getDecl();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ListBind#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(Exp value);

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Bind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListBind_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<Bind> getBindings();

} // ListBind
