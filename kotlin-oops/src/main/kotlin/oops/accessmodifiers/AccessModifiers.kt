package oops.accessmodifiers

import oops.constructors.Employee1
import oops.constructors.Employee3

val MY_CONSTANT="This is a constant in kotlin defined at toplevel"
val LINE_BREAK = "=========================="

fun main(){

    println("Printing Constant\n =============")
//    println(MY_CONSTANT)

    val emp = Employee()
//    println(emp);
//    println(LINE_BREAK)

    val emp3 = Employee3("Raghav")
    println("Employee 3")
    emp3.salary = 5000.0
    println(emp3)
    val emp4 = Employee3("Raghav")
    println(emp4)
    println("Does it equal? ${emp3 == emp4  }")
    println(LINE_BREAK)

    val employee3 = Employee3("John",fullTime = false)
    employee3.salary = 2500.0
//    println("Employee 3")
//    println(employee3)
//    println(LINE_BREAK)


    val employee1 = Employee1("Raghav")
//    println("Employee 1 with fullTIme as Default")
//    println(employee1.firstName)
//    println(employee1.fullTime)
//    println(LINE_BREAK)

    var anotherEmployee1 = Employee1("Charles", false)
//    println("Another Employee 1 with fullTIme as false")
//    println(anotherEmployee1.firstName)
//    println(anotherEmployee1.fullTime)
//    println(LINE_BREAK)


    println("Printing Data Class")
    println(LINE_BREAK)
    val car = Car("white","BMW", 2019)
    println("Car1: $car")
    val car2 = Car("white","BMW", 2019)
    println("Car2: $car2")
    println("Is both car1 and car2 are same? ${car == car2}")
    val car3 = car.copy(year=2020, color="Black")
    println("New Model copied from car instance: $car3")
}

data class Car(val color: String, val model: String, val year: Int)

private class Employee {}

