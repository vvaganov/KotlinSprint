package lesson20

fun main() {

    val gamer = Gamer("Bob", 5);
    println(gamer.health)
    restoreHealth(gamer)
    println(gamer.health)
}

class Gamer(
    val name: String,
    var health: Int,
) {
    val maxHealth: Int = 20
}

val restoreHealth: (Gamer) -> Unit = { gamer: Gamer -> gamer.health = gamer.maxHealth }



