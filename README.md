# POO - ESAN

[Documentação de Kotlin](https://kotlinlang.org/docs/home.html)

[Compilador](https://kotlinlang.org/docs/command-line.html)

[Intellij IDEA](https://www.jetbrains.com/idea/)

[Exercícios Extras](https://github.com/tiagodavi70/python-intro/tree/master)

[Aulas de POO Online](https://www.youtube.com/playlist?list=PLr3dKaVI2v7oyLUIJKPiokNHCXzSPg3r5)


### Conceitos Importantes:
* Tipos primitivos
* Estruturas de controle e repetição
* Funções
* Top Level Functions

[Recursos online da biblioteca O'Reilly](https://www.ua.pt/pt/sbidm/pesquisa)  
[Kotlin in action](https://learning.oreilly.com/library/view/kotlin-in-action/9781617293290/)

### Desafio #1: Calculadora

Crie uma calculadora com as quatro operações básicas, e use um laço de repetição para realizar mais de uma operação sem precisar 
Leve em consideração divisão por zero.

### Desafio #2: Total do Carrinho de Compras

Escreva um programa em Kotlin que calcula o custo total dos itens em um carrinho de compras.
- Receba vários items com preços 
- Calcule o preço total dos itens no carrinho.
- Se o preço total exceder $100, aplique um desconto de 10% no total.
- Exiba o preço total final no console.
- Além disso, se houver mais de 5 itens no carrinho, aplique um desconto adicional de 5% no total já com desconto (se aplicável).



### Desafio Extra: Gerenciamento de Inventário

Escreva um programa em Kotlin que gerencia um inventário de produtos. Cada produto deve ter um nome e uma quantidade em estoque. O programa deve ser capaz de:

- Adicionar um novo produto com sua quantidade inicial de estoque ao inventário.
- Atualizar a quantidade de estoque de um produto existente.
- Calcular e exibir o número total de itens no inventário.
- Exibir os detalhes de todos os produtos no inventário.

Este desafio envolverá trabalhar com coleções para manter o inventário e laços ou funções de ordem superior para iterar sobre o inventário.

# Aula 2

[Aula 2 - Slides](https://github.com/tiagodavi70/aulaskotlin/blob/main/ConceitosBasicos.pdf)


## Exercícios

Escreva um programa em Kotlin que receba os dados sobre 15 pessoas: peso e idade. Ao final apresente:
* média de peso
* maior idade
Se houver alguma entrada com idade menor que 12, não deve ser considerada.


Um marciano chegou a uma floresta e se escondeu atrás de uma das 100 árvores quando viu um caçador.
O caçador só tinha cinco balas em sua espingarda. Cada vez que ele atirava, e não acertava, é claro, o marciano dizia: estou mais à direita ou estou mais à esquerda. Se o caçador não conseguir acertar o marciano,ele será levado para Marte.
Escreva um programa em Kotlin para este jogo, com dois jogadores, onde um escolhe a árvore em que o marciano irá se esconder, e o outro tenta acertar.

## Desafio # 3


Escreva três classes em Kotlin, cada uma deve ter mais de um atributo. Crie alguns objetos com essas classes.

Veja a classe [Radio](https://github.com/tiagodavi70/aulaskotlin/blob/main/Radio.kt) e a classe [Main](https://github.com/tiagodavi70/aulaskotlin/blob/main/Main.kt) para criação da classe e dos objetos.


## Aula 3

## Desafio # 4

Escreva um programa orientado a objetos em Kotlin que faça o controle de estoque de uma loja. Em um menu deve ter as opções:

* cadastrar produto
* editar produto
* vender pruduto
* gerar relatório

Na opção de cadastro o utilizador deve entrar com:
* nome do produto
* preço
* tipo

Para cada produto cadastrado deve ser gerado um código.
Na opção de editar deve permitir atualização do nome do produto.
Na opção vender produto deve registrar uma venda do produto.
E na opção gerar relatório deve mostrar o valor total das vendas e a média por produto.



## Aula 4

[Aula 4](https://github.com/tiagodavi70/aulaskotlin/blob/main/HerancaPolimorfismo.pdf)

## Desafio final - etapa 1

Para entrega na aula do dia 14/03. Escreva o documento em meia página levando em conta os pontos abaixo para o projeto final, para discussão em sala:

### Tema
A temática principal do projeto, destacando os pontos principais onde o sistema pode atuar, assim como a viabilidade técnica, soluções já existentes e originalidade.

### Problema
O maior problema que o sistema procurar solucionar, indicando quais os pontos fortes e fracos em comparação com soluções já existentes.

### Classes
Um descrição resumida das classes esperadas para desenvolvimento do sistema.


## Desafio #5
Escreva um sistema em Kotlin para uma organizadora de eventos. Você deve utilizar conceitos de POO para definir classes e atributos relevantes para o problema.

# Aula 5

[Aula 5](https://github.com/tiagodavi70/aulaskotlin/blob/main/InterfaceClasseAbstrata.pdf)

## Exercícios

### Exercício 1
Considere um sistema de gerenciamento de funcionários. Cada funcionário pode ser um gerente ou um associado, e ambos possuem um método para calcular o bônus salarial. O bônus de um gerente é calculado como 10% do salário base, enquanto o bônus de um associado é calculado como 5% do salário base.

Crie uma interface chamada Bonus com um método calcularBonus() que retorna o valor do bônus. Em seguida, crie as classes Gerente e Colaborador que implementam a interface Bonus e forneça a implementação apropriada para o método calcularBonus() em cada classe.

### Exercício 2

Considere um sistema de notificações para um aplicativo. O aplicativo pode enviar diferentes tipos de notificações para os usuários, como notificações por e-mail, SMS e notificações push.

Defina a interface Notificador que inclui um método enviarMensagem que aceita uma mensagem do tipo String como parâmetro. Esse método não retornará nada.

Implemente a interface Notificador em três classes: EmailNotificador, SMSNotificador, e PushNotificador. Cada implementação do método enviarMensagem deve imprimir uma mensagem indicando que uma mensagem foi enviada usando o respectivo método de notificação, junto com a mensagem passada como argumento.

Escreva uma função main onde você cria uma lista de Notificador, adiciona instâncias de EmailNotificador, SMSNotificador, e PushNotificador a essa lista, e então itera sobre a lista enviando uma mensagem "Olá, Mundo!" usando cada método de notificação.

### Exercício 3

Recrie o exemplo das classes Animal com classes abstratas.


### Exerício 4

Considere um sistema para uma biblioteca que precisa gerenciar diversos tipos de itens de mídia, incluindo livros e DVDs. Use classes abstratas para criar uma estrutura base que possa ser compartilhada entre diferentes tipos de mídia.

Crie uma classe abstrata chamada ItemDeMidia que contém uma propriedade abstrata nome do tipo String e um método abstrato emprestar() que não retorna nada.

Implemente a classe abstrata ItemDeMidia em duas classes: Livro e DVD. Cada uma deve fornecer uma implementação específica para a propriedade nome e para o método emprestar(). O método emprestar deve imprimir uma mensagem indicando que o item foi emprestado, juntamente com o nome desse item.

Escreva uma função main que cria uma instância de Livro e uma instância de DVD, atribuindo nomes aos itens, e então chama o método emprestar em cada um deles.


## Exame modelo e entrega

[Teste modelo](https://github.com/tiagodavi70/aulaskotlin/blob/main/TesteModelo.pdf)

Entregar em tiagodavi70 @ua.pt os dois entregáveis:
```
Tema projeto final - POO
```
Até meia noite.

```
Desafios 1-4 - POO
```
Até o dia da prova.


## Aula 6

[Setup Git - Tutorial](https://docs.github.com/en/get-started/getting-started-with-git/set-up-git)  

[Git SCM - Cliente da linha de comando](https://git-scm.com/)  

[SourceTree](https://www.sourcetreeapp.com/)  

[Github Desktop](https://desktop.github.com/)  

