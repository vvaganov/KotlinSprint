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


    val precipitationList: MutableList<Boolean> = mutableListOf()



    println("Средняя температра днем: " + String.format("%.1f", weatherList.map{weather -> weather.daytimeTemperature }))
    println("Средняя температура ночью: " + String.format("%.1f", weatherList.map { weather -> weather.nightTemperature  }.average()))
    println("Количество дней с осадками: ${precipitationList.size}")
}

class Weather(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val precipitationDuringTheDay: Boolean,
) {


}
