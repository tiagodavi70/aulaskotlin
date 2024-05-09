import kotlinx.coroutines.*

fun main() {
    val job = GlobalScope.launch {
        println("Olá corotinas")
    }

    runBlocking {
//        job.join()
        launch {
            job.start()
        }
    }
    println("Fora corotinas")
}