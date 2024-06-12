package lesson15

fun main() {
    val dusk = Duck()
    dusk.startTheFlight()
    dusk.startSwimming()

    val seagull = Seagull()
    seagull.startTheFlight()

    val carp = Carp()
    carp.startSwimming()
}


interface FlyingCreatures{
    fun startTheFlight(){}
}

interface FloatingCreatures{
    fun startSwimming(){}
}

class Duck : FloatingCreatures, FlyingCreatures {
    override fun startTheFlight() {
        println("Утка полетела юг")
    }

    override fun startSwimming() {
        println("Утка плавает на озере")
    }
}

class Seagull(): FlyingCreatures{
    override fun startTheFlight() {
        println("Чайка летает над морем")
    }
}

class Carp() : FloatingCreatures{
    override fun startSwimming() {
        println("Карась плавает в речке")
    }
}
