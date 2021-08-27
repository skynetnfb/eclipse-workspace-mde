/**
 */
package it.disim.univaq.cooltivar.cooltivar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Threat#getAuthor <em>Author</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Threat#getRemedies <em>Remedies</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Threat#getCultivars <em>Cultivars</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getThreat()
 * @model
 * @generated
 */
public interface Threat extends Descripted {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getThreat_Author()
	 * @model required="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Threat#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Remedies</b></em>' reference list.
	 * The list contents are of type {@link it.disim.univaq.cooltivar.cooltivar.Remedy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remedies</em>' reference list.
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getThreat_Remedies()
	 * @model required="true"
	 * @generated
	 */
	EList<Remedy> getRemedies();

	/**
	 * Returns the value of the '<em><b>Cultivars</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cultivars</em>' reference.
	 * @see #setCultivars(Cultivar)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getThreat_Cultivars()
	 * @model
	 * @generated
	 */
	Cultivar getCultivars();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Threat#getCultivars <em>Cultivars</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cultivars</em>' reference.
	 * @see #getCultivars()
	 * @generated
	 */
	void setCultivars(Cultivar value);

} // Threat
