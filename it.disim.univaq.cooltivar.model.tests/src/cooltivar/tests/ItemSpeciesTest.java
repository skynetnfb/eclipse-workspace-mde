/**
 */
package cooltivar.tests;

import cooltivar.CooltivarFactory;
import cooltivar.ItemSpecies;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Item Species</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemSpeciesTest extends DescriptedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ItemSpeciesTest.class);
	}

	/**
	 * Constructs a new Item Species test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemSpeciesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Item Species test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ItemSpecies getFixture() {
		return (ItemSpecies)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CooltivarFactory.eINSTANCE.createItemSpecies());
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

} //ItemSpeciesTest
