package lesson9

fun main() {
    val listIngredients = mutableListOf("Свекла", "Морковь", "Лук")

    println("В рецепте есть базовые ингредиенты:")
    listIngredients.forEach { println(it) }

    println("Желаете добавить еще?")
    val approval = readln()

    if (approval.equals("Да", ignoreCase = true)) {
        println("Какой ингридиент Вы хотите добавить?")
        val ingredientsIn = readln()
        listIngredients.add(ingredientsIn)
        println("Теперь в рецепте есть следующие ингредиенты:")
        listIngredients.forEach { println(it) }

    } else {
        println("Завершение программы.")

    }
}