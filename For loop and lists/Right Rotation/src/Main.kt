fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        val num = readLine()!!.toInt()
        list += num
    }
    val rotate = readLine()!!.toInt()
    val temList = MutableList(n) { 0 }

    for (i in 0 until list.size) {
        temList[(i + rotate) % n] = list[i]
    }
    print(temList.joinToString(" "))

}
