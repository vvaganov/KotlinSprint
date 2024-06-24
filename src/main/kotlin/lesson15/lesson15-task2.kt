package lesson15

fun main() {

    val send = WeatherServe()
    send.sendToTheServer(Temperature(32))
    send.sendToTheServer(PrecipitationAmount("Много"))
}

abstract class WeatherStationStats

class Temperature(
    val temperature: Int,
    ) : WeatherStationStats()

class PrecipitationAmount(
    val precipitationAmount: String,
    ) : WeatherStationStats()

class WeatherServe {
    fun sendToTheServer(weatherData: WeatherStationStats) {
        when (weatherData) {
            is PrecipitationAmount -> println("Отправляем на срвер количество осадков - ${weatherData.precipitationAmount} ")
            is Temperature -> println("Отправляем на сервер текущую температуру - ${weatherData.temperature}")
        }
    }
}

