package lesson5

fun main() {
    val theCorrectNumberOne = 12
    val theCorrectNumberTwo = 31

    println("Введите первое число от 0 до 42")
    val theFirstNumberEntered = readln().toInt()
    println("Введите второе число от 0 до 42")
    val theSecondNumberEntered = readln().toInt()

    val result = if ((theFirstNumberEntered == theCorrectNumberOne || theFirstNumberEntered == theCorrectNumberTwo)
        && (theSecondNumberEntered == theCorrectNumberOne || theSecondNumberEntered == theCorrectNumberTwo)
    )
        "Поздравляем! Вы выиграли главный приз!"
    else if ((theFirstNumberEntered == theCorrectNumberOne || theFirstNumberEntered == theCorrectNumberTwo)
        || (theSecondNumberEntered == theCorrectNumberOne || theSecondNumberEntered == theCorrectNumberTwo)
    ) "Вы выиграли утешительный приз!"
    else "Неудача!"

    println(result)
}
