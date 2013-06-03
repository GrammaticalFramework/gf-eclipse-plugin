/**
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Included#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Included#isInclusive <em>Inclusive</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Included#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Included#isExclusive <em>Exclusive</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Included#getExcludes <em>Excludes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getIncluded()
 * @model
 * @generated
 */
public interface Included extends EObject
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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getIncluded_Name()
   * @model containment="true"
   * @generated
   */
  Ident getName();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Included#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Ident value);

  /**
   * Returns the value of the '<em><b>Inclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inclusive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inclusive</em>' attribute.
   * @see #setInclusive(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getIncluded_Inclusive()
   * @model
   * @generated
   */
  boolean isInclusive();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Included#isInclusive <em>Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inclusive</em>' attribute.
   * @see #isInclusive()
   * @generated
   */
  void setInclusive(boolean value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Ident}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getIncluded_Includes()
   * @model containment="true"
   * @generated
   */
  EList<Ident> getIncludes();

  /**
   * Returns the value of the '<em><b>Exclusive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclusive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclusive</em>' attribute.
   * @see #setExclusive(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getIncluded_Exclusive()
   * @model
   * @generated
   */
  boolean isExclusive();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Included#isExclusive <em>Exclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclusive</em>' attribute.
   * @see #isExclusive()
   * @generated
   */
  void setExclusive(boolean value);

  /**
   * Returns the value of the '<em><b>Excludes</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Ident}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Excludes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Excludes</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getIncluded_Excludes()
   * @model containment="true"
   * @generated
   */
  EList<Ident> getExcludes();

} // Included
