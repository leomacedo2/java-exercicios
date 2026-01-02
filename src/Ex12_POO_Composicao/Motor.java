// Motor.java
// Objeto simples que representa um Motor

package Ex12_POO_Composicao;

class Motor {
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
