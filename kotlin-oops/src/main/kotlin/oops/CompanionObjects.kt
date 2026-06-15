package oops

class MyUser private constructor(val name: String) {


    companion object Factory {
        @JvmStatic
        fun create(name: String): MyUser = MyUser(name)
    }

    fun greet(){
        println("Hello, $name")
    }

}

class Person {
    companion object  Named {
        fun show(): String = "Person1's Named companion object"
    }
}

class Person2 {
    companion object {
        fun show(): String  = "Person2's companion object "
    }
}

val reference1 = Person
val reference2 = Person2



class Employee(val name: String) {
    companion object {
        private val defaultGreeting = "Hello"
    }

    fun sayHi() {
        println("$defaultGreeting $name")
    }
}



fun main(){

    println(reference1.show())
    println(reference2.show())

    println("Using Companion Objects - similar to static methods in java ")
    MyUser.create("John Smith").greet()

    MyUser.create("Jane Smith").greet()
//    println("User1 ${user.name}")
//    println("User2 ${user2.name}")

    Employee("Nick").sayHi()
}