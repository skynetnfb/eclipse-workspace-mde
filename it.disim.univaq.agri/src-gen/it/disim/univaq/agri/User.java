/**
 */
package it.disim.univaq.agri;

import java.util.Date;

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
 *   <li>{@link it.disim.univaq.agri.User#getEmail <em>Email</em>}</li>
 *   <li>{@link it.disim.univaq.agri.User#getUsername <em>Username</em>}</li>
 *   <li>{@link it.disim.univaq.agri.User#getFullName <em>Full Name</em>}</li>
 *   <li>{@link it.disim.univaq.agri.User#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link it.disim.univaq.agri.User#getUserType <em>User Type</em>}</li>
 *   <li>{@link it.disim.univaq.agri.User#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link it.disim.univaq.agri.User#getProblems <em>Problems</em>}</li>
 *   <li>{@link it.disim.univaq.agri.User#getItemProcess <em>Item Process</em>}</li>
 *   <li>{@link it.disim.univaq.agri.User#getCultivations <em>Cultivations</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.agri.AgriPackage#getUser()
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
	 * @see it.disim.univaq.agri.AgriPackage#getUser_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.User#getEmail <em>Email</em>}' attribute.
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
	 * @see it.disim.univaq.agri.AgriPackage#getUser_Username()
	 * @model required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see it.disim.univaq.agri.AgriPackage#getUser_FullName()
	 * @model required="true"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.User#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(Date)
	 * @see it.disim.univaq.agri.AgriPackage#getUser_Birthdate()
	 * @model required="true"
	 * @generated
	 */
	Date getBirthdate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.User#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Date value);

	/**
	 * Returns the value of the '<em><b>User Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.agri.UserType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Type</em>' attribute.
	 * @see it.disim.univaq.agri.UserType
	 * @see #setUserType(UserType)
	 * @see it.disim.univaq.agri.AgriPackage#getUser_UserType()
	 * @model required="true"
	 * @generated
	 */
	UserType getUserType();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.User#getUserType <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Type</em>' attribute.
	 * @see it.disim.univaq.agri.UserType
	 * @see #getUserType()
	 * @generated
	 */
	void setUserType(UserType value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.Solution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getUser_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getSolutions();

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getUser_Problems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Problem> getProblems();

	/**
	 * Returns the value of the '<em><b>Item Process</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.Plant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Process</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getUser_ItemProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plant> getItemProcess();

	/**
	 * Returns the value of the '<em><b>Cultivations</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.Cultivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cultivations</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getUser_Cultivations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cultivation> getCultivations();

} // User
