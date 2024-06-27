package lesson18

fun main() {

    val animalList = listOf<Animal>(Fox("Алииса"), Dog("Палкан"), Cat("Муська"))
    toFeedAllAnimal(animalList)
}

abstract class Animal {
    abstract val name: String
    abstract fun toEatFood()
    abstract fun sleep()

}

class Fox(override val name: String) : Animal() {
    override fun toEatFood() {
        println("Лиса $name - ест ягоды")

    }

    override fun sleep() {
        println("Лиса $name - спит")
    }
}

class Dog(override val name: String) : Animal() {
    override fun toEatFood() {
        println("Собака $name - ест кости")
    }

    override fun sleep() {
        println("Собака $name - спит")
    }
}

class Cat(override val name: String) : Animal() {
    override fun toEatFood() {
        println("Кошка $name - ест рыбу")
    }

    override fun sleep() {
        println("Кошка $name - спит")
    }
}

fun toFeedAllAnimal(list: List<Animal>) {
    list.forEach { it.toEatFood() }
}

fun sleepAllAnimal(list: List<Animal>) {
    list.forEach { it.sleep() }
}
