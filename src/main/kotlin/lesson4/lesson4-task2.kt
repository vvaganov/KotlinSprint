package org.example.lesson4

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_WEIGHT_VOLUME = 100


fun main() {

    val cargoOneWeight = 20
    val cargoOneVolume = 80
    val cargoTwoWeight = 50
    val cargoTwoVolume = 100

    println(
        "Груз весом $cargoOneWeight кг. и объемом $cargoOneVolume л. не соответствует категории \"Average\": " +
                "${(cargoOneWeight >= AVERAGE_WEIGHT_MIN && cargoOneWeight <= AVERAGE_WEIGHT_MAX) && cargoOneVolume < AVERAGE_WEIGHT_VOLUME}"
    )

    println(
        "Груз весом $cargoTwoWeight кг. и объемом $cargoTwoVolume л. не соответствует категории \"Average\": " +
                "${(cargoTwoVolume >= AVERAGE_WEIGHT_MIN && cargoTwoWeight <= AVERAGE_WEIGHT_MAX) && cargoTwoVolume < AVERAGE_WEIGHT_VOLUME}"
    )
}
