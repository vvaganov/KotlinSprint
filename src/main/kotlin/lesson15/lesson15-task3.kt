package lesson15

fun main() {

    val user1 = RegularUser()
    user1.writeMessage()
    user1.readMessage()
    println()
    val admin1 = Admin()
    admin1.writeMessage()
    admin1.readMessage()
    admin1.deleteMessage()
    admin1.deleteUser()
}

abstract class User {
    abstract fun writeMessage()
    abstract fun readMessage()
}

class Admin : User() {
    override fun writeMessage() {
        println("Админ пишет сообщение")
    }

    override fun readMessage() {
        println("Админ читает сообщение")
    }

    fun deleteMessage() {
        println("Админ удаляет сообщение")
    }

    fun deleteUser() {
        println("Админ удаляет пользователя")
    }
}

class RegularUser: User() {
    override fun writeMessage() {
        println("Пользователь пишет сообщение")
    }

    override fun readMessage() {
        println("Пользователь читает сообщение")
    }
}