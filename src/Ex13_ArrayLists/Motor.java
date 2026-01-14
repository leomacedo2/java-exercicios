/* Motor.java
 * Representa um motor de carro com funcionalidade básica.
 */
package Ex13_ArrayLists;

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
