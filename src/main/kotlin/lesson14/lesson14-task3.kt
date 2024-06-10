package lesson14

const val PI = 3.14

fun main() {
    val listFigure: MutableList<Figure> = mutableListOf()
    listFigure.run {
        add(Circle("black", 15))
        add(Circle("white", 20))
        add(Circle("black", 25))
        add(Rectangle("white", 15, 10))
        add(Rectangle("black", 10, 30))
        add(Rectangle("white", 20, 10))
    }
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