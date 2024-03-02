//class Produto(var nome: String, var preco: Double, var tipo: String) {

class Produto(nome: String, preco: Double, tipo: String = "") {

    var nome : String = nome
    var preco: Double = preco
    var tipo: String = tipo

    var codigo: Double = 0.0;

    init {
        println("Ola  ${this.nome}")
        codigo = Math.random() * 100
    }
}


// nome
// preco
// tipo

// codigo