/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.ListBind;
import org.grammaticalframework.eclipse.gF.ListLocDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getBindList <em>Bind List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getV <em>V</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getE <em>E</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpImpl extends TupleCompImpl implements Exp
{
  /**
   * The cached value of the '{@link #getBindList() <em>Bind List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindList()
   * @generated
   * @ordered
   */
  protected ListBind bindList;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected EObject v;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected EList<EObject> e;

  /**
   * The cached value of the '{@link #getDefList() <em>Def List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefList()
   * @generated
   * @ordered
   */
  protected ListLocDef defList;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Exp type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpImpl()
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
    return GFPackage.Literals.EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListBind getBindList()
  {
    return bindList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBindList(ListBind newBindList, NotificationChain msgs)
  {
    ListBind oldBindList = bindList;
    bindList = newBindList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__BIND_LIST, oldBindList, newBindList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindList(ListBind newBindList)
  {
    if (newBindList != bindList)
    {
      NotificationChain msgs = null;
      if (bindList != null)
        msgs = ((InternalEObject)bindList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__BIND_LIST, null, msgs);
      if (newBindList != null)
        msgs = ((InternalEObject)newBindList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__BIND_LIST, null, msgs);
      msgs = basicSetBindList(newBindList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__BIND_LIST, newBindList, newBindList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(EObject newV, NotificationChain msgs)
  {
    EObject oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(EObject newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__V, newV, newV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getE()
  {
    if (e == null)
    {
      e = new EObjectContainmentEList<EObject>(EObject.class, this, GFPackage.EXP__E);
    }
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListLocDef getDefList()
  {
    return defList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefList(ListLocDef newDefList, NotificationChain msgs)
  {
    ListLocDef oldDefList = defList;
    defList = newDefList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__DEF_LIST, oldDefList, newDefList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefList(ListLocDef newDefList)
  {
    if (newDefList != defList)
    {
      NotificationChain msgs = null;
      if (defList != null)
        msgs = ((InternalEObject)defList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__DEF_LIST, null, msgs);
      if (newDefList != null)
        msgs = ((InternalEObject)newDefList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__DEF_LIST, null, msgs);
      msgs = basicSetDefList(newDefList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__DEF_LIST, newDefList, newDefList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Exp newType, NotificationChain msgs)
  {
    Exp oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Exp newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__TYPE, newType, newType));
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
      case GFPackage.EXP__BIND_LIST:
        return basicSetBindList(null, msgs);
      case GFPackage.EXP__V:
        return basicSetV(null, msgs);
      case GFPackage.EXP__E:
        return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
      case GFPackage.EXP__DEF_LIST:
        return basicSetDefList(null, msgs);
      case GFPackage.EXP__TYPE:
        return basicSetType(null, msgs);
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
      case GFPackage.EXP__BIND_LIST:
        return getBindList();
      case GFPackage.EXP__V:
        return getV();
      case GFPackage.EXP__E:
        return getE();
      case GFPackage.EXP__DEF_LIST:
        return getDefList();
      case GFPackage.EXP__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GFPackage.EXP__BIND_LIST:
        setBindList((ListBind)newValue);
        return;
      case GFPackage.EXP__V:
        setV((EObject)newValue);
        return;
      case GFPackage.EXP__E:
        getE().clear();
        getE().addAll((Collection<? extends EObject>)newValue);
        return;
      case GFPackage.EXP__DEF_LIST:
        setDefList((ListLocDef)newValue);
        return;
      case GFPackage.EXP__TYPE:
        setType((Exp)newValue);
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
      case GFPackage.EXP__BIND_LIST:
        setBindList((ListBind)null);
        return;
      case GFPackage.EXP__V:
        setV((EObject)null);
        return;
      case GFPackage.EXP__E:
        getE().clear();
        return;
      case GFPackage.EXP__DEF_LIST:
        setDefList((ListLocDef)null);
        return;
      case GFPackage.EXP__TYPE:
        setType((Exp)null);
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
      case GFPackage.EXP__BIND_LIST:
        return bindList != null;
      case GFPackage.EXP__V:
        return v != null;
      case GFPackage.EXP__E:
        return e != null && !e.isEmpty();
      case GFPackage.EXP__DEF_LIST:
        return defList != null;
      case GFPackage.EXP__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpImpl
