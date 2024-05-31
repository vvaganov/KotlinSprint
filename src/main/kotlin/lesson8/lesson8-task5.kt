fun main() {

    println("Введите планируемых количество ингридиентов")
    val arraySize = readln().toInt()
    val arrayIngredients = Array(arraySize) { "0" }
    var ingredient: String

    for (i in arrayIngredients.indices) {
        println("Добавьте ингридиент:")
        ingredient = readln()
        arrayIngredients[i] = ingredient
    }
    println("Ваш список ингридиентов: \n${arrayIngredients.joinToString(", ")}")
}






