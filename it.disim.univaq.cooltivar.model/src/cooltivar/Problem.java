/**
 */
package cooltivar;

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
 *   <li>{@link cooltivar.Problem#getAuthor <em>Author</em>}</li>
 *   <li>{@link cooltivar.Problem#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link cooltivar.Problem#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see cooltivar.CooltivarPackage#getProblem()
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
	 * @see cooltivar.CooltivarPackage#getProblem_Author()
	 * @model required="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link cooltivar.Problem#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' reference list.
	 * The list contents are of type {@link cooltivar.Solution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' reference list.
	 * @see cooltivar.CooltivarPackage#getProblem_Solutions()
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
	 * @see cooltivar.CooltivarPackage#getProblem_Process()
	 * @model
	 * @generated
	 */
	ItemProcess getProcess();

	/**
	 * Sets the value of the '{@link cooltivar.Problem#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(ItemProcess value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.author = UserType::ADMIN'"
	 * @generated
	 */
	Boolean isAuthorAdmin();

} // Problem
