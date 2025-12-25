// Exercicio 10: Manipulação de Arrays 2D
// Exercicios sobre arrays bidimensionais (matrizes) em Java.
import java.util.Scanner;
import java.util.Random;

public class Ex10_Arrays2D {

    public static void imprimirMenu() {
        System.out.println();
        System.out.println("========== Exercício 10: Arrays 2D ==========");
        System.out.println("1 - Exercício 1 - Criar e exibir uma matriz 3x3 e exibir a soma das linhas");
        System.out.println("2 - Exercício 2 - Encontrar o maior elemento em uma matriz 4x4 e dizer sua posição");
        System.out.println("3 - Sair");
        System.out.println();
        System.out.print("Escolha uma opção (1, 2 ou 3): ");
    }

    public static void MenuMatriz() {
        System.out.println();
        System.out.println("Deseja criar uma matriz 2D personalizada ou usar uma matriz pré-definida?");
        System.out.println("1 - Criar matriz personalizada");
        System.out.println("2 - Usar matriz pré-definida");
        System.out.print("Escolha uma opção (1 ou 2): ");
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

    public static void preencherMatriz(int[][] matriz, Scanner scanner, boolean randomica) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (randomica) {
                    matriz[i][j] = rand.nextInt(100) + 1; // Valores entre 1 e 100
                } else {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(validarEntradaInteira(scanner));
                }
            }
        }
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void exibirMatrizESomas(int[][] matriz) {
        exibirMatriz(matriz);
        System.out.println();
        // Calcular e exibir a soma das linhas
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }
    }

    public static void encontrarMaiorElemento(int[][] matriz) {
        int maior = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        System.out.println("O maior elemento é " + maior + " na posição [" + linhaMaior + "][" + colunaMaior + "].");
    }   

    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            imprimirMenu();
            opcao = Integer.parseInt(validarEntradaInteira(scanner));
            if (opcao == 1) {
                int escolhaMatriz = 0;
                do {
                    MenuMatriz();
                    escolhaMatriz = Integer.parseInt(validarEntradaInteira(scanner));
                    if (escolhaMatriz != 1 && escolhaMatriz != 2) {
                        System.out.println();
                        System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    } else if (escolhaMatriz == 1) {
                        // Criar matriz personalizada 3x3
                        int[][] matriz = new int[3][3];
                        preencherMatriz(matriz, scanner, false);

                        // Exibir a matriz e a soma das linhas
                        System.out.println();
                        System.out.println("Matriz (3x3):");
                        exibirMatrizESomas(matriz);
                        
                            if (!retornarMenuOuSair(scanner)) {
                                break;
                            }
                    } else if (escolhaMatriz == 2) {
                        // Usar matriz pré-definida
                        // Matriz 3x3 com valores aleatórios entre 1 e 100
                        int[][] matriz = new int[3][3];
                        preencherMatriz(matriz, scanner, true);

                        // Exibir a matriz e a soma das linhas
                        System.out.println();
                        System.out.println("Matriz pré-definida (3x3):");
                        exibirMatrizESomas(matriz);

                        if (!retornarMenuOuSair(scanner)) {
                            break;
                        }
                    }
                } while (escolhaMatriz != 1 && escolhaMatriz != 2);

            } else if (opcao == 2) {
                int escolhaMatriz = 0;
                do {
                    MenuMatriz();
                    escolhaMatriz = Integer.parseInt(validarEntradaInteira(scanner));
                    if (escolhaMatriz != 1 && escolhaMatriz != 2) {
                        System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    } else if (escolhaMatriz == 1) {
                        // Criar matriz personalizada 4x4
                        int[][] matriz = new int[4][4];
                        preencherMatriz(matriz, scanner, false);

                        // Exibição da Matriz
                        System.out.println();
                        System.out.println("Matriz (4x4):");
                        exibirMatriz(matriz);


                        // Encontrar o maior elemento e sua posição
                        encontrarMaiorElemento(matriz);

                        if (!retornarMenuOuSair(scanner)) {
                            break;
                        }
                    } else if (escolhaMatriz == 2) {
                        // Usar matriz pré-definida
                        // Matriz 4x4 com valores aleatórios entre 1 e 100
                        int[][] matriz = new int[4][4];
                        preencherMatriz(matriz, scanner, true);

                        // Exibição da Matriz
                        System.out.println();
                        System.out.println("Matriz pré-definida (4x4):");
                        exibirMatriz(matriz);
                        
                        // Encontrar o maior elemento e sua posição
                        encontrarMaiorElemento(matriz);

                        if (!retornarMenuOuSair(scanner)) {
                            break;
                        }
                    }
                } while (escolhaMatriz != 1 && escolhaMatriz != 2);

            } else if (opcao == 3) {
                System.out.println();
                System.out.println("Saindo do programa. Obrigado!");

            } else {
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
        scanner.close();
    }
}