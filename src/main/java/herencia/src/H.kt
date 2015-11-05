package herencia.src

/**
 * Created by vicboma on 05/11/15.
 */
class H(val name:String):Z("I am Z") {
    override fun fiz() :String = super.fiz()
    override fun buzz() : String = super.buzz()
}

