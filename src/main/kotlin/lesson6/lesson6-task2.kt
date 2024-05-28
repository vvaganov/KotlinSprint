package lesson6

fun main() {
    println("Введите количество секунд для установки таймера:")
    val time = readln().toInt()

    var count = 0

    while (count < time) {
        count++
        Thread.sleep(1000)
    }
    println("Прошло $count секунд")
}

