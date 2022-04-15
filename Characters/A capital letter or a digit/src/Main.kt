const val NUMBER_ONE_UNICODE = 49
const val NUMBER_NINE_UNICODE = 57

fun main() {
    // write your code here

    val character: Char = readLine()!!.first()

    if (character in 'A'..'Z' || character.code in NUMBER_ONE_UNICODE..NUMBER_NINE_UNICODE) {
        print(true)
    } else {
        print(false)
    }
}
