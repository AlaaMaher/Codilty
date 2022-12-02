package CyclicRotation

import java.util.*

class CyclicRotation {


    fun solution(A: IntArray, K: Int): IntArray {
        if (A.isNotEmpty()) {
            if (K in 0..100) {
                for (i in 0 until K) {
                    var lastElement = A[A.size - 1]
                    for (j in A.size - 2 downTo 0) {
                        if (A[j] in -1000..1000) {
                            A[j + 1] = A[j]
                        }
                    }
                    A[0] = lastElement
                }
                return A
            }
        }
     return A
    }
}

fun main() {
    val cr = CyclicRotation()
    println(cr.solution(intArrayOf(3, 8, 9, 7, 6), 3).contentToString())
}