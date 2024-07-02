package lesson21

fun main() {
    val player = PlayerOne("Bob", 10)
    println(player.health)
    println(player.maxHealth)
    println(player.isHealthy())
    restoreHealth(player)
    println(player.health)
    println(player.maxHealth)
    println(player.isHealthy())

}

class PlayerOne(
    val name: String,
    var health: Int,
) {
    val maxHealth: Int = 20
}

val restoreHealth: (PlayerOne) -> Unit = { player: PlayerOne -> player.health = player.maxHealth }

fun PlayerOne.isHealthy(): Boolean {
    return this.health == this.maxHealth
}