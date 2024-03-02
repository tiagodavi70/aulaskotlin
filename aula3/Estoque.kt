fun main() {
    var arroz: Produto = Produto("Arroz", 1.5, "Alimento")
    var trigo: Produto = Produto("Trigo", 1.25, "Alimento")
    var azeitonas: Produto = Produto("Azeitonas", 1.0)

    println(arroz)
    println(trigo)

    println(arroz.nome)
    println(trigo.preco)

    println("${arroz.codigo}," +
            "${trigo.codigo}," +
            "${azeitonas.codigo}")
}