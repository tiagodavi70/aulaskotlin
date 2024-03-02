
fun main() {

    println("Olá mundo!")

    var numero: Int = 1
    var flutuante: Float = 1.2f
    var duplo: Double = 2.3

    val numeroImutavel: Int = 4

    numero = 2

    println(numero)
    println("O número inteiro é $numero")
    println("O sucessor é ${numero + 1}")

    print("Entre com o texto: ")
//    var entradaTexto: String = readln().toInt()
    var entradaTexto: String? = readLine()
    var entradaNumero: Int? = readLine()?.toInt()

    println("Texto de entrada: $entradaTexto")
}