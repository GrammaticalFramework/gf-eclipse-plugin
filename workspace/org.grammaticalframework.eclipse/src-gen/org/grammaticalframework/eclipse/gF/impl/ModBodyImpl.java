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
import org.grammaticalframework.eclipse.gF.Inst;
import org.grammaticalframework.eclipse.gF.ModBody;
import org.grammaticalframework.eclipse.gF.ModContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mod Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ModBodyImpl#getContent <em>Content</em>}</li>
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
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected ModContent content;

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
  protected EList<Inst> instantiations;

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
  public ModContent getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(ModContent newContent, NotificationChain msgs)
  {
    ModContent oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__CONTENT, oldContent, newContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(ModContent newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.MOD_BODY__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.MOD_BODY__CONTENT, newContent, newContent));
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
  public EList<Inst> getInstantiations()
  {
    if (instantiations == null)
    {
      instantiations = new EObjectContainmentEList<Inst>(Inst.class, this, GFPackage.MOD_BODY__INSTANTIATIONS);
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
      case GFPackage.MOD_BODY__CONTENT:
        return basicSetContent(null, msgs);
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
      case GFPackage.MOD_BODY__CONTENT:
        return getContent();
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
      case GFPackage.MOD_BODY__CONTENT:
        setContent((ModContent)newValue);
        return;
      case GFPackage.MOD_BODY__FUNCTOR:
        setFunctor((Included)newValue);
        return;
      case GFPackage.MOD_BODY__FUNCTOR_INSTANTIATION:
        setFunctorInstantiation((Boolean)newValue);
        return;
      case GFPackage.MOD_BODY__INSTANTIATIONS:
        getInstantiations().clear();
        getInstantiations().addAll((Collection<? extends Inst>)newValue);
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
      case GFPackage.MOD_BODY__CONTENT:
        setContent((ModContent)null);
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
      case GFPackage.MOD_BODY__CONTENT:
        return content != null;
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
