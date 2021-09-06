/**
 */
package cooltivar.impl;

import cooltivar.Action;
import cooltivar.ActionStatus;
import cooltivar.ActionType;
import cooltivar.Application;
import cooltivar.CooltivarFactory;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CooltivarFactoryImpl extends EFactoryImpl implements CooltivarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CooltivarFactory init() {
		try {
			CooltivarFactory theCooltivarFactory = (CooltivarFactory)EPackage.Registry.INSTANCE.getEFactory(CooltivarPackage.eNS_URI);
			if (theCooltivarFactory != null) {
				return theCooltivarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CooltivarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CooltivarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CooltivarPackage.APPLICATION: return createApplication();
			case CooltivarPackage.DESCRIPTED: return createDescripted();
			case CooltivarPackage.ITEM_PROCESS: return createItemProcess();
			case CooltivarPackage.USER: return createUser();
			case CooltivarPackage.PROCESS: return createProcess();
			case CooltivarPackage.ITEM_SPECIES: return createItemSpecies();
			case CooltivarPackage.ACTION: return createAction();
			case CooltivarPackage.PROBLEM: return createProblem();
			case CooltivarPackage.SOLUTION: return createSolution();
			case CooltivarPackage.LOCATION: return createLocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CooltivarPackage.PROCESS_STATUS:
				return createProcessStatusFromString(eDataType, initialValue);
			case CooltivarPackage.ACTION_STATUS:
				return createActionStatusFromString(eDataType, initialValue);
			case CooltivarPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case CooltivarPackage.USER_TYPE:
				return createUserTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CooltivarPackage.PROCESS_STATUS:
				return convertProcessStatusToString(eDataType, instanceValue);
			case CooltivarPackage.ACTION_STATUS:
				return convertActionStatusToString(eDataType, instanceValue);
			case CooltivarPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case CooltivarPackage.USER_TYPE:
				return convertUserTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descripted createDescripted() {
		DescriptedImpl descripted = new DescriptedImpl();
		return descripted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemProcess createItemProcess() {
		ItemProcessImpl itemProcess = new ItemProcessImpl();
		return itemProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cooltivar.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemSpecies createItemSpecies() {
		ItemSpeciesImpl itemSpecies = new ItemSpeciesImpl();
		return itemSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem createProblem() {
		ProblemImpl problem = new ProblemImpl();
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStatus createProcessStatusFromString(EDataType eDataType, String initialValue) {
		ProcessStatus result = ProcessStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStatus createActionStatusFromString(EDataType eDataType, String initialValue) {
		ActionStatus result = ActionStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType createUserTypeFromString(EDataType eDataType, String initialValue) {
		UserType result = UserType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CooltivarPackage getCooltivarPackage() {
		return (CooltivarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CooltivarPackage getPackage() {
		return CooltivarPackage.eINSTANCE;
	}

} //CooltivarFactoryImpl
