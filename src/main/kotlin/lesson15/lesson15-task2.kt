package lesson15

fun main() {

    val send = WeatherServe()
    val temp = Temperature(32)
    send.sendToTheServer(temp.temperature)
    val amount = PrecipitationAmount("Мало")
    send.sendToTheServer(amount.precipitationAmount)
}

abstract class WeatherStationStats

class Temperature(
    val temperature: Int,
    ) : WeatherStationStats()

class PrecipitationAmount(
    val precipitationAmount: String,
    ) : WeatherStationStats()

class WeatherServe{
    fun sendToTheServer(param: Int){
        println("Отправляем на сервет текущую температуру: $param")
    }
    fun sendToTheServer(param: String){
        println("Оправляем на сервер количество осадков: $param")
    }
}
