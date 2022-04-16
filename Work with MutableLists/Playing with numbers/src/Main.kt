fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    // write your code here

    // do not touch the lines below
    val sum = numbers.fold(0) { acc, i -> acc + i }
    numbers.add(0, sum)
    numbers.removeAt(numbers.size - 2)
    println(numbers.joinToString(" "))
}
