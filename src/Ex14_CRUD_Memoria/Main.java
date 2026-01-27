package Ex14_CRUD_Memoria;

// CRUD para carros na memória

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        Garagem garagem = new Garagem();


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
                    System.out.print("Digite o nome do carro: ");
                    String nomeCarro = scanner.nextLine();
                    System.out.print("Digite a potência do motor: ");
                    int potenciaMotor = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    Motor motor = new Motor(potenciaMotor);
                    Carro novoCarro = new Carro(nomeCarro, motor);
                    // Adicionar o carro à garagem
                    garagem.adicionarCarro(novoCarro);
                    break;
                case 2:
                    // Código para listar carros
                    garagem.listarCarros();
                    break;
                case 3:
                    // Código para buscar carro por nome
                    System.out.print("Digite o nome do carro a buscar: ");
                    String nomeBusca = scanner.nextLine();
                    garagem.buscarCarroPorNome(nomeBusca);
                    break;
                case 4:
                    // Código para trocar motor do carro
                    System.out.print("Digite o nome do carro para trocar o motor: ");
                    String nomeTroca = scanner.nextLine();
                    System.out.print("Digite a nova potência do motor: ");
                    int novaPotencia = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    Motor novoMotor = new Motor(novaPotencia);
                    garagem.trocarMotorDoCarro(nomeTroca, novoMotor);
                    break;
                case 5:
                    // Código para remover carro
                    System.out.print("Digite o nome do carro a remover: ");
                    String nomeRemover = scanner.nextLine();
                    garagem.removerCarro(nomeRemover);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

} 

