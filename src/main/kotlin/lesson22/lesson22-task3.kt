package lesson22

fun main() {

    val car = Car("Vaz", "Priora", 6549516956465416)
    val(brand, model, winNumber) = car
    println(brand)
    println(model)
    println(winNumber)

}

data class Car(
    val brand:String,
    val model:String,
    val winNumber: Long,
)