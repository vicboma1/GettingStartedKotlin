/**
 * Created by vicboma on 26/10/15.
 */
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
