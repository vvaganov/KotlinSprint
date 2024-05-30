fun main() {

    val listOfIngredients = arrayOf("Морковь", "Лук", "Свекла", "Картофель", "Томат", "Сахар", "Соль", "Перец")
    println("Список ингридиентов:")
    for (i in listOfIngredients) {
        println(i)
    }
    println("Какой ингридиент Вы хотели бы заменить?")
    val theVariableIngredient = readln()
    val ingredientOut = listOfIngredients.contains(theVariableIngredient)
    val ingredientOutIndex = listOfIngredients.indexOf(theVariableIngredient)

    if (!ingredientOut) {
        println("Такого ингридиента нет в списке")
    } else {
        println("Введите элемент который нужно добавить:")
    }
    val ingredientIn = readln()
    listOfIngredients[ingredientOutIndex] = ingredientIn

    println("Готово! Вы сохранили следующий список: ")
    for (i in listOfIngredients) {
        println(i)
    }
}