/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Patt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isOr <em>Or</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isAnd <em>And</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isMeta <em>Meta</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isTokenList <em>Token List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isWildcard <em>Wildcard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PattImpl extends MinimalEObjectImpl.Container implements Patt
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Patt left;

  /**
   * The default value of the '{@link #isOr() <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOr()
   * @generated
   * @ordered
   */
  protected static final boolean OR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOr() <em>Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOr()
   * @generated
   * @ordered
   */
  protected boolean or = OR_EDEFAULT;

  /**
   * The default value of the '{@link #isAnd() <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnd()
   * @generated
   * @ordered
   */
  protected static final boolean AND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnd() <em>And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnd()
   * @generated
   * @ordered
   */
  protected boolean and = AND_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Patt right;

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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EObject value;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected EObject label;

  /**
   * The default value of the '{@link #isMeta() <em>Meta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMeta()
   * @generated
   * @ordered
   */
  protected static final boolean META_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMeta() <em>Meta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMeta()
   * @generated
   * @ordered
   */
  protected boolean meta = META_EDEFAULT;

  /**
   * The default value of the '{@link #isTokenList() <em>Token List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTokenList()
   * @generated
   * @ordered
   */
  protected static final boolean TOKEN_LIST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTokenList() <em>Token List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTokenList()
   * @generated
   * @ordered
   */
  protected boolean tokenList = TOKEN_LIST_EDEFAULT;

  /**
   * The default value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWildcard()
   * @generated
   * @ordered
   */
  protected static final boolean WILDCARD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWildcard()
   * @generated
   * @ordered
   */
  protected boolean wildcard = WILDCARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PattImpl()
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
    return GFPackage.Literals.PATT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patt getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Patt newLeft, NotificationChain msgs)
  {
    Patt oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PATT__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Patt newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOr()
  {
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOr(boolean newOr)
  {
    boolean oldOr = or;
    or = newOr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__OR, oldOr, or));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnd()
  {
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnd(boolean newAnd)
  {
    boolean oldAnd = and;
    and = newAnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__AND, oldAnd, and));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patt getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Patt newRight, NotificationChain msgs)
  {
    Patt oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PATT__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Patt newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__RIGHT, newRight, newRight));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PATT__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs)
  {
    EObject oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PATT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(EObject newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(EObject newLabel, NotificationChain msgs)
  {
    EObject oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PATT__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(EObject newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMeta()
  {
    return meta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeta(boolean newMeta)
  {
    boolean oldMeta = meta;
    meta = newMeta;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__META, oldMeta, meta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTokenList()
  {
    return tokenList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTokenList(boolean newTokenList)
  {
    boolean oldTokenList = tokenList;
    tokenList = newTokenList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__TOKEN_LIST, oldTokenList, tokenList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWildcard()
  {
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWildcard(boolean newWildcard)
  {
    boolean oldWildcard = wildcard;
    wildcard = newWildcard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__WILDCARD, oldWildcard, wildcard));
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
      case GFPackage.PATT__LEFT:
        return basicSetLeft(null, msgs);
      case GFPackage.PATT__RIGHT:
        return basicSetRight(null, msgs);
      case GFPackage.PATT__NAME:
        return basicSetName(null, msgs);
      case GFPackage.PATT__VALUE:
        return basicSetValue(null, msgs);
      case GFPackage.PATT__LABEL:
        return basicSetLabel(null, msgs);
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
      case GFPackage.PATT__LEFT:
        return getLeft();
      case GFPackage.PATT__OR:
        return isOr();
      case GFPackage.PATT__AND:
        return isAnd();
      case GFPackage.PATT__RIGHT:
        return getRight();
      case GFPackage.PATT__NAME:
        return getName();
      case GFPackage.PATT__VALUE:
        return getValue();
      case GFPackage.PATT__LABEL:
        return getLabel();
      case GFPackage.PATT__META:
        return isMeta();
      case GFPackage.PATT__TOKEN_LIST:
        return isTokenList();
      case GFPackage.PATT__WILDCARD:
        return isWildcard();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GFPackage.PATT__LEFT:
        setLeft((Patt)newValue);
        return;
      case GFPackage.PATT__OR:
        setOr((Boolean)newValue);
        return;
      case GFPackage.PATT__AND:
        setAnd((Boolean)newValue);
        return;
      case GFPackage.PATT__RIGHT:
        setRight((Patt)newValue);
        return;
      case GFPackage.PATT__NAME:
        setName((Ident)newValue);
        return;
      case GFPackage.PATT__VALUE:
        setValue((EObject)newValue);
        return;
      case GFPackage.PATT__LABEL:
        setLabel((EObject)newValue);
        return;
      case GFPackage.PATT__META:
        setMeta((Boolean)newValue);
        return;
      case GFPackage.PATT__TOKEN_LIST:
        setTokenList((Boolean)newValue);
        return;
      case GFPackage.PATT__WILDCARD:
        setWildcard((Boolean)newValue);
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
      case GFPackage.PATT__LEFT:
        setLeft((Patt)null);
        return;
      case GFPackage.PATT__OR:
        setOr(OR_EDEFAULT);
        return;
      case GFPackage.PATT__AND:
        setAnd(AND_EDEFAULT);
        return;
      case GFPackage.PATT__RIGHT:
        setRight((Patt)null);
        return;
      case GFPackage.PATT__NAME:
        setName((Ident)null);
        return;
      case GFPackage.PATT__VALUE:
        setValue((EObject)null);
        return;
      case GFPackage.PATT__LABEL:
        setLabel((EObject)null);
        return;
      case GFPackage.PATT__META:
        setMeta(META_EDEFAULT);
        return;
      case GFPackage.PATT__TOKEN_LIST:
        setTokenList(TOKEN_LIST_EDEFAULT);
        return;
      case GFPackage.PATT__WILDCARD:
        setWildcard(WILDCARD_EDEFAULT);
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
      case GFPackage.PATT__LEFT:
        return left != null;
      case GFPackage.PATT__OR:
        return or != OR_EDEFAULT;
      case GFPackage.PATT__AND:
        return and != AND_EDEFAULT;
      case GFPackage.PATT__RIGHT:
        return right != null;
      case GFPackage.PATT__NAME:
        return name != null;
      case GFPackage.PATT__VALUE:
        return value != null;
      case GFPackage.PATT__LABEL:
        return label != null;
      case GFPackage.PATT__META:
        return meta != META_EDEFAULT;
      case GFPackage.PATT__TOKEN_LIST:
        return tokenList != TOKEN_LIST_EDEFAULT;
      case GFPackage.PATT__WILDCARD:
        return wildcard != WILDCARD_EDEFAULT;
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
    result.append(" (or: ");
    result.append(or);
    result.append(", and: ");
    result.append(and);
    result.append(", meta: ");
    result.append(meta);
    result.append(", tokenList: ");
    result.append(tokenList);
    result.append(", wildcard: ");
    result.append(wildcard);
    result.append(')');
    return result.toString();
  }

} //PattImpl
