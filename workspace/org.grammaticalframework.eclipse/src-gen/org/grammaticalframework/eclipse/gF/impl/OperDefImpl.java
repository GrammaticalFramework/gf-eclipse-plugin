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

import org.grammaticalframework.eclipse.gF.Arg;
import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Name;
import org.grammaticalframework.eclipse.gF.OperDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oper Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.OperDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.OperDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.OperDefImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.OperDefImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.OperDefImpl#isOverload <em>Overload</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.OperDefImpl#getOverloads <em>Overloads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperDefImpl extends MinimalEObjectImpl.Container implements OperDef
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Exp type;

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
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Arg> args;

  /**
   * The default value of the '{@link #isOverload() <em>Overload</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverload()
   * @generated
   * @ordered
   */
  protected static final boolean OVERLOAD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOverload() <em>Overload</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverload()
   * @generated
   * @ordered
   */
  protected boolean overload = OVERLOAD_EDEFAULT;

  /**
   * The cached value of the '{@link #getOverloads() <em>Overloads</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverloads()
   * @generated
   * @ordered
   */
  protected EList<OperDef> overloads;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperDefImpl()
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
    return GFPackage.Literals.OPER_DEF;
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
      name = new EObjectContainmentEList<Name>(Name.class, this, GFPackage.OPER_DEF__NAME);
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Exp newType, NotificationChain msgs)
  {
    Exp oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.OPER_DEF__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Exp newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.OPER_DEF__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.OPER_DEF__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.OPER_DEF__TYPE, newType, newType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.OPER_DEF__DEFINITION, oldDefinition, newDefinition);
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
        msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.OPER_DEF__DEFINITION, null, msgs);
      if (newDefinition != null)
        msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.OPER_DEF__DEFINITION, null, msgs);
      msgs = basicSetDefinition(newDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.OPER_DEF__DEFINITION, newDefinition, newDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Arg> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<Arg>(Arg.class, this, GFPackage.OPER_DEF__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOverload()
  {
    return overload;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverload(boolean newOverload)
  {
    boolean oldOverload = overload;
    overload = newOverload;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.OPER_DEF__OVERLOAD, oldOverload, overload));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperDef> getOverloads()
  {
    if (overloads == null)
    {
      overloads = new EObjectContainmentEList<OperDef>(OperDef.class, this, GFPackage.OPER_DEF__OVERLOADS);
    }
    return overloads;
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
      case GFPackage.OPER_DEF__NAME:
        return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
      case GFPackage.OPER_DEF__TYPE:
        return basicSetType(null, msgs);
      case GFPackage.OPER_DEF__DEFINITION:
        return basicSetDefinition(null, msgs);
      case GFPackage.OPER_DEF__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
      case GFPackage.OPER_DEF__OVERLOADS:
        return ((InternalEList<?>)getOverloads()).basicRemove(otherEnd, msgs);
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
      case GFPackage.OPER_DEF__NAME:
        return getName();
      case GFPackage.OPER_DEF__TYPE:
        return getType();
      case GFPackage.OPER_DEF__DEFINITION:
        return getDefinition();
      case GFPackage.OPER_DEF__ARGS:
        return getArgs();
      case GFPackage.OPER_DEF__OVERLOAD:
        return isOverload();
      case GFPackage.OPER_DEF__OVERLOADS:
        return getOverloads();
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
      case GFPackage.OPER_DEF__NAME:
        getName().clear();
        getName().addAll((Collection<? extends Name>)newValue);
        return;
      case GFPackage.OPER_DEF__TYPE:
        setType((Exp)newValue);
        return;
      case GFPackage.OPER_DEF__DEFINITION:
        setDefinition((Exp)newValue);
        return;
      case GFPackage.OPER_DEF__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Arg>)newValue);
        return;
      case GFPackage.OPER_DEF__OVERLOAD:
        setOverload((Boolean)newValue);
        return;
      case GFPackage.OPER_DEF__OVERLOADS:
        getOverloads().clear();
        getOverloads().addAll((Collection<? extends OperDef>)newValue);
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
      case GFPackage.OPER_DEF__NAME:
        getName().clear();
        return;
      case GFPackage.OPER_DEF__TYPE:
        setType((Exp)null);
        return;
      case GFPackage.OPER_DEF__DEFINITION:
        setDefinition((Exp)null);
        return;
      case GFPackage.OPER_DEF__ARGS:
        getArgs().clear();
        return;
      case GFPackage.OPER_DEF__OVERLOAD:
        setOverload(OVERLOAD_EDEFAULT);
        return;
      case GFPackage.OPER_DEF__OVERLOADS:
        getOverloads().clear();
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
      case GFPackage.OPER_DEF__NAME:
        return name != null && !name.isEmpty();
      case GFPackage.OPER_DEF__TYPE:
        return type != null;
      case GFPackage.OPER_DEF__DEFINITION:
        return definition != null;
      case GFPackage.OPER_DEF__ARGS:
        return args != null && !args.isEmpty();
      case GFPackage.OPER_DEF__OVERLOAD:
        return overload != OVERLOAD_EDEFAULT;
      case GFPackage.OPER_DEF__OVERLOADS:
        return overloads != null && !overloads.isEmpty();
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
    result.append(" (overload: ");
    result.append(overload);
    result.append(')');
    return result.toString();
  }

} //OperDefImpl
