/**
 */
package it.disim.univaq.porcessmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.Problem#getAuthor <em>Author</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Problem#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Problem#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProblem()
 * @model
 * @generated
 */
public interface Problem extends Descripted {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProblem_Author()
	 * @model required="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Problem#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.porcessmanagement.Solution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' reference list.
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProblem_Solutions()
	 * @model
	 * @generated
	 */
	EList<Solution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(ItemProcess)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProblem_Process()
	 * @model
	 * @generated
	 */
	ItemProcess getProcess();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Problem#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(ItemProcess value);

} // Problem
