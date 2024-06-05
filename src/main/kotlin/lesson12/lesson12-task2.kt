package org.example.lesson12

fun main() {
    val weatherForecast = NewWeather(34, 25, true)
    weatherForecast.weatherForecast()

}

class NewWeather(
    var daytimeTemperature: Int,
    var nightTemperature: Int,
    var precipitationDuringTheDay: Boolean,
) {

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
