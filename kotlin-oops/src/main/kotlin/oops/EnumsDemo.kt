package oops

enum class Product(val quantity: Int) {

    LAPTOP(10),
    MOBILE(100),
    MOUSE(15),
    KEYBOARD(20);

    fun getInventory() = "%-15s %15d".format(name, quantity)
}

fun main(){
    println(getHeaders())
    Product.entries.forEach {
        println(it.getInventory())
    }
}

private fun getHeaders(): String = """
    %-15s %15s
    --------------------------------
""".trimIndent().format("Product", "Quantity")