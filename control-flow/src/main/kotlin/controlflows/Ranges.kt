package controlflows

fun String.times(n: Int) = repeat(n)

fun main() {

    val range = 1..5
    range.forEach { print("$it ") }

    lineBreak()

    for (i in 0 until range.count()) {
        print("$i ")
    }
    lineBreak()
    for (i in 0.rangeTo(20) step 2) {
        print("$i ")
    }
    lineBreak()
    println((1..10).filter { it % 2 == 0 })

    for (i in 20 downTo 0 step 2) {
        print("$i ")
    }
}

fun lineBreak(){
    println()
    println("=".times(30))
}