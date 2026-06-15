package oops

import java.time.Year

object SingletonClass {

    val year: Year? = Year.now()

    fun getCopyrights() = "Copyrights \u00A9 $year reserved"
}



fun main() {
    println(SingletonClass.getCopyrights())
}