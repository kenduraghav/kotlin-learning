package oops

interface MYInterface {
    fun doSomething()

    fun doSomethingElse(){
        println("Do something else")
    }
}


class MyClass : MYInterface {
    override fun doSomething() {
        println("My Class do something")
    }
}

fun main() {
    val myInterface = MyClass()
    myInterface.doSomething()
    myInterface.doSomethingElse()
}