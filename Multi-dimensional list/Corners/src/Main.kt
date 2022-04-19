fun main() {
    // Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    // write your code here
    println("${inputList[0].first()} ${inputList[0].last()}")
    println("${inputList.last().first()} ${inputList.last().last()}")


}
