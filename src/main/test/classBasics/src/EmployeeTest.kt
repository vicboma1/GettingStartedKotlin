package classBasics.src

import Employee
import junit.framework.Assert.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created by vicboma on 28/10/15.
 */
class EmployeeTest {

    companion object {
        val EXPECTED_ID = 1
        val EXPECTED_NAME = "Victor"
    }

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun testGetId() {
        val employee = Employee(EXPECTED_ID,EXPECTED_NAME)
        val id = employee.id
        assertTrue("Fail id", id === EXPECTED_ID )
    }

    @Test
    fun testGetName() {
        val employee = Employee(name = EXPECTED_NAME, id = EXPECTED_ID)
        val name = employee.name
        assertTrue("Fail name", name === EXPECTED_NAME)
        assertTrue("Fail name", name == EXPECTED_NAME)
        assertTrue("Fail name", name.equals(EXPECTED_NAME))
    }
}