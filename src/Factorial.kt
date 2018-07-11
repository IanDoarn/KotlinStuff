/*
* The factorial of a positive integer n
* is defined as the product of the sequence ,
* n-1, n-2, ...1 and the factorial of 0 is
* defined as being 1.
* */

import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    println("Enter a number: ")

    val n: Int = scanner.nextInt()

    println("Factorial of n = " + n + " is " + factorial(n))
}

fun factorial(n: Int) : Int {
    if(n == 0)
        return 1
    else
        return n * factorial(n - 1)
}