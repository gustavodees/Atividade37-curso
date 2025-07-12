package principal;


import model.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite a quantidade de produtos para listagem: ");
    int n = input.nextInt();
    Produto[] vect = new Produto[n];

    for (int i = 0; i < vect.length; i++) {
        System.out.println("Digite o nome do produto: ");
        String name = input.next();
        System.out.println("Digite o valor do produto: ");
        double price = input.nextDouble();
        vect[i] = new Produto(name, price);
    }
    double soma = 0.0;
    for (int i = 0; i < vect.length; i++) {
        soma += vect[i].getPreco();
    }
    double media = soma / vect.length;

    System.out.printf("A média dos produtos é: %.2f%n ", media);


    }
}