// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
fun isVowel(letter: Char): Boolean {

    val vowelLower = arrayOf('a', 'e', 'i', 'o', 'u')
    val vowelUpper = arrayOf('A', 'E', 'I', 'O', 'U')
    if (letter in vowelLower || letter in vowelUpper) {
        return true
    }
    return false
}
