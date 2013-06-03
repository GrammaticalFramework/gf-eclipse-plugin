/**
 */
package org.grammaticalframework.eclipse.gF.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.grammaticalframework.eclipse.gF.Exp2;
import org.grammaticalframework.eclipse.gF.GFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.grammaticalframework.eclipse.gF.impl.Exp2Impl#isTokenGlue <em>Token Glue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Exp2Impl extends ExpImpl implements Exp2
{
  /**
   * The default value of the '{@link #isTokenGlue() <em>Token Glue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTokenGlue()
   * @generated
   * @ordered
   */
  protected static final boolean TOKEN_GLUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTokenGlue() <em>Token Glue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTokenGlue()
   * @generated
   * @ordered
   */
  protected boolean tokenGlue = TOKEN_GLUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Exp2Impl()
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
    return GFPackage.Literals.EXP2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTokenGlue()
  {
    return tokenGlue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTokenGlue(boolean newTokenGlue)
  {
    boolean oldTokenGlue = tokenGlue;
    tokenGlue = newTokenGlue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GFPackage.EXP2__TOKEN_GLUE, oldTokenGlue, tokenGlue));
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
      case GFPackage.EXP2__TOKEN_GLUE:
        return isTokenGlue();
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
      case GFPackage.EXP2__TOKEN_GLUE:
        setTokenGlue((Boolean)newValue);
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
      case GFPackage.EXP2__TOKEN_GLUE:
        setTokenGlue(TOKEN_GLUE_EDEFAULT);
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
      case GFPackage.EXP2__TOKEN_GLUE:
        return tokenGlue != TOKEN_GLUE_EDEFAULT;
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
    result.append(" (tokenGlue: ");
    result.append(tokenGlue);
    result.append(')');
    return result.toString();
  }

} //Exp2Impl
