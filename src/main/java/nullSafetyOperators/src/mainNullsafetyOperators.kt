/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {
    checkingForNullcondition()
    val listMutable = safetyAccess()
    elvisOperator(listMutable)
    safetyCasts()
    specialOperator()
}

private fun specialOperator() {
    val str: String? = null
    val len = str!!.length  //accedemos a la propiedad, pero dará una excepción.
}

private fun safetyCasts() {
    val a: Double = 2.0
    val aInt: Int? = a as? Int
    println(aInt)
}

private fun elvisOperator(listMutable: Array<Int>) {
    val result = listMutable?.size ?: -1
    println(result)
}

//Safe Calls - Any"?".property
private fun safetyAccess(): Array<Int> {
    val listMutable = arrayOf(1, 2, 3, 4)

    val _size = listMutable?.size
    if (listMutable != null && _size > 0)
        println("Array of size $_size")
    else
        println("Empty Array")
    return listMutable
}

private fun checkingForNullcondition() {
    val listImmutable = listOf(1, 2, 3, 4)

    val size = listImmutable.size
    if (listImmutable != null && size > 0)
        println("Array of size $size")
    else
        println("Empty Array")
}

