package estructurales.decorator;

public class CarroBasico implements Carro {
    @Override
    public void armar() {
        System.out.print("Carro Basico.");
    }
}
