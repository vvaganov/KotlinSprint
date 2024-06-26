package lesson15

fun main() {

    val truck = Track()
    truck.boardPassengers(1)
    truck.loadCargo(2000)
    truck.move()
    val pass = PassengerCar()
    pass.boardPassengers(3)
    pass.boardPassengers(2)
    pass.move()
    println("Перевезено ${pass.pass + truck.pass} пассажиров и ${truck.cargo} груза")


}

interface Movable {
    fun move()
}

interface Truckable {
    fun loadCargo(cargoWeight: Int)
}

interface Passengerable {
    fun boardPassengers(numberPassengers: Int)
}

abstract class Transport : Movable, Passengerable {
    abstract val maxPass: Int
    abstract val maxCargo: Int

    var pass = 0
    var cargo = 0
}


class Track(override val maxPass: Int = 1, override val maxCargo: Int = 2000) : Transport(), Truckable {


    override fun move() = println("Грузовик начал движение")

    override fun boardPassengers(numberPassengers: Int) {
        if (numberPassengers > maxPass) {
            println("Максимальное количество пассажиров в грузовике $maxPass пассажир")
        } else {
            pass += numberPassengers
        }
    }

    override fun loadCargo(cargoWeight: Int) {
        if (cargoWeight > maxCargo) {
            println("Максимальный вес груза в грузовике $maxCargo")
        } else {
            cargo += cargoWeight
        }
    }
}

class PassengerCar(override val maxPass: Int = 3, override val maxCargo: Int = 0) : Transport() {
    override fun move() = println("Лекговой автомобиль начал движение")

    override fun boardPassengers(numberPassengers: Int) {
        if (numberPassengers > maxPass) {
            println("Максимальное число пассажиров $maxPass ")
        } else {
            pass += numberPassengers
        }
    }
}

