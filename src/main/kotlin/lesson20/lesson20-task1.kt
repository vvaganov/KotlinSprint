package lesson20

fun main() {

    val userName = "Гена"
    congratulate(userName)
}

val congratulate: (String) -> Unit = { println("С наступающим Новым Годом, $it!") }