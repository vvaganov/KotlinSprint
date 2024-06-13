package lesson15

fun main() {

    val user1 = User()
    user1.writeMessage()
    user1.readMessage()
    println()
    val admin1 = Admin()
    admin1.writeMessage()
    admin1.readMessage()
    admin1.deleteMessage()
    admin1.deleteUser()
}

abstract class Users {
    abstract val isWrite: Boolean
    abstract val isRead: Boolean
    abstract fun writeMessage()
    abstract fun readMessage()
}

class Admin(
    override val isWrite: Boolean = true,
    override val isRead: Boolean = true,
) : Users() {
    val isDeleteMessage: Boolean = true
    val isDeleteUser: Boolean = true
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

class User(
    override val isWrite: Boolean = true,
    override val isRead: Boolean = true,
) : Users() {
    override fun writeMessage() {
        println("Пользователь пишет сообщение")
    }

    override fun readMessage() {
        println("Пользователь читает сообщение")
    }
}