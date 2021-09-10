/**
 */
package it.disim.univaq.porcessmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.ItemProcess#getItemProcessType <em>Item Process Type</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.ItemProcess#getProblems <em>Problems</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.ItemProcess#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getItemProcess()
 * @model
 * @generated
 */
public interface ItemProcess extends Descripted {
	/**
	 * Returns the value of the '<em><b>Item Process Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Process Type</em>' containment reference.
	 * @see #setItemProcessType(ItemSpecies)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getItemProcess_ItemProcessType()
	 * @model containment="true"
	 * @generated
	 */
	ItemSpecies getItemProcessType();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.ItemProcess#getItemProcessType <em>Item Process Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Process Type</em>' containment reference.
	 * @see #getItemProcessType()
	 * @generated
	 */
	void setItemProcessType(ItemSpecies value);

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.porcessmanagement.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference list.
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getItemProcess_Problems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Problem> getProblems();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getItemProcess_Author()
	 * @model required="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.ItemProcess#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

} // ItemProcess
