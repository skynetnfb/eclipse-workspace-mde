/**
 */
package it.disim.univaq.porcessmanagement.util;

import it.disim.univaq.porcessmanagement.Action;
import it.disim.univaq.porcessmanagement.Application;
import it.disim.univaq.porcessmanagement.Descripted;
import it.disim.univaq.porcessmanagement.ItemProcess;
import it.disim.univaq.porcessmanagement.ItemSpecies;
import it.disim.univaq.porcessmanagement.Location;
import it.disim.univaq.porcessmanagement.PorcessmanagementPackage;
import it.disim.univaq.porcessmanagement.Problem;
import it.disim.univaq.porcessmanagement.Solution;
import it.disim.univaq.porcessmanagement.User;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.disim.univaq.porcessmanagement.PorcessmanagementPackage
 * @generated
 */
public class PorcessmanagementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PorcessmanagementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PorcessmanagementSwitch() {
		if (modelPackage == null) {
			modelPackage = PorcessmanagementPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PorcessmanagementPackage.APPLICATION: {
			Application application = (Application) theEObject;
			T result = caseApplication(application);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PorcessmanagementPackage.DESCRIPTED: {
			Descripted descripted = (Descripted) theEObject;
			T result = caseDescripted(descripted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PorcessmanagementPackage.ITEM_PROCESS: {
			ItemProcess itemProcess = (ItemProcess) theEObject;
			T result = caseItemProcess(itemProcess);
			if (result == null)
				result = caseDescripted(itemProcess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PorcessmanagementPackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = caseDescripted(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PorcessmanagementPackage.PROCESS: {
			it.disim.univaq.porcessmanagement.Process process = (it.disim.univaq.porcessmanagement.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = caseDescripted(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PorcessmanagementPackage.ITEM_SPECIES: {
			ItemSpecies itemSpecies = (ItemSpecies) theEObject;
			T result = caseItemSpecies(itemSpecies);
			if (result == null)
				result = caseDescripted(itemSpecies);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PorcessmanagementPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = caseDescripted(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PorcessmanagementPackage.PROBLEM: {
			Problem problem = (Problem) theEObject;
			T result = caseProblem(problem);
			if (result == null)
				result = caseDescripted(problem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PorcessmanagementPackage.SOLUTION: {
			Solution solution = (Solution) theEObject;
			T result = caseSolution(solution);
			if (result == null)
				result = caseDescripted(solution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PorcessmanagementPackage.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = caseDescripted(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descripted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descripted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescripted(Descripted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemProcess(ItemProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(it.disim.univaq.porcessmanagement.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Species</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Species</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemSpecies(ItemSpecies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblem(Problem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PorcessmanagementSwitch
