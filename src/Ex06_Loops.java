//Exercicio 06 - Loops
//Um programa que utilize diferentes tipos de loops (for, while, do-while) para imprimir os números.

import java.util.Locale;
import java.util.Scanner;

public class Ex06_Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta = "s";
        do {
            System.out.print("Digite um número inteiro positivo para imprimir os números de 1 até esse número: ");
            String input = scanner.nextLine();
            
            while (!input.matches("\\d+")) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro positivo: ");
                input = scanner.nextLine();
            }
            
            int numero = Integer.parseInt(input);
            System.out.println("Imprimindo números de 1 a " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            
            System.out.println("A soma total dos números de 1 a " + numero + " é:");
            int soma = 0;
            int pos = 1; // Variavel posição para o while
            while (pos <= numero) {
                soma += pos;
                pos++;
            }
            System.out.println(soma);    
            System.out.println("Deseja repetir a impressão dos números? (s/n): ");
            resposta = scanner.nextLine();
            String r = resposta.trim().toLowerCase(Locale.ROOT);

            while (!r.equals("s") && !r.equals("n")) {
                System.out.println("Resposta inválida! Por favor, digite 's' para sim ou 'n' para não: ");
                resposta = scanner.nextLine();
                r = resposta.trim().toLowerCase(Locale.ROOT);
            }

            if (r.equals("n")) {
                System.out.println("Encerrando o programa. Obrigado!");
                break;
            }
        } while (true);
        scanner.close();
    }
}
