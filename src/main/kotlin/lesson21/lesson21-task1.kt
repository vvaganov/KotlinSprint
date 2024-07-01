package lesson21

const val VOWELS = "aAeEiIoOuU"
fun main() {
    val string = "Hello"
    println(string.vowelCount(string))
}

fun String.vowelCount(string: String): Int {
    var vowelCount = 0
    for (char in string) {
        if (char in VOWELS) {
            vowelCount++
        }
    }
    return vowelCount
}