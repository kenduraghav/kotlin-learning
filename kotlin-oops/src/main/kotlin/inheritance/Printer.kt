package inheritance

abstract class Printer(val modelName: String) {



    fun printModel() = println("Model is: $modelName ")

    abstract fun print()
}

open class LaserPrinter(modelName: String) : Printer(modelName) {

    var ppm :Int = 0

    constructor(pagesPerMinute: Int, modelName: String) : this(modelName) {
        this.ppm = pagesPerMinute
        println("Main Laser Printer constructor")
    }

    override fun print() = println("Laser Printer $modelName, Prints pages per minute $ppm")
}

class InkJetPrinter(modelName: String) : Printer(modelName) {
    override fun print() = println("Ink Jet Print")
}



fun main() {

    val lp = LaserPrinter(modelName="HP LaserJet Printer", pagesPerMinute = 45)
    lp.printModel()
    lp.print()

    val inkJetPrinter = InkJetPrinter("Canon InkJetPrinter")
    inkJetPrinter.printModel()
    inkJetPrinter.print()
}