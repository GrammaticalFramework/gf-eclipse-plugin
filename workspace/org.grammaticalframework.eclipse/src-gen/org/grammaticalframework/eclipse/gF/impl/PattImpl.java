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

import org.grammaticalframework.eclipse.gF.Exp;
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
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getBindTo <em>Bind To</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isInaccessible <em>Inaccessible</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isMeta <em>Meta</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isTokenList <em>Token List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getStr <em>Str</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getPatternName <em>Pattern Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isInteger <em>Integer</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isDouble <em>Double</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.PattImpl#isString <em>String</em>}</li>
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
  protected Ident label;

  /**
   * The cached value of the '{@link #getBindTo() <em>Bind To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindTo()
   * @generated
   * @ordered
   */
  protected Ident bindTo;

  /**
   * The default value of the '{@link #isNegative() <em>Negative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegative()
   * @generated
   * @ordered
   */
  protected static final boolean NEGATIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNegative() <em>Negative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNegative()
   * @generated
   * @ordered
   */
  protected boolean negative = NEGATIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isInaccessible() <em>Inaccessible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInaccessible()
   * @generated
   * @ordered
   */
  protected static final boolean INACCESSIBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInaccessible() <em>Inaccessible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInaccessible()
   * @generated
   * @ordered
   */
  protected boolean inaccessible = INACCESSIBLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected Exp pattern;

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
   * The default value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected static final String STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected String str = STR_EDEFAULT;

  /**
   * The cached value of the '{@link #getPatternName() <em>Pattern Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternName()
   * @generated
   * @ordered
   */
  protected Ident patternName;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Ident ref;

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
   * The default value of the '{@link #isInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInteger()
   * @generated
   * @ordered
   */
  protected static final boolean INTEGER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInteger()
   * @generated
   * @ordered
   */
  protected boolean integer = INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #isDouble() <em>Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDouble()
   * @generated
   * @ordered
   */
  protected static final boolean DOUBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDouble() <em>Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDouble()
   * @generated
   * @ordered
   */
  protected boolean double_ = DOUBLE_EDEFAULT;

  /**
   * The default value of the '{@link #isString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isString()
   * @generated
   * @ordered
   */
  protected static final boolean STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isString()
   * @generated
   * @ordered
   */
  protected boolean string = STRING_EDEFAULT;

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
  public Ident getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(Ident newLabel, NotificationChain msgs)
  {
    Ident oldLabel = label;
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
  public void setLabel(Ident newLabel)
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
  public Ident getBindTo()
  {
    return bindTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBindTo(Ident newBindTo, NotificationChain msgs)
  {
    Ident oldBindTo = bindTo;
    bindTo = newBindTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PATT__BIND_TO, oldBindTo, newBindTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindTo(Ident newBindTo)
  {
    if (newBindTo != bindTo)
    {
      NotificationChain msgs = null;
      if (bindTo != null)
        msgs = ((InternalEObject)bindTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__BIND_TO, null, msgs);
      if (newBindTo != null)
        msgs = ((InternalEObject)newBindTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__BIND_TO, null, msgs);
      msgs = basicSetBindTo(newBindTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__BIND_TO, newBindTo, newBindTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNegative()
  {
    return negative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegative(boolean newNegative)
  {
    boolean oldNegative = negative;
    negative = newNegative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__NEGATIVE, oldNegative, negative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInaccessible()
  {
    return inaccessible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInaccessible(boolean newInaccessible)
  {
    boolean oldInaccessible = inaccessible;
    inaccessible = newInaccessible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__INACCESSIBLE, oldInaccessible, inaccessible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(Exp newPattern, NotificationChain msgs)
  {
    Exp oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PATT__PATTERN, oldPattern, newPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(Exp newPattern)
  {
    if (newPattern != pattern)
    {
      NotificationChain msgs = null;
      if (pattern != null)
        msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__PATTERN, null, msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__PATTERN, null, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__PATTERN, newPattern, newPattern));
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
  public String getStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(String newStr)
  {
    String oldStr = str;
    str = newStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__STR, oldStr, str));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident getPatternName()
  {
    return patternName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatternName(Ident newPatternName, NotificationChain msgs)
  {
    Ident oldPatternName = patternName;
    patternName = newPatternName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.PATT__PATTERN_NAME, oldPatternName, newPatternName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatternName(Ident newPatternName)
  {
    if (newPatternName != patternName)
    {
      NotificationChain msgs = null;
      if (patternName != null)
        msgs = ((InternalEObject)patternName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__PATTERN_NAME, null, msgs);
      if (newPatternName != null)
        msgs = ((InternalEObject)newPatternName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.PATT__PATTERN_NAME, null, msgs);
      msgs = basicSetPatternName(newPatternName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__PATTERN_NAME, newPatternName, newPatternName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (Ident)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GFPackage.PATT__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Ident newRef)
  {
    Ident oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__REF, oldRef, ref));
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
  public boolean isInteger()
  {
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteger(boolean newInteger)
  {
    boolean oldInteger = integer;
    integer = newInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__INTEGER, oldInteger, integer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDouble()
  {
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDouble(boolean newDouble)
  {
    boolean oldDouble = double_;
    double_ = newDouble;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__DOUBLE, oldDouble, double_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(boolean newString)
  {
    boolean oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.PATT__STRING, oldString, string));
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
      case GFPackage.PATT__BIND_TO:
        return basicSetBindTo(null, msgs);
      case GFPackage.PATT__PATTERN:
        return basicSetPattern(null, msgs);
      case GFPackage.PATT__PATTERN_NAME:
        return basicSetPatternName(null, msgs);
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
      case GFPackage.PATT__BIND_TO:
        return getBindTo();
      case GFPackage.PATT__NEGATIVE:
        return isNegative();
      case GFPackage.PATT__INACCESSIBLE:
        return isInaccessible();
      case GFPackage.PATT__PATTERN:
        return getPattern();
      case GFPackage.PATT__META:
        return isMeta();
      case GFPackage.PATT__TOKEN_LIST:
        return isTokenList();
      case GFPackage.PATT__STR:
        return getStr();
      case GFPackage.PATT__PATTERN_NAME:
        return getPatternName();
      case GFPackage.PATT__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case GFPackage.PATT__WILDCARD:
        return isWildcard();
      case GFPackage.PATT__INTEGER:
        return isInteger();
      case GFPackage.PATT__DOUBLE:
        return isDouble();
      case GFPackage.PATT__STRING:
        return isString();
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
        setLabel((Ident)newValue);
        return;
      case GFPackage.PATT__BIND_TO:
        setBindTo((Ident)newValue);
        return;
      case GFPackage.PATT__NEGATIVE:
        setNegative((Boolean)newValue);
        return;
      case GFPackage.PATT__INACCESSIBLE:
        setInaccessible((Boolean)newValue);
        return;
      case GFPackage.PATT__PATTERN:
        setPattern((Exp)newValue);
        return;
      case GFPackage.PATT__META:
        setMeta((Boolean)newValue);
        return;
      case GFPackage.PATT__TOKEN_LIST:
        setTokenList((Boolean)newValue);
        return;
      case GFPackage.PATT__STR:
        setStr((String)newValue);
        return;
      case GFPackage.PATT__PATTERN_NAME:
        setPatternName((Ident)newValue);
        return;
      case GFPackage.PATT__REF:
        setRef((Ident)newValue);
        return;
      case GFPackage.PATT__WILDCARD:
        setWildcard((Boolean)newValue);
        return;
      case GFPackage.PATT__INTEGER:
        setInteger((Boolean)newValue);
        return;
      case GFPackage.PATT__DOUBLE:
        setDouble((Boolean)newValue);
        return;
      case GFPackage.PATT__STRING:
        setString((Boolean)newValue);
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
        setLabel((Ident)null);
        return;
      case GFPackage.PATT__BIND_TO:
        setBindTo((Ident)null);
        return;
      case GFPackage.PATT__NEGATIVE:
        setNegative(NEGATIVE_EDEFAULT);
        return;
      case GFPackage.PATT__INACCESSIBLE:
        setInaccessible(INACCESSIBLE_EDEFAULT);
        return;
      case GFPackage.PATT__PATTERN:
        setPattern((Exp)null);
        return;
      case GFPackage.PATT__META:
        setMeta(META_EDEFAULT);
        return;
      case GFPackage.PATT__TOKEN_LIST:
        setTokenList(TOKEN_LIST_EDEFAULT);
        return;
      case GFPackage.PATT__STR:
        setStr(STR_EDEFAULT);
        return;
      case GFPackage.PATT__PATTERN_NAME:
        setPatternName((Ident)null);
        return;
      case GFPackage.PATT__REF:
        setRef((Ident)null);
        return;
      case GFPackage.PATT__WILDCARD:
        setWildcard(WILDCARD_EDEFAULT);
        return;
      case GFPackage.PATT__INTEGER:
        setInteger(INTEGER_EDEFAULT);
        return;
      case GFPackage.PATT__DOUBLE:
        setDouble(DOUBLE_EDEFAULT);
        return;
      case GFPackage.PATT__STRING:
        setString(STRING_EDEFAULT);
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
      case GFPackage.PATT__BIND_TO:
        return bindTo != null;
      case GFPackage.PATT__NEGATIVE:
        return negative != NEGATIVE_EDEFAULT;
      case GFPackage.PATT__INACCESSIBLE:
        return inaccessible != INACCESSIBLE_EDEFAULT;
      case GFPackage.PATT__PATTERN:
        return pattern != null;
      case GFPackage.PATT__META:
        return meta != META_EDEFAULT;
      case GFPackage.PATT__TOKEN_LIST:
        return tokenList != TOKEN_LIST_EDEFAULT;
      case GFPackage.PATT__STR:
        return STR_EDEFAULT == null ? str != null : !STR_EDEFAULT.equals(str);
      case GFPackage.PATT__PATTERN_NAME:
        return patternName != null;
      case GFPackage.PATT__REF:
        return ref != null;
      case GFPackage.PATT__WILDCARD:
        return wildcard != WILDCARD_EDEFAULT;
      case GFPackage.PATT__INTEGER:
        return integer != INTEGER_EDEFAULT;
      case GFPackage.PATT__DOUBLE:
        return double_ != DOUBLE_EDEFAULT;
      case GFPackage.PATT__STRING:
        return string != STRING_EDEFAULT;
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
    result.append(", negative: ");
    result.append(negative);
    result.append(", inaccessible: ");
    result.append(inaccessible);
    result.append(", meta: ");
    result.append(meta);
    result.append(", tokenList: ");
    result.append(tokenList);
    result.append(", str: ");
    result.append(str);
    result.append(", wildcard: ");
    result.append(wildcard);
    result.append(", integer: ");
    result.append(integer);
    result.append(", double: ");
    result.append(double_);
    result.append(", string: ");
    result.append(string);
    result.append(')');
    return result.toString();
  }

} //PattImpl
