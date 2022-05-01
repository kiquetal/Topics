const val ZERO = 0
fun intDivision(x: String, y: String): Int {
    return try {
        x.toInt() / y.toInt()
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
        ZERO
    } catch (e: NumberFormatException) {
        println("Read values are not integers.")
        ZERO
    }
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}
