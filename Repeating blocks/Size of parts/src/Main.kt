const val PERFECT = 0
const val SMALLER = -1
const val LARGER = 1
fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var countPerfect = 0
    var countSmaller = 0
    var countLarger = 0
    repeat(n) {
        when (readLine()!!.toInt()) {
            PERFECT -> countPerfect++
            SMALLER -> countSmaller++
            LARGER -> countLarger++
        }
    }
    println("$countPerfect $countLarger $countSmaller")
}
