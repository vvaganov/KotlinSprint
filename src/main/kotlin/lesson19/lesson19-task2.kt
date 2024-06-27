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
    CLOTHES {
        override fun gettextName(): String {
            return "Одежда"
        }
    },
    OFFICE_SUPPLIES {
        override fun gettextName(): String {
            return "Канцелярские товары"
        }
    },
    DIFFERENT {
        override fun gettextName(): String {
            return "Разное"
        }
    };

    abstract fun gettextName(): String
}

class Product(
    private val id: Int,
    private val category: Category,
) {
    fun getProductInfo() {
        println("Товар id - $id, категория - ${category.gettextName()} ")

    }
}