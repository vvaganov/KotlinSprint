package lesson9

fun main() {
    println("Введите 5 ингридиентов через \", \" ")
    val ingredientsList = readln().split(",")
    val ingredientsListSort = ingredientsList.sorted()

    for (i in ingredientsListSort) {
        println(i.trimIndent())
    }
}