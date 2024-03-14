interface Direcao {
    fun acelerar()
    fun virar(forca: Int)
    fun parar()
}

class Carro(var modelo: String) : Direcao {
    override fun acelerar() {
        println("Acelerando carro")
    }
    override fun virar(forca: Int) {
        println("Virando carro para ${forca}")
    }
    override fun parar() {
        print("Parando carro")
    }
}

class Moto(var modelo: String) : Direcao {
    override fun acelerar() {
        println("Acelerando moto")
    }
    override fun virar(forca: Int) {
        println("Virando moto para ${forca}")
    }
    override fun parar() {
        print("Parando moto")
    }
}

fun main() {
    var carro = Carro("Carro1")
    carro.acelerar()
    carro.virar(2)

    var moto = Moto("Moto1")
    moto.acelerar()
    moto.virar(19)
}