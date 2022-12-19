package OddOccurencyInArray
import java.util.HashMap
import java.util.Map

class OddOccurrencesInArray {
//    fun solution(A: IntArray): Int {
//        val hashSet= hashSetOf<Int>()
//        if (A.size in 1 .. 1000000) {
//            for (element in A) {
//                if (element in 1..1000000000) {
//                    if (hashSet.contains(element)) {
//                        hashSet.remove(element)
//                    } else {
//                        hashSet.add(element)
//                    }
//                }
//            }
//        }
//        return hashSet.iterator().next()
//    }


    fun solution2(A: IntArray): Int {
        // write your code in Kotlin 1.6.0 (Linux)

        var unpairdElement = 0
        A.forEach { unpairdElement =unpairdElement xor it }
        return unpairdElement
    }




}
fun main() {
    val oc = OddOccurrencesInArray()
    println(oc.solution2(intArrayOf(9, 3, 9, 3, 7,9)))
}


// Java program for the above approach


class GFG {
    // Function to find the count of
    // numbers that can be formed using
    // the given digits in the string

    companion object {
        // Driver Code
        @JvmStatic
        fun main(args: Array<String>) {
            val obj = GFG()
            val N = 56
            val M = "245769"
         //   println(obj(N, M))
        }
    }
}
