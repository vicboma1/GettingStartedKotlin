/**
 * Created by vicboma on 26/10/15.
 */
fun main(args: Array<String>) {
    val printHelloWorld = PrintHelloWorld()
    basic(printHelloWorld)
    basicEmpty(printHelloWorld)
    empty(printHelloWorld)
}

private fun empty(printHelloWorld: PrintHelloWorld) {
    printHelloWorld.empty()
}

private fun basicEmpty(printHelloWorld: PrintHelloWorld) {
    printHelloWorld.basicEmpty()
}

private fun basic(printHelloWorld: PrintHelloWorld) {
    val name = "Victor"
    printHelloWorld.basic(name)
}


