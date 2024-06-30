package lesson20

fun main() {
    val player = Player();
    openDoor(player)
}

class Player() {
    val isAvailabilityKey: Boolean = false
}

val openDoor: (Player) -> Unit = { player: Player ->
    if (player.isAvailabilityKey) println("Игрок открыл дверь") else println("Дверь заперта")
}
