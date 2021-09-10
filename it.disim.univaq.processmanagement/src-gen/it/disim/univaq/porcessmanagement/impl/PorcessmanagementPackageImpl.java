/**
 */
package it.disim.univaq.porcessmanagement.impl;

import it.disim.univaq.porcessmanagement.Action;
import it.disim.univaq.porcessmanagement.ActionStatus;
import it.disim.univaq.porcessmanagement.ActionType;
import it.disim.univaq.porcessmanagement.Application;
import it.disim.univaq.porcessmanagement.Descripted;
import it.disim.univaq.porcessmanagement.ItemProcess;
import it.disim.univaq.porcessmanagement.ItemSpecies;
import it.disim.univaq.porcessmanagement.Location;
import it.disim.univaq.porcessmanagement.PorcessmanagementFactory;
import it.disim.univaq.porcessmanagement.PorcessmanagementPackage;
import it.disim.univaq.porcessmanagement.Problem;
import it.disim.univaq.porcessmanagement.ProcessStatus;
import it.disim.univaq.porcessmanagement.Solution;
import it.disim.univaq.porcessmanagement.User;
import it.disim.univaq.porcessmanagement.UserType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PorcessmanagementPackageImpl extends EPackageImpl implements PorcessmanagementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemSpeciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PorcessmanagementPackageImpl() {
		super(eNS_URI, PorcessmanagementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PorcessmanagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PorcessmanagementPackage init() {
		if (isInited)
			return (PorcessmanagementPackage) EPackage.Registry.INSTANCE.getEPackage(PorcessmanagementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPorcessmanagementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PorcessmanagementPackageImpl thePorcessmanagementPackage = registeredPorcessmanagementPackage instanceof PorcessmanagementPackageImpl
				? (PorcessmanagementPackageImpl) registeredPorcessmanagementPackage
				: new PorcessmanagementPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePorcessmanagementPackage.createPackageContents();

		// Initialize created meta-data
		thePorcessmanagementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePorcessmanagementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PorcessmanagementPackage.eNS_URI, thePorcessmanagementPackage);
		return thePorcessmanagementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_User() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescripted() {
		return descriptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescripted_Description() {
		return (EAttribute) descriptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescripted_Name() {
		return (EAttribute) descriptedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemProcess() {
		return itemProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemProcess_ItemProcessType() {
		return (EReference) itemProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemProcess_Problems() {
		return (EReference) itemProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemProcess_Author() {
		return (EReference) itemProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Username() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Surname() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserType() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Solutions() {
		return (EReference) userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Problems() {
		return (EReference) userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_ItemProcess() {
		return (EReference) userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Process() {
		return (EReference) userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Birthdate() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_ItemProcess() {
		return (EReference) processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Status() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Location() {
		return (EReference) processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_ActionHistory() {
		return (EReference) processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_StartDate() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_EndDate() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Weight() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcess__CheckFutureDate() {
		return processEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemSpecies() {
		return itemSpeciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Problem() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Solution() {
		return (EReference) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_ActionsType() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_ActionStatus() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Process() {
		return (EReference) actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_StartDate() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_EndDate() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblem() {
		return problemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_Author() {
		return (EReference) problemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_Solutions() {
		return (EReference) problemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_Process() {
		return (EReference) problemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Author() {
		return (EReference) solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Problems() {
		return (EReference) solutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Coordinates() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessStatus() {
		return processStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionStatus() {
		return actionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserType() {
		return userTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PorcessmanagementFactory getPorcessmanagementFactory() {
		return (PorcessmanagementFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__USER);

		descriptedEClass = createEClass(DESCRIPTED);
		createEAttribute(descriptedEClass, DESCRIPTED__DESCRIPTION);
		createEAttribute(descriptedEClass, DESCRIPTED__NAME);

		itemProcessEClass = createEClass(ITEM_PROCESS);
		createEReference(itemProcessEClass, ITEM_PROCESS__ITEM_PROCESS_TYPE);
		createEReference(itemProcessEClass, ITEM_PROCESS__PROBLEMS);
		createEReference(itemProcessEClass, ITEM_PROCESS__AUTHOR);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__SURNAME);
		createEAttribute(userEClass, USER__USER_TYPE);
		createEReference(userEClass, USER__SOLUTIONS);
		createEReference(userEClass, USER__PROBLEMS);
		createEReference(userEClass, USER__ITEM_PROCESS);
		createEReference(userEClass, USER__PROCESS);
		createEAttribute(userEClass, USER__BIRTHDATE);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__ITEM_PROCESS);
		createEAttribute(processEClass, PROCESS__STATUS);
		createEReference(processEClass, PROCESS__LOCATION);
		createEReference(processEClass, PROCESS__ACTION_HISTORY);
		createEAttribute(processEClass, PROCESS__START_DATE);
		createEAttribute(processEClass, PROCESS__END_DATE);
		createEAttribute(processEClass, PROCESS__WEIGHT);
		createEOperation(processEClass, PROCESS___CHECK_FUTURE_DATE);

		itemSpeciesEClass = createEClass(ITEM_SPECIES);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__PROBLEM);
		createEReference(actionEClass, ACTION__SOLUTION);
		createEAttribute(actionEClass, ACTION__ACTIONS_TYPE);
		createEAttribute(actionEClass, ACTION__ACTION_STATUS);
		createEReference(actionEClass, ACTION__PROCESS);
		createEAttribute(actionEClass, ACTION__START_DATE);
		createEAttribute(actionEClass, ACTION__END_DATE);

		problemEClass = createEClass(PROBLEM);
		createEReference(problemEClass, PROBLEM__AUTHOR);
		createEReference(problemEClass, PROBLEM__SOLUTIONS);
		createEReference(problemEClass, PROBLEM__PROCESS);

		solutionEClass = createEClass(SOLUTION);
		createEReference(solutionEClass, SOLUTION__AUTHOR);
		createEReference(solutionEClass, SOLUTION__PROBLEMS);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__COORDINATES);

		// Create enums
		processStatusEEnum = createEEnum(PROCESS_STATUS);
		actionStatusEEnum = createEEnum(ACTION_STATUS);
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		userTypeEEnum = createEEnum(USER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		itemProcessEClass.getESuperTypes().add(this.getDescripted());
		userEClass.getESuperTypes().add(this.getDescripted());
		processEClass.getESuperTypes().add(this.getDescripted());
		itemSpeciesEClass.getESuperTypes().add(this.getDescripted());
		actionEClass.getESuperTypes().add(this.getDescripted());
		problemEClass.getESuperTypes().add(this.getDescripted());
		solutionEClass.getESuperTypes().add(this.getDescripted());
		locationEClass.getESuperTypes().add(this.getDescripted());

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_User(), this.getUser(), null, "user", null, 1, -1, Application.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptedEClass, Descripted.class, "Descripted", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescripted_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Descripted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescripted_Name(), ecorePackage.getEString(), "name", null, 0, 1, Descripted.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemProcessEClass, ItemProcess.class, "ItemProcess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemProcess_ItemProcessType(), this.getItemSpecies(), null, "itemProcessType", null, 0, 1,
				ItemProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemProcess_Problems(), this.getProblem(), null, "problems", null, 0, -1, ItemProcess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemProcess_Author(), this.getUser(), null, "author", null, 1, 1, ItemProcess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Username(), ecorePackage.getEString(), "username", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Surname(), ecorePackage.getEString(), "surname", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_UserType(), this.getUserType(), "userType", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Solutions(), this.getSolution(), null, "solutions", null, 0, -1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Problems(), this.getProblem(), null, "problems", null, 0, -1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUser_ItemProcess(), this.getItemProcess(), null, "itemProcess", null, 0, -1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Process(), this.getProcess(), null, "process", null, 0, -1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUser_Birthdate(), ecorePackage.getEString(), "birthdate", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, it.disim.univaq.porcessmanagement.Process.class, "Process", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_ItemProcess(), this.getItemProcess(), null, "itemProcess", null, 0, 1,
				it.disim.univaq.porcessmanagement.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Status(), this.getProcessStatus(), "status", null, 0, 1,
				it.disim.univaq.porcessmanagement.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Location(), this.getLocation(), null, "location", null, 0, 1,
				it.disim.univaq.porcessmanagement.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ActionHistory(), this.getAction(), null, "actionHistory", null, 0, -1,
				it.disim.univaq.porcessmanagement.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_StartDate(), ecorePackage.getEString(), "startDate", null, 1, 1,
				it.disim.univaq.porcessmanagement.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_EndDate(), ecorePackage.getEString(), "endDate", null, 1, 1,
				it.disim.univaq.porcessmanagement.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Weight(), ecorePackage.getEString(), "weight", null, 1, 1,
				it.disim.univaq.porcessmanagement.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProcess__CheckFutureDate(), ecorePackage.getEBooleanObject(), "checkFutureDate", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(itemSpeciesEClass, ItemSpecies.class, "ItemSpecies", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Problem(), this.getProblem(), null, "problem", null, 0, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAction_Solution(), this.getSolution(), null, "solution", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionsType(), this.getActionType(), "actionsType", null, 1, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_ActionStatus(), this.getActionStatus(), "actionStatus", null, 1, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Process(), this.getProcess(), null, "process", null, 1, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAction_StartDate(), ecorePackage.getEString(), "startDate", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_EndDate(), ecorePackage.getEString(), "endDate", null, 1, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(problemEClass, Problem.class, "Problem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProblem_Author(), this.getUser(), null, "author", null, 1, 1, Problem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getProblem_Solutions(), this.getSolution(), null, "solutions", null, 0, -1, Problem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProblem_Process(), this.getItemProcess(), null, "process", null, 0, 1, Problem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolution_Author(), this.getUser(), null, "author", null, 0, 1, Solution.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSolution_Problems(), this.getProblem(), null, "problems", null, 1, -1, Solution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Coordinates(), ecorePackage.getEString(), "coordinates", null, 0, 1, Location.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(processStatusEEnum, ProcessStatus.class, "ProcessStatus");
		addEEnumLiteral(processStatusEEnum, ProcessStatus.DRAFT);
		addEEnumLiteral(processStatusEEnum, ProcessStatus.PROGRESS);
		addEEnumLiteral(processStatusEEnum, ProcessStatus.COMPLETE);

		initEEnum(actionStatusEEnum, ActionStatus.class, "ActionStatus");
		addEEnumLiteral(actionStatusEEnum, ActionStatus.TODO);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.PROGRESS);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.SUCCESS);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.FAIL);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.CUSTOM);
		addEEnumLiteral(actionTypeEEnum, ActionType.PROBLEM);
		addEEnumLiteral(actionTypeEEnum, ActionType.SOLUTION);

		initEEnum(userTypeEEnum, UserType.class, "UserType");
		addEEnumLiteral(userTypeEEnum, UserType.ADMIN);
		addEEnumLiteral(userTypeEEnum, UserType.BASIC);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
	}

} //PorcessmanagementPackageImpl
