package oops

sealed interface ApiResponse

data class Success(
    val body: String
) : ApiResponse

data class Error(
    val reason: String
) : ApiResponse

data object Timeout : ApiResponse
data object Unauthorized : ApiResponse

fun callApi(simulate: Int): ApiResponse =
    when (simulate) {
        1 -> Success("User details received")
        2 -> Error("Invalid request")
        3 -> Timeout
        else -> Unauthorized
    }

fun handleResponse(response: ApiResponse) =
    when (response) {
        is Success ->
            println("Success: ${response.body}")

        is Error ->
            println("Error: ${response.reason}")

        Timeout ->
            println("Request timed out")

        Unauthorized ->
            println("Authentication failed")
    }

fun main() {
    val response1 = callApi(1)
    val response2 = callApi(2)
    val response3 = callApi(3)
    val response4 = callApi(4)

    handleResponse(response1)
    handleResponse(response2)
    handleResponse(response3)
    handleResponse(response4)
}
