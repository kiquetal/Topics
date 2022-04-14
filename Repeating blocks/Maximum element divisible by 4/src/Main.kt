const val NUMBER = 4
fun main() {
    // put your code here

    val n = readLine()!!.toInt()
    var maxSequence = 0
    repeat(n) {
        val num = readLine()!!.toInt()
        when {
            isDivisibleBy(num) -> if (num > maxSequence) num else maxSequence
            else -> maxSequence
        }.also { maxSequence = it }

    }
    print(maxSequence)
}

fun isDivisibleBy(number: Int): Boolean {
    return number % NUMBER == 0
}

