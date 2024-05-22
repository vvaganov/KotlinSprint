package lesson3

fun main() {
    val number = 8
    var counter = 1

    val result = """
        $number * $counter = ${number * counter++}
        $number * $counter = ${number * counter++}
        $number * $counter = ${number * counter++}
        $number * $counter = ${number * counter++}
        $number * $counter = ${number * counter++}
        $number * $counter = ${number * counter++}
        $number * $counter = ${number * counter++}
        $number * $counter = ${number * counter++}
        $number * $counter = ${number * counter}
        """.trimIndent()

    println(result)
}
