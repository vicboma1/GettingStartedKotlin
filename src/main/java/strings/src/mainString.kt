/**
 * Created by vicboma on 26/10/15.
 */
fun main(args: Array<String>) {
    literals()
    templates()
}

private fun templates() {
    val number = 18
    val name = "vicboma $number"
    println(name)

    println("$name.length = ${name.length}")

    val price = "${'$'}9.99 = 9.99 dollars"
    println(price)
}

private fun literals() {
    val helloWorld = "Hello, world!"
    println(helloWorld)
    val str = "Hello, world!\n..."   // w/backslash
    println(str)
}