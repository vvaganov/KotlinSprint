package lesson2

const val MINUTE_IN_HOUR = 60

fun main() {
    val theHourOfDepartureTime = 9
    val minutesOfDepartureTime = 36
    val travelTimeInMinutes = 457

    val travelTimeInHour = travelTimeInMinutes / MINUTE_IN_HOUR
    val remainingMinutes = travelTimeInMinutes % MINUTE_IN_HOUR
    val arrivalTimeInMinutes = minutesOfDepartureTime + remainingMinutes
    val arrivalTimeHour = (theHourOfDepartureTime + travelTimeInHour) + arrivalTimeInMinutes / MINUTE_IN_HOUR
    val arrivalTimeMinutes = arrivalTimeInMinutes % MINUTE_IN_HOUR
    val arrivalTime = String.format("%02d:%02d", arrivalTimeHour, arrivalTimeMinutes)

    println(arrivalTime)
}