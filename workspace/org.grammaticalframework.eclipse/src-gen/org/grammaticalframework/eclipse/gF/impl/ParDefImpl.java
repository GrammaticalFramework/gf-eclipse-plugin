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
import org.grammaticalframework.eclipse.gF.ParConstr;
import org.grammaticalframework.eclipse.gF.ParDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Par Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ParDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ParDefImpl#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ParDefImpl#getId2 <em>Id2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParDefImpl extends MinimalEObjectImpl.Container implements ParDef
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
   * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructors()
   * @generated
   * @ordered
   */
  protected EList<ParConstr> constructors;

  /**
   * The cached value of the '{@link #getId2() <em>Id2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId2()
   * @generated
   * @ordered
   */
  protected Ident id2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParDefImpl()
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
    return GFPackage.Literals.PAR_DEF;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PAR_DEF__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PAR_DEF__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PAR_DEF__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PAR_DEF__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParConstr> getConstructors()
  {
    if (constructors == null)
    {
      constructors = new EObjectContainmentEList<ParConstr>(ParConstr.class, this, GFPackage.PAR_DEF__CONSTRUCTORS);
    }
    return constructors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident getId2()
  {
    return id2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId2(Ident newId2, NotificationChain msgs)
  {
    Ident oldId2 = id2;
    id2 = newId2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PAR_DEF__ID2, oldId2, newId2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId2(Ident newId2)
  {
    if (newId2 != id2)
    {
      NotificationChain msgs = null;
      if (id2 != null)
        msgs = ((InternalEObject)id2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PAR_DEF__ID2, null, msgs);
      if (newId2 != null)
        msgs = ((InternalEObject)newId2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PAR_DEF__ID2, null, msgs);
      msgs = basicSetId2(newId2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PAR_DEF__ID2, newId2, newId2));
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
      case GFPackage.PAR_DEF__NAME:
        return basicSetName(null, msgs);
      case GFPackage.PAR_DEF__CONSTRUCTORS:
        return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
      case GFPackage.PAR_DEF__ID2:
        return basicSetId2(null, msgs);
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
      case GFPackage.PAR_DEF__NAME:
        return getName();
      case GFPackage.PAR_DEF__CONSTRUCTORS:
        return getConstructors();
      case GFPackage.PAR_DEF__ID2:
        return getId2();
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
      case GFPackage.PAR_DEF__NAME:
        setName((Ident)newValue);
        return;
      case GFPackage.PAR_DEF__CONSTRUCTORS:
        getConstructors().clear();
        getConstructors().addAll((Collection<? extends ParConstr>)newValue);
        return;
      case GFPackage.PAR_DEF__ID2:
        setId2((Ident)newValue);
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
      case GFPackage.PAR_DEF__NAME:
        setName((Ident)null);
        return;
      case GFPackage.PAR_DEF__CONSTRUCTORS:
        getConstructors().clear();
        return;
      case GFPackage.PAR_DEF__ID2:
        setId2((Ident)null);
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
      case GFPackage.PAR_DEF__NAME:
        return name != null;
      case GFPackage.PAR_DEF__CONSTRUCTORS:
        return constructors != null && !constructors.isEmpty();
      case GFPackage.PAR_DEF__ID2:
        return id2 != null;
    }
    return super.eIsSet(featureID);
  }

} //ParDefImpl
