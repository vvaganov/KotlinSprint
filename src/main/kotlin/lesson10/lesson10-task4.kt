package lesson10

import kotlin.random.Random

fun main() {
    var theGame = false
    var theAmountOfThrows = 0

    while (!theGame) {
        val thePlayerMove = rollTheDice()
        toHoldADrawing("Игрок", thePlayerMove)
        val computerMove = rollTheDice()
        toHoldADrawing("Компьютер", computerMove)

        if (thePlayerMove > computerMove) {
            theAmountOfThrows++
        }
        println("Хотите сыграть еще раз: Да, Нет?")
        val answer = readln()

        if (answer.equals("Да", ignoreCase = true)) {
            continue
        } else {
            theGame = true
            println("Игра окончена. Вы выиграли $theAmountOfThrows раз")
        }
    }
}

fun toHoldADrawing(name: String, number: Int) {
    println("Ходит $name: выпало число $number")

}

fun rollTheDice(): Int {
    return Random.nextInt(1, 6)
}