package functions

inline fun execute(block: () -> Unit) {
    println("Before")
    block()
    println("After")
}

fun main() {
    execute {
        println("Inside block using Inline function")
    }
}