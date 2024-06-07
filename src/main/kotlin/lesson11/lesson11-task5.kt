

fun main() {
    val forum = Forum()
    forum.createNewUser("Вася")
    forum.createNewUser("Петя")
    forum.createNewUser("Коля")

    forum.createMessage(0, "Сообщение - 1" )
    forum.createMessage(1, "Сообщение - 1")
    forum.createMessage(0, "Сообщение - 2")
    forum.createMessage(1, "Сообщение - 2")
    forum.createMessage(2, "Сообщение - 1")


    forum.printThread()
}

class Forum() {
    val userList: MutableList<ForumMember> = mutableListOf()
    val messageList: MutableList<ForumMessage> = mutableListOf()
    var value = 0

    fun createNewUser(name: String): ForumMember {
        val id = value++
        val newMember = ForumMember()
        newMember.userId = id
        newMember.userName = name
        userList.add(newMember)
        return newMember
    }

    fun createMessage(id: Int, message: String) {
        val newMessage = ForumMessage()
        for (i in userList) {
            if (i.userId == id) {
                newMessage.authorId = id
                newMessage.message = message
                messageList.add(newMessage)
            }
        }
    }

    fun printThread() {
        for (i in messageList) {
            println("${userList[i.authorId].userName} - ${i.message}")
        }
    }
}
class ForumMember() {
    var value = 0
    var userId: Int = 0
    var userName: String = ""
}

class ForumMessage() {
    var authorId: Int = 0
    var message: String = ""
}