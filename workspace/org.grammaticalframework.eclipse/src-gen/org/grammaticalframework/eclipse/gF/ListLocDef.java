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
 * A representation of the model object '<em><b>List Loc Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListLocDef#getLocalDefinitions <em>Local Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getListLocDef()
 * @model
 * @generated
 */
public interface ListLocDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Local Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.LocDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Definitions</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListLocDef_LocalDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<LocDef> getLocalDefinitions();

} // ListLocDef
