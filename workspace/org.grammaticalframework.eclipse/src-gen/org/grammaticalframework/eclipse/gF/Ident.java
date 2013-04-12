/**
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Ident#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getIdent()
 * @model
 * @generated
 */
public interface Ident extends EObject
{
  /**
   * Returns the value of the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' attribute.
   * @see #setS(String)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getIdent_S()
   * @model
   * @generated
   */
  String getS();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Ident#getS <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' attribute.
   * @see #getS()
   * @generated
   */
  void setS(String value);

} // Ident
