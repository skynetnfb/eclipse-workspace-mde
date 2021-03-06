/**
 */
package cooltivar.impl;

import cooltivar.Action;
import cooltivar.ActionStatus;
import cooltivar.ActionType;
import cooltivar.CooltivarPackage;
import cooltivar.Problem;
import cooltivar.Solution;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 *   <li>{@link cooltivar.impl.ActionImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link cooltivar.impl.ActionImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link cooltivar.impl.ActionImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link cooltivar.impl.ActionImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link cooltivar.impl.ActionImpl#getActionsType <em>Actions Type</em>}</li>
 *   <li>{@link cooltivar.impl.ActionImpl#getActionStatus <em>Action Status</em>}</li>
 *   <li>{@link cooltivar.impl.ActionImpl#getFullDescription <em>Full Description</em>}</li>
 *   <li>{@link cooltivar.impl.ActionImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends DescriptedImpl implements Action {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

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
	 * The cached setting delegate for the '{@link #getFullDescription() <em>Full Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullDescription()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FULL_DESCRIPTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)CooltivarPackage.Literals.ACTION__FULL_DESCRIPTION).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected cooltivar.Process process;

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
		return CooltivarPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.ACTION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.ACTION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem getProblem() {
		if (problem != null && problem.eIsProxy()) {
			InternalEObject oldProblem = (InternalEObject)problem;
			problem = (Problem)eResolveProxy(oldProblem);
			if (problem != oldProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CooltivarPackage.ACTION__PROBLEM, oldProblem, problem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.ACTION__PROBLEM, oldProblem, problem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSolution() {
		if (solution != null && solution.eIsProxy()) {
			InternalEObject oldSolution = (InternalEObject)solution;
			solution = (Solution)eResolveProxy(oldSolution);
			if (solution != oldSolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CooltivarPackage.ACTION__SOLUTION, oldSolution, solution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.ACTION__SOLUTION, oldSolution, solution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.ACTION__ACTIONS_TYPE, oldActionsType, actionsType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.ACTION__ACTION_STATUS, oldActionStatus, actionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullDescription() {
		return (String)FULL_DESCRIPTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullDescription(String newFullDescription) {
		FULL_DESCRIPTION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newFullDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cooltivar.Process getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject)process;
			process = (cooltivar.Process)eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CooltivarPackage.ACTION__PROCESS, oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cooltivar.Process basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(cooltivar.Process newProcess) {
		cooltivar.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.ACTION__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CooltivarPackage.ACTION__START_DATE:
				return getStartDate();
			case CooltivarPackage.ACTION__END_DATE:
				return getEndDate();
			case CooltivarPackage.ACTION__PROBLEM:
				if (resolve) return getProblem();
				return basicGetProblem();
			case CooltivarPackage.ACTION__SOLUTION:
				if (resolve) return getSolution();
				return basicGetSolution();
			case CooltivarPackage.ACTION__ACTIONS_TYPE:
				return getActionsType();
			case CooltivarPackage.ACTION__ACTION_STATUS:
				return getActionStatus();
			case CooltivarPackage.ACTION__FULL_DESCRIPTION:
				return getFullDescription();
			case CooltivarPackage.ACTION__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
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
			case CooltivarPackage.ACTION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case CooltivarPackage.ACTION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case CooltivarPackage.ACTION__PROBLEM:
				setProblem((Problem)newValue);
				return;
			case CooltivarPackage.ACTION__SOLUTION:
				setSolution((Solution)newValue);
				return;
			case CooltivarPackage.ACTION__ACTIONS_TYPE:
				setActionsType((ActionType)newValue);
				return;
			case CooltivarPackage.ACTION__ACTION_STATUS:
				setActionStatus((ActionStatus)newValue);
				return;
			case CooltivarPackage.ACTION__FULL_DESCRIPTION:
				setFullDescription((String)newValue);
				return;
			case CooltivarPackage.ACTION__PROCESS:
				setProcess((cooltivar.Process)newValue);
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
			case CooltivarPackage.ACTION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case CooltivarPackage.ACTION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case CooltivarPackage.ACTION__PROBLEM:
				setProblem((Problem)null);
				return;
			case CooltivarPackage.ACTION__SOLUTION:
				setSolution((Solution)null);
				return;
			case CooltivarPackage.ACTION__ACTIONS_TYPE:
				setActionsType(ACTIONS_TYPE_EDEFAULT);
				return;
			case CooltivarPackage.ACTION__ACTION_STATUS:
				setActionStatus(ACTION_STATUS_EDEFAULT);
				return;
			case CooltivarPackage.ACTION__FULL_DESCRIPTION:
				FULL_DESCRIPTION__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case CooltivarPackage.ACTION__PROCESS:
				setProcess((cooltivar.Process)null);
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
			case CooltivarPackage.ACTION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case CooltivarPackage.ACTION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case CooltivarPackage.ACTION__PROBLEM:
				return problem != null;
			case CooltivarPackage.ACTION__SOLUTION:
				return solution != null;
			case CooltivarPackage.ACTION__ACTIONS_TYPE:
				return actionsType != ACTIONS_TYPE_EDEFAULT;
			case CooltivarPackage.ACTION__ACTION_STATUS:
				return actionStatus != ACTION_STATUS_EDEFAULT;
			case CooltivarPackage.ACTION__FULL_DESCRIPTION:
				return FULL_DESCRIPTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case CooltivarPackage.ACTION__PROCESS:
				return process != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", actionsType: ");
		result.append(actionsType);
		result.append(", actionStatus: ");
		result.append(actionStatus);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
