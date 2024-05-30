package lesson6

import kotlin.random.Random

fun main() {

    var numberOfAttempts = 3
    val minAttempts = 0

    println("Что бы доказать что Вы не бот решите следующую задачку:")

    while (numberOfAttempts > minAttempts) {
        val random1 = Random.nextInt(1, 9)
        val random2 = Random.nextInt(1, 9)
        val amount = random1 + random2
        println("$random1 + $random2 = ")
        numberOfAttempts--
        val result = readln().toInt()
        if (result != amount) {
            println("Не праильно!")
        } else {
            println("Ответ верный! Добро пожаловать.")
            return
        }
    }
    println("У Вас кончились попытки, доступ запрещен")
}

