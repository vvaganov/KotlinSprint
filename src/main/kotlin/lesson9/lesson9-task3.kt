package lesson9

fun main() {
    val oneServing = mapOf("яиц" to 2, "молока" to 50, "масла" to 15)
    println("Введите количесто порций")
    val numberOfServings = readln().toInt()
    val ingredientsMap = oneServing.mapValues { it.value * numberOfServings }

    println("На количество порций $numberOfServings, Вам понадобится:")
    for (i in ingredientsMap) {
        println("${i.key} - ${i.value}")
    }
}
