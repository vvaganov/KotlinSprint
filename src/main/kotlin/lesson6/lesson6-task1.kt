fun main() {

    print("Придумайте логин: ")
    val loginIn = readln()
    print("Придумайте пароль :")
    val passwordIn = readln()

    do {
        print("Для авторизации введите логин :")
        val login = readln()
        print("Введите пароль :")
        val password = readln()
    } while ((login != loginIn) || (password != passwordIn))

    println("Авторизация прошла успешно!")

}