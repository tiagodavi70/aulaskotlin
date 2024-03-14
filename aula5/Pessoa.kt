class Pessoa(nome_parametro: String) {
    var contador_getNome = 0
    var nome: String = if (nome_parametro != "###") nome_parametro else ""
        set(value: String) {
            field = if (value != "###") value else "VALOR ERRADO"
        }
        get(){
            contador_getNome++
            return field
        }

//    init {
//        if (nome != "###") {
//            nome = nome_parametro
//        }
//        else {
//            nome = ""
//        }
//    }

    fun manipularNome() {
        nome += "a"
    }
    fun printNome() {
        println(nome)
    }
}
// ###
fun main() {
    var pessoa = Pessoa("Tiago")
//    pessoa.manipularNome()
//    pessoa.printNome()
//    pessoa.nome = "###"
    println(pessoa.nome)
    println(pessoa.nome)
    println(pessoa.nome)
    println(pessoa.nome)
    pessoa.nome = "###"
    println(pessoa.nome)
    println(pessoa.contador_getNome)
}