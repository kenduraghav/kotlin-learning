package controlflows

class UserNotFoundException(userId: Int): Exception ("User not found with id: $userId"){}

class UserService {

    fun findUserById(userId: Int):User {

        if(userId !in 1..5) throw UserNotFoundException(userId)

        return User("User$userId", "test")
    }
}

fun main(){

    val service = UserService()
    try{
        println("Search By User Id:")
        val userId = readln().toInt()
        val user = service.findUserById(userId)
        println("Found User Details with userId $userId: $user")
    } catch(e: UserNotFoundException){
        println(e.message)
    }

}