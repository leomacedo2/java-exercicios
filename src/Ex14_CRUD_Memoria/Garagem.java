// Garagem.java
// Objeto que gerencia uma coleção de Carros

package Ex14_CRUD_Memoria;

import java.util.ArrayList;

public class Garagem {
    private ArrayList<Carro> carros;
    
    public Garagem() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
        System.out.println(carro.getNome() + " adicionado à garagem.");
    }

    public void listarCarros() {
        if (carros.isEmpty()) {
            System.out.println("A garagem está vazia.");
            return;
        }

        for (Carro carro : carros) {
            carro.exibirFichaTecnica();
        }
    }

    public void buscarCarroPorNome(String nome) {
        for (Carro carro : carros) {
            if (carro.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Carro encontrado:");
                carro.exibirFichaTecnica();
                return;
            }
        }
        System.out.println("Carro com nome " + nome + " não encontrado na garagem.");
    }

    public void trocarMotorDoCarro(String nomeCarro, Motor novoMotor) {
        for (Carro carro : carros) {
            if (carro.getNome().equalsIgnoreCase(nomeCarro)) {
                carro.trocarMotor(novoMotor);
                return;
            }
        }
        System.out.println(nomeCarro + " não encontrado na garagem.");
    }

}

