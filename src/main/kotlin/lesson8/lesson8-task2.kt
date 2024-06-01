fun main() {

    val listOfProducts = arrayOf("Морковь", "Лук", "Свекла", "Картофель", "Томат", "Сахар", "Соль", "Перец")
    println("Введите название ингридиента")
    val ingredient = readln()

    for (i in listOfProducts) {
        if (i == ingredient) {
            println("Ингридиент $ingredient в рецепте есть.")
            return
        }
    }
    println("Ингридиента $ingredient в рецепте нет.")
}