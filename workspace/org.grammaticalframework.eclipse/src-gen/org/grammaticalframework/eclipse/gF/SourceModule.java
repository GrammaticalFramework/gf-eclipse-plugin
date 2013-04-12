/**
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.SourceModule#isIncomplete <em>Incomplete</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.SourceModule#getType <em>Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.SourceModule#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getSourceModule()
 * @model
 * @generated
 */
public interface SourceModule extends EObject
{
  /**
   * Returns the value of the '<em><b>Incomplete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incomplete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incomplete</em>' attribute.
   * @see #setIncomplete(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getSourceModule_Incomplete()
   * @model
   * @generated
   */
  boolean isIncomplete();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.SourceModule#isIncomplete <em>Incomplete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Incomplete</em>' attribute.
   * @see #isIncomplete()
   * @generated
   */
  void setIncomplete(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ModType)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getSourceModule_Type()
   * @model containment="true"
   * @generated
   */
  ModType getType();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.SourceModule#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ModType value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ModBody)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getSourceModule_Body()
   * @model containment="true"
   * @generated
   */
  ModBody getBody();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.SourceModule#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ModBody value);

} // SourceModule
