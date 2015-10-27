# Getting Started Kotlin
Learn the basics of getting started with kotlin


## Hello World

Main.kt
```kotlin
fun main(args: Array<String>) {
    val name = "Victor"
    val printHelloWorld = PrintHelloWorld()
    printHelloWorld.basic(name)
    printHelloWorld.basicEmpty()
    printHelloWorld.empty()
}
```

PrintHelloWorld.kt
```kotlin
public class PrintHelloWorld{
    companion object { val HELLO_WORLD = "Hello World " }
    public fun basic(name:String){
        println(HELLO_WORLD+name)
    }

    public fun basicEmpty(name:String = ""){
        println(HELLO_WORLD+name)
    }

    public fun empty(){
        println(HELLO_WORLD)
    }
}
```

Result 
```
Hello World Victor
Hello World 
Hello World 
```

##Variable Basics

Main.kt
```kotlin
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
```

Result 
```
Victor
Victor Bolinches
null
Victor Manuel Bolinches
```

##Function Basics

Main.kt
```kotlin
fun main(args: Array<String>) {

    val numberOperations = NumberOperations()

    val addTwoNumbers = numberOperations.addTwoNumbers(first = 2, second = 5)
    println(addTwoNumbers)
    val addTwoNumbers1 = numberOperations.addTwoNumbers(second = 5, first = 2)
    println(addTwoNumbers1)
    val addTwoNumbersDefault = numberOperations.addTwoNumbersDefault(2)
    println(addTwoNumbersDefault)
    val reverseList = numberOperations.reverseList(arrayListOf(1, 2, 3)).asList()
    println(reverseList)
    val reverseList1 = numberOperations.reverseList(listOf(1, 2, 3, 4)).asList()
    println(reverseList1)
}
```

NumberOperations.kt
```kotlin
public class NumberOperations{

    fun addTwoNumbers(first:Int, second :Int) : Int {
        val result = first + second
        return result
    }

    fun addTwoNumbersDefault(first:Int, second :Int = 0) : Int {
        val result = first + second
        return result
    }

    inline fun reverseList<reified T>(list : List<T>) : Array<T> {
        return list.reversed().toTypedArray();
    }
}
```

Result 
```
5 + 2 = 7
2 + 5 = 7
2 + 0 = 2
[1, 2, 3] = [3, 2, 1]
[1, 2, 3, 4] = [4, 3, 2, 1]
```

##Class Basics

Main.kt
```kotlin
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
    println(employee)
}

private fun customerMethod() {
    val customer = Customer(1234)
    customer.doSomething();
    val toString = customer.toString();
    val id = customer.id;
    println("Customer id: $id");
    println("Customer ToString: $toString");
}
```

Customer.kt
```kotlin
public class Customer(_id : Int) {

    val id = _id;
    //prototype
    var name : String? = ""

    fun doSomething(){
        println("Some code")
    }

    override fun toString() : String
    {
        return ""+this.id;
    }
}
```

Employee.kt
```kotlin
public class Employee( val id : Int, val name: String ) {
}
```

Result
```
Some code
Customer id: 1234
Customer ToString: 1234
Id : 1221  Name: Vicboma
Employee ToString: Employee@4cc77c2e
```

##Data Classes

Main.kt
```kotlin

fun main(args: Array<String>) {
    val customer1 = Customer(1, "victor", "victorbolinchesmarin@gmail.com")
    val customer2 = Customer(1, "victor", "victorbolinchesmarin@gmail.com")
    val customer3 = customer1;
    val dataCustomer4 = DataCustomer(1, "victor", "victorbolinchesmarin@gmail.com")
    val dataCustomer5 = dataCustomer4;

    println(customer1)                    //toString
    println(customer1.hashCode())         //hashCode
    println(customer1.equals(customer2))  //equals()
    println(customer1.equals(customer3))

    //The compiler automatically derives the following members from all 
    //properties declared in the primary constructor:
    //equals()/hashCode() pair,
    //toString() of the form "User(name=John, age=42)",
    //componentN() functions corresponding to the properties in their order or declaration,
    //copy() function (see below).
    println(dataCustomer4.equals(dataCustomer5))
    println(dataCustomer4)
}
```

Customer.kt
```kotlin 
public class Customer(val id : Int, val name : String, val email : String) {
}
```

DataCustomer.kt
```kotlin
/**
 * The primary constructor needs to have at least one parameter;
 * All primary constructor parameters need to be marked as val or var;
 * Data classes cannot be abstract, open, sealed or inner;
 * Data classes may not extend other classes (but may implement interfaces).
 */
data public class DataCustomer(val id : Int, val name : String, val email : String) {
}
```

Result
```
Customer@4cc77c2e
1288141870
false
true
true
DataCustomer(id=1, name=victor, email=victorbolinchesmarin@gmail.com)
```

##Extension Function Basics

Main.kt
```kotlin
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
```

Result
```
function: this_is_my_text
Invoke Instance String: this_is_my_text
```

Reference:
* Video tutorials: https://kotlinlang.org/docs/videos.html
* Manual: https://kotlinlang.org/docs/kotlin-docs.pdf

[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/vicboma1/gettingstartedkotlin/trend.png)](https://bitdeli.com/free "Bitdeli Badge") [![Analytics](https://ga-beacon.appspot.com/UA-68658653-5/gettingstartedkotlin/readme)](https://github.com/igrigorik/ga-beacon)




