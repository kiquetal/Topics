fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var sum = 0

    for (i in a..b) {
        sum += i
    }
    print(sum)
}
