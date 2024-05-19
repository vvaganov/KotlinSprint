package lesson2

const val percentCoefficient = 100

fun main() {

    val unitBaf = 20.0
    val unitBafInPercent = unitBaf / percentCoefficient
    val crystalOre = 7.0
    val ironOre = 11.0
    val cristalOreBaf: Double = crystalOre * unitBafInPercent
    val ironOreBaf = ironOre * unitBafInPercent

    println("cristalOreBaf: ${cristalOreBaf.toInt()}")
    println("ironOreBaf: $ironOreBaf")
}