package lesson10

const val LOGIN = "user"
const val PASSWORD = "qwerty"
val BASKET: MutableList<Any> = mutableListOf("Молоко", "Хлеб", 1)

fun main() {

    val token = authorization(LOGIN, PASSWORD)
    println(getBasket(token))

}

fun authorization(login: String, password: String): String? {
    return if (login == LOGIN && password == PASSWORD) {
        getToken()
    } else {
        null
    }
}

fun getToken(): String {
    var token: MutableList<Char> = mutableListOf()
    val tokenLength = 32
    val digits = '0'..'9'
    val lowercaseLetters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'
    val allChars = digits + lowercaseLetters + uppercaseLetters
    token.add(digits.random())
    token.add(lowercaseLetters.random())
    token.add(uppercaseLetters.random())
    token = (token + (1..(tokenLength - token.size)).map { allChars.random() }).shuffled().toMutableList()
    return token.joinToString("")
}

fun getBasket(token: String?): Any {
    return if (token != null) {
        BASKET
    } else {
        println("Вы не авторизованы")
    }
}