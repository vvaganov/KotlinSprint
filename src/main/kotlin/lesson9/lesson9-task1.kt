package lesson9

fun main() {
    val listOfIngredients = listOf("Морковь", "Лук", "Свекла", "Картофель", "Томат", "Сахар", "Соль", "Перец")

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach {
        println(it)
    }
}