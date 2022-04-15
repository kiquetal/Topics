fun main() {
    // put your code here
    val characterA = readLine()!!.first()
    val characterB = readLine()!!.first()
    val characterC = readLine()!!.first()

    if (characterA + 1 == characterB && characterB + 1 == characterC) {
        print(true)
    } else {
        println(false)
    }
}
