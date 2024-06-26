fun main() {
    val ship = Ship("Черная жемчужина", 20, "Тартуга")
    println(ship.setName)
    ship.setName = "Голландец"
}

class Ship(
    private val name: String,
    private val averageSpeed: Int,
    private val homePort: String,
) {

    var setName: String
        get() = name
        set(value) {
            if (value != name) println("Имя нельзя изменять!")
        }
}