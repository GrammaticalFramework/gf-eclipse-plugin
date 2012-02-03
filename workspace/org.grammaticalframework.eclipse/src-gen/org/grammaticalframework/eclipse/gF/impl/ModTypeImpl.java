/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.ModType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mod Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModTypeImpl#isResource <em>Resource</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModTypeImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModTypeImpl#isConcrete <em>Concrete</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModTypeImpl#getAbstractName <em>Abstract Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModTypeImpl#isInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModTypeImpl extends MinimalEObjectImpl.Container implements ModType
{
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Ident name;

  /**
   * The default value of the '{@link #isResource() <em>Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResource()
   * @generated
   * @ordered
   */
  protected static final boolean RESOURCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResource() <em>Resource</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResource()
   * @generated
   * @ordered
   */
  protected boolean resource = RESOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInterface()
   * @generated
   * @ordered
   */
  protected static final boolean INTERFACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInterface()
   * @generated
   * @ordered
   */
  protected boolean interface_ = INTERFACE_EDEFAULT;

  /**
   * The default value of the '{@link #isConcrete() <em>Concrete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConcrete()
   * @generated
   * @ordered
   */
  protected static final boolean CONCRETE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConcrete() <em>Concrete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConcrete()
   * @generated
   * @ordered
   */
  protected boolean concrete = CONCRETE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAbstractName() <em>Abstract Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractName()
   * @generated
   * @ordered
   */
  protected EObject abstractName;

  /**
   * The default value of the '{@link #isInstance() <em>Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInstance()
   * @generated
   * @ordered
   */
  protected static final boolean INSTANCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInstance() <em>Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInstance()
   * @generated
   * @ordered
   */
  protected boolean instance = INSTANCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GFPackage.Literals.MOD_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_TYPE__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Ident newName, NotificationChain msgs)
  {
    Ident oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.MOD_TYPE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Ident newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_TYPE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_TYPE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_TYPE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResource(boolean newResource)
  {
    boolean oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_TYPE__RESOURCE, oldResource, resource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(boolean newInterface)
  {
    boolean oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_TYPE__INTERFACE, oldInterface, interface_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConcrete()
  {
    return concrete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcrete(boolean newConcrete)
  {
    boolean oldConcrete = concrete;
    concrete = newConcrete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_TYPE__CONCRETE, oldConcrete, concrete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getAbstractName()
  {
    return abstractName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstractName(EObject newAbstractName, NotificationChain msgs)
  {
    EObject oldAbstractName = abstractName;
    abstractName = newAbstractName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.MOD_TYPE__ABSTRACT_NAME, oldAbstractName, newAbstractName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstractName(EObject newAbstractName)
  {
    if (newAbstractName != abstractName)
    {
      NotificationChain msgs = null;
      if (abstractName != null)
        msgs = ((InternalEObject)abstractName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_TYPE__ABSTRACT_NAME, null, msgs);
      if (newAbstractName != null)
        msgs = ((InternalEObject)newAbstractName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_TYPE__ABSTRACT_NAME, null, msgs);
      msgs = basicSetAbstractName(newAbstractName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_TYPE__ABSTRACT_NAME, newAbstractName, newAbstractName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInstance()
  {
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance(boolean newInstance)
  {
    boolean oldInstance = instance;
    instance = newInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_TYPE__INSTANCE, oldInstance, instance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GFPackage.MOD_TYPE__NAME:
        return basicSetName(null, msgs);
      case GFPackage.MOD_TYPE__ABSTRACT_NAME:
        return basicSetAbstractName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GFPackage.MOD_TYPE__ABSTRACT:
        return isAbstract();
      case GFPackage.MOD_TYPE__NAME:
        return getName();
      case GFPackage.MOD_TYPE__RESOURCE:
        return isResource();
      case GFPackage.MOD_TYPE__INTERFACE:
        return isInterface();
      case GFPackage.MOD_TYPE__CONCRETE:
        return isConcrete();
      case GFPackage.MOD_TYPE__ABSTRACT_NAME:
        return getAbstractName();
      case GFPackage.MOD_TYPE__INSTANCE:
        return isInstance();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GFPackage.MOD_TYPE__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case GFPackage.MOD_TYPE__NAME:
        setName((Ident)newValue);
        return;
      case GFPackage.MOD_TYPE__RESOURCE:
        setResource((Boolean)newValue);
        return;
      case GFPackage.MOD_TYPE__INTERFACE:
        setInterface((Boolean)newValue);
        return;
      case GFPackage.MOD_TYPE__CONCRETE:
        setConcrete((Boolean)newValue);
        return;
      case GFPackage.MOD_TYPE__ABSTRACT_NAME:
        setAbstractName((EObject)newValue);
        return;
      case GFPackage.MOD_TYPE__INSTANCE:
        setInstance((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GFPackage.MOD_TYPE__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case GFPackage.MOD_TYPE__NAME:
        setName((Ident)null);
        return;
      case GFPackage.MOD_TYPE__RESOURCE:
        setResource(RESOURCE_EDEFAULT);
        return;
      case GFPackage.MOD_TYPE__INTERFACE:
        setInterface(INTERFACE_EDEFAULT);
        return;
      case GFPackage.MOD_TYPE__CONCRETE:
        setConcrete(CONCRETE_EDEFAULT);
        return;
      case GFPackage.MOD_TYPE__ABSTRACT_NAME:
        setAbstractName((EObject)null);
        return;
      case GFPackage.MOD_TYPE__INSTANCE:
        setInstance(INSTANCE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GFPackage.MOD_TYPE__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case GFPackage.MOD_TYPE__NAME:
        return name != null;
      case GFPackage.MOD_TYPE__RESOURCE:
        return resource != RESOURCE_EDEFAULT;
      case GFPackage.MOD_TYPE__INTERFACE:
        return interface_ != INTERFACE_EDEFAULT;
      case GFPackage.MOD_TYPE__CONCRETE:
        return concrete != CONCRETE_EDEFAULT;
      case GFPackage.MOD_TYPE__ABSTRACT_NAME:
        return abstractName != null;
      case GFPackage.MOD_TYPE__INSTANCE:
        return instance != INSTANCE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(", resource: ");
    result.append(resource);
    result.append(", interface: ");
    result.append(interface_);
    result.append(", concrete: ");
    result.append(concrete);
    result.append(", instance: ");
    result.append(instance);
    result.append(')');
    return result.toString();
  }

} //ModTypeImpl
