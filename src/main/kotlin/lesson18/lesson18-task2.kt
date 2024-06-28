package lesson18

fun main() {
    val dice = listOf<Dice>(DiceFour(), DiceSix(), DiceEight())
    throwAllDice(dice)
}

abstract class Dice {
    open val numberFace: Int = 0
    abstract fun throwDice()
}

class DiceFour : Dice() {
    override val numberFace: Int
        get() = 4

    override fun throwDice() {
        val result = (1..numberFace).random()
        println("Брошен кубик с 4 гранями, выпало число $result")
    }
}

class DiceSix : Dice() {

    override val numberFace: Int
        get() = 6
    override fun throwDice() {
        val result = (1..numberFace).random()
        println("Брошен кубик с 6 гранями, выпало число $result")
    }
}

class DiceEight: Dice() {

    override val numberFace: Int
        get() = 8
    override fun throwDice() {
        val result = (1..numberFace).random()
        println("Брошен кубик с 8 гранями, выпало число $result")
    }
}

fun throwAllDice(dice: List<Dice>) {
    dice.forEach { it.throwDice() }
}