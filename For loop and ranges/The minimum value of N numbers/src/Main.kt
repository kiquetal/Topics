 var MINIMUM = Int.MAX_VALUE

fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    for (i in n downTo 1) {
        val c = readLine()!!.toInt()
        if (c < MINIMUM) {
            MINIMUM = c
        }
    }
    print(MINIMUM)
}
