fun main() {
    val gamer = Gamer("Bob", 6, 3)
    println( gamer.getHealth())
    gamer.takeDamage(3)
    println(gamer.getHealth())
    gamer.restoreHealth()
    println(gamer.getHealth())
    gamer.takeDamage(3)
    println(gamer.getHealth())
    gamer.restoreHealth()
    println(gamer.getHealth())
    gamer.takeDamage(3)
    gamer.restoreHealth()
    }

class Gamer(
    val name: String = "",
    private var health: Int,
    private var impactForce: Int,

) {

    private var isRestoreHealth = true

    fun getHealth() = health

    fun restoreHealth() {
        if (isRestoreHealth) {
            health++
        }
    }

    fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0){
            death()
        }
    }

    private fun death() {
        impactForce = 0
        isRestoreHealth = false
        println("$name умер: сила удара равна $impactForce, возможность лечиться $isRestoreHealth")
    }
}