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

import org.grammaticalframework.eclipse.gF.Altern;
import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.GFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Altern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.AlternImpl#getAlt1 <em>Alt1</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.AlternImpl#getAlt2 <em>Alt2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternImpl extends MinimalEObjectImpl.Container implements Altern
{
  /**
   * The cached value of the '{@link #getAlt1() <em>Alt1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlt1()
   * @generated
   * @ordered
   */
  protected Exp alt1;

  /**
   * The cached value of the '{@link #getAlt2() <em>Alt2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlt2()
   * @generated
   * @ordered
   */
  protected Exp alt2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlternImpl()
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
    return GFPackage.Literals.ALTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getAlt1()
  {
    return alt1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlt1(Exp newAlt1, NotificationChain msgs)
  {
    Exp oldAlt1 = alt1;
    alt1 = newAlt1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.ALTERN__ALT1, oldAlt1, newAlt1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlt1(Exp newAlt1)
  {
    if (newAlt1 != alt1)
    {
      NotificationChain msgs = null;
      if (alt1 != null)
        msgs = ((InternalEObject)alt1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.ALTERN__ALT1, null, msgs);
      if (newAlt1 != null)
        msgs = ((InternalEObject)newAlt1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.ALTERN__ALT1, null, msgs);
      msgs = basicSetAlt1(newAlt1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.ALTERN__ALT1, newAlt1, newAlt1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getAlt2()
  {
    return alt2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlt2(Exp newAlt2, NotificationChain msgs)
  {
    Exp oldAlt2 = alt2;
    alt2 = newAlt2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.ALTERN__ALT2, oldAlt2, newAlt2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlt2(Exp newAlt2)
  {
    if (newAlt2 != alt2)
    {
      NotificationChain msgs = null;
      if (alt2 != null)
        msgs = ((InternalEObject)alt2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.ALTERN__ALT2, null, msgs);
      if (newAlt2 != null)
        msgs = ((InternalEObject)newAlt2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.ALTERN__ALT2, null, msgs);
      msgs = basicSetAlt2(newAlt2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.ALTERN__ALT2, newAlt2, newAlt2));
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
      case GFPackage.ALTERN__ALT1:
        return basicSetAlt1(null, msgs);
      case GFPackage.ALTERN__ALT2:
        return basicSetAlt2(null, msgs);
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
      case GFPackage.ALTERN__ALT1:
        return getAlt1();
      case GFPackage.ALTERN__ALT2:
        return getAlt2();
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
      case GFPackage.ALTERN__ALT1:
        setAlt1((Exp)newValue);
        return;
      case GFPackage.ALTERN__ALT2:
        setAlt2((Exp)newValue);
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
      case GFPackage.ALTERN__ALT1:
        setAlt1((Exp)null);
        return;
      case GFPackage.ALTERN__ALT2:
        setAlt2((Exp)null);
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
      case GFPackage.ALTERN__ALT1:
        return alt1 != null;
      case GFPackage.ALTERN__ALT2:
        return alt2 != null;
    }
    return super.eIsSet(featureID);
  }

} //AlternImpl
