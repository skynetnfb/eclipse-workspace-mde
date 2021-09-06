/**
 */
package it.disim.univaq.agri.util;

import it.disim.univaq.agri.*;

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
 * @see it.disim.univaq.agri.AgriPackage
 * @generated
 */
public class AgriValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AgriValidator INSTANCE = new AgriValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "it.disim.univaq.agri";

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
	public AgriValidator() {
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
		return AgriPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case AgriPackage.AGRI:
			return validateAgri((Agri) value, diagnostics, context);
		case AgriPackage.DESCRIPTED:
			return validateDescripted((Descripted) value, diagnostics, context);
		case AgriPackage.PLANT:
			return validatePlant((Plant) value, diagnostics, context);
		case AgriPackage.USER:
			return validateUser((User) value, diagnostics, context);
		case AgriPackage.CULTIVATION:
			return validateCultivation((Cultivation) value, diagnostics, context);
		case AgriPackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case AgriPackage.PROBLEM:
			return validateProblem((Problem) value, diagnostics, context);
		case AgriPackage.SOLUTION:
			return validateSolution((Solution) value, diagnostics, context);
		case AgriPackage.PROCESS_STATUS:
			return validateProcessStatus((ProcessStatus) value, diagnostics, context);
		case AgriPackage.ACTION_STATUS:
			return validateActionStatus((ActionStatus) value, diagnostics, context);
		case AgriPackage.ACTION_TYPE:
			return validateActionType((ActionType) value, diagnostics, context);
		case AgriPackage.USER_TYPE:
			return validateUserType((UserType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgri(Agri agri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(agri, diagnostics, context);
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
	public boolean validatePlant(Plant plant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plant, diagnostics, context);
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
	public boolean validateCultivation(Cultivation cultivation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cultivation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(cultivation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(cultivation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(cultivation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(cultivation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(cultivation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(cultivation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(cultivation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(cultivation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCultivation_minW(cultivation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCultivation_checkDate(cultivation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the minW constraint of '<em>Cultivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CULTIVATION__MIN_W__EEXPRESSION = "self.weight >= 0.0";

	/**
	 * Validates the minW constraint of '<em>Cultivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCultivation_minW(Cultivation cultivation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AgriPackage.Literals.CULTIVATION, cultivation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "minW", CULTIVATION__MIN_W__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the checkDate constraint of '<em>Cultivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CULTIVATION__CHECK_DATE__EEXPRESSION = "self.startDate < self.endDate";

	/**
	 * Validates the checkDate constraint of '<em>Cultivation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCultivation_checkDate(Cultivation cultivation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AgriPackage.Literals.CULTIVATION, cultivation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "checkDate", CULTIVATION__CHECK_DATE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAction_checkDate(action, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAction_checkActionType(action, diagnostics, context);
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
		return validate(AgriPackage.Literals.ACTION, action, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "checkDate", ACTION__CHECK_DATE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the checkActionType constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION__CHECK_ACTION_TYPE__EEXPRESSION = "(self.solution.oclIsUndefined()) and (not self.problem.oclIsUndefined()) and (self.actionsType = ActionType::PROBLEM)\n"
			+ "\t\t\t\t\t\t\tor (self.problem.oclIsUndefined()) and (not self.solution.oclIsUndefined()) and (self.actionsType = ActionType::SOLUTION)\n"
			+ "\t\t\t\t\t\t\tor (self.actionsType = ActionType::CUSTOM)";

	/**
	 * Validates the checkActionType constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_checkActionType(Action action, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(AgriPackage.Literals.ACTION, action, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "checkActionType",
				ACTION__CHECK_ACTION_TYPE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
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
	public boolean validateProcessStatus(ProcessStatus processStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionStatus(ActionStatus actionStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
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

} //AgriValidator
