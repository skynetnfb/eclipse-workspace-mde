/**
 */
package cooltivar;

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
 * @see cooltivar.CooltivarFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CooltivarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cooltivar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.disim.univaq.cooltivar.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cooltivar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CooltivarPackage eINSTANCE = cooltivar.impl.CooltivarPackageImpl.init();

	/**
	 * The meta object id for the '{@link cooltivar.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.ApplicationImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getApplication()
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
	 * The meta object id for the '{@link cooltivar.impl.DescriptedImpl <em>Descripted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.DescriptedImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getDescripted()
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
	 * The meta object id for the '{@link cooltivar.impl.ItemProcessImpl <em>Item Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.ItemProcessImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getItemProcess()
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
	 * The operation id for the '<em>Is Author Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESS___IS_AUTHOR_ADMIN = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROCESS_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cooltivar.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.UserImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getUser()
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
	 * The feature id for the '<em><b>Uname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UNAME = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BIRTHDATE = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SURNAME = DESCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_TYPE = DESCRIPTED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SOLUTIONS = DESCRIPTED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROBLEMS = DESCRIPTED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Item Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ITEM_PROCESS = DESCRIPTED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROCESS = DESCRIPTED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FULLNAME = DESCRIPTED_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = DESCRIPTED_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cooltivar.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.ProcessImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getProcess()
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
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__START_DATE = DESCRIPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__END_DATE = DESCRIPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STATUS = DESCRIPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LOCATION = DESCRIPTED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__WEIGHT = DESCRIPTED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTION_HISTORY = DESCRIPTED_FEATURE_COUNT + 6;

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
	 * The meta object id for the '{@link cooltivar.impl.ItemSpeciesImpl <em>Item Species</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.ItemSpeciesImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getItemSpecies()
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
	 * The meta object id for the '{@link cooltivar.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.ActionImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getAction()
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
	 * The meta object id for the '{@link cooltivar.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.ProblemImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getProblem()
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
	 * The operation id for the '<em>Is Author Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM___IS_AUTHOR_ADMIN = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cooltivar.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.SolutionImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getSolution()
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
	 * The operation id for the '<em>Is Author Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION___IS_AUTHOR_ADMIN = DESCRIPTED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = DESCRIPTED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link cooltivar.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.impl.LocationImpl
	 * @see cooltivar.impl.CooltivarPackageImpl#getLocation()
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
	 * The meta object id for the '{@link cooltivar.ProcessStatus <em>Process Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.ProcessStatus
	 * @see cooltivar.impl.CooltivarPackageImpl#getProcessStatus()
	 * @generated
	 */
	int PROCESS_STATUS = 10;

	/**
	 * The meta object id for the '{@link cooltivar.ActionStatus <em>Action Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.ActionStatus
	 * @see cooltivar.impl.CooltivarPackageImpl#getActionStatus()
	 * @generated
	 */
	int ACTION_STATUS = 11;

	/**
	 * The meta object id for the '{@link cooltivar.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.ActionType
	 * @see cooltivar.impl.CooltivarPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 12;

	/**
	 * The meta object id for the '{@link cooltivar.UserType <em>User Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.UserType
	 * @see cooltivar.impl.CooltivarPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link cooltivar.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see cooltivar.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link cooltivar.Application#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see cooltivar.Application#getUser()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_User();

	/**
	 * Returns the meta object for class '{@link cooltivar.Descripted <em>Descripted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descripted</em>'.
	 * @see cooltivar.Descripted
	 * @generated
	 */
	EClass getDescripted();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Descripted#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cooltivar.Descripted#getDescription()
	 * @see #getDescripted()
	 * @generated
	 */
	EAttribute getDescripted_Description();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Descripted#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cooltivar.Descripted#getName()
	 * @see #getDescripted()
	 * @generated
	 */
	EAttribute getDescripted_Name();

	/**
	 * Returns the meta object for class '{@link cooltivar.ItemProcess <em>Item Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Process</em>'.
	 * @see cooltivar.ItemProcess
	 * @generated
	 */
	EClass getItemProcess();

	/**
	 * Returns the meta object for the containment reference '{@link cooltivar.ItemProcess#getItemProcessType <em>Item Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Process Type</em>'.
	 * @see cooltivar.ItemProcess#getItemProcessType()
	 * @see #getItemProcess()
	 * @generated
	 */
	EReference getItemProcess_ItemProcessType();

	/**
	 * Returns the meta object for the containment reference list '{@link cooltivar.ItemProcess#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see cooltivar.ItemProcess#getProblems()
	 * @see #getItemProcess()
	 * @generated
	 */
	EReference getItemProcess_Problems();

	/**
	 * Returns the meta object for the reference '{@link cooltivar.ItemProcess#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see cooltivar.ItemProcess#getAuthor()
	 * @see #getItemProcess()
	 * @generated
	 */
	EReference getItemProcess_Author();

	/**
	 * Returns the meta object for the '{@link cooltivar.ItemProcess#isAuthorAdmin() <em>Is Author Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Author Admin</em>' operation.
	 * @see cooltivar.ItemProcess#isAuthorAdmin()
	 * @generated
	 */
	EOperation getItemProcess__IsAuthorAdmin();

	/**
	 * Returns the meta object for class '{@link cooltivar.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see cooltivar.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see cooltivar.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see cooltivar.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.User#getUname <em>Uname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uname</em>'.
	 * @see cooltivar.User#getUname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Uname();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.User#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see cooltivar.User#getBirthdate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see cooltivar.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.User#getUserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Type</em>'.
	 * @see cooltivar.User#getUserType()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserType();

	/**
	 * Returns the meta object for the containment reference list '{@link cooltivar.User#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see cooltivar.User#getSolutions()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Solutions();

	/**
	 * Returns the meta object for the containment reference list '{@link cooltivar.User#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see cooltivar.User#getProblems()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Problems();

	/**
	 * Returns the meta object for the containment reference list '{@link cooltivar.User#getItemProcess <em>Item Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Process</em>'.
	 * @see cooltivar.User#getItemProcess()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ItemProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link cooltivar.User#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see cooltivar.User#getProcess()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Process();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.User#getFullname <em>Fullname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullname</em>'.
	 * @see cooltivar.User#getFullname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Fullname();

	/**
	 * Returns the meta object for class '{@link cooltivar.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see cooltivar.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference '{@link cooltivar.Process#getItemProcess <em>Item Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Process</em>'.
	 * @see cooltivar.Process#getItemProcess()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ItemProcess();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Process#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see cooltivar.Process#getStartDate()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Process#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see cooltivar.Process#getEndDate()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Process#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see cooltivar.Process#getStatus()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Status();

	/**
	 * Returns the meta object for the containment reference '{@link cooltivar.Process#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see cooltivar.Process#getLocation()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Location();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Process#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see cooltivar.Process#getWeight()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Weight();

	/**
	 * Returns the meta object for the containment reference list '{@link cooltivar.Process#getActionHistory <em>Action History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action History</em>'.
	 * @see cooltivar.Process#getActionHistory()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ActionHistory();

	/**
	 * Returns the meta object for the '{@link cooltivar.Process#checkFutureDate() <em>Check Future Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Future Date</em>' operation.
	 * @see cooltivar.Process#checkFutureDate()
	 * @generated
	 */
	EOperation getProcess__CheckFutureDate();

	/**
	 * Returns the meta object for class '{@link cooltivar.ItemSpecies <em>Item Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Species</em>'.
	 * @see cooltivar.ItemSpecies
	 * @generated
	 */
	EClass getItemSpecies();

	/**
	 * Returns the meta object for class '{@link cooltivar.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see cooltivar.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Action#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see cooltivar.Action#getStartDate()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Action#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see cooltivar.Action#getEndDate()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_EndDate();

	/**
	 * Returns the meta object for the reference '{@link cooltivar.Action#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problem</em>'.
	 * @see cooltivar.Action#getProblem()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Problem();

	/**
	 * Returns the meta object for the reference '{@link cooltivar.Action#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Solution</em>'.
	 * @see cooltivar.Action#getSolution()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Solution();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Action#getActionsType <em>Actions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions Type</em>'.
	 * @see cooltivar.Action#getActionsType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionsType();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Action#getActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Status</em>'.
	 * @see cooltivar.Action#getActionStatus()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionStatus();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Action#getFullDescription <em>Full Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Description</em>'.
	 * @see cooltivar.Action#getFullDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_FullDescription();

	/**
	 * Returns the meta object for the reference '{@link cooltivar.Action#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see cooltivar.Action#getProcess()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Process();

	/**
	 * Returns the meta object for class '{@link cooltivar.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see cooltivar.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the reference '{@link cooltivar.Problem#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see cooltivar.Problem#getAuthor()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Author();

	/**
	 * Returns the meta object for the reference list '{@link cooltivar.Problem#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solutions</em>'.
	 * @see cooltivar.Problem#getSolutions()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Solutions();

	/**
	 * Returns the meta object for the reference '{@link cooltivar.Problem#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see cooltivar.Problem#getProcess()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Process();

	/**
	 * Returns the meta object for the '{@link cooltivar.Problem#isAuthorAdmin() <em>Is Author Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Author Admin</em>' operation.
	 * @see cooltivar.Problem#isAuthorAdmin()
	 * @generated
	 */
	EOperation getProblem__IsAuthorAdmin();

	/**
	 * Returns the meta object for class '{@link cooltivar.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see cooltivar.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the reference '{@link cooltivar.Solution#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see cooltivar.Solution#getAuthor()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Author();

	/**
	 * Returns the meta object for the reference list '{@link cooltivar.Solution#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Problems</em>'.
	 * @see cooltivar.Solution#getProblems()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Problems();

	/**
	 * Returns the meta object for the '{@link cooltivar.Solution#isAuthorAdmin() <em>Is Author Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Author Admin</em>' operation.
	 * @see cooltivar.Solution#isAuthorAdmin()
	 * @generated
	 */
	EOperation getSolution__IsAuthorAdmin();

	/**
	 * Returns the meta object for class '{@link cooltivar.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see cooltivar.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link cooltivar.Location#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see cooltivar.Location#getCoordinates()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Coordinates();

	/**
	 * Returns the meta object for enum '{@link cooltivar.ProcessStatus <em>Process Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Status</em>'.
	 * @see cooltivar.ProcessStatus
	 * @generated
	 */
	EEnum getProcessStatus();

	/**
	 * Returns the meta object for enum '{@link cooltivar.ActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Status</em>'.
	 * @see cooltivar.ActionStatus
	 * @generated
	 */
	EEnum getActionStatus();

	/**
	 * Returns the meta object for enum '{@link cooltivar.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see cooltivar.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link cooltivar.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Type</em>'.
	 * @see cooltivar.UserType
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
	CooltivarFactory getCooltivarFactory();

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
		 * The meta object literal for the '{@link cooltivar.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.ApplicationImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getApplication()
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
		 * The meta object literal for the '{@link cooltivar.impl.DescriptedImpl <em>Descripted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.DescriptedImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getDescripted()
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
		 * The meta object literal for the '{@link cooltivar.impl.ItemProcessImpl <em>Item Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.ItemProcessImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getItemProcess()
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
		 * The meta object literal for the '<em><b>Is Author Admin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM_PROCESS___IS_AUTHOR_ADMIN = eINSTANCE.getItemProcess__IsAuthorAdmin();

		/**
		 * The meta object literal for the '{@link cooltivar.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.UserImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getUser()
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
		 * The meta object literal for the '<em><b>Uname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__UNAME = eINSTANCE.getUser_Uname();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BIRTHDATE = eINSTANCE.getUser_Birthdate();

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
		 * The meta object literal for the '<em><b>Fullname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FULLNAME = eINSTANCE.getUser_Fullname();

		/**
		 * The meta object literal for the '{@link cooltivar.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.ProcessImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getProcess()
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
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__WEIGHT = eINSTANCE.getProcess_Weight();

		/**
		 * The meta object literal for the '<em><b>Action History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ACTION_HISTORY = eINSTANCE.getProcess_ActionHistory();

		/**
		 * The meta object literal for the '<em><b>Check Future Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS___CHECK_FUTURE_DATE = eINSTANCE.getProcess__CheckFutureDate();

		/**
		 * The meta object literal for the '{@link cooltivar.impl.ItemSpeciesImpl <em>Item Species</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.ItemSpeciesImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getItemSpecies()
		 * @generated
		 */
		EClass ITEM_SPECIES = eINSTANCE.getItemSpecies();

		/**
		 * The meta object literal for the '{@link cooltivar.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.ActionImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getAction()
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
		 * The meta object literal for the '{@link cooltivar.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.ProblemImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getProblem()
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
		 * The meta object literal for the '<em><b>Is Author Admin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROBLEM___IS_AUTHOR_ADMIN = eINSTANCE.getProblem__IsAuthorAdmin();

		/**
		 * The meta object literal for the '{@link cooltivar.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.SolutionImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getSolution()
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
		 * The meta object literal for the '<em><b>Is Author Admin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLUTION___IS_AUTHOR_ADMIN = eINSTANCE.getSolution__IsAuthorAdmin();

		/**
		 * The meta object literal for the '{@link cooltivar.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.impl.LocationImpl
		 * @see cooltivar.impl.CooltivarPackageImpl#getLocation()
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
		 * The meta object literal for the '{@link cooltivar.ProcessStatus <em>Process Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.ProcessStatus
		 * @see cooltivar.impl.CooltivarPackageImpl#getProcessStatus()
		 * @generated
		 */
		EEnum PROCESS_STATUS = eINSTANCE.getProcessStatus();

		/**
		 * The meta object literal for the '{@link cooltivar.ActionStatus <em>Action Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.ActionStatus
		 * @see cooltivar.impl.CooltivarPackageImpl#getActionStatus()
		 * @generated
		 */
		EEnum ACTION_STATUS = eINSTANCE.getActionStatus();

		/**
		 * The meta object literal for the '{@link cooltivar.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.ActionType
		 * @see cooltivar.impl.CooltivarPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link cooltivar.UserType <em>User Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cooltivar.UserType
		 * @see cooltivar.impl.CooltivarPackageImpl#getUserType()
		 * @generated
		 */
		EEnum USER_TYPE = eINSTANCE.getUserType();

	}

} //CooltivarPackage
