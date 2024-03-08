# Estrutura de dados, Classes e Objetos

## Arrays

``` Kotlin
fun main() {
    val numeros: IntArray = intArrayOf(1, 2, 3, 4, 5)

    println("Elemento na posição 2: ${numeros[1]}")
    numeros[3] = 8
    println("Array após a modificação: ${numeros.contentToString()}") 

    println("Elementos do array:")
    for (numero in numeros) {
        println(numero)
    }

    val soma = numeros.sum()
    val media = numeros.average()
    val tamanho = numeros.size

    println("Soma dos elementos: $soma") 
    println("Média dos elementos: $media") 
    println("Tamanho do array: $tamanho") // Saída: Tamanho do array: 5
}

```

## Coleções

``` Kotlin
// Lista mutável
val listaMutavel = mutableListOf("Maçã", "Banana", "Laranja")
listaMutavel.add("Pera")
println(listaMutavel)

// Lista imutável
val listaImutavel = listOf("Cachorro", "Gato", "Pássaro")
println(listaImutavel)

// Set mutável
val setMutavel = mutableSetOf(1, 2, 3, 4, 5)
setMutavel.add(6)
println(setMutavel)

// Set imutável
val setImutavel = setOf("Azul", "Vermelho", "Verde")
println(setImutavel)

// Map mutável
val mapaMutavel = mutableMapOf("Chave1" to 10, "Chave2" to 20, "Chave3" to 30)
mapaMutavel["Chave4"] = 40
println(mapaMutavel)

// Map imutável
val mapaImutavel = mapOf("Nome" to "João", "Idade" to 25, "Cidade" to "São Paulo")
println(mapaImutavel)
```

## Criando classes e Objetos
``` Kotlin
class Pessoa(val nome: String, val idade: Int)

val pessoa1 = Pessoa("Ana", 30)
val pessoa2 = Pessoa("Carlos", 25)

println(pessoa1.nome)
println(pessoa2.idade)
```

## Desafios

* Escreva um programa em Kotlin que crie um array com 10 posições e receba seus valores do utilizador. Ao final deverá mostrar somente os valores acima da média.

* Escreva um script que dado dois vetores indique os elementos que estão presentes nos dois vetores.

* Escreva um programa em Kotlin quer faça o controle de estoque de uma loja. Em um menu deve ter as opções:

    cadastrar produto  
    editar produto  
    vender produto  
    gerar relatório

	Na opção de cadastro o utilizador deve entrar com:

    	nome do produto
    	preço
    	tipo

	Para cada produto cadastrado deve ser gerado um código.
	Na opção de editar deve permitir atualização do nome do produto.
	Na opção vender produto deve registrar uma venda do produto.
	E na opção gerar relatório deve mostrar o valor total ganho e o valor total por produto.