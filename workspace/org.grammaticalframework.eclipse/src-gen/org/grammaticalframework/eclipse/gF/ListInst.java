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
 * A representation of the model object '<em><b>List Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListInst#getInstantiations <em>Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getListInst()
 * @model
 * @generated
 */
public interface ListInst extends EObject
{
  /**
   * Returns the value of the '<em><b>Instantiations</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Inst}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiations</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListInst_Instantiations()
   * @model containment="true"
   * @generated
   */
  EList<Inst> getInstantiations();

} // ListInst
