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
 * A representation of the model object '<em><b>Exp2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp2#getV <em>V</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Exp2#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp2()
 * @model
 * @generated
 */
public interface Exp2 extends EObject
{
  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(Exp3)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp2_V()
   * @model containment="true"
   * @generated
   */
  Exp3 getV();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Exp2#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(Exp3 value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Exp2}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getExp2_E()
   * @model containment="true"
   * @generated
   */
  EList<Exp2> getE();

} // Exp2
