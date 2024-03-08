class Emprestimo(livro: Livro, utilizador: Utilizador, dias: Int) {
    var livro = livro
    var utilizador = utilizador
    var dias = dias

    override fun toString(): String {
        return "Emprestimo(livro=$livro,\n" +
                "utilizador=$utilizador," +
                "dias=$dias)"
    }
}