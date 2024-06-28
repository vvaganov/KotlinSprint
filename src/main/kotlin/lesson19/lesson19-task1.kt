package lesson19

fun main() {
    println(Fish.entries)
    println()
    Fish.entries.forEach { println(it.text) }

}

enum class Fish(val text: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}







