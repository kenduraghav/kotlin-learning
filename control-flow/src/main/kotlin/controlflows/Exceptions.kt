package controlflows

fun main(){

    printNotNullString("Hello")

    getStateValue()

    val num = try {
        count()
    }catch(e: ArithmeticException){
        -1
    } finally {
        println("finally")
    }
    println("Result: $num")
}

fun printNotNullString(str: String?){

    require(str != null, { "Value must not be null" })

    println("String with length of ${str.length}")
}

fun getStateValue(){

    var someState: String? = null

    fun getState() : String {
        val state = checkNotNull(someState) { "State must be set first"}
        check(state.isNotEmpty()) { "State should not be non-empty" }
        return state
    }

    //getState() // throws IllegalStateException

    someState=""

    //getState() //throws IllegalStateException
    someState="A state"

    println(getState())
}

fun count() : Int {
    val a = 0
    return 10/a
}