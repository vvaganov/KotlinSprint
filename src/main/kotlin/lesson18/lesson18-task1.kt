package lesson18

fun main() {

    val order = Order()
    order.addOrder(1, listOf("Гвозди, молоток, пила, рубанок"))
    order.addOrder(2, "Вентилятор")

}

class Order {

    fun addOrder(
        numberOrder: Int,
        product: String,
    ) {
        println("Заказан товар: $product")
    }

    fun addOrder(
        numberOrder: Int,
        product: List<String>,
    ) {
        println("Заказаны товары: $product")
    }
}