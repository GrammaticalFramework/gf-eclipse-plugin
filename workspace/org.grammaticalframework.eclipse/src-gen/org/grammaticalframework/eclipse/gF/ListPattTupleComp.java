/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Patt Tuple Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ListPattTupleComp#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getListPattTupleComp()
 * @model
 * @generated
 */
public interface ListPattTupleComp extends Patt
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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getListPattTupleComp_Patterns()
   * @model containment="true"
   * @generated
   */
  EList<Patt> getPatterns();

} // ListPattTupleComp
