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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.grammaticalframework.eclipse.gF.Altern;
import org.grammaticalframework.eclipse.gF.DDecl;
import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.Exps;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.Label;
import org.grammaticalframework.eclipse.gF.ListBind;
import org.grammaticalframework.eclipse.gF.ListCase;
import org.grammaticalframework.eclipse.gF.ListExp;
import org.grammaticalframework.eclipse.gF.ListLocDef;
import org.grammaticalframework.eclipse.gF.ListTupleComp;
import org.grammaticalframework.eclipse.gF.Patt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getBindList <em>Bind List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getE <em>E</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getDefList <em>Def List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getCaseList <em>Case List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getExpList <em>Exp List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getAlts <em>Alts</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getInner <em>Inner</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#isSort <em>Sort</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#isString <em>String</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#isInteger <em>Integer</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#isDouble <em>Double</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#isEmptyString <em>Empty String</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#isListCat <em>List Cat</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getList <em>List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#isRecord <em>Record</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#isTuple <em>Tuple</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getTupleList <em>Tuple List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getV <em>V</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.ExpImpl#isIdentity <em>Identity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpImpl extends PattImpl implements Exp
{
  /**
   * The cached value of the '{@link #getBindList() <em>Bind List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindList()
   * @generated
   * @ordered
   */
  protected ListBind bindList;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected Exp e;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected Exp decl;

  /**
   * The cached value of the '{@link #getDefList() <em>Def List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefList()
   * @generated
   * @ordered
   */
  protected ListLocDef defList;

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
   * The cached value of the '{@link #getArgType() <em>Arg Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgType()
   * @generated
   * @ordered
   */
  protected Exp argType;

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
   * The cached value of the '{@link #getAlts() <em>Alts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlts()
   * @generated
   * @ordered
   */
  protected EList<Altern> alts;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected Patt pattern;

  /**
   * The cached value of the '{@link #getInner() <em>Inner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInner()
   * @generated
   * @ordered
   */
  protected Exp inner;

  /**
   * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabels()
   * @generated
   * @ordered
   */
  protected EList<Label> labels;

  /**
   * The default value of the '{@link #isSort() <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSort()
   * @generated
   * @ordered
   */
  protected static final boolean SORT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSort() <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSort()
   * @generated
   * @ordered
   */
  protected boolean sort = SORT_EDEFAULT;

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
   * The default value of the '{@link #isEmptyString() <em>Empty String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyString()
   * @generated
   * @ordered
   */
  protected static final boolean EMPTY_STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEmptyString() <em>Empty String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyString()
   * @generated
   * @ordered
   */
  protected boolean emptyString = EMPTY_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #isListCat() <em>List Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isListCat()
   * @generated
   * @ordered
   */
  protected static final boolean LIST_CAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isListCat() <em>List Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isListCat()
   * @generated
   * @ordered
   */
  protected boolean listCat = LIST_CAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected Ident category;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected Exps list;

  /**
   * The default value of the '{@link #isRecord() <em>Record</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRecord()
   * @generated
   * @ordered
   */
  protected static final boolean RECORD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRecord() <em>Record</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRecord()
   * @generated
   * @ordered
   */
  protected boolean record = RECORD_EDEFAULT;

  /**
   * The default value of the '{@link #isTuple() <em>Tuple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTuple()
   * @generated
   * @ordered
   */
  protected static final boolean TUPLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTuple() <em>Tuple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTuple()
   * @generated
   * @ordered
   */
  protected boolean tuple = TUPLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTupleList() <em>Tuple List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTupleList()
   * @generated
   * @ordered
   */
  protected ListTupleComp tupleList;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected Exp v;

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
   * The default value of the '{@link #isIdentity() <em>Identity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIdentity()
   * @generated
   * @ordered
   */
  protected static final boolean IDENTITY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIdentity() <em>Identity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIdentity()
   * @generated
   * @ordered
   */
  protected boolean identity = IDENTITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpImpl()
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
    return GFPackage.Literals.EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListBind getBindList()
  {
    return bindList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBindList(ListBind newBindList, NotificationChain msgs)
  {
    ListBind oldBindList = bindList;
    bindList = newBindList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__BIND_LIST, oldBindList, newBindList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindList(ListBind newBindList)
  {
    if (newBindList != bindList)
    {
      NotificationChain msgs = null;
      if (bindList != null)
        msgs = ((InternalEObject)bindList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__BIND_LIST, null, msgs);
      if (newBindList != null)
        msgs = ((InternalEObject)newBindList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__BIND_LIST, null, msgs);
      msgs = basicSetBindList(newBindList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__BIND_LIST, newBindList, newBindList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(Exp newE, NotificationChain msgs)
  {
    Exp oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(Exp newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getDecl()
  {
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecl(Exp newDecl, NotificationChain msgs)
  {
    Exp oldDecl = decl;
    decl = newDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__DECL, oldDecl, newDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecl(Exp newDecl)
  {
    if (newDecl != decl)
    {
      NotificationChain msgs = null;
      if (decl != null)
        msgs = ((InternalEObject)decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__DECL, null, msgs);
      if (newDecl != null)
        msgs = ((InternalEObject)newDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__DECL, null, msgs);
      msgs = basicSetDecl(newDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__DECL, newDecl, newDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListLocDef getDefList()
  {
    return defList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefList(ListLocDef newDefList, NotificationChain msgs)
  {
    ListLocDef oldDefList = defList;
    defList = newDefList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__DEF_LIST, oldDefList, newDefList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefList(ListLocDef newDefList)
  {
    if (newDefList != defList)
    {
      NotificationChain msgs = null;
      if (defList != null)
        msgs = ((InternalEObject)defList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__DEF_LIST, null, msgs);
      if (newDefList != null)
        msgs = ((InternalEObject)newDefList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__DEF_LIST, null, msgs);
      msgs = basicSetDefList(newDefList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__DEF_LIST, newDefList, newDefList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__CASE_LIST, oldCaseList, newCaseList);
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
        msgs = ((InternalEObject)caseList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__CASE_LIST, null, msgs);
      if (newCaseList != null)
        msgs = ((InternalEObject)newCaseList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__CASE_LIST, null, msgs);
      msgs = basicSetCaseList(newCaseList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__CASE_LIST, newCaseList, newCaseList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getArgType()
  {
    return argType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgType(Exp newArgType, NotificationChain msgs)
  {
    Exp oldArgType = argType;
    argType = newArgType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__ARG_TYPE, oldArgType, newArgType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgType(Exp newArgType)
  {
    if (newArgType != argType)
    {
      NotificationChain msgs = null;
      if (argType != null)
        msgs = ((InternalEObject)argType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__ARG_TYPE, null, msgs);
      if (newArgType != null)
        msgs = ((InternalEObject)newArgType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__ARG_TYPE, null, msgs);
      msgs = basicSetArgType(newArgType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__ARG_TYPE, newArgType, newArgType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__EXP_LIST, oldExpList, newExpList);
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
        msgs = ((InternalEObject)expList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__EXP_LIST, null, msgs);
      if (newExpList != null)
        msgs = ((InternalEObject)newExpList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__EXP_LIST, null, msgs);
      msgs = basicSetExpList(newExpList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__EXP_LIST, newExpList, newExpList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__CASE_OF, oldCaseOf, newCaseOf);
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
        msgs = ((InternalEObject)caseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__CASE_OF, null, msgs);
      if (newCaseOf != null)
        msgs = ((InternalEObject)newCaseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__CASE_OF, null, msgs);
      msgs = basicSetCaseOf(newCaseOf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__CASE_OF, newCaseOf, newCaseOf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Altern> getAlts()
  {
    if (alts == null)
    {
      alts = new EObjectContainmentEList<Altern>(Altern.class, this, GFPackage.EXP__ALTS);
    }
    return alts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Patt getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(Patt newPattern, NotificationChain msgs)
  {
    Patt oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__PATTERN, oldPattern, newPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(Patt newPattern)
  {
    if (newPattern != pattern)
    {
      NotificationChain msgs = null;
      if (pattern != null)
        msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__PATTERN, null, msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__PATTERN, null, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__PATTERN, newPattern, newPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getInner()
  {
    return inner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInner(Exp newInner, NotificationChain msgs)
  {
    Exp oldInner = inner;
    inner = newInner;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__INNER, oldInner, newInner);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInner(Exp newInner)
  {
    if (newInner != inner)
    {
      NotificationChain msgs = null;
      if (inner != null)
        msgs = ((InternalEObject)inner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__INNER, null, msgs);
      if (newInner != null)
        msgs = ((InternalEObject)newInner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__INNER, null, msgs);
      msgs = basicSetInner(newInner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__INNER, newInner, newInner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Label> getLabels()
  {
    if (labels == null)
    {
      labels = new EObjectContainmentEList<Label>(Label.class, this, GFPackage.EXP__LABELS);
    }
    return labels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSort()
  {
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSort(boolean newSort)
  {
    boolean oldSort = sort;
    sort = newSort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__SORT, oldSort, sort));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__STRING, oldString, string));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__INTEGER, oldInteger, integer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__DOUBLE, oldDouble, double_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEmptyString()
  {
    return emptyString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptyString(boolean newEmptyString)
  {
    boolean oldEmptyString = emptyString;
    emptyString = newEmptyString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__EMPTY_STRING, oldEmptyString, emptyString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isListCat()
  {
    return listCat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListCat(boolean newListCat)
  {
    boolean oldListCat = listCat;
    listCat = newListCat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__LIST_CAT, oldListCat, listCat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident getCategory()
  {
    if (category != null && category.eIsProxy())
    {
      InternalEObject oldCategory = (InternalEObject)category;
      category = (Ident)eResolveProxy(oldCategory);
      if (category != oldCategory)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GFPackage.EXP__CATEGORY, oldCategory, category));
      }
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ident basicGetCategory()
  {
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCategory(Ident newCategory)
  {
    Ident oldCategory = category;
    category = newCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__CATEGORY, oldCategory, category));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exps getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList(Exps newList, NotificationChain msgs)
  {
    Exps oldList = list;
    list = newList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__LIST, oldList, newList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(Exps newList)
  {
    if (newList != list)
    {
      NotificationChain msgs = null;
      if (list != null)
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__LIST, newList, newList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRecord()
  {
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecord(boolean newRecord)
  {
    boolean oldRecord = record;
    record = newRecord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__RECORD, oldRecord, record));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTuple()
  {
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTuple(boolean newTuple)
  {
    boolean oldTuple = tuple;
    tuple = newTuple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__TUPLE, oldTuple, tuple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListTupleComp getTupleList()
  {
    return tupleList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTupleList(ListTupleComp newTupleList, NotificationChain msgs)
  {
    ListTupleComp oldTupleList = tupleList;
    tupleList = newTupleList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__TUPLE_LIST, oldTupleList, newTupleList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTupleList(ListTupleComp newTupleList)
  {
    if (newTupleList != tupleList)
    {
      NotificationChain msgs = null;
      if (tupleList != null)
        msgs = ((InternalEObject)tupleList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__TUPLE_LIST, null, msgs);
      if (newTupleList != null)
        msgs = ((InternalEObject)newTupleList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__TUPLE_LIST, null, msgs);
      msgs = basicSetTupleList(newTupleList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__TUPLE_LIST, newTupleList, newTupleList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(Exp newV, NotificationChain msgs)
  {
    Exp oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(Exp newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__V, newV, newV));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIdentity()
  {
    return identity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentity(boolean newIdentity)
  {
    boolean oldIdentity = identity;
    identity = newIdentity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP__IDENTITY, oldIdentity, identity));
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
      case GFPackage.EXP__BIND_LIST:
        return basicSetBindList(null, msgs);
      case GFPackage.EXP__E:
        return basicSetE(null, msgs);
      case GFPackage.EXP__DECL:
        return basicSetDecl(null, msgs);
      case GFPackage.EXP__DEF_LIST:
        return basicSetDefList(null, msgs);
      case GFPackage.EXP__CASE_LIST:
        return basicSetCaseList(null, msgs);
      case GFPackage.EXP__ARG_TYPE:
        return basicSetArgType(null, msgs);
      case GFPackage.EXP__EXP_LIST:
        return basicSetExpList(null, msgs);
      case GFPackage.EXP__CASE_OF:
        return basicSetCaseOf(null, msgs);
      case GFPackage.EXP__ALTS:
        return ((InternalEList<?>)getAlts()).basicRemove(otherEnd, msgs);
      case GFPackage.EXP__PATTERN:
        return basicSetPattern(null, msgs);
      case GFPackage.EXP__INNER:
        return basicSetInner(null, msgs);
      case GFPackage.EXP__LABELS:
        return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
      case GFPackage.EXP__LIST:
        return basicSetList(null, msgs);
      case GFPackage.EXP__TUPLE_LIST:
        return basicSetTupleList(null, msgs);
      case GFPackage.EXP__V:
        return basicSetV(null, msgs);
      case GFPackage.EXP__TYPE:
        return basicSetType(null, msgs);
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
      case GFPackage.EXP__BIND_LIST:
        return getBindList();
      case GFPackage.EXP__E:
        return getE();
      case GFPackage.EXP__DECL:
        return getDecl();
      case GFPackage.EXP__DEF_LIST:
        return getDefList();
      case GFPackage.EXP__CASE_LIST:
        return getCaseList();
      case GFPackage.EXP__ARG_TYPE:
        return getArgType();
      case GFPackage.EXP__EXP_LIST:
        return getExpList();
      case GFPackage.EXP__CASE_OF:
        return getCaseOf();
      case GFPackage.EXP__ALTS:
        return getAlts();
      case GFPackage.EXP__PATTERN:
        return getPattern();
      case GFPackage.EXP__INNER:
        return getInner();
      case GFPackage.EXP__LABELS:
        return getLabels();
      case GFPackage.EXP__SORT:
        return isSort();
      case GFPackage.EXP__STRING:
        return isString();
      case GFPackage.EXP__INTEGER:
        return isInteger();
      case GFPackage.EXP__DOUBLE:
        return isDouble();
      case GFPackage.EXP__EMPTY_STRING:
        return isEmptyString();
      case GFPackage.EXP__LIST_CAT:
        return isListCat();
      case GFPackage.EXP__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
      case GFPackage.EXP__LIST:
        return getList();
      case GFPackage.EXP__RECORD:
        return isRecord();
      case GFPackage.EXP__TUPLE:
        return isTuple();
      case GFPackage.EXP__TUPLE_LIST:
        return getTupleList();
      case GFPackage.EXP__V:
        return getV();
      case GFPackage.EXP__TYPE:
        return getType();
      case GFPackage.EXP__IDENTITY:
        return isIdentity();
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
      case GFPackage.EXP__BIND_LIST:
        setBindList((ListBind)newValue);
        return;
      case GFPackage.EXP__E:
        setE((Exp)newValue);
        return;
      case GFPackage.EXP__DECL:
        setDecl((Exp)newValue);
        return;
      case GFPackage.EXP__DEF_LIST:
        setDefList((ListLocDef)newValue);
        return;
      case GFPackage.EXP__CASE_LIST:
        setCaseList((ListCase)newValue);
        return;
      case GFPackage.EXP__ARG_TYPE:
        setArgType((Exp)newValue);
        return;
      case GFPackage.EXP__EXP_LIST:
        setExpList((ListExp)newValue);
        return;
      case GFPackage.EXP__CASE_OF:
        setCaseOf((Exp)newValue);
        return;
      case GFPackage.EXP__ALTS:
        getAlts().clear();
        getAlts().addAll((Collection<? extends Altern>)newValue);
        return;
      case GFPackage.EXP__PATTERN:
        setPattern((Patt)newValue);
        return;
      case GFPackage.EXP__INNER:
        setInner((Exp)newValue);
        return;
      case GFPackage.EXP__LABELS:
        getLabels().clear();
        getLabels().addAll((Collection<? extends Label>)newValue);
        return;
      case GFPackage.EXP__SORT:
        setSort((Boolean)newValue);
        return;
      case GFPackage.EXP__STRING:
        setString((Boolean)newValue);
        return;
      case GFPackage.EXP__INTEGER:
        setInteger((Boolean)newValue);
        return;
      case GFPackage.EXP__DOUBLE:
        setDouble((Boolean)newValue);
        return;
      case GFPackage.EXP__EMPTY_STRING:
        setEmptyString((Boolean)newValue);
        return;
      case GFPackage.EXP__LIST_CAT:
        setListCat((Boolean)newValue);
        return;
      case GFPackage.EXP__CATEGORY:
        setCategory((Ident)newValue);
        return;
      case GFPackage.EXP__LIST:
        setList((Exps)newValue);
        return;
      case GFPackage.EXP__RECORD:
        setRecord((Boolean)newValue);
        return;
      case GFPackage.EXP__TUPLE:
        setTuple((Boolean)newValue);
        return;
      case GFPackage.EXP__TUPLE_LIST:
        setTupleList((ListTupleComp)newValue);
        return;
      case GFPackage.EXP__V:
        setV((Exp)newValue);
        return;
      case GFPackage.EXP__TYPE:
        setType((Exp)newValue);
        return;
      case GFPackage.EXP__IDENTITY:
        setIdentity((Boolean)newValue);
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
      case GFPackage.EXP__BIND_LIST:
        setBindList((ListBind)null);
        return;
      case GFPackage.EXP__E:
        setE((Exp)null);
        return;
      case GFPackage.EXP__DECL:
        setDecl((Exp)null);
        return;
      case GFPackage.EXP__DEF_LIST:
        setDefList((ListLocDef)null);
        return;
      case GFPackage.EXP__CASE_LIST:
        setCaseList((ListCase)null);
        return;
      case GFPackage.EXP__ARG_TYPE:
        setArgType((Exp)null);
        return;
      case GFPackage.EXP__EXP_LIST:
        setExpList((ListExp)null);
        return;
      case GFPackage.EXP__CASE_OF:
        setCaseOf((Exp)null);
        return;
      case GFPackage.EXP__ALTS:
        getAlts().clear();
        return;
      case GFPackage.EXP__PATTERN:
        setPattern((Patt)null);
        return;
      case GFPackage.EXP__INNER:
        setInner((Exp)null);
        return;
      case GFPackage.EXP__LABELS:
        getLabels().clear();
        return;
      case GFPackage.EXP__SORT:
        setSort(SORT_EDEFAULT);
        return;
      case GFPackage.EXP__STRING:
        setString(STRING_EDEFAULT);
        return;
      case GFPackage.EXP__INTEGER:
        setInteger(INTEGER_EDEFAULT);
        return;
      case GFPackage.EXP__DOUBLE:
        setDouble(DOUBLE_EDEFAULT);
        return;
      case GFPackage.EXP__EMPTY_STRING:
        setEmptyString(EMPTY_STRING_EDEFAULT);
        return;
      case GFPackage.EXP__LIST_CAT:
        setListCat(LIST_CAT_EDEFAULT);
        return;
      case GFPackage.EXP__CATEGORY:
        setCategory((Ident)null);
        return;
      case GFPackage.EXP__LIST:
        setList((Exps)null);
        return;
      case GFPackage.EXP__RECORD:
        setRecord(RECORD_EDEFAULT);
        return;
      case GFPackage.EXP__TUPLE:
        setTuple(TUPLE_EDEFAULT);
        return;
      case GFPackage.EXP__TUPLE_LIST:
        setTupleList((ListTupleComp)null);
        return;
      case GFPackage.EXP__V:
        setV((Exp)null);
        return;
      case GFPackage.EXP__TYPE:
        setType((Exp)null);
        return;
      case GFPackage.EXP__IDENTITY:
        setIdentity(IDENTITY_EDEFAULT);
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
      case GFPackage.EXP__BIND_LIST:
        return bindList != null;
      case GFPackage.EXP__E:
        return e != null;
      case GFPackage.EXP__DECL:
        return decl != null;
      case GFPackage.EXP__DEF_LIST:
        return defList != null;
      case GFPackage.EXP__CASE_LIST:
        return caseList != null;
      case GFPackage.EXP__ARG_TYPE:
        return argType != null;
      case GFPackage.EXP__EXP_LIST:
        return expList != null;
      case GFPackage.EXP__CASE_OF:
        return caseOf != null;
      case GFPackage.EXP__ALTS:
        return alts != null && !alts.isEmpty();
      case GFPackage.EXP__PATTERN:
        return pattern != null;
      case GFPackage.EXP__INNER:
        return inner != null;
      case GFPackage.EXP__LABELS:
        return labels != null && !labels.isEmpty();
      case GFPackage.EXP__SORT:
        return sort != SORT_EDEFAULT;
      case GFPackage.EXP__STRING:
        return string != STRING_EDEFAULT;
      case GFPackage.EXP__INTEGER:
        return integer != INTEGER_EDEFAULT;
      case GFPackage.EXP__DOUBLE:
        return double_ != DOUBLE_EDEFAULT;
      case GFPackage.EXP__EMPTY_STRING:
        return emptyString != EMPTY_STRING_EDEFAULT;
      case GFPackage.EXP__LIST_CAT:
        return listCat != LIST_CAT_EDEFAULT;
      case GFPackage.EXP__CATEGORY:
        return category != null;
      case GFPackage.EXP__LIST:
        return list != null;
      case GFPackage.EXP__RECORD:
        return record != RECORD_EDEFAULT;
      case GFPackage.EXP__TUPLE:
        return tuple != TUPLE_EDEFAULT;
      case GFPackage.EXP__TUPLE_LIST:
        return tupleList != null;
      case GFPackage.EXP__V:
        return v != null;
      case GFPackage.EXP__TYPE:
        return type != null;
      case GFPackage.EXP__IDENTITY:
        return identity != IDENTITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == DDecl.class)
    {
      switch (derivedFeatureID)
      {
        case GFPackage.EXP__BIND_LIST: return GFPackage.DDECL__BIND_LIST;
        case GFPackage.EXP__E: return GFPackage.DDECL__E;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == DDecl.class)
    {
      switch (baseFeatureID)
      {
        case GFPackage.DDECL__BIND_LIST: return GFPackage.EXP__BIND_LIST;
        case GFPackage.DDECL__E: return GFPackage.EXP__E;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (sort: ");
    result.append(sort);
    result.append(", string: ");
    result.append(string);
    result.append(", integer: ");
    result.append(integer);
    result.append(", double: ");
    result.append(double_);
    result.append(", emptyString: ");
    result.append(emptyString);
    result.append(", listCat: ");
    result.append(listCat);
    result.append(", record: ");
    result.append(record);
    result.append(", tuple: ");
    result.append(tuple);
    result.append(", identity: ");
    result.append(identity);
    result.append(')');
    return result.toString();
  }

} //ExpImpl
