package lesson9

fun main() {
    println("Введите 5 ингридиентов через \", \" ")
    val ingredients = readln().split(", ").sorted()
    println(ingredients)
}