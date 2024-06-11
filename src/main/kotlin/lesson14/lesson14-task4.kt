package lesson14

fun main() {
    val mars = Planet("Марс", mutableListOf(Satellite("Фобос"), Satellite("Деймос")))

    println("Планет ${mars.name} имеет спутники: ${mars.satellite.joinToString(" и ") { it.name }}")
}

open class TheCosmicBody(
    val name: String,
    val atmosphere: Boolean = false,
    val suitableForDisembarkation: Boolean = false,
    val thePresenceOfSatellites: Boolean = false,
) {}

class Planet(
    name: String,
    val satellite: MutableList<Satellite>
) : TheCosmicBody(name) {}


class Satellite(
    name: String,
) : TheCosmicBody(name) {}


