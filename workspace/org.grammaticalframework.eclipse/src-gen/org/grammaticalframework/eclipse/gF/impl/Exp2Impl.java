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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.grammaticalframework.eclipse.gF.Exp2;
import org.grammaticalframework.eclipse.gF.Exp3;
import org.grammaticalframework.eclipse.gF.GFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp2Impl#getV <em>V</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp2Impl#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Exp2Impl extends MinimalEObjectImpl.Container implements Exp2
{
  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected Exp3 v;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected EList<Exp2> e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Exp2Impl()
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
    return GFPackage.Literals.EXP2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp3 getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(Exp3 newV, NotificationChain msgs)
  {
    Exp3 oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP2__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(Exp3 newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP2__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP2__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP2__V, newV, newV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Exp2> getE()
  {
    if (e == null)
    {
      e = new EObjectContainmentEList<Exp2>(Exp2.class, this, GFPackage.EXP2__E);
    }
    return e;
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
      case GFPackage.EXP2__V:
        return basicSetV(null, msgs);
      case GFPackage.EXP2__E:
        return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
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
      case GFPackage.EXP2__V:
        return getV();
      case GFPackage.EXP2__E:
        return getE();
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
      case GFPackage.EXP2__V:
        setV((Exp3)newValue);
        return;
      case GFPackage.EXP2__E:
        getE().clear();
        getE().addAll((Collection<? extends Exp2>)newValue);
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
      case GFPackage.EXP2__V:
        setV((Exp3)null);
        return;
      case GFPackage.EXP2__E:
        getE().clear();
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
      case GFPackage.EXP2__V:
        return v != null;
      case GFPackage.EXP2__E:
        return e != null && !e.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Exp2Impl
