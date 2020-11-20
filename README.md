# Getting Started Kotlin
Learn the basics of getting started with kotlin

[![Build](https://travis-ci.org/vicboma1/GettingStartedKotlin.svg?branch=master)](https://travis-ci.org/vicboma1/GettingStartedKotlin) [![Kotlin](http://img.shields.io/badge/Kotlin-1.3.0_rc_198-blue)](http://kotlinlang.org) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.eluder.coveralls/coveralls-maven-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.eluder.coveralls/coveralls-maven-plugin/)
[![Analytics](https://ga-beacon.appspot.com/UA-68658653-5/gettingstartedkotlin/readme)](https://github.com/igrigorik/ga-beacon)

--->>>   [Repo: Kotlin Koans](https://github.com/vicboma1/Kotlin-Koans)   <<<---

--->>>   [Repo: Problems Kotlin](https://github.com/vicboma1/Kotlin-Examples-Problems/blob/master/README.md)   <<<---

--->>>   [Repo: GameBoy Emulator Enviroment](https://github.com/vicboma1/GameBoyEmulatorEnvironment)   <<<---

--->>>   [Repo: Kotlin Mobile](https://github.com/vicboma1/KotlinMobilePoC_MasterUV2018)   <<<---

--->>> [Repo: Kotlin JavaScript](https://github.com/vicboma1/kotlinJavaScript)  <<<---

--->>> [Repo: Kotlin Native - iOS ](https://github.com/vicboma1/Kotlin-Native-iOS)  <<<---

--->>> [Repo: Ktor Examples](https://github.com/vicboma1/ktor-API-examples)  <<<---

## Indexes
* [Hello World](https://github.com/vicboma1/GettingStartedKotlin#hello-world)
* [Basic Variables](https://github.com/vicboma1/GettingStartedKotlin#basic-variables)
* [Static Values](https://github.com/vicboma1/GettingStartedKotlin#static-values)
* [Strings](https://github.com/vicboma1/GettingStartedKotlin#strings)
* [Boolean Operators](https://github.com/vicboma1/GettingStartedKotlin#boolean-operators)
* [Conditional](https://github.com/vicboma1/GettingStartedKotlin#conditional)
* [Control Flow](https://github.com/vicboma1/GettingStartedKotlin#control-flow)
* [Constructors](https://github.com/vicboma1/GettingStartedKotlin#constructors)
* [Basic Functions](https://github.com/vicboma1/GettingStartedKotlin#basic-functions)
* [Basic Classes](https://github.com/vicboma1/GettingStartedKotlin#basic-classes)
* [Data Classes](https://github.com/vicboma1/GettingStartedKotlin#data-classes)
* [Singleton Class](https://github.com/vicboma1/GettingStartedKotlin#singleton-class)
* [Properties](https://github.com/vicboma1/GettingStartedKotlin#properties)
* [Interface](https://github.com/vicboma1/GettingStartedKotlin#interface)
* [Herencia](https://github.com/vicboma1/GettingStartedKotlin#herencia)
* [Extension Function Basics](https://github.com/vicboma1/GettingStartedKotlin#extension-function-basics)
* [Null Safety](https://github.com/vicboma1/GettingStartedKotlin#null-safety)
* [Infix Function](https://github.com/vicboma1/GettingStartedKotlin#infix-function)


## [Hello World](https://youtu.be/iMMBrcabSOI)

Main.kt
```kotlin
fun main(args: Array<String>) {
    val printHelloWorld = PrintHelloWorld()
    basic(printHelloWorld)
    basicEmpty(printHelloWorld)
    empty(printHelloWorld)
}

private fun empty(printHelloWorld: PrintHelloWorld) {
    printHelloWorld.empty()
}

private fun basicEmpty(printHelloWorld: PrintHelloWorld) {
    printHelloWorld.basicEmpty()
}

private fun basic(printHelloWorld: PrintHelloWorld) {
    val name = "Victor"
    printHelloWorld.basic(name)
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

## [Basic Variables](https://youtu.be/bklpMxuzCWU)

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
## Static Values
Main.kt
```kotlin
fun main(args: Array<String>) {
    start()
    stop()
}

fun start() = println("State static: ${State.START}")
fun stop()  = println("State static: ${State.STOP}")
```

State.kt
```kotlin
public class State {
    companion object {
        val START = 1
        val STOP = 0
    }
}
```

Result
```
State static = 0
State static = 1
```

## Strings

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

## Boolean Operators

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

## Conditional

Main.kt
```kotlin
fun main(args: Array<String>) {
    val math : Math = Math()
    max(math)
    min(math)
    maxIn(math)
    minIn(math)
    lambdas(math)
}

private fun lambdas(math: Math) {
    val maxLambda: (Int, Int) -> Int = { x, y -> if (x > y) x else y }
    val minLambda: (Int, Int) -> Int = { x, y -> if (x > y) y else x }

    val inFunctionMax = math.inFunction(100, 3, maxLambda)
    val inFunctionMin = math.inFunction(100, 3, minLambda)

    println(inFunctionMax)
    println(inFunctionMin)
}

private fun minIn(math: Math) {
    val minIn = math.minIn(4, 1)
    val minIn1 = math.minIn(4, 4)
    println(minIn)
    println(minIn1)
}

private fun maxIn(math: Math) {
    val maxIn = math.maxIn(3, 6)
    println(maxIn)
}

private fun min(math: Math) {
    val min = math.min(8, 0)
    println(min)
}

private fun max(math: Math) {
    val max = math.max(6, 7)
    println(max)
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
## Control Flow

#### While
Main.kt
```kotlin
fun main(args: Array<String>) {
    ArrayWithIterator()
    ArrayDoWhile()
    classic()
}

private fun ArrayDoWhile() {
    var arraySafety = arrayOf<Any?>(1, 2, 3, 4, 5, null)
    doWhile(arraySafety)
}

private fun ArrayWithIterator() {
    var arrayAny = arrayOf(1, 2, 3, 4, 5)
    withIterator(arrayAny)
}

private fun classic() {
    var i = 5
    while (0 <= i) {
        println(i--)
    }
}

private fun doWhile(arraySafety: Array<Any?>) {
    val iterator = arraySafety.iterator()
    do {
        val y = iterator.next()
        println(y)
    } while (y != null) // y is visible here!
}

private fun withIterator(arrayAny: Array<Int>) {
    val iterator = arrayAny.iterator()
    while (iterator.hasNext()) {
        val next = iterator.next()
        println(next)
    }
}
```

Result 
```
1
2
3
4
5

1
2
3
4
5
null

5
4
3
2
1
0
```

#### For
Main.kt
```kotlin
fun main(args: Array<String>) {

    var arrayAny = arrayOf(12,2.3,45F,"Soy una String",true, null)
    anIterator(arrayAny)
    withBodyBlock(arrayAny)
    withIndices(arrayAny)
}

private fun withIndices(arrayAny: Array<Any?>) {
    for (i in arrayAny.indices)
        println(arrayAny[i])
}

private fun anIterator(arrayAny: Array<Any?>) {
    for (any in arrayAny)
        println(any)
}

private fun withBodyBlock(arrayAny: Array<Any?>) {
    for (any: Any? in arrayAny) {
        print(any)
        print("\n")
    }
}
```
Result
```
12
2.3
45.0
Soy una String
true
null

12
2.3
45.0
Soy una String
true
null

12
2.3
45.0
Soy una String
true
null
```


#### When

Main.kt
```kotlin
fun main(args: Array<String>) {
    var array = arrayOf(1,2,3)
    forWhenDefault(array)
    forWhenCombined(array)
    forImplicitCast()
    expression()
}

private fun expression() {
    var arrayNumber = arrayOf(1, 2, 19, 20, 14, 35, 45)
    expression(arrayNumber)
}

private fun forImplicitCast() {
    var arrayAny = arrayOf<Any?>(1, 2.0, 5F, "", true)
    implicitCasts(arrayAny)
}

private fun forWhenCombined(array: Array<Int>) {
    for (i in array)
        whenCombined(i)
}

private fun forWhenDefault(array: Array<Int>) {
    for (i in array)
        _whenDefault(i)
}

/**
 * We can also check a value For being in or !in a range or a collection:
 */
private fun expression(arrayNumber: Array<Int>) {
    val validNumbers = arrayOf(35)
    for (obj in arrayNumber)
        when (obj) {
            in 1..10 -> println("x is in the range")
            in validNumbers -> println("x is valid")
            !in 10..20 -> println("x is outside the range")
            else -> println("none of the above")
        }
}

/**
 * with patter matching
 */
private fun implicitCasts(arrayAny: Array<Any?>) {
    for (obj in arrayAny)
        when (obj) {
            is String -> println("is String")
            is Int -> println("is Int")
            is Float -> println("is Float")
            is Double -> println("is Double")
            !is Boolean -> println("is not Boolean")
            else -> println("is Boolean ")
        }
}


/**
 * If many cases should be handled in the same way, the branch conditions may be combined with a comma
 */
private fun whenCombined(i: Int) {
    when (i) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }
}

/**
 * when replaces the switch operator of C-like languages
 * when can be used either as an expression or as a statement
 */
private fun _whenDefault(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            // Note the block
            println("x is neither 1 nor 2")
        }
    }
}
```

Result
```
x == 1
x == 2
x is neither 1 nor 

x == 0 or x == 1
otherwise
otherwise

is Int
is Double
is Float
is String
is Boolean 

x is in the range
x is in the range
none of the above
none of the above
none of the above
x is valid
x is outside the range

```

#### Return and Jump
Kotlin has three structural jump operators
 * - return. By default returns from the nearest enclosing function or function expression.
 * — break. Terminates the nearest enclosing loop.
 * - continue. Proceeds to the next step of the nearest enclosing loop.
 
```kotlin
fun main(args: Array<String>) {
    returnBasic()
    inlineReturn()
    implicitReturn()
    breakLoopContinue()
}

private fun implicitReturn() {
    println("Init implicit return")
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 2) {
            println("Exit implicit return")
            return@forEach
        }
        println(it)
    }
}

private fun inlineReturn() {

    println("Init inline return")
    listOf(1, 2, 3, 4, 5).forEach lit@ {
        if (it == 5) {
            println("Exit inline return")
            return@lit
        }
        println(it)
    }
}

private fun returnBasic(): Unit {
    println("Init Basic return")
    for (i in 0..5) {
        if (i == 5) {
            println("Exit Basic return")
            return
        }
        println(i)
    }

}

private fun breakLoopContinue() {
    println("Init Basic Loop")
    Continue@ for (i in 1..100) {
        for (j in 1..100) {
            if (j === 50) {
                break@Continue
            }
        }
    }
    println("Exit Basic Loop")
}
```

Result
```
//returnBasic
Init Basic return
0
1
2
3
4
Exit Basic return

//inlineReturn
Init inline return
1
2
3
4
Exit inline return

//implicitReturn
Init implicit return
1
Exit implicit return
3
4
5

//breakLoopContinue
Init breakLoopContinue Loop
Exit breakLoopContinue Loop
```
## Constructors

Primary 
```kotlin
class MyView (ctx: Context): View(ctx) {
   ...
}
```  

Secundary
```kotlin
class MyView : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}
```

Internal
```kotlin
class MyView internal constructor(ctx: Context) : View (ctx) {
   ...
}
```

## [Basics Functions ](https://youtu.be/-4XuESEe45c)

Main.kt
```kotlin
fun main(args: Array<String>) {
    val numberOperations = NumberOperations()

    twoNumbers(numberOperations)
    twoNumberReverse(numberOperations)
    addTwoNumbersDefault(numberOperations)
    reverseList(numberOperations)
    reverseList2(numberOperations)
    sumLambda(numberOperations)
    sumLambdainFunction(numberOperations)
    sumInlineOperation(numberOperations)
}

private fun sumInlineOperation(numberOperations: NumberOperations) {
    val sumInFunction = numberOperations.sumInFunction(5, 9, { x, y -> x + y })
    println(sumInFunction)
}

private fun sumLambdainFunction(numberOperations: NumberOperations) {
    val _sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    val _sumInFunction = numberOperations.sumInFunction(9, 9, _sumLambda)
    println(_sumInFunction)
}

private fun sumLambda(numberOperations: NumberOperations) {
    val sumLambda = numberOperations.sumLambda(2, 2)
    println(sumLambda)
}

private fun reverseList2(numberOperations: NumberOperations) {
    val reverseList1 = numberOperations.reverseList(listOf(1, 2, 3, 4)).asList()
    println(reverseList1)
}

private fun reverseList(numberOperations: NumberOperations) {
    val reverseList = numberOperations.reverseList(arrayListOf(1, 2, 3)).asList()
    println(reverseList)
}

private fun addTwoNumbersDefault(numberOperations: NumberOperations) {
    val addTwoNumbersDefault = numberOperations.addTwoNumbersDefault(2)
    println(addTwoNumbersDefault)
}

private fun twoNumbers(numberOperations: NumberOperations) {
    val addTwoNumbers = numberOperations.addTwoNumbers(first = 2, second = 5)
    println(addTwoNumbers)
}

private fun twoNumberReverse(numberOperations: NumberOperations) {
    val addTwoNumbers1 = numberOperations.addTwoNumbers(second = 5, first = 2)
    println(addTwoNumbers1)
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

## [Basic Classes](https://youtu.be/SI2HiSLDFFs)

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

## [Data Classes](https://youtu.be/GhwZNoQqejQ)

Main.kt
```kotlin
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

## Singleton Class

```java
public class Singleton {

    private String b;
    private static Singleton instance;
	
    private Singleton() {
    	System.out.println("This "+this+" is a singleton")
    }
    
    public static Singleton getInstance() {
        if (instance == null) 
            instance = new Singleton();
       
        return instance;
    }
    
    public void setB(String b) { this.b = b;}
    public String getB() { return this.b; }
}

---------
final Singleton first = new Singleton()       
first.setB("hello singleton"=

String second =  new Singleton()       
println(second.getB())      

```

```kotlin
object Singleton {
    init {
        println("This ($this) is a singleton")
    }
    
    var b:String? = null
}

---------

var first = Singleton       
first.b = "hello singleton"

var second = Singleton
println(second.b)       

```

Result
```
This (Singobj@728938a9) is a singleton
hello singleton
```

## Properties
```kotlin
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = (height == width)
	set(value) 
            field = value
}

```

## Interface
Main.kt
```kotlin
fun main(args: Array<String>) {
        val z = Z("I am Z")
        val zToString = z.toString()
        println(zToString)
        val zFizz = z.fiz()
        println(zFizz)
        val zBuzz = z.buzz()
        println(zBuzz)  
}
```
X.kt
```kotlin
interface X{
    fun fiz() : String
}
```

A.kt
```kotlin
interface A{
  fun buzz() :String
}
```

Z.kt
```kotlin
open class Z(val arg:String) : A, X  {
   override fun toString() = "ToString() : $arg"
   override fun fiz() : String = "Z - fiz"
   override fun buzz() : String = "Z - buzz"
}
```

Result
```
ToString() : I am Z
Z - fiz
Z - buzz
```


## Herencia
Main.kt
```kotlin
fun main(args: Array<String>) {
        val b = B("I am B")
        val bToString = b.toString()
        println(bToString)
        val bFizz = b.fiz()
        println(bFizz)
        val bBuzz = b.buzz()
        println(bBuzz)
        
        val bValue = b.fizBuzz
        println("b.class.toString() $bValue")
            
        val c = C()
        val cToString = c.toString()
        println(cToString)
        val cFizz = c.fiz()
        println(cFizz)
        val cBuzz = c.buzz()
        println(cBuzz)
        val cValue = c.fizBuzz
        println("c.class.toString() $cValue")
        
        val h = H("I am H")
        val hToString = h.toString()
        println(cToString)
        val hFizz = h.fiz()
        println(hFizz)
        val hBuzz = h.buzz()
        println(hBuzz) 
}
```

X.kt
```kotlin
interface X{
    fun fiz() : String
}
```

A.kt
```kotlin
interface A{
  fun buzz() :String
}
```

Z.kt
```kotlin
open class Z(val arg:String) : A, X  {
   override fun toString() = "ToString() : $arg"
   override fun fiz() : String = "Z - fiz"
   override fun buzz() : String = "Z - buzz"
}
```

B.kt
```kotlin
class B(val name:String) :  Z("Z"), W {  
    override val fizBuzz : Int = 29
    override fun fiz() : String = "B - fiz"
    override fun buzz() : String = "B - buzz"
    override fun toString() : String  = "ToString() : ${this.name} and my parent is ${super.toString()}"  
}
```

C.kt
```kotlin
class C : Z("I am Z"), W {
    override val fizBuzz : Int = 92
    override fun fiz() : String =  "C - fiz" 
    override fun buzz() : String = "C - buzz"
}
```

H.kt
```kotlin
class H(val name:String):Z("I am Z") {
      override fun fiz() :String = super.fiz()
      override fun buzz() : String = super.buzz()
}
```

Result
```
ToString() : I am B and my parent is ToString() : Z
B - fiz
B - buzz
b.class.toString() 29
ToString() : I am Z
C - fiz
C - buzz
c.class.toString() 92
ToString() : I am Z
Z - fiz
Z - buzz
```

## [Extension Function Basics](https://youtu.be/SMzNduaGcuo)

Main.kt
```kotlin
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

## Infix Function

Main.kt
```kotlin
fun main(args: Array<String>) {
    val list = listOf(10, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)

    doubleResult(list)
    filter(list)
    map(list)
}
//infix without paren + brace
private fun map(list: List<Int>) = list.filter{ it % 2 == 0 }.map{ it - 1 }.forEach{ println(it) }

//infix without Dots & paren + brace
private fun filter(list: List<Int>) = list filter { it % 2 == 0 } forEach {  println(it) }

//infix with paren & brace
private fun doubleResult(list: List<Int>) = list.forEach({ println(it * 2) })

```

Result
```
20
-10
-8
-6
-4
-2
0
2
4
6
8
10

10
-4
-2
0
2
4

9
-5
-3
-1
1
3
```

Reference:
* Main : http://kotlin.es
* Facebook : https://www.facebook.com/kotlin.es
* Video tutorials: https://kotlinlang.org/docs/videos.html
* Manual: https://kotlinlang.org/docs/kotlin-docs.pdf
* @Author: Victor Bolinches Marin
