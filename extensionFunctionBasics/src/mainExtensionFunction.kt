/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {
    val str = "this is my text"
    val convertSpacesToUnderscores = convertSpacesToUnderscores(str);
    println(convertSpacesToUnderscores)
    val convertSpacesToUnderscoresInvokeInstanceString = str.convertSpacesToUnderscoresInvokeInstanceString()
    println(convertSpacesToUnderscoresInvokeInstanceString)
}


fun convertSpacesToUnderscores(str: String) : String {
    return str.replace(" ","_")
}

fun String.convertSpacesToUnderscoresInvokeInstanceString() : String {
    return this.replace(" ","_")
}