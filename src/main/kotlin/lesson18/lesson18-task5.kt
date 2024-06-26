package lesson18

fun main() {

    val screen = Screen()
    screen.draw(10, 20, 30, 40)
    screen.draw(10, 20)
    screen.draw(15.3f, 20.5f)
}

class Circle {
    var x: Float = 0f
    var y: Float = 0f
}

class Square {
    var x1: Int = 0
    var y1: Int = 0
    var x2: Int = 0
    var y2: Int = 0
}

private class Point {
    var x: Int = 0
    var y: Int = 0
}

class Screen {

    fun draw(x1: Int, y1: Int, x2: Int, y2: Int) {
        val square = Square()
        square.x1 = x1
        square.y1 = y1
        square.x2 = x2
        square.y2 = y2
        println("Нарисовать квадрат c координатами x1 - $x1, y1 - $y1, x2 - $x2, y2 - $y2")
    }

    fun draw(x: Int, y: Int) {
        val point = Point()
        point.x = x
        point.y = y
        println("Нарисовать точку c координатами x - $x, y - $y")
    }

    fun draw(x: Float, y: Float) {
        val circle = Circle()
        circle.x = x
        circle.y = y
        println("Нарисовать круг с координатами x - $x, y - $y")
    }
}