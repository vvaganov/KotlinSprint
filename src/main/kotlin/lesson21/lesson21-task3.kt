package lesson21

fun main() {
    val player = PlayerOne("Bob", 10)
    println(player.health)
    println(player.maxHealth)
    println(player.isHealthy(player))
    restoreHealth(player)
    println(player.health)
    println(player.maxHealth)
    println(player.isHealthy(player))

}

class PlayerOne(
    val name: String,
    var health: Int,
) {
    val maxHealth: Int = 20
}

val restoreHealth: (PlayerOne) -> Unit = { player: PlayerOne -> player.health = player.maxHealth }

fun PlayerOne.isHealthy(player: PlayerOne): Boolean {
    return player.health == player.maxHealth
}

