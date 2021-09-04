/**
 */
package it.disim.univaq.porcessmanagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.Action#getProblem <em>Problem</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Action#getSolution <em>Solution</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Action#getActionsType <em>Actions Type</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Action#getActionStatus <em>Action Status</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Action#getProcess <em>Process</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Action#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.Action#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Descripted {
	/**
	 * Returns the value of the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' reference.
	 * @see #setProblem(Problem)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getAction_Problem()
	 * @model
	 * @generated
	 */
	Problem getProblem();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Action#getProblem <em>Problem</em>}' reference.
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
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getAction_Solution()
	 * @model
	 * @generated
	 */
	Solution getSolution();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Action#getSolution <em>Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution</em>' reference.
	 * @see #getSolution()
	 * @generated
	 */
	void setSolution(Solution value);

	/**
	 * Returns the value of the '<em><b>Actions Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.porcessmanagement.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions Type</em>' attribute.
	 * @see it.disim.univaq.porcessmanagement.ActionType
	 * @see #setActionsType(ActionType)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getAction_ActionsType()
	 * @model required="true"
	 * @generated
	 */
	ActionType getActionsType();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Action#getActionsType <em>Actions Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions Type</em>' attribute.
	 * @see it.disim.univaq.porcessmanagement.ActionType
	 * @see #getActionsType()
	 * @generated
	 */
	void setActionsType(ActionType value);

	/**
	 * Returns the value of the '<em><b>Action Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.disim.univaq.porcessmanagement.ActionStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Status</em>' attribute.
	 * @see it.disim.univaq.porcessmanagement.ActionStatus
	 * @see #setActionStatus(ActionStatus)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getAction_ActionStatus()
	 * @model required="true"
	 * @generated
	 */
	ActionStatus getActionStatus();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Action#getActionStatus <em>Action Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Status</em>' attribute.
	 * @see it.disim.univaq.porcessmanagement.ActionStatus
	 * @see #getActionStatus()
	 * @generated
	 */
	void setActionStatus(ActionStatus value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(it.disim.univaq.porcessmanagement.Process)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getAction_Process()
	 * @model required="true"
	 * @generated
	 */
	it.disim.univaq.porcessmanagement.Process getProcess();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Action#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(it.disim.univaq.porcessmanagement.Process value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(String)
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getAction_StartDate()
	 * @model
	 * @generated
	 */
	String getStartDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Action#getStartDate <em>Start Date</em>}' attribute.
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
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#getAction_EndDate()
	 * @model required="true"
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link it.disim.univaq.porcessmanagement.Action#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

} // Action
