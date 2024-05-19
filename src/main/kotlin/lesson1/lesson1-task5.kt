package lesson1

import kotlin.math.min

const val secondInMinute = 60
const val minuteInHour = 60

fun main(){

    val secondInSpace: Int = 6480
    val secondInHour = secondInMinute * minuteInHour

    val hour = secondInSpace/secondInHour
    val minute = (secondInSpace/secondInMinute) % minuteInHour
    val seconds = (secondInSpace % secondInMinute)

    val timesInCosmos = String.format("%02d:%02d:%02d", hour, minute,seconds)

    println(timesInCosmos)
}