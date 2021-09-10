/**
 */
package it.disim.univaq.porcessmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.User#getEmail <em>Email</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.User#getUsername <em>Username</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.User#getSurname <em>Surname</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.User#getUserType <em>User Type</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.User#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.User#getProblems <em>Problems</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.User#getItemProcess <em>Item Process</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.User#getProcess <em>Process</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.User#getBirthdate <em>Birthdate</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Descripted {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser_Username()
	 * @model required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser_Surname()
	 * @model
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.User#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>User Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.porcessmanagement.UserType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Type</em>' attribute.
	 * @see it.disim.univaq.porcessmanagement.UserType
	 * @see #setUserType(UserType)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser_UserType()
	 * @model required="true"
	 * @generated
	 */
	UserType getUserType();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.User#getUserType <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Type</em>' attribute.
	 * @see it.disim.univaq.porcessmanagement.UserType
	 * @see #getUserType()
	 * @generated
	 */
	void setUserType(UserType value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.porcessmanagement.Solution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.porcessmanagement.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference list.
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser_Problems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Problem> getProblems();

	/**
	 * Returns the value of the '<em><b>Item Process</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.porcessmanagement.ItemProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Process</em>' containment reference list.
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser_ItemProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemProcess> getItemProcess();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.porcessmanagement.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser_Process()
	 * @model containment="true"
	 * @generated
	 */
	EList<it.disim.univaq.porcessmanagement.Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(String)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getUser_Birthdate()
	 * @model
	 * @generated
	 */
	String getBirthdate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.User#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(String value);

} // User
