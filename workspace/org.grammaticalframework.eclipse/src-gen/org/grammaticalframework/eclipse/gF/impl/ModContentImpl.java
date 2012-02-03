/**
 * <copyright>
 * </copyright>
 *
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
import org.grammaticalframework.eclipse.gF.ModContent;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.TopDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mod Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModContentImpl#getOpens <em>Opens</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModContentImpl#getJudgements <em>Judgements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModContentImpl extends MinimalEObjectImpl.Container implements ModContent
{
  /**
   * The cached value of the '{@link #getOpens() <em>Opens</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpens()
   * @generated
   * @ordered
   */
  protected EList<Open> opens;

  /**
   * The cached value of the '{@link #getJudgements() <em>Judgements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJudgements()
   * @generated
   * @ordered
   */
  protected EList<TopDef> judgements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModContentImpl()
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
    return GFPackage.Literals.MOD_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Open> getOpens()
  {
    if (opens == null)
    {
      opens = new EObjectContainmentEList<Open>(Open.class, this, GFPackage.MOD_CONTENT__OPENS);
    }
    return opens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TopDef> getJudgements()
  {
    if (judgements == null)
    {
      judgements = new EObjectContainmentEList<TopDef>(TopDef.class, this, GFPackage.MOD_CONTENT__JUDGEMENTS);
    }
    return judgements;
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
      case GFPackage.MOD_CONTENT__OPENS:
        return ((InternalEList<?>)getOpens()).basicRemove(otherEnd, msgs);
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        return ((InternalEList<?>)getJudgements()).basicRemove(otherEnd, msgs);
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
      case GFPackage.MOD_CONTENT__OPENS:
        return getOpens();
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        return getJudgements();
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
      case GFPackage.MOD_CONTENT__OPENS:
        getOpens().clear();
        getOpens().addAll((Collection<? extends Open>)newValue);
        return;
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        getJudgements().clear();
        getJudgements().addAll((Collection<? extends TopDef>)newValue);
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
      case GFPackage.MOD_CONTENT__OPENS:
        getOpens().clear();
        return;
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        getJudgements().clear();
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
      case GFPackage.MOD_CONTENT__OPENS:
        return opens != null && !opens.isEmpty();
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        return judgements != null && !judgements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModContentImpl
