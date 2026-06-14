package functions

const val LINE_BREAK = "==================="

fun StringBuilder.appendNewLine(): StringBuilder =
    append("\n")

fun main(){
    println(labelMultiply(3,5))

    val emp = Employee("John", "Doe")
    println(emp.getFullName())

    val emp2 = Employee("Mou","Mou")
    val emp3 = Employee("Mary", "George")

    val empArray = arrayOf(emp, emp2, emp3)

    printAllEmployeesName(*empArray, label="Employees List  Using varargs and spread operator")
    println(LINE_BREAK)
    println(sayHelloWithNamedArguments(lastName="Smith", firstName="John"))
    println(LINE_BREAK)

    val sb = StringBuilder("Using Extension function")
    sb.appendNewLine()
        .append("This line is printed in newline using extension function")
        .appendNewLine()
        .append(LINE_BREAK)
    println(sb.toString())
}

fun printAllEmployeesName(vararg employees: Employee, label: String) {
    println(label)
    println(LINE_BREAK)
    employees.forEach { println(it.getFullName()) }
}

fun sayHelloWithNamedArguments(firstName: String, lastName: String) = "Hello, $firstName $lastName"

fun labelMultiply(operand1: Int, operand2: Int,
                  label: String = "The result is:"): String
    = "$label ${operand1 * operand2}"


class Employee(val firstName: String, val lastName: String){

    fun getFullName() = "$firstName $lastName"
}