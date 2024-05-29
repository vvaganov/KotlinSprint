import kotlin.random.Random

fun main() {

    val minPasswordLength = 6

    do {
        println("Задайте количество символов в пароле:")
        val passwordLength = readln().toInt()
        if (passwordLength >= minPasswordLength) {
            val listChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
            val password = (1..passwordLength).map { listChars.random() }.joinToString("")
            println(password)
        } else {
            println("Символов должно быть не меньше $minPasswordLength")
        }
    } while (passwordLength < minPasswordLength)

}







