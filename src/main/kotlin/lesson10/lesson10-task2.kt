package lesson10

fun main() {
    println("Придумайте логин:")
    val login = readln()
    println("Придумайте пароль:")
    val password = readln()
    checkTheLength(login, password)
}

fun checkTheLength(login: String, password: String) {
    if (login.length < 4 || password.length < 4) {
        println("Логин или пароль не достаточно длинные")
    } else {
        println("Вы успешно прошли регистрацию!")
    }
}