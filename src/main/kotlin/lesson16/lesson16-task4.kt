package lesson16

fun main() {
    val order1 = Order(1)

    println("Заказ ${order1.orderNumber}, статус: ${order1.getStatus()}")

    changeOrderStatus(order1, "Готовится")

    println("Заказ ${order1.orderNumber}, статус: ${order1.getStatus()}")
}

class Order(
    val orderNumber: Int,
    private var orderStatus: String = "Приянт"
) {
    fun getStatus() = orderStatus

    fun changeStatus(orderStat: String) {
        orderStatus = orderStat
    }
}

fun changeOrderStatus(order: Order, orderStat: String) {
    order.changeStatus(orderStat)
}