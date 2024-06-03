package lesson9

fun main() {
    var listSize = 3
    val listIngredients = mutableListOf<String>()
    var ingredient: String

    do {
        println("Введите ингридиент:")
        ingredient = readln()
        if (listIngredients.contains(ingredient)) {
            continue
        } else if (listIngredients.isEmpty()) {
            listIngredients.add(ingredient)
            listSize--
        } else {
            listIngredients.add(ingredient)
            listSize--
        }
    } while (listSize > 0)

    val listSort = listIngredients.sorted().toMutableList()
    listSort[0] = listSort[0].uppercase()
    val stringListIngredients = listSort.joinToString()

    println(stringListIngredients)
}
