package inheritance

open class Base(val name: String) {

    init { println( "Initializing a base class")}

    open val size: Int  =
        name.length.also { println("Initializing size in the base class $it") }

}

class Derived(name: String,
              val lastName: String
    ) :Base (name.replaceFirstChar { it.uppercase() } .also { println ("Arguments for the base class: $it") }){

    init { println("Initializing Derived class") }

    override val size: Int
        = super.size + lastName.length.also { println ("Initializing size in the dervied class $it") }

    val fullName: String get() = "$name $lastName"
}

fun main (){

    val derived  = Derived("John","Doe")
    println(derived.fullName)
    println(derived.size)
}