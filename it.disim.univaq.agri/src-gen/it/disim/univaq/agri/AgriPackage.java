/**
 */
package it.disim.univaq.agri;

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
 * @see it.disim.univaq.agri.AgriFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface AgriPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agri";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.disim.univaq.agri";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agri";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgriPackage eINSTANCE = it.disim.univaq.agri.impl.AgriPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.disim.univaq.agri.impl.AgriImpl <em>Agri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.impl.AgriImpl
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getAgri()
	 * @generated
	 */
	int AGRI = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRI__USER = 0;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRI__PROBLEM = 1;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRI__SOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Item Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRI__ITEM_PROCESS = 3;

	/**
	 * The number of structural features of the '<em>Agri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRI_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Agri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.agri.impl.DescriptedImpl <em>Descripted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.impl.DescriptedImpl
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getDescripted()
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
	 * The meta object id for the '{@link it.disim.univaq.agri.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.impl.PlantImpl
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PROBLEMS = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__AUTHOR = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Plant Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PLANT_SPECIES = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.agri.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.impl.UserImpl
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getUser()
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
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FULL_NAME = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BIRTHDATE = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_TYPE = DESCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SOLUTIONS = DESCRIPTED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROBLEMS = DESCRIPTED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Item Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ITEM_PROCESS = DESCRIPTED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cultivations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CULTIVATIONS = DESCRIPTED_FEATURE_COUNT + 8;

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
	 * The meta object id for the '{@link it.disim.univaq.agri.impl.CultivationImpl <em>Cultivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.impl.CultivationImpl
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getCultivation()
	 * @generated
	 */
	int CULTIVATION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION__DESCRIPTION = DESCRIPTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION__NAME = DESCRIPTED__NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION__PLANT = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION__START_DATE = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION__END_DATE = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION__STATUS = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION__WEIGHT = DESCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION__ACTION_HISTORY = DESCRIPTED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION__LOCATION = DESCRIPTED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cultivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Check Future Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION___CHECK_FUTURE_DATE = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cultivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CULTIVATION_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.disim.univaq.agri.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.impl.ActionImpl
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

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
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__START_DATE = DESCRIPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__END_DATE = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PROBLEM = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SOLUTION = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIONS_TYPE = DESCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_STATUS = DESCRIPTED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Full Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FULL_DESCRIPTION = DESCRIPTED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PROCESS = DESCRIPTED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.agri.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.impl.ProblemImpl
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 6;

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
	 * The meta object id for the '{@link it.disim.univaq.agri.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.impl.SolutionImpl
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 7;

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
	 * The meta object id for the '{@link it.disim.univaq.agri.ProcessStatus <em>Process Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.ProcessStatus
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getProcessStatus()
	 * @generated
	 */
	int PROCESS_STATUS = 8;

	/**
	 * The meta object id for the '{@link it.disim.univaq.agri.ActionStatus <em>Action Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.ActionStatus
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getActionStatus()
	 * @generated
	 */
	int ACTION_STATUS = 9;

	/**
	 * The meta object id for the '{@link it.disim.univaq.agri.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.ActionType
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 10;

	/**
	 * The meta object id for the '{@link it.disim.univaq.agri.UserType <em>User Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.agri.UserType
	 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 11;

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.agri.Agri <em>Agri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agri</em>'.
	 * @see it.disim.univaq.agri.Agri
	 * @generated
	 */
	EClass getAgri();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.Agri#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see it.disim.univaq.agri.Agri#getUser()
	 * @see #getAgri()
	 * @generated
	 */
	EReference getAgri_User();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.Agri#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problem</em>'.
	 * @see it.disim.univaq.agri.Agri#getProblem()
	 * @see #getAgri()
	 * @generated
	 */
	EReference getAgri_Problem();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.Agri#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solution</em>'.
	 * @see it.disim.univaq.agri.Agri#getSolution()
	 * @see #getAgri()
	 * @generated
	 */
	EReference getAgri_Solution();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.Agri#getItemProcess <em>Item Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Process</em>'.
	 * @see it.disim.univaq.agri.Agri#getItemProcess()
	 * @see #getAgri()
	 * @generated
	 */
	EReference getAgri_ItemProcess();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.agri.Descripted <em>Descripted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descripted</em>'.
	 * @see it.disim.univaq.agri.Descripted
	 * @generated
	 */
	EClass getDescripted();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Descripted#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.disim.univaq.agri.Descripted#getDescription()
	 * @see #getDescripted()
	 * @generated
	 */
	EAttribute getDescripted_Description();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Descripted#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.univaq.agri.Descripted#getName()
	 * @see #getDescripted()
	 * @generated
	 */
	EAttribute getDescripted_Name();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.agri.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see it.disim.univaq.agri.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.Plant#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see it.disim.univaq.agri.Plant#getProblems()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Problems();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.agri.Plant#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see it.disim.univaq.agri.Plant#getAuthor()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Author();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Plant#getPlantSpecies <em>Plant Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant Species</em>'.
	 * @see it.disim.univaq.agri.Plant#getPlantSpecies()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_PlantSpecies();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.agri.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see it.disim.univaq.agri.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see it.disim.univaq.agri.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see it.disim.univaq.agri.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.User#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see it.disim.univaq.agri.User#getFullName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FullName();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.User#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see it.disim.univaq.agri.User#getBirthdate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.User#getUserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Type</em>'.
	 * @see it.disim.univaq.agri.User#getUserType()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.User#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see it.disim.univaq.agri.User#getSolutions()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Solutions();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.User#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see it.disim.univaq.agri.User#getProblems()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Problems();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.User#getItemProcess <em>Item Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Process</em>'.
	 * @see it.disim.univaq.agri.User#getItemProcess()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ItemProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.User#getCultivations <em>Cultivations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cultivations</em>'.
	 * @see it.disim.univaq.agri.User#getCultivations()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Cultivations();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.agri.Cultivation <em>Cultivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cultivation</em>'.
	 * @see it.disim.univaq.agri.Cultivation
	 * @generated
	 */
	EClass getCultivation();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.agri.Cultivation#getPlant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plant</em>'.
	 * @see it.disim.univaq.agri.Cultivation#getPlant()
	 * @see #getCultivation()
	 * @generated
	 */
	EReference getCultivation_Plant();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Cultivation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see it.disim.univaq.agri.Cultivation#getStartDate()
	 * @see #getCultivation()
	 * @generated
	 */
	EAttribute getCultivation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Cultivation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see it.disim.univaq.agri.Cultivation#getEndDate()
	 * @see #getCultivation()
	 * @generated
	 */
	EAttribute getCultivation_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Cultivation#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see it.disim.univaq.agri.Cultivation#getStatus()
	 * @see #getCultivation()
	 * @generated
	 */
	EAttribute getCultivation_Status();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Cultivation#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see it.disim.univaq.agri.Cultivation#getWeight()
	 * @see #getCultivation()
	 * @generated
	 */
	EAttribute getCultivation_Weight();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.agri.Cultivation#getActionHistory <em>Action History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action History</em>'.
	 * @see it.disim.univaq.agri.Cultivation#getActionHistory()
	 * @see #getCultivation()
	 * @generated
	 */
	EReference getCultivation_ActionHistory();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Cultivation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see it.disim.univaq.agri.Cultivation#getLocation()
	 * @see #getCultivation()
	 * @generated
	 */
	EAttribute getCultivation_Location();

	/**
	 * Returns the meta object for the '{@link it.disim.univaq.agri.Cultivation#checkFutureDate() <em>Check Future Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Future Date</em>' operation.
	 * @see it.disim.univaq.agri.Cultivation#checkFutureDate()
	 * @generated
	 */
	EOperation getCultivation__CheckFutureDate();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.agri.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see it.disim.univaq.agri.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Action#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see it.disim.univaq.agri.Action#getStartDate()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Action#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see it.disim.univaq.agri.Action#getEndDate()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_EndDate();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.agri.Action#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problem</em>'.
	 * @see it.disim.univaq.agri.Action#getProblem()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Problem();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.agri.Action#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see it.disim.univaq.agri.Action#getSolution()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Solution();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Action#getActionsType <em>Actions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions Type</em>'.
	 * @see it.disim.univaq.agri.Action#getActionsType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionsType();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Action#getActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Status</em>'.
	 * @see it.disim.univaq.agri.Action#getActionStatus()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionStatus();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.agri.Action#getFullDescription <em>Full Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Description</em>'.
	 * @see it.disim.univaq.agri.Action#getFullDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_FullDescription();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.agri.Action#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see it.disim.univaq.agri.Action#getProcess()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Process();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.agri.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see it.disim.univaq.agri.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.agri.Problem#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see it.disim.univaq.agri.Problem#getAuthor()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Author();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.agri.Problem#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solutions</em>'.
	 * @see it.disim.univaq.agri.Problem#getSolutions()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Solutions();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.agri.Problem#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see it.disim.univaq.agri.Problem#getProcess()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Process();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.agri.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see it.disim.univaq.agri.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.agri.Solution#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see it.disim.univaq.agri.Solution#getAuthor()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Author();

	/**
	 * Returns the meta object for the reference list '{@link it.disim.univaq.agri.Solution#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Problems</em>'.
	 * @see it.disim.univaq.agri.Solution#getProblems()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Problems();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.agri.ProcessStatus <em>Process Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Status</em>'.
	 * @see it.disim.univaq.agri.ProcessStatus
	 * @generated
	 */
	EEnum getProcessStatus();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.agri.ActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Status</em>'.
	 * @see it.disim.univaq.agri.ActionStatus
	 * @generated
	 */
	EEnum getActionStatus();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.agri.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see it.disim.univaq.agri.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link it.disim.univaq.agri.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Type</em>'.
	 * @see it.disim.univaq.agri.UserType
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
	AgriFactory getAgriFactory();

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
		 * The meta object literal for the '{@link it.disim.univaq.agri.impl.AgriImpl <em>Agri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.impl.AgriImpl
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getAgri()
		 * @generated
		 */
		EClass AGRI = eINSTANCE.getAgri();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRI__USER = eINSTANCE.getAgri_User();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRI__PROBLEM = eINSTANCE.getAgri_Problem();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRI__SOLUTION = eINSTANCE.getAgri_Solution();

		/**
		 * The meta object literal for the '<em><b>Item Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRI__ITEM_PROCESS = eINSTANCE.getAgri_ItemProcess();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.agri.impl.DescriptedImpl <em>Descripted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.impl.DescriptedImpl
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getDescripted()
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
		 * The meta object literal for the '{@link it.disim.univaq.agri.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.impl.PlantImpl
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__PROBLEMS = eINSTANCE.getPlant_Problems();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__AUTHOR = eINSTANCE.getPlant_Author();

		/**
		 * The meta object literal for the '<em><b>Plant Species</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__PLANT_SPECIES = eINSTANCE.getPlant_PlantSpecies();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.agri.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.impl.UserImpl
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getUser()
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
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FULL_NAME = eINSTANCE.getUser_FullName();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BIRTHDATE = eINSTANCE.getUser_Birthdate();

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
		 * The meta object literal for the '<em><b>Cultivations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CULTIVATIONS = eINSTANCE.getUser_Cultivations();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.agri.impl.CultivationImpl <em>Cultivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.impl.CultivationImpl
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getCultivation()
		 * @generated
		 */
		EClass CULTIVATION = eINSTANCE.getCultivation();

		/**
		 * The meta object literal for the '<em><b>Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CULTIVATION__PLANT = eINSTANCE.getCultivation_Plant();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CULTIVATION__START_DATE = eINSTANCE.getCultivation_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CULTIVATION__END_DATE = eINSTANCE.getCultivation_EndDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CULTIVATION__STATUS = eINSTANCE.getCultivation_Status();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CULTIVATION__WEIGHT = eINSTANCE.getCultivation_Weight();

		/**
		 * The meta object literal for the '<em><b>Action History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CULTIVATION__ACTION_HISTORY = eINSTANCE.getCultivation_ActionHistory();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CULTIVATION__LOCATION = eINSTANCE.getCultivation_Location();

		/**
		 * The meta object literal for the '<em><b>Check Future Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CULTIVATION___CHECK_FUTURE_DATE = eINSTANCE.getCultivation__CheckFutureDate();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.agri.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.impl.ActionImpl
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

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
		 * The meta object literal for the '<em><b>Full Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FULL_DESCRIPTION = eINSTANCE.getAction_FullDescription();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PROCESS = eINSTANCE.getAction_Process();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.agri.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.impl.ProblemImpl
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getProblem()
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
		 * The meta object literal for the '{@link it.disim.univaq.agri.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.impl.SolutionImpl
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getSolution()
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
		 * The meta object literal for the '{@link it.disim.univaq.agri.ProcessStatus <em>Process Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.ProcessStatus
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getProcessStatus()
		 * @generated
		 */
		EEnum PROCESS_STATUS = eINSTANCE.getProcessStatus();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.agri.ActionStatus <em>Action Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.ActionStatus
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getActionStatus()
		 * @generated
		 */
		EEnum ACTION_STATUS = eINSTANCE.getActionStatus();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.agri.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.ActionType
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.agri.UserType <em>User Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.agri.UserType
		 * @see it.disim.univaq.agri.impl.AgriPackageImpl#getUserType()
		 * @generated
		 */
		EEnum USER_TYPE = eINSTANCE.getUserType();

	}

} //AgriPackage
