// Exercício 05: Condicionais
// Uso de estruturas condicionais (if, else if, else, switch) para tomar decisões com base em entradas do usuário.

import java.util.Scanner;

public class Ex05_Condicionais {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println();
    System.out.println();
    System.out.print("Digite um número inteiro de 1-7 para mostrar o dia da semana correspondente: ");
    String diainput = scanner.nextLine();
    if (!diainput.matches("\\d+")) {
        System.out.println("Entrada inválida! Por favor, digite um número entre 1 e 7.");
        scanner.close();
        return;
    }
    int dia = Integer.parseInt(diainput);

    String nomeDoDia;
    // Usando if-else para determinar o dia da semana
    if (dia == 1) {
        nomeDoDia = "Domingo";
    } else if (dia == 2) {   
        nomeDoDia = "Segunda-feira";
    } else if (dia == 3) {
        nomeDoDia = "Terça-feira";
    } else if (dia == 4) {
        nomeDoDia = "Quarta-feira";
    } else if (dia   == 5) {
        nomeDoDia = "Quinta-feira";
    } else if (dia == 6) {
        nomeDoDia = "Sexta-feira";
    } else if (dia == 7) {
        nomeDoDia = "Sábado";
    } else {
        nomeDoDia = "Número inválido! Por favor, digite um número entre 1 e 7.";
    }
    System.out.println("Dia da semana: " + nomeDoDia);
    
    if (dia >= 1 && dia <= 7) {
        System.out.print("=================================\n");
        System.out.print("Agora, digite um número de 1-12 para mostrar o mês correspondente: ");
        String mesInput = scanner.nextLine();
        if (!mesInput.matches("\\d+")) {
            System.out.println("Entrada inválida! Por favor, digite um número entre 1 e 12.");
            scanner.close();
            return;
        }
        int mes = Integer.parseInt(mesInput);
        String nomeDoMes;
        // Usando switch para determinar o mês
        switch (mes) {
            case 1:
                nomeDoMes = "Janeiro";
                break;
            case 2:
                nomeDoMes = "Fevereiro";
                break;
            case 3:
                nomeDoMes = "Março";
                break;
            case 4:
                nomeDoMes = "Abril";
                break;
            case 5:
                nomeDoMes = "Maio";
                break;
            case 6:
                nomeDoMes = "Junho";
                break;
            case 7:
                nomeDoMes = "Julho";
                break;
            case 8:
                nomeDoMes = "Agosto";
                break;
            case 9:
                nomeDoMes = "Setembro";
                break;
            case 10:
                nomeDoMes = "Outubro";
                break;
            case 11:
                nomeDoMes = "Novembro";
                break;
            case 12:
                nomeDoMes = "Dezembro";
                break;
            default:
                nomeDoMes = "Número inválido! Por favor, digite um número entre 1 e 12.";
            }
        System.out.println("Mês: " + nomeDoMes);
    }    
    scanner.close();
    }
}
