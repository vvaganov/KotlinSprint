package lesson9

fun main() {
    println("Введите 5 ингридиентов через \", \" ")
    val ingredients = readln()
    val ingredientsList = ingredients.split(", ")
    val ingredientsListSorted = ingredientsList.sorted()
    println(ingredientsListSorted)
}