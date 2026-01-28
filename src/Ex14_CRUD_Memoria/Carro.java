package Ex14_CRUD_Memoria;
/**
 * Carro.java
 * Objeto simples que representa um Carro
 */


public class Carro {
    private String nome;
    private Motor motor;

    public Carro (String nome, Motor motor){
        this.nome = nome;
        this.motor = motor;
    }

    public void ligar() {
        motor.ligar();
    }

    public void exibirFichaTecnica(){
        System.out.println(nome + " com motor de " + motor.getPotencia() + "cv");
    }

    public void trocarMotor(Motor novoMotor){
        this.motor = novoMotor;
        System.out.println("Novo motor de " + novoMotor.getPotencia() + " de potencia foi trocado para o " +nome);
    }

    public String getNome() {
        return nome;
    }
}
