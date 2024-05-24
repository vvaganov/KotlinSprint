package lesson5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
    println("Введите имя пользователя:")
    val userName = readln()
    if (userName == USER_NAME) {
        println("Для авторизации введите пароль")
        val password = readln()
        if (password == USER_PASSWORD) {
            println("Пароль верный. Добро пожаловать $userName!!!")
        } else {
            println("Пароль не верный, повторите вход заново!")
        }
    } else {
        println("Пользователь с таким именем не найден, пожалуйста зарегистрируйтесь!")

    }
}