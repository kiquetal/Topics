fun main() {
    // put your code he

    var sum = 0
    do {
        val number = readLine()!!.toInt()

        if (number !=0) {
          sum += number
        }
    }while (number != 0)
    print(sum)

}
