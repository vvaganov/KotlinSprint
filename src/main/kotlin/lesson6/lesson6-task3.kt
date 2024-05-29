package lesson6

fun main() {
    println("Введите количество секунд для установки таймера:")
    var time = readln().toInt()
    val count = 0

    while (time > count) {
        println("Осталось ${time--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}