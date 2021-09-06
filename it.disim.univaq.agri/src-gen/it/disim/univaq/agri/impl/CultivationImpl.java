/**
 */
package it.disim.univaq.agri.impl;

import it.disim.univaq.agri.Action;
import it.disim.univaq.agri.AgriPackage;
import it.disim.univaq.agri.Cultivation;
import it.disim.univaq.agri.Plant;
import it.disim.univaq.agri.ProcessStatus;

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
 * An implementation of the model object '<em><b>Cultivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.agri.impl.CultivationImpl#getPlant <em>Plant</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.CultivationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.CultivationImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.CultivationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.CultivationImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.CultivationImpl#getActionHistory <em>Action History</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.CultivationImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CultivationImpl extends DescriptedImpl implements Cultivation {
	/**
	 * The cached value of the '{@link #getPlant() <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlant()
	 * @generated
	 * @ordered
	 */
	protected Plant plant;

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CultivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgriPackage.Literals.CULTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant getPlant() {
		if (plant != null && plant.eIsProxy()) {
			InternalEObject oldPlant = (InternalEObject) plant;
			plant = (Plant) eResolveProxy(oldPlant);
			if (plant != oldPlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgriPackage.CULTIVATION__PLANT, oldPlant,
							plant));
			}
		}
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant basicGetPlant() {
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlant(Plant newPlant) {
		Plant oldPlant = plant;
		plant = newPlant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.CULTIVATION__PLANT, oldPlant, plant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.CULTIVATION__START_DATE, oldStartDate,
					startDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.CULTIVATION__END_DATE, oldEndDate,
					endDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.CULTIVATION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.CULTIVATION__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActionHistory() {
		if (actionHistory == null) {
			actionHistory = new EObjectContainmentEList<Action>(Action.class, this,
					AgriPackage.CULTIVATION__ACTION_HISTORY);
		}
		return actionHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.CULTIVATION__LOCATION, oldLocation,
					location));
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
		case AgriPackage.CULTIVATION__ACTION_HISTORY:
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
		case AgriPackage.CULTIVATION__PLANT:
			if (resolve)
				return getPlant();
			return basicGetPlant();
		case AgriPackage.CULTIVATION__START_DATE:
			return getStartDate();
		case AgriPackage.CULTIVATION__END_DATE:
			return getEndDate();
		case AgriPackage.CULTIVATION__STATUS:
			return getStatus();
		case AgriPackage.CULTIVATION__WEIGHT:
			return getWeight();
		case AgriPackage.CULTIVATION__ACTION_HISTORY:
			return getActionHistory();
		case AgriPackage.CULTIVATION__LOCATION:
			return getLocation();
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
		case AgriPackage.CULTIVATION__PLANT:
			setPlant((Plant) newValue);
			return;
		case AgriPackage.CULTIVATION__START_DATE:
			setStartDate((Date) newValue);
			return;
		case AgriPackage.CULTIVATION__END_DATE:
			setEndDate((Date) newValue);
			return;
		case AgriPackage.CULTIVATION__STATUS:
			setStatus((ProcessStatus) newValue);
			return;
		case AgriPackage.CULTIVATION__WEIGHT:
			setWeight((Double) newValue);
			return;
		case AgriPackage.CULTIVATION__ACTION_HISTORY:
			getActionHistory().clear();
			getActionHistory().addAll((Collection<? extends Action>) newValue);
			return;
		case AgriPackage.CULTIVATION__LOCATION:
			setLocation((String) newValue);
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
		case AgriPackage.CULTIVATION__PLANT:
			setPlant((Plant) null);
			return;
		case AgriPackage.CULTIVATION__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case AgriPackage.CULTIVATION__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		case AgriPackage.CULTIVATION__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case AgriPackage.CULTIVATION__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case AgriPackage.CULTIVATION__ACTION_HISTORY:
			getActionHistory().clear();
			return;
		case AgriPackage.CULTIVATION__LOCATION:
			setLocation(LOCATION_EDEFAULT);
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
		case AgriPackage.CULTIVATION__PLANT:
			return plant != null;
		case AgriPackage.CULTIVATION__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case AgriPackage.CULTIVATION__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		case AgriPackage.CULTIVATION__STATUS:
			return status != STATUS_EDEFAULT;
		case AgriPackage.CULTIVATION__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case AgriPackage.CULTIVATION__ACTION_HISTORY:
			return actionHistory != null && !actionHistory.isEmpty();
		case AgriPackage.CULTIVATION__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
		case AgriPackage.CULTIVATION___CHECK_FUTURE_DATE:
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", status: ");
		result.append(status);
		result.append(", weight: ");
		result.append(weight);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //CultivationImpl
