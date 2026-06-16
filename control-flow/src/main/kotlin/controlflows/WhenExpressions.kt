package controlflows

fun main() {
    val userRole = "Editor"
    checkUserRoleAccess(userRole)

    val testInput = "ID-98345"
    println("Is valid ID? ${hasPrefix(testInput)}")

    println("Check In Range using when expression.\nEnter some number btw 1 to 50:")
    val num :Int = readln().toInt()
    checkInRange(num)

    whenExpressionWithoutSubject(localFileSize = 1200, remoteFileSize = 1200)
}

fun checkUserRoleAccess(userRole: String) {
    when (userRole) {
        "Viewer" -> println("User has read-only access")
        "Editor" -> println("User can edit content")
        else -> println("User role is not recognized")
    }
}

fun checkInRange(num: Int){
    val validNumbers = setOf(15,16,17,18,19,20,21,22,23,24,25)
    when (num){
        in 1..10 -> println("num is between 1 and 10")
        in validNumbers -> println("num is valid")
        !in 10..50 -> println("num is outside the range")
        else -> println("none of the above")
    }
}

fun hasPrefix(input: Any): Boolean = when (input) {
    is String -> input.startsWith("ID-")
    else -> false
}


fun whenExpressionWithoutSubject(localFileSize: Int, remoteFileSize: Int){

    val message = when {
        localFileSize > remoteFileSize -> "Local file is larger than remote file"
        localFileSize < remoteFileSize -> "Local file is smaller than remote file"
        else -> "Local and remote files are the same size"
    }

    println("When Expression without subject: $message")
}