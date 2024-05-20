package lesson3

fun main() {
    val motion = "D2-D4;0"

    val startPoint = motion.substringBefore("-")
    val stopPoint = motion.substringAfter("-").substringBefore(";")
    val strokeNumber = motion.substringAfter(";")

    println(startPoint)
    println(stopPoint)
    println(strokeNumber)


}