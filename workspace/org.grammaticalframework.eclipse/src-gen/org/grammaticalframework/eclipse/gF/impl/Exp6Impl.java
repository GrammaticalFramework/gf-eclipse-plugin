/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.grammaticalframework.eclipse.gF.Exp;
import org.grammaticalframework.eclipse.gF.Exp6;
import org.grammaticalframework.eclipse.gF.Exps;
import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.Ident;
import org.grammaticalframework.eclipse.gF.ListLocDef;
import org.grammaticalframework.eclipse.gF.ListTupleComp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isSort <em>Sort</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isBuiltInCat <em>Built In Cat</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isString <em>String</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isInteger <em>Integer</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isDouble <em>Double</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isMeta <em>Meta</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isEmptyString <em>Empty String</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isData <em>Data</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isListCat <em>List Cat</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#getList <em>List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isTokenList <em>Token List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isRecord <em>Record</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#getDefList <em>Def List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isTuple <em>Tuple</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#getTupleList <em>Tuple List</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#getV <em>V</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#getType <em>Type</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp6Impl#isIdentity <em>Identity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Exp6Impl extends DDeclImpl implements Exp6
{
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
   * The default value of the '{@link #isBuiltInCat() <em>Built In Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBuiltInCat()
   * @generated
   * @ordered
   */
  protected static final boolean BUILT_IN_CAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBuiltInCat() <em>Built In Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBuiltInCat()
   * @generated
   * @ordered
   */
  protected boolean builtInCat = BUILT_IN_CAT_EDEFAULT;

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
   * The default value of the '{@link #isData() <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isData()
   * @generated
   * @ordered
   */
  protected static final boolean DATA_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isData() <em>Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isData()
   * @generated
   * @ordered
   */
  protected boolean data = DATA_EDEFAULT;

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
   * The cached value of the '{@link #getDefList() <em>Def List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefList()
   * @generated
   * @ordered
   */
  protected ListLocDef defList;

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
  protected Exp6Impl()
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
    return GFPackage.Literals.EXP6;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GFPackage.EXP6__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__SORT, oldSort, sort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBuiltInCat()
  {
    return builtInCat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuiltInCat(boolean newBuiltInCat)
  {
    boolean oldBuiltInCat = builtInCat;
    builtInCat = newBuiltInCat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__BUILT_IN_CAT, oldBuiltInCat, builtInCat));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__STRING, oldString, string));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__INTEGER, oldInteger, integer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__DOUBLE, oldDouble, double_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__META, oldMeta, meta));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__EMPTY_STRING, oldEmptyString, emptyString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData(boolean newData)
  {
    boolean oldData = data;
    data = newData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__DATA, oldData, data));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__LIST_CAT, oldListCat, listCat));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GFPackage.EXP6__CATEGORY, oldCategory, category));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__CATEGORY, oldCategory, category));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__LIST, oldList, newList);
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
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__LIST, newList, newList));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__TOKEN_LIST, oldTokenList, tokenList));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__RECORD, oldRecord, record));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__DEF_LIST, oldDefList, newDefList);
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
        msgs = ((InternalEObject)defList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__DEF_LIST, null, msgs);
      if (newDefList != null)
        msgs = ((InternalEObject)newDefList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__DEF_LIST, null, msgs);
      msgs = basicSetDefList(newDefList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__DEF_LIST, newDefList, newDefList));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__TUPLE, oldTuple, tuple));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__TUPLE_LIST, oldTupleList, newTupleList);
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
        msgs = ((InternalEObject)tupleList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__TUPLE_LIST, null, msgs);
      if (newTupleList != null)
        msgs = ((InternalEObject)newTupleList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__TUPLE_LIST, null, msgs);
      msgs = basicSetTupleList(newTupleList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__TUPLE_LIST, newTupleList, newTupleList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__V, oldV, newV);
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
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__V, newV, newV));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GFPackage.EXP6__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP6__IDENTITY, oldIdentity, identity));
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
      case GFPackage.EXP6__LIST:
        return basicSetList(null, msgs);
      case GFPackage.EXP6__DEF_LIST:
        return basicSetDefList(null, msgs);
      case GFPackage.EXP6__TUPLE_LIST:
        return basicSetTupleList(null, msgs);
      case GFPackage.EXP6__V:
        return basicSetV(null, msgs);
      case GFPackage.EXP6__TYPE:
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
      case GFPackage.EXP6__NAME:
        if (resolve) return getName();
        return basicGetName();
      case GFPackage.EXP6__SORT:
        return isSort();
      case GFPackage.EXP6__BUILT_IN_CAT:
        return isBuiltInCat();
      case GFPackage.EXP6__STRING:
        return isString();
      case GFPackage.EXP6__INTEGER:
        return isInteger();
      case GFPackage.EXP6__DOUBLE:
        return isDouble();
      case GFPackage.EXP6__META:
        return isMeta();
      case GFPackage.EXP6__EMPTY_STRING:
        return isEmptyString();
      case GFPackage.EXP6__DATA:
        return isData();
      case GFPackage.EXP6__LIST_CAT:
        return isListCat();
      case GFPackage.EXP6__CATEGORY:
        if (resolve) return getCategory();
        return basicGetCategory();
      case GFPackage.EXP6__LIST:
        return getList();
      case GFPackage.EXP6__TOKEN_LIST:
        return isTokenList();
      case GFPackage.EXP6__RECORD:
        return isRecord();
      case GFPackage.EXP6__DEF_LIST:
        return getDefList();
      case GFPackage.EXP6__TUPLE:
        return isTuple();
      case GFPackage.EXP6__TUPLE_LIST:
        return getTupleList();
      case GFPackage.EXP6__V:
        return getV();
      case GFPackage.EXP6__TYPE:
        return getType();
      case GFPackage.EXP6__IDENTITY:
        return isIdentity();
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
      case GFPackage.EXP6__NAME:
        setName((Ident)newValue);
        return;
      case GFPackage.EXP6__SORT:
        setSort((Boolean)newValue);
        return;
      case GFPackage.EXP6__BUILT_IN_CAT:
        setBuiltInCat((Boolean)newValue);
        return;
      case GFPackage.EXP6__STRING:
        setString((Boolean)newValue);
        return;
      case GFPackage.EXP6__INTEGER:
        setInteger((Boolean)newValue);
        return;
      case GFPackage.EXP6__DOUBLE:
        setDouble((Boolean)newValue);
        return;
      case GFPackage.EXP6__META:
        setMeta((Boolean)newValue);
        return;
      case GFPackage.EXP6__EMPTY_STRING:
        setEmptyString((Boolean)newValue);
        return;
      case GFPackage.EXP6__DATA:
        setData((Boolean)newValue);
        return;
      case GFPackage.EXP6__LIST_CAT:
        setListCat((Boolean)newValue);
        return;
      case GFPackage.EXP6__CATEGORY:
        setCategory((Ident)newValue);
        return;
      case GFPackage.EXP6__LIST:
        setList((Exps)newValue);
        return;
      case GFPackage.EXP6__TOKEN_LIST:
        setTokenList((Boolean)newValue);
        return;
      case GFPackage.EXP6__RECORD:
        setRecord((Boolean)newValue);
        return;
      case GFPackage.EXP6__DEF_LIST:
        setDefList((ListLocDef)newValue);
        return;
      case GFPackage.EXP6__TUPLE:
        setTuple((Boolean)newValue);
        return;
      case GFPackage.EXP6__TUPLE_LIST:
        setTupleList((ListTupleComp)newValue);
        return;
      case GFPackage.EXP6__V:
        setV((Exp)newValue);
        return;
      case GFPackage.EXP6__TYPE:
        setType((Exp)newValue);
        return;
      case GFPackage.EXP6__IDENTITY:
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
      case GFPackage.EXP6__NAME:
        setName((Ident)null);
        return;
      case GFPackage.EXP6__SORT:
        setSort(SORT_EDEFAULT);
        return;
      case GFPackage.EXP6__BUILT_IN_CAT:
        setBuiltInCat(BUILT_IN_CAT_EDEFAULT);
        return;
      case GFPackage.EXP6__STRING:
        setString(STRING_EDEFAULT);
        return;
      case GFPackage.EXP6__INTEGER:
        setInteger(INTEGER_EDEFAULT);
        return;
      case GFPackage.EXP6__DOUBLE:
        setDouble(DOUBLE_EDEFAULT);
        return;
      case GFPackage.EXP6__META:
        setMeta(META_EDEFAULT);
        return;
      case GFPackage.EXP6__EMPTY_STRING:
        setEmptyString(EMPTY_STRING_EDEFAULT);
        return;
      case GFPackage.EXP6__DATA:
        setData(DATA_EDEFAULT);
        return;
      case GFPackage.EXP6__LIST_CAT:
        setListCat(LIST_CAT_EDEFAULT);
        return;
      case GFPackage.EXP6__CATEGORY:
        setCategory((Ident)null);
        return;
      case GFPackage.EXP6__LIST:
        setList((Exps)null);
        return;
      case GFPackage.EXP6__TOKEN_LIST:
        setTokenList(TOKEN_LIST_EDEFAULT);
        return;
      case GFPackage.EXP6__RECORD:
        setRecord(RECORD_EDEFAULT);
        return;
      case GFPackage.EXP6__DEF_LIST:
        setDefList((ListLocDef)null);
        return;
      case GFPackage.EXP6__TUPLE:
        setTuple(TUPLE_EDEFAULT);
        return;
      case GFPackage.EXP6__TUPLE_LIST:
        setTupleList((ListTupleComp)null);
        return;
      case GFPackage.EXP6__V:
        setV((Exp)null);
        return;
      case GFPackage.EXP6__TYPE:
        setType((Exp)null);
        return;
      case GFPackage.EXP6__IDENTITY:
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
      case GFPackage.EXP6__NAME:
        return name != null;
      case GFPackage.EXP6__SORT:
        return sort != SORT_EDEFAULT;
      case GFPackage.EXP6__BUILT_IN_CAT:
        return builtInCat != BUILT_IN_CAT_EDEFAULT;
      case GFPackage.EXP6__STRING:
        return string != STRING_EDEFAULT;
      case GFPackage.EXP6__INTEGER:
        return integer != INTEGER_EDEFAULT;
      case GFPackage.EXP6__DOUBLE:
        return double_ != DOUBLE_EDEFAULT;
      case GFPackage.EXP6__META:
        return meta != META_EDEFAULT;
      case GFPackage.EXP6__EMPTY_STRING:
        return emptyString != EMPTY_STRING_EDEFAULT;
      case GFPackage.EXP6__DATA:
        return data != DATA_EDEFAULT;
      case GFPackage.EXP6__LIST_CAT:
        return listCat != LIST_CAT_EDEFAULT;
      case GFPackage.EXP6__CATEGORY:
        return category != null;
      case GFPackage.EXP6__LIST:
        return list != null;
      case GFPackage.EXP6__TOKEN_LIST:
        return tokenList != TOKEN_LIST_EDEFAULT;
      case GFPackage.EXP6__RECORD:
        return record != RECORD_EDEFAULT;
      case GFPackage.EXP6__DEF_LIST:
        return defList != null;
      case GFPackage.EXP6__TUPLE:
        return tuple != TUPLE_EDEFAULT;
      case GFPackage.EXP6__TUPLE_LIST:
        return tupleList != null;
      case GFPackage.EXP6__V:
        return v != null;
      case GFPackage.EXP6__TYPE:
        return type != null;
      case GFPackage.EXP6__IDENTITY:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sort: ");
    result.append(sort);
    result.append(", builtInCat: ");
    result.append(builtInCat);
    result.append(", string: ");
    result.append(string);
    result.append(", integer: ");
    result.append(integer);
    result.append(", double: ");
    result.append(double_);
    result.append(", meta: ");
    result.append(meta);
    result.append(", emptyString: ");
    result.append(emptyString);
    result.append(", data: ");
    result.append(data);
    result.append(", listCat: ");
    result.append(listCat);
    result.append(", tokenList: ");
    result.append(tokenList);
    result.append(", record: ");
    result.append(record);
    result.append(", tuple: ");
    result.append(tuple);
    result.append(", identity: ");
    result.append(identity);
    result.append(')');
    return result.toString();
  }

} //Exp6Impl
