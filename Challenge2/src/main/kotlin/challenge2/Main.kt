package challenge2

import challenge2.java.DummyClass

fun main() {
    println("OK")

    val myInt = 10

    var myLong = 20L

    myLong = myInt.toLong()
    println("myLong = $myLong")

    val names = arrayOf("John", "Alice", "Bob", "Charlie")

    println(names[1])

    val evenNumbers = Array(16) {i -> i*2}
    evenNumbers.forEach { println(it) }

    val mixedArray: Array<Any> = arrayOf("John",22,1L,'b')
    mixedArray.forEach { println(it) }
    println("==============")
    val intArray = intArrayOf(1,2,3,4,5)
    DummyClass().printNumbers(intArray)
    DummyClass().printNumbers(evenNumbers.toIntArray())
}