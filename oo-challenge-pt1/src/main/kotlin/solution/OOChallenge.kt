package solution

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription(){
      println("Bike is in gear $gear with cadence of $cadence " +
            "travelling at the speed of $speed.")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int) :
    KotlinBicycle(cadence, speed, gear) {

    var color: String = "black"

    companion object  {
        private val listOfColors = listOf("red", "green", "blue","white","brown","black")

        fun getAvailableColors() : List<String>  = listOfColors
    }

    constructor(color: String, seatHeight: Int, cadence: Int,speed: Int, gear: Int) :
            this(seatHeight,cadence, speed, gear) {
        this.color = color
        println("The Mountain Bike color is $color")
    }

    override fun printDescription(){
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int) :
    KotlinBicycle(cadence, speed, gear) {

    override fun printDescription(){
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}


fun main() {

//    val kotlinBicycle = KotlinBicycle(4,15)
//    val kotlinMountainBike = KotlinMountainBike("blue", 4,5,4, 4)
//    val kotlinRoadBike = KotlinRoadBike(15,5,10, 4)

//    kotlinBicycle.printDescription()
    println("Available Mountain Bike colors are: ${KotlinMountainBike.getAvailableColors()}")
//    kotlinRoadBike.printDescription()
}



