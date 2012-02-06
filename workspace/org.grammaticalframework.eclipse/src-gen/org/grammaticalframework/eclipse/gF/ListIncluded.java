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
 * A representation of the model object '<em><b>List Included</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListIncluded#getIncluded <em>Included</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getListIncluded()
 * @model
 * @generated
 */
public interface ListIncluded extends EObject
{
  /**
   * Returns the value of the '<em><b>Included</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Included}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListIncluded_Included()
   * @model containment="true"
   * @generated
   */
  EList<Included> getIncluded();

} // ListIncluded
