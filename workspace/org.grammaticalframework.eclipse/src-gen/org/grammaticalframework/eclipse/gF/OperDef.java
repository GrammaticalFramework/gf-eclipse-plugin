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
 * A representation of the model object '<em><b>Oper Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.OperDef#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.OperDef#getType <em>Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.OperDef#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.OperDef#getArgs <em>Args</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.OperDef#isOverload <em>Overload</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.OperDef#getOverloads <em>Overloads</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getOperDef()
 * @model
 * @generated
 */
public interface OperDef extends EObject
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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getOperDef_Name()
   * @model containment="true"
   * @generated
   */
  EList<Name> getName();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getOperDef_Type()
   * @model containment="true"
   * @generated
   */
  Exp getType();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.OperDef#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Exp value);

  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(Exp)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getOperDef_Definition()
   * @model containment="true"
   * @generated
   */
  Exp getDefinition();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.OperDef#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(Exp value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.Arg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getOperDef_Args()
   * @model containment="true"
   * @generated
   */
  EList<Arg> getArgs();

  /**
   * Returns the value of the '<em><b>Overload</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overload</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overload</em>' attribute.
   * @see #setOverload(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getOperDef_Overload()
   * @model
   * @generated
   */
  boolean isOverload();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.OperDef#isOverload <em>Overload</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overload</em>' attribute.
   * @see #isOverload()
   * @generated
   */
  void setOverload(boolean value);

  /**
   * Returns the value of the '<em><b>Overloads</b></em>' containment reference list.
   * The list contents are of type {@link org.grammaticalframework.eclipse.gF.OperDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overloads</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overloads</em>' containment reference list.
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getOperDef_Overloads()
   * @model containment="true"
   * @generated
   */
  EList<OperDef> getOverloads();

} // OperDef
