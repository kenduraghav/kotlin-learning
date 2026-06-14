package examples

fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("Both hello1 and hello2 are equal referentially? ${hello1 === hello2}")
    println("Both hello1 and hello2 are equal structurally? ${hello1 == hello2}")

    val anValue : Any = "Hello Kotlin"
    if(anValue is String) { println(anValue.uppercase()) }

    //print multi line string
    println("""|   1
         |  11
         | 111
         |1111""".trimMargin("|"))
}