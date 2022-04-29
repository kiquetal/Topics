import kotlin.math.abs

// write your code here

/* Do not change code below */
const val TEN = 10
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}

fun getLastDigit(a: Int): Int {

    val a = abs(a)

    return a % TEN

}
