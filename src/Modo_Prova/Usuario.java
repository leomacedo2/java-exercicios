package Modo_Prova;

public class Usuario {
    
    private String nome;
    private int idade;
    private String email;

    public Usuario(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Email: " + email);
    }
}
