package FrogJump

import kotlin.math.ceil


class FrogJump {
    fun solution(X: Int, Y:Int, D:Int): Int {
        var distance=Y-X
        var minimalNoJump= ceil(distance/D.toDouble())
        return minimalNoJump.toInt()
    }

    fun frogJump(X: Int, Y: Int, D: Int): Int {
        // write your code in Kotlin 1.3.11 (Linux)
        return ((Y-X)+D-1)/D
    }
}
fun main() {
    val fg = FrogJump()
    println(fg.solution(10,85,30).toString())
}