package controlflows


data class Person(val name: String?)
fun main(){

    getPersonName(Person(null))
    getPersonName(Person("John"))

    foo()
    foo1()
}

fun getPersonName(person: Person){
    val name =  person.name?: return
    println("Person name is $name")
}


fun foo() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with explicit label")
}


fun foo1() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with implicit label")
}