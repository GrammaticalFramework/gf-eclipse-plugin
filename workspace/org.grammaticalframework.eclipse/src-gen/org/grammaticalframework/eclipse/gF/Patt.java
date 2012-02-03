/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getLeft <em>Left</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isOr <em>Or</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isAnd <em>And</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getRight <em>Right</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getValue <em>Value</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getLabel <em>Label</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isMeta <em>Meta</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isTokenList <em>Token List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isWildcard <em>Wildcard</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt()
 * @model
 * @generated
 */
public interface Patt extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Patt)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Left()
   * @model containment="true"
   * @generated
   */
  Patt getLeft();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Patt value);

  /**
   * Returns the value of the '<em><b>Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Or</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' attribute.
   * @see #setOr(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Or()
   * @model
   * @generated
   */
  boolean isOr();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isOr <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or</em>' attribute.
   * @see #isOr()
   * @generated
   */
  void setOr(boolean value);

  /**
   * Returns the value of the '<em><b>And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And</em>' attribute.
   * @see #setAnd(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_And()
   * @model
   * @generated
   */
  boolean isAnd();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isAnd <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And</em>' attribute.
   * @see #isAnd()
   * @generated
   */
  void setAnd(boolean value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Patt)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Right()
   * @model containment="true"
   * @generated
   */
  Patt getRight();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Patt value);

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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Name()
   * @model containment="true"
   * @generated
   */
  Ident getName();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getName <em>Name</em>}' containment reference.
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
   * @see #setValue(EObject)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Value()
   * @model containment="true"
   * @generated
   */
  EObject getValue();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EObject value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(EObject)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Label()
   * @model containment="true"
   * @generated
   */
  EObject getLabel();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(EObject value);

  /**
   * Returns the value of the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' attribute.
   * @see #setMeta(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Meta()
   * @model
   * @generated
   */
  boolean isMeta();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isMeta <em>Meta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta</em>' attribute.
   * @see #isMeta()
   * @generated
   */
  void setMeta(boolean value);

  /**
   * Returns the value of the '<em><b>Token List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Token List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Token List</em>' attribute.
   * @see #setTokenList(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_TokenList()
   * @model
   * @generated
   */
  boolean isTokenList();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isTokenList <em>Token List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Token List</em>' attribute.
   * @see #isTokenList()
   * @generated
   */
  void setTokenList(boolean value);

  /**
   * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wildcard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wildcard</em>' attribute.
   * @see #setWildcard(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Wildcard()
   * @model
   * @generated
   */
  boolean isWildcard();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isWildcard <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wildcard</em>' attribute.
   * @see #isWildcard()
   * @generated
   */
  void setWildcard(boolean value);

} // Patt
