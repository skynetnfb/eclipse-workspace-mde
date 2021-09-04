/**
 */
package it.disim.univaq.porcessmanagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.Location#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends Descripted {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute.
	 * @see #setCoordinates(String)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getLocation_Coordinates()
	 * @model transient="true"
	 * @generated
	 */
	String getCoordinates();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Location#getCoordinates <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' attribute.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(String value);

} // Location
