package lesson15

fun main() {
    val guitar = MusicalInstrument(1, "Enya", 100)
    val strings = Accessorie(1, "Music Life", 20, 1)
    println("Гитара \"${guitar.title}\" - количество единиц на складе ${guitar.numberUnits}")
    guitar.searchAccessories()
    println("Струны \"${strings.title}\" - количество единиц на складе ${strings.numberUnits}")
}


abstract class Product {
    abstract val id: Int
    abstract val title: String
    abstract val numberUnits: Int
}

interface Searchable {
    fun searchAccessories() {
        println("Выполняется поиск по Id")
    }
}

class MusicalInstrument(
    override val id: Int,
    override val title: String,
    override val numberUnits: Int

) : Product(), Searchable {
    override fun searchAccessories() {
        super.searchAccessories()
    }
}

class Accessorie(
    override val id: Int,
    override val title: String,
    override val numberUnits: Int,
    val instrumentsId: Int,
) : Product()