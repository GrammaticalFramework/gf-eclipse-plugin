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

import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Included;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Included</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.IncludedImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.IncludedImpl#isInclusive <em>Inclusive</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.IncludedImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.IncludedImpl#isExclusive <em>Exclusive</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.IncludedImpl#getExcludes <em>Excludes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludedImpl extends MinimalEObjectImpl.Container implements Included
{
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
   * The default value of the '{@link #isInclusive() <em>Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInclusive()
   * @generated
   * @ordered
   */
  protected static final boolean INCLUSIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInclusive() <em>Inclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInclusive()
   * @generated
   * @ordered
   */
  protected boolean inclusive = INCLUSIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<Ident> includes;

  /**
   * The default value of the '{@link #isExclusive() <em>Exclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclusive()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLUSIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExclusive() <em>Exclusive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclusive()
   * @generated
   * @ordered
   */
  protected boolean exclusive = EXCLUSIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcludes()
   * @generated
   * @ordered
   */
  protected EList<Ident> excludes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IncludedImpl()
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
    return GFPackage.Literals.INCLUDED;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.INCLUDED__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.INCLUDED__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.INCLUDED__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.INCLUDED__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInclusive()
  {
    return inclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInclusive(boolean newInclusive)
  {
    boolean oldInclusive = inclusive;
    inclusive = newInclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.INCLUDED__INCLUSIVE, oldInclusive, inclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ident> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<Ident>(Ident.class, this, GFPackage.INCLUDED__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExclusive()
  {
    return exclusive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclusive(boolean newExclusive)
  {
    boolean oldExclusive = exclusive;
    exclusive = newExclusive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.INCLUDED__EXCLUSIVE, oldExclusive, exclusive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ident> getExcludes()
  {
    if (excludes == null)
    {
      excludes = new EObjectContainmentEList<Ident>(Ident.class, this, GFPackage.INCLUDED__EXCLUDES);
    }
    return excludes;
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
      case GFPackage.INCLUDED__NAME:
        return basicSetName(null, msgs);
      case GFPackage.INCLUDED__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case GFPackage.INCLUDED__EXCLUDES:
        return ((InternalEList<?>)getExcludes()).basicRemove(otherEnd, msgs);
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
      case GFPackage.INCLUDED__NAME:
        return getName();
      case GFPackage.INCLUDED__INCLUSIVE:
        return isInclusive();
      case GFPackage.INCLUDED__INCLUDES:
        return getIncludes();
      case GFPackage.INCLUDED__EXCLUSIVE:
        return isExclusive();
      case GFPackage.INCLUDED__EXCLUDES:
        return getExcludes();
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
      case GFPackage.INCLUDED__NAME:
        setName((Ident)newValue);
        return;
      case GFPackage.INCLUDED__INCLUSIVE:
        setInclusive((Boolean)newValue);
        return;
      case GFPackage.INCLUDED__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends Ident>)newValue);
        return;
      case GFPackage.INCLUDED__EXCLUSIVE:
        setExclusive((Boolean)newValue);
        return;
      case GFPackage.INCLUDED__EXCLUDES:
        getExcludes().clear();
        getExcludes().addAll((Collection<? extends Ident>)newValue);
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
      case GFPackage.INCLUDED__NAME:
        setName((Ident)null);
        return;
      case GFPackage.INCLUDED__INCLUSIVE:
        setInclusive(INCLUSIVE_EDEFAULT);
        return;
      case GFPackage.INCLUDED__INCLUDES:
        getIncludes().clear();
        return;
      case GFPackage.INCLUDED__EXCLUSIVE:
        setExclusive(EXCLUSIVE_EDEFAULT);
        return;
      case GFPackage.INCLUDED__EXCLUDES:
        getExcludes().clear();
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
      case GFPackage.INCLUDED__NAME:
        return name != null;
      case GFPackage.INCLUDED__INCLUSIVE:
        return inclusive != INCLUSIVE_EDEFAULT;
      case GFPackage.INCLUDED__INCLUDES:
        return includes != null && !includes.isEmpty();
      case GFPackage.INCLUDED__EXCLUSIVE:
        return exclusive != EXCLUSIVE_EDEFAULT;
      case GFPackage.INCLUDED__EXCLUDES:
        return excludes != null && !excludes.isEmpty();
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
    result.append(" (inclusive: ");
    result.append(inclusive);
    result.append(", exclusive: ");
    result.append(exclusive);
    result.append(')');
    return result.toString();
  }

} //IncludedImpl
