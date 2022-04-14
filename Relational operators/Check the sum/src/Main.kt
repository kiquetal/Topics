const val DIVIDE_BY_NUMER = 20
fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val result = when {
        (a + b) % DIVIDE_BY_NUMER == 0 -> true
        (b + c) % DIVIDE_BY_NUMER == 0 -> true
        (a + c) % DIVIDE_BY_NUMER == 0 -> true
        else -> false
    }
    print(result)
}
