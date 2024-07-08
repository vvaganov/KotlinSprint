package lesson22

fun main() {

    val galaxyObject = GalacticGuide(
        "Alpha Centauri",
        "A triple star system in the constellation Centauri",
        "",
        4.396
    )

    val (nameLocation, descriptionLocation, dateAndTime, distancePlanetEarth) = galaxyObject
    println(
        """
        Наименование места -$nameLocation
        Описание места - $descriptionLocation
        Дата и время - $dateAndTime
        Расстояние от земли - $distancePlanetEarth
    """.trimIndent()
    )

}

data class GalacticGuide(
    val nameLocation: String,
    val descriptionLocation: String,
    val dateAndTime: String,
    val distancePlanetEarth: Double,
)