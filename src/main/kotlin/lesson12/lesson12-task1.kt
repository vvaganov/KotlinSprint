package lesson12

fun main() {
    val theWeatherToday = Weather()
    theWeatherToday.daytimeTemperature = 20
    theWeatherToday.nightTemperature = 10
    theWeatherToday.precipitationDuringTheDay = true
    theWeatherToday.weatherForecast()

    val tomorrowWeather = Weather()
    tomorrowWeather.daytimeTemperature = 24
    tomorrowWeather.nightTemperature = 19
    tomorrowWeather.weatherForecast()
}

class Weather() {
    var daytimeTemperature = 0
    var nightTemperature = 0
    var precipitationDuringTheDay = false

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