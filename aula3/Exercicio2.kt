// Escreva um script que dado dois vetores indique os
// elementos que estão presentes nos dois vetores.


fun main() {
    val a: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val b: IntArray = intArrayOf(10, 20, 3, 4, 50, 60, 7, 80, 90, 100, 110, 120)
    var c: MutableList<Int> = mutableListOf()

    var contador:Int = 0
    for (i in 0..a.size - 1) {
        for (j in 0..b.size - 1) {
//            print("${a[i]}, ${b[j]} | ")
            if (a[i] == b[j]) {
                c.add(a[i])
            }
            contador++
        }
    }
    println()
    println(contador)
    println(c)
}
