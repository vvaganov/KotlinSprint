fun main() {

    val liner = Liner()
    val shipCargo = ShipCargo("ShipCargo", 15, 2000, 100)
    val icebreakerShip = IcebreakerShip("iceBreakerShip", 5, 300, 50)

}

open class Liner(
    val name: String = "Liner",
    val speed: Int = 20,
    val loadCapacity: Int = 500,
    val passengerCapacity: Int = 2000,
    val breakTheIce: Boolean = false,
) {

}

class ShipCargo(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengerCapacity: Int,
) : Liner(name, speed, loadCapacity, passengerCapacity) {}

class IcebreakerShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengerCapacity: Int,
) : Liner(name, speed, loadCapacity, passengerCapacity, breakTheIce = true) {}