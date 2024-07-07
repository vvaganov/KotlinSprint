package lesson19

const val NUMBER_PERSON = 1

fun main() {
    val humanList: MutableList<Human> = mutableListOf<Human>()

    for (i in 1..NUMBER_PERSON) {
        println("Введите имя:")
        val inputName = readln()
        humanList.add(Human(inputName, getGender()))
    }

    humanList.forEach { println("Имя ${it.name} -  пол: ${(it.gender.textName)}") }

}

class Human(
    val name: String,
    val gender: Gender,
)

enum class Gender(val textName: String) {
    MEN("Мужской"),
    WOMEN("Женский");
}

fun getName() {
    val name: String

}

fun getGender(): Gender {
    val gender: Gender
    println("Введите пол:")
    while (true) {
        Gender.entries.forEach { println("- ${it.textName}") }
        val inputGender = readln()
        when (inputGender) {
            Gender.WOMEN.textName -> {
                gender = Gender.WOMEN
                break
            }

            Gender.MEN.textName -> {
                gender = Gender.MEN
                break
            }

            else -> println("Введите корректный пол:")
        }
    }
    return gender
}