import kotlin.random.Random

fun main() {
    val randomValues = List(3) { Random.nextInt(0, 42) }

    println("Введите первое число от 0 до 42")
    val numberOne = readln().toInt()
    println("Введите второе число от 0 до 42")
    val numberTwo = readln().toInt()
    println("Введите третье число от 0 до 42")
    val numberThree = readln().toInt()

    val numberList = listOf(numberOne, numberTwo, numberThree)
    val numberListSize = numberList.intersect(randomValues.toSet()).size

    when (numberListSize) {
        3 -> println("Вы угадали и выиграли Джекпот")
        2 -> println("Вы угадали 2 числа и выиграли крупный приз")
        1 -> println("Вы угадали 1 число и вам достается утешительный приз")
        else -> println("Вы не угадали ни одного числа")

    }
    println("Выигрышние числа: ${randomValues.joinToString()}")
}