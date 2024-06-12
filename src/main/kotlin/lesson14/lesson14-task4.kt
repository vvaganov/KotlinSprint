package lesson14

fun main() {
    val mars = Planet("Марс", mutableListOf(Satellite("Фобос"), Satellite("Деймос")))

    println("Планет ${mars.name} имеет спутники: ${mars.isSatellite.joinToString(" и ") { it.name }}")
}

open class CosmicBody(
    val name: String,
    val isAtmosphere: Boolean = false,
    val isSuitableForDisembarkation: Boolean = false,
    val isPresenceOfSatellites: Boolean = false,
)

class Planet(
    name: String,
    val isSatellite: MutableList<Satellite>
) : CosmicBody(name)


class Satellite(
    name: String,
) : CosmicBody(name)