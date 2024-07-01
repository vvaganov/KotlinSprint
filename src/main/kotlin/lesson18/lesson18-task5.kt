package lesson18

fun main() {

    val screen = Screen()
    screen.draw(Circle(51.2,25, 10))
    screen.draw(Point(10.5, 30.2))
    screen.draw(Square(20.3, 30.5, 50, 70))
}


class Circle<T: Number>(
    val x: T,
    val y: T,
    val r: T,
){}


class Square<T: Number>(
    var x1: T,
    var y1: T,
    var x2: T,
    var y2: T,
) {}

class Point<T: Number>(
    var x: T,
    var y: T,
)

class Screen {

    fun draw(square: Square<Number>) {
        println("Нарисовать квадрат c координатами: x1 - ${square.x1}, y1 - ${square.y1}, x2 - ${square.x2}, y2 - ${square.y2}")
    }

    fun draw(circle: Circle<Number>) {
        println("Нарисовать точку c координатами центра: x - ${circle.x}, y - ${circle.y}, радиус ${circle.r}")
    }

    fun draw(point: Point<Number>) {
        println("Нарисовать круг с координатами: x - ${point.x}, y - ${point.y}")
    }
}