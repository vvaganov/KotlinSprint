package lesson1

import kotlin.math.min

const val SECOND_IN_MINUTE = 60
const val MINUTE_IN_HOUR = 60

fun main() {

    val secondInSpace: Int = 6480
    val secondInHour = SECOND_IN_MINUTE * MINUTE_IN_HOUR

    val hour = secondInSpace / secondInHour
    val minute = (secondInSpace / SECOND_IN_MINUTE) % MINUTE_IN_HOUR
    val seconds = (secondInSpace % SECOND_IN_MINUTE)

    val timesInCosmos = String.format("%02d:%02d:%02d", hour, minute, seconds)

    println(timesInCosmos)
}