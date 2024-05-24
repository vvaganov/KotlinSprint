package org.example.lesson4

const val DAMAGE_TO_THE_SHIP = false
const val NUMBER_OF_CREW_MIN = 55
const val NUMBER_OF_CREW_MAX = 70
const val BOXES_OF_PROVISIONS = 50
const val FAVORABLE_WEATHER_CONDITIONS = true


fun main() {
    println("Есть ли повреждения корабля?")
    val damage = readln().toBoolean()
    val minorDamage = true
    println("Какое количество человек в экипаже?")
    val numberOfCrew = readln().toInt()
    println("Погодные условия благоприятные для плаванья?")
    val weatherConditions = readln().toBoolean()
    println("Сколько ящиков с провизией на борту?")
    val numberOfBoxesOfProvisions = readln().toInt()

    println(
        "Научно-исследовательский корабль к долгосрочному плаванию: ${
            (damage == DAMAGE_TO_THE_SHIP || damage == minorDamage)
                    && (numberOfCrew >= NUMBER_OF_CREW_MIN && numberOfCrew <= NUMBER_OF_CREW_MAX)
                    && (weatherConditions == FAVORABLE_WEATHER_CONDITIONS) && numberOfBoxesOfProvisions > BOXES_OF_PROVISIONS
        }"
    )

}