fun main() {
    val user = User2(1, login = "user2", password = "qwerty", email = "user2@qwerty.com")
    user.setBio()
    user.changingThePassword()
    user.getUser()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {

    fun getUser() {
        println("Id: $id, login: $login, password: $password, email: $email, biography: $bio")
    }

    fun setBio() {
        println("Заполните информацию о себе:")
        val getBio = readln()
        bio = getBio
    }

    fun changingThePassword() {
        println("Введите пароль:")
        var getPassword = readln()
        if (getPassword == password) {
            println("Введите новый пароль")
            getPassword = readln()
            password = getPassword
            println("Пароль изменен")
        }
    }
}