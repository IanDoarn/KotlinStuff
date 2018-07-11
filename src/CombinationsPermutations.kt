/**
 * Combinations and Permutations functions
 */
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Enter n:")

    val n: Int = scanner.nextInt()

    println("Enter r:")

    val r: Int = scanner.nextInt()

    println("Choose: 1) nPr 2) nCr")

    when(scanner.nextInt()) {
        1 -> println("$n P $r = " + npr(n, r))
        2 -> println("$n C $r = " + ncr(n, r))
        else -> return
    }
}

fun ncr(n: Int, r: Int) : Int {
    return when(n) {
        0 -> 0
        else -> (factorial(n) / (factorial(r) * factorial(n - r)))
    }
}

fun npr(n: Int, r: Int) : Int {
    return when(n) {
        0 -> 0
        else -> (factorial(n) / factorial(n - r))
    }
}

