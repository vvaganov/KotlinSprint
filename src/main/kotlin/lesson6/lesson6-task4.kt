package lesson6

const val STOP_GAME = 0

fun main() {
    val number = 6
    var attempts = 5

    println("Угадай число от 1 до 9 за $attempts попыток")

    while (attempts > STOP_GAME) {
        val numberIn = readln().toInt()
        attempts--
        if (number != numberIn)
            println("Чуть чуть не угадал, осталось $attempts попыток")
        else {
            println("Это была великолепная игра!")
            return
        }
    }
    println("У Вас кончились попытки, было загадано число $number")

}



