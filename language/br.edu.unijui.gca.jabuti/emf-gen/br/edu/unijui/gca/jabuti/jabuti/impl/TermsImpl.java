/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti.impl;

import br.edu.unijui.gca.jabuti.jabuti.ConditionalExpression;
import br.edu.unijui.gca.jabuti.jabuti.ExpressionTerm;
import br.edu.unijui.gca.jabuti.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.jabuti.Terms;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.TermsImpl#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.TermsImpl#getExpressionTerm <em>Expression Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermsImpl extends MinimalEObjectImpl.Container implements Terms
{
	/**
	 * The cached value of the '{@link #getConditionalExpression() <em>Conditional Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalExpression> conditionalExpression;

	/**
	 * The cached value of the '{@link #getExpressionTerm() <em>Expression Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionTerm> expressionTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermsImpl()
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
		return JabutiPackage.Literals.TERMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalExpression> getConditionalExpression()
	{
		if (conditionalExpression == null)
		{
			conditionalExpression = new EObjectContainmentEList<ConditionalExpression>(ConditionalExpression.class, this, JabutiPackage.TERMS__CONDITIONAL_EXPRESSION);
		}
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExpressionTerm> getExpressionTerm()
	{
		if (expressionTerm == null)
		{
			expressionTerm = new EObjectContainmentEList<ExpressionTerm>(ExpressionTerm.class, this, JabutiPackage.TERMS__EXPRESSION_TERM);
		}
		return expressionTerm;
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
			case JabutiPackage.TERMS__CONDITIONAL_EXPRESSION:
				return ((InternalEList<?>)getConditionalExpression()).basicRemove(otherEnd, msgs);
			case JabutiPackage.TERMS__EXPRESSION_TERM:
				return ((InternalEList<?>)getExpressionTerm()).basicRemove(otherEnd, msgs);
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
			case JabutiPackage.TERMS__CONDITIONAL_EXPRESSION:
				return getConditionalExpression();
			case JabutiPackage.TERMS__EXPRESSION_TERM:
				return getExpressionTerm();
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
			case JabutiPackage.TERMS__CONDITIONAL_EXPRESSION:
				getConditionalExpression().clear();
				getConditionalExpression().addAll((Collection<? extends ConditionalExpression>)newValue);
				return;
			case JabutiPackage.TERMS__EXPRESSION_TERM:
				getExpressionTerm().clear();
				getExpressionTerm().addAll((Collection<? extends ExpressionTerm>)newValue);
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
			case JabutiPackage.TERMS__CONDITIONAL_EXPRESSION:
				getConditionalExpression().clear();
				return;
			case JabutiPackage.TERMS__EXPRESSION_TERM:
				getExpressionTerm().clear();
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
			case JabutiPackage.TERMS__CONDITIONAL_EXPRESSION:
				return conditionalExpression != null && !conditionalExpression.isEmpty();
			case JabutiPackage.TERMS__EXPRESSION_TERM:
				return expressionTerm != null && !expressionTerm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TermsImpl
