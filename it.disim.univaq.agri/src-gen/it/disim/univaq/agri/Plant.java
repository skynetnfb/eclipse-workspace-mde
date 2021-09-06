/**
 */
package it.disim.univaq.agri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.agri.Plant#getProblems <em>Problems</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Plant#getAuthor <em>Author</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Plant#getPlantSpecies <em>Plant Species</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.agri.AgriPackage#getPlant()
 * @model
 * @generated
 */
public interface Plant extends Descripted {
	/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getPlant_Problems()
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
	 * @see it.disim.univaq.agri.AgriPackage#getPlant_Author()
	 * @model required="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Plant#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Plant Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Species</em>' attribute.
	 * @see #setPlantSpecies(String)
	 * @see it.disim.univaq.agri.AgriPackage#getPlant_PlantSpecies()
	 * @model
	 * @generated
	 */
	String getPlantSpecies();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Plant#getPlantSpecies <em>Plant Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Species</em>' attribute.
	 * @see #getPlantSpecies()
	 * @generated
	 */
	void setPlantSpecies(String value);

} // Plant
