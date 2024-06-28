package lesson18

fun main() {

    val screen = Screen()
    screen.draw(Circle(10,20,50))
    screen.draw(Point(10.5f, 30.2f))
    screen.draw(Square(20.3, 30.5, 50, 70))
}

class Circle(
    var x: Any,
    var y: Any,
    var r: Any,
) {}

class Square(
    var x1: Any,
    var y1: Any,
    var x2: Any,
    var y2: Any,
) {}

class Point(
    var x: Any,
    var y: Any,
)

class Screen {

    fun draw(square: Square) {
        println("Нарисовать квадрат c координатами: x1 - ${square.x1}, y1 - ${square.y1}, x2 - ${square.x2}, y2 - ${square.y2}")
    }

    fun draw(circle: Circle) {
        println("Нарисовать точку c координатами центра: x - ${circle.x}, y - ${circle.y}, радиус ${circle.r}")
    }

    fun draw(point: Point) {
        println("Нарисовать круг с координатами: x - ${point.x}, y - ${point.y}")
    }
}