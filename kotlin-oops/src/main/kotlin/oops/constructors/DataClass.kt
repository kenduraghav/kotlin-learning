package oops.constructors

data class User(val name: String , val email: String)


fun main(){
    val user  = User("John","john@mail.com")
    displayUser(user)
}

fun displayUser(user: User){
    val(name, email) = user
    println("Destructuring User details:\nUser name is $name and email is $email")
}