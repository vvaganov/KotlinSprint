package lesson13

fun main() {
    val contactList: MutableList<PhoneBook> = mutableListOf(
        PhoneBook("Василий", 89022783658),
        PhoneBook("Иван", 89275685425),
        PhoneBook("Евгений", 89996931476, "null"),
        PhoneBook("Анатолий", 89537648231, "Камаз"),
        PhoneBook("Михаил", 79097596452, "Газпром"),
        PhoneBook("Михаил", 79097596452, "Газпром"),
    )

    val companyList = contactList.map { it.company }.filterNotNull().toSet()
    println(companyList)
}

class PhoneBook(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null
) {

    fun printContact() {
        company = company ?: "не указано"
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company ")
        println("_______________________")
    }
}