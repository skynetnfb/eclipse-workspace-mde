/**
 */
package it.disim.univaq.porcessmanagement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.Process#getItemProcess <em>Item Process</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Process#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Process#getLocation <em>Location</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Process#getActionHistory <em>Action History</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Process#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Process#getEndDate <em>End Date</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Process#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Descripted {
	/**
	 * Returns the value of the '<em><b>Item Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Process</em>' reference.
	 * @see #setItemProcess(ItemProcess)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProcess_ItemProcess()
	 * @model
	 * @generated
	 */
	ItemProcess getItemProcess();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Process#getItemProcess <em>Item Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Process</em>' reference.
	 * @see #getItemProcess()
	 * @generated
	 */
	void setItemProcess(ItemProcess value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.porcessmanagement.ProcessStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see it.disim.univaq.porcessmanagement.ProcessStatus
	 * @see #setStatus(ProcessStatus)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProcess_Status()
	 * @model
	 * @generated
	 */
	ProcessStatus getStatus();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Process#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see it.disim.univaq.porcessmanagement.ProcessStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProcessStatus value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProcess_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Process#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Action History</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.porcessmanagement.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action History</em>' containment reference list.
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProcess_ActionHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActionHistory();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProcess_StartDate()
	 * @model required="true"
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Process#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProcess_EndDate()
	 * @model required="true"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Process#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(String)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getProcess_Weight()
	 * @model required="true"
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Process#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean checkFutureDate();

} // Process
