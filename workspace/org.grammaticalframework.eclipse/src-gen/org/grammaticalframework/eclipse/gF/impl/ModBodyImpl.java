/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Included;
import org.grammaticalframework.eclipse.gF.ListIncluded;
import org.grammaticalframework.eclipse.gF.ListInst;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.ModContent;
import org.grammaticalframework.eclipse.gF.ModOpen;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mod Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getExtendList <em>Extend List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#isFunctorInstantiation <em>Functor Instantiation</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getInstantiationList <em>Instantiation List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getModOpen <em>Mod Open</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getModContent <em>Mod Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModBodyImpl extends MinimalEObjectImpl.Container implements ModBody
{
  /**
   * The cached value of the '{@link #getExtendList() <em>Extend List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendList()
   * @generated
   * @ordered
   */
  protected ListIncluded extendList;

  /**
   * The cached value of the '{@link #getFunctor() <em>Functor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctor()
   * @generated
   * @ordered
   */
  protected Included functor;

  /**
   * The default value of the '{@link #isFunctorInstantiation() <em>Functor Instantiation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFunctorInstantiation()
   * @generated
   * @ordered
   */
  protected static final boolean FUNCTOR_INSTANTIATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFunctorInstantiation() <em>Functor Instantiation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFunctorInstantiation()
   * @generated
   * @ordered
   */
  protected boolean functorInstantiation = FUNCTOR_INSTANTIATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getInstantiationList() <em>Instantiation List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstantiationList()
   * @generated
   * @ordered
   */
  protected ListInst instantiationList;

  /**
   * The cached value of the '{@link #getModOpen() <em>Mod Open</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModOpen()
   * @generated
   * @ordered
   */
  protected ModOpen modOpen;

  /**
   * The cached value of the '{@link #getModContent() <em>Mod Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModContent()
   * @generated
   * @ordered
   */
  protected ModContent modContent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModBodyImpl()
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
    return GFPackage.Literals.MOD_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListIncluded getExtendList()
  {
    return extendList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtendList(ListIncluded newExtendList, NotificationChain msgs)
  {
    ListIncluded oldExtendList = extendList;
    extendList = newExtendList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__EXTEND_LIST, oldExtendList, newExtendList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtendList(ListIncluded newExtendList)
  {
    if (newExtendList != extendList)
    {
      NotificationChain msgs = null;
      if (extendList != null)
        msgs = ((InternalEObject)extendList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__EXTEND_LIST, null, msgs);
      if (newExtendList != null)
        msgs = ((InternalEObject)newExtendList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__EXTEND_LIST, null, msgs);
      msgs = basicSetExtendList(newExtendList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__EXTEND_LIST, newExtendList, newExtendList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Included getFunctor()
  {
    return functor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctor(Included newFunctor, NotificationChain msgs)
  {
    Included oldFunctor = functor;
    functor = newFunctor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__FUNCTOR, oldFunctor, newFunctor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctor(Included newFunctor)
  {
    if (newFunctor != functor)
    {
      NotificationChain msgs = null;
      if (functor != null)
        msgs = ((InternalEObject)functor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__FUNCTOR, null, msgs);
      if (newFunctor != null)
        msgs = ((InternalEObject)newFunctor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__FUNCTOR, null, msgs);
      msgs = basicSetFunctor(newFunctor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__FUNCTOR, newFunctor, newFunctor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFunctorInstantiation()
  {
    return functorInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctorInstantiation(boolean newFunctorInstantiation)
  {
    boolean oldFunctorInstantiation = functorInstantiation;
    functorInstantiation = newFunctorInstantiation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION, oldFunctorInstantiation, functorInstantiation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListInst getInstantiationList()
  {
    return instantiationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInstantiationList(ListInst newInstantiationList, NotificationChain msgs)
  {
    ListInst oldInstantiationList = instantiationList;
    instantiationList = newInstantiationList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__INSTANTIATION_LIST, oldInstantiationList, newInstantiationList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstantiationList(ListInst newInstantiationList)
  {
    if (newInstantiationList != instantiationList)
    {
      NotificationChain msgs = null;
      if (instantiationList != null)
        msgs = ((InternalEObject)instantiationList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__INSTANTIATION_LIST, null, msgs);
      if (newInstantiationList != null)
        msgs = ((InternalEObject)newInstantiationList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__INSTANTIATION_LIST, null, msgs);
      msgs = basicSetInstantiationList(newInstantiationList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__INSTANTIATION_LIST, newInstantiationList, newInstantiationList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModOpen getModOpen()
  {
    return modOpen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModOpen(ModOpen newModOpen, NotificationChain msgs)
  {
    ModOpen oldModOpen = modOpen;
    modOpen = newModOpen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__MOD_OPEN, oldModOpen, newModOpen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModOpen(ModOpen newModOpen)
  {
    if (newModOpen != modOpen)
    {
      NotificationChain msgs = null;
      if (modOpen != null)
        msgs = ((InternalEObject)modOpen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__MOD_OPEN, null, msgs);
      if (newModOpen != null)
        msgs = ((InternalEObject)newModOpen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__MOD_OPEN, null, msgs);
      msgs = basicSetModOpen(newModOpen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__MOD_OPEN, newModOpen, newModOpen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModContent getModContent()
  {
    return modContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModContent(ModContent newModContent, NotificationChain msgs)
  {
    ModContent oldModContent = modContent;
    modContent = newModContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__MOD_CONTENT, oldModContent, newModContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModContent(ModContent newModContent)
  {
    if (newModContent != modContent)
    {
      NotificationChain msgs = null;
      if (modContent != null)
        msgs = ((InternalEObject)modContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__MOD_CONTENT, null, msgs);
      if (newModContent != null)
        msgs = ((InternalEObject)newModContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__MOD_CONTENT, null, msgs);
      msgs = basicSetModContent(newModContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__MOD_CONTENT, newModContent, newModContent));
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
      case GFPackage.MOD_BODY__EXTEND_LIST:
        return basicSetExtendList(null, msgs);
      case GFPackage.MOD_BODY__FUNCTOR:
        return basicSetFunctor(null, msgs);
      case GFPackage.MOD_BODY__INSTANTIATION_LIST:
        return basicSetInstantiationList(null, msgs);
      case GFPackage.MOD_BODY__MOD_OPEN:
        return basicSetModOpen(null, msgs);
      case GFPackage.MOD_BODY__MOD_CONTENT:
        return basicSetModContent(null, msgs);
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
      case GFPackage.MOD_BODY__EXTEND_LIST:
        return getExtendList();
      case GFPackage.MOD_BODY__FUNCTOR:
        return getFunctor();
      case GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION:
        return isFunctorInstantiation();
      case GFPackage.MOD_BODY__INSTANTIATION_LIST:
        return getInstantiationList();
      case GFPackage.MOD_BODY__MOD_OPEN:
        return getModOpen();
      case GFPackage.MOD_BODY__MOD_CONTENT:
        return getModContent();
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
      case GFPackage.MOD_BODY__EXTEND_LIST:
        setExtendList((ListIncluded)newValue);
        return;
      case GFPackage.MOD_BODY__FUNCTOR:
        setFunctor((Included)newValue);
        return;
      case GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION:
        setFunctorInstantiation((Boolean)newValue);
        return;
      case GFPackage.MOD_BODY__INSTANTIATION_LIST:
        setInstantiationList((ListInst)newValue);
        return;
      case GFPackage.MOD_BODY__MOD_OPEN:
        setModOpen((ModOpen)newValue);
        return;
      case GFPackage.MOD_BODY__MOD_CONTENT:
        setModContent((ModContent)newValue);
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
      case GFPackage.MOD_BODY__EXTEND_LIST:
        setExtendList((ListIncluded)null);
        return;
      case GFPackage.MOD_BODY__FUNCTOR:
        setFunctor((Included)null);
        return;
      case GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION:
        setFunctorInstantiation(FUNCTOR_INSTANTIATION_EDEFAULT);
        return;
      case GFPackage.MOD_BODY__INSTANTIATION_LIST:
        setInstantiationList((ListInst)null);
        return;
      case GFPackage.MOD_BODY__MOD_OPEN:
        setModOpen((ModOpen)null);
        return;
      case GFPackage.MOD_BODY__MOD_CONTENT:
        setModContent((ModContent)null);
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
      case GFPackage.MOD_BODY__EXTEND_LIST:
        return extendList != null;
      case GFPackage.MOD_BODY__FUNCTOR:
        return functor != null;
      case GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION:
        return functorInstantiation != FUNCTOR_INSTANTIATION_EDEFAULT;
      case GFPackage.MOD_BODY__INSTANTIATION_LIST:
        return instantiationList != null;
      case GFPackage.MOD_BODY__MOD_OPEN:
        return modOpen != null;
      case GFPackage.MOD_BODY__MOD_CONTENT:
        return modContent != null;
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
    result.append(" (functorInstantiation: ");
    result.append(functorInstantiation);
    result.append(')');
    return result.toString();
  }

} //ModBodyImpl
