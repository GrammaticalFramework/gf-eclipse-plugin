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

import org.grammaticalframework.eclipse.gF.DefDef;
import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.ListPatt;
import org.grammaticalframework.eclipse.gF.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Def Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.DefDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.DefDefImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.DefDefImpl#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefDefImpl extends MinimalEObjectImpl.Container implements DefDef
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EList<Name> name;

  /**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected Exp definition;

  /**
   * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatterns()
   * @generated
   * @ordered
   */
  protected ListPatt patterns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefDefImpl()
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
    return GFPackage.Literals.DEF_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Name> getName()
  {
    if (name == null)
    {
      name = new EObjectContainmentEList<Name>(Name.class, this, GFPackage.DEF_DEF__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getDefinition()
  {
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefinition(Exp newDefinition, NotificationChain msgs)
  {
    Exp oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.DEF_DEF__DEFINITION, oldDefinition, newDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinition(Exp newDefinition)
  {
    if (newDefinition != definition)
    {
      NotificationChain msgs = null;
      if (definition != null)
        msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.DEF_DEF__DEFINITION, null, msgs);
      if (newDefinition != null)
        msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.DEF_DEF__DEFINITION, null, msgs);
      msgs = basicSetDefinition(newDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.DEF_DEF__DEFINITION, newDefinition, newDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListPatt getPatterns()
  {
    return patterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatterns(ListPatt newPatterns, NotificationChain msgs)
  {
    ListPatt oldPatterns = patterns;
    patterns = newPatterns;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.DEF_DEF__PATTERNS, oldPatterns, newPatterns);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatterns(ListPatt newPatterns)
  {
    if (newPatterns != patterns)
    {
      NotificationChain msgs = null;
      if (patterns != null)
        msgs = ((InternalEObject)patterns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.DEF_DEF__PATTERNS, null, msgs);
      if (newPatterns != null)
        msgs = ((InternalEObject)newPatterns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.DEF_DEF__PATTERNS, null, msgs);
      msgs = basicSetPatterns(newPatterns, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.DEF_DEF__PATTERNS, newPatterns, newPatterns));
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
      case GFPackage.DEF_DEF__NAME:
        return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
      case GFPackage.DEF_DEF__DEFINITION:
        return basicSetDefinition(null, msgs);
      case GFPackage.DEF_DEF__PATTERNS:
        return basicSetPatterns(null, msgs);
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
      case GFPackage.DEF_DEF__NAME:
        return getName();
      case GFPackage.DEF_DEF__DEFINITION:
        return getDefinition();
      case GFPackage.DEF_DEF__PATTERNS:
        return getPatterns();
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
      case GFPackage.DEF_DEF__NAME:
        getName().clear();
        getName().addAll((Collection<? extends Name>)newValue);
        return;
      case GFPackage.DEF_DEF__DEFINITION:
        setDefinition((Exp)newValue);
        return;
      case GFPackage.DEF_DEF__PATTERNS:
        setPatterns((ListPatt)newValue);
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
      case GFPackage.DEF_DEF__NAME:
        getName().clear();
        return;
      case GFPackage.DEF_DEF__DEFINITION:
        setDefinition((Exp)null);
        return;
      case GFPackage.DEF_DEF__PATTERNS:
        setPatterns((ListPatt)null);
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
      case GFPackage.DEF_DEF__NAME:
        return name != null && !name.isEmpty();
      case GFPackage.DEF_DEF__DEFINITION:
        return definition != null;
      case GFPackage.DEF_DEF__PATTERNS:
        return patterns != null;
    }
    return super.eIsSet(featureID);
  }

} //DefDefImpl
