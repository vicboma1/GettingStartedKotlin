/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {
    val str = functionClassic()
    functionInvokeInstance(str)
}

private fun functionInvokeInstance(str: String) {
    val convertSpacesToUnderscoresInvokeInstanceString = str.convertSpacesToUnderscoresInvokeInstanceString()
    println(convertSpacesToUnderscoresInvokeInstanceString)
}

private fun functionClassic(): String {
    val str = "this is my text"
    val convertSpacesToUnderscores = convertSpacesToUnderscores(str);
    println(convertSpacesToUnderscores)
    return str
}


fun convertSpacesToUnderscores(str: String) : String {
    return str.replace(" ","_")
}

fun String.convertSpacesToUnderscoresInvokeInstanceString() : String {
    return this.replace(" ","_")
}