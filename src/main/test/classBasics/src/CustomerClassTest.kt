package classBasics.src

import CustomerClass
import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


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
        assertTrue(EXPECTED_ID == customer.id, "Fail id")
    }

    @Test
    fun testGetName() {
        val customer = CustomerClass(EXPECTED_ID)
        assertTrue("" === customer.name, "Fail name")
    }

    @Test
    fun testSetName() {
        val customer = CustomerClass(EXPECTED_ID)
        val test = "test"
        customer.name = test
        assertTrue(test.equals(customer.name), "Fail set name")
        assertTrue(test == customer.name , "Fail set name")
        assertTrue(test === customer.name, "Fail set name")
    }

    @Test
    fun testDoSomething() {
        val expected = "Some code"
        val customer : CustomerClass = CustomerClass(EXPECTED_ID)
        val doSomething = customer.doSomething()
        assertTrue(doSomething === expected, "Fail doSomething")
    }

    @Test
    fun testToString() {
        val customer : CustomerClass = CustomerClass(EXPECTED_ID)
        val toString = customer.toString()
        assertFalse(toString === EXPECTED_ID.toString(), "Fail toString")
        assertTrue(toString == EXPECTED_ID.toString(), "Fail toString")
        assertTrue(toString.equals(EXPECTED_ID.toString()), "Fail toString")
    }
}