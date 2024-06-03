package lesson10

fun main() {

    val length = 4
    println("Придумайте логин:")
    val login = readln()
    println("Придумайте пароль:")
    val password = readln()
    if (checkTheLength(login, length) || checkTheLength(password, length)) {
        println("Логин или пароль не достаточно длинные")
    } else {
        println("Регистрация пройдена успешно")
    }
}

fun checkTheLength(meaning: String, length: Int): Boolean {
    return meaning.length < length
}