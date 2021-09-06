/**
 */
package cooltivar.impl;

import cooltivar.CooltivarPackage;
import cooltivar.ItemProcess;
import cooltivar.ItemSpecies;
import cooltivar.Problem;
import cooltivar.User;

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
 * An implementation of the model object '<em><b>Item Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cooltivar.impl.ItemProcessImpl#getItemProcessType <em>Item Process Type</em>}</li>
 *   <li>{@link cooltivar.impl.ItemProcessImpl#getProblems <em>Problems</em>}</li>
 *   <li>{@link cooltivar.impl.ItemProcessImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemProcessImpl extends DescriptedImpl implements ItemProcess {
	/**
	 * The cached value of the '{@link #getItemProcessType() <em>Item Process Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemProcessType()
	 * @generated
	 * @ordered
	 */
	protected ItemSpecies itemProcessType;

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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected User author;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CooltivarPackage.Literals.ITEM_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemSpecies getItemProcessType() {
		return itemProcessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemProcessType(ItemSpecies newItemProcessType, NotificationChain msgs) {
		ItemSpecies oldItemProcessType = itemProcessType;
		itemProcessType = newItemProcessType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CooltivarPackage.ITEM_PROCESS__ITEM_PROCESS_TYPE, oldItemProcessType, newItemProcessType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemProcessType(ItemSpecies newItemProcessType) {
		if (newItemProcessType != itemProcessType) {
			NotificationChain msgs = null;
			if (itemProcessType != null)
				msgs = ((InternalEObject)itemProcessType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CooltivarPackage.ITEM_PROCESS__ITEM_PROCESS_TYPE, null, msgs);
			if (newItemProcessType != null)
				msgs = ((InternalEObject)newItemProcessType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CooltivarPackage.ITEM_PROCESS__ITEM_PROCESS_TYPE, null, msgs);
			msgs = basicSetItemProcessType(newItemProcessType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.ITEM_PROCESS__ITEM_PROCESS_TYPE, newItemProcessType, newItemProcessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getProblems() {
		if (problems == null) {
			problems = new EObjectContainmentEList<Problem>(Problem.class, this, CooltivarPackage.ITEM_PROCESS__PROBLEMS);
		}
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (User)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CooltivarPackage.ITEM_PROCESS__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CooltivarPackage.ITEM_PROCESS__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CooltivarPackage.ITEM_PROCESS__ITEM_PROCESS_TYPE:
				return basicSetItemProcessType(null, msgs);
			case CooltivarPackage.ITEM_PROCESS__PROBLEMS:
				return ((InternalEList<?>)getProblems()).basicRemove(otherEnd, msgs);
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
			case CooltivarPackage.ITEM_PROCESS__ITEM_PROCESS_TYPE:
				return getItemProcessType();
			case CooltivarPackage.ITEM_PROCESS__PROBLEMS:
				return getProblems();
			case CooltivarPackage.ITEM_PROCESS__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
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
			case CooltivarPackage.ITEM_PROCESS__ITEM_PROCESS_TYPE:
				setItemProcessType((ItemSpecies)newValue);
				return;
			case CooltivarPackage.ITEM_PROCESS__PROBLEMS:
				getProblems().clear();
				getProblems().addAll((Collection<? extends Problem>)newValue);
				return;
			case CooltivarPackage.ITEM_PROCESS__AUTHOR:
				setAuthor((User)newValue);
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
			case CooltivarPackage.ITEM_PROCESS__ITEM_PROCESS_TYPE:
				setItemProcessType((ItemSpecies)null);
				return;
			case CooltivarPackage.ITEM_PROCESS__PROBLEMS:
				getProblems().clear();
				return;
			case CooltivarPackage.ITEM_PROCESS__AUTHOR:
				setAuthor((User)null);
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
			case CooltivarPackage.ITEM_PROCESS__ITEM_PROCESS_TYPE:
				return itemProcessType != null;
			case CooltivarPackage.ITEM_PROCESS__PROBLEMS:
				return problems != null && !problems.isEmpty();
			case CooltivarPackage.ITEM_PROCESS__AUTHOR:
				return author != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemProcessImpl
