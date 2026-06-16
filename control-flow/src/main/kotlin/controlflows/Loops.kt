package controlflows

import kotlin.random.Random

fun main(){

    val cities = arrayOf("Chennai", "Bengaluru", "Pune", "Trivandrum","Cochin")

    for (c in cities) {
        println(c)
    }
    lineBreak()
    for(index in cities.indices){
        println("${index+1}: ${cities[index]}")
    }
    lineBreak()
    val notInCities = "Noida" !in cities
    println("Is the city Noida not available in ${cities.contentToString()}?: $notInCities")
    lineBreak()
    rollDice()
}

fun rollDice(){
    var roll: Int
    do {
        roll = Random.nextInt(1, 7)
        println("Rolled a $roll")
    } while (roll != 6)
    println("Got a 6! Game over.")

}