fun main() {
    // put your code here

    val n = readLine()!!.toInt()
    var m = 0
    var jump = false

    myloop@ for (i in 1..n) {
        run loop@{
            repeat(i) {
                if (n > m && !jump) {
                    print("$i ")
                    m += 1
                } else {
                    jump = true
                    return@loop
                }
            }
        }
        if (jump) break@myloop
    }
}
