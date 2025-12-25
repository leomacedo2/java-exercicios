// Exercício 08: Métodos
// Definição e uso de métodos para organizar e reutilizar código.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex08_Metodos {
    
    // Método para calcular a soma de dois números
    public static double soma(double a, double b) {
        return a + b;
    }

    // Método que calcula a média de um array de números
    public static double calcularMedia(double[] numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }

    // Método para verificar se um número é par
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    // Método para imprimir um menu de opções
    public static void imprimirMenu() {
        System.out.println();
        System.out.println("===== Menu de Opções =====");
        System.out.println("1 - Calcular a soma de dois números");
        System.out.println("2 - Calcular a média de um array de números");
        System.out.println("3 - Verificar se um número é par");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção (1, 2, 3 ou 4): ");
    }

    // Método para validar entrada numérica inteira
    public static String validarEntradaInteira(Scanner scanner) {
        String input = scanner.nextLine().trim();
        while (!input.matches("\\d+")) {
            System.out.println();
            System.out.print("Entrada inválida! Por favor, digite um número inteiro válido: ");
            input = scanner.nextLine().trim();
        }
        return input;
    }

    // Método para validar entrada de número (inteiro ou decimal)
    public static String validarEntradaNumerica(Scanner scanner) {
        String input = scanner.nextLine().trim();
        while (!input.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println();
            System.out.print("Entrada inválida! Por favor, digite um número válido: ");
            input = scanner.nextLine().trim();
        }
        return input;
    }

    // Método para retornar ao menu de opções ou sair do programa
    public static boolean retornarMenuOuSair(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.print("Deseja voltar para o menu de opções? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("s")) {
                return true;
            } else if (resposta.equals("n")) {
                System.out.println();
                System.out.println("Saindo do programa. Obrigado!");
                return false;
            } else {
                System.out.println();
                System.out.println("Resposta inválida! Por favor, digite 's' para sim ou 'n' para não.");
            }
        }
    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.############");
        int opcao = 0;

        while (opcao != 4) {
            imprimirMenu();

            opcao = Integer.parseInt(validarEntradaInteira(scanner));

            if (opcao == 1) {
                    System.out.println();
                    System.out.print("Escolha o primeiro número: ");
                    double num1 = Double.parseDouble(validarEntradaNumerica(scanner));

                    System.out.print("Escolha o segundo número: ");
                    double num2 = Double.parseDouble(validarEntradaNumerica(scanner));

                    double resultadoSoma = soma(num1, num2);
                    System.out.println();
                    System.out.println("Resultado da soma: " + df.format(resultadoSoma));

                    if (!retornarMenuOuSair(scanner)) {
                        break;
                    }

                } else if (opcao == 2) {
                    System.out.println();
                    System.out.print("Quantos números você quer na média? ");
                    int quantidade = Integer.parseInt(validarEntradaInteira(scanner));
                    System.out.println();

                    double[] numeros = new double[quantidade];

                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite o número na posição " + (i + 1) + " do array: ");
                        numeros[i] = Double.parseDouble(validarEntradaNumerica(scanner));
                    }

                    double media = calcularMedia(numeros);
                    System.out.println();
                    System.out.println("Média: " + df.format(media));

                    if (!retornarMenuOuSair(scanner)) {
                        break;
                    }
                    
                } else if (opcao == 3) {
                    System.out.println();
                    System.out.print("Digite um número para verificar se é par: ");
                    int numeroPar = Integer.parseInt(validarEntradaInteira(scanner));

                    boolean resultadoPar = ehPar(numeroPar);
                    if (resultadoPar) {
                        System.out.println();
                        System.out.println("O número " + numeroPar + " é par.");
                    } else {
                        System.out.println();
                        System.out.println("O número " + numeroPar + " é ímpar.");
                    }

                    if (!retornarMenuOuSair(scanner)) {
                        break;
                    }

                } else if (opcao == 4) {
                    System.out.println();
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                } else {
                    System.out.println();
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
        scanner.close();
    }
}
