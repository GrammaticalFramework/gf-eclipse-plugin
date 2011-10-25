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
 * A representation of the model object '<em><b>Print Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.PrintDef#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.PrintDef#getPrintname <em>Printname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getPrintDef()
 * @model
 * @generated
 */
public interface PrintDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPrintDef_Name()
   * @model containment="true"
   * @generated
   */
  EList<Name> getName();

  /**
   * Returns the value of the '<em><b>Printname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Printname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Printname</em>' containment reference.
   * @see #setPrintname(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPrintDef_Printname()
   * @model containment="true"
   * @generated
   */
  Exp getPrintname();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.PrintDef#getPrintname <em>Printname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Printname</em>' containment reference.
   * @see #getPrintname()
   * @generated
   */
  void setPrintname(Exp value);

} // PrintDef
