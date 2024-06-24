package lesson16

private const val PI = 3.14

fun main() {
    val asd = Circle(10)
    println(asd.getLengthCircle())
    println(asd.getAreaCircle())
}

class Circle(
    private val radius: Int,
) {

    fun getAreaCircle(): Double {
        return PI * (radius * radius)
    }

    fun getLengthCircle(): Double {
        return 2 * PI * radius
    }
}