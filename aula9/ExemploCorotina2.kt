import kotlinx.coroutines.*

fun main() = runBlocking {
     launch {
         delay(2000)
         println("Olá Corotina")
     }
    println("Fora corotina")
}