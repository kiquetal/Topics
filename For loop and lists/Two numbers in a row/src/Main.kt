fun main() {
    // write your code here

    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        val num = readLine()!!.toInt()
        list += num
    }
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    list.zipWithNext()
        .none {
            it.first == numbers[0] && it.second == numbers[1] || it.second == numbers[0] && it.first == numbers[1]
        }?.let { if (it) println("YES") else println("NO") }
}
