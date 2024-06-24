fun main() {
    var count = 3

    val contactList: MutableList<MyPhoneNumbers> = mutableListOf()

    for (i in 1..count) {
        println("Введите имя контакта:")
        val name = readln()
        println("Введите компанию:")
        val company = readln()
        println("Введите номер телефона:")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Вы не ввели номер телефона")
        } else {
            contactList.add(MyPhoneNumbers(name, phoneNumber, company))
        }
    }
    contactList.forEach { it.printContact() }
}

class MyPhoneNumbers(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null
) {
    fun printContact() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company ")
        println("_______________________")
    }
}