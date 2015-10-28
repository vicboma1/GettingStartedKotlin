/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {

    var array = arrayOf(1,2,3)
    for(i in array)
        _whenDefault(i)

    for(i in array)
        whenCombined(i)

    var arrayAny = arrayOf<Any?>(1,2.0,5F,"",true)
    implicitCasts(arrayAny)

    var arrayNumber = arrayOf(1,2,19,20,14,35,45)
    expression(arrayNumber)
}

/**
 * We can also check a value For being in or !in a range or a collection:
 */
private fun expression(arrayNumber: Array<Int>) {
    val validNumbers = arrayOf(35)
    for (obj in arrayNumber)
        when (obj) {
            in 1..10 -> println("x is in the range")
            in validNumbers -> println("x is valid")
            !in 10..20 -> println("x is outside the range")
            else -> println("none of the above")
        }
}

/**
 * with patter matching
 */
private fun implicitCasts(arrayAny: Array<Any?>) {
    for (obj in arrayAny)
        when (obj) {
            is String -> println("is String")
            is Int -> println("is Int")
            is Float -> println("is Float")
            is Double -> println("is Double")
            !is Boolean -> println("is not Boolean")
            else -> println("is Boolean ")
        }
}


/**
 * If many cases should be handled in the same way, the branch conditions may be combined with a comma
 */
private fun whenCombined(i: Int) {
    when (i) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }
}

/**
 * when replaces the switch operator of C-like languages
 * when can be used either as an expression or as a statement
 */
private fun _whenDefault(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            // Note the block
            println("x is neither 1 nor 2")
        }
    }
}