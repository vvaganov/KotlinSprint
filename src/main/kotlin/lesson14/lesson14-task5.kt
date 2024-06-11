package lesson14

fun main() {

    val chat = Chat()
    chat.addMessage(1, "Василий", "Привет мир")
    chat.addMessage(2, "Петр", "Привет новый мир")
    chat.addThreadMessage(1, "Юрий", "И тебе тоже привет Василий", 1)
    chat.addThreadMessage(2, "Антон", "И тебе тоже привет Петр", 2)
    chat.addThreadMessage(3, "Витек", "От Витька тоже привет", 1)

    chat.printChat()


}

class Chat(
    val message: MutableList<Message> = mutableListOf()
) {
    fun addMessage(id: Int, author: String, text: String) {
        message.add(Message(id, author, text))
    }


    fun addThreadMessage(id: Int, author: String, text: String, parentMessageId: Int) {
        val getMessage = message.first { it.id == parentMessageId }
        getMessage.childMessageList.add(ChildMessage(id, author, text, parentMessageId))
    }

    fun printChat() {

        for (i in message) {
            println("${i.author}: ${i.text} ")
            for (j in i.childMessageList) {
                println("\t ${j.author}: ${j.text}")
            }
        }
    }
}

open class Message(
    val id: Int,
    val author: String,
    val text: String,
    val childMessageList: MutableList<ChildMessage> = mutableListOf()
) {}

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text) {}