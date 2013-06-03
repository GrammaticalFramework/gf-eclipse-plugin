/**
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Altern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Altern#getAlt1 <em>Alt1</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Altern#getAlt2 <em>Alt2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getAltern()
 * @model
 * @generated
 */
public interface Altern extends EObject
{
  /**
   * Returns the value of the '<em><b>Alt1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt1</em>' containment reference.
   * @see #setAlt1(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getAltern_Alt1()
   * @model containment="true"
   * @generated
   */
  Exp getAlt1();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Altern#getAlt1 <em>Alt1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alt1</em>' containment reference.
   * @see #getAlt1()
   * @generated
   */
  void setAlt1(Exp value);

  /**
   * Returns the value of the '<em><b>Alt2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt2</em>' containment reference.
   * @see #setAlt2(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getAltern_Alt2()
   * @model containment="true"
   * @generated
   */
  Exp getAlt2();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Altern#getAlt2 <em>Alt2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alt2</em>' containment reference.
   * @see #getAlt2()
   * @generated
   */
  void setAlt2(Exp value);

} // Altern
