// Escreva um programa em Kotlin que crie um array com 10 posições
// e receba seus valores do utilizador. Ao final deverá mostrar somente
// os valores acima da média.


// Saída
fun <T> printArr(arr: Array<T>) {
    println(arr.joinToString(prefix = "[", postfix = "]"))
}


fun main() {
    val tamanho: Int = 10
    val vetor: Array<Int> = Array<Int>(tamanho) {0}

    for (i in 0..vetor.size-1) {
        print("Entre com o valor ${i}: ")
        vetor[i] = readln().toInt()
    }
    var soma: Int = 0
    for (i in 0..vetor.size - 1) {
        soma += vetor[i]
    }
    // println(soma)

    val media: Double = (soma / vetor.size).toDouble() + 0.0
    println("Media: $media")

    for (item in vetor) {
        if (item > media) {
            print("$item ")
        }
    }
}