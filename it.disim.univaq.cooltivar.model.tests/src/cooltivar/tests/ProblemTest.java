/**
 */
package cooltivar.tests;

import cooltivar.CooltivarFactory;
import cooltivar.Problem;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link cooltivar.Problem#isAuthorAdmin() <em>Is Author Admin</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ProblemTest extends DescriptedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProblemTest.class);
	}

	/**
	 * Constructs a new Problem test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Problem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Problem getFixture() {
		return (Problem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CooltivarFactory.eINSTANCE.createProblem());
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
	 * Tests the '{@link cooltivar.Problem#isAuthorAdmin() <em>Is Author Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.Problem#isAuthorAdmin()
	 * @generated
	 */
	public void testIsAuthorAdmin() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ProblemTest
