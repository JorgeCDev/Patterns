package estructurales.decorator;
//añadir funcionalidad utilizando un wrapper alrededor de los objetos
public class ImplementaciónDecorador {
    public static void main(String[] args) {
        Carro carroDeportivo = new CarroDeLujo(new CarroBasico());
        carroDeportivo.armar();
        System.out.println("\n*****");

        Carro carroDeLujo =
                new CarroDeLujo(new CarroDeportivo(new CarroBasico()));
        carroDeLujo.armar();
    }
}
