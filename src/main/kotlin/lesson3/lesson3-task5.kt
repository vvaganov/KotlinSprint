package lesson3

fun main() {
    val motion = "D2-D4;0"

    val listString = motion.split("-", ";")
    val startPoint = listString[0]
    val stopPoint = listString[1]
    val strokeNumber = listString[2]

    println(startPoint)
    println(stopPoint)
    println(strokeNumber)
}