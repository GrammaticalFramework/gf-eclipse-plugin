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
 * A representation of the model object '<em><b>Par Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ParDef#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ParDef#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ParDef#getId2 <em>Id2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getParDef()
 * @model
 * @generated
 */
public interface ParDef extends EObject
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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getParDef_Name()
   * @model containment="true"
   * @generated
   */
  Ident getName();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ParDef#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Ident value);

  /**
   * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.ParConstr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructors</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getParDef_Constructors()
   * @model containment="true"
   * @generated
   */
  EList<ParConstr> getConstructors();

  /**
   * Returns the value of the '<em><b>Id2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id2</em>' containment reference.
   * @see #setId2(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getParDef_Id2()
   * @model containment="true"
   * @generated
   */
  Ident getId2();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ParDef#getId2 <em>Id2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id2</em>' containment reference.
   * @see #getId2()
   * @generated
   */
  void setId2(Ident value);

} // ParDef
