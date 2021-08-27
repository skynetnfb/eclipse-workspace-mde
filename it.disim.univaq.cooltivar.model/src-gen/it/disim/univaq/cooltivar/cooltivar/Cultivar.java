/**
 */
package it.disim.univaq.cooltivar.cooltivar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cultivar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Cultivar#getPlantSpecies <em>Plant Species</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Cultivar#getThreats <em>Threats</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivar()
 * @model
 * @generated
 */
public interface Cultivar extends EObject {
	/**
	 * Returns the value of the '<em><b>Plant Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Species</em>' reference.
	 * @see #setPlantSpecies(PlantSpecies)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivar_PlantSpecies()
	 * @model required="true"
	 * @generated
	 */
	PlantSpecies getPlantSpecies();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Cultivar#getPlantSpecies <em>Plant Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Species</em>' reference.
	 * @see #getPlantSpecies()
	 * @generated
	 */
	void setPlantSpecies(PlantSpecies value);

	/**
	 * Returns the value of the '<em><b>Threats</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.cooltivar.cooltivar.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' containment reference list.
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivar_Threats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Threat> getThreats();

} // Cultivar
