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

