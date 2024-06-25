package lesson17

fun main() {

    val pac = Package(1, "Moscow")
    println("Номер посылки: ${pac.numberPackage},\nПункт: ${pac.setLocation},\nКоличство перемещений: ${pac.getCounter}")
    pac.setLocation = "Kazan"
    println("Номер посылки: ${pac.numberPackage},\nПункт: ${pac.setLocation},\nКоличство перемещений: ${pac.getCounter}")
    pac.setLocation = "Ekaterinburg"
    println("Номер посылки: ${pac.numberPackage},\nПункт: ${pac.setLocation},\nКоличство перемещений: ${pac.getCounter}")

}

class Package(
    val numberPackage: Int,
    private val location: String
) {

    private var movementCounter: Int = 0

    var setLocation: String = location
        get() = field
        set(value) {
            field = value
            movementCounter++

        }

    val getCounter: Int
        get() = movementCounter
}