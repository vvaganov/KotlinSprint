package lesson9

const val APPROVAL = "Да"

fun main() {
    val listIngredients = mutableListOf("Свекла", "Морковь", "Лук")

    println("В рецепте есть базовые ингредиенты:")
    listIngredients.forEach { println(it) }

    println("Желаете добавить еще?")
    val approval = readln()

    if (approval != APPROVAL) {
        println("Завершение программы.")
    } else {
        println("Какой ингридиент Вы хотите добавить?")
        val ingredientsIn = readln()
        listIngredients.add(ingredientsIn)
        println("Теперь в рецепте есть следующие ингредиенты:")
        listIngredients.forEach { println(it) }
    }
}