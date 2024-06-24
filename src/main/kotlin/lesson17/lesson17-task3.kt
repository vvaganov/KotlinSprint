package lesson17

fun main() {
    val folder = Folder()
    println(folder.name)

}

class Folder {

    val name: String = "Projects"
        get() = if (isSecret) {
            "Скрытая папка, количесто файов $numberFiles"
        } else "Папка $field, количество файлов $numberFiles "

    private val numberFiles: Int = 20
        get() = if (isSecret) 0 else field

    private val isSecret = true
}