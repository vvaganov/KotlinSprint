package lesson19

const val NUMBER_PERSON = 5

fun main() {
    val humanList: MutableList<Human> = mutableListOf<Human>()

    println(
        """
        Введите имя в формате "Имя"
        Имя вводить без ковычек!
        Выберете пол из вариантов:
        """.trimIndent()
    )
    Gender.entries.forEach { println("- ${it.textName}") }

    for (i in 1..NUMBER_PERSON) {

        humanList.add(getHuman())
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

fun getHuman(): Human {
    println("Введите имя:")
    val inputName = readln()
    println("Введите пол:")
    val inputGender = readln()
    var gender: Gender? = null
    when (inputGender) {
        Gender.MEN.textName -> gender = Gender.MEN
        Gender.WOMEN.textName -> gender = Gender.WOMEN
    }
    return Human(inputName, gender)
}