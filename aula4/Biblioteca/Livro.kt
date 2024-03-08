class Livro(titulo: String, autor: String, area: String = "", editora: String = "",
    codigo: String = "", numeroPaginas: Int = 0) {

    var titulo = titulo
    var autor = autor
    var area = area
    var codigo = codigo
    var numeroPaginas = numeroPaginas

    override fun toString(): String {
        return "Livro(titulo=$titulo, autor=$autor)"
    }
}