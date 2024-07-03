package lesson22

fun main() {

    val regBook = RegBook("Book", "Author")
    val datBook = DatBook("Book", "Author")

    println(regBook) // метод toString по умолчанию выовдит имя объекта, можно переопределить на свое усмотрение
    println(datBook) // в дата классе тот же метод toString реализован для вывода строки с данными объекта, так же можно переопределить

}

class RegBook(val name: String, val author: String)

data class DatBook(val name: String, val author: String)