package lesson20

fun main() {
    val elementList: List<String> =
        listOf("element1", "element2", "element3", "element4", "element5", "element6", "element7")
    val lambdaList = elementList.map { { println("Нажат элемент - $it") } }
    lambdaList.forEachIndexed { index, function ->
        if ((index + 1) % 2 == 0) {
            function()
        }
    }
}