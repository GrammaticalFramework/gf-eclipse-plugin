/**
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patt Ass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.PattAss#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.PattAss#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getPattAss()
 * @model
 * @generated
 */
public interface PattAss extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Ident}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPattAss_Name()
   * @model containment="true"
   * @generated
   */
  EList<Ident> getName();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Patt)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPattAss_Value()
   * @model containment="true"
   * @generated
   */
  Patt getValue();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.PattAss#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Patt value);

} // PattAss
