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
    val messageList: MutableList<Message> = mutableListOf(),
    val childMessageList: MutableList<ChildMessage> = mutableListOf()
) {

    fun addMessage(id: Int, author: String, text: String) {
        messageList.add(Message(id, author, text))
    }

    fun addThreadMessage(id: Int, author: String, text: String, parentMessageId: Int) {
        childMessageList.add(ChildMessage(id, author, text, parentMessageId))


    }

    fun printChat() {
        val groupMessage = messageList.groupBy { it.id }
        val groupedChildMessage = childMessageList.groupBy { it.parentMessageId }

        for (i in groupMessage){
            val a = i.key
            println(a)
            for (j in groupedChildMessage){
                val b = j.key

            }
        }



//        println(groupMessage)
//        println(groupedChildMessage)

//        for (i in messageList) {
//            println("${i.author}: ${i.text} ")
//            for (j in groupedChildMessage) {
//                println("\t ${j.}: ${j.text}")
//            }
//        }
    }
}

open class Message(
    val id: Int,
    val author: String,
    val text: String,
    )

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text)