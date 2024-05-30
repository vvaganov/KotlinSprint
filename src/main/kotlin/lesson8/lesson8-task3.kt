fun main() {

    val listOfProducts = arrayOf("Морковь", "Лук", "Свекла", "Картофель", "Томат", "Сахар", "Соль", "Перец")
    println("Введите название ингридиента")
    val getIngredient = readln()
    val ingredients = listOfProducts.contains(getIngredient)

    if (ingredients) {
        println("Ингридиент $getIngredient в списке есть!")
    } else {
        println("Такого ингридиета в списке нет!")
    }
}