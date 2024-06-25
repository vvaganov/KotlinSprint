package lesson17

fun main() {
    val folder = Folder()
    println("Папка - ${folder.name}")
    println("Количество файлов - ${folder.numberFiles}")
}

class Folder {

    val name: String = "Projects"
        get() = if (isSecret) "Скрытая папка" else field

    val numberFiles: Int = 20
        get() = if (isSecret) 0 else field

    private val isSecret = true
}