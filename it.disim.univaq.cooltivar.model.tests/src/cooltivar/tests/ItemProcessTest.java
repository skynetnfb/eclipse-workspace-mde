/**
 */
package cooltivar.tests;

import cooltivar.CooltivarFactory;
import cooltivar.ItemProcess;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Item Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link cooltivar.ItemProcess#isAuthorAdmin() <em>Is Author Admin</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ItemProcessTest extends DescriptedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ItemProcessTest.class);
	}

	/**
	 * Constructs a new Item Process test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemProcessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Item Process test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ItemProcess getFixture() {
		return (ItemProcess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CooltivarFactory.eINSTANCE.createItemProcess());
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
	 * Tests the '{@link cooltivar.ItemProcess#isAuthorAdmin() <em>Is Author Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cooltivar.ItemProcess#isAuthorAdmin()
	 * @generated
	 */
	public void testIsAuthorAdmin() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ItemProcessTest
