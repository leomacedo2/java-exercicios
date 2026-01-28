package Ex14_CRUD_Memoria;

// Motor.java
// Objeto simples que representa um Motor

public class Motor {
    private int potencia;

    public Motor(int potencia){
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.println("Motor "+ potencia + "cv ligado");
    }

    public int getPotencia() {
        return potencia;
    }


}
