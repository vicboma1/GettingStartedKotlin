package classBasics.src

import booleanOperators.src.BooleanOperator
import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue


/**
 * Created by vicboma on 27/10/15.
 */
class BooleanOperatorTest {

    companion object {
        val EXPECTED_DISJUNCTION = arrayOf(false,true,true,true)
        val EXPECTED_CONJUNCTION = arrayOf(false,false,false,true)
        val EXPECTED_NEGATION = arrayOf(true,false)
    }

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun testDisjunction() {
        val list = arrayOf(
                BooleanOperator.lazyDisjunction(false, false),
                BooleanOperator.lazyDisjunction(false, true),
                BooleanOperator.lazyDisjunction(true, false),
                BooleanOperator.lazyDisjunction(true, true)
        )

        var i = 0
        for(result in list){
            assertTrue(result === EXPECTED_DISJUNCTION.get(i),"Fail disjunction")
            i++
        }
    }

    @Test
    fun testConjunction() {
        val list = arrayOf(
                BooleanOperator.lazyConjunction(false, false),
                BooleanOperator.lazyConjunction(false, true),
                BooleanOperator.lazyConjunction(true, false),
                BooleanOperator.lazyConjunction(true, true)
        )

        var i = 0
        for(result in list){
            assertTrue(result === EXPECTED_CONJUNCTION.get(i),"Fail conjunction")
            i++
        }
    }

    @Test
    fun testNegation() {
        val list = arrayOf(
                BooleanOperator.negation(false),
                BooleanOperator.negation(true)
        )

        var i = 0
        for(result in list){
            assertTrue(result === EXPECTED_NEGATION.get(i),"Fail negation")
            i++
        }
    }
}