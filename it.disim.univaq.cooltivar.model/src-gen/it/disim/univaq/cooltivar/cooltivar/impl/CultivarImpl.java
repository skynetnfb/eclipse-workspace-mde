/**
 */
package it.disim.univaq.cooltivar.cooltivar.impl;

import it.disim.univaq.cooltivar.cooltivar.Cultivar;
import it.disim.univaq.cooltivar.cooltivar.ModelPackage;
import it.disim.univaq.cooltivar.cooltivar.PlantSpecies;
import it.disim.univaq.cooltivar.cooltivar.Threat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cultivar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.impl.CultivarImpl#getPlantSpecies <em>Plant Species</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.impl.CultivarImpl#getThreats <em>Threats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CultivarImpl extends MinimalEObjectImpl.Container implements Cultivar {
	/**
	 * The cached value of the '{@link #getPlantSpecies() <em>Plant Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantSpecies()
	 * @generated
	 * @ordered
	 */
	protected PlantSpecies plantSpecies;

	/**
	 * The cached value of the '{@link #getThreats() <em>Threats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreats()
	 * @generated
	 * @ordered
	 */
	protected EList<Threat> threats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CultivarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CULTIVAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantSpecies getPlantSpecies() {
		if (plantSpecies != null && plantSpecies.eIsProxy()) {
			InternalEObject oldPlantSpecies = (InternalEObject) plantSpecies;
			plantSpecies = (PlantSpecies) eResolveProxy(oldPlantSpecies);
			if (plantSpecies != oldPlantSpecies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CULTIVAR__PLANT_SPECIES,
							oldPlantSpecies, plantSpecies));
			}
		}
		return plantSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantSpecies basicGetPlantSpecies() {
		return plantSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantSpecies(PlantSpecies newPlantSpecies) {
		PlantSpecies oldPlantSpecies = plantSpecies;
		plantSpecies = newPlantSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CULTIVAR__PLANT_SPECIES, oldPlantSpecies,
					plantSpecies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Threat> getThreats() {
		if (threats == null) {
			threats = new EObjectContainmentEList<Threat>(Threat.class, this, ModelPackage.CULTIVAR__THREATS);
		}
		return threats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.CULTIVAR__THREATS:
			return ((InternalEList<?>) getThreats()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.CULTIVAR__PLANT_SPECIES:
			if (resolve)
				return getPlantSpecies();
			return basicGetPlantSpecies();
		case ModelPackage.CULTIVAR__THREATS:
			return getThreats();
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
		case ModelPackage.CULTIVAR__PLANT_SPECIES:
			setPlantSpecies((PlantSpecies) newValue);
			return;
		case ModelPackage.CULTIVAR__THREATS:
			getThreats().clear();
			getThreats().addAll((Collection<? extends Threat>) newValue);
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
		case ModelPackage.CULTIVAR__PLANT_SPECIES:
			setPlantSpecies((PlantSpecies) null);
			return;
		case ModelPackage.CULTIVAR__THREATS:
			getThreats().clear();
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
		case ModelPackage.CULTIVAR__PLANT_SPECIES:
			return plantSpecies != null;
		case ModelPackage.CULTIVAR__THREATS:
			return threats != null && !threats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CultivarImpl
