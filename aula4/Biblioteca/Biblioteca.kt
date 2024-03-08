fun main() {
    var livro1 : Livro = Livro("Livro magico", "Tiago")
    var utilizador1 : Utilizador =  Utilizador("Tiago", "1111")

    println("${livro1.titulo} ${utilizador1.nome}")
    var emprestimo1: Emprestimo =
        Emprestimo(livro1, utilizador1, 10)

    println("${emprestimo1.dias}")

    println("${livro1}, $utilizador1")

    print(emprestimo1)
}