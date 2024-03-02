fun main() {
    var sapatilha : ProdutoDesportivo =
        ProdutoDesportivo("Sapatilha", "Sapatilha", 30.0)
    var bola : ProdutoDesportivo =
        ProdutoDesportivo("Bola Futebol", "Bola", 10.0)

    var linha: Array<ProdutoDesportivo> = arrayOf(sapatilha, bola)
    var loja: LojaDesporto = LojaDesporto("Desportos ESAN", "Oliveira de Azeméis",
        linha)
}