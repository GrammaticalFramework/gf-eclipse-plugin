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
 * A representation of the model object '<em><b>Top Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isCat <em>Cat</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isFun <em>Fun</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isDef <em>Def</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isData <em>Data</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isParam <em>Param</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isOper <em>Oper</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isLincat <em>Lincat</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isLindef <em>Lindef</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isLin <em>Lin</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isPrintname <em>Printname</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.TopDef#isFlags <em>Flags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef()
 * @model
 * @generated
 */
public interface TopDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Cat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cat</em>' attribute.
   * @see #setCat(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Cat()
   * @model
   * @generated
   */
  boolean isCat();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isCat <em>Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cat</em>' attribute.
   * @see #isCat()
   * @generated
   */
  void setCat(boolean value);

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getDefinitions();

  /**
   * Returns the value of the '<em><b>Fun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fun</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fun</em>' attribute.
   * @see #setFun(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Fun()
   * @model
   * @generated
   */
  boolean isFun();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isFun <em>Fun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fun</em>' attribute.
   * @see #isFun()
   * @generated
   */
  void setFun(boolean value);

  /**
   * Returns the value of the '<em><b>Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' attribute.
   * @see #setDef(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Def()
   * @model
   * @generated
   */
  boolean isDef();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isDef <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' attribute.
   * @see #isDef()
   * @generated
   */
  void setDef(boolean value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' attribute.
   * @see #setData(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Data()
   * @model
   * @generated
   */
  boolean isData();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isData <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' attribute.
   * @see #isData()
   * @generated
   */
  void setData(boolean value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' attribute.
   * @see #setParam(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Param()
   * @model
   * @generated
   */
  boolean isParam();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #isParam()
   * @generated
   */
  void setParam(boolean value);

  /**
   * Returns the value of the '<em><b>Oper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oper</em>' attribute.
   * @see #setOper(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Oper()
   * @model
   * @generated
   */
  boolean isOper();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isOper <em>Oper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oper</em>' attribute.
   * @see #isOper()
   * @generated
   */
  void setOper(boolean value);

  /**
   * Returns the value of the '<em><b>Lincat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lincat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lincat</em>' attribute.
   * @see #setLincat(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Lincat()
   * @model
   * @generated
   */
  boolean isLincat();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isLincat <em>Lincat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lincat</em>' attribute.
   * @see #isLincat()
   * @generated
   */
  void setLincat(boolean value);

  /**
   * Returns the value of the '<em><b>Lindef</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lindef</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lindef</em>' attribute.
   * @see #setLindef(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Lindef()
   * @model
   * @generated
   */
  boolean isLindef();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isLindef <em>Lindef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lindef</em>' attribute.
   * @see #isLindef()
   * @generated
   */
  void setLindef(boolean value);

  /**
   * Returns the value of the '<em><b>Lin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lin</em>' attribute.
   * @see #setLin(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Lin()
   * @model
   * @generated
   */
  boolean isLin();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isLin <em>Lin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lin</em>' attribute.
   * @see #isLin()
   * @generated
   */
  void setLin(boolean value);

  /**
   * Returns the value of the '<em><b>Printname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Printname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Printname</em>' attribute.
   * @see #setPrintname(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Printname()
   * @model
   * @generated
   */
  boolean isPrintname();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isPrintname <em>Printname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Printname</em>' attribute.
   * @see #isPrintname()
   * @generated
   */
  void setPrintname(boolean value);

  /**
   * Returns the value of the '<em><b>Flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flags</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flags</em>' attribute.
   * @see #setFlags(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getTopDef_Flags()
   * @model
   * @generated
   */
  boolean isFlags();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.TopDef#isFlags <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flags</em>' attribute.
   * @see #isFlags()
   * @generated
   */
  void setFlags(boolean value);

} // TopDef
