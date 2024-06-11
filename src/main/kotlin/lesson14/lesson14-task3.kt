package lesson14

const val PI = 3.14
const val BLACK_COLOR = "black"
const val WHITE_COLOR = "white"

fun main() {
    val listFigure = listOf(
        (Circle(BLACK_COLOR, 15)),
        (Circle(WHITE_COLOR, 20)),
        (Circle(BLACK_COLOR, 25)),
        (Rectangle(WHITE_COLOR, 15, 10)),
        (Rectangle(BLACK_COLOR, 10, 30)),
        (Rectangle(WHITE_COLOR, 20, 10))
    )

    println(
        "Сумма периметров всех черных фигур ${
            listFigure.filter { it.color == "black" }.sumOf { it.getThePerimeterOfTheFigure() }
        }"
    )
    println(
        "Сумма площадей у всех белых фигур: ${
            listFigure.filter { it.color == "white" }.sumOf { it.getTheAreaOfTheFigure() }
        }"
    )
}

abstract class Figure {

    abstract val color: String
    abstract fun getTheAreaOfTheFigure(): Int
    abstract fun getThePerimeterOfTheFigure(): Int
}

class Circle(

    override val color: String,
    val radius: Int
) : Figure() {
    override fun getTheAreaOfTheFigure(): Int {
        return ((radius * radius) * PI).toInt()
    }

    override fun getThePerimeterOfTheFigure(): Int {
        return ((PI * 2) * radius).toInt()
    }

}

class Rectangle(
    override val color: String,
    val weight: Int,
    val height: Int,
) : Figure() {
    override fun getTheAreaOfTheFigure(): Int {
        return weight * height
    }

    override fun getThePerimeterOfTheFigure(): Int {
        return (weight + height) * 2
    }
}