package lesson21

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numberList.evenNumbersSum(numberList))
}

fun List<Int>.evenNumbersSum(numberList: List<Int>): Int {
    return numberList.filter { it % 2 == 0 }.sum()
}