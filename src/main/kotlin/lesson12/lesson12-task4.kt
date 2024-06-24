package org.example.lesson12

const val CONVERSION_KELVIN_IN_CELSIUS = 273.15

fun main() {
    val weatherForecast = NewWeatherInit(300, 295, true)

}

class NewWeatherInit(
    dayTemperature: Int,
    nightTemperature: Int,
    precipitationDay: Boolean,
) {

    val dayTimeTemperature = dayTemperature - CONVERSION_KELVIN_IN_CELSIUS.toInt()
    val nightTimeTemperature = nightTemperature - CONVERSION_KELVIN_IN_CELSIUS.toInt()
    val precipitationDuringTheDay = precipitationDay

    init {
        println(
            """Прогноз погоды:
            |Днем: $dayTimeTemperature
            |Ночью: $nightTimeTemperature
            |Осадки в течении дня: $precipitationDuringTheDay
            |________________________________________________
        """.trimMargin()
        )
    }
}
