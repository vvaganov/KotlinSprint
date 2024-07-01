package lesson19

const val NUMBER_PERSON = 2

fun main() {
    val humanList: MutableList<Human> = mutableListOf<Human>()

    println(
        """
        Введите имя в формате "Имя"
        Имя вводить без ковычек!
        Выберете пол из вариантов:
        """.trimIndent()
    )
    Gender.entries.forEach{ println("- ${it.textName}") }

    for (i in 1..NUMBER_PERSON) {
        println("Введите имя:")
        val name = readln()
        println("Введите пол:")
        val gender = readln()
        humanList.add(Human(name, getGender(gender)))
    }

    humanList.forEach { println("Имя ${it.name} -  пол: ${(it.gender?.textName) ?: "не указан"}") }

}

class Human(
    val name: String,
    val gender: Gender?,
)

enum class Gender(val textName: String) {
    MEN("Мужской"),
    WOMEN("Женский");
}

fun getGender(textName: String): Gender? {
    return when (textName) {
        Gender.MEN.textName -> Gender.MEN
        Gender.WOMEN.textName -> Gender.WOMEN
        else -> null
    }
}




