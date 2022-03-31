fun main() {
    // only println are needed here...
    println("fun main() {")
    println("    val one = 1")
    println("    val two = 2")
    println("    println() // empty println")
    println("}")

    var a = 5
    val b = 9
    val c = 11
    var d = 1
    var n = b%(c - 3)
    println(n)
    d *= ++a + b%(c - 3) // order of execution in this line
    println(d)
}
