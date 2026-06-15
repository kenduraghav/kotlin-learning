package oops

import java.lang.reflect.Constructor

data object MySingleton

fun main(){

    val evilTwin = createInstanceViaReflection()
    println(MySingleton)

    println(evilTwin)

    println(MySingleton == evilTwin)

    // Don't compare data objects using ===  this returns false
    println(MySingleton === evilTwin)
}

fun createInstanceViaReflection(): MySingleton {
    return (MySingleton.javaClass.declaredConstructors[0].apply { isAccessible = true } as Constructor<MySingleton>).newInstance()

}
