package lesson5

fun main() {
    val number1 = 2
    val number2 = 2
    val sum = number1 + number2
    println("Для авторизации, решите математическую задачку: $number1 + $number2 = ")
    val answer = readln().toInt()

    when (answer) {
        sum -> println("Добро пожаловать!")
        else -> println("Доступ запрещен")
    }

}