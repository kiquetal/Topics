const val GRADE_A = 5
const val GRADE_B = 4
const val GRADE_C = 3
const val GRADE_D = 2
fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var countA = 0
    var countB = 0
    var countC = 0
    var countD = 0

    repeat(n) {
        when (readLine()!!.toInt()) {
            GRADE_A -> countA++
            GRADE_B -> countB++
            GRADE_C -> countC++
            GRADE_D -> countD++
        }
    }
    print("$countD $countC $countB $countA")
}
