import kotlin.random.Random

fun main() {

    val minPasswordLength = 6
    var password: MutableList<Char> = mutableListOf()
    var passwordLength: Int
    val digits = '0'..'9'
    val lowercaseLetters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'
    var allChars: List<Char>
    password.add(digits.random())
    password.add(lowercaseLetters.random())
    password.add(uppercaseLetters.random())
    val passwordRequiredChar = password.size
    var listRandomChar: List<Char>

    do {
        println("Задайте количество символов в пароле:")
        passwordLength = readln().toInt()
        if (passwordLength >= minPasswordLength) {
            allChars = (uppercaseLetters) + (lowercaseLetters) + (digits)
            listRandomChar = (1..(passwordLength - passwordRequiredChar)).map { allChars.random() }
            password = password.plus(listRandomChar).toMutableList()
            password.shuffle()
            println(password.joinToString(""))
        } else {
            println("Символов должно быть не меньше $minPasswordLength")
        }
    } while (passwordLength < minPasswordLength)
}