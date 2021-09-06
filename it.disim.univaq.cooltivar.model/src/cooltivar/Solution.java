/**
 */
package cooltivar;

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
 *   <li>{@link cooltivar.Solution#getAuthor <em>Author</em>}</li>
 *   <li>{@link cooltivar.Solution#getProblems <em>Problems</em>}</li>
 * </ul>
 *
 * @see cooltivar.CooltivarPackage#getSolution()
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
	 * @see cooltivar.CooltivarPackage#getSolution_Author()
	 * @model
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link cooltivar.Solution#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' reference list.
	 * The list contents are of type {@link cooltivar.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' reference list.
	 * @see cooltivar.CooltivarPackage#getSolution_Problems()
	 * @model required="true"
	 * @generated
	 */
	EList<Problem> getProblems();

} // Solution
