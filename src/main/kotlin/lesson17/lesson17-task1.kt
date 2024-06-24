package lesson17

fun main() {

    val quiz = Quiz("Вопрос", "Ответ")
    println(quiz.getQuestion)
    println(quiz.getSetAnswer)
    quiz.getSetAnswer = "Ответ2"
    println(quiz.getSetAnswer)

}

class Quiz(
    private val question: String,
    private var answer: String,
){

    val getQuestion: String
        get() {return question}

    var getSetAnswer: String
        get() {return answer}
        set(value) {answer = value}
}