package challenge2.nullreferences

fun String.titleCase(): String {
    return split(" ").joinToString(" ") { word ->
        word.lowercase().replaceFirstChar(Char::titlecaseChar)
    }
}


fun main(){
    greet(null)
    greet ("Kotlin")
    sayHello(null)
    sayHello("Raghav")
    sayHelloForSure("raghav karthik")
    greetOrBeat(null)
    greetOrBeat("kotlin is simply super")
}

fun greet(str: String?){
    println("Hello ${str?.uppercase()}")
}

fun sayHello(name :String?){
    println("Hello,${name?.uppercase() ?: "World"}")
}

fun sayHelloForSure(name:String?){
    // throws npe if arg is null.
    println("Hello,${name!!.titleCase()}")
}

fun greetOrBeat(name : String?){
    name?.let {sayHelloForSure(it)} ?: sayHello(null)
}