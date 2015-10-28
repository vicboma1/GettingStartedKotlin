package booleanOperators.src

/**
 * Created by vicboma on 28/10/15.
 */
class BooleanOperator{
    companion object {
        fun lazyDisjunction(cond1: Boolean, cond2: Boolean) = cond1 || cond2
        fun lazyConjunction(cond1: Boolean, cond2: Boolean) = cond1 && cond2
        fun negation(cond1: Boolean) = !cond1;
    }
}