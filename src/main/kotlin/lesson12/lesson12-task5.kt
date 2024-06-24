package org.example.lesson12

const val COUNT = 30

fun main() {

    val randomTemperature = 0..40
    val randomPrecipitation = listOf(true, false)
    val weatherList = ArrayList<Weather>(COUNT)
    for (index in 0 until COUNT) {
        weatherList.add(
            Weather(
                randomTemperature.random(),
                randomTemperature.random(),
                randomPrecipitation.random()
            )
        )
    }

    val daytimeTemperatureList: MutableList<Int> = mutableListOf()
    val nightTemperatureList: MutableList<Int> = mutableListOf()
    val precipitationList: MutableList<Boolean> = mutableListOf()

    for (i in weatherList) {
        daytimeTemperatureList.add(i.daytimeTemperature)
        nightTemperatureList.add(i.nightTemperature)
        if (i.precipitationDuringTheDay == true) {
            precipitationList.add(i.precipitationDuringTheDay)
        }
    }

    println("Средняя температра днем: " + String.format("%.1f", daytimeTemperatureList.average()))
    println("Средняя температура ночью: " + String.format("%.1f", nightTemperatureList.average()))
    println("Количество дней с осадками: ${precipitationList.size}")
}

class Weather(
    _daytimeTemperature: Int,
    _nightTemperature: Int,
    _precipitationDuringTheDay: Boolean,
) {

    val daytimeTemperature = _daytimeTemperature
    val nightTemperature = _nightTemperature
    val precipitationDuringTheDay = _precipitationDuringTheDay
}
