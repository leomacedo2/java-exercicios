// Ex11_POO.java
// Programa principal para testar a classe Pessoa

package Ex11_POO;

public class Ex11_POO {
    
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Leo";
        pessoa1.idade = 34;

        // Exibindo os dados da pessoa
        pessoa1.exibirDados();

        // Fazendo aniversário
        pessoa1.fazerAniversario();

        // Exibindo os dados novamente
        pessoa1.exibirDados();
    }
}

