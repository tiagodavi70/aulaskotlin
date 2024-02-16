fun main() {

    var verdadeiro: Boolean = true
    var falso: Boolean = false

    println("$verdadeiro && $falso ${verdadeiro && falso}")
    println("$verdadeiro && $verdadeiro ${verdadeiro && verdadeiro}")
    println("$falso && $verdadeiro ${falso && verdadeiro}")
    println("$falso && $falso ${falso && falso}")

    if (verdadeiro) {
        print(verdadeiro)
    } else {
        print(false)
    }

    var a: Int = 1
    when (a) {
        1 -> println(1)
        2 -> println(1)
        3 -> {
            print(1)
            print(2)
            print(3)
        }
    }
}