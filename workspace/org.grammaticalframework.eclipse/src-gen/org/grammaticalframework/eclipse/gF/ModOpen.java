/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mod Open</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModOpen#getOpenList <em>Open List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getModOpen()
 * @model
 * @generated
 */
public interface ModOpen extends EObject
{
  /**
   * Returns the value of the '<em><b>Open List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Open List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Open List</em>' containment reference.
   * @see #setOpenList(ListOpen)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModOpen_OpenList()
   * @model containment="true"
   * @generated
   */
  ListOpen getOpenList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModOpen#getOpenList <em>Open List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Open List</em>' containment reference.
   * @see #getOpenList()
   * @generated
   */
  void setOpenList(ListOpen value);

} // ModOpen
