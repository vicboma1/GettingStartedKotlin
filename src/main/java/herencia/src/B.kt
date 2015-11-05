package herencia.src

/**
 * Created by vicboma on 05/11/15.
 */
class B(val name:String) :  Z("Z"), W {
    override val fizBuzz : Int = 29
    override fun fiz() : String = "B - fiz"
    override fun buzz() : String = "B - buzz"
    override fun toString() : String  = "ToString() : ${this.name} and my parent is ${super.toString()}"
}