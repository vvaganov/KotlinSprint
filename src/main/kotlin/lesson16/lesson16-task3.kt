package lesson16

fun main() {
    val user = User("admin", "qwerty")
    val password = readln()
    println(user.checkPassword(password))

}

class User(
    val login: String,
    private val password:String,
    ) {

    fun checkPassword(pass: String): Boolean = pass == password
    }

