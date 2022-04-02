
fun main() {
    val word = readln()
    println("${word.length} repetitions of the word $word: ${word.repeat(word.length)}")
    val n = 3/4
    println(n)
    val seven = 7.0
    val five = 5

    val toShort = seven.toShort()            // line 4
    val sum = seven + five                   // line 5
    val difference = seven - five.toDouble() // line 6
    val toByte = seven.toByte()              // line 7
    val mul = seven * five                   // line 8
    val b0: Byte = 2
    val s0: Short = 10
    val n0: Int = 5
    val l0: Long = 14
    val f0: Float = 11.4f

    val b: Byte = 5                 //1
    val s: Short = 2 + b0           //2
    val n: Int = s0.toByte() + 2    //3
    val l: Long = n0 + 4            //4
    val f: Float = l0.toFloat() + 1 //5
    val d: Double = f0 / 1          //6
}
