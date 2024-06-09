fun main() {
    val contact = PhoneList("Василий", 79022783658)
    contact.printContact()
}

class PhoneList(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null
) {
    fun printContact() {
        company = company?: "не заполнено"
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company ")
    }
}