// Ex11_POO.java
// Programa principal para testar a classe Pessoa

package Ex11_POO;

public class Ex11_POO {
    
    public static void main(String[] args) {

        // Criando uma instância da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Leo", 34);
        Pessoa pessoa2 = new Pessoa("Ana", -5); // Testando idade negativa


        // Exibindo os dados da pessoa
        pessoa1.exibirDados();
        System.out.println();
        pessoa2.exibirDados();
        System.out.println();

        // Fazendo aniversário
        pessoa1.fazerAniversario();
        System.out.println();

        // Exibindo os dados novamente
        pessoa1.exibirDados();
        System.out.println();

        System.out.println("Nome da pessoa 1: " + pessoa1.getNome());
        System.out.println("Idade da pessoa 1: " + pessoa1.getIdade());
        System.out.println("Nome da pessoa 2: " + pessoa2.getNome());
        System.out.println("Idade da pessoa 2: " + pessoa2.getIdade());
        System.out.println();

        // Pessoa 2 faz aniversário
        pessoa2.fazerAniversario();
        System.out.println();

        // Apresentando as pessoas
        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa2.apresentar());

        // Testando o setNome
        pessoa1.setNome("Leonardo");
        System.out.println("Nome alterado da pessoa 1: " + pessoa1.getNome());
        pessoa2.setNome(""); // Nome inválido
        System.out.println("Nome da pessoa 2 após tentativa de alteração: " + pessoa2.getNome());

        System.out.println();
        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa2.apresentar());
    }
}

