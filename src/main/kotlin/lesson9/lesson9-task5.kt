package lesson9

fun main() {
    val listSize = 5
    val setIngredients: MutableSet<String> = mutableSetOf()
    var ingredient: String

    for (i in 1 ..listSize){
        println("Введите ингридиент:")
        ingredient = readln()
        setIngredients.add(ingredient)}

    val listSort = setIngredients.sorted().joinToString(", ")
    println(listSort)
}
