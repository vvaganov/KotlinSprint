package lesson19

fun main() {

    val tank = Tank()
    println(tank.getPatron())
    tank.loadCannon(Patron.GREEN)
    tank.toFireCannon()
    tank.loadCannon(Patron.BLUE)
    tank.toFireCannon()
    tank.loadCannon(Patron.RED)
    tank.toFireCannon()
}

enum class Patron {
    BLUE {
        override fun getDamageCaused(): Int {
            return 5
        }
    },
    GREEN {
        override fun getDamageCaused(): Int {
            return 10
        }
    },
    RED {
        override fun getDamageCaused(): Int {
            return 20
        }
    };

    abstract fun getDamageCaused(): Int
}

class Tank {
    private var patronType: Patron? = null

    fun getPatron() = patronType

    fun loadCannon(patron: Patron) {
        patronType = patron
        println("Пушка заряжена патроном: ${patron.name}")
    }

    fun toFireCannon() {
        println("Выстрел партоном $patronType, нанесенный ущерб - ${patronType?.getDamageCaused()} ")
    }
}