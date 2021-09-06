/**
 */
package cooltivar;

import java.util.Date;

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
 *   <li>{@link cooltivar.Process#getItemProcess <em>Item Process</em>}</li>
 *   <li>{@link cooltivar.Process#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link cooltivar.Process#getEndDate <em>End Date</em>}</li>
 *   <li>{@link cooltivar.Process#getStatus <em>Status</em>}</li>
 *   <li>{@link cooltivar.Process#getLocation <em>Location</em>}</li>
 *   <li>{@link cooltivar.Process#getWeight <em>Weight</em>}</li>
 *   <li>{@link cooltivar.Process#getActionHistory <em>Action History</em>}</li>
 * </ul>
 *
 * @see cooltivar.CooltivarPackage#getProcess()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minW checkDate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot minW='self.weight &gt;= 0.0' checkDate='self.startDate &lt; self.endDate'"
 * @generated
 */
public interface Process extends Descripted {
	/**
	 * Returns the value of the '<em><b>Item Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Process</em>' reference.
	 * @see #setItemProcess(ItemProcess)
	 * @see cooltivar.CooltivarPackage#getProcess_ItemProcess()
	 * @model
	 * @generated
	 */
	ItemProcess getItemProcess();

	/**
	 * Sets the value of the '{@link cooltivar.Process#getItemProcess <em>Item Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Process</em>' reference.
	 * @see #getItemProcess()
	 * @generated
	 */
	void setItemProcess(ItemProcess value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see cooltivar.CooltivarPackage#getProcess_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link cooltivar.Process#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see cooltivar.CooltivarPackage#getProcess_EndDate()
	 * @model required="true"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link cooltivar.Process#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link cooltivar.ProcessStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see cooltivar.ProcessStatus
	 * @see #setStatus(ProcessStatus)
	 * @see cooltivar.CooltivarPackage#getProcess_Status()
	 * @model
	 * @generated
	 */
	ProcessStatus getStatus();

	/**
	 * Sets the value of the '{@link cooltivar.Process#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see cooltivar.ProcessStatus
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
	 * @see cooltivar.CooltivarPackage#getProcess_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link cooltivar.Process#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see cooltivar.CooltivarPackage#getProcess_Weight()
	 * @model required="true"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link cooltivar.Process#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Action History</b></em>' containment reference list.
	 * The list contents are of type {@link cooltivar.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action History</em>' containment reference list.
	 * @see cooltivar.CooltivarPackage#getProcess_ActionHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActionHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean checkFutureDate();

} // Process
