/**
 */
package it.disim.univaq.porcessmanagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.disim.univaq.porcessmanagement.PorcessmanagementFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PorcessmanagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "porcessmanagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/porcessmanagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "porcessmanagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PorcessmanagementPackage eINSTANCE = it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.ApplicationImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__USER = 0;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.DescriptedImpl <em>Descripted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.DescriptedImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getDescripted()
	 * @generated
	 */
	int DESCRIPTED = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTED__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTED__NAME = 1;

	/**
	 * The number of structural features of the '<em>Descripted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Descripted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.ItemProcessImpl <em>Item Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.ItemProcessImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getItemProcess()
	 * @generated
	 */
	int ITEM_PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESS__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESS__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Item Process Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESS__ITEM_PROCESS_TYPE = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESS__PROBLEMS = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESS__AUTHOR = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESS_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Item Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESS_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.UserImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SURNAME = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_TYPE = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SOLUTIONS = DESCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROBLEMS = DESCRIPTED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Item Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ITEM_PROCESS = DESCRIPTED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROCESS = DESCRIPTED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BIRTHDATE = DESCRIPTED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.ProcessImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Item Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ITEM_PROCESS = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STATUS = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LOCATION = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTION_HISTORY = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__START_DATE = DESCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__END_DATE = DESCRIPTED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__WEIGHT = DESCRIPTED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Check Future Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CHECK_FUTURE_DATE = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.ItemSpeciesImpl <em>Item Species</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.ItemSpeciesImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getItemSpecies()
	 * @generated
	 */
	int ITEM_SPECIES = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SPECIES__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SPECIES__NAME = DESCRIPTED__NAME;

	/**
	 * The number of structural features of the '<em>Item Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SPECIES_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SPECIES_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.ActionImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PROBLEM = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SOLUTION = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIONS_TYPE = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_STATUS = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PROCESS = DESCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__START_DATE = DESCRIPTED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__END_DATE = DESCRIPTED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.ProblemImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__AUTHOR = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__SOLUTIONS = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__PROCESS = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.SolutionImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__AUTHOR = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__PROBLEMS = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.impl.LocationImpl
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COORDINATES = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.ProcessStatus <em>Process Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.ProcessStatus
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getProcessStatus()
	 * @generated
	 */
	int PROCESS_STATUS = 10;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.ActionStatus <em>Action Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.ActionStatus
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getActionStatus()
	 * @generated
	 */
	int ACTION_STATUS = 11;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.ActionType
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 12;

	/**
	 * The meta object id for the '{@link it.disim.univaq.porcessmanagement.UserType <em>User Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.porcessmanagement.UserType
	 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 13;

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see it.disim.univaq.porcessmanagement.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.porcessmanagement.Application#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see it.disim.univaq.porcessmanagement.Application#getUser()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_User();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.Descripted <em>Descripted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descripted</em>'.
	 * @see it.disim.univaq.porcessmanagement.Descripted
	 * @generated
	 */
	EClass getDescripted();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Descripted#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.disim.univaq.porcessmanagement.Descripted#getDescription()
	 * @see #getDescripted()
	 * @generated
	 */
	EAttribute getDescripted_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Descripted#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.univaq.porcessmanagement.Descripted#getName()
	 * @see #getDescripted()
	 * @generated
	 */
	EAttribute getDescripted_Name();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.ItemProcess <em>Item Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Process</em>'.
	 * @see it.disim.univaq.porcessmanagement.ItemProcess
	 * @generated
	 */
	EClass getItemProcess();

	/**
	 * Returns the meta object for the containment reference '{@link it.disim.univaq.porcessmanagement.ItemProcess#getItemProcessType <em>Item Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Process Type</em>'.
	 * @see it.disim.univaq.porcessmanagement.ItemProcess#getItemProcessType()
	 * @see #getItemProcess()
	 * @generated
	 */
	EReference getItemProcess_ItemProcessType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.porcessmanagement.ItemProcess#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see it.disim.univaq.porcessmanagement.ItemProcess#getProblems()
	 * @see #getItemProcess()
	 * @generated
	 */
	EReference getItemProcess_Problems();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.porcessmanagement.ItemProcess#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see it.disim.univaq.porcessmanagement.ItemProcess#getAuthor()
	 * @see #getItemProcess()
	 * @generated
	 */
	EReference getItemProcess_Author();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see it.disim.univaq.porcessmanagement.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see it.disim.univaq.porcessmanagement.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see it.disim.univaq.porcessmanagement.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see it.disim.univaq.porcessmanagement.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.User#getUserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Type</em>'.
	 * @see it.disim.univaq.porcessmanagement.User#getUserType()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.porcessmanagement.User#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see it.disim.univaq.porcessmanagement.User#getSolutions()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Solutions();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.porcessmanagement.User#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see it.disim.univaq.porcessmanagement.User#getProblems()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Problems();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.porcessmanagement.User#getItemProcess <em>Item Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Process</em>'.
	 * @see it.disim.univaq.porcessmanagement.User#getItemProcess()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ItemProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.porcessmanagement.User#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see it.disim.univaq.porcessmanagement.User#getProcess()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Process();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.User#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see it.disim.univaq.porcessmanagement.User#getBirthdate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Birthdate();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see it.disim.univaq.porcessmanagement.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.porcessmanagement.Process#getItemProcess <em>Item Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Process</em>'.
	 * @see it.disim.univaq.porcessmanagement.Process#getItemProcess()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ItemProcess();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Process#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.disim.univaq.porcessmanagement.Process#getStatus()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Status();

	/**
	 * Returns the meta object for the containment reference '{@link it.disim.univaq.porcessmanagement.Process#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see it.disim.univaq.porcessmanagement.Process#getLocation()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.porcessmanagement.Process#getActionHistory <em>Action History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action History</em>'.
	 * @see it.disim.univaq.porcessmanagement.Process#getActionHistory()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ActionHistory();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Process#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see it.disim.univaq.porcessmanagement.Process#getStartDate()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Process#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see it.disim.univaq.porcessmanagement.Process#getEndDate()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Process#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see it.disim.univaq.porcessmanagement.Process#getWeight()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Weight();

	/**
	 * Returns the meta object for the '{@link it.disim.univaq.porcessmanagement.Process#checkFutureDate() <em>Check Future Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Future Date</em>' operation.
	 * @see it.disim.univaq.porcessmanagement.Process#checkFutureDate()
	 * @generated
	 */
	EOperation getProcess__CheckFutureDate();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.ItemSpecies <em>Item Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Species</em>'.
	 * @see it.disim.univaq.porcessmanagement.ItemSpecies
	 * @generated
	 */
	EClass getItemSpecies();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see it.disim.univaq.porcessmanagement.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.porcessmanagement.Action#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problem</em>'.
	 * @see it.disim.univaq.porcessmanagement.Action#getProblem()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Problem();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.porcessmanagement.Action#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see it.disim.univaq.porcessmanagement.Action#getSolution()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Solution();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Action#getActionsType <em>Actions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions Type</em>'.
	 * @see it.disim.univaq.porcessmanagement.Action#getActionsType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionsType();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Action#getActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Status</em>'.
	 * @see it.disim.univaq.porcessmanagement.Action#getActionStatus()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionStatus();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.porcessmanagement.Action#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see it.disim.univaq.porcessmanagement.Action#getProcess()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Process();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Action#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see it.disim.univaq.porcessmanagement.Action#getStartDate()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Action#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see it.disim.univaq.porcessmanagement.Action#getEndDate()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_EndDate();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see it.disim.univaq.porcessmanagement.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.porcessmanagement.Problem#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see it.disim.univaq.porcessmanagement.Problem#getAuthor()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Author();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.porcessmanagement.Problem#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solutions</em>'.
	 * @see it.disim.univaq.porcessmanagement.Problem#getSolutions()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Solutions();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.porcessmanagement.Problem#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see it.disim.univaq.porcessmanagement.Problem#getProcess()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Process();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see it.disim.univaq.porcessmanagement.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.porcessmanagement.Solution#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see it.disim.univaq.porcessmanagement.Solution#getAuthor()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Author();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.porcessmanagement.Solution#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Problems</em>'.
	 * @see it.disim.univaq.porcessmanagement.Solution#getProblems()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Problems();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.porcessmanagement.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see it.disim.univaq.porcessmanagement.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.porcessmanagement.Location#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see it.disim.univaq.porcessmanagement.Location#getCoordinates()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Coordinates();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.porcessmanagement.ProcessStatus <em>Process Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Status</em>'.
	 * @see it.disim.univaq.porcessmanagement.ProcessStatus
	 * @generated
	 */
	EEnum getProcessStatus();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.porcessmanagement.ActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Status</em>'.
	 * @see it.disim.univaq.porcessmanagement.ActionStatus
	 * @generated
	 */
	EEnum getActionStatus();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.porcessmanagement.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see it.disim.univaq.porcessmanagement.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.porcessmanagement.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Type</em>'.
	 * @see it.disim.univaq.porcessmanagement.UserType
	 * @generated
	 */
	EEnum getUserType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PorcessmanagementFactory getPorcessmanagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.ApplicationImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__USER = eINSTANCE.getApplication_User();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.DescriptedImpl <em>Descripted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.DescriptedImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getDescripted()
		 * @generated
		 */
		EClass DESCRIPTED = eINSTANCE.getDescripted();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTED__DESCRIPTION = eINSTANCE.getDescripted_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTED__NAME = eINSTANCE.getDescripted_Name();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.ItemProcessImpl <em>Item Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.ItemProcessImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getItemProcess()
		 * @generated
		 */
		EClass ITEM_PROCESS = eINSTANCE.getItemProcess();

		/**
		 * The meta object literal for the '<em><b>Item Process Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_PROCESS__ITEM_PROCESS_TYPE = eINSTANCE.getItemProcess_ItemProcessType();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_PROCESS__PROBLEMS = eINSTANCE.getItemProcess_Problems();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_PROCESS__AUTHOR = eINSTANCE.getItemProcess_Author();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.UserImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SURNAME = eINSTANCE.getUser_Surname();

		/**
		 * The meta object literal for the '<em><b>User Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_TYPE = eINSTANCE.getUser_UserType();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SOLUTIONS = eINSTANCE.getUser_Solutions();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PROBLEMS = eINSTANCE.getUser_Problems();

		/**
		 * The meta object literal for the '<em><b>Item Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ITEM_PROCESS = eINSTANCE.getUser_ItemProcess();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PROCESS = eINSTANCE.getUser_Process();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BIRTHDATE = eINSTANCE.getUser_Birthdate();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.ProcessImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Item Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ITEM_PROCESS = eINSTANCE.getProcess_ItemProcess();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__STATUS = eINSTANCE.getProcess_Status();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__LOCATION = eINSTANCE.getProcess_Location();

		/**
		 * The meta object literal for the '<em><b>Action History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ACTION_HISTORY = eINSTANCE.getProcess_ActionHistory();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__START_DATE = eINSTANCE.getProcess_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__END_DATE = eINSTANCE.getProcess_EndDate();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__WEIGHT = eINSTANCE.getProcess_Weight();

		/**
		 * The meta object literal for the '<em><b>Check Future Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS___CHECK_FUTURE_DATE = eINSTANCE.getProcess__CheckFutureDate();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.ItemSpeciesImpl <em>Item Species</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.ItemSpeciesImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getItemSpecies()
		 * @generated
		 */
		EClass ITEM_SPECIES = eINSTANCE.getItemSpecies();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.ActionImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PROBLEM = eINSTANCE.getAction_Problem();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SOLUTION = eINSTANCE.getAction_Solution();

		/**
		 * The meta object literal for the '<em><b>Actions Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTIONS_TYPE = eINSTANCE.getAction_ActionsType();

		/**
		 * The meta object literal for the '<em><b>Action Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_STATUS = eINSTANCE.getAction_ActionStatus();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PROCESS = eINSTANCE.getAction_Process();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__START_DATE = eINSTANCE.getAction_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__END_DATE = eINSTANCE.getAction_EndDate();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.ProblemImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__AUTHOR = eINSTANCE.getProblem_Author();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__SOLUTIONS = eINSTANCE.getProblem_Solutions();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__PROCESS = eINSTANCE.getProblem_Process();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.SolutionImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__AUTHOR = eINSTANCE.getSolution_Author();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__PROBLEMS = eINSTANCE.getSolution_Problems();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.impl.LocationImpl
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COORDINATES = eINSTANCE.getLocation_Coordinates();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.ProcessStatus <em>Process Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.ProcessStatus
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getProcessStatus()
		 * @generated
		 */
		EEnum PROCESS_STATUS = eINSTANCE.getProcessStatus();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.ActionStatus <em>Action Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.ActionStatus
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getActionStatus()
		 * @generated
		 */
		EEnum ACTION_STATUS = eINSTANCE.getActionStatus();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.ActionType
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.porcessmanagement.UserType <em>User Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.porcessmanagement.UserType
		 * @see it.disim.univaq.porcessmanagement.impl.PorcessmanagementPackageImpl#getUserType()
		 * @generated
		 */
		EEnum USER_TYPE = eINSTANCE.getUserType();

	}

} //PorcessmanagementPackage
