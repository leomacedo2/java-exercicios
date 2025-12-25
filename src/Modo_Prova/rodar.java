package Modo_Prova;

import java.util.Scanner;

public class rodar {
    public static void main(String[]args){
        System.out.println();
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        if (nome.isEmpty()) {
            System.out.println("O nome não pode ser vazio.");
            sc.close();
            return;
        }

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        if (idade <= 0){
            System.out.println("Idade inválida.");
            sc.close();
            return;
        }

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();
        if (!email.contains("@")){
            System.out.println("Email invalido. Ele deve conter o caractere @");
            sc.close();
            return;
        }

        Usuario user = new Usuario(nome, idade, email);

        user.exibirDados();

        sc.close();

        
    }
}
