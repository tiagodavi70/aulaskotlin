import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URI

fun main() = runBlocking {
    launch {
        val resultado = async {
            fetchDataFromUrl("https://jsonplaceholder.typicode.com/posts/1")
        }
        val texto = resultado.await()
        println(texto)
    }
    println("")
}

fun fetchDataFromUrl(url: String): String {
    val uri = URI.create(url)
    val connection = uri.toURL().openConnection() as HttpURLConnection
    connection.requestMethod = "GET"

    val responseCode = connection.responseCode
    return if (responseCode == HttpURLConnection.HTTP_OK) {
        connection.inputStream.bufferedReader().use {
            it.readText()
        }
    } else {
        "Error: $responseCode"
    }
}