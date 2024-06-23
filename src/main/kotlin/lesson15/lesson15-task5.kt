package lesson15

fun main() {

    val truck = Track()
    truck.boardingPassengers(1)
    truck.loadingCargo(2000)
    truck.move()
    val pass = PassengerCar()
    pass.boardingPassengers(3)
    pass.boardingPassengers(2)
    pass.move()
    println("Перевезено ${Count.pass} пассажиров и ${Count.cargo} груза")


}

interface Movable {
    fun move()
}

interface Truckable {
    fun loadingCargo(cargoWeight: Int)
}

interface Passengerable {
    fun boardingPassengers(numberPassengers: Int)
}

abstract class Transport : Movable, Passengerable {
    abstract val maxPass: Int
    abstract val maxCargo: Int
}

object Count {
    var pass = 0
    var cargo = 0
}

class Track(override val maxPass: Int = 1, override val maxCargo: Int = 2000) : Transport(), Truckable {

    override fun move() = println("Грузовик начал движение")

    override fun boardingPassengers(numberPassengers: Int) {
        if (numberPassengers > maxPass) {
            println("Максимальное количество пассажиров в грузовике $maxPass пассажир")
        } else {
            Count.pass += numberPassengers
        }
    }

    override fun loadingCargo(cargoWeight: Int) {
        if (cargoWeight > maxCargo) {
            println("Максимальный вес груза в грузовике $maxCargo")
        } else {
            Count.cargo += cargoWeight
        }
    }
}

class PassengerCar(override val maxPass: Int = 3, override val maxCargo: Int = 0) : Transport() {
    override fun move() = println("Лекговой автомобиль начал движение")

    override fun boardingPassengers(numberPassengers: Int) {
        if (numberPassengers > maxPass) {
            println("Максимальное число пассажиров $maxPass ")
        } else {
            Count.pass += numberPassengers
        }
    }
}

