// Ex11_POO.java
// Programa principal para testar a classe Pessoa

package Ex11_POO;

public class Ex11_POO {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        // Criando uma instância da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Leo", 34);
        Pessoa pessoa2 = new Pessoa("Ana", -5); // Testando idade negativa


        // Exibindo os dados da pessoa
        System.out.println(pessoa1);
        System.out.println();
        System.out.println(pessoa2);
        System.out.println();

        // Fazendo aniversário
        pessoa1.fazerAniversario();
        System.out.println();

        // Exibindo os dados novamente
        System.out.println(pessoa1);
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
        boolean nomeAlterado = pessoa1.setNome("Carlos123"); // Nome inválido
        if (!nomeAlterado) {
            System.out.println("Falha ao alterar o nome de pessoa1.");
        }

        nomeAlterado = pessoa1.setNome("Carlos"); // Nome válido
        if (nomeAlterado) {
            System.out.println("Nome alterado com sucesso para pessoa1.");
        }

        System.out.println();
        System.out.println(pessoa1);
        System.out.println(pessoa1.apresentar());
        System.out.println(pessoa2.apresentar());
    }
}

