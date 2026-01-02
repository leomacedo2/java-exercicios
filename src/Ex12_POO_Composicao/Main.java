package Ex12_POO_Composicao;

public class Main {
    public static void main(String[] args) {
        Motor motorFraco = new Motor(100);
        Motor motorForte = new Motor(300);

        Carro carroPopular = new Carro("Carro Popular", motorFraco);
        Carro carroEsportivo = new Carro("Carro Esportivo", motorForte);


        carroPopular.ligar();
        carroEsportivo.ligar();

        carroPopular.exibirFichaTecnica();

        carroPopular.trocarMotor(motorForte);

        carroPopular.ligar();

        carroPopular.exibirFichaTecnica();
    }

} 

