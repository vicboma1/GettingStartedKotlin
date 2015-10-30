/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {
    templateExamples()
}

private fun templateExamples() {
    val customer1 = Customer(1, "victor", "victorbolinchesmarin@gmail.com")
    val customer2 = Customer(1, "victor", "victorbolinchesmarin@gmail.com")
    val customer3 = customer1;
    val dataCustomer4 = DataCustomer(1, "victor", "victorbolinchesmarin@gmail.com")
    val dataCustomer5 = dataCustomer4;

    println(customer1)                    //toString
    println(customer1.hashCode())         //hashCode
    println(customer1.equals(customer2))  //equals()
    println(customer1.equals(customer3))

    //The compiler automatically derives the following members from all properties declared in the primary constructor:
    //equals()/hashCode() pair,
    //toString() of the form "User(name=John, age=42)",
    //componentN() functions corresponding to the properties in their order or declaration,
    //copy() function (see below).
    println(dataCustomer4.equals(dataCustomer5))
    println(dataCustomer4)
}