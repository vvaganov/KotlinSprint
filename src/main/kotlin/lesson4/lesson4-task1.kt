package lesson4

const val NUMBER_OF_TABLES = 13

fun main() {
    val tableReservationsToday = 13
    val tableReservationsTomorrow = 9

    println(
        "[Доступность столиков на сегдня: ${tableReservationsToday < NUMBER_OF_TABLES}],\n" +
                "[Доступность столиков на завтра: ${tableReservationsTomorrow < NUMBER_OF_TABLES}].\n"
    )
}

