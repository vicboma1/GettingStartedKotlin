/**
 * Created by vicboma on 27/10/15.
 */
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