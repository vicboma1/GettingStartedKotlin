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


