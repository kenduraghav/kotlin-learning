package oops.constructors

fun main(){
    val emp = Employee3("John")
    println(emp.firstName)
}

/*
=====================================================
Primary Constructor
=====================================================

- One primary constructor per class
- Multiple secondary constructors allowed
- Multiple init blocks allowed
- Constructor parameters are available in init blocks
*/

/*
Long way
*/
class Employee1 constructor(firstName: String) {
    val firstName: String
    var fullTime: Boolean = true
    init {
        this.firstName = firstName
    }

    //secondary constructor calls primary construcotr using  : this(firstName)
    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime
    }
}

/*
Shorter way
*/
class Employee2 constructor(firstName: String) {
    val firstName = firstName
}

/*
Idiomatic Kotlin
with custom getters and setters, kotlin properties and backing field
*/
class Employee3(val firstName: String,  fullTime: Boolean = true) {

    val fullTime: Boolean = fullTime
        get(){
            println("Using get() ")
            return field
        }

    var salary: Double = 0.0
        set(value){
            if(value > 1000){
                field = value
            }
        }

    val bonus: Double
        get() = salary / 10

    override fun toString(): String {
        return "Employee3(" +
                "firstName='$firstName', " +
                "fullTime=$fullTime, " +
                "salary=$salary, " +
                "bonus=$bonus)"
    }

}