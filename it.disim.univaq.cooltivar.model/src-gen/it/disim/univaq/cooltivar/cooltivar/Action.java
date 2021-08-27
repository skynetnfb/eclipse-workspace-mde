/**
 */
package it.disim.univaq.cooltivar.cooltivar;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Action#getRemedy <em>Remedy</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Action#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Action#getEndDate <em>End Date</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.Action#getThreat <em>Threat</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Descripted {
	/**
	 * Returns the value of the '<em><b>Remedy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remedy</em>' reference.
	 * @see #setRemedy(Remedy)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getAction_Remedy()
	 * @model
	 * @generated
	 */
	Remedy getRemedy();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Action#getRemedy <em>Remedy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remedy</em>' reference.
	 * @see #getRemedy()
	 * @generated
	 */
	void setRemedy(Remedy value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getAction_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Action#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getAction_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Action#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat</em>' reference.
	 * @see #setThreat(Threat)
	 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage#getAction_Threat()
	 * @model
	 * @generated
	 */
	Threat getThreat();

	/**
	 * Sets the value of the '{@link it.disim.univaq.cooltivar.cooltivar.Action#getThreat <em>Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat</em>' reference.
	 * @see #getThreat()
	 * @generated
	 */
	void setThreat(Threat value);

} // Action
