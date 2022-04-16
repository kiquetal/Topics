const val MIN_AGE = 18
const val MAX_AGE = 59
fun main() {
    // write your code here
    val age = readLine()!!.toInt()

    print(age in MIN_AGE..MAX_AGE)
}
