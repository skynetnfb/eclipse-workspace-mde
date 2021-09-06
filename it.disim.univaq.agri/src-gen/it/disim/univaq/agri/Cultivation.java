/**
 */
package it.disim.univaq.agri;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cultivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.agri.Cultivation#getPlant <em>Plant</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Cultivation#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Cultivation#getEndDate <em>End Date</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Cultivation#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Cultivation#getWeight <em>Weight</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Cultivation#getActionHistory <em>Action History</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Cultivation#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.agri.AgriPackage#getCultivation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minW checkDate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot minW='self.weight &gt;= 0.0' checkDate='self.startDate &lt; self.endDate'"
 * @generated
 */
public interface Cultivation extends Descripted {
	/**
	 * Returns the value of the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' reference.
	 * @see #setPlant(Plant)
	 * @see it.disim.univaq.agri.AgriPackage#getCultivation_Plant()
	 * @model
	 * @generated
	 */
	Plant getPlant();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Cultivation#getPlant <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant</em>' reference.
	 * @see #getPlant()
	 * @generated
	 */
	void setPlant(Plant value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see it.disim.univaq.agri.AgriPackage#getCultivation_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Cultivation#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see it.disim.univaq.agri.AgriPackage#getCultivation_EndDate()
	 * @model required="true"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Cultivation#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.agri.ProcessStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see it.disim.univaq.agri.ProcessStatus
	 * @see #setStatus(ProcessStatus)
	 * @see it.disim.univaq.agri.AgriPackage#getCultivation_Status()
	 * @model
	 * @generated
	 */
	ProcessStatus getStatus();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Cultivation#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see it.disim.univaq.agri.ProcessStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProcessStatus value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see it.disim.univaq.agri.AgriPackage#getCultivation_Weight()
	 * @model required="true"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Cultivation#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Action History</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.agri.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action History</em>' containment reference list.
	 * @see it.disim.univaq.agri.AgriPackage#getCultivation_ActionHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActionHistory();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see it.disim.univaq.agri.AgriPackage#getCultivation_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Cultivation#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean checkFutureDate();

} // Cultivation
