fun main() {
    val contact = PhoneDirectory("Василий", 79022783658, company = "")
    }

class PhoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {}