/**
 */
package it.disim.univaq.cooltivar.cooltivar;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.User#getEmail <em>Email</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.User#getUsername <em>Username</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.User#getUname <em>Uname</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.User#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.User#getSurname <em>Surname</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.User#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getUser_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.User#getEmail <em>Email</em>}' attribute.
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
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Uname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uname</em>' attribute.
	 * @see #setUname(String)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getUser_Uname()
	 * @model
	 * @generated
	 */
	String getUname();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.User#getUname <em>Uname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uname</em>' attribute.
	 * @see #getUname()
	 * @generated
	 */
	void setUname(String value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(Date)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getUser_Birthdate()
	 * @model
	 * @generated
	 */
	Date getBirthdate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.User#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Date value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getUser_Surname()
	 * @model
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.User#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.cooltivar.cooltivar.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getUser_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // User
