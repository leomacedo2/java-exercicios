// CRUD para carros na memória

package Ex14_CRUD_Memoria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while(opcao != 0) {
            System.out.println("\nMenu de CRUD de Carros:");
            System.out.println("1. Adicionar Carro");
            System.out.println("2. Listar Carros");
            System.out.println("3. Buscar Carro por Nome");
            System.out.println("4. Trocar Motor do Carro");
            System.out.println("5. Remover Carro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch(opcao) {
                case 1:
                    // Código para adicionar carro
                    break;
                case 2:
                    // Código para listar carros
                    break;
                case 3:
                    // Código para buscar carro por nome
                    break;
                case 4:
                    // Código para trocar motor do carro
                    break;
                case 5:
                    // Código para remover carro
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();

        Motor motorFraco = new Motor(100);
        Motor motorMedio = new Motor(200);
        Motor motorForte = new Motor(300);

        Carro carroPopular = new Carro("Carro Popular", motorFraco);
        Carro carroSedan = new Carro("Carro Sedan", motorMedio);
        Carro carroEsportivo = new Carro("Carro Esportivo", motorForte);

        Garagem garagem = new Garagem();
        garagem.adicionarCarro(carroPopular);
        garagem.adicionarCarro(carroSedan);
        garagem.adicionarCarro(carroEsportivo);

        System.out.println("\nListando carros na garagem:");
        garagem.listarCarros();

        System.out.println("\nBuscando carro por nome 'Carro Sedan':");
        garagem.buscarCarroPorNome("Carro Sedan");

        System.out.println("\nTrocando motor do 'Carro Popular':");
        Motor motorNovo = new Motor(150);
        garagem.trocarMotorDoCarro("Carro Popular", motorNovo);


        System.out.println("\nListando carros na garagem após troca de motor:");
        garagem.listarCarros();
    }

} 

