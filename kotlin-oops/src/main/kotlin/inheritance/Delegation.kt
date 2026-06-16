package inheritance

interface Worker {
    fun work()
    fun onVacation()
}


class Developer: Worker {
    override fun work() { println ("Developer is Writing code")}

    override fun onVacation() {
        println("On Vacation")
    }
}


class Manager(private val worker: Worker) : Worker by worker{

    override fun onVacation(){
        println("Manager is on vacation for 365 days")
    }
}

fun main(){
    val manager = Manager(Developer())
    manager.work()
    manager.onVacation()
}