/**
 */
package it.disim.univaq.porcessmanagement.impl;

import it.disim.univaq.porcessmanagement.ItemProcess;
import it.disim.univaq.porcessmanagement.PorcessmanagementPackage;
import it.disim.univaq.porcessmanagement.Problem;
import it.disim.univaq.porcessmanagement.Solution;
import it.disim.univaq.porcessmanagement.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProblemImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProblemImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link it.disim.univaq.porcessmanagement.impl.ProblemImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProblemImpl extends DescriptedImpl implements Problem {
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected User author;

	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solutions;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected ItemProcess process;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PorcessmanagementPackage.Literals.PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject) author;
			author = (User) eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PorcessmanagementPackage.PROBLEM__AUTHOR,
							oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(User newAuthor) {
		User oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.PROBLEM__AUTHOR, oldAuthor,
					author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectResolvingEList<Solution>(Solution.class, this,
					PorcessmanagementPackage.PROBLEM__SOLUTIONS);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemProcess getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject) process;
			process = (ItemProcess) eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PorcessmanagementPackage.PROBLEM__PROCESS,
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
	public ItemProcess basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(ItemProcess newProcess) {
		ItemProcess oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PorcessmanagementPackage.PROBLEM__PROCESS, oldProcess,
					process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PorcessmanagementPackage.PROBLEM__AUTHOR:
			if (resolve)
				return getAuthor();
			return basicGetAuthor();
		case PorcessmanagementPackage.PROBLEM__SOLUTIONS:
			return getSolutions();
		case PorcessmanagementPackage.PROBLEM__PROCESS:
			if (resolve)
				return getProcess();
			return basicGetProcess();
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
		case PorcessmanagementPackage.PROBLEM__AUTHOR:
			setAuthor((User) newValue);
			return;
		case PorcessmanagementPackage.PROBLEM__SOLUTIONS:
			getSolutions().clear();
			getSolutions().addAll((Collection<? extends Solution>) newValue);
			return;
		case PorcessmanagementPackage.PROBLEM__PROCESS:
			setProcess((ItemProcess) newValue);
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
		case PorcessmanagementPackage.PROBLEM__AUTHOR:
			setAuthor((User) null);
			return;
		case PorcessmanagementPackage.PROBLEM__SOLUTIONS:
			getSolutions().clear();
			return;
		case PorcessmanagementPackage.PROBLEM__PROCESS:
			setProcess((ItemProcess) null);
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
		case PorcessmanagementPackage.PROBLEM__AUTHOR:
			return author != null;
		case PorcessmanagementPackage.PROBLEM__SOLUTIONS:
			return solutions != null && !solutions.isEmpty();
		case PorcessmanagementPackage.PROBLEM__PROCESS:
			return process != null;
		}
		return super.eIsSet(featureID);
	}

} //ProblemImpl
