package controlFlow._while

/**
 * Created by vicboma on 28/10/15.
 */
fun main(args: Array<String>) {
    ArrayWithIterator()
    ArrayDoWhile()
    classic()
}

private fun ArrayDoWhile() {
    var arraySafety = arrayOf<Any?>(1, 2, 3, 4, 5, null)
    doWhile(arraySafety)
}

private fun ArrayWithIterator() {
    var arrayAny = arrayOf(1, 2, 3, 4, 5)
    withIterator(arrayAny)
}

private fun classic() {
    var i = 5
    while (0 <= i) {
        println(i--)
    }
}

private fun doWhile(arraySafety: Array<Any?>) {
    val iterator = arraySafety.iterator()
    do {
        val y = iterator.next()
        println(y)
    } while (y != null) // y is visible here!
}

private fun withIterator(arrayAny: Array<Int>) {
    val iterator = arrayAny.iterator()
    while (iterator.hasNext()) {
        val next = iterator.next()
        println(next)
    }
}
