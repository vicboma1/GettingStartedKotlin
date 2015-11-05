package herencia.src

/**
 * Created by vicboma on 05/11/15.
 */
open class ZZ(val arg:String) : A, X  {
    override fun toString() = "ToString() : $arg"
    override fun fiz() : String = "ZZ - fiz"
    override fun buzz() : String = "ZZ - buzz"
}

