package lesson18

fun main() {
    val dice = listOf<DiceFour>(DiceFour(), DiceSix(), DiceEight())
    throwAllDice(dice)
}

open class DiceFour{

    open fun throwDice(){
        val result = (1..4).random()
        println("Брошен кубик с 4 гранями, выпало число $result")
    }
}

class DiceSix: DiceFour(){

    override fun throwDice() {
        val result = (1..6).random()
        println("Брошен кубик с 6 гранями, выпало число $result")
    }
}

class DiceEight:DiceFour(){

    override fun throwDice() {
        val result = (1..8).random()
        println("Брошен кубик с 8 гранями, выпало число $result")
    }
}

fun throwAllDice(dice: List<DiceFour>){
    dice.forEach { it.throwDice() }
}