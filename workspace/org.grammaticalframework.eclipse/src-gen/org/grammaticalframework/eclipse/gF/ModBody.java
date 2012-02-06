/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mod Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getExtendList <em>Extend List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#isFunctorInstantiation <em>Functor Instantiation</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getInstantiationList <em>Instantiation List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getModContent <em>Mod Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody()
 * @model
 * @generated
 */
public interface ModBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Extend List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extend List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extend List</em>' containment reference.
   * @see #setExtendList(ListIncluded)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_ExtendList()
   * @model containment="true"
   * @generated
   */
  ListIncluded getExtendList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModBody#getExtendList <em>Extend List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extend List</em>' containment reference.
   * @see #getExtendList()
   * @generated
   */
  void setExtendList(ListIncluded value);

  /**
   * Returns the value of the '<em><b>Functor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functor</em>' containment reference.
   * @see #setFunctor(Included)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_Functor()
   * @model containment="true"
   * @generated
   */
  Included getFunctor();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModBody#getFunctor <em>Functor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor</em>' containment reference.
   * @see #getFunctor()
   * @generated
   */
  void setFunctor(Included value);

  /**
   * Returns the value of the '<em><b>Functor Instantiation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functor Instantiation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functor Instantiation</em>' attribute.
   * @see #setFunctorInstantiation(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_FunctorInstantiation()
   * @model
   * @generated
   */
  boolean isFunctorInstantiation();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModBody#isFunctorInstantiation <em>Functor Instantiation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor Instantiation</em>' attribute.
   * @see #isFunctorInstantiation()
   * @generated
   */
  void setFunctorInstantiation(boolean value);

  /**
   * Returns the value of the '<em><b>Instantiation List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiation List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiation List</em>' containment reference.
   * @see #setInstantiationList(ListInst)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_InstantiationList()
   * @model containment="true"
   * @generated
   */
  ListInst getInstantiationList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModBody#getInstantiationList <em>Instantiation List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instantiation List</em>' containment reference.
   * @see #getInstantiationList()
   * @generated
   */
  void setInstantiationList(ListInst value);

  /**
   * Returns the value of the '<em><b>Mod Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod Content</em>' containment reference.
   * @see #setModContent(ModContent)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_ModContent()
   * @model containment="true"
   * @generated
   */
  ModContent getModContent();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModBody#getModContent <em>Mod Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod Content</em>' containment reference.
   * @see #getModContent()
   * @generated
   */
  void setModContent(ModContent value);

} // ModBody
