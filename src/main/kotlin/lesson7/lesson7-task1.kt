import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var numberOfPairs = 3

    while (numberOfPairs > 0) {
        numberOfPairs--
        val randomInt = Random.nextInt(0..9)
        val randomChar = ('a'..'z').random()
        val password = "$randomChar$randomInt"
        print(password)
    }
}
