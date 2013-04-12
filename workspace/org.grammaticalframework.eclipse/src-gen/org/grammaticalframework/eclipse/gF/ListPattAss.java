/**
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Patt Ass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListPattAss#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getListPattAss()
 * @model
 * @generated
 */
public interface ListPattAss extends Patt
{
  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.PattAss}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListPattAss_Assignments()
   * @model containment="true"
   * @generated
   */
  EList<PattAss> getAssignments();

} // ListPattAss
