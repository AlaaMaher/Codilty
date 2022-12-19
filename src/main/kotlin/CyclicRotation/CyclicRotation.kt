package CyclicRotation

import kotlin.math.floor
import kotlin.math.ln

class CyclicRotation {

    fun solutionJ (A:String, P:String):Int{
        var A1 = A.toInt(2)
        var P1 = P.toInt(2)

        var noLikeAndDislike=0
        while (A1 !=0 || P1 != 0){
            //check if they both same
            if (A1%2 == P1%2){
                noLikeAndDislike +=1
                A1.toInt().shr(1)
                P.toInt()shr(1)
            }
        }
        return noLikeAndDislike

    }


    fun countUnmatchedBits(A: String, B: String): Int {
        //calculate XOR
        var counter=0
        var A1 = A.toInt(2)
        var P1 = B.toInt(2)
        var XOR = A1 xor P1
        val binaryString = Integer.toBinaryString(XOR)
        for (i in binaryString){
            if (i =='0'){
                counter++
            }
        //count total number of bits using log2(XOR) + 1

        }
        //the number of unset bits is equal to
        //the difference between total bits
        //and the set bits count
        return counter
    }


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

    fun solution2(A: IntArray, K: Int): IntArray {
        if (A.isNotEmpty()) {
            if (K in 0..100) {
                for (i in 0 until K) {
                    var lastElement = A[A.size - 1]
                    for (j in A.size - 2 downTo 0) {
                        A[j].shr(1)
//                        if (A[j] in -1000..1000) {
//                            A[j + 1] = A[j]
//                        }
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
    println(cr.countUnmatchedBits("010101","101101"))
}