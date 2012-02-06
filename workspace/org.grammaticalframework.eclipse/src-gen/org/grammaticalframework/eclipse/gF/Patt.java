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
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getBindTo <em>Bind To</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isNegative <em>Negative</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isInaccessible <em>Inaccessible</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isMeta <em>Meta</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isTokenList <em>Token List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getStr <em>Str</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getPatternName <em>Pattern Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#getRef <em>Ref</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isInteger <em>Integer</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isDouble <em>Double</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.Patt#isString <em>String</em>}</li>
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
   * @see #setLabel(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Label()
   * @model containment="true"
   * @generated
   */
  Ident getLabel();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Ident value);

  /**
   * Returns the value of the '<em><b>Bind To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind To</em>' containment reference.
   * @see #setBindTo(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_BindTo()
   * @model containment="true"
   * @generated
   */
  Ident getBindTo();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getBindTo <em>Bind To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind To</em>' containment reference.
   * @see #getBindTo()
   * @generated
   */
  void setBindTo(Ident value);

  /**
   * Returns the value of the '<em><b>Negative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Negative</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negative</em>' attribute.
   * @see #setNegative(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Negative()
   * @model
   * @generated
   */
  boolean isNegative();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isNegative <em>Negative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negative</em>' attribute.
   * @see #isNegative()
   * @generated
   */
  void setNegative(boolean value);

  /**
   * Returns the value of the '<em><b>Inaccessible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inaccessible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inaccessible</em>' attribute.
   * @see #setInaccessible(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Inaccessible()
   * @model
   * @generated
   */
  boolean isInaccessible();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isInaccessible <em>Inaccessible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inaccessible</em>' attribute.
   * @see #isInaccessible()
   * @generated
   */
  void setInaccessible(boolean value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Pattern()
   * @model containment="true"
   * @generated
   */
  Exp getPattern();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Exp value);

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
   * Returns the value of the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str</em>' attribute.
   * @see #setStr(String)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Str()
   * @model
   * @generated
   */
  String getStr();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getStr <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str</em>' attribute.
   * @see #getStr()
   * @generated
   */
  void setStr(String value);

  /**
   * Returns the value of the '<em><b>Pattern Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Name</em>' containment reference.
   * @see #setPatternName(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_PatternName()
   * @model containment="true"
   * @generated
   */
  Ident getPatternName();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getPatternName <em>Pattern Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern Name</em>' containment reference.
   * @see #getPatternName()
   * @generated
   */
  void setPatternName(Ident value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Ident)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Ref()
   * @model
   * @generated
   */
  Ident getRef();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Ident value);

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

  /**
   * Returns the value of the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer</em>' attribute.
   * @see #setInteger(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Integer()
   * @model
   * @generated
   */
  boolean isInteger();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isInteger <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer</em>' attribute.
   * @see #isInteger()
   * @generated
   */
  void setInteger(boolean value);

  /**
   * Returns the value of the '<em><b>Double</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Double</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Double</em>' attribute.
   * @see #setDouble(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_Double()
   * @model
   * @generated
   */
  boolean isDouble();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isDouble <em>Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Double</em>' attribute.
   * @see #isDouble()
   * @generated
   */
  void setDouble(boolean value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getPatt_String()
   * @model
   * @generated
   */
  boolean isString();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.Patt#isString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #isString()
   * @generated
   */
  void setString(boolean value);

} // Patt
