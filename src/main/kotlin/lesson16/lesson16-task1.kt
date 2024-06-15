package lesson16

fun main() {
    val cube = Cube()
    println(cube.getNumber())

}

class Cube() {
    private val range = 1..6
    private var number = range.random()

    fun getNumber(): Int {
        return number
    }
}