/**
 * Created by vicboma on 26/10/15.
 */
fun main(args: Array<String>) {
    val list = listOf(10, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)

    doubleResult(list)
    filter(list)
    map(list)
}

//infix without paren + brace
private fun map(list: List<Int>) = list.filter { it % 2 == 0 }.map { it - 1 }.forEach { println(it) }

//infix without Dots & paren + brace
private fun filter(list: List<Int>) = list filter { it % 2 == 0 } forEach { println(it) }

//infix with paren & brace
private fun doubleResult(list: List<Int>) = list.forEach({ println(it * 2) })


