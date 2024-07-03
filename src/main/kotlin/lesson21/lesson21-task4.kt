package lesson21

import java.io.File

fun main() {
    val file = File("src/main/kotlin/lesson21/word.txt")
    file.appendFirstLowerText("HELLO WORLD")
    file.appendFirstLowerText("Привет Мир")
    file.appendFirstLowerText("Хорошая погода")
    file.appendFirstLowerText("Жить хорошо")
}

fun File.appendFirstLowerText(text: String) {
    val stringList = this.readText()
    this.writeText(text.lowercase())
    appendText(stringList)
}