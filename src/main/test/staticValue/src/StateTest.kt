package staticValue.src

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Created by vicboma on 30/10/15.
 *
 * Test with closure fun
 */
class StateTest{

    @Test
    fun testStop(){
        val expected = 0;
        assertTrue(
            "Fail Stop",
            State.STOP == expected
        )
    }

    @Test
    fun testStart(){
        val expected = 1;
        assertTrue(
            "Fail Start",
            State.START == expected
        )
    }
}