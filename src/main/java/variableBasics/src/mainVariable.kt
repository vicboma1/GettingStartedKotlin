/**
 * Created by vicboma on 26/10/15.
 */
fun main(args: Array<String>) {

    immutableValue()
    mutableValue()
    nullableValue()
}

private fun immutableValue() {
    val name  = "Victor"
    //immutable prototype
    //val name : String = "Victor"
    // name = "Victor Manuel"   Error!
    println(name)

}

private fun mutableValue() {
    //mutable prototype
    var lastName: String
    lastName = "Victor Bolinches"
    println(lastName)

}

private fun nullableValue() {
    //var lastNameNullable: String   Error!
    //lastNameNullable = null        Error!

    var lastNameNullable: String?
    lastNameNullable = null
    println(lastNameNullable)
    lastNameNullable = "Victor Manuel Bolinches"
    println(lastNameNullable)
}
