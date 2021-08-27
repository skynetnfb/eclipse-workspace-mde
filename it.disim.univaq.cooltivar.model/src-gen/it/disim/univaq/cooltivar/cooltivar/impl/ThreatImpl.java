/**
 */
package it.disim.univaq.cooltivar.cooltivar.impl;

import it.disim.univaq.cooltivar.cooltivar.Cultivar;
import it.disim.univaq.cooltivar.cooltivar.ModelPackage;
import it.disim.univaq.cooltivar.cooltivar.Remedy;
import it.disim.univaq.cooltivar.cooltivar.Threat;
import it.disim.univaq.cooltivar.cooltivar.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.impl.ThreatImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.impl.ThreatImpl#getRemedies <em>Remedies</em>}</li>
 *   <li>{@link it.disim.univaq.cooltivar.cooltivar.impl.ThreatImpl#getCultivars <em>Cultivars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatImpl extends DescriptedImpl implements Threat {
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
	 * The cached value of the '{@link #getRemedies() <em>Remedies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemedies()
	 * @generated
	 * @ordered
	 */
	protected EList<Remedy> remedies;

	/**
	 * The cached value of the '{@link #getCultivars() <em>Cultivars</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCultivars()
	 * @generated
	 * @ordered
	 */
	protected Cultivar cultivars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.THREAT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.THREAT__AUTHOR, oldAuthor,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Remedy> getRemedies() {
		if (remedies == null) {
			remedies = new EObjectResolvingEList<Remedy>(Remedy.class, this, ModelPackage.THREAT__REMEDIES);
		}
		return remedies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cultivar getCultivars() {
		if (cultivars != null && cultivars.eIsProxy()) {
			InternalEObject oldCultivars = (InternalEObject) cultivars;
			cultivars = (Cultivar) eResolveProxy(oldCultivars);
			if (cultivars != oldCultivars) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.THREAT__CULTIVARS,
							oldCultivars, cultivars));
			}
		}
		return cultivars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cultivar basicGetCultivars() {
		return cultivars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCultivars(Cultivar newCultivars) {
		Cultivar oldCultivars = cultivars;
		cultivars = newCultivars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAT__CULTIVARS, oldCultivars,
					cultivars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.THREAT__AUTHOR:
			if (resolve)
				return getAuthor();
			return basicGetAuthor();
		case ModelPackage.THREAT__REMEDIES:
			return getRemedies();
		case ModelPackage.THREAT__CULTIVARS:
			if (resolve)
				return getCultivars();
			return basicGetCultivars();
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
		case ModelPackage.THREAT__AUTHOR:
			setAuthor((User) newValue);
			return;
		case ModelPackage.THREAT__REMEDIES:
			getRemedies().clear();
			getRemedies().addAll((Collection<? extends Remedy>) newValue);
			return;
		case ModelPackage.THREAT__CULTIVARS:
			setCultivars((Cultivar) newValue);
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
		case ModelPackage.THREAT__AUTHOR:
			setAuthor((User) null);
			return;
		case ModelPackage.THREAT__REMEDIES:
			getRemedies().clear();
			return;
		case ModelPackage.THREAT__CULTIVARS:
			setCultivars((Cultivar) null);
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
		case ModelPackage.THREAT__AUTHOR:
			return author != null;
		case ModelPackage.THREAT__REMEDIES:
			return remedies != null && !remedies.isEmpty();
		case ModelPackage.THREAT__CULTIVARS:
			return cultivars != null;
		}
		return super.eIsSet(featureID);
	}

} //ThreatImpl
