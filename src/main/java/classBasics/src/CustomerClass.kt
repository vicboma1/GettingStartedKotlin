/**
 * Created by vicboma on 27/10/15.
 */
public class CustomerClass(_id : Int) {

    val id = _id;
    //prototype
    var name : String? = ""

    fun doSomething() : String {
       return "Some code"
    }

    override fun toString() : String
    {
        return ""+this.id
    }
}