fun main() {
    // write your code here
    val firstNumber = readln()!!.toInt()
    val secondNumber = readln()!!.toInt()
    val thirdNumber = readln()!!.toInt()
    val fourthNumber = readln()!!.toInt()
    val fifthNumber = readln()!!.toInt()

    val range1 = firstNumber..secondNumber
    val range2 = thirdNumber..fourthNumber

    print(fifthNumber in range1 && fifthNumber in range2)
}
