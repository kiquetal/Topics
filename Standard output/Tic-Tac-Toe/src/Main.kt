fun main() {

    val firstRow = arrayOf("O", "X", "X")
    val secondRow = arrayOf("O", "X", "O")
    val thirdRow = arrayOf("X", "O", "X")

    println(firstRow.toList().joinTo(StringBuilder(), " "))
    println(secondRow.toList().joinTo(StringBuilder(), " "))
    println(thirdRow.toList().joinTo(StringBuilder(), " "))
}
