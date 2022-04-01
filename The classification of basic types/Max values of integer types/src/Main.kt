fun main(args: Array<String>) {
    // put your code here
    var listValues = arrayListOf(Int.MAX_VALUE,Long.MAX_VALUE,
    Short.MAX_VALUE,Byte.MAX_VALUE);

    listValues.sortBy { it.toLong() }
    listValues.forEach(::println)


}
