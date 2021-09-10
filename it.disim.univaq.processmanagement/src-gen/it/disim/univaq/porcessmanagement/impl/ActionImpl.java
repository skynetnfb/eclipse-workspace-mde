/**
 */
package it.disim.univaq.porcessmanagement.impl;

import it.disim.univaq.porcessmanagement.Action;
import it.disim.univaq.porcessmanagement.ActionStatus;
import it.disim.univaq.porcessmanagement.ActionType;
import it.disim.univaq.porcessmanagement.PorcessmanagementPackage;
import it.disim.univaq.porcessmanagement.Problem;
import it.disim.univaq.porcessmanagement.Solution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ActionImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ActionImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ActionImpl#getActionsType <em>Actions Type</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ActionImpl#getActionStatus <em>Action Status</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ActionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ActionImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ActionImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends DescriptedImpl implements Action {
	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected Problem problem;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected Solution solution;

	/**
	 * The default value of the '{@link #getActionsType() <em>Actions Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsType()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType ACTIONS_TYPE_EDEFAULT = ActionType.CUSTOM;

	/**
	 * The cached value of the '{@link #getActionsType() <em>Actions Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionsType()
	 * @generated
	 * @ordered
	 */
	protected ActionType actionsType = ACTIONS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatus() <em>Action Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ActionStatus ACTION_STATUS_EDEFAULT = ActionStatus.TODO;

	/**
	 * The cached value of the '{@link #getActionStatus() <em>Action Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatus()
	 * @generated
	 * @ordered
	 */
	protected ActionStatus actionStatus = ACTION_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected it.disim.univaq.porcessmanagement.Process process;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected String startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final String END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected String endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PorcessmanagementPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem getProblem() {
		if (problem != null && problem.eIsProxy()) {
			InternalEObject oldProblem = (InternalEObject) problem;
			problem = (Problem) eResolveProxy(oldProblem);
			if (problem != oldProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PorcessmanagementPackage.ACTION__PROBLEM,
							oldProblem, problem));
			}
		}
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem basicGetProblem() {
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblem(Problem newProblem) {
		Problem oldProblem = problem;
		problem = newProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.ACTION__PROBLEM, oldProblem,
					problem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolution() {
		if (solution != null && solution.eIsProxy()) {
			InternalEObject oldSolution = (InternalEObject) solution;
			solution = (Solution) eResolveProxy(oldSolution);
			if (solution != oldSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PorcessmanagementPackage.ACTION__SOLUTION,
							oldSolution, solution));
			}
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(Solution newSolution) {
		Solution oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.ACTION__SOLUTION,
					oldSolution, solution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getActionsType() {
		return actionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionsType(ActionType newActionsType) {
		ActionType oldActionsType = actionsType;
		actionsType = newActionsType == null ? ACTIONS_TYPE_EDEFAULT : newActionsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.ACTION__ACTIONS_TYPE,
					oldActionsType, actionsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStatus getActionStatus() {
		return actionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatus(ActionStatus newActionStatus) {
		ActionStatus oldActionStatus = actionStatus;
		actionStatus = newActionStatus == null ? ACTION_STATUS_EDEFAULT : newActionStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.ACTION__ACTION_STATUS,
					oldActionStatus, actionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.disim.univaq.porcessmanagement.Process getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject) process;
			process = (it.disim.univaq.porcessmanagement.Process) eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PorcessmanagementPackage.ACTION__PROCESS,
							oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.disim.univaq.porcessmanagement.Process basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(it.disim.univaq.porcessmanagement.Process newProcess) {
		it.disim.univaq.porcessmanagement.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.ACTION__PROCESS, oldProcess,
					process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(String newStartDate) {
		String oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.ACTION__START_DATE,
					oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(String newEndDate) {
		String oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.ACTION__END_DATE, oldEndDate,
					endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PorcessmanagementPackage.ACTION__PROBLEM:
			if (resolve)
				return getProblem();
			return basicGetProblem();
		case PorcessmanagementPackage.ACTION__SOLUTION:
			if (resolve)
				return getSolution();
			return basicGetSolution();
		case PorcessmanagementPackage.ACTION__ACTIONS_TYPE:
			return getActionsType();
		case PorcessmanagementPackage.ACTION__ACTION_STATUS:
			return getActionStatus();
		case PorcessmanagementPackage.ACTION__PROCESS:
			if (resolve)
				return getProcess();
			return basicGetProcess();
		case PorcessmanagementPackage.ACTION__START_DATE:
			return getStartDate();
		case PorcessmanagementPackage.ACTION__END_DATE:
			return getEndDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PorcessmanagementPackage.ACTION__PROBLEM:
			setProblem((Problem) newValue);
			return;
		case PorcessmanagementPackage.ACTION__SOLUTION:
			setSolution((Solution) newValue);
			return;
		case PorcessmanagementPackage.ACTION__ACTIONS_TYPE:
			setActionsType((ActionType) newValue);
			return;
		case PorcessmanagementPackage.ACTION__ACTION_STATUS:
			setActionStatus((ActionStatus) newValue);
			return;
		case PorcessmanagementPackage.ACTION__PROCESS:
			setProcess((it.disim.univaq.porcessmanagement.Process) newValue);
			return;
		case PorcessmanagementPackage.ACTION__START_DATE:
			setStartDate((String) newValue);
			return;
		case PorcessmanagementPackage.ACTION__END_DATE:
			setEndDate((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PorcessmanagementPackage.ACTION__PROBLEM:
			setProblem((Problem) null);
			return;
		case PorcessmanagementPackage.ACTION__SOLUTION:
			setSolution((Solution) null);
			return;
		case PorcessmanagementPackage.ACTION__ACTIONS_TYPE:
			setActionsType(ACTIONS_TYPE_EDEFAULT);
			return;
		case PorcessmanagementPackage.ACTION__ACTION_STATUS:
			setActionStatus(ACTION_STATUS_EDEFAULT);
			return;
		case PorcessmanagementPackage.ACTION__PROCESS:
			setProcess((it.disim.univaq.porcessmanagement.Process) null);
			return;
		case PorcessmanagementPackage.ACTION__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case PorcessmanagementPackage.ACTION__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PorcessmanagementPackage.ACTION__PROBLEM:
			return problem != null;
		case PorcessmanagementPackage.ACTION__SOLUTION:
			return solution != null;
		case PorcessmanagementPackage.ACTION__ACTIONS_TYPE:
			return actionsType != ACTIONS_TYPE_EDEFAULT;
		case PorcessmanagementPackage.ACTION__ACTION_STATUS:
			return actionStatus != ACTION_STATUS_EDEFAULT;
		case PorcessmanagementPackage.ACTION__PROCESS:
			return process != null;
		case PorcessmanagementPackage.ACTION__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case PorcessmanagementPackage.ACTION__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (actionsType: ");
		result.append(actionsType);
		result.append(", actionStatus: ");
		result.append(actionStatus);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
