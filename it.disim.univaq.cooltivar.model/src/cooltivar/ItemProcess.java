/**
 */
package cooltivar;

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
 *   <li>{@link cooltivar.ItemProcess#getItemProcessType <em>Item Process Type</em>}</li>
 *   <li>{@link cooltivar.ItemProcess#getProblems <em>Problems</em>}</li>
 *   <li>{@link cooltivar.ItemProcess#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see cooltivar.CooltivarPackage#getItemProcess()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkAuthor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot checkAuthor='isAuthorAdmin()'"
 * @generated
 */
public interface ItemProcess extends Descripted {
	/**
	 * Returns the value of the '<em><b>Item Process Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Process Type</em>' containment reference.
	 * @see #setItemProcessType(ItemSpecies)
	 * @see cooltivar.CooltivarPackage#getItemProcess_ItemProcessType()
	 * @model containment="true"
	 * @generated
	 */
	ItemSpecies getItemProcessType();

	/**
	 * Sets the value of the '{@link cooltivar.ItemProcess#getItemProcessType <em>Item Process Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Process Type</em>' containment reference.
	 * @see #getItemProcessType()
	 * @generated
	 */
	void setItemProcessType(ItemSpecies value);

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference list.
	 * The list contents are of type {@link cooltivar.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference list.
	 * @see cooltivar.CooltivarPackage#getItemProcess_Problems()
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
	 * @see cooltivar.CooltivarPackage#getItemProcess_Author()
	 * @model required="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link cooltivar.ItemProcess#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.author = UserType::ADMIN'"
	 * @generated
	 */
	Boolean isAuthorAdmin();

} // ItemProcess
