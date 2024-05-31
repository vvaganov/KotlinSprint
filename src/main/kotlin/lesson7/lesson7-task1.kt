import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var numberOfPairs = 3
    var randomInt: Int
    var randomChar: Char

    while (numberOfPairs > 0) {
        numberOfPairs--
        randomInt = Random.nextInt(0..9)
        randomChar = ('a'..'z').random()
        val password = "$randomChar$randomInt"
        print(password)
    }
}
