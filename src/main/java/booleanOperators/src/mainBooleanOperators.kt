import booleanOperators.src.BooleanOperator

/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {

    disjunction()
    conjunction()
    negation()
}

private fun negation() {
    val list = arrayOf(
        BooleanOperator.negation(false),
        BooleanOperator.negation(true)
    )

    printlnResult(list)
}

private fun conjunction() {
    val list = arrayOf(
         BooleanOperator.lazyConjunction(false, false),
         BooleanOperator.lazyConjunction(false, true),
         BooleanOperator.lazyConjunction(true, false),
         BooleanOperator.lazyConjunction(true, true)
    )

    printlnResult(list)
}

private fun disjunction() {
    val list = arrayOf(
        BooleanOperator.lazyDisjunction(false, false),
        BooleanOperator.lazyDisjunction(false, true),
        BooleanOperator.lazyDisjunction(true, false),
        BooleanOperator.lazyDisjunction(true, true)
    )

    printlnResult(list)
}

fun printlnResult(values:Array<Boolean>){
    for(x in values){
        println(x)
    }
}
