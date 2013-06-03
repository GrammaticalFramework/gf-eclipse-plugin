/**
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
import org.grammaticalframework.eclipse.gF.ListOpen;
import org.grammaticalframework.eclipse.gF.ModContent;
import org.grammaticalframework.eclipse.gF.TopDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mod Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModContentImpl#getJudgements <em>Judgements</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModContentImpl#getOpenList <em>Open List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModContentImpl extends MinimalEObjectImpl.Container implements ModContent
{
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
   * The cached value of the '{@link #getOpenList() <em>Open List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenList()
   * @generated
   * @ordered
   */
  protected ListOpen openList;

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
  public ListOpen getOpenList()
  {
    return openList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpenList(ListOpen newOpenList, NotificationChain msgs)
  {
    ListOpen oldOpenList = openList;
    openList = newOpenList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.MOD_CONTENT__OPEN_LIST, oldOpenList, newOpenList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpenList(ListOpen newOpenList)
  {
    if (newOpenList != openList)
    {
      NotificationChain msgs = null;
      if (openList != null)
        msgs = ((InternalEObject)openList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_CONTENT__OPEN_LIST, null, msgs);
      if (newOpenList != null)
        msgs = ((InternalEObject)newOpenList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_CONTENT__OPEN_LIST, null, msgs);
      msgs = basicSetOpenList(newOpenList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_CONTENT__OPEN_LIST, newOpenList, newOpenList));
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
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        return ((InternalEList<?>)getJudgements()).basicRemove(otherEnd, msgs);
      case GFPackage.MOD_CONTENT__OPEN_LIST:
        return basicSetOpenList(null, msgs);
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
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        return getJudgements();
      case GFPackage.MOD_CONTENT__OPEN_LIST:
        return getOpenList();
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
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        getJudgements().clear();
        getJudgements().addAll((Collection<? extends TopDef>)newValue);
        return;
      case GFPackage.MOD_CONTENT__OPEN_LIST:
        setOpenList((ListOpen)newValue);
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
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        getJudgements().clear();
        return;
      case GFPackage.MOD_CONTENT__OPEN_LIST:
        setOpenList((ListOpen)null);
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
      case GFPackage.MOD_CONTENT__JUDGEMENTS:
        return judgements != null && !judgements.isEmpty();
      case GFPackage.MOD_CONTENT__OPEN_LIST:
        return openList != null;
    }
    return super.eIsSet(featureID);
  }

} //ModContentImpl
