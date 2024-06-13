package lesson15

fun main() {
    val guitar = MusicalInstruments(1, "Enya", 100)
    val strings = Accessories(1, "Music Life", 20, 1)
    println("Гитара \"${guitar.title}\" - количество единиц на складе ${guitar.numberUnits}")
    guitar.searchAccessories()
    println("Струны \"${strings.title}\" - количество единиц на складе ${strings.numberUnits}")
}

interface Products {
    val id: Int
    val title: String
    val numberUnits: Int
}

interface Search {
    fun searchAccessories() {
        println("Выполняется поиск по Id")
    }
}

class MusicalInstruments(
    override val id: Int,
    override val title: String,
    override val numberUnits: Int,
) : Products, Search {
    override fun searchAccessories() {
        super.searchAccessories()
    }
}

class Accessories(
    override val id: Int,
    override val title: String,
    override val numberUnits: Int,
    val instrumentsId: Int,
) : Products