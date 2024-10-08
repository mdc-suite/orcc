/**
 */
package net.sf.orcc.cal.cal.impl;

import java.util.Collection;

import net.sf.orcc.cal.cal.AstExpression;
import net.sf.orcc.cal.cal.CalPackage;
import net.sf.orcc.cal.cal.ExpressionElsif;
import net.sf.orcc.cal.cal.ExpressionIf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.sf.orcc.cal.cal.impl.ExpressionIfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.sf.orcc.cal.cal.impl.ExpressionIfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link net.sf.orcc.cal.cal.impl.ExpressionIfImpl#getElsifs <em>Elsifs</em>}</li>
 *   <li>{@link net.sf.orcc.cal.cal.impl.ExpressionIfImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionIfImpl extends AstExpressionImpl implements ExpressionIf
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected AstExpression condition;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected AstExpression then;

  /**
   * The cached value of the '{@link #getElsifs() <em>Elsifs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsifs()
   * @generated
   * @ordered
   */
  protected EList<ExpressionElsif> elsifs;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected AstExpression else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionIfImpl()
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
    return CalPackage.Literals.EXPRESSION_IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstExpression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(AstExpression newCondition, NotificationChain msgs)
  {
    AstExpression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalPackage.EXPRESSION_IF__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(AstExpression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalPackage.EXPRESSION_IF__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalPackage.EXPRESSION_IF__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalPackage.EXPRESSION_IF__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstExpression getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(AstExpression newThen, NotificationChain msgs)
  {
    AstExpression oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalPackage.EXPRESSION_IF__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(AstExpression newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalPackage.EXPRESSION_IF__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalPackage.EXPRESSION_IF__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalPackage.EXPRESSION_IF__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpressionElsif> getElsifs()
  {
    if (elsifs == null)
    {
      elsifs = new EObjectContainmentEList<ExpressionElsif>(ExpressionElsif.class, this, CalPackage.EXPRESSION_IF__ELSIFS);
    }
    return elsifs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstExpression getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(AstExpression newElse, NotificationChain msgs)
  {
    AstExpression oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CalPackage.EXPRESSION_IF__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(AstExpression newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CalPackage.EXPRESSION_IF__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CalPackage.EXPRESSION_IF__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalPackage.EXPRESSION_IF__ELSE, newElse, newElse));
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
      case CalPackage.EXPRESSION_IF__CONDITION:
        return basicSetCondition(null, msgs);
      case CalPackage.EXPRESSION_IF__THEN:
        return basicSetThen(null, msgs);
      case CalPackage.EXPRESSION_IF__ELSIFS:
        return ((InternalEList<?>)getElsifs()).basicRemove(otherEnd, msgs);
      case CalPackage.EXPRESSION_IF__ELSE:
        return basicSetElse(null, msgs);
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
      case CalPackage.EXPRESSION_IF__CONDITION:
        return getCondition();
      case CalPackage.EXPRESSION_IF__THEN:
        return getThen();
      case CalPackage.EXPRESSION_IF__ELSIFS:
        return getElsifs();
      case CalPackage.EXPRESSION_IF__ELSE:
        return getElse();
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
      case CalPackage.EXPRESSION_IF__CONDITION:
        setCondition((AstExpression)newValue);
        return;
      case CalPackage.EXPRESSION_IF__THEN:
        setThen((AstExpression)newValue);
        return;
      case CalPackage.EXPRESSION_IF__ELSIFS:
        getElsifs().clear();
        getElsifs().addAll((Collection<? extends ExpressionElsif>)newValue);
        return;
      case CalPackage.EXPRESSION_IF__ELSE:
        setElse((AstExpression)newValue);
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
      case CalPackage.EXPRESSION_IF__CONDITION:
        setCondition((AstExpression)null);
        return;
      case CalPackage.EXPRESSION_IF__THEN:
        setThen((AstExpression)null);
        return;
      case CalPackage.EXPRESSION_IF__ELSIFS:
        getElsifs().clear();
        return;
      case CalPackage.EXPRESSION_IF__ELSE:
        setElse((AstExpression)null);
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
      case CalPackage.EXPRESSION_IF__CONDITION:
        return condition != null;
      case CalPackage.EXPRESSION_IF__THEN:
        return then != null;
      case CalPackage.EXPRESSION_IF__ELSIFS:
        return elsifs != null && !elsifs.isEmpty();
      case CalPackage.EXPRESSION_IF__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionIfImpl
