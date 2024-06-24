package org.example.lesson12

const val CONVERTER = 273.15

fun main() {
    val weatherForecast = NewWeatherKelvin(300, 295, true)
    weatherForecast.weatherForecast()
}

class NewWeatherKelvin(
    daytimeTemperature: Int,
    nightTemperature: Int,
    precipitationDuringTheDay: Boolean,
) {

    val daytimeTemperature = daytimeTemperature - CONVERTER.toInt()
    val nightTemperature = nightTemperature - CONVERTER.toInt()
    val precipitationDuringTheDay = precipitationDuringTheDay

    fun weatherForecast() {
        println(
            """Прогноз погоды:
            |Днем: $daytimeTemperature
            |Ночью: $nightTemperature
            |Осадки в течении дня: $precipitationDuringTheDay
            |________________________________________________
        """.trimMargin()
        )
    }
}
