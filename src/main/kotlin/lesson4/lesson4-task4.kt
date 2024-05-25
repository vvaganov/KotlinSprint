package org.example.lesson4

fun main() {

    val trainingDay = 3
    val gisEven = trainingDay % 2 == 0


    println(
        """
       Упражнения для рук:   ${!gisEven}
       Упражнения для ног:   $gisEven
       Упражнения для спины: $gisEven
       Упражнения для пресса:${!gisEven}
   """.trimIndent()
    )

}

