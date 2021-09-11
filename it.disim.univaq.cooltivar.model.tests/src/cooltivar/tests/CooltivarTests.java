/**
 */
package cooltivar.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>cooltivar</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CooltivarTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CooltivarTests("cooltivar Tests");
		suite.addTestSuite(ItemProcessTest.class);
		suite.addTestSuite(UserTest.class);
		suite.addTestSuite(ProcessTest.class);
		suite.addTestSuite(ActionTest.class);
		suite.addTestSuite(ProblemTest.class);
		suite.addTestSuite(SolutionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CooltivarTests(String name) {
		super(name);
	}

} //CooltivarTests
