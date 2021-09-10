/**
 */
package it.disim.univaq.agri;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agri</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.agri.Agri#getUser <em>User</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Agri#getProblem <em>Problem</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Agri#getSolution <em>Solution</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Agri#getItemProcess <em>Item Process</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.agri.AgriPackage#getAgri()
 * @model
 * @generated
 */
public interface Agri extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getAgri_User()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getAgri_Problem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Problem> getProblem();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.Solution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getAgri_Solution()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getSolution();

	/**
	 * Returns the value of the '<em><b>Item Process</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.Plant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Process</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getAgri_ItemProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plant> getItemProcess();

} // Agri
