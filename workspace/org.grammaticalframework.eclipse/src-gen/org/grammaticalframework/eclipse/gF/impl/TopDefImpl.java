/**
 */
package org.grammaticalframework.eclipse.gF.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.grammaticalframework.eclipse.gF.GFPackage;
import org.grammaticalframework.eclipse.gF.TopDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isCat <em>Cat</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isFun <em>Fun</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isDef <em>Def</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isData <em>Data</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isParam <em>Param</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isOper <em>Oper</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isLincat <em>Lincat</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isLindef <em>Lindef</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isLin <em>Lin</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isPrintname <em>Printname</em>}</li>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.TopDefImpl#isFlags <em>Flags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopDefImpl extends MinimalEObjectImpl.Container implements TopDef
{
  /**
   * The default value of the '{@link #isCat() <em>Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCat()
   * @generated
   * @ordered
   */
  protected static final boolean CAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCat() <em>Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCat()
   * @generated
   * @ordered
   */
  protected boolean cat = CAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected EList<EObject> definitions;

  /**
   * The default value of the '{@link #isFun() <em>Fun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFun()
   * @generated
   * @ordered
   */
  protected static final boolean FUN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFun() <em>Fun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFun()
   * @generated
   * @ordered
   */
  protected boolean fun = FUN_EDEFAULT;

  /**
   * The default value of the '{@link #isDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDef()
   * @generated
   * @ordered
   */
  protected static final boolean DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDef()
   * @generated
   * @ordered
   */
  protected boolean def = DEF_EDEFAULT;

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
   * The default value of the '{@link #isParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isParam()
   * @generated
   * @ordered
   */
  protected static final boolean PARAM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isParam()
   * @generated
   * @ordered
   */
  protected boolean param = PARAM_EDEFAULT;

  /**
   * The default value of the '{@link #isOper() <em>Oper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOper()
   * @generated
   * @ordered
   */
  protected static final boolean OPER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOper() <em>Oper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOper()
   * @generated
   * @ordered
   */
  protected boolean oper = OPER_EDEFAULT;

  /**
   * The default value of the '{@link #isLincat() <em>Lincat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLincat()
   * @generated
   * @ordered
   */
  protected static final boolean LINCAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLincat() <em>Lincat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLincat()
   * @generated
   * @ordered
   */
  protected boolean lincat = LINCAT_EDEFAULT;

  /**
   * The default value of the '{@link #isLindef() <em>Lindef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLindef()
   * @generated
   * @ordered
   */
  protected static final boolean LINDEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLindef() <em>Lindef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLindef()
   * @generated
   * @ordered
   */
  protected boolean lindef = LINDEF_EDEFAULT;

  /**
   * The default value of the '{@link #isLin() <em>Lin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLin()
   * @generated
   * @ordered
   */
  protected static final boolean LIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLin() <em>Lin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLin()
   * @generated
   * @ordered
   */
  protected boolean lin = LIN_EDEFAULT;

  /**
   * The default value of the '{@link #isPrintname() <em>Printname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrintname()
   * @generated
   * @ordered
   */
  protected static final boolean PRINTNAME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrintname() <em>Printname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrintname()
   * @generated
   * @ordered
   */
  protected boolean printname = PRINTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #isFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlags()
   * @generated
   * @ordered
   */
  protected static final boolean FLAGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFlags() <em>Flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlags()
   * @generated
   * @ordered
   */
  protected boolean flags = FLAGS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopDefImpl()
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
    return GFPackage.Literals.TOP_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCat()
  {
    return cat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCat(boolean newCat)
  {
    boolean oldCat = cat;
    cat = newCat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__CAT, oldCat, cat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getDefinitions()
  {
    if (definitions == null)
    {
      definitions = new EObjectContainmentEList<EObject>(EObject.class, this, GFPackage.TOP_DEF__DEFINITIONS);
    }
    return definitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFun()
  {
    return fun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFun(boolean newFun)
  {
    boolean oldFun = fun;
    fun = newFun;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__FUN, oldFun, fun));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(boolean newDef)
  {
    boolean oldDef = def;
    def = newDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__DEF, oldDef, def));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__DATA, oldData, data));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(boolean newParam)
  {
    boolean oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__PARAM, oldParam, param));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOper()
  {
    return oper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOper(boolean newOper)
  {
    boolean oldOper = oper;
    oper = newOper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__OPER, oldOper, oper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLincat()
  {
    return lincat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLincat(boolean newLincat)
  {
    boolean oldLincat = lincat;
    lincat = newLincat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__LINCAT, oldLincat, lincat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLindef()
  {
    return lindef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLindef(boolean newLindef)
  {
    boolean oldLindef = lindef;
    lindef = newLindef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__LINDEF, oldLindef, lindef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLin()
  {
    return lin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLin(boolean newLin)
  {
    boolean oldLin = lin;
    lin = newLin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__LIN, oldLin, lin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrintname()
  {
    return printname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrintname(boolean newPrintname)
  {
    boolean oldPrintname = printname;
    printname = newPrintname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__PRINTNAME, oldPrintname, printname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFlags()
  {
    return flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlags(boolean newFlags)
  {
    boolean oldFlags = flags;
    flags = newFlags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.TOP_DEF__FLAGS, oldFlags, flags));
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
      case GFPackage.TOP_DEF__DEFINITIONS:
        return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
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
      case GFPackage.TOP_DEF__CAT:
        return isCat();
      case GFPackage.TOP_DEF__DEFINITIONS:
        return getDefinitions();
      case GFPackage.TOP_DEF__FUN:
        return isFun();
      case GFPackage.TOP_DEF__DEF:
        return isDef();
      case GFPackage.TOP_DEF__DATA:
        return isData();
      case GFPackage.TOP_DEF__PARAM:
        return isParam();
      case GFPackage.TOP_DEF__OPER:
        return isOper();
      case GFPackage.TOP_DEF__LINCAT:
        return isLincat();
      case GFPackage.TOP_DEF__LINDEF:
        return isLindef();
      case GFPackage.TOP_DEF__LIN:
        return isLin();
      case GFPackage.TOP_DEF__PRINTNAME:
        return isPrintname();
      case GFPackage.TOP_DEF__FLAGS:
        return isFlags();
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
      case GFPackage.TOP_DEF__CAT:
        setCat((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends EObject>)newValue);
        return;
      case GFPackage.TOP_DEF__FUN:
        setFun((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__DEF:
        setDef((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__DATA:
        setData((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__PARAM:
        setParam((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__OPER:
        setOper((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__LINCAT:
        setLincat((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__LINDEF:
        setLindef((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__LIN:
        setLin((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__PRINTNAME:
        setPrintname((Boolean)newValue);
        return;
      case GFPackage.TOP_DEF__FLAGS:
        setFlags((Boolean)newValue);
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
      case GFPackage.TOP_DEF__CAT:
        setCat(CAT_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__DEFINITIONS:
        getDefinitions().clear();
        return;
      case GFPackage.TOP_DEF__FUN:
        setFun(FUN_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__DEF:
        setDef(DEF_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__DATA:
        setData(DATA_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__PARAM:
        setParam(PARAM_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__OPER:
        setOper(OPER_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__LINCAT:
        setLincat(LINCAT_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__LINDEF:
        setLindef(LINDEF_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__LIN:
        setLin(LIN_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__PRINTNAME:
        setPrintname(PRINTNAME_EDEFAULT);
        return;
      case GFPackage.TOP_DEF__FLAGS:
        setFlags(FLAGS_EDEFAULT);
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
      case GFPackage.TOP_DEF__CAT:
        return cat != CAT_EDEFAULT;
      case GFPackage.TOP_DEF__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
      case GFPackage.TOP_DEF__FUN:
        return fun != FUN_EDEFAULT;
      case GFPackage.TOP_DEF__DEF:
        return def != DEF_EDEFAULT;
      case GFPackage.TOP_DEF__DATA:
        return data != DATA_EDEFAULT;
      case GFPackage.TOP_DEF__PARAM:
        return param != PARAM_EDEFAULT;
      case GFPackage.TOP_DEF__OPER:
        return oper != OPER_EDEFAULT;
      case GFPackage.TOP_DEF__LINCAT:
        return lincat != LINCAT_EDEFAULT;
      case GFPackage.TOP_DEF__LINDEF:
        return lindef != LINDEF_EDEFAULT;
      case GFPackage.TOP_DEF__LIN:
        return lin != LIN_EDEFAULT;
      case GFPackage.TOP_DEF__PRINTNAME:
        return printname != PRINTNAME_EDEFAULT;
      case GFPackage.TOP_DEF__FLAGS:
        return flags != FLAGS_EDEFAULT;
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
    result.append(" (cat: ");
    result.append(cat);
    result.append(", fun: ");
    result.append(fun);
    result.append(", def: ");
    result.append(def);
    result.append(", data: ");
    result.append(data);
    result.append(", param: ");
    result.append(param);
    result.append(", oper: ");
    result.append(oper);
    result.append(", lincat: ");
    result.append(lincat);
    result.append(", lindef: ");
    result.append(lindef);
    result.append(", lin: ");
    result.append(lin);
    result.append(", printname: ");
    result.append(printname);
    result.append(", flags: ");
    result.append(flags);
    result.append(')');
    return result.toString();
  }

} //TopDefImpl
