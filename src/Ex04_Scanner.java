import java.util.Scanner;

public class Ex04_Scanner {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int opcao = 0;
    while  (opcao != 4) {
        System.out.println();
        System.out.println("===== Menu de Opções =====");
        System.out.println("O que você gostaria de fazer?");
        System.out.println("1 - Exibir uma mensagem com seu nome e sua idade");
        System.out.println("2 - Operações Aritméticas digitando dois números");
        System.out.println("3 - Comparar três números e saber qual é o maior");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção (1, 2, 3 ou 4): ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        if (opcao == 1) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        } else if (opcao == 2) {
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            int soma = num1 + num2;
            int subtracao = num1 - num2;
            int multiplicacao = num1 * num2;

            System.out.println("Resultados:");
            System.out.println("Soma: " + soma);
            System.out.println("Subtração: " + subtracao);
            System.out.println("Multiplicação: " + multiplicacao);
            
            if (num2 == 0) {
                System.out.println("Divisão por zero não é permitida.");
            } else {
                double divisao = (double) num1 / num2;
                System.out.printf("Divisão: %.2f%n", divisao);
            }
        } else if (opcao == 3) {
            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int n2 = scanner.nextInt();
            System.out.print("Digite o terceiro número: ");
            int n3 = scanner.nextInt();
            int maior = n1;
            if (n2 > maior) {
                maior = n2;
            }
            if (n3 > maior) {
                maior = n3;
            }
            System.out.println("O maior número é: " + maior);
        } else if (opcao == 4) {
            System.out.println("Saindo do programa. Até mais!");
        } else {
            System.out.println("Opção inválida.");
        }
    }
    scanner.close();
    }
}
