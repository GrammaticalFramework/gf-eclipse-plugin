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
import org.grammaticalframework.eclipse.gF.Included;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.Open;
import org.grammaticalframework.eclipse.gF.TopDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mod Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getOpens <em>Opens</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getJudgements <em>Judgements</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#isFunctorInstantiation <em>Functor Instantiation</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getInstantiations <em>Instantiations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModBodyImpl extends MinimalEObjectImpl.Container implements ModBody
{
  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected EList<Included> extends_;

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
   * The cached value of the '{@link #getInstantiations() <em>Instantiations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstantiations()
   * @generated
   * @ordered
   */
  protected EList<Open> instantiations;

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
  public EList<Included> getExtends()
  {
    if (extends_ == null)
    {
      extends_ = new EObjectContainmentEList<Included>(Included.class, this, GFPackage.MOD_BODY__EXTENDS);
    }
    return extends_;
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
      opens = new EObjectContainmentEList<Open>(Open.class, this, GFPackage.MOD_BODY__OPENS);
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
      judgements = new EObjectContainmentEList<TopDef>(TopDef.class, this, GFPackage.MOD_BODY__JUDGEMENTS);
    }
    return judgements;
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
  public EList<Open> getInstantiations()
  {
    if (instantiations == null)
    {
      instantiations = new EObjectContainmentEList<Open>(Open.class, this, GFPackage.MOD_BODY__INSTANTIATIONS);
    }
    return instantiations;
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
      case GFPackage.MOD_BODY__EXTENDS:
        return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
      case GFPackage.MOD_BODY__OPENS:
        return ((InternalEList<?>)getOpens()).basicRemove(otherEnd, msgs);
      case GFPackage.MOD_BODY__JUDGEMENTS:
        return ((InternalEList<?>)getJudgements()).basicRemove(otherEnd, msgs);
      case GFPackage.MOD_BODY__FUNCTOR:
        return basicSetFunctor(null, msgs);
      case GFPackage.MOD_BODY__INSTANTIATIONS:
        return ((InternalEList<?>)getInstantiations()).basicRemove(otherEnd, msgs);
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
      case GFPackage.MOD_BODY__EXTENDS:
        return getExtends();
      case GFPackage.MOD_BODY__OPENS:
        return getOpens();
      case GFPackage.MOD_BODY__JUDGEMENTS:
        return getJudgements();
      case GFPackage.MOD_BODY__FUNCTOR:
        return getFunctor();
      case GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION:
        return isFunctorInstantiation();
      case GFPackage.MOD_BODY__INSTANTIATIONS:
        return getInstantiations();
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
      case GFPackage.MOD_BODY__EXTENDS:
        getExtends().clear();
        getExtends().addAll((Collection<? extends Included>)newValue);
        return;
      case GFPackage.MOD_BODY__OPENS:
        getOpens().clear();
        getOpens().addAll((Collection<? extends Open>)newValue);
        return;
      case GFPackage.MOD_BODY__JUDGEMENTS:
        getJudgements().clear();
        getJudgements().addAll((Collection<? extends TopDef>)newValue);
        return;
      case GFPackage.MOD_BODY__FUNCTOR:
        setFunctor((Included)newValue);
        return;
      case GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION:
        setFunctorInstantiation((Boolean)newValue);
        return;
      case GFPackage.MOD_BODY__INSTANTIATIONS:
        getInstantiations().clear();
        getInstantiations().addAll((Collection<? extends Open>)newValue);
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
      case GFPackage.MOD_BODY__EXTENDS:
        getExtends().clear();
        return;
      case GFPackage.MOD_BODY__OPENS:
        getOpens().clear();
        return;
      case GFPackage.MOD_BODY__JUDGEMENTS:
        getJudgements().clear();
        return;
      case GFPackage.MOD_BODY__FUNCTOR:
        setFunctor((Included)null);
        return;
      case GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION:
        setFunctorInstantiation(FUNCTOR_INSTANTIATION_EDEFAULT);
        return;
      case GFPackage.MOD_BODY__INSTANTIATIONS:
        getInstantiations().clear();
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
      case GFPackage.MOD_BODY__EXTENDS:
        return extends_ != null && !extends_.isEmpty();
      case GFPackage.MOD_BODY__OPENS:
        return opens != null && !opens.isEmpty();
      case GFPackage.MOD_BODY__JUDGEMENTS:
        return judgements != null && !judgements.isEmpty();
      case GFPackage.MOD_BODY__FUNCTOR:
        return functor != null;
      case GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION:
        return functorInstantiation != FUNCTOR_INSTANTIATION_EDEFAULT;
      case GFPackage.MOD_BODY__INSTANTIATIONS:
        return instantiations != null && !instantiations.isEmpty();
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
