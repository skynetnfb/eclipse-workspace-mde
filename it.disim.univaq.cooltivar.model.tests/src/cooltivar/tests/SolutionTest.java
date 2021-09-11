/**
 */
package cooltivar.tests;

import cooltivar.CooltivarFactory;
import cooltivar.Solution;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link cooltivar.Solution#isAuthorAdmin() <em>Is Author Admin</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SolutionTest extends DescriptedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolutionTest.class);
	}

	/**
	 * Constructs a new Solution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Solution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Solution getFixture() {
		return (Solution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CooltivarFactory.eINSTANCE.createSolution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link cooltivar.Solution#isAuthorAdmin() <em>Is Author Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.Solution#isAuthorAdmin()
	 * @generated
	 */
	public void testIsAuthorAdmin() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SolutionTest
