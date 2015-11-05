import herencia.src.B
import herencia.src.C
import herencia.src.H
import herencia.src.Z

/**
 * Created by vicboma on 26/10/15.
 */
fun main(args: Array<String>) {

    val z = Z("I am Z")
    val zToString = z.toString()
    println(zToString)
    val zFizz = z.fiz()
    println(zFizz)
    val zBuzz = z.buzz()
    println(zBuzz)


    val b = B("I am B")
    val bToString = b.toString()
    println(bToString)
    val bFizz = b.fiz()
    println(bFizz)
    val bBuzz = b.buzz()
    println(bBuzz)

    val bValue = b.fizBuzz
    println("b.class.toString() $bValue")

    val c = C()
    val cToString = c.toString()
    println(cToString)
    val cFizz = c.fiz()
    println(cFizz)
    val cBuzz = c.buzz()
    println(cBuzz)
    val cValue = c.fizBuzz
    println("c.class.toString() $cValue")

    val h = H("I am H")
    val hToString = h.toString()
    println(hToString)
    val hFizz = h.fiz()
    println(hFizz)
    val hBuzz = h.buzz()
    println(hBuzz)
}