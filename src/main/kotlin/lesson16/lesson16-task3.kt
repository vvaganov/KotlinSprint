package lesson16

fun main() {
    val password = readln()
    val user = Users()
    println(user.checkPassword(password))

}

class Users {
    val login = "login"
    private val password = "password"

    fun checkPassword(pass: String): Boolean {
        if (pass == password) {
            return true
        } else {
            return false
        }
    }
}
