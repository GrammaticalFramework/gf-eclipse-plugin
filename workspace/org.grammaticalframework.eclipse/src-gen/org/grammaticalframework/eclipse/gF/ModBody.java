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
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getOpens <em>Opens</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModBody#getJudgements <em>Judgements</em>}</li>
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
   * Returns the value of the '<em><b>Opens</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Open}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opens</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_Opens()
   * @model containment="true"
   * @generated
   */
  EList<Open> getOpens();

  /**
   * Returns the value of the '<em><b>Judgements</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.TopDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Judgements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Judgements</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModBody_Judgements()
   * @model containment="true"
   * @generated
   */
  EList<TopDef> getJudgements();

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
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Open}.
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
  EList<Open> getInstantiations();

} // ModBody
