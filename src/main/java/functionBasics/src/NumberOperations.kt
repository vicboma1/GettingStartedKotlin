/**
 * Created by vicboma on 27/10/15.
 */
public class NumberOperations{


    // fun addTwoNumbers(first:Int, second :Int)  = first + second  //Equivalente

    fun addTwoNumbers(first:Int, second :Int) : Int {
        val result = first + second
        return result
    }

    //fun addTwoNumbersDefault(first:Int, second :Int = 0)  = first + second  //Equivalente

    fun addTwoNumbersDefault(first:Int, second :Int = 0) : Int {
        val result = first + second
        return result
    }

    inline fun <reified T> reverseList(list : List<T>) : Array<T> {
        return list.reversed().toTypedArray();
    }

    fun printSum(a: Int, b: Int): Unit {
        println(a + b)
    }

    //Funciones de Orden Superior y Expresiones Lambda (como en Haskell :D)

    val sumLambda : (Int, Int) -> Int = { x,y -> x + y}

    fun sumInFunction(x : Int, y : Int, f:(Int, Int) -> Int) : Int {
        return f(x,y)
    }

}