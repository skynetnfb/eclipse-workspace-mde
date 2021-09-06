/**
 */
package it.disim.univaq.agri.impl;

import it.disim.univaq.agri.AgriPackage;
import it.disim.univaq.agri.Cultivation;
import it.disim.univaq.agri.Plant;
import it.disim.univaq.agri.Problem;
import it.disim.univaq.agri.Solution;
import it.disim.univaq.agri.User;
import it.disim.univaq.agri.UserType;

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
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.agri.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.UserImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.UserImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.UserImpl#getUserType <em>User Type</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.UserImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.UserImpl#getProblems <em>Problems</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.UserImpl#getItemProcess <em>Item Process</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.UserImpl#getCultivations <em>Cultivations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends DescriptedImpl implements User {
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTHDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Date birthdate = BIRTHDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserType() <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected static final UserType USER_TYPE_EDEFAULT = UserType.ADMIN;

	/**
	 * The cached value of the '{@link #getUserType() <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected UserType userType = USER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solutions;

	/**
	 * The cached value of the '{@link #getProblems() <em>Problems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected EList<Problem> problems;

	/**
	 * The cached value of the '{@link #getItemProcess() <em>Item Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<Plant> itemProcess;

	/**
	 * The cached value of the '{@link #getCultivations() <em>Cultivations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCultivations()
	 * @generated
	 * @ordered
	 */
	protected EList<Cultivation> cultivations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgriPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.USER__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.USER__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Date newBirthdate) {
		Date oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.USER__BIRTHDATE, oldBirthdate,
					birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType getUserType() {
		return userType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserType(UserType newUserType) {
		UserType oldUserType = userType;
		userType = newUserType == null ? USER_TYPE_EDEFAULT : newUserType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.USER__USER_TYPE, oldUserType, userType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<Solution>(Solution.class, this, AgriPackage.USER__SOLUTIONS);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getProblems() {
		if (problems == null) {
			problems = new EObjectContainmentEList<Problem>(Problem.class, this, AgriPackage.USER__PROBLEMS);
		}
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plant> getItemProcess() {
		if (itemProcess == null) {
			itemProcess = new EObjectContainmentEList<Plant>(Plant.class, this, AgriPackage.USER__ITEM_PROCESS);
		}
		return itemProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cultivation> getCultivations() {
		if (cultivations == null) {
			cultivations = new EObjectContainmentEList<Cultivation>(Cultivation.class, this,
					AgriPackage.USER__CULTIVATIONS);
		}
		return cultivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AgriPackage.USER__SOLUTIONS:
			return ((InternalEList<?>) getSolutions()).basicRemove(otherEnd, msgs);
		case AgriPackage.USER__PROBLEMS:
			return ((InternalEList<?>) getProblems()).basicRemove(otherEnd, msgs);
		case AgriPackage.USER__ITEM_PROCESS:
			return ((InternalEList<?>) getItemProcess()).basicRemove(otherEnd, msgs);
		case AgriPackage.USER__CULTIVATIONS:
			return ((InternalEList<?>) getCultivations()).basicRemove(otherEnd, msgs);
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
		case AgriPackage.USER__EMAIL:
			return getEmail();
		case AgriPackage.USER__USERNAME:
			return getUsername();
		case AgriPackage.USER__FULL_NAME:
			return getFullName();
		case AgriPackage.USER__BIRTHDATE:
			return getBirthdate();
		case AgriPackage.USER__USER_TYPE:
			return getUserType();
		case AgriPackage.USER__SOLUTIONS:
			return getSolutions();
		case AgriPackage.USER__PROBLEMS:
			return getProblems();
		case AgriPackage.USER__ITEM_PROCESS:
			return getItemProcess();
		case AgriPackage.USER__CULTIVATIONS:
			return getCultivations();
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
		case AgriPackage.USER__EMAIL:
			setEmail((String) newValue);
			return;
		case AgriPackage.USER__USERNAME:
			setUsername((String) newValue);
			return;
		case AgriPackage.USER__FULL_NAME:
			setFullName((String) newValue);
			return;
		case AgriPackage.USER__BIRTHDATE:
			setBirthdate((Date) newValue);
			return;
		case AgriPackage.USER__USER_TYPE:
			setUserType((UserType) newValue);
			return;
		case AgriPackage.USER__SOLUTIONS:
			getSolutions().clear();
			getSolutions().addAll((Collection<? extends Solution>) newValue);
			return;
		case AgriPackage.USER__PROBLEMS:
			getProblems().clear();
			getProblems().addAll((Collection<? extends Problem>) newValue);
			return;
		case AgriPackage.USER__ITEM_PROCESS:
			getItemProcess().clear();
			getItemProcess().addAll((Collection<? extends Plant>) newValue);
			return;
		case AgriPackage.USER__CULTIVATIONS:
			getCultivations().clear();
			getCultivations().addAll((Collection<? extends Cultivation>) newValue);
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
		case AgriPackage.USER__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case AgriPackage.USER__USERNAME:
			setUsername(USERNAME_EDEFAULT);
			return;
		case AgriPackage.USER__FULL_NAME:
			setFullName(FULL_NAME_EDEFAULT);
			return;
		case AgriPackage.USER__BIRTHDATE:
			setBirthdate(BIRTHDATE_EDEFAULT);
			return;
		case AgriPackage.USER__USER_TYPE:
			setUserType(USER_TYPE_EDEFAULT);
			return;
		case AgriPackage.USER__SOLUTIONS:
			getSolutions().clear();
			return;
		case AgriPackage.USER__PROBLEMS:
			getProblems().clear();
			return;
		case AgriPackage.USER__ITEM_PROCESS:
			getItemProcess().clear();
			return;
		case AgriPackage.USER__CULTIVATIONS:
			getCultivations().clear();
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
		case AgriPackage.USER__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case AgriPackage.USER__USERNAME:
			return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
		case AgriPackage.USER__FULL_NAME:
			return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
		case AgriPackage.USER__BIRTHDATE:
			return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
		case AgriPackage.USER__USER_TYPE:
			return userType != USER_TYPE_EDEFAULT;
		case AgriPackage.USER__SOLUTIONS:
			return solutions != null && !solutions.isEmpty();
		case AgriPackage.USER__PROBLEMS:
			return problems != null && !problems.isEmpty();
		case AgriPackage.USER__ITEM_PROCESS:
			return itemProcess != null && !itemProcess.isEmpty();
		case AgriPackage.USER__CULTIVATIONS:
			return cultivations != null && !cultivations.isEmpty();
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
		result.append(" (email: ");
		result.append(email);
		result.append(", username: ");
		result.append(username);
		result.append(", fullName: ");
		result.append(fullName);
		result.append(", birthdate: ");
		result.append(birthdate);
		result.append(", userType: ");
		result.append(userType);
		result.append(')');
		return result.toString();
	}

} //UserImpl
