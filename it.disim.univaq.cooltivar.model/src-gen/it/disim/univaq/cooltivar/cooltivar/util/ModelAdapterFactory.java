/**
 */
package it.disim.univaq.cooltivar.cooltivar.util;

import it.disim.univaq.cooltivar.cooltivar.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.disim.univaq.cooltivar.cooltivar.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch = new ModelSwitch<Adapter>() {
		@Override
		public Adapter caseApplication(Application object) {
			return createApplicationAdapter();
		}

		@Override
		public Adapter caseDescripted(Descripted object) {
			return createDescriptedAdapter();
		}

		@Override
		public Adapter caseCultivar(Cultivar object) {
			return createCultivarAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseCultivation(Cultivation object) {
			return createCultivationAdapter();
		}

		@Override
		public Adapter casePlantSpecies(PlantSpecies object) {
			return createPlantSpeciesAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseThreat(Threat object) {
			return createThreatAdapter();
		}

		@Override
		public Adapter caseRemedy(Remedy object) {
			return createRemedyAdapter();
		}

		@Override
		public Adapter caseField(Field object) {
			return createFieldAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.Descripted <em>Descripted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.Descripted
	 * @generated
	 */
	public Adapter createDescriptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.Cultivar <em>Cultivar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.Cultivar
	 * @generated
	 */
	public Adapter createCultivarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.Cultivation <em>Cultivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.Cultivation
	 * @generated
	 */
	public Adapter createCultivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.PlantSpecies <em>Plant Species</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.PlantSpecies
	 * @generated
	 */
	public Adapter createPlantSpeciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.Threat
	 * @generated
	 */
	public Adapter createThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.Remedy <em>Remedy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.Remedy
	 * @generated
	 */
	public Adapter createRemedyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.disim.univaq.cooltivar.cooltivar.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.disim.univaq.cooltivar.cooltivar.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
