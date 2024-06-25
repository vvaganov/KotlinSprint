package lesson18

fun main() {

    val animalList = listOf<Animal>(Fox("Алииса"), Dog("Палкан"), Cat("Муська"))
    toFeedAllAnimal(animalList)

}

abstract class Animal {
    abstract val name: String
    abstract fun toEatFood()

}

class Fox(override val name: String) : Animal() {
    override fun toEatFood() {
        println("Лиса $name - ест ягоды")
    }
}

class Dog(override val name: String) : Animal() {
    override fun toEatFood() {
        println("Собака $name - ест кости")
    }
}

class Cat(override val name: String) : Animal() {
    override fun toEatFood() {
        println("Кошка $name - ест рыбу")
    }
}

fun toFeedAllAnimal(list: List<Animal>) {
    list.forEach { it.toEatFood() }
}
