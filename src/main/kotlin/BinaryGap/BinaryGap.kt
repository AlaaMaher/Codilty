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

    fun solve(A: String,P: String): Int {
        var started = false
        var dislikeA = 0
        var dislikeP = 0

        var likeA = 0
        var likeP = 0

        var AllCount = 0
        for (i in A.indices) {
            var c = A.substring(i, i + 1)
            if (c =="1"){
                likeA++
            }
            else{
                dislikeA++
            }
        }
        for (j in P.indices) {
            var c2 = A.substring(j, j + 1)
            if (c2 =="1")
            likeP++
            else dislikeP++
        }

        AllCount= (likeA+likeP) xor (dislikeA+dislikeP)

        // println(binaryString)
        return AllCount
    }

}

fun main() {
    val bg = BinaryGap()
    println(bg.solve("010101","101101"))
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