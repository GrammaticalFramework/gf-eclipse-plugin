/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flag Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.FlagDef#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.FlagDef#getValue <em>Value</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.FlagDef#getStrValue <em>Str Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getFlagDef()
 * @model
 * @generated
 */
public interface FlagDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getFlagDef_Name()
   * @model containment="true"
   * @generated
   */
  Ident getName();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.FlagDef#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Ident value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getFlagDef_Value()
   * @model containment="true"
   * @generated
   */
  Ident getValue();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.FlagDef#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Ident value);

  /**
   * Returns the value of the '<em><b>Str Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str Value</em>' attribute.
   * @see #setStrValue(String)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getFlagDef_StrValue()
   * @model
   * @generated
   */
  String getStrValue();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.FlagDef#getStrValue <em>Str Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str Value</em>' attribute.
   * @see #getStrValue()
   * @generated
   */
  void setStrValue(String value);

} // FlagDef
