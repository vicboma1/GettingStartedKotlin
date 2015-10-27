/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {
    customerMethod()
    employeeMethod()
}

private fun employeeMethod() {
    val employee = Employee(1221, "Vicboma")
    val toString = employee.toString()
    val id = employee.id
    val name = employee.name

    println("Id : $id  Name: $name")
    println("Employee ToString: $toString")
}

private fun customerMethod() {
    val customer = CustomerClass(1234)
    customer.doSomething();
    val toString = customer.toString();
    val id = customer.id;
    println("Customer id: $id");
    println("Customer ToString: $toString");
}