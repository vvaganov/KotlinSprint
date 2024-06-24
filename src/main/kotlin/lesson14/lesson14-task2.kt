package lesson14

fun main() {
    val cargo1 = ShipCargo("Cargo1", 15, 2000, 100)
    cargo1.getShipProperties()
    cargo1.performLoading()
    println()

    val icebreakerShip1 = IcebreakerShip("icebreakerShip1", 5, 300, 50)
    icebreakerShip1.getShipProperties()
    icebreakerShip1.performLoading()
    println()

    val liner1 = LinerShip()
    liner1.getShipProperties()
    liner1.performLoading()

}

open class LinerShip(
    val name: String = "Liner",
    val speed: Int = 20,
    val loadCapacity: Int = 500,
    val passengerCapacity: Int = 2000,
    val breakTheIce: Boolean = false,
) {
    open fun performLoading() {
        println("Способ погрузки ${name} выдвигает горизонтальный трап со шкафута")
    }

    fun getShipProperties() {
        println(
            "Название коробля: $name\nСкорость движения: $speed узлов\n" +
                    "Грузоподьемность: $loadCapacity тонн\nВместительность пассажиров: $passengerCapacity человек\n" +
                    "Раскалывать лед: $breakTheIce"
        )
    }
}

class ShipCargo(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengerCapacity: Int,
) : LinerShip(name, speed, loadCapacity, passengerCapacity) {

    override fun performLoading() {
        println("Способ погрузки ${name} активирует погрузочный кран")
    }
}

class IcebreakerShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengerCapacity: Int,
) : LinerShip(name, speed, loadCapacity, passengerCapacity, breakTheIce = true) {

    override fun performLoading() {
        println("Способ погрузки ${name} открывает ворота со стороны кормы")
    }
}