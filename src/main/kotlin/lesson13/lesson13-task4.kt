fun main() {

    val contactList: MutableList<MyPhoneNumber> = mutableListOf()

    println("Введите имя контакта:")
    val name = readln()
    println("Введите номер телефона:")
    val phoneNumber = readln().toLongOrNull()
    println("Введите компанию:")
    val company = readln()
    if (phoneNumber == null) {
        println("Вы не ввели номер телефона")
    } else {
        contactList.add(MyPhoneNumber(name, phoneNumber, company))
    }
    contactList.forEach { it.printContact() }

}

class MyPhoneNumber(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null
) {
    fun printContact() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company ")
        println("_______________________")
    }
}