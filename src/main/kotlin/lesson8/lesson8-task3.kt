fun main() {

    val listOfProducts = arrayOf("Морковь", "Лук", "Свекла", "Картофель", "Томат", "Сахар", "Соль", "Перец")
    println("Введите название ингридиента")
    val ingredient = readln()

    if (listOfProducts.contains(ingredient)) {
        println("Ингридиент $ingredient в списке есть!")
    } else {
        println("Такого ингридиета в списке нет!")
    }
}