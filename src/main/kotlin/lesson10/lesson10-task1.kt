package lesson10

import kotlin.random.Random

fun main() {
    val thePlayerMove = getRandomNumber()
    println("Ход игрока: выпало число $thePlayerMove")
    val computerMove = getRandomNumber()
    println("Ход компьютера: выпало число $computerMove")

    if (thePlayerMove > computerMove) {
        println("Человчество победило!")
    } else if (thePlayerMove < computerMove) {
        println("Победила машина")
    } else {
        println("Ничья")
    }
}

fun getRandomNumber(): Int {
    return Random.nextInt(1, 6)
}