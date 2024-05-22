package lesson5

fun main() {
    println("Для авторизации, решите математическую задачку: 2 + 2 = ")
    val answer = readln()

    when (answer) {
        "4" -> println("Добро пожаловать!")
        else -> println("Доступ запрещен")
    }

}