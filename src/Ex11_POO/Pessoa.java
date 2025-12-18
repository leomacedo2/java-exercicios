// Pessoa.java
// Objeto simples representando uma pessoa

package Ex11_POO;

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        if (idade < 0) {
            this.idade = 0; // Garantir que a idade não seja negativa
        }
    }

    // Método para exibir os dados da pessoa
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método para fazer aniversário (incrementa a idade)
    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário, " + nome + "! Agora você tem " + idade + " anos.");
    }

    // Método para apresentar a pessoa
    public String apresentar() {
        return "Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.";
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
