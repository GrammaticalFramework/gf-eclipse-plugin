/**
 */
package org.grammaticalframework.eclipse.gF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.ListLocDef;
import org.grammaticalframework.eclipse.gF.LocDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Loc Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ListLocDefImpl#getLocalDefinitions <em>Local Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListLocDefImpl extends MinimalEObjectImpl.Container implements ListLocDef
{
  /**
   * The cached value of the '{@link #getLocalDefinitions() <em>Local Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalDefinitions()
   * @generated
   * @ordered
   */
  protected EList<LocDef> localDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListLocDefImpl()
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
    return GFPackage.Literals.LIST_LOC_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LocDef> getLocalDefinitions()
  {
    if (localDefinitions == null)
    {
      localDefinitions = new EObjectContainmentEList<LocDef>(LocDef.class, this, GFPackage.LIST_LOC_DEF__LOCAL_DEFINITIONS);
    }
    return localDefinitions;
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
      case GFPackage.LIST_LOC_DEF__LOCAL_DEFINITIONS:
        return ((InternalEList<?>)getLocalDefinitions()).basicRemove(otherEnd, msgs);
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
      case GFPackage.LIST_LOC_DEF__LOCAL_DEFINITIONS:
        return getLocalDefinitions();
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
      case GFPackage.LIST_LOC_DEF__LOCAL_DEFINITIONS:
        getLocalDefinitions().clear();
        getLocalDefinitions().addAll((Collection<? extends LocDef>)newValue);
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
      case GFPackage.LIST_LOC_DEF__LOCAL_DEFINITIONS:
        getLocalDefinitions().clear();
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
      case GFPackage.LIST_LOC_DEF__LOCAL_DEFINITIONS:
        return localDefinitions != null && !localDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ListLocDefImpl
