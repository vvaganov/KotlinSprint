package lesson22

fun main() {

    val galaxyObject = GalacticGuide(
        "Alpha Centauri",
        "A triple star system in the constellation Centauri",
        "",
        4.396
    )

    println(
        """
        Наименование места - ${galaxyObject.component1()}
        Описание места - ${galaxyObject.component2()}
        Дата и время - ${galaxyObject.component3()}
        Расстояние от земли - ${galaxyObject.component4()}
    """.trimIndent()
    )

}

data class GalacticGuide constructor(
    val nameLocation: String,
    val descriptionLocation: String,
    val dateAndTime: String,
    val distancePlanetEarth: Double,
)