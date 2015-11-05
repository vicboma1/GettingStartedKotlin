package herencia.src

/**
 * Created by vicboma on 05/11/15.
 */
open class Z(val arg:String) : A, X  {
    override fun toString() = "ToString() : $arg"
    override fun fiz() : String = "Z - fiz"
    override fun buzz() : String = "Z - buzz"
}

