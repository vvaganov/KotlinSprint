package org.example.lesson4

fun main() {

    val trainingDay = 2
    val checkTrainingDay = trainingDay % 2
    val gisEven = checkTrainingDay == 0


    println(
        """
       Упражнения для рук:   ${!gisEven}
       Упражнения для ног:   $gisEven
       Упражнения для спины: $gisEven
       Упражнения для пресса:${!gisEven}
   """.trimIndent()
    )

}

