package classBasics.src

/**
 * Created by vicboma on 28/10/15.
 */
class Math {

    fun max(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun min(a: Int, b: Int): Int {
        if (a > b) {
            return b
        } else {
            return a
        }
    }

    fun maxIn(a: Int, b: Int): Int = if(a > b) a else b

    fun minIn(a: Int, b: Int): Int = if (a > b) b else a

    //val max : (Int, Int) -> Int = { x , y -> if (x > y) x else y }
    //val min : (Int, Int) -> Int = { x , y -> if (x > y) y else x }

    fun inFunction(x : Int, y : Int, f:(Int, Int) -> Int) : Int {
        return f(x,y)
    }
}