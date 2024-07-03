package lesson20

fun main() {

    val listPhrases = listOf(
        "Робот друг человека",
        "Будующее за роботами",
        "Роботы не плачут",
        "Быть роботом хорошо",
        "Душа машины сильнее стали"
    )
    val robot = Robot()
    robot.phrase = listPhrases.random()
    robot.say()
    robot.setModifier(robot.phrase)
    robot.say()
}

class Robot{

    var phrase: String = ""

    fun say() {
        println(phrase)
    }

    fun setModifier(string: String) {
        phrase = modifier(string)
    }
}

val modifier: (string: String) -> String = { string: String -> string.reversed() }