package lesson19

fun main() {
    val ship = Spaceship()
    ship.takeOff()
    ship.makeLanding()
    ship.asteroidShoot()

}

class Spaceship {
    fun takeOff() {
        println("Космический кораболь совершил взлет")
    }

    fun makeLanding() {
//        TODO()
    }

    fun asteroidShoot() {
        TODO("add the logic of the method implementation")
    }
}