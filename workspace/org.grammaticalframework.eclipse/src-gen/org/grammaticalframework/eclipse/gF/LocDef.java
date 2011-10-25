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
 * A representation of the model object '<em><b>Loc Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.LocDef#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.LocDef#getType <em>Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.LocDef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getLocDef()
 * @model
 * @generated
 */
public interface LocDef extends EObject
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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getLocDef_Name()
   * @model containment="true"
   * @generated
   */
  EList<Ident> getName();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getLocDef_Type()
   * @model containment="true"
   * @generated
   */
  Exp getType();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.LocDef#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Exp value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getLocDef_Value()
   * @model containment="true"
   * @generated
   */
  Exp getValue();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.LocDef#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Exp value);

} // LocDef
