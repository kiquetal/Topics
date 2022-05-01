fun main() {
    // put your code here
    try {

        val dividend = readLine()!!.toInt()
        val divisor = readLine()!!.toInt()
        println(dividend/divisor)
    }

    catch (e: ArithmeticException)
    {
        println("Division by zero, please fix the second argument!")
    }
}
