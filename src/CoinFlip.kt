/**
 * Coin flip
 *
 * Takes user input for number of times
 * to flip going, prints number of times
 * heads and tails occurred and the
 * probability of the result
 */
import java.util.Random
import java.util.Scanner


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    var h: Int = 0
    var t: Int = 0

    println("Enter number of flips: ")

    val n: Int = scanner.nextInt()

    for (i in 1..n) {
        val f: Int = flip()

        if(f == 0)
            h++
        if(f == 1)
            t++
    }

    println("Count of results H: $h T: $t")
}

fun flip() : Int {
    return Random().nextInt(2)
}