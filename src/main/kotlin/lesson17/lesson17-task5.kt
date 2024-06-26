package lesson17

fun main() {
    val user = User("login", "qwerty")
    println(user.getPassword)
    user.getPassword = "asdfgh"
    println(user.setLogin)
    user.setLogin = "login2"
    println(user.setLogin)

}

class User(
    private var login: String,
    private var password: String,
) {

    var getPassword: String
        get() = "*".repeat(password.length)
        set(value) = println("Вы не можете изменить пароль")

    var setLogin: String
        get() = login
        set(value) {
            login = value
            println("Вы успешно изменили логин")
        }
}