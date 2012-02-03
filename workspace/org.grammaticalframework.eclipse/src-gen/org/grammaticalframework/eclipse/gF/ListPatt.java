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
 * A representation of the model object '<em><b>List Patt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListPatt#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getListPatt()
 * @model
 * @generated
 */
public interface ListPatt extends EObject
{
  /**
   * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Patt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListPatt_Patterns()
   * @model containment="true"
   * @generated
   */
  EList<Patt> getPatterns();

} // ListPatt
