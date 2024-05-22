package lesson5

const val AGE_OF_MAJORITY = 18
fun main() {
    val currentYear = 2024

    println("Введите год своего рождения:")
    val yearOfBirth = readln().toInt()
    val age = currentYear - yearOfBirth

    if (age >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
    if (age < AGE_OF_MAJORITY) {
        println("Вернутся на главный экран")
    }

}