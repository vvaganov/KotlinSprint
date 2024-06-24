package lesson10

fun main() {

    println("Введите длинну пароля:")
    val passwordLength = readln().toInt()
    val password = getRandomPassword(passwordLength)
    println(password)
}

fun getRandomPassword(passwordLength: Int): String {
    val symbol: List<Char> = listOf('!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', ' ', '\'')
    val digits = '0'..'9'
    val password = ArrayList<Char>(passwordLength)
    for (index in 0 until passwordLength) {
        if (index % 2 == 0) {
            password.add(digits.random())
        } else {
            password.add(symbol.random())
        }
    }
    return password.joinToString("")
}


