package lesson6

import kotlin.random.Random

const val STOP = 0

fun main() {

    var numberOfAttempts = 3
    println("Что бы доказать что Вы не бот решите следующую задачку:")

    while (numberOfAttempts > STOP) {
        val random1 = Random.nextInt(1, 9)
        val random2 = Random.nextInt(1, 9)
        val random = random1 + random2
        println("$random1 + $random2 = ")
        numberOfAttempts--
        val testIn = readln().toInt()
        if (testIn != random && numberOfAttempts == STOP) {
            println("У Вас кончились попытки")
            continue
        } else if (testIn != random) {
            println("Не праильно, поробуйте еще раз")
        } else {
            println("Ответ верный! Добро пожаловать.")
            return
        }
    }
    println("Доступ запрещен!")
}

