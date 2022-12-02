package BinaryGap


class BinaryGap {

    fun test(N: Int): Int {
        val binaryString = Integer.toBinaryString(N)
        var started = false
        var counter = 0
        var maxCounter = 0
        for (i in binaryString.indices) {
            var c = binaryString.substring(i, i + 1)
            println(c)
            if (c == "1") {
                if (started) {
                    if (counter > maxCounter) {
                        maxCounter = counter
                    }
                }
                counter = 0
                started = true

            }
            if (c == "0") {
                counter++
            }
        }
        // println(binaryString)
        return maxCounter
    }

}

fun main() {
    val bg = BinaryGap()
    println(bg.test(529))
}

fun solution(N: Int): Int {
    if (N in 1..2147483647) {
        val binaryString = Integer.toBinaryString(N)
        var started = false
        var counter = 0
        var maxCounter = 0
        for (i in binaryString.indices) {
            var c = binaryString.substring(i, i + 1)
            if (c == "1") {
                if (started) {
                    if (counter > maxCounter) {
                        maxCounter = counter
                    }
                }
                counter = 0
                started = true

            }
            if (c == "0") {
                counter++
            }
        }
        return maxCounter
    }
    return 0
}