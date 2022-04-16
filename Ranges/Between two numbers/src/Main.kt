fun main() {
    // write your code here
    val firstNumber = readLine()!!.toInt()
    val secondNumber = readLine()!!.toInt()
    val thirdNumber = readLine()!!.toInt()

    print(firstNumber in secondNumber..thirdNumber)
}
