package lesson7

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var verificationCode: Int
    var randomCode: Int

    do {
        randomCode = Random.nextInt(1000..9999)
        println("Ваш код авторизации: $randomCode")
        println("Введите код:")
        verificationCode = readln().toInt()
    } while (randomCode != verificationCode)
    println("Добро пожаловать!")
}