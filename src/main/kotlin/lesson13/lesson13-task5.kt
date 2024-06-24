
import java.lang.NumberFormatException

fun main() {

    val contactList: MutableList<MyPhoneNumber> = mutableListOf()
    println("Введите имя контакта:")
    val name = readln()
    try {
        println("Введите номер телефона:")
        val phone = readln().toLong()
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)

    }
    println("Введите компанию:")
    val company = readln()

}

class MyPhoneNumber(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null
) {
    fun printContact() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "не указано"}")
        println("_______________________")
    }
}