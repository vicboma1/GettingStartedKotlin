/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {

    val numberOperations = NumberOperations()

    val addTwoNumbers = numberOperations.addTwoNumbers(first = 2, second = 5)
    println(addTwoNumbers)
    val addTwoNumbers1 = numberOperations.addTwoNumbers(second = 5, first = 2)
    println(addTwoNumbers1)
    val addTwoNumbersDefault = numberOperations.addTwoNumbersDefault(2)
    println(addTwoNumbersDefault)

    val reverseList = numberOperations.reverseList(arrayListOf(1, 2, 3)).asList()
    println(reverseList)
    val reverseList1 = numberOperations.reverseList(listOf(1, 2, 3, 4)).asList()
    println(reverseList1)

    val sumLambda = numberOperations.sumLambda(2, 2)
    println(sumLambda)

    val _sumLambda : (Int, Int) -> Int = { x,y -> x + y}
    val _sumInFunction = numberOperations.sumInFunction(9, 9, _sumLambda)
    println(_sumInFunction)

    val sumInFunction = numberOperations.sumInFunction(5, 9, { x, y -> x + y })
    println(sumInFunction)


}

