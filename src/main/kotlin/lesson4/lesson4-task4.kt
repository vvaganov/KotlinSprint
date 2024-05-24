package org.example.lesson4

fun main() {

    val trainingDay = 5
    val checkTrainingDay = trainingDay % 2
    val groupOne = checkTrainingDay == 1
    val groupTwo = checkTrainingDay != 1

    println(
        """
       Упражнения для рук:   $groupOne
       Упражнения для ног:   $groupTwo
       Упражнения для спины: $groupTwo
       Упражнения для пресса:$groupOne
   """.trimIndent()
    )

}

