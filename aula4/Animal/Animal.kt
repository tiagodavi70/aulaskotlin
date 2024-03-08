open class Animal {
    open fun fazerSom() {
        println("Animal sem som")
    }
}

class Selvagem : Animal() {
    override fun fazerSom() {
        println("Selvagem sem som")
    }
}

open class Domestico : Animal() {

}

class Gato : Domestico() {
    override fun fazerSom() {
        println("Miauuuuuu")
    }
}

class Cao: Domestico() {
    override fun fazerSom() {
        println("Au Au")
    }
}


//animal
//   selvagem
//   domestico
//      gato
//      cao