package tapeEquilibrium

import java.util.Arrays
import kotlin.math.abs

class TapeEquilibrium {
    fun solution(A: IntArray): Int {
        var sumP1 = 0
        var sumP2 = 0
        var minAbsSum = 0

        for (i in A.indices) {
            for (j in i + 1 until A.size - 1) {
                sumP1 = Integer.sum(i, j)
                sumP2 = Integer.sum(j, j)
            }
            var absSum = intArrayOf(abs(sumP1 - sumP2))
            Arrays.sort(absSum)
            minAbsSum = absSum.last()
        }
        return minAbsSum
    }

    fun solution2(A: IntArray): Int {
        var sumP1 = A[0]
        var sumP2 = 0
        var minAbsSum = 0

        for (i in 0 until A.size-1) {
                sumP1+= i
                sumP2 += i+i

            var absSum = intArrayOf(abs(sumP1 - sumP2))
            Arrays.sort(absSum)
            minAbsSum = absSum.last()
        }
        return minAbsSum
    }
}


fun main() {
    val te = TapeEquilibrium()
    println(te.solution2(intArrayOf(3, 1, 2, 4, 3)))
}