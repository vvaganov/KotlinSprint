package org.example.lesson12

const val RATIO = 273.15

fun main() {
    val weatherForecast = NewWeatherInit(300, 295, true)

}

class NewWeatherInit(
    daytimeTemperature: Int,
    nightTemperature: Int,
    precipitationDuringTheDay: Boolean,
) {

    val _daytimeTemperature = daytimeTemperature - RATIO.toInt()
    val _nightTemperature = nightTemperature - RATIO.toInt()
    val _precipitationDuringTheDay = precipitationDuringTheDay

    init {
        println(
            """Прогноз погоды:
            |Днем: $_daytimeTemperature
            |Ночью: $_nightTemperature
            |Осадки в течении дня: $_precipitationDuringTheDay
            |________________________________________________
        """.trimMargin()
        )
    }
}
