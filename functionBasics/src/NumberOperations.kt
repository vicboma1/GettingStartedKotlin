/**
 * Created by vicboma on 27/10/15.
 */
public class NumberOperations{

    fun addTwoNumbers(first:Int, second :Int) : Int {
        val result = first + second
        return result
    }

    fun addTwoNumbersDefault(first:Int, second :Int = 0) : Int {
        val result = first + second
        return result
    }

    inline fun reverseList<reified T>(list : List<T>) : Array<T> {
        return list.reversed().toTypedArray();
    }
}