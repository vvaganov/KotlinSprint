package lesson18

fun main() {
    val dice = listOf<Dice>(DiceFour(4), DiceSix(6), DiceEight(8))
    throwAllDice(dice)
}

abstract class Dice {
    abstract val numberFace: Int
    abstract fun throwDice()
}

class DiceFour(
    override val numberFace: Int,
) : Dice() {

    override fun throwDice() {
        val result = (1..numberFace).random()
        println("Брошен кубик с 4 гранями, выпало число $result")
    }
}

class DiceSix(
    override val numberFace: Int,
) : Dice() {

    override fun throwDice() {
        val result = (1..numberFace).random()
        println("Брошен кубик с 6 гранями, выпало число $result")
    }
}

class DiceEight(
    override val numberFace: Int,
) : Dice() {

    override fun throwDice() {
        val result = (1..numberFace).random()
        println("Брошен кубик с 8 гранями, выпало число $result")
    }
}

fun throwAllDice(dice: List<Dice>) {
    dice.forEach { it.throwDice() }
}