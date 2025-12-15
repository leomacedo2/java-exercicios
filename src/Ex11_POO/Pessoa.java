// Pessoa.java
// Objeto simples representando uma pessoa

package Ex11_POO;

public class Pessoa {
    String nome;
    int idade;

    // Métodos
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário, " + nome + "! Agora você tem " + idade + " anos.");
    }

}
