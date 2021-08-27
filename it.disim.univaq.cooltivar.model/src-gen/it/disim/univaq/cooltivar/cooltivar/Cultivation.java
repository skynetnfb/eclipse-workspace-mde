/**
 */
package it.disim.univaq.cooltivar.cooltivar;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cultivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getPlant <em>Plant</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getEndDate <em>End Date</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getField <em>Field</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivation()
 * @model
 * @generated
 */
public interface Cultivation extends Descripted {
	/**
	 * Returns the value of the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' reference.
	 * @see #setPlant(Cultivar)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivation_Plant()
	 * @model required="true"
	 * @generated
	 */
	Cultivar getPlant();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getPlant <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant</em>' reference.
	 * @see #getPlant()
	 * @generated
	 */
	void setPlant(Cultivar value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivation_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivation_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.cooltivar.cooltivar.cultivationStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see it.disim.univaq.cooltivar.cooltivar.cultivationStatus
	 * @see #setStatus(cultivationStatus)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivation_Status()
	 * @model
	 * @generated
	 */
	cultivationStatus getStatus();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see it.disim.univaq.cooltivar.cooltivar.cultivationStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(cultivationStatus value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(Field)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivation_Field()
	 * @model required="true"
	 * @generated
	 */
	Field getField();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(Field value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getCultivation_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Cultivation#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

} // Cultivation
