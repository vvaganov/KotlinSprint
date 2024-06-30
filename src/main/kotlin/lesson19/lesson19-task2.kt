package lesson19

fun main() {

    val productList = listOf(
        Product(1, Category.OFFICE_SUPPLIES),
        Product(2, Category.DIFFERENT),
        Product(3, Category.CLOTHES)
    )

    productList.forEach { it.getProductInfo() }
}

enum class Category {
    CLOTHES,
    OFFICE_SUPPLIES,
    DIFFERENT,
}

fun getCategory(category: Category): String {
    return when (category) {
        Category.CLOTHES -> "Одежда"
        Category.OFFICE_SUPPLIES -> "Канцелярские товары"
        Category.DIFFERENT -> "Разное"
    }
}

class Product(
    private val id: Int,
    private val category: Category,
) {
    fun getProductInfo() {
        println("Товар id - $id, категория - ${getCategory(category)}")
    }
}