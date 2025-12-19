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
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Desconhecido"; // Nome padrão se inválido
        }
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

    // Set para nomes
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido. O nome não foi alterado.");
            return;
        }
        if (nome.length() > 50) {
            System.out.println("Nome muito longo. O nome não foi alterado.");
            return;
        }
        if (nome.matches(".*\\d.*")) {
            System.out.println("Nome não pode conter números. O nome não foi alterado.");
            return;
        }
        if (nome.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            System.out.println("Nome não pode conter caracteres especiais. O nome não foi alterado.");
            return;
        }
        this.nome = nome;
    }
}