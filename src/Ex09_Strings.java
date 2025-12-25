// Exercise 9: Strings
// Comparação de strings e manipulação básica de texto em Java.

import java.util.Scanner;

public class Ex09_Strings {
    
    public static void imprimirMenu() {
        System.out.println();
        System.out.println("========== Exercício 9: Strings ==========");
        System.out.println("1 - Exercício 1 - Informações sobre uma String");
        System.out.println("2 - Exercício 2 - Comparação de nomes");
        System.out.println("3 - Exercício 3 - Contar vogais");
        System.out.println("4 - Exercício 4 - Censurador de palavras");
        System.out.println("5 - Sair");
        System.out.println();
        System.out.print("Escolha uma opção (1, 2, 3, 4 ou 5): ");
    }

    public static String validarEntradaInteira(Scanner scanner) {
        String input = scanner.nextLine().trim();
        while (!input.matches("\\d+")) {
            System.out.println();
            System.out.print("Entrada inválida! Por favor, digite um número de opção válida: ");
            input = scanner.nextLine().trim();
        }
        return input;
    }

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
        int opcao = 0;

        while (opcao != 5) {
            imprimirMenu();

            opcao = Integer.parseInt(validarEntradaInteira(scanner));

            if (opcao == 1) {
                System.out.print("Digite uma string: ");
                String str1 = scanner.nextLine();

                // Quantos caracteres a string possui?
                System.out.println("Comprimento da string: " + str1.length());

                // O primeiro e ultimo caractere da string
                if (str1.length() > 0) {
                    System.out.println("Primeiro caractere: " + str1.charAt(0));
                    System.out.println("Último caractere: " + str1.charAt(str1.length() - 1));
                } else {
                    System.out.println("A string está vazia.");
                }

                // Exibir a string em letras maiúsculas e minúsculas
                System.out.println("String em maiúsculas: " + str1.toUpperCase());
                System.out.println("String em minúsculas: " + str1.toLowerCase());

                if (!retornarMenuOuSair(scanner)) {
                    break;
                }
            } else if (opcao == 2) {
                System.out.print("Digite o primeiro nome: ");
                String nome1 = scanner.nextLine().trim();
                System.out.print("Digite o segundo nome: ");
                String nome2 = scanner.nextLine().trim();

                if (nome1.equalsIgnoreCase(nome2)) {
                    System.out.println("Os nomes são iguais (ignorando maiúsculas e minúsculas).");
                } else {
                    System.out.println("Os nomes são diferentes.");
                }

                if (!retornarMenuOuSair(scanner)) {
                    break;
                }
            } else if (opcao == 3) {
                System.out.print("Digite uma frase: ");
                String str2 = scanner.nextLine().toLowerCase();
                int contadorVogais = 0;
                StringBuilder vogaisEncontradas = new StringBuilder();


                for (int i = 0; i < str2.length(); i++) {
                    char c = str2.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        contadorVogais++;
                        vogaisEncontradas.append(c).append(" ");
                    }
                }

                // Exibir as vogais encontradas
                System.out.print("As vogais encontradas na string são: ");
                System.out.println(vogaisEncontradas);

                // Exibir o número de vogais encontradas
                System.out.println("Número de vogais na string: " + contadorVogais);

                if (!retornarMenuOuSair(scanner)) {
                    break;
                }
            } else if (opcao == 4) {
                System.out.print("Digite uma frase: ");
                String frase = scanner.nextLine();

                // Lista de palavras a serem censuradas:
                String[] palavrasCensuradas = {"bobo", "caralho", "porra", "merda", "cacete"};
                
                for (String palavra : palavrasCensuradas) {
                    String censura = "*".repeat(palavra.length());
                    frase = frase.replaceAll("(?i)" + palavra, censura);
                }

                System.out.println("Frase censurada: " + frase);

                if (!retornarMenuOuSair(scanner)) {
                    break;
                }
            } else if (opcao == 5) {
                System.out.println();
                System.out.println("Saindo do programa. Obrigado!");
            } else {
                System.out.println();
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
    }
        scanner.close();
    }
}