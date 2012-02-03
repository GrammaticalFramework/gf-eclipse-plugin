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
 * A representation of the model object '<em><b>Mod Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getContent <em>Content</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#isFunctorInstantiation <em>Functor Instantiation</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getInstantiations <em>Instantiations</em>}</li>
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
   * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Included}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_Extends()
   * @model containment="true"
   * @generated
   */
  EList<Included> getExtends();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(ModContent)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_Content()
   * @model containment="true"
   * @generated
   */
  ModContent getContent();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModBody#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(ModContent value);

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
   * Returns the value of the '<em><b>Instantiations</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Inst}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiations</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_Instantiations()
   * @model containment="true"
   * @generated
   */
  EList<Inst> getInstantiations();

} // ModBody
