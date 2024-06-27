package lesson19

fun main() {
    val nameFish = enumValues<Fish>()
    nameFish.forEach { println( it.name) }
    println()
    nameFish.forEach { printNameFish(it) }
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun printNameFish(fish: Fish){
    when(fish){
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGELFISH -> println("Скалярия")
        Fish.GOLDFISH -> println("Золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }

}





