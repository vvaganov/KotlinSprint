package lesson11

fun main() {

    val user1 = User("OneUser", "Avatar1")
    val user2 = User("TwoUser", "Avatar2")

    val room1 = Room("Programming", "urlCover")
    room1.addUser(user1)
    room1.addUser(user2)
    room1.updateTheStatus(user1.nikName, "разговаривает")
    room1.updateTheStatus(user2.nikName, "микрофон выключен")

    println("Обложка: ${room1.cover}")
    println("Название комнаты: ${room1.nameRoom}")
    println("Cписок участников:")
    for (i in room1.userList) {
        println("${i.avatar} - ${i.status}")
    }
}

class User(
    var nikName: String,
    val avatar: String,
    var status: String = "",
) {}

class Room(
    val nameRoom: String,
    val cover: String,
    val userList: MutableList<User> = mutableListOf()

) {

    fun addUser(user: User) {
        userList.add(user)
    }

    fun updateTheStatus(name: String, status: String) {
        for (i in userList) {
            if (i.nikName == name) {
                i.status = status
            }
        }
    }
}