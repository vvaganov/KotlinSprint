fun main() {
    println("Укажите время в секундах:")
    val timer = readln().toInt()

    for (i in timer downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло!")
}