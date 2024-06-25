package lesson18

fun main() {
    val box = listOf<Box>(Cube(10), RectangularBox(10, 15, 30))
    getAreaAllBox(box)

}

abstract class Box {
    abstract val length: Int
    abstract fun getAreaBox()
}

class Cube(
    override val length: Int,
) : Box() {
    override fun getAreaBox() {
        println("Площадь посылки формы \"Куб\" - равна ${length * length * length}")
    }
}

class RectangularBox(
    override val length: Int,
    private val width: Int,
    private val height: Int
) : Box() {
    override fun getAreaBox() {
        println("Площадь посылки формы \"Прямоугольник\" равна ${length * width * height}")
    }
}

fun getAreaAllBox(list: List<Box>) {
    list.forEach { it.getAreaBox() }
}

