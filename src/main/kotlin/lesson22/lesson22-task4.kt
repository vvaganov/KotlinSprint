package lesson22

fun main() {

    val mainMod = MainScreenViewModel()
    mainMod.loadData("Какие то данные")

}

class MainScreenViewModel() {

    private var mainScreenState: MainScreenState = MainScreenState()

    fun loadData(data: String) {
        println("Данные отстутствуют")
        println("Идет процесс загрузки данных")
        val copy = mainScreenState.copy(data = data, isLoading = true)
        println("Загружены данные: ${copy.data}")
    }
}

data class MainScreenState(
    var data: String = "",
    var isLoading: Boolean = false
)