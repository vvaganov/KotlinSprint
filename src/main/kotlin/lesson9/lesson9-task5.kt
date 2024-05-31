package lesson9

fun main() {
    var listSize = 5
    val listIngredients = mutableListOf<String>()
    var ingredient: String

    while (listSize > 0) {
        println("Введите ингридиент:")
        ingredient = readln()
        for (i in listIngredients)
            if (i == ingredient) {
                listSize++
            }
        listIngredients.add(ingredient)
        listSize--
    }

    val listSort = listIngredients.distinct().sorted().toMutableList()
    val upperFirstElement = listSort[0].uppercase()
    listSort[0] = upperFirstElement
    val stringListIngredients = listSort.joinToString()

    println(stringListIngredients)
}





