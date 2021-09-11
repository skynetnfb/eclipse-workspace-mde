/**
 */
package cooltivar.util;

import cooltivar.Action;
import cooltivar.ActionStatus;
import cooltivar.ActionType;
import cooltivar.Application;
import cooltivar.CooltivarPackage;
import cooltivar.Descripted;
import cooltivar.ItemProcess;
import cooltivar.ItemSpecies;
import cooltivar.Location;
import cooltivar.Problem;
import cooltivar.ProcessStatus;
import cooltivar.Solution;
import cooltivar.User;
import cooltivar.UserType;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see cooltivar.CooltivarPackage
 * @generated
 */
public class CooltivarValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CooltivarValidator INSTANCE = new CooltivarValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "cooltivar";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CooltivarValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CooltivarPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CooltivarPackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case CooltivarPackage.DESCRIPTED:
				return validateDescripted((Descripted)value, diagnostics, context);
			case CooltivarPackage.ITEM_PROCESS:
				return validateItemProcess((ItemProcess)value, diagnostics, context);
			case CooltivarPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case CooltivarPackage.PROCESS:
				return validateProcess((cooltivar.Process)value, diagnostics, context);
			case CooltivarPackage.ITEM_SPECIES:
				return validateItemSpecies((ItemSpecies)value, diagnostics, context);
			case CooltivarPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case CooltivarPackage.PROBLEM:
				return validateProblem((Problem)value, diagnostics, context);
			case CooltivarPackage.SOLUTION:
				return validateSolution((Solution)value, diagnostics, context);
			case CooltivarPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case CooltivarPackage.PROCESS_STATUS:
				return validateProcessStatus((ProcessStatus)value, diagnostics, context);
			case CooltivarPackage.ACTION_STATUS:
				return validateActionStatus((ActionStatus)value, diagnostics, context);
			case CooltivarPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case CooltivarPackage.USER_TYPE:
				return validateUserType((UserType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(application, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescripted(Descripted descripted, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descripted, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemProcess(ItemProcess itemProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemProcess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(itemProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(itemProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(itemProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(itemProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(itemProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(itemProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(itemProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(itemProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemProcess_checkAuthor(itemProcess, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkAuthor constraint of '<em>Item Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_PROCESS__CHECK_AUTHOR__EEXPRESSION = "isAuthorAdmin()";

	/**
	 * Validates the checkAuthor constraint of '<em>Item Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemProcess_checkAuthor(ItemProcess itemProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CooltivarPackage.Literals.ITEM_PROCESS,
				 itemProcess,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkAuthor",
				 ITEM_PROCESS__CHECK_AUTHOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(cooltivar.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_minW(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_checkDate(process, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the minW constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__MIN_W__EEXPRESSION = "self.weight >= 0.0";

	/**
	 * Validates the minW constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_minW(cooltivar.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CooltivarPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minW",
				 PROCESS__MIN_W__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkDate constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__CHECK_DATE__EEXPRESSION = "self.startDate < self.endDate";

	/**
	 * Validates the checkDate constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_checkDate(cooltivar.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CooltivarPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkDate",
				 PROCESS__CHECK_DATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemSpecies(ItemSpecies itemSpecies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemSpecies, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_checkDate(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_checkActionType(action, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkDate constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION__CHECK_DATE__EEXPRESSION = "self.startDate < self.endDate";

	/**
	 * Validates the checkDate constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_checkDate(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CooltivarPackage.Literals.ACTION,
				 action,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkDate",
				 ACTION__CHECK_DATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkActionType constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION__CHECK_ACTION_TYPE__EEXPRESSION = "(self.solution.oclIsUndefined()) and (not self.problem.oclIsUndefined()) and (self.actionsType = ActionType::PROBLEM)\n" +
		"\t\t\t\t\t\t\tor (self.problem.oclIsUndefined()) and (not self.solution.oclIsUndefined()) and (self.actionsType = ActionType::SOLUTION)\n" +
		"\t\t\t\t\t\t\tor (self.actionsType = ActionType::CUSTOM)";

	/**
	 * Validates the checkActionType constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_checkActionType(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CooltivarPackage.Literals.ACTION,
				 action,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkActionType",
				 ACTION__CHECK_ACTION_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblem(Problem problem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(problem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolution(Solution solution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessStatus(ProcessStatus processStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionStatus(ActionStatus actionStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserType(UserType userType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CooltivarValidator
