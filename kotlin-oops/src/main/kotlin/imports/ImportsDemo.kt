package imports

import functions.Employee
import functions.appendNewLine
import functions.execute
import functions.printAllEmployeesName
import functions.sayHelloWithNamedArguments as sayHello
import oops.Product

fun main(){

    val result  = sayHello(lastName="Smith", firstName="John")
    println(result)


    println(Product.KEYBOARD.getInventory())

    val sb = StringBuilder("Imports from package, different module")
        .appendNewLine().append("Using Kotlin")
    .appendNewLine()

    println(sb.toString())

    execute {
        println("checking inline function from functions module")
    }

    val employee = Employee("John", "Smith")
    println(employee.getFullName())

    val employee2 = Employee("Mary","Williams")
    val employee3  = Employee ("Henry","Johnson")

    val empArray = arrayOf(employee, employee2, employee3)

    printAllEmployeesName(*empArray, label="Employees list from another module")
}