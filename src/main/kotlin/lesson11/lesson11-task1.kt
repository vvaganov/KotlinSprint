fun main() {

    val user1 = User(1, "user", password = "qwerty", email = "user@qwerty.com")
    val user2 = User(2, "user2", password = "asdfgh", email = "user2@asdfgh.com")
    println("Id: ${user1.id}, login: ${user1.login}, password: ${user1.password}, email: ${user1.email}")
    println("Id: ${user2.id}, login: ${user2.login}, password: ${user2.password}, email: ${user2.email}")

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String
)