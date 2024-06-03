package lesson10

const val LOGIN = "user"
const val PASSWORD = "qwerty"

fun main() {
    val basket = listOf<Any>("Картошка", "Морковь", "Свекла")
    val authorization = getBasket(getToken(LOGIN, PASSWORD))
    if (authorization) {
        println(basket.joinToString(", "))
    } else {
        println("Вы не прошли авторизацию")
    }
}

fun getToken(login: String, password: String): String? {
    if (login == LOGIN && password == PASSWORD) {
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
    } else {
        return null
    }
}

fun getBasket(token: String?): Boolean {
    var validation = false
    if (token != null) {
        validation = true
    }
    return validation
}