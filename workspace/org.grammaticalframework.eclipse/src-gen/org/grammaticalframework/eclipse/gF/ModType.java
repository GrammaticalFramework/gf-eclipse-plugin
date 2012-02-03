/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mod Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModType#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModType#isResource <em>Resource</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModType#isInterface <em>Interface</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModType#isConcrete <em>Concrete</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModType#getAbstractName <em>Abstract Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.ModType#isInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.grammaticalframework.eclipse.gF.GFPackage#getModType()
 * @model
 * @generated
 */
public interface ModType extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModType_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModType#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

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
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModType_Name()
   * @model containment="true"
   * @generated
   */
  Ident getName();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModType#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Ident value);

  /**
   * Returns the value of the '<em><b>Resource</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' attribute.
   * @see #setResource(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModType_Resource()
   * @model
   * @generated
   */
  boolean isResource();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModType#isResource <em>Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resource</em>' attribute.
   * @see #isResource()
   * @generated
   */
  void setResource(boolean value);

  /**
   * Returns the value of the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' attribute.
   * @see #setInterface(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModType_Interface()
   * @model
   * @generated
   */
  boolean isInterface();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModType#isInterface <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' attribute.
   * @see #isInterface()
   * @generated
   */
  void setInterface(boolean value);

  /**
   * Returns the value of the '<em><b>Concrete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete</em>' attribute.
   * @see #setConcrete(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModType_Concrete()
   * @model
   * @generated
   */
  boolean isConcrete();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModType#isConcrete <em>Concrete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concrete</em>' attribute.
   * @see #isConcrete()
   * @generated
   */
  void setConcrete(boolean value);

  /**
   * Returns the value of the '<em><b>Abstract Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Name</em>' containment reference.
   * @see #setAbstractName(EObject)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModType_AbstractName()
   * @model containment="true"
   * @generated
   */
  EObject getAbstractName();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModType#getAbstractName <em>Abstract Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract Name</em>' containment reference.
   * @see #getAbstractName()
   * @generated
   */
  void setAbstractName(EObject value);

  /**
   * Returns the value of the '<em><b>Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' attribute.
   * @see #setInstance(boolean)
   * @see org.grammaticalframework.eclipse.gF.GFPackage#getModType_Instance()
   * @model
   * @generated
   */
  boolean isInstance();

  /**
   * Sets the value of the '{@link org.grammaticalframework.eclipse.gF.ModType#isInstance <em>Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' attribute.
   * @see #isInstance()
   * @generated
   */
  void setInstance(boolean value);

} // ModType
