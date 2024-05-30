import kotlin.random.Random

fun main() {

    val minPasswordLength = 6
    var listChars: List<Char>
    var password: String
    var passwordLength: Int

    do {
        println("Задайте количество символов в пароле:")
        passwordLength = readln().toInt()
        if (passwordLength >= minPasswordLength) {
            listChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
            password = (1..passwordLength).map { listChars.random() }.joinToString("")
            println(password)
        } else {
            println("Символов должно быть не меньше $minPasswordLength")
        }
    } while (passwordLength < minPasswordLength)

}







