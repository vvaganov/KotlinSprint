package org.example.lesson4

fun main() {
    val theWeatherIsSunnyToday = true
    val theTentIsOpenNow = true
    val airHumidity = 20
    val theCurrentTimeOfTheYear = "Зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${theWeatherIsSunnyToday && theTentIsOpenNow && airHumidity == 20 && theCurrentTimeOfTheYear != "Зима"}"
    )
}


