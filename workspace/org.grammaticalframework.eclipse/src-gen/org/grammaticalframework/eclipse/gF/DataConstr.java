/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Constr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.DataConstr#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.DataConstr#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getDataConstr()
 * @model
 * @generated
 */
public interface DataConstr extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getDataConstr_Name()
   * @model containment="true"
   * @generated
   */
  Ident getName();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.DataConstr#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Ident value);

  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getDataConstr_Module()
   * @model containment="true"
   * @generated
   */
  Ident getModule();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.DataConstr#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(Ident value);

} // DataConstr
