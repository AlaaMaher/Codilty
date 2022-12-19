package permMissingElem

import java.util.*
import kotlin.math.pow


class PermMissingElem {


    //50%
    fun solution(A: IntArray): Int {
        if (A.size in 1..100000) {
            Arrays.sort(A)
            val ret = A.size + 1
            for (i in A) {
                if (A[i] != i + 1) {
                    return i + 1
                }
            }

            return ret

        }
        return A.size + 1
    }

    fun solution2(A: IntArray): Int {
        val hashSet = hashSetOf<Int>()
        if (A.size in 1..100000) {
            for (i in A.indices) {
                hashSet.add(i)
            }
            for (i in 1 until A.size + 1) {
                if (hashSet.contains(i)) {
                    hashSet.remove(i)
                }
            }

            return hashSet.iterator().next()

        }
        return A.size + 1
    }

    ///no
    fun solution3(A: IntArray): Int {
        A.sortDescending()
        var missingElemFactor = A.size + 1
        var nFactorial = factorial(A.first())
        for (i in 1 until A.size) {
            missingElemFactor *= A[i]
        }
        return nFactorial / missingElemFactor
    }

    private fun factorial(num: Int): Int {
        return if (num >= 1) num * factorial(num - 1) else 1
    }

    fun solution4(A: IntArray): Int {
        var n = A.size + 1
        if (n in 0..100000) {
            var sum = n * (n + 1) / 2
            for (i in A.indices) {
                sum -= A[i]

            }
            return sum
        }
        return 1
    }

    //100%
    fun solution6(A: IntArray): Int {
        val hs = HashSet<Int>()
        for (i in A.indices)
            hs.add(A[i])
        for (i in 1..A.size + 1) {
            if (!hs.contains(i)) {
                return i
            }
        }
        return 1
    }






    fun maindsdsd(args: Array<String>) {
        var num = 8756404
        val times = IntArray(10)
        while (true) {
            if (num == 0) {
                break
            }
            val `val` = num % 10
            times[`val`]++
            num /= 10
        }
        for (i in 9 downTo 0) {
            for (j in 0 until times[i]) {
                print(i)
            }
        }
        println()
    }

    fun numbers(n: Int): Long {
        return 2.0.pow((n + 1).toDouble()).toLong() - 2
    }
}





fun main() {
    val permMissingElem = PermMissingElem()
    println(permMissingElem.solution4(intArrayOf(2,3,1,5)))
}