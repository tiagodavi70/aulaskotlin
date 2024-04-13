import java.io.File
import java.io.FileNotFoundException

fun main() {

    File("diretorio/ficheiro1.txt").writeText("")
    File("diretorio/ficheiro1.txt").writeText("Olá mundo dos ficheiros!")

    File("diretorio2").mkdir()

    var textoFicheiro: String = File("diretorio/ficheiro1.txt").readText()

    println(textoFicheiro)

    fun lerFicheiro(caminho: String): String {
        var texto2 = File(caminho).readText()
        // File(caminho).exists()
        return texto2
    }

    var textoFicheiro2: String = ""
    var ficheiroLido: Boolean = false
    while (!ficheiroLido) { // textMicrofiche == ""
        try {
            print("Entre com um caminho: ")
            var caminho = readln()
            textoFicheiro2 = lerFicheiro(caminho)
            ficheiroLido = true
        } catch (e: FileNotFoundException) {
            println("Ficheiro não encontrado")
        }
    }
    print(textoFicheiro2)
}