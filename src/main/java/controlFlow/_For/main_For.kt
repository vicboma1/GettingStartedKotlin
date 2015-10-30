package controlFlow._For

/**
 * Created by vicboma on 28/10/15.
 */
fun main(args: Array<String>) {
    var arrayAny = arrayOf(12,2.3,45F,"Soy una String",true, null)
    anIterator(arrayAny)
    withBodyBlock(arrayAny)
    withIndices(arrayAny)
}

private fun withIndices(arrayAny: Array<Any?>) {
    for (i in arrayAny.indices)
        println(arrayAny[i])
}

private fun anIterator(arrayAny: Array<Any?>) {
    for (any in arrayAny)
        println(any)
}

private fun withBodyBlock(arrayAny: Array<Any?>) {
    for (any: Any? in arrayAny) {
        print(any)
        print("\n")
    }
}