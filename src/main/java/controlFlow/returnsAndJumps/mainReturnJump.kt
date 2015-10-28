package controlFlow.returnsAndJumps

/**
 * Created by vicboma on 28/10/15.
 *
 * Kotlin has three structural jump operators
 * - return. By default returns from the nearest enclosing function or function expression.
 * — break. Terminates the nearest enclosing loop.
 * - continue. Proceeds to the next step of the nearest enclosing loop.
 *
 */
fun main(args: Array<String>) {

    returnBasic()
    inlineReturn()
    implicitReturn()
    breakLoopContinue()
}

private fun implicitReturn() {
    println("Init implicit return")
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 2) {
            println("Exit implicit return")
            return@forEach
        }
        println(it)
    }
}

private fun inlineReturn() {

    println("Init inline return")
    listOf(1, 2, 3, 4, 5).forEach lit@ {
        if (it == 5) {
            println("Exit inline return")
            return@lit
        }
        println(it)
    }
}

private fun returnBasic(): Unit {
    println("Init Basic return")
    for (i in 0..5) {
        if (i == 5) {
            println("Exit Basic return")
            return
        }
        println(i)
    }

}

private fun breakLoopContinue() {
    println("Init breakLoopContinue Loop")
    Continue@ for (i in 1..100) {
        for (j in 1..100) {
            if (j === 50) {
                break@Continue
            }
        }
    }
    println("Exit breakLoopContinue Loop")
}