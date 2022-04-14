
fun main() {
    val a = readLine()!!.toInt()
    val min = 1
    val max = 9
    if (a in min..max) {
        println(true)
    } else println(false)
}
