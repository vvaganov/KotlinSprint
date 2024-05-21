package org.example.lesson4

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_WEIGHT_VOLUME = 100

fun main() {

    var cargoWeight = 20
    var cargoVolume = 80


    fun compareCargoParameters(weight: Int, volume: Int) {
        println(
            "Груз весом $weight кг. и объемом $volume л. не соответствует категории \"Average\": " +
                    "${(cargoWeight >= AVERAGE_WEIGHT_MIN && cargoWeight <= AVERAGE_WEIGHT_MAX) && cargoVolume < AVERAGE_WEIGHT_VOLUME}"
        )
    }

    compareCargoParameters(cargoWeight, cargoVolume)

    cargoWeight = 50
    cargoVolume = 100

    compareCargoParameters(cargoWeight, cargoVolume)

}
