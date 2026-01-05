package Ex13_ArrayLists;

public class Main {
    public static void main(String[] args) {
        Motor motorFraco = new Motor(100);
        Motor motorMedio = new Motor(200);
        Motor motorForte = new Motor(300);

        Carro carroPopular = new Carro("Carro Popular", motorFraco);
        Carro carroSedan = new Carro("Carro Sedan", motorMedio);
        Carro carroEsportivo = new Carro("Carro Esportivo", motorForte);

        Garagem garagem = new Garagem();
        garagem.adicionarCarro(carroPopular);
        garagem.adicionarCarro(carroSedan);
        garagem.adicionarCarro(carroEsportivo);

        System.out.println("\nListando carros na garagem:");
        garagem.listarCarros();

        System.out.println("\nBuscando carro por nome 'Carro Sedan':");
        garagem.buscarCarroPorNome("Carro Sedan");
        
    }

} 

