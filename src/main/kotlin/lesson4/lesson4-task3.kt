package org.example.lesson4

const val THE_PRESENCE_OF_SUNNY_WEATHER = true
const val OUTDOOR_AWNING = true
const val AIR_HUMIDITY = 20
const val SEASON = "не зима"

fun main() {
    val theWeatherIsSunnyToday = true
    val theTentIsOpenNow = true
    val airHumidity = 20
    val theCurrentTimeOfTheYear = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${
                    theWeatherIsSunnyToday == THE_PRESENCE_OF_SUNNY_WEATHER && theTentIsOpenNow == OUTDOOR_AWNING
                            && airHumidity == AIR_HUMIDITY && theCurrentTimeOfTheYear == SEASON
                }"
    )
}


