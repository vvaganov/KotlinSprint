fun main() {
    println("Укажите время в секундах:")
    val numberOfSeconds = readln().toInt()

    for (i in numberOfSeconds downTo 0) {
        println("Осталось $i секунд...")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}