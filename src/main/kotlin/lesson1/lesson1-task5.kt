package lesson1

import kotlin.math.min

fun main(){

    val second: Int = 6480

    val hour = second/3600
    val minute = (second/60 )% 60
    val seconds = (second % minute)

    println(hour)
    println(minute)
    println(seconds)

    println("0$hour:$minute:0$seconds")
}