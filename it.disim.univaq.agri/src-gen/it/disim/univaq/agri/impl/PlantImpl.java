/**
 */
package it.disim.univaq.agri.impl;

import it.disim.univaq.agri.AgriPackage;
import it.disim.univaq.agri.Plant;
import it.disim.univaq.agri.Problem;
import it.disim.univaq.agri.User;

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
 * An implementation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.agri.impl.PlantImpl#getProblems <em>Problems</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.PlantImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link it.disim.univaq.agri.impl.PlantImpl#getPlantSpecies <em>Plant Species</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantImpl extends DescriptedImpl implements Plant {
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
	 * The default value of the '{@link #getPlantSpecies() <em>Plant Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantSpecies()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANT_SPECIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlantSpecies() <em>Plant Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantSpecies()
	 * @generated
	 * @ordered
	 */
	protected String plantSpecies = PLANT_SPECIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgriPackage.Literals.PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getProblems() {
		if (problems == null) {
			problems = new EObjectContainmentEList<Problem>(Problem.class, this, AgriPackage.PLANT__PROBLEMS);
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
			InternalEObject oldAuthor = (InternalEObject) author;
			author = (User) eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgriPackage.PLANT__AUTHOR, oldAuthor,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.PLANT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlantSpecies() {
		return plantSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantSpecies(String newPlantSpecies) {
		String oldPlantSpecies = plantSpecies;
		plantSpecies = newPlantSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgriPackage.PLANT__PLANT_SPECIES, oldPlantSpecies,
					plantSpecies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AgriPackage.PLANT__PROBLEMS:
			return ((InternalEList<?>) getProblems()).basicRemove(otherEnd, msgs);
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
		case AgriPackage.PLANT__PROBLEMS:
			return getProblems();
		case AgriPackage.PLANT__AUTHOR:
			if (resolve)
				return getAuthor();
			return basicGetAuthor();
		case AgriPackage.PLANT__PLANT_SPECIES:
			return getPlantSpecies();
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
		case AgriPackage.PLANT__PROBLEMS:
			getProblems().clear();
			getProblems().addAll((Collection<? extends Problem>) newValue);
			return;
		case AgriPackage.PLANT__AUTHOR:
			setAuthor((User) newValue);
			return;
		case AgriPackage.PLANT__PLANT_SPECIES:
			setPlantSpecies((String) newValue);
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
		case AgriPackage.PLANT__PROBLEMS:
			getProblems().clear();
			return;
		case AgriPackage.PLANT__AUTHOR:
			setAuthor((User) null);
			return;
		case AgriPackage.PLANT__PLANT_SPECIES:
			setPlantSpecies(PLANT_SPECIES_EDEFAULT);
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
		case AgriPackage.PLANT__PROBLEMS:
			return problems != null && !problems.isEmpty();
		case AgriPackage.PLANT__AUTHOR:
			return author != null;
		case AgriPackage.PLANT__PLANT_SPECIES:
			return PLANT_SPECIES_EDEFAULT == null ? plantSpecies != null : !PLANT_SPECIES_EDEFAULT.equals(plantSpecies);
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
		result.append(" (plantSpecies: ");
		result.append(plantSpecies);
		result.append(')');
		return result.toString();
	}

} //PlantImpl
