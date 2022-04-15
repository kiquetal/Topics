fun main() {
    // put your code here
    val N = readLine()!!.toInt()

    for (i in 1..N) {
        if (i*i <= N) {
            println(i*i)
        }
    }
}
