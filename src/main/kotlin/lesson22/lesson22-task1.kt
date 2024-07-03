package lesson22

fun main() {

    val regBook = RegularBook("Book", "Author")
    val regBook1 = RegularBook("Book", "Author")

    val dataBook = DataBook("Book", "Author")
    val dataBook1 = DataBook("Book", "Author")

    println(regBook == regBook1) // У обычных классов сравниваются ссылки на объект поэтому результат false
    println(dataBook == dataBook1) // У дата классов сравниваются данные объектов, поэтому True, что бы сравнить ссылки нужно использовать ===

}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)