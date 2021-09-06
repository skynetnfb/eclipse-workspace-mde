/**
 */
package cooltivar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cooltivar.Application#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see cooltivar.CooltivarPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link cooltivar.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see cooltivar.CooltivarPackage#getApplication_User()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<User> getUser();

} // Application
