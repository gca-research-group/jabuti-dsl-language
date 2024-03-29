/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.Model#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.unijui.gca.jabuti.jabuti.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Contract)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getModel_Contract()
	 * @model containment="true"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.Model#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

} // Model
