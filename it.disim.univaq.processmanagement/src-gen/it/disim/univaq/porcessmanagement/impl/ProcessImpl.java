/**
 */
package it.disim.univaq.porcessmanagement.impl;

import it.disim.univaq.porcessmanagement.Action;
import it.disim.univaq.porcessmanagement.ItemProcess;
import it.disim.univaq.porcessmanagement.Location;
import it.disim.univaq.porcessmanagement.PorcessmanagementPackage;
import it.disim.univaq.porcessmanagement.ProcessStatus;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProcessImpl#getItemProcess <em>Item Process</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProcessImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProcessImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProcessImpl#getActionHistory <em>Action History</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProcessImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProcessImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProcessImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends DescriptedImpl implements it.disim.univaq.porcessmanagement.Process {
	/**
	 * The cached value of the '{@link #getItemProcess() <em>Item Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemProcess()
	 * @generated
	 * @ordered
	 */
	protected ItemProcess itemProcess;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessStatus STATUS_EDEFAULT = ProcessStatus.DRAFT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ProcessStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getActionHistory() <em>Action History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actionHistory;

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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PorcessmanagementPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemProcess getItemProcess() {
		if (itemProcess != null && itemProcess.eIsProxy()) {
			InternalEObject oldItemProcess = (InternalEObject) itemProcess;
			itemProcess = (ItemProcess) eResolveProxy(oldItemProcess);
			if (itemProcess != oldItemProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PorcessmanagementPackage.PROCESS__ITEM_PROCESS, oldItemProcess, itemProcess));
			}
		}
		return itemProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemProcess basicGetItemProcess() {
		return itemProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemProcess(ItemProcess newItemProcess) {
		ItemProcess oldItemProcess = itemProcess;
		itemProcess = newItemProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.PROCESS__ITEM_PROCESS,
					oldItemProcess, itemProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ProcessStatus newStatus) {
		ProcessStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.PROCESS__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PorcessmanagementPackage.PROCESS__LOCATION, oldLocation, newLocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PorcessmanagementPackage.PROCESS__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PorcessmanagementPackage.PROCESS__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.PROCESS__LOCATION,
					newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActionHistory() {
		if (actionHistory == null) {
			actionHistory = new EObjectContainmentEList<Action>(Action.class, this,
					PorcessmanagementPackage.PROCESS__ACTION_HISTORY);
		}
		return actionHistory;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.PROCESS__START_DATE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.PROCESS__END_DATE,
					oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(String newWeight) {
		String oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.PROCESS__WEIGHT, oldWeight,
					weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean checkFutureDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PorcessmanagementPackage.PROCESS__LOCATION:
			return basicSetLocation(null, msgs);
		case PorcessmanagementPackage.PROCESS__ACTION_HISTORY:
			return ((InternalEList<?>) getActionHistory()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PorcessmanagementPackage.PROCESS__ITEM_PROCESS:
			if (resolve)
				return getItemProcess();
			return basicGetItemProcess();
		case PorcessmanagementPackage.PROCESS__STATUS:
			return getStatus();
		case PorcessmanagementPackage.PROCESS__LOCATION:
			return getLocation();
		case PorcessmanagementPackage.PROCESS__ACTION_HISTORY:
			return getActionHistory();
		case PorcessmanagementPackage.PROCESS__START_DATE:
			return getStartDate();
		case PorcessmanagementPackage.PROCESS__END_DATE:
			return getEndDate();
		case PorcessmanagementPackage.PROCESS__WEIGHT:
			return getWeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PorcessmanagementPackage.PROCESS__ITEM_PROCESS:
			setItemProcess((ItemProcess) newValue);
			return;
		case PorcessmanagementPackage.PROCESS__STATUS:
			setStatus((ProcessStatus) newValue);
			return;
		case PorcessmanagementPackage.PROCESS__LOCATION:
			setLocation((Location) newValue);
			return;
		case PorcessmanagementPackage.PROCESS__ACTION_HISTORY:
			getActionHistory().clear();
			getActionHistory().addAll((Collection<? extends Action>) newValue);
			return;
		case PorcessmanagementPackage.PROCESS__START_DATE:
			setStartDate((String) newValue);
			return;
		case PorcessmanagementPackage.PROCESS__END_DATE:
			setEndDate((String) newValue);
			return;
		case PorcessmanagementPackage.PROCESS__WEIGHT:
			setWeight((String) newValue);
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
		case PorcessmanagementPackage.PROCESS__ITEM_PROCESS:
			setItemProcess((ItemProcess) null);
			return;
		case PorcessmanagementPackage.PROCESS__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case PorcessmanagementPackage.PROCESS__LOCATION:
			setLocation((Location) null);
			return;
		case PorcessmanagementPackage.PROCESS__ACTION_HISTORY:
			getActionHistory().clear();
			return;
		case PorcessmanagementPackage.PROCESS__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case PorcessmanagementPackage.PROCESS__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		case PorcessmanagementPackage.PROCESS__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
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
		case PorcessmanagementPackage.PROCESS__ITEM_PROCESS:
			return itemProcess != null;
		case PorcessmanagementPackage.PROCESS__STATUS:
			return status != STATUS_EDEFAULT;
		case PorcessmanagementPackage.PROCESS__LOCATION:
			return location != null;
		case PorcessmanagementPackage.PROCESS__ACTION_HISTORY:
			return actionHistory != null && !actionHistory.isEmpty();
		case PorcessmanagementPackage.PROCESS__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case PorcessmanagementPackage.PROCESS__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		case PorcessmanagementPackage.PROCESS__WEIGHT:
			return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PorcessmanagementPackage.PROCESS___CHECK_FUTURE_DATE:
			return checkFutureDate();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (status: ");
		result.append(status);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
