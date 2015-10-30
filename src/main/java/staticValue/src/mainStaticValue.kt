import staticValue.src.State

/**
 * Created by vicboma on 27/10/15.
 */
fun main(args: Array<String>) {
    start()
    stop()
}

fun start() = println("State static: ${State.START}")
fun stop()  = println("State static: ${State.STOP}")

