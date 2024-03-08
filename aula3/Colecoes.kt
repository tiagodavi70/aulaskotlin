fun main() {

    val numeros_inteiros: IntArray = intArrayOf(1, 10, 15, -3, 4)
    print("$numeros_inteiros")

    println()
    for (inteiro in numeros_inteiros) {
        print("$inteiro ")
    }
    println()

    for (i in 0..numeros_inteiros.size - 1) {
        println("Posicao: $i, elemento: ${numeros_inteiros[i]}")
    }

    for (i in 0..numeros_inteiros.size - 1) {
        numeros_inteiros[i] = numeros_inteiros[i] + 1
    }

    for (i in 0..numeros_inteiros.size - 1) {
        print("${numeros_inteiros[i]} ")
    }
    println()

    val lista_doubles : MutableList<Double> = mutableListOf(3.0, 4.0, 5.0) // read-only: listOf
    val lista_float : MutableList<Float> = mutableListOf(3.0f, 4.0f, 5.0f)

    for (dobro in lista_doubles) {
        print("$dobro ")
    }
    println()
    lista_doubles.add(6.0)
    for (dobro in lista_doubles) {
        print("$dobro ")
    }
    println()
    lista_doubles.remove(4.0)
    for (dobro in lista_doubles) {
        print("$dobro ")
    }
    println()

    val mapeamento: MutableMap<String, Int> =
        mutableMapOf("Tiago" to 10, "João" to 25, "Bernardo" to 33)
    println(mapeamento)
    mapeamento["Joel"] = 44
    println(mapeamento["João"])
    println(mapeamento["Pedro"])
    println(mapeamento)

    val set_inteiros: MutableSet<Int> = mutableSetOf(1, 10, 15, -3, 10)

    println(set_inteiros)
    set_inteiros.add(2)
    set_inteiros.add(-3)
    println(set_inteiros)

    val array_nulos: Array<Int?> = arrayOfNulls(10)
    val array_vazio = Array<Int>(10) {0}

    for (item in array_vazio) {
        print("$item ")
    }
}