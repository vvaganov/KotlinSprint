package lesson15

fun main() {
    val dusk = Duck()
    dusk.fly()
    dusk.swim()

    val seagull = Seagull()
    seagull.fly()

    val carp = Carp()
    carp.swim()
}

interface Flying {
    fun fly()
}

interface Floating {
    fun swim()
}

class Duck : Floating, Flying {
    override fun fly() {
        println("Утка полетела на юг")
    }

    override fun swim() {
        println("Утка плавает на озере")
    }
}

class Seagull() : Flying {
    override fun fly() {
        println("Чайка летает над морем")
    }
}

class Carp() : Floating {
    override fun swim() {
        println("Карась плавает в речке")
    }
}
