fun main() {
    val numbers = MutableList(100) {0}
    // do not touch the lines below
    numbers[0] = 1
    numbers[9] = 10
    numbers[99] = 100
    println(numbers.joinToString())
}
