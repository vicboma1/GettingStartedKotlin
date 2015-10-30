import classBasics.src.Math
/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {
    val math : Math = Math()
    max(math)
    min(math)
    maxIn(math)
    minIn(math)
    lambdas(math)
}

private fun lambdas(math: Math) {
    val maxLambda: (Int, Int) -> Int = { x, y -> if (x > y) x else y }
    val minLambda: (Int, Int) -> Int = { x, y -> if (x > y) y else x }

    val inFunctionMax = math.inFunction(100, 3, maxLambda)
    val inFunctionMin = math.inFunction(100, 3, minLambda)

    println(inFunctionMax)
    println(inFunctionMin)
}

private fun minIn(math: Math) {
    val minIn = math.minIn(4, 1)
    val minIn1 = math.minIn(4, 4)
    println(minIn)
    println(minIn1)
}

private fun maxIn(math: Math) {
    val maxIn = math.maxIn(3, 6)
    println(maxIn)
}

private fun min(math: Math) {
    val min = math.min(8, 0)
    println(min)
}

private fun max(math: Math) {
    val max = math.max(6, 7)
    println(max)
}

