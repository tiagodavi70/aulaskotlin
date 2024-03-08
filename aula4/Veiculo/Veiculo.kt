open class Veiculo(var modelo : String, var fabricante: String) {
    open fun correr() {
        println("Veiculo não corre")
    }
}

open class QuatroRodas(modelo : String, fabricante: String, velocidade: Double) :
    Veiculo(modelo, fabricante) {
        var velocidade: Double = 0.0;
}

open class DuasRodas(modelo : String, fabricante: String) :
    Veiculo(modelo, fabricante) {
}

class Carro(modelo: String, fabricante: String, velocidade: Double) :
    QuatroRodas(modelo, fabricante, velocidade) {
    override fun correr() {
        println("Carro a correr")
    }
}

class MotoQuatro(modelo: String, fabricante: String, velocidade: Double) :
    QuatroRodas(modelo, fabricante, velocidade) {
    override fun correr() {
        println("Moto quatro a correr")
    }
}

class MotoDuas(modelo: String, fabricante: String) : DuasRodas(modelo, fabricante) {
    override fun correr() {
        println("Moto duas a correr")
    }
}

class Bicicleta(modelo: String, fabricante: String) : DuasRodas(modelo, fabricante) {
    override fun correr() {
        println("Bicicleta a correr")
    }
}