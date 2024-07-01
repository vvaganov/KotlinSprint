package lesson21

const val VOWELS = "aAeEiIoOuU"
fun main() {
    val string = "Hello World"
    println(string.vowelCount())
}

fun String.vowelCount(): Int {
   return this.count {it in VOWELS}
}