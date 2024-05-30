fun main() {

    val listOfProducts = arrayOf("Морковь", "Лук", "Свекла", "Картофель", "Томат", "Сахар", "Соль", "Перец")
    println("Введите название ингридиента")
    val getIngredient = readln()
    var theElementIsPresent = false

    for (i in listOfProducts.indices) {
        if (listOfProducts[i] == getIngredient) {
            theElementIsPresent = true
            break
        }
    }

    if (theElementIsPresent) {
        println("Ингридиент $getIngredient присутствует")
    } else {
        println("Такого ингридиента нет в списке")
    }
}