/**
 */
package cooltivar.impl;

import cooltivar.CooltivarPackage;
import cooltivar.ItemProcess;
import cooltivar.Problem;
import cooltivar.Solution;
import cooltivar.User;
import cooltivar.UserType;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 *   <li>{@link cooltivar.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getUname <em>Uname</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getUserType <em>User Type</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getProblems <em>Problems</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getItemProcess <em>Item Process</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link cooltivar.impl.UserImpl#getFullname <em>Fullname</em>}</li>
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
	 * The default value of the '{@link #getUname() <em>Uname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUname()
	 * @generated
	 * @ordered
	 */
	protected static final String UNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUname() <em>Uname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUname()
	 * @generated
	 * @ordered
	 */
	protected String uname = UNAME_EDEFAULT;

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
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

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
	protected EList<ItemProcess> itemProcess;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<cooltivar.Process> process;

	/**
	 * The cached setting delegate for the '{@link #getFullname() <em>Fullname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullname()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FULLNAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)CooltivarPackage.Literals.USER__FULLNAME).getSettingDelegate();

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
		return CooltivarPackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.USER__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.USER__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUname(String newUname) {
		String oldUname = uname;
		uname = newUname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.USER__UNAME, oldUname, uname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.USER__BIRTHDATE, oldBirthdate, birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.USER__SURNAME, oldSurname, surname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.USER__USER_TYPE, oldUserType, userType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<Solution>(Solution.class, this, CooltivarPackage.USER__SOLUTIONS);
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
			problems = new EObjectContainmentEList<Problem>(Problem.class, this, CooltivarPackage.USER__PROBLEMS);
		}
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemProcess> getItemProcess() {
		if (itemProcess == null) {
			itemProcess = new EObjectContainmentEList<ItemProcess>(ItemProcess.class, this, CooltivarPackage.USER__ITEM_PROCESS);
		}
		return itemProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<cooltivar.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<cooltivar.Process>(cooltivar.Process.class, this, CooltivarPackage.USER__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullname() {
		return (String)FULLNAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullname(String newFullname) {
		FULLNAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newFullname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CooltivarPackage.USER__SOLUTIONS:
				return ((InternalEList<?>)getSolutions()).basicRemove(otherEnd, msgs);
			case CooltivarPackage.USER__PROBLEMS:
				return ((InternalEList<?>)getProblems()).basicRemove(otherEnd, msgs);
			case CooltivarPackage.USER__ITEM_PROCESS:
				return ((InternalEList<?>)getItemProcess()).basicRemove(otherEnd, msgs);
			case CooltivarPackage.USER__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
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
			case CooltivarPackage.USER__EMAIL:
				return getEmail();
			case CooltivarPackage.USER__USERNAME:
				return getUsername();
			case CooltivarPackage.USER__UNAME:
				return getUname();
			case CooltivarPackage.USER__BIRTHDATE:
				return getBirthdate();
			case CooltivarPackage.USER__SURNAME:
				return getSurname();
			case CooltivarPackage.USER__USER_TYPE:
				return getUserType();
			case CooltivarPackage.USER__SOLUTIONS:
				return getSolutions();
			case CooltivarPackage.USER__PROBLEMS:
				return getProblems();
			case CooltivarPackage.USER__ITEM_PROCESS:
				return getItemProcess();
			case CooltivarPackage.USER__PROCESS:
				return getProcess();
			case CooltivarPackage.USER__FULLNAME:
				return getFullname();
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
			case CooltivarPackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
			case CooltivarPackage.USER__USERNAME:
				setUsername((String)newValue);
				return;
			case CooltivarPackage.USER__UNAME:
				setUname((String)newValue);
				return;
			case CooltivarPackage.USER__BIRTHDATE:
				setBirthdate((Date)newValue);
				return;
			case CooltivarPackage.USER__SURNAME:
				setSurname((String)newValue);
				return;
			case CooltivarPackage.USER__USER_TYPE:
				setUserType((UserType)newValue);
				return;
			case CooltivarPackage.USER__SOLUTIONS:
				getSolutions().clear();
				getSolutions().addAll((Collection<? extends Solution>)newValue);
				return;
			case CooltivarPackage.USER__PROBLEMS:
				getProblems().clear();
				getProblems().addAll((Collection<? extends Problem>)newValue);
				return;
			case CooltivarPackage.USER__ITEM_PROCESS:
				getItemProcess().clear();
				getItemProcess().addAll((Collection<? extends ItemProcess>)newValue);
				return;
			case CooltivarPackage.USER__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends cooltivar.Process>)newValue);
				return;
			case CooltivarPackage.USER__FULLNAME:
				setFullname((String)newValue);
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
			case CooltivarPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case CooltivarPackage.USER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case CooltivarPackage.USER__UNAME:
				setUname(UNAME_EDEFAULT);
				return;
			case CooltivarPackage.USER__BIRTHDATE:
				setBirthdate(BIRTHDATE_EDEFAULT);
				return;
			case CooltivarPackage.USER__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case CooltivarPackage.USER__USER_TYPE:
				setUserType(USER_TYPE_EDEFAULT);
				return;
			case CooltivarPackage.USER__SOLUTIONS:
				getSolutions().clear();
				return;
			case CooltivarPackage.USER__PROBLEMS:
				getProblems().clear();
				return;
			case CooltivarPackage.USER__ITEM_PROCESS:
				getItemProcess().clear();
				return;
			case CooltivarPackage.USER__PROCESS:
				getProcess().clear();
				return;
			case CooltivarPackage.USER__FULLNAME:
				FULLNAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case CooltivarPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case CooltivarPackage.USER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case CooltivarPackage.USER__UNAME:
				return UNAME_EDEFAULT == null ? uname != null : !UNAME_EDEFAULT.equals(uname);
			case CooltivarPackage.USER__BIRTHDATE:
				return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
			case CooltivarPackage.USER__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case CooltivarPackage.USER__USER_TYPE:
				return userType != USER_TYPE_EDEFAULT;
			case CooltivarPackage.USER__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
			case CooltivarPackage.USER__PROBLEMS:
				return problems != null && !problems.isEmpty();
			case CooltivarPackage.USER__ITEM_PROCESS:
				return itemProcess != null && !itemProcess.isEmpty();
			case CooltivarPackage.USER__PROCESS:
				return process != null && !process.isEmpty();
			case CooltivarPackage.USER__FULLNAME:
				return FULLNAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (email: ");
		result.append(email);
		result.append(", username: ");
		result.append(username);
		result.append(", uname: ");
		result.append(uname);
		result.append(", birthdate: ");
		result.append(birthdate);
		result.append(", surname: ");
		result.append(surname);
		result.append(", userType: ");
		result.append(userType);
		result.append(')');
		return result.toString();
	}

} //UserImpl
