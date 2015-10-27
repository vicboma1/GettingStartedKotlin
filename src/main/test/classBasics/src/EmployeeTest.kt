package classBasics.src

import Employee
import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue

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
        assertTrue(id === EXPECTED_ID, "Fail id")
    }

    @Test
    fun testGetName() {
        val employee = Employee(name = EXPECTED_NAME, id = EXPECTED_ID)
        val name = employee.name
        assertTrue(name === EXPECTED_NAME, "Fail name")
        assertTrue(name == EXPECTED_NAME, "Fail name")
        assertTrue(name.equals(EXPECTED_NAME), "Fail name")

    }
}