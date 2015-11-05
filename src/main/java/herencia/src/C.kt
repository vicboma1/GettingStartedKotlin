package herencia.src

/**
 * Created by vicboma on 05/11/15.
 */
class C : Z("I am Z"), W {
    override val fizBuzz : Int = 92
    override fun fiz() : String =  "C - fiz"
    override fun buzz() : String = "C - buzz"
}