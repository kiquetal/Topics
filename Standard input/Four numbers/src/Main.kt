import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val datas = scanner.nextLine();
    val ar = datas.split("\\s+".toRegex())
    ar.forEach(::println)
}
