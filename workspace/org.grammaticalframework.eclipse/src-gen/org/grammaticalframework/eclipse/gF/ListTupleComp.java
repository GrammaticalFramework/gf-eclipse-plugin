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
 * A representation of the model object '<em><b>List Tuple Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListTupleComp#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getListTupleComp()
 * @model
 * @generated
 */
public interface ListTupleComp extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Exp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListTupleComp_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Exp> getElements();

} // ListTupleComp
