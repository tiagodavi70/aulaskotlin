abstract class Veiculo {
    abstract var combustivel : Int
    abstract fun acelerar()
    abstract fun virar(forca: Int)
    open fun parar() {
        print("Parando")
    }
}

class Carro1( modelo: String) : Veiculo() {
    override var combustivel = 0
    override fun acelerar() {
        print("Acelerando carro")
    }
    override fun virar(forca: Int) {
        print("Virando carro para ${forca}")
    }
//    override fun parar() {
//        print("Parando carro")
//    }
}