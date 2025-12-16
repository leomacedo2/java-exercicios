// Ex11_POO.java
// Programa principal para testar a classe Pessoa

package Ex11_POO;

public class Ex11_POO {
    
    public static void main(String[] args) {

        // Criando uma instância da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Leo", 34);

        // Exibindo os dados da pessoa
        pessoa1.exibirDados();

        // Fazendo aniversário
        pessoa1.fazerAniversario();

        // Exibindo os dados novamente
        pessoa1.exibirDados();
    }
}

