/**
 */
package it.disim.univaq.agri.impl;

import it.disim.univaq.agri.Action;
import it.disim.univaq.agri.Agri;
import it.disim.univaq.agri.AgriPackage;
import it.disim.univaq.agri.Cultivation;
import it.disim.univaq.agri.Plant;
import it.disim.univaq.agri.Problem;
import it.disim.univaq.agri.Solution;
import it.disim.univaq.agri.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agri</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.agri.impl.AgriImpl#getUser <em>User</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.AgriImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.AgriImpl#getSolution <em>Solution</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.AgriImpl#getItemProcess <em>Item Process</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.AgriImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.AgriImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgriImpl extends MinimalEObjectImpl.Container implements Agri {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected EList<Problem> problem;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solution;

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
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<Cultivation> process;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgriImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgriPackage.Literals.AGRI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, AgriPackage.AGRI__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getProblem() {
		if (problem == null) {
			problem = new EObjectContainmentEList<Problem>(Problem.class, this, AgriPackage.AGRI__PROBLEM);
		}
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolution() {
		if (solution == null) {
			solution = new EObjectContainmentEList<Solution>(Solution.class, this, AgriPackage.AGRI__SOLUTION);
		}
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plant> getItemProcess() {
		if (itemProcess == null) {
			itemProcess = new EObjectContainmentEList<Plant>(Plant.class, this, AgriPackage.AGRI__ITEM_PROCESS);
		}
		return itemProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cultivation> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<Cultivation>(Cultivation.class, this, AgriPackage.AGRI__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, AgriPackage.AGRI__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AgriPackage.AGRI__USER:
			return ((InternalEList<?>) getUser()).basicRemove(otherEnd, msgs);
		case AgriPackage.AGRI__PROBLEM:
			return ((InternalEList<?>) getProblem()).basicRemove(otherEnd, msgs);
		case AgriPackage.AGRI__SOLUTION:
			return ((InternalEList<?>) getSolution()).basicRemove(otherEnd, msgs);
		case AgriPackage.AGRI__ITEM_PROCESS:
			return ((InternalEList<?>) getItemProcess()).basicRemove(otherEnd, msgs);
		case AgriPackage.AGRI__PROCESS:
			return ((InternalEList<?>) getProcess()).basicRemove(otherEnd, msgs);
		case AgriPackage.AGRI__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
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
		case AgriPackage.AGRI__USER:
			return getUser();
		case AgriPackage.AGRI__PROBLEM:
			return getProblem();
		case AgriPackage.AGRI__SOLUTION:
			return getSolution();
		case AgriPackage.AGRI__ITEM_PROCESS:
			return getItemProcess();
		case AgriPackage.AGRI__PROCESS:
			return getProcess();
		case AgriPackage.AGRI__ACTION:
			return getAction();
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
		case AgriPackage.AGRI__USER:
			getUser().clear();
			getUser().addAll((Collection<? extends User>) newValue);
			return;
		case AgriPackage.AGRI__PROBLEM:
			getProblem().clear();
			getProblem().addAll((Collection<? extends Problem>) newValue);
			return;
		case AgriPackage.AGRI__SOLUTION:
			getSolution().clear();
			getSolution().addAll((Collection<? extends Solution>) newValue);
			return;
		case AgriPackage.AGRI__ITEM_PROCESS:
			getItemProcess().clear();
			getItemProcess().addAll((Collection<? extends Plant>) newValue);
			return;
		case AgriPackage.AGRI__PROCESS:
			getProcess().clear();
			getProcess().addAll((Collection<? extends Cultivation>) newValue);
			return;
		case AgriPackage.AGRI__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
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
		case AgriPackage.AGRI__USER:
			getUser().clear();
			return;
		case AgriPackage.AGRI__PROBLEM:
			getProblem().clear();
			return;
		case AgriPackage.AGRI__SOLUTION:
			getSolution().clear();
			return;
		case AgriPackage.AGRI__ITEM_PROCESS:
			getItemProcess().clear();
			return;
		case AgriPackage.AGRI__PROCESS:
			getProcess().clear();
			return;
		case AgriPackage.AGRI__ACTION:
			getAction().clear();
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
		case AgriPackage.AGRI__USER:
			return user != null && !user.isEmpty();
		case AgriPackage.AGRI__PROBLEM:
			return problem != null && !problem.isEmpty();
		case AgriPackage.AGRI__SOLUTION:
			return solution != null && !solution.isEmpty();
		case AgriPackage.AGRI__ITEM_PROCESS:
			return itemProcess != null && !itemProcess.isEmpty();
		case AgriPackage.AGRI__PROCESS:
			return process != null && !process.isEmpty();
		case AgriPackage.AGRI__ACTION:
			return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgriImpl
