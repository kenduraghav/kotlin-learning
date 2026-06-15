package oops

import java.time.Year

object SingletonClass {

    val year: Year? = Year.now()

    fun getCopyrights() = "Copyrights \u00A9 $year reserved"
}

interface InterfaceA {
    fun aFunc() {
        println("InterfaceA.aFunc")
    }
}

interface InterfaceB {
    fun aFunc() {
        println("InterfaceB.aFunc")
    }
}

class PersonManager {

    private fun createPerson() = object {
        val name= "John"

        fun greet(){
            println("Hello, $name")
        }
    }

    fun getPerson(){
        createPerson().greet()
    }
}

fun main() {
    println(SingletonClass.getCopyrights())

    var count = 0

    val counter = object {
        fun increment() { count++}
    }
    counter.increment()
    println(count)

    val anObject = object: InterfaceA,InterfaceB {

        override fun aFunc() {
            super<InterfaceA>.aFunc()
            super<InterfaceB>.aFunc()
            println("Object Expression Implementation")
        }
    }

    anObject.aFunc()

    val person = PersonManager().getPerson()

}