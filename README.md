# Getting Started Kotlin
Learn the basics of getting started with kotlin

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.eluder.coveralls/coveralls-maven-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.eluder.coveralls/coveralls-maven-plugin/)
[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/vicboma1/gettingstartedkotlin/trend.png)](https://bitdeli.com/free "Bitdeli Badge") [![Analytics](https://ga-beacon.appspot.com/UA-68658653-5/gettingstartedkotlin/readme)](https://github.com/igrigorik/ga-beacon)


##Indexes
* [Hello World](https://github.com/vicboma1/GettingStartedKotlin#hello-world)
* [Variable Basics](https://github.com/vicboma1/GettingStartedKotlin#variable-basics)
* [Strings](https://github.com/vicboma1/GettingStartedKotlin#strings)
* [Boolean Operators](https://github.com/vicboma1/GettingStartedKotlin#boolean-operators)
* [Conditional](https://github.com/vicboma1/GettingStartedKotlin#conditional)
* [Function Basics](https://github.com/vicboma1/GettingStartedKotlin#function-basics)
* [Class Basics](https://github.com/vicboma1/GettingStartedKotlin#class-basics)
* [Data Classes](https://github.com/vicboma1/GettingStartedKotlin#data-classes)
* [Extension Function Basics](https://github.com/vicboma1/GettingStartedKotlin#extension-function-basics)
* [Null Safety](https://github.com/vicboma1/GettingStartedKotlin#null-safety)




## [Hello World](https://youtu.be/iMMBrcabSOI)

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

##[Variable Basics](https://youtu.be/bklpMxuzCWU)

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

##Strings

Main.kt
```kotlin
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
```

Result 
```
Hello, world!
Hello, world!
...
vicboma 18
vicboma 18.length = 10
$9.99 = 9.99 dollars
```

##Boolean Operators

Main.kt
```kotlin
fun main(args: Array<String>) {
    disjunction()
    conjunction()
    negation()
}

private fun negation() {
    val list = arrayOf(
        BooleanOperator.negation(false),
        BooleanOperator.negation(true)
    )

    printlnResult(list)
}

private fun conjunction() {
    val list = arrayOf(
         BooleanOperator.lazyConjunction(false, false),
         BooleanOperator.lazyConjunction(false, true),
         BooleanOperator.lazyConjunction(true, false),
         BooleanOperator.lazyConjunction(true, true)
    )

    printlnResult(list)
}

private fun disjunction() {
    val list = arrayOf(
        BooleanOperator.lazyDisjunction(false, false),
        BooleanOperator.lazyDisjunction(false, true),
        BooleanOperator.lazyDisjunction(true, false),
        BooleanOperator.lazyDisjunction(true, true)
    )

    printlnResult(list)
}

fun printlnResult(values:Array<Boolean>){
    for(x in values){
        println(x)
    }
}
```

BooleanOperator.kt
```kotlin
class BooleanOperator{
    companion object {
        fun lazyDisjunction(cond1: Boolean, cond2: Boolean) = cond1 || cond2
        fun lazyConjunction(cond1: Boolean, cond2: Boolean) = cond1 && cond2
        fun negation(cond1: Boolean) = !cond1;
    }
}
```

Result 
```
//Disjunction
false false = false
false true  = true
true  false = true
true  true  = true

//Conjunction
false false = false
false true  = false
true  false = false
true  true  = true

//Negation
false = true
true  = false
```

##Conditional

Main.kt
```kotlin
fun main(args: Array<String>) {

    val math : Math = Math()

    val max = math.max(6, 7)
    println(max)

    val min = math.min(8, 0)
    println(min)

    val maxIn = math.maxIn(3, 6)
    println(maxIn)

    val minIn = math.minIn(4, 1)
    println(minIn)

    println(math.minIn(4, 4))
    
    
    val maxLambda : (Int, Int) -> Int = { x , y -> if (x > y) x else y }
    val minLambda : (Int, Int) -> Int = { x , y -> if (x > y) y else x }

    val inFunctionMax = math.inFunction(100, 3, maxLambda)
    val inFunctionMin = math.inFunction(100, 3, minLambda)

    println(inFunctionMax)
    println(inFunctionMin)
}

```

Math.kt
```kotlin
class Math {

    fun max(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun min(a: Int, b: Int): Int {
        if (a > b) {
            return b
        } else {
            return a
        }
    }

    fun maxIn(a: Int, b: Int): Int = if(a > b) a else b

    fun minIn(a: Int, b: Int): Int = if (a > b) b else a

    //val max : (Int, Int) -> Int = { x , y -> if (x > y) x else y }
    //val min : (Int, Int) -> Int = { x , y -> if (x > y) y else x }

    fun inFunction(x : Int, y : Int, f:(Int, Int) -> Int) : Int {
        return f(x,y)
    }
}
```

Result 
```
7
0
6
1
100
3
4
```

##[Function Basics](https://youtu.be/-4XuESEe45c)

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
    
    val sumLambda = numberOperations.sumLambda(2, 2)
    println(sumLambda)
    
    val _sumLambda : (Int, Int) -> Int = { x,y -> x + y}
    val _sumInFunction = numberOperations.sumInFunction(9, 9, _sumLambda)
    println(_sumInFunction)

    val sumInFunction = numberOperations.sumInFunction(5, 9, { x, y -> x + y })
    println(sumInFunction)
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
    
    Funciones de Orden Superior y Expresiones Lambda (como en Haskell :D)
   
    val sumLambda : (Int, Int) -> Int = { x,y -> x + y}
   
    fun sumInFunction(x : Int, y : Int, f:(Int, Int) -> Int) : Int {
          return f(x,y)
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
2 + 2 = 4
9 + 9 = 18
5 + 9 = 14
```

##[Class Basics](https://youtu.be/SI2HiSLDFFs)

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

##[Data Classes](https://youtu.be/GhwZNoQqejQ)

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

##[Extension Function Basics](https://youtu.be/SMzNduaGcuo)

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

## Null Safety

Main.kt
```kotlin
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
```

Result
```
Array of size 4
Array of size 4
4
null
Exception in thread "main" kotlin.KotlinNullPointerException
	at MainNullsafetyOperatorsKt.main(mainNullsafetyOperators.kt:39)
```


Reference:
* Main : http://kotlin.es
* Facebook : https://www.facebook.com/kotlin.es
* Video tutorials: https://kotlinlang.org/docs/videos.html
* Manual: https://kotlinlang.org/docs/kotlin-docs.pdf

