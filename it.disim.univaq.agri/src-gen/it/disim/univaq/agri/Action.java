/**
 */
package it.disim.univaq.agri;

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
 *   <li>{@link it.disim.univaq.agri.Action#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Action#getEndDate <em>End Date</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Action#getProblem <em>Problem</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Action#getSolution <em>Solution</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Action#getActionsType <em>Actions Type</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Action#getActionStatus <em>Action Status</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Action#getFullDescription <em>Full Description</em>}</li>
 *   <li>{@link it.disim.univaq.agri.Action#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.agri.AgriPackage#getAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkDate checkActionType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot checkDate='self.startDate &lt; self.endDate' checkActionType='(self.solution.oclIsUndefined()) and (not self.problem.oclIsUndefined()) and (self.actionsType = ActionType::PROBLEM)\n\t\t\t\t\t\t\tor (self.problem.oclIsUndefined()) and (not self.solution.oclIsUndefined()) and (self.actionsType = ActionType::SOLUTION)\n\t\t\t\t\t\t\tor (self.actionsType = ActionType::CUSTOM)'"
 * @generated
 */
public interface Action extends Descripted {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see it.disim.univaq.agri.AgriPackage#getAction_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Action#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see it.disim.univaq.agri.AgriPackage#getAction_EndDate()
	 * @model required="true"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Action#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' reference.
	 * @see #setProblem(Problem)
	 * @see it.disim.univaq.agri.AgriPackage#getAction_Problem()
	 * @model
	 * @generated
	 */
	Problem getProblem();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Action#getProblem <em>Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' reference.
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(Problem value);

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference.
	 * @see #setSolution(Solution)
	 * @see it.disim.univaq.agri.AgriPackage#getAction_Solution()
	 * @model
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Action#getSolution <em>Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Actions Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.agri.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Type</em>' attribute.
	 * @see it.disim.univaq.agri.ActionType
	 * @see #setActionsType(ActionType)
	 * @see it.disim.univaq.agri.AgriPackage#getAction_ActionsType()
	 * @model required="true"
	 * @generated
	 */
	ActionType getActionsType();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Action#getActionsType <em>Actions Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions Type</em>' attribute.
	 * @see it.disim.univaq.agri.ActionType
	 * @see #getActionsType()
	 * @generated
	 */
	void setActionsType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Action Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.agri.ActionStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Status</em>' attribute.
	 * @see it.disim.univaq.agri.ActionStatus
	 * @see #setActionStatus(ActionStatus)
	 * @see it.disim.univaq.agri.AgriPackage#getAction_ActionStatus()
	 * @model required="true"
	 * @generated
	 */
	ActionStatus getActionStatus();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Action#getActionStatus <em>Action Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Status</em>' attribute.
	 * @see it.disim.univaq.agri.ActionStatus
	 * @see #getActionStatus()
	 * @generated
	 */
	void setActionStatus(ActionStatus value);

	/**
	 * Returns the value of the '<em><b>Full Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Description</em>' attribute.
	 * @see #setFullDescription(String)
	 * @see it.disim.univaq.agri.AgriPackage#getAction_FullDescription()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.actionStatus.toString().concat(\' \').concat(self.actionsType.toString().concat(\' \').concat(\'Descrizione...\'))'"
	 * @generated
	 */
	String getFullDescription();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Action#getFullDescription <em>Full Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Description</em>' attribute.
	 * @see #getFullDescription()
	 * @generated
	 */
	void setFullDescription(String value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(Cultivation)
	 * @see it.disim.univaq.agri.AgriPackage#getAction_Process()
	 * @model required="true"
	 * @generated
	 */
	Cultivation getProcess();

	/**
	 * Sets the value of the '{@link it.disim.univaq.agri.Action#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(Cultivation value);

} // Action
