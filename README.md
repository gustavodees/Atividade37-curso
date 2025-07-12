# Calculadora de Média de Preços de Produtos em Java

Este projeto consiste em um programa Java simples que calcula a média dos preços de uma lista de produtos informados pelo usuário. O usuário primeiro indica a quantidade de produtos e, em seguida, fornece o nome e o preço de cada um. O programa, então, calcula e exibe a média dos preços.

**Autor:** gustavodees

## Arquivos Incluídos

* `model/Produto.java`: Define a classe `Produto`, que representa um produto com atributos para nome e preço.
* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, criar objetos da classe `Produto` e calcular a média dos preços.

## Como Usar

1.  **Salve os arquivos:** Certifique-se de salvar o código nos locais corretos:
    * Crie uma pasta chamada `model` e salve dentro dela o arquivo `Produto.java` com o seguinte conteúdo:

      ```java
      package model;

      public class Produto {
          private String nome;
          private double preco;

          public Produto(String nome, double preco) {
              this.nome = nome;
              this.preco = preco;
          }

          public String getNome() {
              return nome;
          }

          public void setNome(String nome) {
              this.nome = nome;
          }

          public double getPreco() {
              return preco;
          }

          public void setPreco(double preco) {
              this.preco = preco;
          }
      }
      ```
    * Crie uma pasta chamada `principal` e salve dentro dela o arquivo `Main.java` com o código fornecido.

2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile os arquivos Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java model/Produto.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite a quantidade de produtos para a listagem. Insira o número e pressione Enter.
    * Em seguida, para cada produto, o programa pedirá que você digite o nome do produto e, na linha seguinte, o valor do produto. Insira o nome e o preço de cada produto, pressionando Enter após cada entrada.

5.  **Resultado:** Após inserir o nome e o preço de todos os produtos, o programa exibirá a média dos preços, formatada com duas casas decimais.

## Explicação do Código

### `model/Produto.java`

Este arquivo define a classe `Produto`, que representa um item com um nome e um preço.

* **Atributos:**
    * `nome` (private String): O nome do produto.
    * `preco` (private double): O preço do produto.
* **Construtor:**
    * `Produto(String nome, double preco)`: Inicializa um novo objeto `Produto` com o nome e o preço fornecidos.
* **Getters e Setters:** Métodos públicos para acessar e modificar os atributos da classe `Produto`.
    * `getNome()`, `setNome()`
    * `getPreco()`, `setPreco()`

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Solicita ao usuário que digite a quantidade de produtos para a listagem e armazena esse valor na variável inteira `n`.
    3.  Cria um array de objetos da classe `Produto` chamado `vect` com o tamanho especificado por `n`. Este array será utilizado para armazenar os detalhes de cada produto.
    4.  Utiliza um loop `for` para iterar sobre o array `vect` (para cada produto):
        * Solicita ao usuário que digite o nome do produto.
        * Lê o nome do produto inserido pelo usuário.
        * Solicita ao usuário que digite o valor do produto.
        * Lê o preço do produto inserido pelo usuário (um número decimal).
        * Cria um novo objeto da classe `Produto` com o nome e o preço fornecidos e o armazena na posição correspondente do array `vect`.
    5.  Inicializa uma variável `double` chamada `soma` com o valor 0.0. Esta variável será usada para acumular a soma dos preços de todos os produtos.
    6.  Utiliza outro loop `for` para percorrer o array `vect`. Em cada iteração:
        * Obtém o preço do produto atual utilizando o método `getPreco()` e adiciona esse valor à variável `soma`.
    7.  Calcula a média dos preços dividindo a `soma` pelo número de produtos (tamanho do array `vect`).
    8.  Utiliza o método `printf` para exibir a média dos preços, formatada com duas casas decimais.
    9.  Fecha o objeto `Scanner` para liberar os recursos.
