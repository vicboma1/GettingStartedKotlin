/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {
    val numberOperations = NumberOperations()

    twoNumbers(numberOperations)
    twoNumberReverse(numberOperations)
    addTwoNumbersDefault(numberOperations)
    reverseList(numberOperations)
    reverseList2(numberOperations)
    sumLambda(numberOperations)
    sumLambdainFunction(numberOperations)
    sumInlineOperation(numberOperations)
}

private fun sumInlineOperation(numberOperations: NumberOperations) {
    val sumInFunction = numberOperations.sumInFunction(5, 9, { x, y -> x + y })
    println(sumInFunction)
}

private fun sumLambdainFunction(numberOperations: NumberOperations) {
    val _sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    val _sumInFunction = numberOperations.sumInFunction(9, 9, _sumLambda)
    println(_sumInFunction)
}

private fun sumLambda(numberOperations: NumberOperations) {
    val sumLambda = numberOperations.sumLambda(2, 2)
    println(sumLambda)
}

private fun reverseList2(numberOperations: NumberOperations) {
    val reverseList1 = numberOperations.reverseList(listOf(1, 2, 3, 4)).asList()
    println(reverseList1)
}

private fun reverseList(numberOperations: NumberOperations) {
    val reverseList = numberOperations.reverseList(arrayListOf(1, 2, 3)).asList()
    println(reverseList)
}

private fun addTwoNumbersDefault(numberOperations: NumberOperations) {
    val addTwoNumbersDefault = numberOperations.addTwoNumbersDefault(2)
    println(addTwoNumbersDefault)
}

private fun twoNumbers(numberOperations: NumberOperations) {
    val addTwoNumbers = numberOperations.addTwoNumbers(first = 2, second = 5)
    println(addTwoNumbers)
}

private fun twoNumberReverse(numberOperations: NumberOperations) {
    val addTwoNumbers1 = numberOperations.addTwoNumbers(second = 5, first = 2)
    println(addTwoNumbers1)
}

