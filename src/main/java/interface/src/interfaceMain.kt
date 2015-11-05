import herencia.src.ZZ

/**
 * Created by vicboma on 26/10/15.
 */
fun main(args: Array<String>) {
    val z = ZZ("I am Z")
    val zToString = z.toString()
    println(zToString)
    val zFizz = z.fiz()
    println(zFizz)
    val zBuzz = z.buzz()
    println(zBuzz)
}