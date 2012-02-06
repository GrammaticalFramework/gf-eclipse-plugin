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
 * A representation of the model object '<em><b>List Open</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListOpen#getOpens <em>Opens</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getListOpen()
 * @model
 * @generated
 */
public interface ListOpen extends EObject
{
  /**
   * Returns the value of the '<em><b>Opens</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Open}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opens</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListOpen_Opens()
   * @model containment="true"
   * @generated
   */
  EList<Open> getOpens();

} // ListOpen
