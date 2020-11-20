package classBasics.src

import CustomerClass
import org.junit.After
import org.junit.Assert.assertFalse
import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertTrue


/**
 * Created by vicboma on 27/10/15.
 */
class CustomerClassTest {

    companion object { val EXPECTED_ID = 1 }

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun testGetId() {
        val customer = CustomerClass(EXPECTED_ID)
        assertTrue("Fail id",EXPECTED_ID == customer.id)
    }

    @Test
    fun testGetName() {
        val customer = CustomerClass(EXPECTED_ID)
        assertTrue("Fail name","" === customer.name)
    }

    @Test
    fun testSetName() {
        val customer = CustomerClass(EXPECTED_ID)
        val test = "test"
        customer.name = test
        assertTrue("Fail set name", test.equals(customer.name) )
        assertTrue("Fail set name", test == customer.name )
        assertTrue("Fail set name", test === customer.name )
    }

    @Test
    fun testDoSomething() {
        val expected = "Some code"
        val customer : CustomerClass = CustomerClass(EXPECTED_ID)
        val doSomething = customer.doSomething()
        assertTrue("Fail doSomething", doSomething === expected )
    }

    @Test
    fun testToString() {
        val customer : CustomerClass = CustomerClass(EXPECTED_ID)
        val toString = customer.toString()
        assertFalse("Fail toString", toString === EXPECTED_ID.toString())
        assertTrue("Fail toString", toString == EXPECTED_ID.toString() )
        assertTrue("Fail toString", toString.equals(EXPECTED_ID.toString()))
    }
}