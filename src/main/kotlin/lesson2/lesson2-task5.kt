package lesson2

import kotlin.math.pow
import kotlin.math.roundToLong

fun main() {
    val degreeOfRounding = 1000
    val depositAmount = 70_000
    val theInterestRate = 16.7
    val percentCoefficient = theInterestRate / 100
    val depositPeriod = 20

    val theTotalAmount = depositAmount * ((1 + percentCoefficient).pow(depositPeriod))
    val totalAmount = ((theTotalAmount * degreeOfRounding).roundToLong()).toDouble() / degreeOfRounding

    println(totalAmount)
}

