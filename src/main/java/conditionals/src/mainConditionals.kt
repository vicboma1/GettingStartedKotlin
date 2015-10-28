import classBasics.src.Math
/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {

    val math : Math = Math()

    val max = math.max(6, 7)
    println(max)

    val min = math.min(8, 0)
    println(min)

    val maxIn = math.maxIn(3, 6)
    println(maxIn)

    val minIn = math.minIn(4, 1)
    println(minIn)

    println(math.minIn(4, 4))


    val maxLambda : (Int, Int) -> Int = { x , y -> if (x > y) x else y }
    val minLambda : (Int, Int) -> Int = { x , y -> if (x > y) y else x }

    val inFunctionMax = math.inFunction(100, 3, maxLambda)
    val inFunctionMin = math.inFunction(100, 3, minLambda)

    println(inFunctionMax)
    println(inFunctionMin)
}

