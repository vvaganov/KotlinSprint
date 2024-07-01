package lesson19

fun main() {

    val tank = Tank()
    tank.toFireCannon()
    tank.loadCannon(Patron.GREEN)
    tank.toFireCannon()
    tank.loadCannon(Patron.BLUE)
    tank.toFireCannon()
    tank.loadCannon(Patron.RED)
    tank.toFireCannon()
}

enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var patronType: Patron? = null

    fun loadCannon(patron: Patron) {
        patronType = patron
        println("Пушка заряжена патроном: ${patron.name}")
    }

    fun toFireCannon() {
        if (patronType == null) {
            println("Пушка не заряжена")
        } else {
            println("Выстрел партоном $patronType, нанесенный ущерб - ${patronType?.damage} ")
        }
    }
}