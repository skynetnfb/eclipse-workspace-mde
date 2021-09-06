/**
 */
package cooltivar.impl;

import cooltivar.Action;
import cooltivar.CooltivarPackage;
import cooltivar.ItemProcess;
import cooltivar.Location;
import cooltivar.ProcessStatus;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

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
 *   <li>{@link cooltivar.impl.ProcessImpl#getItemProcess <em>Item Process</em>}</li>
 *   <li>{@link cooltivar.impl.ProcessImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link cooltivar.impl.ProcessImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link cooltivar.impl.ProcessImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link cooltivar.impl.ProcessImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link cooltivar.impl.ProcessImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link cooltivar.impl.ProcessImpl#getActionHistory <em>Action History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends DescriptedImpl implements cooltivar.Process {
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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

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
		return CooltivarPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemProcess getItemProcess() {
		if (itemProcess != null && itemProcess.eIsProxy()) {
			InternalEObject oldItemProcess = (InternalEObject)itemProcess;
			itemProcess = (ItemProcess)eResolveProxy(oldItemProcess);
			if (itemProcess != oldItemProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CooltivarPackage.PROCESS__ITEM_PROCESS, oldItemProcess, itemProcess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.PROCESS__ITEM_PROCESS, oldItemProcess, itemProcess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.PROCESS__START_DATE, oldStartDate, startDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.PROCESS__END_DATE, oldEndDate, endDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.PROCESS__STATUS, oldStatus, status));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CooltivarPackage.PROCESS__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CooltivarPackage.PROCESS__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CooltivarPackage.PROCESS__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.PROCESS__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.PROCESS__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActionHistory() {
		if (actionHistory == null) {
			actionHistory = new EObjectContainmentEList<Action>(Action.class, this, CooltivarPackage.PROCESS__ACTION_HISTORY);
		}
		return actionHistory;
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
			case CooltivarPackage.PROCESS__LOCATION:
				return basicSetLocation(null, msgs);
			case CooltivarPackage.PROCESS__ACTION_HISTORY:
				return ((InternalEList<?>)getActionHistory()).basicRemove(otherEnd, msgs);
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
			case CooltivarPackage.PROCESS__ITEM_PROCESS:
				if (resolve) return getItemProcess();
				return basicGetItemProcess();
			case CooltivarPackage.PROCESS__START_DATE:
				return getStartDate();
			case CooltivarPackage.PROCESS__END_DATE:
				return getEndDate();
			case CooltivarPackage.PROCESS__STATUS:
				return getStatus();
			case CooltivarPackage.PROCESS__LOCATION:
				return getLocation();
			case CooltivarPackage.PROCESS__WEIGHT:
				return getWeight();
			case CooltivarPackage.PROCESS__ACTION_HISTORY:
				return getActionHistory();
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
			case CooltivarPackage.PROCESS__ITEM_PROCESS:
				setItemProcess((ItemProcess)newValue);
				return;
			case CooltivarPackage.PROCESS__START_DATE:
				setStartDate((Date)newValue);
				return;
			case CooltivarPackage.PROCESS__END_DATE:
				setEndDate((Date)newValue);
				return;
			case CooltivarPackage.PROCESS__STATUS:
				setStatus((ProcessStatus)newValue);
				return;
			case CooltivarPackage.PROCESS__LOCATION:
				setLocation((Location)newValue);
				return;
			case CooltivarPackage.PROCESS__WEIGHT:
				setWeight((Double)newValue);
				return;
			case CooltivarPackage.PROCESS__ACTION_HISTORY:
				getActionHistory().clear();
				getActionHistory().addAll((Collection<? extends Action>)newValue);
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
			case CooltivarPackage.PROCESS__ITEM_PROCESS:
				setItemProcess((ItemProcess)null);
				return;
			case CooltivarPackage.PROCESS__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case CooltivarPackage.PROCESS__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case CooltivarPackage.PROCESS__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CooltivarPackage.PROCESS__LOCATION:
				setLocation((Location)null);
				return;
			case CooltivarPackage.PROCESS__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case CooltivarPackage.PROCESS__ACTION_HISTORY:
				getActionHistory().clear();
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
			case CooltivarPackage.PROCESS__ITEM_PROCESS:
				return itemProcess != null;
			case CooltivarPackage.PROCESS__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case CooltivarPackage.PROCESS__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case CooltivarPackage.PROCESS__STATUS:
				return status != STATUS_EDEFAULT;
			case CooltivarPackage.PROCESS__LOCATION:
				return location != null;
			case CooltivarPackage.PROCESS__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case CooltivarPackage.PROCESS__ACTION_HISTORY:
				return actionHistory != null && !actionHistory.isEmpty();
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
			case CooltivarPackage.PROCESS___CHECK_FUTURE_DATE:
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", status: ");
		result.append(status);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
