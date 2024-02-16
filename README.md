Objetivo da Aula: Construir um carrinho de compras com descrição dos itens e preços e calcular o valor final com base em discontos condicionais.

### Conceitos Importantes:
* Tipos primitivos
* Estruturas de controle e repetição
* Funções 
* Collections:
	* Array
	* Abordagem functional para iterar Array.foreach
* Top Level Functions

### Desafio #1: Total do Carrinho de Compras

> Escreva um programa em Kotlin que calcula o custo total dos itens em um carrinho de compras.
> 
> - Defina uma `MutableList` que guarda os preços de vários itens como valores `Double`.
> - Calcule o preço total dos itens no carrinho.
> - Se o preço total exceder $100, aplique um desconto de 10% no total.
> - Exiba o preço total final no console.
> - Além disso, se houver mais de 5 itens no carrinho, aplique um desconto adicional de 5% no total já com desconto (se aplicável).
> 
> Este desafio envolverá declarações condicionais para verificar o preço total e a contagem de itens, operações aritméticas para calcular totais e descontos, e trabalhar com coleções para guardar os preços dos itens.

### Desafio #2: Gerenciamento de Inventário

> Escreva um programa em Kotlin que gerencia um inventário de produtos. Cada produto deve ter um nome e uma quantidade em estoque. O programa deve ser capaz de:
> 
> - Adicionar um novo produto com sua quantidade inicial de estoque ao inventário.
> - Atualizar a quantidade de estoque de um produto existente.
> - Calcular e exibir o número total de itens no inventário.
> - Exibir os detalhes de todos os produtos no inventário.
> 
> Este desafio envolverá trabalhar com coleções para manter o inventário e laços ou funções de ordem superior para iterar sobre o inventário.


```
Final code so far

package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

var example: Int
    get() = 10
    set(value) = TODO()



fun main() {
    val name = "Kotlin"
    val myInt: Int = 10
    var myDouble = 20.5

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!" + "myInt: "+ myInt)
    myDouble = 1.0

    println("Esse é um teste de escopo: "+ example + " E me traz: " + myDouble)

    val myList: List<Int> = listOf(1,2,3)
    val myMap: Map<String, Int> = mapOf("one" to 1, "two" to 2)
    println(myMap)

    val test = "Fillipe"
    println("Olá belo mundo!, meu nome é:" + test)
    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    val number: Int = 3
    when (number) {
       1 -> println("One")
       2 -> println("Two")
       3 -> println("Three")
       else -> println("Something else")
    }

    when {
        number in 1..3 -> println("Between 1 and 3")
        number is Int -> println("It's an Integer")
        number > 5 -> println("Greater than 5")
        else -> println("None of the above")
    }
//    Challenge:Shopping Cart Total
    val cartItems: MutableList<Double> = mutableListOf(1.89, 3.43, 2.00, 2.46, 4.37)
    var totalPrice: Double = 0.0

    for (cartItem in cartItems){
        totalPrice += cartItem
        println("Item cost: " + cartItem)
    }

    var verifiedPrice = if (totalPrice > 10.0) totalPrice*0.9 else totalPrice
    println("Price discount: " + verifiedPrice)

    verifiedPrice = if (cartItems.size >= 5) verifiedPrice*0.95 else verifiedPrice
    println("Total Final Price with Discounts: " + verifiedPrice)
}
```

### Challenge 2
**Challenge: Inventory Management**

> Write a Kotlin program that manages an inventory of products. Each product should have a name and a quantity in stock. The program should be able to:
> 
> - Add a new product with its initial stock quantity to the inventory.
> - Update the stock quantity of an existing product.
> - Calculate and display the total number of items in the inventory.
> - Print out the details of all products in the inventory.
> 
> This challenge will involve working with classes to model the product, collections to hold the inventory, and loops or higher-order functions to iterate over the inventory.



#### Second challenge code
```
fun addProduct(inventory: MutableMap<String, Int>, productName: String, quantity: Int) {
    if (inventory.containsKey(productName)) {
        println("Product $productName already exists. Updating quantity.")
        inventory[productName] = inventory.getValue(productName) + quantity
    } else {
        inventory[productName] = quantity
        println("Product $productName added with quantity $quantity.")
    }
}

fun updateProductQuantity(inventory: MutableMap<String, Int>, productName: String, quantity: Int) {
    if (inventory.containsKey(productName)) {
        inventory[productName] = quantity
        println("Product $productName updated with new quantity $quantity.")
    } else {
        println("Product $productName does not exist. Cannot update.")
    }
}

fun calculateTotalItems(inventory: Map<String, Int>): Int = inventory.values.sum()

fun displayInventory(inventory: Map<String, Int>) {
    println("Inventory:")
    inventory.forEach { (productName, quantity) ->
        println("$productName: $quantity")
    }
}

fun main() {
    val inventory = mutableMapOf<String, Int>()

    // Adding products
    addProduct(inventory, "Apples", 10)
    addProduct(inventory, "Oranges", 5)

    // Updating product quantity
    updateProductQuantity(inventory, "Apples", 15)

    // Attempt to update a non-existent product
    updateProductQuantity(inventory, "Bananas", 10)

    // Display total items in inventory
    println("Total items in inventory: ${calculateTotalItems(inventory)}")

    // Display current inventory
    displayInventory(inventory)
}

```