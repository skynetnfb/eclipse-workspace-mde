/**
 */
package it.disim.univaq.porcessmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.Solution#getAuthor <em>Author</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Solution#getProblems <em>Problems</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends Descripted {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getSolution_Author()
	 * @model
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Solution#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.porcessmanagement.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' reference list.
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getSolution_Problems()
	 * @model required="true"
	 * @generated
	 */
	EList<Problem> getProblems();

} // Solution
