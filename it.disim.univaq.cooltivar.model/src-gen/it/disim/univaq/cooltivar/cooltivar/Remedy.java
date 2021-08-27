/**
 */
package it.disim.univaq.cooltivar.cooltivar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remedy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Remedy#getAuthor <em>Author</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Remedy#getThreats <em>Threats</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getRemedy()
 * @model
 * @generated
 */
public interface Remedy extends Descripted {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getRemedy_Author()
	 * @model
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Remedy#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Threats</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.cooltivar.cooltivar.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' reference list.
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getRemedy_Threats()
	 * @model required="true"
	 * @generated
	 */
	EList<Threat> getThreats();

} // Remedy
