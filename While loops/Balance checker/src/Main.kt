fun main() {
    // write your code here
    var balance = readLine()!!.toInt()
    val purchases = readLine()!!.split(" ").map { it.toInt() }

    var neededAmount = 0
    for (purchase in purchases) {
        if (balance >= purchase) {
            balance -= purchase
        } else {
            neededAmount += purchase
        }
    }
    if (neededAmount > 0) {
        print("Error, insufficient funds for the purchase. Your balance is $balance, but you need $neededAmount.")
    } else {
        print("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}
