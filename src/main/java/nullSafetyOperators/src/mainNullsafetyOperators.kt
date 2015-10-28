/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {

    //Checking for Null in conditions
    val listImmutable = listOf(1,2,3,4)

    val size = listImmutable.size
    if (listImmutable != null && size > 0)
        println("Array of size $size")
    else
        println("Empty Array")


    //Safe Calls - Any"?".property
    val listMutable = arrayOf(1,2,3,4)

    val _size = listMutable?.size
    if (listMutable != null && _size > 0)
        println("Array of size $_size")
    else
        println("Empty Array")


    //Elvis Operator
    val result = listMutable?.size ?: -1
    println(result)


    //Safe Casts
    val a : Double = 2.0
    val aInt: Int? = a as? Int
    println(aInt)


    //The !! Operator
    val str:String? = null
    val len = str!!.length  //accedemos a la propiedad, pero dará una excepción.
}

