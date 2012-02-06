/**
 * <copyright>
 * </copyright>
 *
 */
package org.grammaticalframework.eclipse.gF.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.grammaticalframework.eclipse.gF.Exp1;
import org.grammaticalframework.eclipse.gF.GFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp1Impl#isTokenListCat <em>Token List Cat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Exp1Impl extends ExpImpl implements Exp1
{
  /**
   * The default value of the '{@link #isTokenListCat() <em>Token List Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTokenListCat()
   * @generated
   * @ordered
   */
  protected static final boolean TOKEN_LIST_CAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTokenListCat() <em>Token List Cat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTokenListCat()
   * @generated
   * @ordered
   */
  protected boolean tokenListCat = TOKEN_LIST_CAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Exp1Impl()
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
    return GFPackage.Literals.EXP1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTokenListCat()
  {
    return tokenListCat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTokenListCat(boolean newTokenListCat)
  {
    boolean oldTokenListCat = tokenListCat;
    tokenListCat = newTokenListCat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP1__TOKEN_LIST_CAT, oldTokenListCat, tokenListCat));
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
      case GFPackage.EXP1__TOKEN_LIST_CAT:
        return isTokenListCat();
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
      case GFPackage.EXP1__TOKEN_LIST_CAT:
        setTokenListCat((Boolean)newValue);
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
      case GFPackage.EXP1__TOKEN_LIST_CAT:
        setTokenListCat(TOKEN_LIST_CAT_EDEFAULT);
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
      case GFPackage.EXP1__TOKEN_LIST_CAT:
        return tokenListCat != TOKEN_LIST_CAT_EDEFAULT;
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
    result.append(" (tokenListCat: ");
    result.append(tokenListCat);
    result.append(')');
    return result.toString();
  }

} //Exp1Impl
