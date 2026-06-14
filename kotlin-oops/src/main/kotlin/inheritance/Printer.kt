package inheritance

abstract class Printer(val modelName: String) {

    fun printModel() = println("Model is: $modelName ")

    abstract fun print()
}

class LaserPrinter(modelName: String) : Printer(modelName) {
    override fun print() = println("Laser Print")
}

class InkJetPrinter(modelName: String) : Printer(modelName) {
    override fun print() = println("Ink Jet Print")
}


fun main() {

    val lp = LaserPrinter("HP LaserJet Printer")
    lp.printModel()
    lp.print()

    val inkJetPrinter = InkJetPrinter("Canon InkJetPrinter")
    inkJetPrinter.printModel()
    inkJetPrinter.print()
}