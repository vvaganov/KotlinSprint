package lesson2

const val minuteInHour = 60

fun main() {
    val theHourOfDepartureTime = 9
    val minutesOfDepartureTime = 36
    val travelTimeInMinutes = 457
    val travelTimeInHour = travelTimeInMinutes / minuteInHour
    val remainingMinutes = travelTimeInMinutes % minuteInHour
    val arrivalTimeInMinutes = minutesOfDepartureTime + remainingMinutes
    val arrivalTimeHour = (theHourOfDepartureTime + travelTimeInHour) + arrivalTimeInMinutes / minuteInHour
    val arrivalTimeMinutes = arrivalTimeInMinutes % minuteInHour
    val arrivalTime = String.format("%02d:%02d", arrivalTimeHour, arrivalTimeMinutes)

    println(arrivalTime)
}