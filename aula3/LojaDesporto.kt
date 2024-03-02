class LojaDesporto(nome: String = "", endereco: String = "",
    linhaProdutos: Array<ProdutoDesportivo>) {

    var nome: String = ""
    var endereco: String = ""
    var linhaProdutos: Array<ProdutoDesportivo> = Array<ProdutoDesportivo>(10) { ProdutoDesportivo() }
}