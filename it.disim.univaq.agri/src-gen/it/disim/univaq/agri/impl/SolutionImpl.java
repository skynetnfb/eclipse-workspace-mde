/**
 */
package it.disim.univaq.agri.impl;

import it.disim.univaq.agri.AgriPackage;
import it.disim.univaq.agri.Problem;
import it.disim.univaq.agri.Solution;
import it.disim.univaq.agri.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.agri.impl.SolutionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.SolutionImpl#getProblems <em>Problems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionImpl extends DescriptedImpl implements Solution {
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
	 * The cached value of the '{@link #getProblems() <em>Problems</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected EList<Problem> problems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgriPackage.Literals.SOLUTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgriPackage.SOLUTION__AUTHOR, oldAuthor,
							author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.SOLUTION__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getProblems() {
		if (problems == null) {
			problems = new EObjectResolvingEList<Problem>(Problem.class, this, AgriPackage.SOLUTION__PROBLEMS);
		}
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AgriPackage.SOLUTION__AUTHOR:
			if (resolve)
				return getAuthor();
			return basicGetAuthor();
		case AgriPackage.SOLUTION__PROBLEMS:
			return getProblems();
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
		case AgriPackage.SOLUTION__AUTHOR:
			setAuthor((User) newValue);
			return;
		case AgriPackage.SOLUTION__PROBLEMS:
			getProblems().clear();
			getProblems().addAll((Collection<? extends Problem>) newValue);
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
		case AgriPackage.SOLUTION__AUTHOR:
			setAuthor((User) null);
			return;
		case AgriPackage.SOLUTION__PROBLEMS:
			getProblems().clear();
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
		case AgriPackage.SOLUTION__AUTHOR:
			return author != null;
		case AgriPackage.SOLUTION__PROBLEMS:
			return problems != null && !problems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolutionImpl
