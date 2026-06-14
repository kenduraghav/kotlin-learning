package challenge2

import challenge2.java.DummyClass

fun main(){

    //1.Declare two non-null floating variables.
    //2.Change to nullable variables
    val aFloatValue: Float? = -3847.384f

    val anotherFloatValue = -3847.384f
    val floatVal: Float? = (-3947.384).toFloat()

    //3. make a non-nullable array of shorts of size (5) and values with 1,2,3,4,5
    val shortArray = shortArrayOf(1,2,3,4,5)

    //4. initialize a nullable int array with values 5,10,15,... until 200
    val intArray: Array<Int?>  = Array(40) { i ->  (i+1)*5 }
    intArray.forEach { println(it) }

    //5. initialize a char array with values 'a','b','c' and call
    //java method and pass the char array as parameter.
    val charArray = charArrayOf('a','b','c','d','e')
    DummyClass().method1(charArray)

    //6. given a string type nullable, if string
    //is not null, change to lowercase,and assign to another string, otherwise print a default value
    val aStr: String? = "Hello World"
    val message = aStr?.lowercase() ?: "hello"
    println(message)

    //7.use the let function to lowercase and replace the string
    aStr?.let { println(it.replace("World","kotlin").lowercase()) }

    //8. assert a variable is non-null
    val anInt: Int? = null
    anInt!!.toDouble()
}