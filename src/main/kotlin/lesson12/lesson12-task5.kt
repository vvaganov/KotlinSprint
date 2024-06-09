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
    println("Сренняя температура днем: " + String.format("%.1f", weatherList.map { it.daytimeTemperature }.average()))
    println("Средняя температра ночью: " + String.format("%.1f", weatherList.map { it.nightTemperature }.average()))
    println("Дней с остадками: " + weatherList.filter { it.precipitationDuringTheDay }.size)
}

class Weather(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    var precipitationDuringTheDay: Boolean,
) {}
