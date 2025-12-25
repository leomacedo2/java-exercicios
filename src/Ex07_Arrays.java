// Exercício 07: Arrays
// Criação e manipulação de arrays para armazenar múltiplos valores.

import java.util.Scanner;

public class Ex07_Arrays {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a quantidade de números a serem armazenados no array com validação
        System.out.print("Digite a quantidade de números que deseja armazenar no array: ");
        String inputquantidade = scanner.nextLine();
        while (!inputquantidade.matches("\\d+")) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro positivo: ");
            inputquantidade = scanner.nextLine();
        }
        int quantidade = Integer.parseInt(inputquantidade);

        // Criando um array de números com o tamanho especificado pelo usuário
        double[] numeros = new double[quantidade];

        // Atribuindo valores ao array com validação
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + ": ");
            String inputnumero = scanner.nextLine();
            while (!inputnumero.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Entrada inválida! Por favor, digite um número na posição " + (i + 1) + ": ");
                inputnumero = scanner.nextLine();
            }
            double numero = Double.parseDouble(inputnumero);
            numeros[i] = numero;
        }

        System.out.println("===== Resultados =====");

        // Todos os valores no array
        System.out.println("Valores no array:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // O maior valor no array
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Maior valor no array: " + maior);

        // O menor valor no array
        double menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Menor valor no array: " + menor);

        // A soma dos valores no array
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        System.out.println("Soma dos valores no array: " + soma);

        scanner.close();
    }
    
}
