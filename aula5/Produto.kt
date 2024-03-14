abstract class Produto {
    var nome: String = ""
    var preco: Double = 0.0
    var validade: Int = 0
}

class Shampoo() : Produto() {
    var irritabilidade: Int = 0
        get(){
            return field
        }
        set(value) {
            field = value
        }
}
class Biscoito() : Produto() {
    var cancro: Int = 0
}
class Leite() : Produto() {
    var aposEmbalo: Int = 0
}

fun maiorPreco(lista: List<Produto>) : Produto {
    var indice = -1
    var preco = Double.MIN_VALUE
    for (i in 0..lista.size - 1) {
        if (preco < lista[i].preco) {
            preco = lista[i].preco
            indice = i
        }
    }
    return lista[indice]
}

fun main() {
    var prod1 = Shampoo()
    prod1.preco = 12.0
    var prod2 = Shampoo()
    prod2.preco = 12.0
    var prod3 = Biscoito()
    prod3.preco = 12.0
    var prod4 = Biscoito()
    prod4.preco = 12.0
    var prod5 = Leite()
    prod5.preco = 15.0
    var prod6 = Leite()
    prod6.preco = 12.0
    var prod7 = Shampoo()
    prod7.preco = 12.0
    var prod8 = Shampoo()
    prod8.preco = 12.0

    var lista = mutableListOf(
        prod1, prod2, prod5, prod4,
        prod5, prod6, prod7, prod8,
    )

    print(maiorPreco(lista).preco)
}