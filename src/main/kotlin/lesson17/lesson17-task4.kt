package lesson17

fun main() {

    val pac = Package()
    println("Номер посылки: ${pac.numberPackage},\nПункт: ${pac.location},\nКоличство перемещений: ${pac.getCounter}")
    pac.location = "Kazan"
    println("Номер посылки: ${pac.numberPackage},\nПункт: ${pac.location},\nКоличство перемещений: ${pac.getCounter}")
    pac.location = "Ekaterinburg"
    println("Номер посылки: ${pac.numberPackage},\nПункт: ${pac.location},\nКоличство перемещений: ${pac.getCounter}")
}

class Package {
    private var movementCounter: Int = 0

    val numberPackage: Int = 1

    var location: String = "Moscow"
        set(value) {
            field = value
            movementCounter++
        }

    val getCounter: Int
        get() = movementCounter
}