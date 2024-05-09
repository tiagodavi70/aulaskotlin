fun main() {
    val thread1 = Thread {
        println(" Olá concorrencia: ${Thread.currentThread().name}")
        Thread.sleep(5)
    }
    println("Fora da Thread: ${Thread.currentThread().name}")
    thread1.start()

//    thread1.join()
    for (i in 0..500) {
        print(" $i")
    }
    println()
    println(" Depois: ${Thread.currentThread().name}")
    println("Depois da Thread")
}