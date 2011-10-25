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

import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.Exp4;
import org.grammaticalframework.eclipse.gF.Exp5;
import org.grammaticalframework.eclipse.gF.Exp6;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.ListCase;
import org.grammaticalframework.eclipse.gF.ListExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl#getCaseList <em>Case List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl#getExpList <em>Exp List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl#getInner <em>Inner</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp4Impl#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Exp4Impl extends MinimalEObjectImpl.Container implements Exp4
{
  /**
   * The cached value of the '{@link #getCaseList() <em>Case List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseList()
   * @generated
   * @ordered
   */
  protected ListCase caseList;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Exp5> args;

  /**
   * The cached value of the '{@link #getArgType() <em>Arg Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgType()
   * @generated
   * @ordered
   */
  protected Exp6 argType;

  /**
   * The cached value of the '{@link #getExpList() <em>Exp List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpList()
   * @generated
   * @ordered
   */
  protected ListExp expList;

  /**
   * The cached value of the '{@link #getCaseOf() <em>Case Of</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseOf()
   * @generated
   * @ordered
   */
  protected Exp caseOf;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Ident name;

  /**
   * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInner()
   * @generated
   * @ordered
   */
  protected Exp6 inner;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected Exp5 v;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Exp4Impl()
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
    return GFPackage.Literals.EXP4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListCase getCaseList()
  {
    return caseList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseList(ListCase newCaseList, NotificationChain msgs)
  {
    ListCase oldCaseList = caseList;
    caseList = newCaseList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__CASE_LIST, oldCaseList, newCaseList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseList(ListCase newCaseList)
  {
    if (newCaseList != caseList)
    {
      NotificationChain msgs = null;
      if (caseList != null)
        msgs = ((InternalEObject)caseList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__CASE_LIST, null, msgs);
      if (newCaseList != null)
        msgs = ((InternalEObject)newCaseList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__CASE_LIST, null, msgs);
      msgs = basicSetCaseList(newCaseList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__CASE_LIST, newCaseList, newCaseList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Exp5> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<Exp5>(Exp5.class, this, GFPackage.EXP4__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp6 getArgType()
  {
    return argType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgType(Exp6 newArgType, NotificationChain msgs)
  {
    Exp6 oldArgType = argType;
    argType = newArgType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__ARG_TYPE, oldArgType, newArgType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgType(Exp6 newArgType)
  {
    if (newArgType != argType)
    {
      NotificationChain msgs = null;
      if (argType != null)
        msgs = ((InternalEObject)argType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__ARG_TYPE, null, msgs);
      if (newArgType != null)
        msgs = ((InternalEObject)newArgType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__ARG_TYPE, null, msgs);
      msgs = basicSetArgType(newArgType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__ARG_TYPE, newArgType, newArgType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListExp getExpList()
  {
    return expList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpList(ListExp newExpList, NotificationChain msgs)
  {
    ListExp oldExpList = expList;
    expList = newExpList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__EXP_LIST, oldExpList, newExpList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpList(ListExp newExpList)
  {
    if (newExpList != expList)
    {
      NotificationChain msgs = null;
      if (expList != null)
        msgs = ((InternalEObject)expList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__EXP_LIST, null, msgs);
      if (newExpList != null)
        msgs = ((InternalEObject)newExpList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__EXP_LIST, null, msgs);
      msgs = basicSetExpList(newExpList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__EXP_LIST, newExpList, newExpList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getCaseOf()
  {
    return caseOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseOf(Exp newCaseOf, NotificationChain msgs)
  {
    Exp oldCaseOf = caseOf;
    caseOf = newCaseOf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__CASE_OF, oldCaseOf, newCaseOf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseOf(Exp newCaseOf)
  {
    if (newCaseOf != caseOf)
    {
      NotificationChain msgs = null;
      if (caseOf != null)
        msgs = ((InternalEObject)caseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__CASE_OF, null, msgs);
      if (newCaseOf != null)
        msgs = ((InternalEObject)newCaseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__CASE_OF, null, msgs);
      msgs = basicSetCaseOf(newCaseOf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__CASE_OF, newCaseOf, newCaseOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (Ident)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GFPackage.EXP4__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Ident newName)
  {
    Ident oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp6 getInner()
  {
    return inner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInner(Exp6 newInner, NotificationChain msgs)
  {
    Exp6 oldInner = inner;
    inner = newInner;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__INNER, oldInner, newInner);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInner(Exp6 newInner)
  {
    if (newInner != inner)
    {
      NotificationChain msgs = null;
      if (inner != null)
        msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__INNER, null, msgs);
      if (newInner != null)
        msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__INNER, null, msgs);
      msgs = basicSetInner(newInner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__INNER, newInner, newInner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp5 getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(Exp5 newV, NotificationChain msgs)
  {
    Exp5 oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(Exp5 newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP4__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP4__V, newV, newV));
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
      case GFPackage.EXP4__CASE_LIST:
        return basicSetCaseList(null, msgs);
      case GFPackage.EXP4__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case GFPackage.EXP4__ARG_TYPE:
        return basicSetArgType(null, msgs);
      case GFPackage.EXP4__EXP_LIST:
        return basicSetExpList(null, msgs);
      case GFPackage.EXP4__CASE_OF:
        return basicSetCaseOf(null, msgs);
      case GFPackage.EXP4__INNER:
        return basicSetInner(null, msgs);
      case GFPackage.EXP4__V:
        return basicSetV(null, msgs);
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
      case GFPackage.EXP4__CASE_LIST:
        return getCaseList();
      case GFPackage.EXP4__ARGS:
        return getArgs();
      case GFPackage.EXP4__ARG_TYPE:
        return getArgType();
      case GFPackage.EXP4__EXP_LIST:
        return getExpList();
      case GFPackage.EXP4__CASE_OF:
        return getCaseOf();
      case GFPackage.EXP4__NAME:
        if (resolve) return getName();
        return basicGetName();
      case GFPackage.EXP4__INNER:
        return getInner();
      case GFPackage.EXP4__V:
        return getV();
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
      case GFPackage.EXP4__CASE_LIST:
        setCaseList((ListCase)newValue);
        return;
      case GFPackage.EXP4__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Exp5>)newValue);
        return;
      case GFPackage.EXP4__ARG_TYPE:
        setArgType((Exp6)newValue);
        return;
      case GFPackage.EXP4__EXP_LIST:
        setExpList((ListExp)newValue);
        return;
      case GFPackage.EXP4__CASE_OF:
        setCaseOf((Exp)newValue);
        return;
      case GFPackage.EXP4__NAME:
        setName((Ident)newValue);
        return;
      case GFPackage.EXP4__INNER:
        setInner((Exp6)newValue);
        return;
      case GFPackage.EXP4__V:
        setV((Exp5)newValue);
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
      case GFPackage.EXP4__CASE_LIST:
        setCaseList((ListCase)null);
        return;
      case GFPackage.EXP4__ARGS:
        getArgs().clear();
        return;
      case GFPackage.EXP4__ARG_TYPE:
        setArgType((Exp6)null);
        return;
      case GFPackage.EXP4__EXP_LIST:
        setExpList((ListExp)null);
        return;
      case GFPackage.EXP4__CASE_OF:
        setCaseOf((Exp)null);
        return;
      case GFPackage.EXP4__NAME:
        setName((Ident)null);
        return;
      case GFPackage.EXP4__INNER:
        setInner((Exp6)null);
        return;
      case GFPackage.EXP4__V:
        setV((Exp5)null);
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
      case GFPackage.EXP4__CASE_LIST:
        return caseList != null;
      case GFPackage.EXP4__ARGS:
        return args != null && !args.isEmpty();
      case GFPackage.EXP4__ARG_TYPE:
        return argType != null;
      case GFPackage.EXP4__EXP_LIST:
        return expList != null;
      case GFPackage.EXP4__CASE_OF:
        return caseOf != null;
      case GFPackage.EXP4__NAME:
        return name != null;
      case GFPackage.EXP4__INNER:
        return inner != null;
      case GFPackage.EXP4__V:
        return v != null;
    }
    return super.eIsSet(featureID);
  }

} //Exp4Impl
